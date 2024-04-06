package com.deepawasthi.InstaFire.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Timestamp;

@Entity(name = "status")
public class StatusEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int statusId;
    private int userId;
    private String path;
    private String userName;
    private Timestamp timeStamp;

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    public StatusEntity(int statusId, int userId, String path, String userName, Timestamp timeStamp) {
        this.statusId = statusId;
        this.userId = userId;
        this.path = path;
        this.userName = userName;
        this.timeStamp = timeStamp;
    }

    public StatusEntity() {
    }
}
