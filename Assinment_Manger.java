

package assinment1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


class Student

{
    static String Student_Name;
    static int Student_PRN;

    void Student_info()
    {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        Student_Name = sc.nextLine();
        
       
        System.out.println("Enter Your  PRN");
        Student_PRN = sc.nextInt();
    
    }
}


class Trainer
{
  
   static String Trainer_Name1;
    
    void Trainer_info()
    {
     
     
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Trainer");
        Trainer_Name1 = sc.nextLine(); 
    }
}


class Assignment
{
    static String Title;
      static  String Date1;
       static String Description;
       static String Assinee;
       
   void Add_Assinment()
   {
       Student obj2 = new Student();
     obj2.Student_info();
             
     
       Trainer obj1 = new Trainer();
     obj1.Trainer_info();
       
       
    
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Title");
         Title = sc.nextLine();
        
       
        
        
        System.out.println("Enter Your  Description");
        Description = sc.nextLine();
        
        System.out.println("Enter Your Assinee");
         Assinee = sc.nextLine();
        
        
   }
}

class show 
        {
    
         
    void  Show_Assinment()
    {
       SimpleDateFormat obj1 = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();
        String Date1 = obj1.format(currentDate);
        
         
         System.out.println("Student_Name "+Student.Student_Name);
        System.out.println("Student_PRN "+Student.Student_PRN);
         System.out.println("Title "+Assignment.Title);
        System.out.println("Date1 "+Assignment.Date1);
        System.out.println(" Description "+Assignment.Description);
        System.out.println("Description"+Trainer.Trainer_Name1);
        System.out.println("Assinee"+Assignment.Assinee);
        
     }
    

}



public class Assinment_Manger
{

    
    
    public static void main(String[] args) 
    {
       {
        

         
         
         
         Scanner sc13 = new Scanner(System.in);
        System.out.println(" 1) add for Assignment ");
        System.out.println(" 2) Enter for Show_Details ");
         
        int expression = sc13.nextInt();
         
         
         
       

        switch (expression) {
            
            
           case 1:
               Assignment obj3 = new Assignment();
               obj3.Add_Assinment();
              
               break;

                      case 2:
              show obj4 = new show();
              obj4.Show_Assinment();;
              break;
            
//            Assignment obj3 = new Assignment();
//                obj3.Add_Assinment();
//            
//              show obj4 = new show();
//                obj4.Show_Assinment();;  
        }
    }
      
         
         
         
    }
    
}
                     ;
//            Assignment obj3 = new Assignment();
//                obj3.Add_Assinment();
//
//              show obj4 = new show();
//                obj4.Show_Assinment();;
                 }
            
//            Assignment obj3 = new Assignment();
//                obj3.Add_Assinment();
//            
//              show obj4 = new show();
//                obj4.Show_Assinment();;  
        }

    }
      
         
         
         
    }
    
}
