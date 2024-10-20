package studio.aroundhub.codeground.lecture.binary_search;

public class BinarySearch {

  static int[] arr;
  static int ans;

  public static void main(String[] args) {

    arr = new int[] {5, 7, 9, 15, 20, 38, 39, 52, 58, 77};

    binarySearch(58);

    System.out.println("count : " + ans);
  }

  private static void binarySearch(int goal) {
    int left = 0;
    int right = arr.length - 1;

    while (right >= left) {

      int mid = (left + right) / 2;
      ans++;

      if (goal == arr[mid]) {
        System.out.println("Find!!");
        break;
      } else if (goal < arr[mid]) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
  }
}
