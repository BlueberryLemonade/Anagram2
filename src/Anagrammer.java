public class Anagrammer {
    public static void main(String[] args) {

        String first  = "AbC";
        String second = "cBa";

        first = first.toUpperCase();
        second = second.toUpperCase();

        int fLen = first.length();
        int sLen = second.length();

        if(fLen != sLen){
            System.out.println("The lengths are not the same.");
        } else {

            char[] firstArray = new char[fLen];
            for(int i=0; i<fLen; i++){
                firstArray[i] = first.charAt(i);
                System.out.println("The index at " + i + " is the character: " + firstArray[i]);
            }


            System.out.println("The lengths are the same");
        }

    }
}