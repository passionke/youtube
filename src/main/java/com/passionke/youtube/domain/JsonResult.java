package com.passionke.youtube.domain;

import lombok.Data;

/**
 * Created by passionke on 16/1/3.
 * wanliang@wacai.com
 */
@Data
public class JsonResult<T> {
    private boolean success = true;
    private String msg = "";
    private T data;
}
