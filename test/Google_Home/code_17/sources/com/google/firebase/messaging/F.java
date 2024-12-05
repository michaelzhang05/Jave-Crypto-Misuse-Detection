package com.google.firebase.messaging;

import Q.AbstractC1400p;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import q0.C3826j;

/* loaded from: classes4.dex */
public class F implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final URL f18342a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Future f18343b;

    /* renamed from: c, reason: collision with root package name */
    private Task f18344c;

    private F(URL url) {
        this.f18342a = url;
    }

    private byte[] f() {
        URLConnection openConnection = this.f18342a.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] d8 = AbstractC2571b.d(AbstractC2571b.b(inputStream, 1048577L));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + d8.length + " bytes from " + this.f18342a);
                }
                if (d8.length <= 1048576) {
                    return d8;
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
        throw new IOException("Content-Length exceeds max size of 1048576");
    }

    public static F g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new F(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(C3826j c3826j) {
        try {
            c3826j.c(b());
        } catch (Exception e8) {
            c3826j.b(e8);
        }
    }

    public Bitmap b() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f18342a);
        }
        byte[] f8 = f();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(f8, 0, f8.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f18342a);
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f18342a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f18343b.cancel(true);
    }

    public Task l() {
        return (Task) AbstractC1400p.l(this.f18344c);
    }

    public void n(ExecutorService executorService) {
        final C3826j c3826j = new C3826j();
        this.f18343b = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.E
            @Override // java.lang.Runnable
            public final void run() {
                F.this.m(c3826j);
            }
        });
        this.f18344c = c3826j.a();
    }
}
