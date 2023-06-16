package BitManipulation;

public interface Get_Bit {
    public static void main(String[] args){
//        0101 == 5
        int n = 5;
        int pos=1;
        int bitmask = 1<<pos;

        if((bitmask & n)==0){
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was one");
        }
    }
}
