package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class d0 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final URL f5889a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Future f5890b;

    /* renamed from: c, reason: collision with root package name */
    private l2.i f5891c;

    private d0(URL url) {
        this.f5889a = url;
    }

    public static d0 D(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new d0(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(l2.j jVar) {
        try {
            jVar.c(q());
        } catch (Exception e6) {
            jVar.b(e6);
        }
    }

    private byte[] w() {
        URLConnection openConnection = this.f5889a.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            byte[] d6 = b.d(b.b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + d6.length + " bytes from " + this.f5889a);
            }
            if (d6.length <= 1048576) {
                return d6;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public l2.i G() {
        return (l2.i) v1.n.h(this.f5891c);
    }

    public void I(ExecutorService executorService) {
        final l2.j jVar = new l2.j();
        this.f5890b = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.c0
            @Override // java.lang.Runnable
            public final void run() {
                d0.this.H(jVar);
            }
        });
        this.f5891c = jVar.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5890b.cancel(true);
    }

    public Bitmap q() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f5889a);
        }
        byte[] w5 = w();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(w5, 0, w5.length);
        if (decodeByteArray == null) {
            throw new IOException("Failed to decode image: " + this.f5889a);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f5889a);
        }
        return decodeByteArray;
    }
}
