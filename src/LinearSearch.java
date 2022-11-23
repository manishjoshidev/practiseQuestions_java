import org.jetbrains.annotations.NotNull;

public class LinearSearch {
    public static void LinearSearch(@NotNull int arr[], int item){
        for(int i = 0;i< arr.length; i++)
        {
            if(arr[i]==item)
                System.out.println("item found at index"+ i);

        }
    }
    public static void main(String[] args) {
        int arr[]={2,5,7,8,9};
        int item=7;
        LinearSearch(arr,item);
    }
}
