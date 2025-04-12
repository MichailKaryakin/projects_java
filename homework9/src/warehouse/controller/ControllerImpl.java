package warehouse.controller;

import warehouse.model.Item;
import warehouse.model.Service;
import warehouse.model.Waybill;
import warehouse.view.View;

import java.util.List;

public class ControllerImpl implements Controller {
    private final Service service;
    private final View view;

    public ControllerImpl(View view) {
        this.view = view;
        this.service = new Service();
    }

    @Override
    public void establishWarehouse(String legalAddress) {
        service.addWarehouse(legalAddress);
        view.printAnswer("Склад добавлен в сеть");
    }

    @Override
    public void addWaybill(String legalAddress, Waybill waybill) {
        service.addWaybill(legalAddress, waybill);
        view.printAnswer("Накладная направлена и обработана");
    }

    @Override
    public void displayStored(String legalAddress) {
        List<Item> storedList = service.getStored(legalAddress);
        for (Item item : storedList) {
            view.printAnswer("Данные по товару:\n" + item.toString());
        }
    }

    @Override
    public void displayOuterAddresses(String legalAddress) {
        List<String> outerAddresses = service.getOuterAddresses(legalAddress);
        for (String address : outerAddresses) {
            view.printAnswer("Внешний адрес: " + address);
        }
    }

    @Override
    public void searchProductByName(String legalAddress, String name) {
        Item item = service.getProductByName(legalAddress, name);
        view.printAnswer("Найденные данные:\n" + item.toString());
    }
}
