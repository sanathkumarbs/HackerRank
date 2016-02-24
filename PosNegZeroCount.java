import java.util.Scanner;

public class PosNegZeroCount {
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	    Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int[] input = new int[size];
           
            sc.nextLine();
            for(int i=0;i<size;i++){
                input[i]=sc.nextInt();
            }
            
            sc.close();
            
            float pcount = 0;
            float ncount = 0;
            float zcount = 0;
            float tot = 0;
            
            for(int i=0;i<size;i++){
                if(input[i]==0){
                    zcount++;
                }else if(input[i]>0){
                    pcount++;
                }else{
                    ncount++;
                }
                tot++;
                System.out.println(input[i]);
            }
        
            float p = (pcount/tot);
            float n = (ncount/tot);
            float z = (zcount/tot);
            
            System.out.println("Count");
            System.out.println(pcount);
            System.out.println(ncount);
            System.out.println(zcount);
            System.out.println(tot);
            
            System.out.println("Res");
            System.out.println(p);
            System.out.println(n);
            System.out.println(z);
	}

}
