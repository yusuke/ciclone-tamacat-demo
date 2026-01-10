package com.example.aidemo;

import java.util.regex.Pattern;

public class RenameRefactoring {
    public static void main(String[] args) {
        var num = 48;
        var str = "織田信長";
        System.out.printf("%sは%d歳で死亡しました%n", str, num);
        
        printApple();
    }

    public static void printApple() {
        printFruit("apple");
    }

    public static void printFruit(String fruitName) {
        int repeat = 10;
        for (int i = 0; i < repeat; i++) {
            System.out.println(fruitName);

        }
    }

    public static void regexp() {
        Pattern regex1 = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        System.out.println(regex1.matcher("a@dc").matches());

        Pattern regex2 = Pattern.compile("^(https?://)?([\\da-z.-]+)\\.([a-z.]{2,6})[/\\w .-]*/?$");
        System.out.println(regex2.matcher("ftp://example.com/").matches());

        Pattern regex3 = Pattern.compile("^(0\\d{1,4}-?\\d{1,4}-?\\d{4})$");
        System.out.println(regex3.matcher("090-1234-5678").matches());
    }

    public static void sql() {
        String sql = "SELECT * FROM JETBRAINSCUSTOMERS WHERE CUSTOMER_ID > 18";
    }

}
