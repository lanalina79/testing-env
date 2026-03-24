package operationsandcyclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        //sum of the odd numbers from 0 to 1000//

        int result =0;
        for(int i=0; i<=10;i++){
            System.out.println("iterator: "+ i);
            if(i%2==1){
                result+=i;
                //result=result+i;
                System.out.println("Total sum: "+result);


            }

        }
        System.out.println("Total sum: "+result);

        for(int i=1; i<10;i+=2){
            System.out.println("i= "+i);
        }

        int a=0;
        for(;a<10;a++){
            System.out.print(a+" ");
        }

        int b =0;
        for(;b<a;){
            System.out.print(b+"  ");
            b+=2;
        }
    }
}
