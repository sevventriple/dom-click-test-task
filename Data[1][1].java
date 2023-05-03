package com.sbt.mbp.handle;

public class Data {

    private final String code;

    private final String data;

    public Data(String code, String data) {
        this.code = code;
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        //use only code field
    }

}
