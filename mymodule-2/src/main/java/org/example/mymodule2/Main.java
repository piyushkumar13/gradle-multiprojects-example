package org.example.mymodule2;

import org.apache.commons.lang3.StringUtils;
import org.example.mymodule3.Utils;

/**
 * @author Piyush Kumar.
 * @since 27/01/24.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String name = Utils.lowerCaseString("Piyush Kumar");

        System.out.println("The lowercase name is ::: " + name);

        String capitalizedName = StringUtils.capitalize(name);

        System.out.println("The capitalized name is ::: " + capitalizedName);
    }
}