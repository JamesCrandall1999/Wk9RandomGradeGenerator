package com.company.controllers;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GetStudentNames {
    private BufferedReader in;
    private String[] names;

    public GetStudentNames() {
        try {
            Path thePath = Paths.get("src/Names");
            in = new BufferedReader(new FileReader(String.valueOf(thePath)));
            List<String> lines = new ArrayList<>();


            String line = null;
            try {
                line = in.readLine();
                while (line != null) {
                    lines.add(line);
                    line = in.readLine();
                }

                in.close();
                names = lines.toArray(new String[lines.size()]);
            }catch(IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();


        }

    }
    public String[] getTheNames() {
        return names;
    }
}

