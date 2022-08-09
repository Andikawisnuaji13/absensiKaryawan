package com.example.absensikaryawan.api;



import com.example.absensikaryawan.kelas.Result;
import com.example.absensikaryawan.kelas.Pegawais;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.Call;
import retrofit2.http.Query;

public interface Apiservice {
    //TAMPIL DATA
    @GET("absensi/")
    Call<Pegawais> tampilDataAll(
            @Query("kunci") String kunci
    );

    //TAMPIL DATA DENGAN ID
//    @GET("uri")
//    Call<namakelas> getFunction(@Query("param")String param);

    //SIMPAN DATA
    @FormUrlEncoded
    @POST("absensi/")
    Call<Result> simpanDataCloud(
            @Query("kunci") String kunci,
            @Field("id_absensi") String id_absensi,
            @Field("nidn") String nidn,
            @Field("nama") String nama,
            @Field("tanggal") String tanggal,
            @Field("jam") String jam,
            @Field("status") String status,
            @Field("telat") String telat
    );
}
