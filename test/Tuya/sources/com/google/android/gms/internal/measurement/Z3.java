package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class Z3 extends AbstractC1955b4 {

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f15631b;

    /* renamed from: c, reason: collision with root package name */
    private int f15632c;

    /* renamed from: d, reason: collision with root package name */
    private int f15633d;

    /* renamed from: e, reason: collision with root package name */
    private int f15634e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ Z3(byte[] bArr, int i8, int i9, boolean z8, Y3 y32) {
        super(null);
        this.f15634e = Integer.MAX_VALUE;
        this.f15631b = bArr;
        this.f15632c = 0;
    }

    public final int c(int i8) {
        int i9 = this.f15634e;
        this.f15634e = 0;
        int i10 = this.f15632c + this.f15633d;
        this.f15632c = i10;
        if (i10 > 0) {
            this.f15633d = i10;
            this.f15632c = 0;
        } else {
            this.f15633d = 0;
        }
        return i9;
    }
}
