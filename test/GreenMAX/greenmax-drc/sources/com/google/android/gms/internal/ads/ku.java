package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ku {
    private final zzdni a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f11736b;

    private ku(int i2) {
        byte[] bArr = new byte[i2];
        this.f11736b = bArr;
        this.a = zzdni.n(bArr);
    }

    public final zzdmr a() {
        this.a.v();
        return new nu(this.f11736b);
    }

    public final zzdni b() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ku(int i2, du duVar) {
        this(i2);
    }
}
