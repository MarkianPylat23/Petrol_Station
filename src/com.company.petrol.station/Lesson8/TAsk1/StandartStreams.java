package com.company.petrol.station.Lesson8.TAsk1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandartStreams {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in  = new FileInputStream("/home/markian/IdeaProjects/LITS/src/resources/inputC.txt");
            out = new FileOutputStream("/home/markian/IdeaProjects/LITS/src/resources/outputC.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }finally{
            if (in != null){
                in.close();
            }
            if (out != null){
                out.close();
            }
        }
    }
}
