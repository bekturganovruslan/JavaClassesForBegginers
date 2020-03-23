import java.util.Random;

public class NumberUtils {

Random random=new Random();

public void ptintRandom(){
    System.out.println(random.nextInt(100));
}
public void prindRandomInt(int bound){

    System.out.println(random.nextInt(50));
}




    public void prinIntRange(int lower, int upper) {

        if (lower > upper) {
            System.out.println("Invalid range");
        } else {
            int result = random.nextInt(upper - lower) + lower;
            System.out.println(result);
        }
    }

    public int getMax(int num1, int num2, int num3){

    if(num1>=num2 && num1>num3){
        return num1;
    }else if(num2>num1 && num2>=num3){
        return num2;
    }else
        return num3;
    }

}


class MainTest{

    public static void main(String[] args) {
        NumberUtils nu=new  NumberUtils();
        nu.ptintRandom();
        nu.prindRandomInt(15);
        nu.prindRandomInt(-5);


    }


}
