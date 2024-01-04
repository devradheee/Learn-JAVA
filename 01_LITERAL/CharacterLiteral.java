public class CharacterLiteral{
    static public void main(String [] s){
        char a='h';//Character Literal
        //char a='hi';//error
        char b=104;//ASCII code - Range[0-255]
        char c='\u0068';//UNI code - Range[0-65535]
        System.out.println(a);//h 
        System.out.println(b);//h
        System.out.println(c);//h

        //Most Imp ASCII code: 
        //'a' -> 97  , 'b' -> 98 and so on...
        //'A' -> 65  , 'B' -> 66 and so on...
        //'0' -> 48  , '1' -> 49 and so on...
        //' ' -> 32 
    }
} 