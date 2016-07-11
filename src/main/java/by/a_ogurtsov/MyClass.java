package by.a_ogurtsov;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MyClass {

    public static void main(String args[]) {
        Double m_input = 53.5;
        check_ruble(m_input);


        }
public static String check_ruble (Double input){
    String s = "";

    Double ostatok =  new BigDecimal(input -  input.intValue()).setScale(2,RoundingMode.HALF_DOWN).doubleValue();

    if (ostatok == 0.0) {
        s = (Integer.toString(input.intValue()) + " " +sclonenieRuble (input.intValue()));
        System.out.println(s);
        return  s;
    }

    else {
        ostatok *= 100;
        s = (Integer.toString(input.intValue()) + " " + sclonenieRuble (input.intValue()) + " " +
                ostatok.intValue() + " " + sclonenieKop(ostatok.intValue()));
        System.out.println(s);
        return  s;
    }

}

    private static String sclonenieRuble (Integer i){
        String s = "";
        String stroka = i.toString();
        int count = stroka.length(); //длина строки
        char chPosl = stroka.charAt(count-1); // последний символ
        char chPredposl = '2';
        if (count > 1) {   //  если число состоит из более чем двух цифр находим предпоследний символ
            chPredposl = stroka.charAt(count - 2); // предпоследний символ (для 11-19)
        }
       // System.out.println(ch);
        if (chPredposl== '1' ) return s= "рублей";
        else {
            switch (chPosl) {
                case '1':
                    s = "рубль";
                    break;
                case '2':
                case '3':
                case '4':
                    s = "рубля";
                    break;
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '0':
                    s = "рублей";
                    break;
            }
        }  //else
        return  s;}

    private  static String sclonenieKop (Integer i){
        String s = "";
        String stroka = i.toString();
        int count = stroka.length(); //длина строки
        char chPosl = stroka.charAt(count-1); // последний символ
        char chPredposl = '2';
        if (count > 1) {   //  если число состоит из более чем двух цифр находим предпоследний символ
            chPredposl = stroka.charAt(count - 2); // предпоследний символ (для 11-19)
        }
        // System.out.println(ch);
        if (chPredposl== '1' ) return s= "копеек";
        else {
            switch (chPosl) {
                case '1':
                    s = "копейка";
                    break;
                case '2':
                case '3':
                case '4':
                    s = "копейки";
                    break;
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '0':
                    s = "копеек";
                    break;
            }
        }  //else
    return s;}


}


