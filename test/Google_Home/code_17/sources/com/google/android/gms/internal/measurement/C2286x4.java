package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.x4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2286x4 {

    /* renamed from: a, reason: collision with root package name */
    private final K4 f16894a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f16895b;

    public final AbstractC2241s4 a() {
        this.f16894a.E();
        return new C4(this.f16895b);
    }

    public final K4 b() {
        return this.f16894a;
    }

    private C2286x4(int i8) {
        byte[] bArr = new byte[i8];
        this.f16895b = bArr;
        this.f16894a = K4.D(bArr);
    }
}
