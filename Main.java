import java.util.Scanner;

public class Main { //comment for lab 5
	
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        String hexaDecimal;

        System.out.print("Enter a hexadecimal number: ");
        hexaDecimal = scnr.nextLine();

        long userResult = Main.printDecimal(ignorePrefix(hexaDecimal));

        System.out.println("Your number is " + userResult + " in decimal");
    }
    public static String ignorePrefix(String input) {
        if(input.contains("0x") || (input.contains("0X"))){
            String newDecimal = input.substring(2);
            return newDecimal;
        }
        else {
            return input;
        }
    }
    public static long printDecimal(String input){
        long userResult = 0;
        int hexaLength = input.length();
        int i = hexaLength;
        while (i > 0) {
            char a = Character.toUpperCase(input.charAt(i-1));
            if (a == 'A'){
                userResult += 10 * Math.pow(16, hexaLength - i);
            }
            else if (a == 'B'){
                userResult += 11 * Math.pow(16, hexaLength - i);
            }
            else if (a == 'C'){
                userResult += 12 * Math.pow(16, hexaLength - i);
            }
            else if (a == 'D'){
                userResult += 13 * Math.pow(16, hexaLength - i);
            }
            else if (a == 'E'){
                userResult += 14 * Math.pow(16, hexaLength - i);
            }
            else if (a == 'F'){
                userResult += 15 * Math.pow(16, hexaLength - i);
            }
            else if (a == 'G'){
                userResult += 16 * Math.pow(16, hexaLength - i);
            }
            else {
                userResult += Character.getNumericValue(a) * Math.pow(16, hexaLength - i);
            }
            i--;
        }
        return userResult;
    }
}