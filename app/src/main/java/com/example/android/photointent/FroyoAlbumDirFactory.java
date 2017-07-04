package com.example.android.photointent;

import android.os.Environment;

import java.io.File;

/**
 * Created by zengzhi on 2017/7/4.
 */

public class FroyoAlbumDirFactory extends AlbumStorageDirFactory {
    @Override
    public File getAlbumStorageDir(String albumName) {
        return new File(
                Environment.getExternalStoragePublicDirectory(
                        Environment.DIRECTORY_PICTURES
                ), albumName);
    }
}
