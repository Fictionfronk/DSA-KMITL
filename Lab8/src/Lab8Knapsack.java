public class Lab8Knapsack {

    public static int Knapsack(int[] weight, int[] value, int limitWeight, int lenght) {
        if ((lenght == 0) || (limitWeight == 0)) return 0;
        if (weight[lenght - 1] > limitWeight) {
            return Knapsack(weight, value, limitWeight, lenght - 1);
        } else {
            int x = value[lenght - 1] + Knapsack(weight, value, limitWeight - weight[lenght - 1], lenght - 1);
            int y = Knapsack(weight, value, limitWeight, lenght - 1);
            return Math.max(x, y);
        }
    }

    public static void main(String[] args) {
        int[] wt = {1, 2, 3, 8, 7, 4};
        int[] val = {20, 5, 10, 50, 40, 25};
        int W = 10;
        System.out.println("Output: Knapsack value is " + Knapsack(wt, val, W, val.length));
    }
}
