public class IntegerLiteral {
        static public void main(String[] s) {
            int a = 104; // Decimal Integer Literal
            int b = 0150; // Octal Integer Literal
            int c = 0x68; // Hexa-Decimal Integer Literal
            // int c=0X68; //Allowed
            int d = 0b1101000; // Binary Integer Literal
            // int d=0B1101000; //Allowed
            System.out.println(a);// 104
            System.out.println(b);// 104
            System.out.println(c);// 104
            System.out.println(d);// 104

            int x = 12_55_81_5_45;
            // int x=12____55_81____5_45;//Allowed
            // int x=_12_55_81_5_45_;//error
            System.out.println(x);
        }
    }
    

