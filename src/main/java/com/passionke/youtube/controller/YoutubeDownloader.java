package com.passionke.youtube.controller;

import com.passionke.youtube.config.CommanderConfig;
import com.passionke.youtube.core.ShellRunner;
import com.passionke.youtube.domain.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * Created by passionke on 16/1/3.
 * wanliang@wacai.com
 */
@RestController
@RequestMapping(value = "/youtube")
@Slf4j
public class YoutubeDownloader {

    @Autowired
    private CommanderConfig commanderConfig;
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public JsonResult<String> download(@RequestBody String youtubeURL) throws UnsupportedEncodingException {
        String url = URLDecoder.decode(youtubeURL, "utf-8");
        log.info("recive request to download youtube URL {}", url);
        String command = commanderConfig.getTemplate().trim() + " " + url;
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
