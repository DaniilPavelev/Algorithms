package main.CodeWars;

public class SquareDigit {

    public static void main(String[] args) {
        int  a =9119;


        System.out.println(squareDigits(a));
    }

    public static int squareDigits(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        String resultString = "";
        for(int i=0;i<digits.length;i++){
            int buffer = Integer.valueOf(String.valueOf(digits[i]));
            resultString = resultString + buffer*buffer;
        }

        return Integer.valueOf(resultString);
    }

}