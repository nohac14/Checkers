public class FormatTest {
    public static void main(String[] args) {
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String BLACK ="\033[30m";
        String YELLOW = "\u001B[33m";
        String BLACK_BG = "\u001B[40m";
        String WHITE_BG = "\u001B[47m";
        String GREY_BG = "\u001B[85m";
        System.out.print("  "); // Line up top numbers with each columns
        for (int i = 1 ; i < 9 ; i++) {
            System.out.print(i + " "); // Top numbers
        }
        System.out.println();

        for (int i = 0; i < 8; i++) {
            System.out.print(i+1 + " ");
            if (i != 1 && i != 6) {        
                for (int j = 0; j < 8; j++) {
                        if (j % 2 != 0 || (i > 2 && i < 5))
                            System.out.print(YELLOW + WHITE_BG + "  " + RESET); // Empty space
                        else if (j % 2 == 0 && i < 3)
                            System.out.print(RED + BLACK_BG + "R " + RESET);
                        else
                            System.out.print(BLACK + GREY_BG + "B " + RESET);
                    }
            }
            else {
                for (int j = 1; j < 9; j++) {
                    if (j % 2 == 0 && (i >=3 && i <=4)) {
                        System.out.print(BLACK_BG + "  " + RESET); // Empty space
                    }
                    else if (j % 2 != 0 || (i > 2 && i < 5)) {   
                        System.out.print(WHITE_BG + "  " + RESET); // Empty space
                    }
                    else if (j % 2 == 0 && i < 3)
                        System.out.print(RED + BLACK_BG + "R " + RESET);
                    else
                        System.out.print(BLACK + GREY_BG + "B " + RESET);
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}
