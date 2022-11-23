package com.example.springrestandsoapdemo.Exception;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

public class InvalideDataException extends WebApplicationException {
    public InvalideDataException() {
        super("invalid trade operation", Response.Status.NOT_ACCEPTABLE);
    }
}