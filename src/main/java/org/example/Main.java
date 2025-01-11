package org.example;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {




//        int[] nums = new int[] {2,4,3,6,5};
//        SelectionSort(nums);
//        System.out.println(Arrays.toString(nums));
//        int result = Integer.MAX_VALUE;
//        System.out.println(result);
//        String str = "abcd";
//        Stack<Character> stack = new Stack<Character>();
//        char[] charArray = str.toCharArray();
//        for (char c : charArray) {
//            stack.push(c);
//        }
//        StringBuffer  revers = new StringBuffer();
//        while (!stack.isEmpty()) {
//            revers.append(stack.pop());
//        }
//        System.out.println(revers);


//        Map<String,Integer>  gemostric = new HashMap<>();
//
//        gemostric.put("square", 1);
//        gemostric.put("circle", 2);
//        gemostric.put("rectangle", 3);
//        for ( int i= 0 ;i < gemostric.size(); i++){
//            Set<Map.Entry<String,Integer>> entries = gemostric.entrySet();
//            for (Map.Entry<String,Integer> entry : entries){
//                String key = entry.getKey();
//                Integer value = entry.getValue();
//                System.out.println(key+":"+value);
//            }
//        }
    }
    public static void quickSort(int[] nums, int low, int high){
        if (low < high){
            int pivot = partition(nums,low,high);
            quickSort(nums,low,pivot -1);
            quickSort(nums,pivot + 1,high);
        }


    }
    private static int partition(int[] nums, int low, int high){
        int pre = nums[high];
        int i = low  -1;
        for (int j  = low ;j <= high-1 ; j++){
            if(nums[j] < pre){
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i + 1, high);
        return i+1;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void SelectionSort(int[] arr){
        if(arr.length > 2){
            int i = 0;
            while (i + 1 < arr.length){
                if(arr[i] > arr[i + 1]){  // 3,2 // 2,2
                    swap(arr, i, i + 1);
                }
                i++;
            }
        }
    }
    public static int Sum(int[] num){
        if(num.length == 0){
            return 0;
        }
        return num[num.length -1] + Sum( Arrays.copyOf(num, num.length -1));
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }

        }
        return nums;
    }

    public  static int removeElement(int[] nums, int val) {
        int count = 0; // 3,2,2,3,2
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) { //
                nums[count] = nums[i];
                count++;
            }

        }
        return  count;
    }
    public static void bob(int[] numbers){
        while (sort(numbers) == false){
            sort(numbers);
        }
    }
    private static boolean sort(int[] numbers){
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[i]<numbers[j]){
                    swap(numbers, i, j);
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isPalindrome(int x) {
        char[] charX =  String.valueOf(x).toCharArray();
        for (int i = 0; i < charX.length; i++) {
            if(charX[i] != charX[charX.length - 1 - i]){
                return false;
            };
        }
        return true;
    }
    public static  int sumFloatNumber(double num){
        int sum = 0;
        double abs = Math.abs(num);
        String numStr = String.valueOf(num);
        for(char numChar : numStr.toCharArray()){
            if(numChar != '.'){
                sum += numChar - '0';
            }
        }
        System.out.println(sum);
        return sum;
    }



 // medium
    public static int[] check(int[] l1, int[] l2){ // [2,4,3] revers => [3,4,2] => 342
       StringBuilder number1 = new StringBuilder();
        StringBuilder number2 = new StringBuilder();


        forRevers(l1, number1);
        forRevers(l2, number2);

        int Plus = Integer.parseInt(number1.toString()) + Integer.parseInt(number2.toString()); // 807

        String resultS = String.valueOf(Plus); // "807"
        char[] charArrayResult = resultS.toCharArray(); // ["8","7","0"]
         String number = String.valueOf(charArrayResult); // "870"
        int numberInt = Integer.parseInt(number);  // 870

        return Int_to_array(numberInt); // [0,7,8]
    }

    private static int[] Int_to_array(int n) {
        int i = 0;
        int len = Integer.toString(n).length();
        int[] arr = new int[len];
        while(n!=0) {
            arr[i] = n%10;
            n=n/10;
            i++;
        }
        return arr;
    }

    private static void forRevers(int[] numbs, StringBuilder number1) {
        for (int i = numbs.length -1; i >= 0; i--) {
            number1.append(numbs[i]);
        }
    }

    public static int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }
}