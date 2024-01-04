public class FloatingPointLiteral{
    static public void main(String []s){
        double a=32541.96587; //Normal Floating Point Literal
        double b=3.254196587e+4; //Exponatial Floating Point Literal
        double c=3254196.587e-2; //Exponatial Floating Point Literal
        System.out.println(a);//32541.96587
        System.out.println(b);//32541.96587
        System.out.println(b);//32541.96587

        double x=32_5_41.96_5_87;
        //double x=32_5_41_._96_5_87;//error
        //double x=_12_55_81_5_45_;//error
        System.out.println(x);
    }
}