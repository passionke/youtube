package com.passionke.youtube.core;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;

/**
 * Created by passionke on 15/12/6.
 * wanliang@wacai.com
 */
@Slf4j
public class ShellRunner {

    public static int run(String command) throws IOException, InterruptedException {
        Process process = Runtime.getRuntime().exec(command);
        process.
        BufferedReader input = new BufferedReader(
                new InputStreamReader(
                        new SequenceInputStream(process.getErrorStream(),
                                process.getInputStream())
                )
        );
        String line;
        while ((line = input.readLine()) != null) {
            log.error(line);
        }
        input.close();
        int exitValue = process.waitFor();
        if (0 != exitValue) {
            log.error("call shell failed. error code is :" + exitValue);
        }
        return exitValue;
    }
}
