package purchase;

import purchase.input.Input;
import purchase.data.Item;
import purchase.output.Output;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> items = Input.getInput();

        Output.displayResult(items);
    }
}

