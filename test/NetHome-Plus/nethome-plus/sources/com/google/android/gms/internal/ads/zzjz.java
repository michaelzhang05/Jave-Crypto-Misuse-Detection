package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class zzjz {
    private final ExecutorService a;

    /* renamed from: b, reason: collision with root package name */
    private m00 f15210b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f15211c;

    public zzjz(String str) {
        this.a = zzkq.e(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ m00 c(zzjz zzjzVar, m00 m00Var) {
        zzjzVar.f15210b = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean e(zzjz zzjzVar, boolean z) {
        zzjzVar.f15211c = false;
        return false;
    }

    public final boolean a() {
        return this.f15211c;
    }

    public final void b() {
        if (this.f15211c) {
            f();
        }
        this.a.shutdown();
    }

    public final void d(zzkc zzkcVar, zzka zzkaVar) {
        Looper myLooper = Looper.myLooper();
        zzkh.d(myLooper != null);
        zzkh.d(!this.f15211c);
        this.f15211c = true;
        m00 m00Var = new m00(this, myLooper, zzkcVar, zzkaVar, 0);
        this.f15210b = m00Var;
        this.a.submit(m00Var);
    }

    public final void f() {
        zzkh.d(this.f15211c);
        this.f15210b.a();
    }
}
