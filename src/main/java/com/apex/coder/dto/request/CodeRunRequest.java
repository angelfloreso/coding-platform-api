package com.apex.coder.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CodeRunRequest {
    String code;
    long case_id;
    String session_id;
    String input_values;
}
