// package 02_TypeCasting;

public class example04 {
    
        static public void main(String[] s) {
            byte a = 100;
            // byte b=a+5;//error because: byte+int=int
            byte b = (byte) (a + 5);
            System.out.println(b);

            short x = 100;
            // short y=x+5;//error
            short y = (short) (a + 5);
            System.out.println(b);
        }
    }

