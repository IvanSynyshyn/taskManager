package com.synyshyn.taskManager;

import com.synyshyn.taskManager.DaoTest;

/**
 * Created by Ivan Synyshyn on 05.12.2016.
 */
public class ServiceTest {
    public double count (double ... x) {
        System.out.println("Service layer works");
        return new DaoTest().count(x);
    }
}
