package Day06.Q4;

public class FizzBuzz {

    public static void main(String[] args) {
        int start=1;
        int end=100;

       for(int i=start;i<=end;i++){
           if(i%3==0 &&i%5==0 ){
               System.out.println("FizzBuzz");
           }else if(i%3==0){
               System.out.println("Fizz");
           }else if(i%5==0 ){
               System.out.println("Buzz");
           }else{
               System.out.println(i);
           }

       }

    }
}
