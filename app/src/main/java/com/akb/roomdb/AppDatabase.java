package com.akb.roomdb;

//Tanggal Pengerjaan : 29-4-2020
//Deskripsi Pengerjaan : Mengerjakan semua kelas
//NIM : 10117154
//Nama :Andi Muhammad Ivan
//Kelas :IF4
import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {AktivisEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract AktivisDao aktivisDao();
}

