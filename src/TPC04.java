public class TPC04 {

    public static void main(String[] args) {
        // 데이터를 이동하라 (변수 vs 배열)
        int a,b,c;
        a = 10;
        b = 20;
        c = 30;
        // a+b+c = ? 메서드에서 처리 -> hap()

        System.out.println(hap(a,b,c));

        int[] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;

        System.out.println(hap1(arr));
    }

    public static int hap(int a, int b, int c){
        return a+b+c;
    }

    public static int hap1(int[] arr){
        int sum = 0;
        for(int i = 0; i <arr.length; i++) sum += arr[i];
        return sum;
    }
    // 강의에서는 배열이 무조건 맞는 것 처럼 이야기하지만 배열로 넘겨줬다가 배열의 원본값이 바뀌는 등의 문제는 왜 생각하지 않는가?
}
