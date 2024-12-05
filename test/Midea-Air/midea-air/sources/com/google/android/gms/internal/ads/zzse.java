package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class zzse {
    private final ExecutorService a;

    /* renamed from: b, reason: collision with root package name */
    private n30<? extends zzsh> f15535b;

    /* renamed from: c, reason: collision with root package name */
    private IOException f15536c;

    public zzse(String str) {
        this.a = zzsy.h(str);
    }

    public final boolean a() {
        return this.f15535b != null;
    }

    public final <T extends zzsh> long b(T t, zzsf<T> zzsfVar, int i2) {
        Looper myLooper = Looper.myLooper();
        zzsk.e(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new n30(this, myLooper, t, zzsfVar, i2, elapsedRealtime).d(0L);
        return elapsedRealtime;
    }

    public final void f(Runnable runnable) {
        n30<? extends zzsh> n30Var = this.f15535b;
        if (n30Var != null) {
            n30Var.e(true);
        }
        this.a.execute(runnable);
        this.a.shutdown();
    }

    public final void h(int i2) throws IOException {
        IOException iOException = this.f15536c;
        if (iOException == null) {
            n30<? extends zzsh> n30Var = this.f15535b;
            if (n30Var != null) {
                n30Var.c(n30Var.f11839h);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void i() {
        this.f15535b.e(false);
    }
}
