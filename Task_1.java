/*
Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
Добавить функции 1) Добавление номера
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_1{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, String> telephoneBook = new HashMap<>();
        while (true) {
            System.out.println("Выберете действие: 1 - добавление номера; 2 - вывод всего; stop - для выхода ");
            String str = input.nextLine();
            if (str.equals("1")) {
                System.out.println("Введите фамилию: ");
                String str1 = input.nextLine();
                if (telephoneBook.containsKey(str1)) {
                    System.out.println("Введите телефон: ");
                    String str2 = input.nextLine();
                    telephoneBook.put(str1, telephoneBook.get(str1) + "; " + str2);
                }
                else {
                    System.out.println("Введите телефон: ");
                    String str2 = input.nextLine();
                    telephoneBook.put(str1, str2);
                }
            }
            if (str.equals("2")) {
                System.out.println(telephoneBook);
            } else if (str.equals("stop")) {
                break;
            }
            else System.out.println("Введена неверная команда");
        }
    }
}
