public class Anagrammer {
    public static void main(String[] args) {

        String first  = "AbC";
        String second = "eBa";

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

            char[] secondArray = new char[sLen];
            for(int i=0; i<sLen; i++){
                secondArray[i] = second.charAt(i);
                System.out.println("The index at " + i + " is the character: " + secondArray[i]);
            }

            java.util.Arrays.sort(firstArray);
            java.util.Arrays.sort(secondArray);
            System.out.println(java.util.Arrays.compare(firstArray,secondArray));


            System.out.println("The lengths are the same");
        }

    }
}