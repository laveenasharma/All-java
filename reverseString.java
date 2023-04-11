public class reverseString {
    public static void main(String[] args) {
        String name="Sharma";
        char arr[]=name.toCharArray();
        String result="";
        // int len=arr.length;
        for(int x=arr.length-1;x>=0;x--){
            result+=arr[x];
        }
        System.out.println("Reverse string is: "+result);
    }
}
