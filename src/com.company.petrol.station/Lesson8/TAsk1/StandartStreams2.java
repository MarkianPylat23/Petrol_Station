package com.company.petrol.station.Lesson8.TAsk1;

import java.io.*;


public class StandartStreams2 {
    public static void main(String[] args) throws IOException{
        FileReader in = null;
        FileWriter out = null;

        try {
            in  = new FileReader("/home/markian/IdeaProjects/LITS/src/resources/inputB.txt");
            out = new FileWriter("/home/markian/IdeaProjects/LITS/src/resources/outputB.txt");

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
