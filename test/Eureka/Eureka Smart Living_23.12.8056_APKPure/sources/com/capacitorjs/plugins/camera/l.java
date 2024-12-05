package com.capacitorjs.plugins.camera;

import android.app.Activity;
import android.os.Environment;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes.dex */
public abstract class l {
    public static File a(Activity activity) {
        return File.createTempFile("JPEG_" + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + "_", ".jpg", activity.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
    }
}
