package lecture.heap;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxHeap {

    public static class MaximumHeap {

        private ArrayList<Integer> heap;

        public MaximumHeap() {
            heap = new ArrayList<>();
            heap.add(1000000);
        }

        public void insert(int val) {
            heap.add(val);
            int p = heap.size()-1;

            while (p > 1 && heap.get(p / 2) < heap.get(p)) {
                System.out.println("swap");
                int temp = heap.get(p / 2);
                heap.set(p / 2, heap.get(p));
                heap.set(p, temp);

                p = p / 2;
            }
        }

        public int delete() {

            if (heap.size() - 1 < 1) {
                return 0;
            }

            int deletedItem = heap.get(1);

            heap.set(1, heap.get(heap.size() - 1));
            heap.remove(heap.size() - 1);

            int pos = 1;
            while ((pos * 2) < heap.size()) {

                int max = heap.get(pos * 2);
                int maxPos = pos * 2;

                if (((pos * 2 + 1) < heap.size()) && max < heap.get(pos * 2 + 1)) {
                    max = heap.get(pos * 2 + 1);
                    maxPos = pos * 2 + 1;
                }

                if (heap.get(pos) > max) {
                    break;
                }

                int temp = heap.get(pos);
                heap.set(pos, heap.get(maxPos));
                heap.set(maxPos, temp);
                pos = maxPos;
            }
            return deletedItem;
        }

    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        MaximumHeap maximumHeap = new MaximumHeap();

        for (int i = 0; i < N; i++) {
            int val = sc.nextInt();

            if (val == 0) {
                System.out.println(maximumHeap.delete());
            } else {
                maximumHeap.insert(val);
            }
        }
    }
}
