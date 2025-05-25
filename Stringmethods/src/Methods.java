public class Methods {


    public static void main(String[] args) {



        String str = "Hello world";
        String str1 = "";

        boolean result1 =str1.isEmpty();
        boolean result    = str.isEmpty();
        System.out.println(result);
        System.out.println(result1);



        String value = "Hello";

        char returnvalue = value.charAt(1);
        System.out.println(returnvalue);


        String name = "manju";
      int value1   = name.length();
        System.out.println(value1);

        String hospital = "gvthospital";

      String value2  = hospital.toUpperCase();

        System.out.println(value2);

        String student = "ABHIJEET";

        String value3  = student.toLowerCase();
        System.out.println(value3);

        String village = "balakundi";

        int value4 = village.codePointAt(3);
        System.out.println(value4);

        String laptop = "dell";

        int value5 = laptop.hashCode();
        System.out.println(value5);

        String car = "bmw";

        int value6 = car.codePointBefore(2);
        System.out.println(value6);


        String animal = "Chimpanzee";

        int returnn = animal.codePointCount(0,8);
        System.out.println(returnn);

        String myStr1 = "Hello";
        String myStr2 = "He";
       int resull =(myStr1.compareTo(myStr2));
        System.out.println(resull);


        String myStr = "Hello";
        String myst = "Hel";

        boolean valuee = myStr.contentEquals(myst);
        System.out.println(valuee);

        String number = "6360480400";
        String number1 = "6360480401";
        String number3 = "6360480400";

        boolean num = number.equals(number1);
        boolean num1 = number.equals(number3);
        System.out.println(num1);

        String mobile = "Redmi";
        int mob = mobile.hashCode();
        System.out.println(mob);

        String taluk = "siruguppm";

        String tal = taluk.replace('m','a');
        System.out.println(tal);

        String Dog = "I love cats. Cats are very easy to love. Cats are very popular.";
        String regex = "(?i)cat";
        String d1 = Dog.replaceAll(regex,"dog");
        System.out.println(d1);




    }
}