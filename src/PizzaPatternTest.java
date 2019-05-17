
import java.text.DecimalFormat;
import java.util.Scanner;

import Factory.Pizza;


public class PizzaPatternTest {                           //Demo of pizza pattern
	
	public static void main(String[] args) {
		
		myStore pizzeria=new myStore();
		String finalOrder=null;
		DecimalFormat df = new DecimalFormat(".###");
		int ingredients=0;
		double finalCost=0.0;
		
		int firstChoice=0;
		String choice=null;
		char secondChoice;
		
		Pizza orderedPizza=null;                       //one instance of pizza

		
		
		Scanner input=new Scanner(System.in);
		
	    System.out.println("*****************Menu***************");
	    System.out.println("1. Small, $8.00");
	    System.out.println("2. Medium, $10.00");
	    System.out.println("3. Large, $12.00");
	    System.out.println("4. Family, $16.00");
        System.out.println("Enter the base pizza of your choice:");
        firstChoice=input.nextInt();
        
        switch(firstChoice)
		{
		case 1:
		
			  orderedPizza=pizzeria.orderPizza("small",orderedPizza);
			
			  break;
		case 2:
			
			orderedPizza=pizzeria.orderPizza("medium",orderedPizza);
			
			  break;
		case 3:
			
			orderedPizza=pizzeria.orderPizza("large",orderedPizza);
		  
			  break;
		case 4:
			
			orderedPizza=pizzeria.orderPizza("family",orderedPizza);
			  break;
		default: 
			
			 System.out.println("Invalid choice. Please try again!!!");
			 System.exit(0);
			  
		}
        
      
		do {
			System.out.println("********List of ingredients********");
			System.out.println("(p)epperoni, $2.00");
			System.out.println("(s)ausage, $2.00");
			System.out.println("(h)amburger, $2.00");
			System.out.println("(c)anadian bacon, $2.75");
			System.out.println("(e)xtra cheese, $1.85");
			System.out.println("(o)nions, $1.50");
			System.out.println("(g)reen pepper, $1.50");
			System.out.println("(b)lack olives, $1.50");
			System.out.println("gree(n) olives, $1.35");
			System.out.println("(m)ushrooms, $1.75");
			System.out.println("(a)nchovies, Free!");
			System.out.println("bee(r), $3.25");
			System.out.println("Press 'q' to see the Final Order and the Total Price. Press 'z' to cancel the order");
			System.out.println("Enter the ingredients of your choice: ");
			
			choice=input.next();
			secondChoice=choice.charAt(0);
			
			switch(secondChoice)
			{
			case 'e':
				

				orderedPizza=pizzeria.orderPizza("Cheese", orderedPizza);
				
					 ingredients=ingredients+1;
					 finalOrder=orderedPizza.getDescription();
		            finalOrder = finalOrder.substring(0, finalOrder.length() - 2);
		            	
		            	finalCost=orderedPizza.getCost();
		            	
		           		System.out.println("Order: "+finalOrder+" - $"+df.format(finalCost));
		           		System.out.println(ingredients +" ingredients");
					  	

				break;
               case 'p':
				

            	   orderedPizza=pizzeria.orderPizza("Pepperoni", orderedPizza);
					
					  ingredients=ingredients+1;
					  finalOrder=orderedPizza.getDescription();
		            finalOrder = finalOrder.substring(0, finalOrder.length() - 2);
		            	
		            	finalCost=orderedPizza.getCost();
		            	
		           		System.out.println("Order: "+finalOrder+" - $"+df.format(finalCost));
		           		System.out.println(ingredients +" ingredients");
					 
				
				break;
				
               case 's':
   				

            	   orderedPizza=pizzeria.orderPizza("Sausage", orderedPizza);
					
					  ingredients=ingredients+1;
					  finalOrder=orderedPizza.getDescription();
		            	finalOrder = finalOrder.substring(0, finalOrder.length() - 2);
		            	
		            	finalCost=orderedPizza.getCost();
		            	
		           		System.out.println("Order: "+finalOrder+" - $"+df.format(finalCost));
		           		System.out.println(ingredients +" ingredients");
					 
					 
				
				break;
             case 'h':

            	 orderedPizza=pizzeria.orderPizza("Hamburger",orderedPizza);
   					
   					  ingredients=ingredients+1;
   					  finalOrder=orderedPizza.getDescription();
		            	finalOrder = finalOrder.substring(0, finalOrder.length() - 2);
		            	
		            	finalCost=orderedPizza.getCost();
		            	
		           		System.out.println("Order: "+finalOrder+" - $"+df.format(finalCost));
		           		System.out.println(ingredients +" ingredients");
					 
   					 
   					

   				break;
               case 'c':

            	   orderedPizza=pizzeria.orderPizza("Canadian Bacon", orderedPizza);
     				
     					  ingredients=ingredients+1;
     					  
     					  finalOrder=orderedPizza.getDescription();
  		            	finalOrder = finalOrder.substring(0, finalOrder.length() - 2);
  		            	
  		            	finalCost=orderedPizza.getCost();
  		            	
  		           		System.out.println("Order: "+finalOrder+" - $"+df.format(finalCost));
  		           		System.out.println(ingredients +" ingredients");
  					 
     					 

                  break;
               case 'o':

            	   orderedPizza=pizzeria.orderPizza("Onions", orderedPizza);
            	 
					  ingredients=ingredients+1;
					  finalOrder=orderedPizza.getDescription();
		            	finalOrder = finalOrder.substring(0, finalOrder.length() - 2);
		            	
		            	finalCost=orderedPizza.getCost();
		            	
		           		System.out.println("Order: "+finalOrder+" - $"+df.format(finalCost));
		           		System.out.println(ingredients +" ingredients");
					 
					 


   				break;
                case 'b':

                	  orderedPizza=pizzeria.orderPizza("Black Olives", orderedPizza);
      					
    					  ingredients=ingredients+1;
    					  finalOrder=orderedPizza.getDescription();
  		            	finalOrder = finalOrder.substring(0, finalOrder.length() - 2);
  		            	
  		            	finalCost=orderedPizza.getCost();
  		            	
  		           		System.out.println("Order: "+finalOrder+" - $"+df.format(finalCost));
  		           		System.out.println(ingredients +" ingredients");
  					 
    					  
                           break;
                 case 'n':

                	 orderedPizza=pizzeria.orderPizza("Green Olives", orderedPizza);
 					 
					  ingredients=ingredients+1;
					  finalOrder=orderedPizza.getDescription();
		            	finalOrder = finalOrder.substring(0, finalOrder.length() - 2);
		            	
		            	finalCost=orderedPizza.getCost();
		            	
		           		System.out.println("Order: "+finalOrder+" - $"+df.format(finalCost));
		           		System.out.println(ingredients +" ingredients");
					 
					 
                      break;

 				
               case 'm':
            	   
            	   orderedPizza=pizzeria.orderPizza("Mushrooms", orderedPizza);
					 
					  ingredients=ingredients+1;
					  finalOrder=orderedPizza.getDescription();
		            	finalOrder = finalOrder.substring(0, finalOrder.length() - 2);
		            	
		            	finalCost=orderedPizza.getCost();
		            	
		           		System.out.println("Order: "+finalOrder+" - $"+df.format(finalCost));
		           		System.out.println(ingredients +" ingredients");
					 
					  
                   break;


              
                 case 'a':
                	 
                	 orderedPizza=pizzeria.orderPizza("Anchovies", orderedPizza);
					
					  ingredients=ingredients+1;
					  finalOrder=orderedPizza.getDescription();
		            	finalOrder = finalOrder.substring(0, finalOrder.length() - 2);
		            	
		            	finalCost=orderedPizza.getCost();
		            	
		           		System.out.println("Order: "+finalOrder+" - $"+df.format(finalCost));
		           		System.out.println(ingredients +" ingredients");
					 
					 
                  break;


                   case 'r':
                	   
                	   orderedPizza=pizzeria.orderPizza("Beer", orderedPizza);
 					
 					  ingredients=ingredients+1;
 					  finalOrder=orderedPizza.getDescription();
		            	finalOrder = finalOrder.substring(0, finalOrder.length() - 2);
		            	
		            	finalCost=orderedPizza.getCost();
		            	
		           		System.out.println("Order: "+finalOrder+" - $"+df.format(finalCost));
		           		System.out.println(ingredients +" ingredients");
					 
 					 
                   break;
                   
                   case 'g':
                	   
                	   orderedPizza=pizzeria.orderPizza("Green Pepper", orderedPizza);
 					
 					  ingredients=ingredients+1;
 					  finalOrder=orderedPizza.getDescription();
		            	finalOrder = finalOrder.substring(0, finalOrder.length() - 2);
		            	
		            	finalCost=orderedPizza.getCost();
		            	
		           		System.out.println("Order: "+finalOrder+" - $"+df.format(finalCost));
		           		System.out.println(ingredients +" ingredients");
					 
 					 
                   break;
	
               case 'q':
            	   
            	finalOrder=orderedPizza.getDescription();
            	finalOrder = finalOrder.substring(0, finalOrder.length() - 2);
            	
            	finalCost=orderedPizza.getCost();
            	
           		System.out.println("Final Order: "+finalOrder+" - $"+df.format(finalCost));
           		System.out.println(ingredients +" ingredients");
           		System.out.println("End order");
           		break;
           		
               case 'z':
            	   System.exit(0);
            	   break;
  	   
				default:
					System.out.println("Invalid Choice. Please try agian!!!");
					break;
					
					
			}
			
		}while(secondChoice!='q');
		
		
		input.close();
		

	}
	

}
