package warehouse.model;

import java.util.List;

public record Waybill(String date, String addressReleased, String addressReceived, String basis, String proxyNumber,
                      String proxyDate, String releaserName, String receiverName, List<Item> itemList) {
}
