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
        int count = stroka.length(); //����� ������
        char chPosl = stroka.charAt(count-1); // ��������� ������
        char chPredposl = '2';
        if (count > 1) {   //  ���� ����� ������� �� ����� ��� ���� ���� ������� ������������� ������
            chPredposl = stroka.charAt(count - 2); // ������������� ������ (��� 11-19)
        }
       // System.out.println(ch);
        if (chPredposl== '1' ) return s= "������";
        else {
            switch (chPosl) {
                case '1':
                    s = "�����";
                    break;
                case '2':
                case '3':
                case '4':
                    s = "�����";
                    break;
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '0':
                    s = "������";
                    break;
            }
        }  //else
        return  s;}

    private  static String sclonenieKop (Integer i){
        String s = "";
        String stroka = i.toString();
        int count = stroka.length(); //����� ������
        char chPosl = stroka.charAt(count-1); // ��������� ������
        char chPredposl = '2';
        if (count > 1) {   //  ���� ����� ������� �� ����� ��� ���� ���� ������� ������������� ������
            chPredposl = stroka.charAt(count - 2); // ������������� ������ (��� 11-19)
        }
        // System.out.println(ch);
        if (chPredposl== '1' ) return s= "������";
        else {
            switch (chPosl) {
                case '1':
                    s = "�������";
                    break;
                case '2':
                case '3':
                case '4':
                    s = "�������";
                    break;
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '0':
                    s = "������";
                    break;
            }
        }  //else
    return s;}


}


