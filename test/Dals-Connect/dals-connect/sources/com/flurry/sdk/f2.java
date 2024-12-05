package com.flurry.sdk;

import java.io.PrintStream;
import java.io.PrintWriter;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public abstract class f2 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private PrintStream f9854f;

    /* renamed from: g, reason: collision with root package name */
    private PrintWriter f9855g;

    public abstract void a() throws Exception;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Throwable th) {
            if (this.f9854f != null) {
                th.printStackTrace(this.f9854f);
            } else {
                PrintWriter printWriter = this.f9855g;
                if (printWriter != null) {
                    th.printStackTrace(printWriter);
                } else {
                    th.printStackTrace();
                }
            }
            d1.d(6, "SafeRunnable", HttpUrl.FRAGMENT_ENCODE_SET, th);
            g0.a();
            g0.c("SafeRunnableException", "Exception caught by SafeRunnable", th);
        }
    }
}
