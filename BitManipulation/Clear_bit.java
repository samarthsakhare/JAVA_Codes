package BitManipulation;

public class Clear_bit {
    public static void main(String[] args){
//        0101 == 5
        int n = 5;
        int pos = 2;
        int bitmask = 1<<pos;
        int newNum = n & (~(bitmask));
        System.out.println(newNum);
    }
}
