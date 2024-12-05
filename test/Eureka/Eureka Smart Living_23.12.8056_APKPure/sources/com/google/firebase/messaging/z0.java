package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: d, reason: collision with root package name */
    private static WeakReference f6019d;

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f6020a;

    /* renamed from: b, reason: collision with root package name */
    private v0 f6021b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f6022c;

    private z0(SharedPreferences sharedPreferences, Executor executor) {
        this.f6022c = executor;
        this.f6020a = sharedPreferences;
    }

    public static synchronized z0 a(Context context, Executor executor) {
        z0 z0Var;
        synchronized (z0.class) {
            WeakReference weakReference = f6019d;
            z0Var = weakReference != null ? (z0) weakReference.get() : null;
            if (z0Var == null) {
                z0Var = new z0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                z0Var.c();
                f6019d = new WeakReference(z0Var);
            }
        }
        return z0Var;
    }

    private synchronized void c() {
        this.f6021b = v0.c(this.f6020a, "topic_operation_queue", ",", this.f6022c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized y0 b() {
        return y0.a(this.f6021b.e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean d(y0 y0Var) {
        return this.f6021b.f(y0Var.e());
    }
}
