public class NestedLoops {

    public static String xSquare (int num){
        String output = "";
        for (int x=1; x<=num; x++){
            for (int y=1; y<=num; y++)
                output+="X";
                output+="\n";
        }
        return output;
    }
    public static String xSquare2(int n){
        String output = "";
        for (int x=1; x<=n; x++){
            for (int y=1; y<=n; y++)
                output+="X";
            output+="\n";
        }
        return output;
    }
    public static String flippedTriangle(int n){
        String output = "";
        for (int x=1; x<=n; x++){
            for (int y=x; y<=n; y++)
                output+="*";
                output+="\n";
        }
        return output;
    }
    public static String multiplicationTable(){
        String output ="";
        for (int x=1; x<=9; x++){
            for (int y=1; y<=9; y++)
                if ((x*y)>=10){
                    output+=" "+x*y;
                }
                else
                    output+="  "+x*y;
                output+="\n";
        }
        return output;
    }
        public static void main (String[]args){
        System.out.print(xSquare(5));
        System.out.print(xSquare2(8));
        System.out.print(flippedTriangle(6));
        System.out.print(multiplicationTable());
        }
}

