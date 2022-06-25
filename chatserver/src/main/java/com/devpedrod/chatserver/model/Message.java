package com.devpedrod.chatserver.model;

import com.devpedrod.chatserver.model.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Message {
    private String senderName;
    private String receiverName;
    private String message;
    private String date;
    private Status status;
}
