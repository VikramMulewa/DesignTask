package com.example.vikram.designtask.Task2;

/**
 * Created by Vikram on 10-May-17.
 */

public class Model2 {
    String name;
    String time;
    int dp;
    int mp;
    String description;
    int like;
    int comment;
    int height;

    public Model2() {
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Model2(String name, String time, int dp, int mp, String description, int like, int comment, int height) {
        this.name = name;
        this.time = time;
        this.dp = dp;
        this.mp = mp;
        this.description = description;
        this.like = like;
        this.comment = comment;
        this.height = height;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getDp() {
        return dp;
    }

    public void setDp(int dp) {
        this.dp = dp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }
}
