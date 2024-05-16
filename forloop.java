public class forloop 
{
    
    public static void main(String[] args) 
    {
        for(int i=1;i<=10;i++)
    {
        System.out.println("What a great day" + i);
        for(int k=1;k<=9;k++) 
        {
        System.out.println(" " + (k+8) + "-" + (k+9)); 
        }
        i++;
    }
    }
}