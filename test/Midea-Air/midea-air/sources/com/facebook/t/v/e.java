package com.facebook.t.v;

import android.text.TextUtils;
import com.facebook.f;
import java.io.File;
import java.nio.charset.Charset;

/* compiled from: Utils.java */
/* loaded from: classes.dex */
public class e {
    public static File a() {
        if (com.facebook.internal.a0.f.a.c(e.class)) {
            return null;
        }
        try {
            File file = new File(f.e().getFilesDir(), "facebook_ml/");
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
            return file;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, e.class);
            return null;
        }
    }

    static String b(String str) {
        if (com.facebook.internal.a0.f.a.c(e.class)) {
            return null;
        }
        try {
            return TextUtils.join(" ", str.trim().split("\\s+"));
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, e.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int[] c(String str, int i2) {
        if (com.facebook.internal.a0.f.a.c(e.class)) {
            return null;
        }
        try {
            int[] iArr = new int[i2];
            byte[] bytes = b(str).getBytes(Charset.forName("UTF-8"));
            for (int i3 = 0; i3 < i2; i3++) {
                if (i3 < bytes.length) {
                    iArr[i3] = bytes[i3] & 255;
                } else {
                    iArr[i3] = 0;
                }
            }
            return iArr;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, e.class);
            return null;
        }
    }
}
