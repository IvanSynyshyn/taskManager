package com.synyshyn.taskManager;

/**
 * Created by Ivan Synyshyn on 05.12.2016.
 */
public class DaoTest {
    public double count (double ... x) {
        System.out.println("Dao layer works");
        double result = 0.0;
        for (double y : x) {
            result = result + y;
        }
        return result;
    }
}
