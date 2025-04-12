package warehouse.model;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private final String legalAddress;
    private final List<Waybill> waybills;
    private final List<Item> items;

    private void parseWaybills() {
        for (Waybill waybill : waybills) {
            for (Item item : waybill.itemList()) {
                if (!items.contains(item)) {
                    items.add(item);
                } else {
                    for (Item itemToRenew : items) {
                        if (itemToRenew.equals(item)) {
                            itemToRenew.renewItem(item.getQuantity());
                        }
                    }
                }
            }
        }
    }

    public Warehouse(List<Waybill> waybills, String legalAddress) {
        this.legalAddress = legalAddress;
        this.waybills = waybills;
        this.items = new ArrayList<>();
        parseWaybills();
    }

    public void addWaybill(Waybill waybill) {
        waybills.add(waybill);
    }

    public List<Item> getItems() {
        parseWaybills();
        return items;
    }

    public String getLegalAddress() {
        return legalAddress;
    }

    public List<Waybill> getWaybills() {
        return waybills;
    }
}
