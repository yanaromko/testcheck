import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws TrowExeprion {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите пример, где значения вводятся через пробел");
        String calc = in.nextLine();
        String[] c = calc.split(" ");
        String[] c1 = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII",
                "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX",
                "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII",
                "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI",
                "XCVII", "XCVIII", "XCIX", "C"};
        String num1 = c[0];
        String num2 = c[2];
        String op = c[1];
        for (int i = 0; i<c.length; i++){
            if (i > 2){
                throw new TrowExeprion();
            }
        }
        String x2 = "0";
        String[] x3 = calc(num1,c1,num2,op);
        int first = Integer.valueOf(x3[1]);
        int second = Integer.valueOf(x3[2]);
        int x = Integer.valueOf(x3[0]);
        int k1 = Integer.valueOf(x3[3]);
        int k2 = Integer.valueOf(x3[4]);
        if ((k1 == 1)&& (k2 == 1)) {
            x2 = c1[x - 1];
        }
        if ((first >= 1) && (first <=10) && (second >= 1) && (second <=10) && (k1 == 1 ) && (k2 == 1)){
            System.out.println("Ваше получившееся число:");
            System.out.println(x2);
        } else if ((first >= 1) && (first <= 10) && (second >=1) && (second <= 10) && (k1 == 0) && (k2 == 0)){
            System.out.println("Ваше получившееся число:");
            System.out.println(x);

        } else {
            System.out.println("Числа не подходят");
        }
    }
    public static String[] calc(String numm1, String[] c2, String numm2, String opp ) throws TrowExeprion {
        int k1 = 0;
        int first = 0;
        int second = 0;
        int k2 = 0;
        int x = 0;
        String x2 = " ";
        if (numm1.equals("1") | numm1.equals("2") | numm1.equals("3") | numm1.equals("4") | numm1.equals("5") | numm1.equals("6") | numm1.equals("7") | numm1.equals("8") | numm1.equals("9") | numm1.equals("10")) {
            first = Integer.valueOf(numm1);
        } else {
            for (int i = 0; i < c2.length; i++) {
                if (numm1.equals(c2[i])) {
                    first = i + 1;
                    k1 = 1;
                }
            }
        }
        if (numm2.equals("1") | numm2.equals("2") | numm2.equals("3") | numm2.equals("4") | numm2.equals("5") | numm2.equals("6") | numm2.equals("7") | numm2.equals("8") | numm2.equals("9") | numm2.equals("10")) {
            second = Integer.valueOf(numm2);
        } else {
            for (int i = 0; i < c2.length; i++) {
                if (numm2.equals(c2[i])) {
                    second = i + 1;
                    k2 = 1;
                }
            }
        }
        if ((k1 == 0) && (k2 == 0)) {
            switch (opp) {
                case "+":
                    x = first + second;
                    break;
                case "-":
                    x = first - second;
                    break;
                case "*":
                    x = first * second;
                    break;
                case "/":
                    x = first / second;
                    break;
            }
        } else if ((k1 == 0) && (k2 == 1)) {
            throw new TrowExeprion();
        } else if ((k1 == 1) && (k2 == 0)) {
            throw new TrowExeprion();
        } else if ((k1 == 1) && (k2 == 1)) {
            switch (opp) {
                case "+":
                    x = first + second;
                    break;
                case "-":
                    x = first - second;
                    break;
                case "*":
                    x = first * second;
                    break;
                case "/":
                    x = first / second;
                    break;
            }
            if (x <= 0) {
                throw new TrowExeprion();
            }
        }
        if (!opp.equals("+") && !opp.equals("-") && !opp.equals("*") && !opp.equals("/")){
            throw new TrowExeprion();
        }
        String xx = String.valueOf(x);
        String firstt = String.valueOf(first);
        String secondd = String.valueOf(second);
        String k3 = String.valueOf(k1);
        String k4 = String.valueOf(k2);
        String[] x4 = {xx, firstt, secondd,k3,k4};
        return x4;
    }

}
