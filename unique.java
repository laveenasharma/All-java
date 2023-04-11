public class unique {
    public static void main(String[] args) {
        String sentence="As tall as tree";
        char arr[]=sentence.toCharArray();
       String UniqueAns="";
        // String uniqueChar="";
        // 
        for(var i=0;i<arr.length;i++){
            if(UniqueAns.indexOf(arr[i])==-1)
            UniqueAns= UniqueAns+arr[i];
         }
         System.out.println(UniqueAns);
    }
}
