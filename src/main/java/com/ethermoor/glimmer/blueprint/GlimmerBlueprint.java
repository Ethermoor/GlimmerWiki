package com.ethermoor.glimmer.blueprint;

import com.ethermoor.validation.ValidationResult;
import org.json.simple.JSONObject;

public interface GlimmerBlueprint<T> {

    void createBuilder();

    void setBuilder(T builder);

    T getBuilder();

    ValidationResult validate() throws Exception;

    boolean isValid();

    JSONObject getJsonObject();

    String getFileName();
}
