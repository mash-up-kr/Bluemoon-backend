package org.mashup.bluemoon.model;

import lombok.Data;

import java.util.List;

@Data
public class ApiResponseModel<T> {

    private int code;
    private String msg;
    private List<T> result;
}
