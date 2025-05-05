// com/workintech/s18d1/util/BurgerValidation.java
package com.workintech.s18d1.util;

import com.workintech.s18d1.entity.Burger;
import com.workintech.s18d1.exceptions.BurgerException;
import org.springframework.http.HttpStatus;

public class BurgerValidation {
    public static void checkBurger(Burger burger) {
        if (burger == null) {
            throw new BurgerException("Burger cannot be null", HttpStatus.BAD_REQUEST);
        }
        if (burger.getName() == null || burger.getName().isEmpty()) {
            throw new BurgerException("Burger name cannot be empty", HttpStatus.BAD_REQUEST);
        }
    }
}
