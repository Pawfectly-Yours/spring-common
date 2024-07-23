package com.pawfectly.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiResultModel {

    private Boolean isSuccess;

    private String message;

    private Object resultData;

    private Map<String, String> errorMessages;

}
