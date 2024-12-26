package org.sid;

import java.io.*;
import java.util.zip.ZipInputStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream is = new BufferedInputStream(new BufferedInputStream(new ZipInputStream(new ZipInputStream(new FileInputStream(new File("dec.zip"))))));
        System.out.println("--------------------------");

    }
}