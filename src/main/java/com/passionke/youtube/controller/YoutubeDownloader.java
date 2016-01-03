package com.passionke.youtube.controller;

import com.passionke.youtube.core.ShellRunner;
import com.passionke.youtube.domain.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created by passionke on 16/1/3.
 * wanliang@wacai.com
 */
@RestController
@RequestMapping(value = "/youtube")
@Slf4j
public class YoutubeDownloader {

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public JsonResult<String> download(@RequestBody String youtubeURL) {
        log.info("recive request to download youtube URL {}", youtubeURL);
        String command = "/data/program/youtube-dl -o '/root/youtube/%(title)s.%(ext)s' --exec 'bypy upload ' " + youtubeURL;
        log.info("command {}", command);
        try {
            ShellRunner.run(command);
        } catch (IOException e) {
            log.error("opps, {}", e);
        } catch (InterruptedException e) {
            log.error("opps, {}", e);
        }
        return new JsonResult<String>();
    }

}
