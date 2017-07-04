package com.example.android.photointent;

import java.io.File;

/**
 * Created by zengzhi on 2017/7/4.
 */

public abstract class AlbumStorageDirFactory {

    public abstract File getAlbumStorageDir(String albumName);
}
