package studio.aroundhub.codeground.lecture.indexed_tree;

import java.util.Arrays;

/**
 * Priority Queue
 * thinkground.studio
 * YouTube : Around Hub Studio
 * @author Flature
 */
public class IndexedTree {
    int[] nodes;
    int[] num;
    int depth;
    int leafCount;

    public IndexedTree(int[] num) {
        this.num = num;
        int len = num.length - 1;
        this.depth = 0;
        while (len != 0) {
            len /= 2;
            this.depth++;
        }
        this.leafCount = (int) Math.pow(2, this.depth - 1);
        this.nodes = new int[(int) Math.pow(2, this.depth)];
    }

    @Override
    public String toString() {
        return "IndexedTree {" +
                "nodes=" + Arrays.toString(nodes) +
                ", num=" + Arrays.toString(num) +
                ", depth=" + depth +
                ", leafCount=" + leafCount +
                '}';
    }

    public void makeTree() {
        makeSubTree(1, 1, leafCount);
    }

    public int makeSubTree(int node, int left, int right) {
        if (left == right) {
            if (left < num.length) {
                return nodes[node] = num[left];
            } else {
                return nodes[node] = 0;
            }
        }
        int mid = (left + right) / 2;
        nodes[node] = makeSubTree(node * 2, left, mid);
        System.out.println(toString());
        nodes[node] += makeSubTree(node * 2 + 1, mid + 1, right);
        System.out.println(toString());
        return nodes[node];
    }

    public int getPartialSum(int targetLeft, int targetRight) {
        return target(1, 1, leafCount, targetLeft, targetRight);
    }

    private int target(int node, int left, int right, int targetLeft, int targetRight) {
        // target 구간이랑 아에 관련이 없는 경우
        if (left > targetRight || right < targetLeft) {
            return 0;
        }
        // target 구간을 포함하고 있는 경우
        if (targetLeft <= left && right <= targetRight) {
            return nodes[node];
        }

        int mid = (left + right) / 2;
        return target(node * 2, left, mid, targetLeft, targetRight)
                + target(node * 2 + 1, mid + 1, right, targetLeft, targetRight);
    }

    public void update(int targetIndex, int targetValue) {
        subUpdate(1, 1, leafCount, targetIndex, targetValue - num[targetIndex]);
        num[targetIndex] = targetValue;
    }

    public void subUpdate(int node, int left, int right, int targeted, int diff) {
        // 해당 부분합이 targetIndex 에 포함될 때
        if (targeted >= left && targeted <= right) {
            nodes[node] += diff;
            if (left == right) {
                return;
            }
        } else {
            return;
        }
        int mid = (left + right) / 2;
        subUpdate(node * 2, left, mid, targeted, diff);
        subUpdate(node * 2 + 1, mid + 1, right, targeted, diff);
    }

    public static void main(String[] args) {
        int[] number = {0, 4, 5, 1, 2, 9, 10, 15, 25};
        System.out.println(Arrays.toString(number));
        IndexedTree indexedTree = new IndexedTree(number);
        System.out.println("## Before Making Tree ##");
        System.out.println(indexedTree.toString());

        indexedTree.makeTree();
        System.out.println("## After Making Tree ##");
        System.out.println(indexedTree.toString());
        System.out.println(2 + "~" + 5 + " Sum ?");
        System.out.println(indexedTree.getPartialSum(2, 5));
        System.out.println(1 + "~" + 6 + " Sum ?");
        System.out.println(indexedTree.getPartialSum(1, 6));
        indexedTree.update(3, 0);
        System.out.println("## Update :: 'Index 3' value's changed => 1 -> 0 ##");
        System.out.println(indexedTree.toString());
    }

}
