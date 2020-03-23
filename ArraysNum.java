import java.util.Arrays;

public class ArraysNum {


    public static int[] ArraysNums(int[] nums){
        Arrays.sort(nums);
        int[] result=new int[3];
        result[0]=nums[nums.length - 1];
        result[1]=nums[0];


        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
        }
        int averageNum=sum/nums.length;
        result[2]=averageNum;

        return result;
    }

    public static void main(String[] args) {
    int[] nums=new int[]{12,4,5,8,1,7};

        System.out.println(Arrays.toString(ArraysNums(nums)));
    }


}
