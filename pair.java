package mypackage;

import java.util.Scanner;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int n=g.nextInt();
        int sum=g.nextInt();
        int[] num=new int[n];
        for(int i=0;i<n;i++)
        {
            num[i]=sc.nextInt();
        }
        
        System.out.println("Output :\n"+(sumPairsExists(num,sum)?"yes":"no"));
    }
    static boolean sumPairsExists(int[] num,int sum)
    {
        for(int i=0;i<num.length;i++)
        {
            for(int j=i+1;j<num.length;j++)
            {
                if(num[i]+num[j]==sum)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
