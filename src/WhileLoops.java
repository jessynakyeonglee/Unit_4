public class WhileLoops {
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
    public static void main(String[]args){
        fromHereToThere(20,30);
        factors(12);
    }
}
