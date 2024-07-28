public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4,5,6,7,8};
        int target = 9;
        long start=System.nanoTime();
        int result = binarysearch(arr, target);
        long end=System.nanoTime();
        System.out.println("Element is present at index " + result);
        System.out.println("Execution Time: " + (end-start) + "ns");
        



    
}
static int binarysearch(int arr[],int target){

    int s=0;
    int e=arr.length-1;

    while(s<=e){
        int mid = s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }else if(arr[mid]>target){
            e=mid-1;
            }else{
                s=mid+1;
                }
                }
            return -1;
    }
}
