package Arrays;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int [] flowerbed = {1,0,0,0,1};
        System.out.println(canPlaceFlowers(flowerbed, 2));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0)
            return true;
        if (flowerbed.length == 1)
            return flowerbed[0] == 0;

        int [] betterBed = new int [flowerbed.length + 2];
        betterBed[0] = 0;
        betterBed[betterBed.length - 1] = 0;
        for (int i = 1; i <= flowerbed.length; i++) {
            betterBed[i] = flowerbed[i - 1];
        }
        int canPlant = 0;
//        int consZeroes = 0;
        for (int i = 1; i < betterBed.length - 1; i++) {
            if (betterBed[i - 1] == 1 || betterBed[i] == 1 || betterBed[i + 1] == 1) {
                continue; // CONTINUE NOT BREAK!!!!!!!
            }
            canPlant++;
            betterBed[i] = 1;
        }
        return  canPlant >= n;
    }
}
