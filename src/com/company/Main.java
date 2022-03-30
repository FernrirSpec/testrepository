package com.company;

import com.sun.jdi.Method;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        JThread t2 = new JThread();
        t2.run();

        TrainThread2 t =new TrainThread2();
        t.run();

    }
}


