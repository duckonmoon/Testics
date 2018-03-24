package ua.com.krch.chaos.duckonmmon.zefirka.testics.entity;

import java.io.Serializable;

public class Test implements Serializable {
    private Integer name;
    private Integer image;
    private Integer maxMark;
    private String key;

    public Test(Integer name, Integer image, Integer maxMark, String key) {
        this.name = name;
        this.image = image;
        this.maxMark = maxMark;
        this.key = key;
    }

    public Test() {
    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public Integer getMaxMark() {
        return maxMark;
    }

    public void setMaxMark(Integer maxMark) {
        this.maxMark = maxMark;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
