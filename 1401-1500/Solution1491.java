public class Solution1491 {
  public double average(int[] salary) {

    // variables to store min and max
    int min = salary[0];
    int max = 0;

    // find max and min
    for (int i = 0; i < salary.length; i++) {

      if (salary[i] > max) {
        max = salary[i];
      }

      if (salary[i] < min) {
        min = salary[i];
      }

    }

    double sum = 0;
    double count = 0;
    for (int i = 0; i < salary.length; i++) {
      if (salary[i] != min && salary[i] != max) {
        sum += salary[i];
        count++;
      }
    }

    return sum / count;
  }
}
