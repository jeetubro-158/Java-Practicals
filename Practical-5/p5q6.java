public class p5q6 {
    public static void main(String[] args) {
        String inputStr[]={"A", "THING", "OF", "BEAUTY", "IS", "JOY", "FOREVER"};
        String str="";
        for(int i=0; i<inputStr.length; i++) {
            str=str+String.join(",", inputStr[i] + " ");
        }
        System.out.println(str);
    }
}
