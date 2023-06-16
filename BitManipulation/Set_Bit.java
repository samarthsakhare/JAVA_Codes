package BitManipulation;

public class Set_Bit {
    public static void main(String[] args){
//        0101 == 5
        int n = 5;
        int pos = 1;
        int bitmask = 1<<pos;
        int newNum = bitmask | n;
        System.out.println(newNum);
    }
}
