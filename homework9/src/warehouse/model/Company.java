package warehouse.model;

import java.util.List;

public record Company(List<Warehouse> warehousesList) {
    public boolean notInCompany(String legalAddress) {
        for (Warehouse warehouse : warehousesList) {
            if (warehouse.getLegalAddress().equals(legalAddress)) {
                return false;
            }
        }
        return true;
    }
}
