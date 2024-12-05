package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzrr {
    public final zzrb a;

    /* renamed from: b, reason: collision with root package name */
    public final zzro f15499b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15500c;

    /* renamed from: d, reason: collision with root package name */
    public final zzlq[] f15501d;

    public zzrr(zzrb zzrbVar, zzro zzroVar, Object obj, zzlq[] zzlqVarArr) {
        this.a = zzrbVar;
        this.f15499b = zzroVar;
        this.f15500c = obj;
        this.f15501d = zzlqVarArr;
    }

    public final boolean a(zzrr zzrrVar, int i2) {
        return zzrrVar != null && zzsy.g(this.f15499b.a(i2), zzrrVar.f15499b.a(i2)) && zzsy.g(this.f15501d[i2], zzrrVar.f15501d[i2]);
    }
}
