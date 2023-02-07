package ru.netology.sqr;

public class SQRService {

    public int sQRWithinBorders(int bottomBorder, int topBorder) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int sqri = i * i;
            if (sqri >= bottomBorder) {
                if (sqri <= topBorder) {
                    counter++;
                }
            }
        }
        return counter;
    }

}
