/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinevotingsystem;

/**
 *
 * @author Pooja
 */
import java.util.Scanner;
public class Onlinevotingsystem {

    /**
     * @param args the command line arguments
     */
  static int id, cunt1=0,cunt2=0,cunt3=0,cunt4=0,ch;
   static int count=0;
    public static void main(String[] args) {
         
         do
         {
        System.out.println("WELCOME TO ONLINE VOTING SYSTEM.....");
        System.out.println("1.Voting\n2.Admin panel\n3.Winner\n4.Exit\nEnter your choice");
        Scanner obj=new Scanner(System.in);
        ch=obj.nextInt();
        switch(ch)
        {
            case 1: if(count==0)
                     voting();
                   else
                    System.out.println("You have already voted");
                     break;
                     
            case 2:Admin();
                   break;
                   
            case 3:
               winner();
            
                  break;
            case 4:exit();
                  break;
            default:System.out.println("Invalid choice!!!!!!!!!!");
        }
        
    }while(ch<4);
         
         }


public static void voting()
{
   
    int ele;
    int []vid={1,2,3,4,5,7,9,6,90,12,89};
        boolean found=false;
  
        System.out.println("Enter a voter id:");
        Scanner obj=new Scanner(System.in);
ele=obj.nextInt();
        for(int n:vid)
        {
           
            if(n==ele)
            {
                found=true;
                break;
            }
        }
        if(found)
        
             System.out.println("id is  present");
        
        else 
        {
                System.out.println("id is nt present");
                return;
        }
                  
System.out.println("Candidates\tID\n1.John\t\t101\n2.Joseph\t102\n3.Thomas\t103\n4.Peter\t\t104\n");
System.out.println("Enter candidate id");

id=obj.nextInt();
if(id==101)
    cunt1++;

else if(id==102)
    cunt2++;

else if(id==103)
   cunt3++;

else  if(id==104)
    cunt4++;
 else{
     System.out.println("Enter valid id");
     return;
 }
System.out.println("THANK YOU.....\nYOU HAVE VOTED SUCCESSFULLY.....");
count++;
}
public static void Admin()
{
    int pwd,pd=910;
    System.out.println("Enter your password\n");
    Scanner obj=new Scanner(System.in);
pwd=obj.nextInt();
if(pwd==pd)
   
{
    System.out.println("Candidates with their votes ");
            System.out.println("John  \t "+cunt1);
            System.out.println("Joseph\t"+cunt2);
            System.out.println("Thomas\t"+cunt3);
            System.out.println("Peter\t"+cunt4);
    
}
else
    System.out.println("\nYou have typed wrong password....");
    
       
}
    public static void winner()
    {
        
        if(cunt1>cunt2 && cunt1>cunt3)
        {
            if(cunt1>cunt4)
                System.out.println("John is winner with votes\t"+cunt1);
            
        }
       else if(cunt2>cunt1 && cunt2>cunt3)
        {
            if(cunt2>cunt4)
                System.out.println("Joseph is winner with votes\t"+cunt2);
            
        }
      else  if(cunt3>cunt1 && cunt3>cunt2)
        {
            if(cunt3>cunt4)
                System.out.println("Thomas is winner with votes\t"+cunt3);
            
        }
      else if(cunt4>cunt1 && cunt4>cunt2)
        {
            if(cunt4>cunt3)
                System.out.println("Peter is winner with votes\t"+cunt4);
            
        }
        
    
        else
                System.out.println("\nYou have not yet voted");
    }
    public static void exit()
    {
        return;
    }
}



    

