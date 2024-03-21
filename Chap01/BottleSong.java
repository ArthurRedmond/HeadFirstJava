public class BottleSong {
    public static void main(String[] args) {
        int bottlesNum = 10;
        String word = "bottles";

        while (bottlesNum > 0) {
            if (bottlesNum == 1) {
                word = "bottle"; // singular, as in ONE bottle. }
            }

            System.out.println(bottlesNum + " " + word + " of beer on the wall");
            System.out.println(bottlesNum + " " + word + " of beer");
            System.out.println("And if one of the bottles should happen to fall,");
            bottlesNum--;

            if (bottlesNum > 0) {
                if (bottlesNum == 1) {
                    word = "bottle"; // singular, as in ONE bottle. }
                }
                System.out.println("There'll be " + bottlesNum + " " + word + " of beer on the wall");
            } else {
                System.out.println("There'll be no bottles of beer on the wall");
            }
        }
    }
}
