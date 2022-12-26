package task1;

public class Burger extends task1.Food implements Nitritious {
    private String size;

    private static int numSmall = 0;
    private static int numMedium = 0;
    private static int numBig = 0;

    private static int Allcalories = 0;

    private int colariesProduct;
    private final int calories = 200;

    task1.Food food = new task1.Food() {
        @Override
        public int calculateCalories() {
            return 0;
        }
    };

    public Burger(String size) {
        this.size = size;
        if (size.equals("Большой")) {
            numBig++;
            System.out.println("Большой бургер " + numBig);
            System.out.println();
        } else if (size.equals("Средний")) {
            numMedium++;
            System.out.println("Средний бургер " + numMedium);
            System.out.println();
        } else if (size.equals("Маленький")) {
            numSmall++;
            System.out.println("Маленький бургер " + numSmall);
            System.out.println();
        }
    }

    public static int getAllcalories() {
        return Allcalories;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCalories() {
        return calories;
    }

    public static int coloriesNumber(String size) {
        int diff = 0;
        if (size.equals("Большой")) {
            diff = 3;
        } else if (size.equals("Средний")) {
            diff = 2;
        } else if (size.equals("Маленький")) {
            diff = 1;
        } else {
            System.out.println("Такого размера нет");
        }
        return diff;
    }

    @Override
    public int calculateCalories() {
        this.colariesProduct = getCalories() * coloriesNumber(getSize());
        return this.colariesProduct;
    }

    public void allCalories(String size) {
        Allcalories += getCalories() * coloriesNumber(getSize());
    }
}
