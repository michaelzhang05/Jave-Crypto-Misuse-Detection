package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class R3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ boolean f17332a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ A3 f17333b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public R3(A3 a32, boolean z8) {
        this.f17332a = z8;
        this.f17333b = a32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean m8 = this.f17333b.f17844a.m();
        boolean l8 = this.f17333b.f17844a.l();
        this.f17333b.f17844a.j(this.f17332a);
        if (l8 == this.f17332a) {
            this.f17333b.f17844a.c().K().b("Default data collection state already set to", Boolean.valueOf(this.f17332a));
        }
        if (this.f17333b.f17844a.m() == m8 || this.f17333b.f17844a.m() != this.f17333b.f17844a.l()) {
            this.f17333b.f17844a.c().M().c("Default data collection is different than actual status", Boolean.valueOf(this.f17332a), Boolean.valueOf(m8));
        }
        this.f17333b.K0();
    }
}
