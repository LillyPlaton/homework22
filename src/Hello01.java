public class Hello01 {

  public static void main(String[] args) {

    int[] arr = {1, 4, 6, 9, 15};
    int value = 9;

    int low = 0;
    int high = arr.length;
    int index = -1;

    while (low <= high) {
      int mid = low + ((high - low) / 2);
      if (arr[mid] == value) {
        index = mid;
        break;
      } else if (arr[mid] < value) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    System.out.println(index);
  }

}


