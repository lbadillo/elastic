package com.elasticsample.app.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorDTO {
    private int code;
    private String description;
}
