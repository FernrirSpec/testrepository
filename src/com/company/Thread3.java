package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Thread3 implements Runnable{



    @Override
    public void run() {

        try(FileInputStream fs = new FileInputStream("D:\\programming\\one.txt"))
        {


        }

        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
