package lecture.heap;

import java.util.ArrayList;
import java.util.Scanner;

public class MinHeap {

    public static class MinimumHeap {

        private ArrayList<Integer> heap;

        public MinimumHeap() {
            heap = new ArrayList<>();
            heap.add(0);
        }

        public void insert(int val) {
            heap.add(val);
            int p = heap.size()-1;

            while (p > 1 && heap.get(p / 2) > heap.get(p)) {
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

                int min = heap.get(pos * 2);
                int minPos = pos * 2;

                if (((pos * 2 + 1) < heap.size()) && min > heap.get(pos * 2 + 1)) {
                    min = heap.get(pos * 2 + 1);
                    minPos = pos * 2 + 1;
                }

                if (heap.get(pos) < min) {
                    break;
                }

                int temp = heap.get(pos);
                heap.set(pos, heap.get(minPos));
                heap.set(minPos, temp);
                pos = minPos;
            }
            return deletedItem;
        }

    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        MinimumHeap minimumHeap = new MinimumHeap();

        for (int i = 0; i < N; i++) {
            int val = sc.nextInt();

            if (val == 0) {
                System.out.println(minimumHeap.delete());
            } else {
                minimumHeap.insert(val);
            }
        }
    }
}
