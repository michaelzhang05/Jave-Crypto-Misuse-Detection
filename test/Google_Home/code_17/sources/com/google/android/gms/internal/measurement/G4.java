package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class G4 extends H4 {

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f16137c;

    /* renamed from: d, reason: collision with root package name */
    private int f16138d;

    /* renamed from: e, reason: collision with root package name */
    private int f16139e;

    /* renamed from: f, reason: collision with root package name */
    private int f16140f;

    /* renamed from: g, reason: collision with root package name */
    private int f16141g;

    /* renamed from: h, reason: collision with root package name */
    private int f16142h;

    private final void f() {
        int i8 = this.f16138d + this.f16139e;
        this.f16138d = i8;
        int i9 = i8 - this.f16141g;
        int i10 = this.f16142h;
        if (i9 > i10) {
            int i11 = i9 - i10;
            this.f16139e = i11;
            this.f16138d = i8 - i11;
            return;
        }
        this.f16139e = 0;
    }

    @Override // com.google.android.gms.internal.measurement.H4
    public final int a(int i8) {
        if (i8 >= 0) {
            int d8 = i8 + d();
            if (d8 >= 0) {
                int i9 = this.f16142h;
                if (d8 <= i9) {
                    this.f16142h = d8;
                    f();
                    return i9;
                }
                throw C2171k5.g();
            }
            throw C2171k5.e();
        }
        throw C2171k5.d();
    }

    @Override // com.google.android.gms.internal.measurement.H4
    public final int d() {
        return this.f16140f - this.f16141g;
    }

    private G4(byte[] bArr, int i8, int i9, boolean z8) {
        super();
        this.f16142h = Integer.MAX_VALUE;
        this.f16137c = bArr;
        this.f16138d = i9 + i8;
        this.f16140f = i8;
        this.f16141g = i8;
    }
}
