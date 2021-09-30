package com.company;


import java.util.logging.Level;
import java.util.logging.Logger;





public class Main {

    public static void logging() {
        Logger log = Logger.getLogger("com.javamentor.logging.Test");
        log.log(Level.INFO, "Все хорошо");
        log.log(Level.WARNING, "Произошла ошибка");
    }

}