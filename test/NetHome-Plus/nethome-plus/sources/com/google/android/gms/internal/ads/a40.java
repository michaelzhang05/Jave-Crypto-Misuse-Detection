package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a40 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f11051f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ int f11052g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ int f11053h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ float f11054i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ zzto f11055j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a40(zzto zztoVar, int i2, int i3, int i4, float f2) {
        this.f11055j = zztoVar;
        this.f11051f = i2;
        this.f11052g = i3;
        this.f11053h = i4;
        this.f11054i = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zztn zztnVar;
        zztnVar = this.f11055j.f15598b;
        zztnVar.m(this.f11051f, this.f11052g, this.f11053h, this.f11054i);
    }
}
