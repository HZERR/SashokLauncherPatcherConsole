package ru.hzerr.util;

import ru.hzerr.GradleOptions;
import ru.hzerr.Helper;

import java.io.IOException;

public class Starter {

    public static void main(String[] args) throws IOException, InterruptedException { startup(Helper.parse(args)); }

    public static void startup(GradleOptions options) throws IOException, InterruptedException {
        String command = "cd " + options.folderFullName + " & java -jar " + options.projectTestName;
        System.out.println("Start command: " + command);
        Helper.startNewProcessBuilderWithCmdExe(command);
    }
}
