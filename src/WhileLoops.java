import java.util.Scanner;

public class WhileLoops {
    public static Scanner scan = new Scanner(System.in);
    public static void fromHereToThere(int a, int b){
        if (a>b){
            System.out.println("Invalid input");
        }
        while (a<=b){
            System.out.println(a);
            a+=1;
        }
    }
    public static void factors(int c){
        int num = 0;
        while (num<=c){
            num+=1;
            if (c%num==0){
                System.out.println(c/num);
            }
        }
    }
    public static String countPosAndNeg(){

        int pcount = 0;
        int ncount = 0;
        int num = scan.nextInt();
        while (num!=0){
            if (num>0){
            pcount+=1;
            }
            if (num<0) {
                ncount+=1;
            }
            num = scan.nextInt();
        }
        return "There were "+pcount+" positive and "+ncount+" negative numbers.";
    }
    public static String findMinAndMax(){
        int counter = 0;
        int min =Integer.MAX_VALUE;
        int max =Integer.MIN_VALUE;
        while (counter<5){
            System.out.print("num: ");
            int num = scan.nextInt();
            counter+=1;
            if (num<min){
                min=num;
            }
            if (num>max){
                max=num;
            }
        }
        return "Max value is:"+max+"Min value is "+min;
    }
    public static Double gradePoint() {
        int counter = 0;
        double total =0;
        System.out.println("Enter seven letter grades (A, B, C, D, or F)");
        while (counter < 7) {
            String grade = scan.next();
            counter += 1;
            if (grade=="A") {
                total += 4.0;
            }
            else if (grade=="B") {
                total += 3.0;
            }
            else if (grade=="C") {
                total += 2.0;
            }
            else if (grade=="D") {
                total += 1.0;
            }
             else  {
                total += 0.0;
            }
             return (total/7+0.5)*10;
        }
    }
    public static void main(String[]args){
        //fromHereToThere(20,30);
        //factors(12);
        //System.out.println("Enter a positive or negative number or 0 to quit:");
        //System.out.println(countPosAndNeg());
        System.out.println(findMinAndMax());
    }
}
