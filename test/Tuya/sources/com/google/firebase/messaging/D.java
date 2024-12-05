package com.google.firebase.messaging;

import R.AbstractC1319p;
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
import r0.C3679j;

/* loaded from: classes3.dex */
public class D implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final URL f17306a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Future f17307b;

    /* renamed from: c, reason: collision with root package name */
    private Task f17308c;

    private D(URL url) {
        this.f17306a = url;
    }

    private byte[] e() {
        URLConnection openConnection = this.f17306a.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] d8 = AbstractC2377b.d(AbstractC2377b.b(inputStream, 1048577L));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + d8.length + " bytes from " + this.f17306a);
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

    public static D f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new D(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(C3679j c3679j) {
        try {
            c3679j.c(b());
        } catch (Exception e8) {
            c3679j.b(e8);
        }
    }

    public Bitmap b() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f17306a);
        }
        byte[] e8 = e();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(e8, 0, e8.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f17306a);
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f17306a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f17307b.cancel(true);
    }

    public Task g() {
        return (Task) AbstractC1319p.l(this.f17308c);
    }

    public void l(ExecutorService executorService) {
        final C3679j c3679j = new C3679j();
        this.f17307b = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.C
            @Override // java.lang.Runnable
            public final void run() {
                D.this.h(c3679j);
            }
        });
        this.f17308c = c3679j.a();
    }
}
