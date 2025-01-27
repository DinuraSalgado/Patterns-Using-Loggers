package org.example;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        logger.info("The program has displayed the patterns.");
        System.out.println("\n###################\n1 - Half Right Triangle \n2 - Inverted Half Left Triangle \n3 - Inverted Half Right Triangle \n4 - Left Right Triangle \n5 - Hollow Square \n###################");

        System.out.print("Choose a shape from the above: ");
        int option = sc.nextInt();
        logger.info("User selected a shape.");

        System.out.print("How many stars: ");
        int amount = sc.nextInt();
        logger.info("User selected the amount.");

        UserPicks(option, amount);
    }

    public static void UserPicks(int TheOption, int TheAmount) {
        switch (TheOption) {
            case 1:
                logger.debug("Calling the method HalfRightTriangle.");
                HalfRightTriangle(TheAmount);
                break;
            case 2:
                logger.debug("Calling the method InvertedHalfLeftTriangle.");
                InvertedHalfLeftTriangle(TheAmount);
                break;
            case 3:
                logger.debug("Calling the method InvertedHalfRightTriangle.");
                InvertedHalfRightTriangle(TheAmount);
                break;
            case 4:
                logger.debug("Calling the method LeftRightTriangle.");
                LeftRightTriangle(TheAmount);
                break;
            case 5:
                logger.debug("Calling the method HollowSquare.");
                HollowSquare(TheAmount);
                break;
            default:
                logger.warn("User has chosen the wrong option.");
                System.out.println("Invalid option.");
        }
        logger.info("Program ended.");
    }

    public static void HalfRightTriangle(int TheAmount) {
        logger.info("Generating half right triangle.");
        for (int i = 1; i <= TheAmount; ++i) {
            StringBuilder row = new StringBuilder();
            for (int j = 1; j <= i; ++j) {
                row.append("*");
            }
            logger.info(row.toString());
        }
    }

    public static void InvertedHalfLeftTriangle(int TheAmount) {
        logger.info("Generating inverted half left triangle.");
        for (int i = TheAmount; i >= 1; --i) {
            StringBuilder row = new StringBuilder();
            for (int j = 1; j <= i; ++j) {
                row.append("*");
            }
            logger.info(row.toString());
        }
    }

    public static void InvertedHalfRightTriangle(int TheAmount) {
        logger.info("Generating inverted half right triangle.");
        for (int i = TheAmount; i >= 1; --i) {
            StringBuilder row = new StringBuilder();
            for (int j = 1; j <= TheAmount - i; ++j) {
                row.append(" ");
            }
            for (int j = 1; j <= i; ++j) {
                row.append("*");
            }
            logger.info(row.toString());
        }
    }

    public static void LeftRightTriangle(int TheAmount) {
        logger.info("Generating left right triangle.");
        for (int i = 1; i <= TheAmount; ++i) {
            StringBuilder row = new StringBuilder();
            for (int j = 1; j <= TheAmount - i; ++j) {
                row.append(" ");
            }
            for (int j = 1; j <= i; ++j) {
                row.append("*");
            }
            logger.info(row.toString());
        }
    }

    public static void HollowSquare(int TheAmount) {
        logger.info("Generating hollow square.");
        for (int i = 0; i < TheAmount; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < TheAmount; j++) {
                if (i == 0 || i == TheAmount - 1 || j == 0 || j == TheAmount - 1) {
                    row.append("* ");
                } else {
                    row.append("  ");
                }
            }
            logger.info(row.toString());
        }
    }
}
