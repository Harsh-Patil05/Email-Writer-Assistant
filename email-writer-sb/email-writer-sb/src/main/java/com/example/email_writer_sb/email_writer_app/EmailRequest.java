package com.example.email_writer_sb.email_writer_app;


import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent;
    private String tone;
}
