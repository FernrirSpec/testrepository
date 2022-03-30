package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TrainThread2 implements Runnable {


    Thread t;

    @Override
    public void run() {
        String filterSound = "! Can't find sound";
        Path path = Paths.get("C:\\Users\\St.Freon\\Desktop\\some_log.log");

        try(
                Stream<String> soundsStream =  Files.lines(path))
        {
            Stream<String> soundRes = soundsStream.filter(s -> s.contains(filterSound))
                    .map(s -> s.substring(33,s.length()-1));
            List<String> stringRes;
            stringRes = soundRes.collect(Collectors.toList());
           try(FileOutputStream fos = new FileOutputStream("D:\\programming\\output.txt",true))
            {
                byte[] bufferSound = stringRes.toString().getBytes();
                fos.write(bufferSound,0, bufferSound.length);
                fos.close();
            }
            catch (IOException e)
            {
                e.getMessage();
            }
        }
        catch (IOException e)
        {
            e.getMessage();
        }
    }
}
