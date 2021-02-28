package collections;

import java.util.*;
public class LinkedList
{
  public static void main (String[]args) 
  {
    ArrayList ll=new ArrayList();
    Scanner s=new Scanner(System.in);
    int ch,num,index;
    do{
        
        System.out.println("1. Add element");
        System.out.println("2. Add element at given index");
        System.out.println("3. Remove element");
        System.out.println("4. Remove element at given position");
        System.out.println("5. Display element at give index ");
        System.out.println("6. size of collection ");
        System.out.println("7. Display");
        System.out.println("8.Exit");
        System.out.println("Enter your choice");
        ch=s.nextInt();
      
      
        switch(ch){
            case 1: System.out.println("Enter the number");
                    num=s.nextInt();
                    ll.add(num);
                    break;
            case 2: System.out.println("Enter the number");
            		num=s.nextInt();
            		System.out.println("Enter the index");
            		index=s.nextInt();
                    ll.add(index,num);
                     break;
            case 3: System.out.println("Enter the index");
            		num=s.nextInt();
            		ll.remove(num);
            		break;
                   
            case 4: System.out.println("Enter the index");
            		num=s.nextInt();
            		ll.remove(num);
            		break;
                    
            case 5:System.out.println("Enter the index"); 
            index=s.nextInt();
            	Integer sd = (Integer) ll.get(index);
    		System.out.println("Size: "+sd);
			break;
            		
            case 6:  int a=ll.size();
    		System.out.println("Size: "+a);
			break;
    		
			
    		
            		
            case 7: System.out.println("Given elements are:"+ll);
    				
    					break;
            case 8: System.out.println("Thank you for your time");
			
					break;
					default:System.out.println("invalid choice");break;
        }
        
        
        
    }while(ch!=8);
    
  }
}
