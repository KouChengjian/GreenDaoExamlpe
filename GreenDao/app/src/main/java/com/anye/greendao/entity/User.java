package com.anye.greendao.entity;

import com.anye.greendao.beans.Album;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.ToMany;
import org.greenrobot.greendao.annotation.Transient;
import org.greenrobot.greendao.annotation.Generated;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anye0 on 2016/7/24.
 */
@Entity
public class User {
    @Id
    private Long id;
    private String name;
    private String sign;
    private String age;
    @Transient
    private int tempUsageCount; // not persisted

    @ToMany(referencedJoinProperty = "_id")
    private List<Album> albumList = new ArrayList<>();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Generated(hash = 790605229)
    public User(Long id, String name, String sign, String age) {
        this.id = id;
        this.name = name;
        this.sign = sign;
        this.age = age;
    }

    @Generated(hash = 586692638)
    public User() {
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<Album> getAlbumList() {
        return albumList;
    }

    public void setAlbumList(List<Album> albumList) {
        this.albumList = albumList;
    }
}
