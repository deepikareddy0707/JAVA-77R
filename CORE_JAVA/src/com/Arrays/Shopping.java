package com.Arrays;

class CartItem {
 int itemId;
 String itemName;
 double[] pricesFromSellers;
 CartItem(int itemId, String itemName, double[] pricesFromSellers) {
     this.itemId = itemId;
     this.itemName = itemName;
     this.pricesFromSellers = pricesFromSellers;
 }
 double getLowestPrice() {
     double min = pricesFromSellers[0];

     for (int i = 1; i < pricesFromSellers.length; i++) {
         if (pricesFromSellers[i] < min) {
             min = pricesFromSellers[i];
         }
     }
     return min;
 }
}
class ShoppingCart {
 CartItem[] items;
 ShoppingCart(CartItem[] items) {
     this.items = items;
 }
 void displayCart() {
     System.out.println("Shopping Cart Details:\n");

     for (int i = 0; i < items.length; i++) {
         System.out.println("Item ID: " + items[i].itemId);
         System.out.println("Item Name: " + items[i].itemName);
         System.out.println("Lowest Price: " + items[i].getLowestPrice());
         System.out.println("-----------------------------------");
     }
 }
 double calculateTotalCost() {
     double total = 0;

     for (int i = 0; i < items.length; i++) {
         total += items[i].getLowestPrice();
     }
     return total;
 }
}
public class Shopping {
 public static void main(String[] args) {
     CartItem[] cartItems = new CartItem[5];
     cartItems[0] = new CartItem(1, "Laptop", new double[]{55000, 53000, 54000});
     cartItems[1] = new CartItem(2, "Mobile", new double[]{20000, 19500, 21000});
     cartItems[2] = new CartItem(3, "Headphones", new double[]{2500, 2300, 2400});
     cartItems[3] = new CartItem(4, "Keyboard", new double[]{1500, 1400, 1600});
     cartItems[4] = new CartItem(5, "Mouse", new double[]{800, 750, 780});
     ShoppingCart cart = new ShoppingCart(cartItems);
     cart.displayCart();
     double totalCost = cart.calculateTotalCost();
     System.out.println("Total Cart Value (Lowest Prices): " + totalCost);
 }
}
