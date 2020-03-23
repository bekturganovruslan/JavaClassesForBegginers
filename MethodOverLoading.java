public class MethodOverLoading {

    public static void myMethod(String name) {
        System.out.println("Method with String method");
    }

    public static void myMethod(int num) {
        System.out.println("method with int parameter");
    }

    public static void myMethod(short num) {
        System.out.println("method with int short");
    }

    public static boolean myMethod(boolean value){
        System.out.println("method with int boolean");
        return false;
    }



    }


class Main{

    public static void main(String[] args) {
        MethodOverLoading mt=new MethodOverLoading();
        mt.myMethod("David");
        mt.myMethod(6);
        mt.myMethod(true);
    }

}
