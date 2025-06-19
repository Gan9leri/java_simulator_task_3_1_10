import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args){
        int x, y, result;
        String op;
        String[] inputValue = readInput();
        result = 0;
        x = parseInt(inputValue[0]);
        op = inputValue[1];
        y = parseInt(inputValue[2]);
        if(op.equals("x")){
            result = x * y;
        }
        else if (op.equals("/")){
            result = x / y;
        }
        System.out.println(result);
    }

    public static String[] readInput(){
        String[] values = new String[3];
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()){
            values = scanner.nextLine().split(" ");
        }
        return values;
    }
}
