import java. util. Scanner;

public class wordCount
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        String str=scan.nextLine();
        
        String[] s=str.split(" ");  
        
        int count=1;
        
        for(int i=0;i<=s.length;i++)
        {
            for(int j=i+1;j<s.length;j++)
            {
              if(s[i].equals(s[j]) && s[i]!="-1")
                {
                     s[j]="-1";
                    count++; 
                }
            }
            
    
            if(count>1 && s[i]!="-1")
            {
                System.out.println(s[i]+" "+count);
                 s[i]="-1";
            }
            count=1;
        }
    }
}