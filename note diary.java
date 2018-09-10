import java.util.Scanner;
public class notesdairy
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Input : ");
        int noOfSteps=sc.nextInt();
        int numberOnSteps[]=new int[noOfSteps];
        
        for(int i=0;i<no ofSteps;i++)
            numberOnSteps[i]=sc.nextInt();
        
        int totalSum=0;
        for(int i=0;i<no ofSteps;i++)
        {
            int sum=0;
            for(int k=0;k<i;k++)
            {
                if(number onSteps[k] < number onSteps[i])
                    sum+=numberOnSteps[j];
            }
            totalSum+=sum;
        }
        System.out.println("Output :\n" + totalSum);
    }
}
