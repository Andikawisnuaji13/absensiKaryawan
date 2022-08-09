package com.example.absensikaryawan.kelas;

import com.google.gson.annotations.SerializedName;

public class Result {
    @SerializedName("error")
    private boolean error;
    @SerializedName("pesan")
    private String pesan;

    public Result(boolean error, String pesan) {
        this.error = error;
        this.pesan = pesan;
    }

    public boolean getError() {
        return error;
    }
    public String getPesan() {
        return pesan;
    }


}
