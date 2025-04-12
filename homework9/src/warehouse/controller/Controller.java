package warehouse.controller;

import warehouse.model.Waybill;

public interface Controller {
    void establishWarehouse(String legalAddress);
    void addWaybill(String legalAddress, Waybill waybill);
    void displayStored(String legalAddress);
    void displayOuterAddresses(String legalAddress);
    void searchProductByName(String legalAddress, String name);
}
