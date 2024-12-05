package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class V2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f16317a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y2 f16318b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public V2(Y2 y22, boolean z8) {
        this.f16318b = y22;
        this.f16317a = z8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean o8 = this.f16318b.f16777a.o();
        boolean n8 = this.f16318b.f16777a.n();
        this.f16318b.f16777a.k(this.f16317a);
        if (n8 == this.f16317a) {
            this.f16318b.f16777a.d().v().b("Default data collection state already set to", Boolean.valueOf(this.f16317a));
        }
        if (this.f16318b.f16777a.o() == o8 || this.f16318b.f16777a.o() != this.f16318b.f16777a.n()) {
            this.f16318b.f16777a.d().x().c("Default data collection is different than actual status", Boolean.valueOf(this.f16317a), Boolean.valueOf(o8));
        }
        this.f16318b.P();
    }
}
