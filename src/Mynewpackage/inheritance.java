package Mynewpackage;
class ed{
    public void cal(){
        int x; int y;

    }

    // parent
}

class ed1 extends ed{      //child
    public int cal_adv(int x,int y){
        return x-y;
    }
    public int cal1(int x,int y){
        return x*y;
    }
    public int cal2(int x,int y){
        return x+y;
    }
    public int cal3(int x,int y){
        return x/y;
    }
}
public class inheritance{
    public static void main(String[] args) {
            ed1 a=new ed1();
        System.out.println("enter number");// object of child
            System.out.println(a.cal_adv(5,3));
        }
    }



