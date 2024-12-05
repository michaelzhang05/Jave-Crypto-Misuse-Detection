package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class xy implements zzge {
    private final Handler a;

    /* renamed from: b, reason: collision with root package name */
    private final zy f12405b;

    /* renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArraySet<zzgh> f12406c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean[] f12407d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f12408e;

    /* renamed from: f, reason: collision with root package name */
    private int f12409f;

    /* renamed from: g, reason: collision with root package name */
    private int f12410g;

    @SuppressLint({"HandlerLeak"})
    public xy(int i2, int i3, int i4) {
        Log.i("ExoPlayerImpl", "Init 1.3.1");
        int i5 = 0;
        this.f12408e = false;
        this.f12409f = 1;
        this.f12406c = new CopyOnWriteArraySet<>();
        this.f12407d = new boolean[2];
        while (true) {
            boolean[] zArr = this.f12407d;
            if (i5 < zArr.length) {
                zArr[i5] = true;
                i5++;
            } else {
                yy yyVar = new yy(this);
                this.a = yyVar;
                this.f12405b = new zy(yyVar, this.f12408e, this.f12407d, 2500, 5000);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final void a() {
        this.f12405b.c();
        this.a.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final void b(boolean z) {
        if (this.f12408e != z) {
            this.f12408e = z;
            this.f12410g++;
            this.f12405b.n(z);
            Iterator<zzgh> it = this.f12406c.iterator();
            while (it.hasNext()) {
                it.next().b(z, this.f12409f);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final void c(long j2) {
        this.f12405b.d(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final long d() {
        return this.f12405b.a();
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final long e() {
        return this.f12405b.o();
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final boolean f() {
        return this.f12408e;
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final long g() {
        return this.f12405b.b();
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final void h(zzgf zzgfVar, int i2, Object obj) {
        this.f12405b.k(zzgfVar, 1, obj);
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final void i(zzgh zzghVar) {
        this.f12406c.add(zzghVar);
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final void j(zzgf zzgfVar, int i2, Object obj) {
        this.f12405b.h(zzgfVar, 1, obj);
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final void k(zzhp... zzhpVarArr) {
        this.f12405b.i(zzhpVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final void l(int i2, boolean z) {
        boolean[] zArr = this.f12407d;
        if (zArr[0] != z) {
            zArr[0] = z;
            this.f12405b.m(0, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            this.f12409f = message.arg1;
            Iterator<zzgh> it = this.f12406c.iterator();
            while (it.hasNext()) {
                it.next().b(this.f12408e, this.f12409f);
            }
            return;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                return;
            }
            zzgd zzgdVar = (zzgd) message.obj;
            Iterator<zzgh> it2 = this.f12406c.iterator();
            while (it2.hasNext()) {
                it2.next().c(zzgdVar);
            }
            return;
        }
        int i3 = this.f12410g - 1;
        this.f12410g = i3;
        if (i3 == 0) {
            Iterator<zzgh> it3 = this.f12406c.iterator();
            while (it3.hasNext()) {
                it3.next().d();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final void stop() {
        this.f12405b.f();
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final int t() {
        return this.f12409f;
    }
}
