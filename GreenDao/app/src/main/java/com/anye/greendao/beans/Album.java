package com.anye.greendao.beans;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Administrator on 2017/9/6.
 */
@Entity
public class Album {

    private String _id;

    @Generated(hash = 1742084801)
    public Album(String _id) {
        this._id = _id;
    }

    @Generated(hash = 1609191978)
    public Album() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }
}
