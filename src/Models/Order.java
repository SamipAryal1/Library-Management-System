package Models;

import java.util.List;

public class Order {
   private List<BookOrder> bookOrders;
   private double vatRate;
   private double discountRate;
   private Customer customer;
   private double totalPrice;

   public Order(List<BookOrder> bookOrders, double vatRate, double discountRate, Customer customer) {
      this.bookOrders = bookOrders;
      this.vatRate = vatRate;
      this.discountRate = discountRate;
      this.customer = customer;
      this.totalPrice = calculateTotalPrice(); // Initialize totalPrice
   }


   public double calculateTotalPrice() {
      double total = 0.0;
      for (BookOrder bookOrder : bookOrders) {
         total = total + bookOrder.calculateTotalPrice();
      }
      return total;
   }


   public double calculateVat() {
      return totalPrice * (vatRate / 100);
   }


   public double calculateDiscount() {
      return totalPrice * (discountRate / 100);
   }


   public double calculateFinalPrice() {
      return totalPrice + calculateVat() - calculateDiscount();
   }


   public List<BookOrder> getBookOrders() {
      return bookOrders;
   }

   public void setBookOrders(List<BookOrder> bookOrders) {
      this.bookOrders = bookOrders;
      this.totalPrice = calculateTotalPrice(); // Update totalPrice when bookOrders change
   }

   public double getTotalPrice() {
      return totalPrice;
   }

   public void setTotalPrice(double totalPrice) {
      this.totalPrice = totalPrice;
   }

   public double getVatRate() {
      return vatRate;
   }

   public void setVatRate(double vatRate) {
      this.vatRate = vatRate;
   }

   public double getDiscountRate() {
      return discountRate;
   }

   public void setDiscountRate(double discountRate) {
      this.discountRate = discountRate;
   }

   public Customer getCustomer() {
      return customer;
   }

   public void setCustomer(Customer customer) {
      this.customer = customer;
   }
}
