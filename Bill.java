import java.util.Scanner;

public class Bill {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
      System.out.println("****simple bill generator****");
      System.out.println("enter no. of item");
      int numofitem=sc.nextInt();
Double totalcost=0.0;

for(int i=1;i<=numofitem;i++){

   System.out.println("enter name of item");
   String itemname=sc.next();

System.out.println("price of item");
   int price=sc.nextInt();
   
   System.out.println("Quantity of item");
   int quantity=sc.nextInt();

   double itemcost=price*quantity;
   totalcost+=itemcost;
}
System.out.println("discount in totalcost");
double discount = sc.nextDouble();

double discountAmount=(discount/100)*totalcost;
 Double finalbill=totalcost - discountAmount;
        
 System.out.println("**final bill**");
System.out.println("Total cost before discount: $" + totalcost);
System.out.println("Discount applied: " + discount + "% ($" + discountAmount + ")");
System.out.println("Total amount to pay: $" + finalbill);
        

   }} 

