package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Info {
    private String id;
    private String text;
    private String type;
    private String user;
    private Integer upvotes;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    @JsonProperty("upvotes")
    public Integer getUpvotes() {
        if (upvotes == null) return 0;
        return upvotes;
    }

    @Override
    public String toString() {
        return  "id= " + id  +
                ", \nОписание: " + text +
                ", \nЖивотное: " + type + "." +
                ", \nИмя владельца: " + user + "." +
                ", \nКоличество голосов: " + upvotes +
                ".\n";
    }
}