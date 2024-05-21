package purchase.calculation;

import purchase.data.Item;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calculation {

    public static Map<String, Integer> calculateTotalPrices(List<Item> items) {
        Map<String, Integer> totalPrices = new HashMap<>();

        // 각 품목별 총 가격 계산
        for (Item item : items) {
            String itemName = item.getName();
            int totalPrice = item.getTotalPrice();

            // 같은 품목이 이미 있는지 확인하고 누적 or 추가
            if (totalPrices.containsKey(itemName)) {
                totalPrices.put(itemName, totalPrices.get(itemName) + totalPrice);
            } else {
                totalPrices.put(itemName, totalPrice);
            }
        }

        return totalPrices;
    }


}
