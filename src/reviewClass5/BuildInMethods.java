package reviewClass5;

public class BuildInMethods {

    public static void main(String[] args) {
        String words = "Some Batch2 students do not like review class";
        // this is a way to count words
        String[] wordsCount = words.split(" ");
        System.out.println("Sentence words count is " + wordsCount.length);


        String sentences = "this is bach2 . They are doing great . Definitely they will get job";

        String[] sentence = sentences.split(" . ");
        System.out.println(sentence.length);
        for (String str : sentence) {
            System.out.println(str);
        }

        String str = "Words";
        str.length();

        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            newStr += str.charAt(i);
        }
        System.out.print(newStr);


        char[] reveresStr = str.toCharArray();
        System.out.println();
        for (int i = reveresStr.length - 1; i >= 0; i--) {

            System.out.print(reveresStr[i]);

        }

        // ctrl+alt+l     organize your code
    }
}
