package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class a00 {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f11039b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f11040c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f11041d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f11042e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a00(long[] jArr, int[] iArr, long[] jArr2, int[] iArr2) {
        zzkh.a(iArr.length == jArr2.length);
        zzkh.a(jArr.length == jArr2.length);
        zzkh.a(iArr2.length == jArr2.length);
        this.f11039b = jArr;
        this.f11040c = iArr;
        this.f11041d = jArr2;
        this.f11042e = iArr2;
        this.a = jArr.length;
    }
}
