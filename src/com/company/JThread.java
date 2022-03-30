package com.company;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JThread implements Runnable{

    Thread t;

    @Override
    public void run() {
        Path path = Paths.get("C:\\Users\\St.Freon\\Desktop\\some_log.log");
        String filter ="! Can't find texture";

                List<String> targetList;
                targetList = res.collect(Collectors.toList());

                byte[] buffer = (targetList.toString().getBytes());

                fos.write(buffer,0, buffer.length);

                fos.close();
            }

            catch(IOException e)
            {
                System.out.println(e.getMessage());
            }
            //fefefef
        }
        //afwefeafegiaaad
        catch (Exception e)
        {
            e.getMessage();
        }
    }
}
