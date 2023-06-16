package Strings;

public class Stringbuilder {
    public static void main(String[] args){


//        String Builder

        StringBuilder s = new StringBuilder("Samarth");

//        System.out.println(s.charAt(1));

//        s.setCharAt(0,'R');
//        System.out.println(s);

//        s.insert(1,'a');
//        System.out.println(s);

//        s.delete(1,3);
//        System.out.println(s);

//        s.append(" Sakhare");
//        System.out.println(s);







//        Reverse a String

//        String s = "Samarth";
//        System.out.println("Original string is"+s);
//        String sr = " ";
//        for(int i=s.length()-1;i>=0;i--){
//            sr = sr + s.charAt(i);
//        }
//        System.out.println("Reversed string is"+ sr);




//        Reverse String approach y string builder

        StringBuilder sn = new StringBuilder("Samarth");
        System.out.println(sn);
        for(int i=0;i<sn.length()/2;i++){
            int front = i;
            int back = s.length()-1-i;

            char frontchar = sn.charAt(front);
            char backchar = sn.charAt(back);

            sn.setCharAt(back,frontchar);
            sn.setCharAt(front,backchar);
        }
        System.out.println(sn);
    }
}
