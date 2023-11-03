public class Solution605 {
  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    int plantCount = 0;

    // if flowerbed is length 1 and is a 0, we can place
    if (flowerbed.length == 1 && flowerbed[0] == 0) {
      plantCount++;
    }

    // flowerbed start and end can have a plant placed
    if (flowerbed.length > 1 && flowerbed[0] == 0 && flowerbed[1] == 0) {
      plantCount++;
      flowerbed[0] = 1;
    }
    if (flowerbed.length > 1 && flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
      plantCount++;
      flowerbed[flowerbed.length - 1] = 1;
    }

    // rest of flowerbed can have plant placed
    for (int i = 1; i < flowerbed.length - 1; i++) {
      if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
        plantCount++;
        flowerbed[i] = 1;
      }
    }

    return plantCount >= n;
  }
}
