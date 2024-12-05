package com.capacitorjs.plugins.camera;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class n {
    public static Bitmap a(Context context, Bitmap bitmap, Uri uri, m mVar) {
        int c6 = c(context, uri);
        if (c6 == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(c6);
        mVar.c();
        return f(bitmap, matrix);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.capacitorjs.plugins.camera.m b(android.content.Context r2, android.graphics.Bitmap r3, android.net.Uri r4) {
        /*
            r3 = 0
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L20
            java.io.InputStream r2 = r2.openInputStream(r4)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L20
            androidx.exifinterface.media.a r4 = new androidx.exifinterface.media.a     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L32
            r4.<init>(r2)     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L32
            com.capacitorjs.plugins.camera.m r0 = new com.capacitorjs.plugins.camera.m     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L32
            r0.<init>(r4)     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L32
            if (r2 == 0) goto L18
            r2.close()     // Catch: java.io.IOException -> L18
        L18:
            return r0
        L19:
            r4 = move-exception
            goto L22
        L1b:
            r2 = move-exception
            r1 = r3
            r3 = r2
            r2 = r1
            goto L33
        L20:
            r4 = move-exception
            r2 = r3
        L22:
            java.lang.String r0 = "Error loading exif data from image"
            com.getcapacitor.l0.e(r0, r4)     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L2c
            r2.close()     // Catch: java.io.IOException -> L2c
        L2c:
            com.capacitorjs.plugins.camera.m r2 = new com.capacitorjs.plugins.camera.m
            r2.<init>(r3)
            return r2
        L32:
            r3 = move-exception
        L33:
            if (r2 == 0) goto L38
            r2.close()     // Catch: java.io.IOException -> L38
        L38:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.capacitorjs.plugins.camera.n.b(android.content.Context, android.graphics.Bitmap, android.net.Uri):com.capacitorjs.plugins.camera.m");
    }

    private static int c(Context context, Uri uri) {
        InputStream openInputStream = context.getContentResolver().openInputStream(uri);
        try {
            int e6 = new androidx.exifinterface.media.a(openInputStream).e("Orientation", 1);
            int i6 = e6 == 6 ? 90 : e6 == 3 ? 180 : e6 == 8 ? 270 : 0;
            if (openInputStream != null) {
                openInputStream.close();
            }
            return i6;
        } catch (Throwable th) {
            if (openInputStream != null) {
                try {
                    openInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static Bitmap d(Bitmap bitmap, int i6, int i7) {
        return e(bitmap, i6, i7);
    }

    private static Bitmap e(Bitmap bitmap, int i6, int i7) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (i7 == 0) {
            i7 = height;
        }
        if (i6 == 0) {
            i6 = width;
        }
        float min = Math.min(width, i6);
        float f6 = (height * min) / width;
        float f7 = i7;
        if (f6 > f7) {
            min = (width * i7) / height;
            f6 = f7;
        }
        return Bitmap.createScaledBitmap(bitmap, Math.round(min), Math.round(f6), false);
    }

    private static Bitmap f(Bitmap bitmap, Matrix matrix) {
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }
}
