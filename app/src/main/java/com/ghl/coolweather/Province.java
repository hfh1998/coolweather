package com.ghl.coolweather;

import org.litepal.crud.DataSupport;

/**
 * Created by admin on 2019/8/24.
 */

public class Province extends DataSupport {

    private int id;//每个实体类中应有的字段
    private String provinceName;//记录省的名字
    private int provinceCode;//记录省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
