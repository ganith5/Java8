package com.java8.collections;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Pavithra Sachidananda on 11/12/17.
 */
public class Java7Test {

    public static void main(String[] args) {
        String[] statuses = new String[]{"NEW", "EXECUTE", "PENDING", "RUN"};
        String status = statuses[3];

        switch (status) {
            case "NEW" :
                System.out.print("New status");
                break;

            case "EXECUTE" :
                System.out.println("execute");
                break;

            default:
                System.out.print("default");

        }


        try(FileOutputStream fos = new FileOutputStream("file.txt");
            DataOutputStream dos = new DataOutputStream(fos)){

            dos.writeUTF("Java 7 enhanement");

        }catch ( IOException | RuntimeException ioe) {
            ioe.printStackTrace();
        }
    }
}
