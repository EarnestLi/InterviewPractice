public class CountSum {
    public static void main(String args[]){
        System.out.println(count_sum(new int[]{1,5,7,-1,5},6));
    }
    public static int count_sum(int[] array,int sum){

        int dupicate = array[0];
        for(int i=0;i<array.length;i++){
            //if()
        }
          //nt median=(array.length+1)/2;
        int[] a = new int[array.length];
        int count =0;
        for(int i =0;i<array.length;i++){
                a[i]=sum-array[i];
          }
        for(int i=0;i<array.length;i++){
            int j=0;
            while(array[i]!=a[j]&&array[i]!=0){
                j++;
            }
            if(array[i]==a[j]){
                count++;
                array[i]=0;
                array[j]=0;

            }
        }
        return  count;
    }
}
