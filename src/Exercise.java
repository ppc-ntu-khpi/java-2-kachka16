public class Exercise {
    public static boolean Calculate(String word){

        String input_word = word.replaceAll("\\s+", "").toLowerCase();
        int left_side = 0, right_side = input_word.length()-1;

        while(left_side<right_side){
            if(input_word.charAt(left_side) !=input_word.charAt(right_side)){
                return false;
            }
            left_side++;
            right_side--;
        }
        return true;
    }
}
