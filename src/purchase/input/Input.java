package purchase.input;

import purchase.data.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Input {
    public static List<Item> getInput() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Item> itemsMap = new HashMap<>();

        System.out.println("＜購買品目総計＞");
        System.out.println("---------------");

        while (true) {
            System.out.println("購入品目を入力してください。");
            System.out.print("品目 : ");
            String itemName = scanner.nextLine();

            System.out.println("数量を入力してください。");
            System.out.print("数量 : ");
            int quantity = scanner.nextInt();

            System.out.println("単価を入力してください。");
            System.out.print("単価 : ");
            int price = scanner.nextInt();

            // 동일 품목이 이미 있는지 확인
            if (itemsMap.containsKey(itemName)) {
                Item existingItem = itemsMap.get(itemName);
                existingItem.addQuantity(quantity); //누적
                existingItem.updatePrice(price); // 새로운가격으로 변경
            } else {
                itemsMap.put(itemName, new Item(itemName, quantity, price));// 새로운객체를 추가해서 저장
            }

            System.out.println("続いて入力しますか。（1: 入力を継続する　2: 結果を出力する）");
            System.out.print("入力 : ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 2) {
                break;
            }
        }

        return new ArrayList<>(itemsMap.values());
    }
}
