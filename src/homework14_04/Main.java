package homework14_04;

public class Main {
    /*
    Написать следующие лямбды используя наши интерфейсы
    1. сложить строки a и  b
    2.есть строка, если ее длина равна 3 вернуть true  иначе  false
    3.Есть строка string распечатать ее в виде !string!
    4.написать такую лямбду, используя интерфейс Checkable:
      если длина строки четная вернуть true  иначе false
     */
    public static void main(String[] args) {

        StringConcate str = (a,b)-> Integer.toString(a).concat(Integer.toString(b));
        System.out.println(str.concat(10,2));

        Checkable str1 = (in)->(in.length()==3);
        System.out.println(str1.check("Hello"));

        Printable str2 = (s)->System.out.println("!"+s+"!");
        str2.print("Hello");

        Checkable str3 = (st)->(st.length()%2==0);
        System.out.println(str3.check("Hello"));

        Transormable str4 = a->a.toUpperCase();
        System.out.println(str4.modify("Hello"));

    }
}
