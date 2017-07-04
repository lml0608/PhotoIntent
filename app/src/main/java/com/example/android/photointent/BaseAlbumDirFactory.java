package com.example.android.photointent;

import android.os.Environment;

import java.io.File;

/**
 * Created by zengzhi on 2017/7/4.
 */

public final class BaseAlbumDirFactory extends AlbumStorageDirFactory {
    private static final String CAMERA_DIR = "/dicm/";

    @Override
    public File getAlbumStorageDir(String albumName) {
        return new File(
                Environment.getExternalStorageDirectory()
                + CAMERA_DIR
                + albumName
        );
    }
}
