package algorithm;

/**
 * Created by zcg on 2017/6/5.
 */
public class Merge {


    public static void merge(int[] list, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = 0;
        int[] temp = new int[high - low + 1];
        while (i <= mid && j <= high) {
            if (list[i] < list[j]) {
                temp[k++] = list[i++];
            } else {
                temp[k++] = list[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = list[i++];
        }

        while (j <= high) {
            temp[k++] = list[j++];
        }
        k = 0;
        for (i = low; i <= high; i++) {
            list[i] = temp[k++];
        }
    }

    public static void mergeSort(int List[], int low, int high) {
        //二路归并排序，分为二路
        int mid = (low + high) / 2;
        //终止条件，low >= high， 不是while，且不含等号，否则死循环
        if (low < high) {
            //递归过程，二路归并排序递归过程
            mergeSort(List, low, mid);
            mergeSort(List, mid + 1, high);
            //归并
            merge(List, low, mid, high);
        }
    }

    public static void main(String[] args) {
        int[] source = new int[]{23, 41, 12, 31, 76, 11, 2, 64, 88, 35};
        mergeSort(source, 0, source.length-1);
        for (int i = 0; i < source.length; i++) {
            System.out.printf(" %d  ", source[i]);
        }
    }
}
