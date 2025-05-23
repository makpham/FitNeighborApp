package com.example.fitneighborapp.messages;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "messages")
public class Messages {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String sender;
    private String content;
    private long timestamp;
    private String chatType;

    public Messages(String sender, String content, long timestamp, String chatType) {
        this.sender = sender;
        this.content = content;
        this.timestamp = timestamp;
        this.chatType = chatType;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
    public String getChatType() {
        return chatType;
    }

    public void setChatType(String chatType) {
        this.chatType = chatType;
    }
}
