package ru.hzerr.util;

import ru.hzerr.GradleOptions;
import ru.hzerr.Helper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class JFoenixAppender {

    public static void main(String[] args) throws IOException, InterruptedException { addJFoenixLibrary(Helper.parse(args)); }

    public static void addJFoenixLibrary(GradleOptions options) throws IOException, InterruptedException {
        File jfoenix8 = new File(options.folderFullName + File.separator + "jfoenix-8.0.10.jar");
        Files.copy(JFoenixAppender.class.getResourceAsStream("/jfoenix-8.0.10.jar"), jfoenix8.toPath(), StandardCopyOption.REPLACE_EXISTING);
        String command = "cd " + options.folderFullName + " & jar xf jfoenix-8.0.10.jar";
        System.out.println("Unpack command: " + command);
        printUnpackedResult(Helper.startNewProcessBuilderWithCmdExe(command));
        command = "cd " + options.folderFullName + " & jar uf " + options.projectTestName + " com";
        System.out.println("Update command: " + command);
        printAddLibraryResult(Helper.startNewProcessBuilderWithCmdExe(command));
        jfoenix8.deleteOnExit();
    }

    private static void printAddLibraryResult(int exitCode) {
        if (exitCode == 0) System.out.println("The \"JFoenix\" library was successfully added to the project");
        else System.err.println("The \"JFoenix\" library was added to the project in error");
    }

    private static void printUnpackedResult(int exitCode) {
        if (exitCode == 0) System.out.println("The \"JFoenix\" library was successfully unpacked");
        else System.err.println("The \"JFoenix\" library unpacked with an error");
    }
}