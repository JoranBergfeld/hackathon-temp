package com.schiphol;


import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;

@io.quarkus.runtime.annotations.QuarkusMain
public class QuarkusMainApplication {

    public static void main(String... args) {
        Quarkus.run(MyApp.class, args);
    }

    public static class MyApp implements QuarkusApplication {

        @Override
        public int run(String... args) throws Exception {
            System.out.println("Do startup logic here");
            Quarkus.waitForExit();
            return 0;
        }
    }
}
