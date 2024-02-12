import java.util.*;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numofpeople;
      double sliceperperson; 
      double costofpizza;
      double wholepizza;
      double cost;
      double tax;
      double delivery;
      double total;
      
      
      numofpeople = scnr.nextInt();
      sliceperperson = scnr.nextDouble();
      costofpizza = scnr.nextDouble();
      
      
      wholepizza = ((numofpeople * sliceperperson) / 8);
      int pizzas = (int)Math.ceil(wholepizza);
      
      cost = pizzas * costofpizza;
      tax = (cost * 0.07);
      delivery = (tax + cost) * .2;
      total = cost + tax + delivery;
      
      System.out.println("Friday Night Party");
      System.out.printf(pizzas + " Pizzas: $%.2f\n", cost); 
      System.out.printf("Tax: $%.2f\n", tax);
      System.out.printf("Delivery: $%.2f\n", delivery);
      System.out.printf("Total: $%.2f\n", total);
      System.out.println("");
      
      
      
      int numofpeople2;
      double sliceperperson2;
      double costofpizza2;
      double wholepizza2;
      double cost2;
      double tax2;
      double delivery2;
      double total2;
      
      numofpeople2 = scnr.nextInt();
      sliceperperson2 = scnr.nextDouble();
      costofpizza2 = scnr.nextDouble();
      
      wholepizza2 = ((numofpeople2 * sliceperperson2) / 8);
      int pizzas2 = (int)Math.ceil(wholepizza2);
      
      cost2 = pizzas2 * costofpizza2;
      tax2 = (cost2 * 0.07);
      delivery2 = (tax2 + cost2) * .2;
      total2 = cost2 + tax2 + delivery2;
      
      System.out.println("Saturday Night Party");
      System.out.printf(pizzas2 + " Pizzas: $%.2f\n", cost2); 
      System.out.printf("Tax: $%.2f\n", tax2);
      System.out.printf("Delivery: $%.2f\n", delivery2);
      System.out.printf("Total: $%.2f\n", total2);
      System.out.println("");
      
      int numofpeople3;
      double sliceperperson3;
      double costofpizza3;
      double wholepizza3;
      double cost3;
      double tax3;
      double delivery3;
      double total3;
      
      numofpeople3 = scnr.nextInt();
      sliceperperson3 = scnr.nextDouble();
      costofpizza3 = scnr.nextDouble();
      
      wholepizza3 = ((numofpeople3 * sliceperperson3) / 8);
      int pizzas3 = (int)Math.ceil(wholepizza3);
      
      cost3 = pizzas3 * costofpizza3;
      tax3 = (cost3 * 0.07);
      delivery3 = (tax3 + cost3) * .2;
      total3 = cost3 + tax3 + delivery3;
      
      System.out.println("Sunday Night Party");
      System.out.printf(pizzas3 + " Pizzas: $%.2f\n", cost3); 
      System.out.printf("Tax: $%.2f\n", tax3);
      System.out.printf("Delivery: $%.2f\n", delivery3);
      System.out.printf("Total: $%.2f\n", total3);
      System.out.println("");
      System.out.printf("Weekend Total: $%.2f\n", (total + total2 + total3));
   }
}
