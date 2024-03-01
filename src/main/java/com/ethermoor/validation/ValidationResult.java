package com.ethermoor.validation;

import java.util.List;

public interface ValidationResult {

    public String getMessage();
    public List<String> getErrors();

    public ValidationResultCode getCode();

    boolean failed();
    boolean passed();

    public static enum ValidationResultCode {
       SUCCESS, FAILED
   }

}
