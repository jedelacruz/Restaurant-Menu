package restaurants;
import java.util.Scanner;
public class Restaurants {
	 public static void main(String[] args) {
	        
	        Scanner input = new Scanner(System.in);
	        boolean quit= false;
	        int sum=0;
	        //int wine=200,cold=20,bear=400,juice=100;
	        int steak=350,chicken=250,spag=120,carb=120,burger=75,fries=75,rice=20,frice=30,juice=50;
	        String order="";
	        
	        System.out.println("Hello, thank you for coming in to Lyceum Restaurant.\nI am Lycand your server for today. Can I ask what is your name?");
	        String name = input.nextLine();
	        
	        
	        
	        System.out.println("Welcome to our restaurant Mr/Ms " +name +". This is our menu you can order from. \n");
	        do{
	            System.out.println("ITEM		Price");
	            System.out.println("[1] Steak 	350");
	            System.out.println("[2] Chicken 	250");
	            System.out.println("[3] Spaghetti   120");
	            System.out.println("[4] Carbonara 	120");
	            System.out.println("[5] Burger 	75");
	            System.out.println("[6] Fries 	75");
	            System.out.println("[7] Rice 	20");
	            System.out.println("[8] Fried Rice	30");
	            System.out.println("[9] Juice	50");
	            System.out.println("[0] Quit");
	            
	            System.out.print("");
	            int choice=input.nextInt();
	            
	            switch(choice){
	                case 1:System.out.println("Your order is Steak. Do you want to order more? \n");
	                        sum=sum+steak;
	                        order=order.concat("Steak"+"\n");
	                        
	                    break;
	                case 2:
	                    System.out.println("Your order is Chicken. Do you want to order more? \n");
	                    sum=sum+chicken;
	                    order=order.concat("Chicken"+"\n");
	                    
	                       break;
	                case 3:
	                    System.out.println("Your order is Spaghetti. Do you want to order more? \n");
	                    sum=sum+spag;
	                    order=order.concat("Spaghetti"+"\n");
	                      break;
	                case 4:
	                    System.out.println("Your order is Carbonara. Do you want to order more? \n");
	                    sum=sum+carb;
	                    order=order.concat("Carbonara"+"\n");
	                    break;
	                case 5:
	                    System.out.println("Your order is Burger. Do you want to order more? \n");
	                    sum=sum+burger;
	                    order=order.concat("Burger"+"\n");
	                    break;
	                case 6:
	                    System.out.println("Your order is Fries. Do you want to order more? \n");
	                    sum=sum+fries;
	                    order=order.concat("Fries"+"\n");
	                    break;
	                case 7:
	                    System.out.println("Your order is Rice. Do you want to order more? \n");
	                    sum=sum+rice;
	                    order=order.concat("Rice"+"\n");
	                    break;
	                case 8:
	                    System.out.println("Your order is Fried Rice. Do you want to order more? \n");
	                    sum=sum+frice;
	                    order=order.concat("Fried Rice"+"\n");
	                    break;
	                case 9:
	                    System.out.println("Your order is Juice. Do you want to order more? \n");
	                    sum=sum+juice;
	                    order=order.concat("Juice"+"\n");
	                    break;
	                case 0:
	                     quit=true;
	                     
	                    break;
	                default:
	                    System.out.println("Wrong input");
	            }
	        
	        }while(!quit);
	       
	        System.out.println("Your orders are:\n"+order);
	        System.out.println("Your total bill is "+sum);
	        
	         System.out.println("Thank you for visiting us Mr/Ms "+name+", We hope you have a great rest of the day!");
	    
	        
	        
	        
	    
	    }
}
