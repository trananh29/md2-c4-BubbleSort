public class BubleSort {
    static int[] list={1,3,2,7,5,4,8,20,15};
    public static void bubbleSort(int[] list) {
        boolean need=true;
        for (int i=1; i< list.length && need;i++) {
            need=false;
            for (int j=0; j< list.length-i;j++) {
                if (list[j+1]<list[j]) {
                    int temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                    need=true;
                }
            }
        }
    }
}
