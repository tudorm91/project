package task_13_List_Generics;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart<T> {
    private List<T> shoppingList;

    public ShoppingCart() {
        this.shoppingList = new ArrayList<>();
    }

    public void addItem(T item) {
        shoppingList.add(item);
    }

    public boolean removeItem(T item) {
        return shoppingList.remove(item);
    }

    public void displayCart() {
        System.out.println("Cart contains: " + shoppingList);
    }

    public static void main(String[] args) {
        ShoppingCart<String> stringShoppingCart = new ShoppingCart<>();
        stringShoppingCart.addItem("Macarons");
        stringShoppingCart.addItem("Napoleon");
        stringShoppingCart.addItem("Ice cream");
        stringShoppingCart.addItem("Vanilla Cake");
        stringShoppingCart.displayCart();
        boolean removed = stringShoppingCart.removeItem("Vanilla Cake");
        stringShoppingCart.displayCart();
        System.out.println("Was item removed? " + removed);
    }
}
