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

    }

        public static void main (String[]args){
        System.out.println(xSquare(5));
        }
}

