package com.fastcampus.Res9ueTeam.global.exception;

public enum ErrorCode {
    DUPLICATE_EMAIL_EXCEPTION(409, "이미 존재하는 이메일입니다.");

    private final int status;
    private final String message;

    ErrorCode(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() { return status; }
    public String getMessage() { return message; }
}
