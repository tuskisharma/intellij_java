package Mynewpackage;
class leo{    // parent

    public int cal(int x, int y){
        int d=4;
        return x+y;
    }
}

class leo1 extends leo{
       //child
    //int sum=d+4;
    public int cal_adv(int x, int y){
        return x-y;
    }
}
class leo2 extends leo1{    // parent

    public int cals(int x, int y){
        return x*y;
    }
}
public class ben15 {
    public static void main(String[] args) {

    }
}
