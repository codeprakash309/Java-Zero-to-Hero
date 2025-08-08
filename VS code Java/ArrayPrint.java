 class ArrayPrint {
public static void main(String[] args) {
    int[] arr={10,22,5,78,11,35,45};
    System.out.println("before sorting Array are");
    for(int i:arr){
        System.out.print(i+" ");
    }
    System.out.println("after sorting array are");
    for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j<arr.length;j++){
            int temp=0;
            if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
    }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
}    
}
