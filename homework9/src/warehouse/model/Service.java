package warehouse.model;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private final Company company;

    private Warehouse getWarehouse(String legalAddress) {
        for (Warehouse warehouse : company.warehousesList()) {
            if (warehouse.getLegalAddress().equals(legalAddress)) {
                return warehouse;
            }
        }
        return null;
    }

    public Service() {
        this.company = new Company(new ArrayList<>());
    }

    public void addWarehouse(String legalAddress) {
        List<Warehouse> warehousesList = company.warehousesList();
        if (company.notInCompany(legalAddress)) {
            warehousesList.add(new Warehouse(new ArrayList<>(), legalAddress));
        }
    }

    public void addWaybill(String legalAddress, Waybill waybill) {
        Warehouse warehouseToFill = getWarehouse(legalAddress);
        assert warehouseToFill != null;
        warehouseToFill.addWaybill(waybill);
    }

    public List<Item> getStored(String legalAddress) {
        List<Item> itemList;
        Warehouse warehouse = getWarehouse(legalAddress);
        assert warehouse != null;
        itemList = warehouse.getItems();
        return itemList;
    }

    public List<String> getOuterAddresses(String legalAddress) {
        List<String> outerAddresses = new ArrayList<>();
        Warehouse warehouse = getWarehouse(legalAddress);
        assert warehouse != null;
        for (Waybill waybill : warehouse.getWaybills()) {
            if (company.notInCompany(waybill.addressReleased())) {
                outerAddresses.add(waybill.addressReleased());
            }
        }
        return outerAddresses;
    }

    public Item getProductByName(String legalAddress, String name) {
        Warehouse warehouse = getWarehouse(legalAddress);
        assert warehouse != null;
        for (Item item : warehouse.getItems()) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }
}
