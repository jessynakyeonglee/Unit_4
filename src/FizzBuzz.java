public class FizzBuzz {
    public static String FizzBuzz(int num){
        String output ="";
        for (int counter=0; counter<=num; counter++){
            if (counter%3==0){
                output+=" Fizz";

            }
            else if (counter%5==0){
                output+=" Buzz";
            }
            else if (counter%20==0){
                output+=" "+counter+"\n";
            }
            else
                output+=" "+counter;
        }
        return output;
    }
    public static void main(String[]args){
        System.out.print(FizzBuzz(100));
    }
}
