public class Main {
    public static void main(String[] args) {
        int[] list={1,3,2,7,5,4,8,20,15};
        BubleSort.bubbleSort(list);
        for (int i=0;i<list.length;i++) {
            System.out.println(list[i] + "\n");
        }
    }
}
