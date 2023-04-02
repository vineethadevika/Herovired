import java.io.File;
import java.io.IOException;
import java.util.*;
import java.io.FileWriter;
class FileOperations
{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      
      char f='Y';
      while(f =='Y'){
        System.out.println("Menu based app - File Operations in Java");
        System.out.println("1.Create a new folder\n2.Create a new text file\n3.Write into a text file\n4.Append data to a text file\n5.Rename a file\n6.Delete a file"); 
        System.out.print("Please enter the Menu:");
      int num=sc.nextInt();
      switch(num){
        case 1:{
            System.out.println("Please enter the Path where you wish to save a new folder: ");  
            String path = sc.next();  
            System.out.print("Please enter the Folder-name to be Created:");  
            path = path+sc.next();  
            File fold=new File(path);
            boolean b1=fold.mkdir();
            if(b1==false){
              System.out.println("Folder is not created");
            }
            else{
              System.out.println("Folder is created Successfully!");
            }
            break;
        }

        case 2:{
            try{
              System.out.println("Enter the path where you want to create the file: "); 
              String path1 = sc.next();  
            System.out.println("Enter the name of the file:");  
              path1 = path1+sc.next();  
              File f1=new File(path1);
              if(f1.createNewFile()){
                 System.out.println("File is created");   
              }
              else{
                System.out.println("File already exists");
              }
            }
            catch(IOException e1){
              System.out.println("Error occured while creating file");
              e1.printStackTrace();
            }
            break;
        }
        case 3:{
        try{
          System.out.println("Enter the path the file: "); 
          String path2 = sc.next();  
          FileWriter f2=new FileWriter(path2);
          f2.write("This is line a text file");
          f2.close();
          System.out.println("Successfully written into the file");
        }
        catch(IOException e2){
          System.out.println("Error occured while writing into the file");
          e2.printStackTrace();
        }
        break;
      }
      case 4:{
      try
      {
        System.out.println("Enter the path the file: "); 
          String path3 = sc.next();  
          FileWriter f3 = new FileWriter(path3, true);
         String s2="This is appended data";
         f3.write(s2);
         f3.close();
      }
      catch(IOException e3){
        System.out.println("Error occured while appending text into the file");
          e3.printStackTrace();
      }
      break;

    }
    case 5:{
        System.out.println("Enter the path of existing file: "); 
          String path4 = sc.next(); 
          System.out.println("Enter the path the new file: "); 
          String path5=sc.next();
          File old=new File(path4);
          File neww=new File(path5);
          boolean flag=old.renameTo(neww);
          if(flag==true){
            System.out.println("File renamed successfully");
          }
          else{
            System.out.println("Operation Failed");
          }
          break;
      }
      case 6:{
        System.out.println("Enter the path of file you want to delete: "); 
          String path6 = sc.next(); 
          File f6=new File(path6);
          boolean flag=f6.delete();
          if(flag==true){
            System.out.println("File deleted successfully");
          }
          else{
            System.out.println("Operation Failed");
          }
          break;
      }
    }
      System.out.print("Press 'Y' to go back to the Main File-Operations Menu: ");
      f=sc.next().charAt(0);
   }

  
  }
}