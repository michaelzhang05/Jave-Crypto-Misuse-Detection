package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class M0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final long f15390a;

    /* renamed from: b, reason: collision with root package name */
    final long f15391b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f15392c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ X0 f15393d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public M0(X0 x02, boolean z8) {
        this.f15393d = x02;
        this.f15390a = x02.f15603b.currentTimeMillis();
        this.f15391b = x02.f15603b.elapsedRealtime();
        this.f15392c = z8;
    }

    abstract void a();

    protected void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z8;
        z8 = this.f15393d.f15608g;
        if (z8) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e8) {
            this.f15393d.i(e8, false, this.f15392c);
            b();
        }
    }
}
