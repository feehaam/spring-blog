package com.feeham.blog.exceptions;

public class DTO_ConversionException extends CustomException {
    public DTO_ConversionException(String message, String operation, String reason) {
        super("NoRecordException", message, operation, reason);
    }
}