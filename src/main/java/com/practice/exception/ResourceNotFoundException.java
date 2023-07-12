package com.practice.exception;

public class ResourceNotFoundException extends  RuntimeException {

    public ResourceNotFoundException(){
        super("Resource Not Found On Server !!");
    }

    public ResourceNotFoundException(String message){
        super(message);
    }

}
