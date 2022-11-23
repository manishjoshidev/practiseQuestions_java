class CountOdds {
    public static int count(int low, int high) {
        int sum=0;
        int start=low;
        if(start%2==0){
            start++;

        }
        while(start<=high){
            sum++;
            start+=2;
        }
        return sum;
    }
    public static void main(String[]args){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int count=count(m,n);
        System.out.println(count);
    }
}