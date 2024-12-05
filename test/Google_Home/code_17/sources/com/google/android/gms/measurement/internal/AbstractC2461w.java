package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2461w {

    /* renamed from: d, reason: collision with root package name */
    private static volatile Handler f17874d;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2465w3 f17875a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f17876b;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f17877c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2461w(InterfaceC2465w3 interfaceC2465w3) {
        AbstractC1400p.l(interfaceC2465w3);
        this.f17875a = interfaceC2465w3;
        this.f17876b = new RunnableC2454v(this, interfaceC2465w3);
    }

    private final Handler f() {
        Handler handler;
        if (f17874d != null) {
            return f17874d;
        }
        synchronized (AbstractC2461w.class) {
            try {
                if (f17874d == null) {
                    f17874d = new com.google.android.gms.internal.measurement.N0(this.f17875a.w().getMainLooper());
                }
                handler = f17874d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f17877c = 0L;
        f().removeCallbacks(this.f17876b);
    }

    public final void b(long j8) {
        a();
        if (j8 >= 0) {
            this.f17877c = this.f17875a.x().currentTimeMillis();
            if (!f().postDelayed(this.f17876b, j8)) {
                this.f17875a.c().G().b("Failed to schedule delayed post. time", Long.valueOf(j8));
            }
        }
    }

    public abstract void d();

    public final boolean e() {
        if (this.f17877c != 0) {
            return true;
        }
        return false;
    }
}
