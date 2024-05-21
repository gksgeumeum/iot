package purchase.output;

import purchase.data.Item;
import purchase.calculation.Calculation;

import java.util.List;
import java.util.Map;

public class Output {

    public static void displayResult(List<Item> items) {
        Map<String, Integer> totalPrices = Calculation.calculateTotalPrices(items);

        printDisplay();

        for (Map.Entry<String, Integer> entry : totalPrices.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }

    public static void printDisplay(){
        System.out.println("---------------");
        System.out.println("＜出力結果＞");
        System.out.println("購入品目\t総額");
    }
}





