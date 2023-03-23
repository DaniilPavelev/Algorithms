package main.CodeWars;

public class DisemvowelTrolls {
    public static void main(String[] args) {
        String input = "This website is for losers LOL!";
        System.out.println(disemvowel(input));
    }


    public static String disemvowel(String str) {
        String result;
        int counter=0;
        char[] blackList = new char[]{'a','A','i','I','U','u','Y','o','O','E','e'};
        char[] inputStr = str.toCharArray();
        char[] buffer = new char[inputStr.length];
        boolean isConsidered=false;
        for(int i=0;i<inputStr.length;i++){
            for(int j=0;j<blackList.length;j++){
                if(inputStr[i]==blackList[j])
                    isConsidered = true;
            }
            if(!isConsidered){
                buffer[counter]=inputStr[i];
                counter++;
            }
            isConsidered= false;
        }
        char[] resultOfChar = new char[counter];
        for(int i=0;i<counter;i++){
            resultOfChar[i] = buffer[i];
        }

        result = String.copyValueOf(resultOfChar);
        return result;
    }
}
