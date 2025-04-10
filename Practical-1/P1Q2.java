
public class P1Q2 {
    public static void main(String[] args) {
        int arr[]=new int[args.length];
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        for(int i=0; i<args.length; i++) {
            arr[i]=Integer.parseInt(args[i]);
            System.out.println(arr[i]);
            max = max > arr[i] ? max : arr[i];
            min = min < arr[i] ? min : arr[i];
        }
        System.out.println("Largest Element : " + max);
        System.out.println("smallest Element : " + min);
    }
}
