package com.airbnb.lottie.t;

import android.content.Context;
import c.h.j.f;
import cm.aptoide.pt.utils.MultiDexHelper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.HttpUrl;

/* compiled from: NetworkCache.java */
/* loaded from: classes.dex */
class b {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8252b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, String str) {
        this.a = context.getApplicationContext();
        this.f8252b = str;
    }

    private static String b(String str, a aVar, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("lottie_cache_");
        sb.append(str.replaceAll("\\W+", HttpUrl.FRAGMENT_ENCODE_SET));
        sb.append(z ? aVar.f8251i : aVar.d());
        return sb.toString();
    }

    private File c(String str) throws FileNotFoundException {
        File file = new File(this.a.getCacheDir(), b(str, a.Json, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(this.a.getCacheDir(), b(str, a.Zip, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f<a, InputStream> a() {
        a aVar;
        try {
            File c2 = c(this.f8252b);
            if (c2 == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(c2);
            if (c2.getAbsolutePath().endsWith(MultiDexHelper.EXTRACTED_SUFFIX)) {
                aVar = a.Zip;
            } else {
                aVar = a.Json;
            }
            com.airbnb.lottie.c.b("Cache hit for " + this.f8252b + " at " + c2.getAbsolutePath());
            return new f<>(aVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(a aVar) {
        File file = new File(this.a.getCacheDir(), b(this.f8252b, aVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", HttpUrl.FRAGMENT_ENCODE_SET));
        boolean renameTo = file.renameTo(file2);
        com.airbnb.lottie.c.b("Copying temp file to real file (" + file2 + ")");
        if (renameTo) {
            return;
        }
        com.airbnb.lottie.c.d("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File e(InputStream inputStream, a aVar) throws IOException {
        File file = new File(this.a.getCacheDir(), b(this.f8252b, aVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        return file;
                    }
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }
}
