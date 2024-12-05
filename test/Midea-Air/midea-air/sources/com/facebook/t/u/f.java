package com.facebook.t.u;

import android.os.AsyncTask;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;

/* compiled from: FileDownloadTask.java */
/* loaded from: classes.dex */
public class f extends AsyncTask<String, Void, Boolean> {
    private a a;

    /* renamed from: b, reason: collision with root package name */
    private File f9623b;

    /* renamed from: c, reason: collision with root package name */
    private String f9624c;

    /* compiled from: FileDownloadTask.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(File file);
    }

    public f(String str, File file, a aVar) {
        this.f9624c = str;
        this.f9623b = file;
        this.a = aVar;
    }

    protected Boolean a(String... strArr) {
        try {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return null;
            }
            try {
                URL url = new URL(this.f9624c);
                int contentLength = url.openConnection().getContentLength();
                DataInputStream dataInputStream = new DataInputStream(url.openStream());
                byte[] bArr = new byte[contentLength];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.f9623b));
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
            return null;
        }
    }

    protected void b(Boolean bool) {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            if (bool.booleanValue()) {
                this.a.a(this.f9623b);
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    @Override // android.os.AsyncTask
    protected /* bridge */ /* synthetic */ Boolean doInBackground(String[] strArr) {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return null;
        }
        try {
            return a(strArr);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    protected /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            b(bool);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }
}
