import java.util.*;
import java.io.*;
class numberOfCharacters
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try{
            File f1=new File("HeroVired.txt");
            FileInputStream f=new FileInputStream(f1);
            BufferedReader br=new BufferedReader(new InputStreamReader(f));
            String Line;
            int c=0;
            while((Line=br.readLine())!=null)
            {
                if(Line=="")
                {
                    c+=1;
                }
                c+=Line.length();
            }
            System.out.println("Total number of characters in file are:"+c);
            br.close();
            f.close();
        }
        catch(IOException e)
        {
            System.err.println("Error: "+e.getMessage());
        }
    }
}
