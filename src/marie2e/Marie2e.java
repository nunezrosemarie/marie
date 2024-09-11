mport java.util.ArrayList;
import java.util.Scanner;

class Order {
    int orderID;
    String customerName;
    String orderDate;
    double orderAmount;
    String orderStatus;

    // Constructor
    public Order(int orderID, String customerName, String orderDate, double orderAmount, String orderStatus) {
         this.orderID = orderID;
        this.customerName = customerName;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
        this.orderStatus = orderStatus;
    }

    // Display order summary
    public void displayOrder() {
        System.out.printf("%-10d %-15s %-15s $%-10.2f %-10s%n", orderID, customer
