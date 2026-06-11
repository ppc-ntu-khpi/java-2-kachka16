# Звіт о виконання роботи

## Завдання 1

> Модифікувати стартовий код таким чином, щоб метод Calculate класу Exercise містив код обчислення значення у відповідності до обраного вами завдання - 12 варіант. Рядок, який виводиться у результаті виконання методу main класу TestResult теж слід скоригувати у відповідності до специфіки завдання.
> 12 варіант - Перевірити чи задане слово є паліндромом (метод Calculate має повернути булевське значення)

1. Клас Exercise прибирає у словах пробіли та робить всі слова з маленької літери, та перевіряє першу та останню літери, другу та переодстанню, і так зводить до центру, повертаючи  true/false
2. В класі TestResult є масив слів які перевіряються на поліандром, через цикл for та значення true/false з класу Exercise, виводить для кожного слова чи є воно поліандромом чи ні.

### Exercise.java
``` java
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
```

### TestResult.java
``` java
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

```

## Результат

![task1](https://github.com/kachka16/java-2-kachka16/blob/master/img/%D1%80%D0%B5%D0%B7%D1%83%D0%BB%D1%8C%D1%82%D0%B0%D1%82.png?raw=true)
