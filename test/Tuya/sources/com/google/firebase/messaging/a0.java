package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: d, reason: collision with root package name */
    private static WeakReference f17423d;

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f17424a;

    /* renamed from: b, reason: collision with root package name */
    private W f17425b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f17426c;

    private a0(SharedPreferences sharedPreferences, Executor executor) {
        this.f17426c = executor;
        this.f17424a = sharedPreferences;
    }

    public static synchronized a0 a(Context context, Executor executor) {
        a0 a0Var;
        synchronized (a0.class) {
            try {
                WeakReference weakReference = f17423d;
                if (weakReference != null) {
                    a0Var = (a0) weakReference.get();
                } else {
                    a0Var = null;
                }
                if (a0Var == null) {
                    a0Var = new a0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                    a0Var.c();
                    f17423d = new WeakReference(a0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a0Var;
    }

    private synchronized void c() {
        this.f17425b = W.c(this.f17424a, "topic_operation_queue", ",", this.f17426c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Z b() {
        return Z.a(this.f17425b.e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean d(Z z8) {
        return this.f17425b.f(z8.e());
    }
}
