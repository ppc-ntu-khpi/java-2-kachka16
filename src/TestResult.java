public class TestResult {

    public static void main(String[] args) {
        String[] word_test = {"Did", "deed", "civic", "eye", "dog", "cat"}; 

         for (int i = 0; i < row_test.length; i++) {
            boolean flase_true = Exercise.Calculate(row_test[i]);

            if(flase_true){
            System.out.println("Word: " + word_test[i] + " is palindrome");
            }
            else{
            System.out.println("Word: " + word_test[i] + " isnt palindrome");
            }
        }
    }
}
