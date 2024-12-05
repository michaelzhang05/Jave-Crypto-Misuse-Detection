package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.internal.x;
import java.net.HttpURLConnection;
import java.util.List;

/* compiled from: GraphRequestAsyncTask.java */
/* loaded from: classes.dex */
public class g extends AsyncTask<Void, Void, List<i>> {
    private static final String a = g.class.getCanonicalName();

    /* renamed from: b, reason: collision with root package name */
    private final HttpURLConnection f9086b;

    /* renamed from: c, reason: collision with root package name */
    private final h f9087c;

    /* renamed from: d, reason: collision with root package name */
    private Exception f9088d;

    public g(h hVar) {
        this(null, hVar);
    }

    protected List<i> a(Void... voidArr) {
        try {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return null;
            }
            try {
                HttpURLConnection httpURLConnection = this.f9086b;
                if (httpURLConnection == null) {
                    return this.f9087c.o();
                }
                return GraphRequest.p(httpURLConnection, this.f9087c);
            } catch (Exception e2) {
                this.f9088d = e2;
                return null;
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
            return null;
        }
    }

    protected void b(List<i> list) {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            super.onPostExecute(list);
            Exception exc = this.f9088d;
            if (exc != null) {
                x.V(a, String.format("onPostExecute: exception encountered during request: %s", exc.getMessage()));
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    @Override // android.os.AsyncTask
    protected /* bridge */ /* synthetic */ List<i> doInBackground(Void[] voidArr) {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return null;
        }
        try {
            return a(voidArr);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    protected /* bridge */ /* synthetic */ void onPostExecute(List<i> list) {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            b(list);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        Handler handler;
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            super.onPreExecute();
            if (f.u()) {
                x.V(a, String.format("execute async task: %s", this));
            }
            if (this.f9087c.K() == null) {
                if (Thread.currentThread() instanceof HandlerThread) {
                    handler = new Handler();
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                this.f9087c.R(handler);
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    public String toString() {
        return "{RequestAsyncTask:  connection: " + this.f9086b + ", requests: " + this.f9087c + "}";
    }

    public g(HttpURLConnection httpURLConnection, h hVar) {
        this.f9087c = hVar;
        this.f9086b = httpURLConnection;
    }
}
