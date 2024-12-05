package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class W5 implements G5 {

    /* renamed from: a, reason: collision with root package name */
    private final I5 f16430a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16431b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f16432c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16433d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public W5(I5 i52, String str, Object[] objArr) {
        this.f16430a = i52;
        this.f16431b = str;
        this.f16432c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f16433d = charAt;
            return;
        }
        int i8 = charAt & 8191;
        int i9 = 13;
        int i10 = 1;
        while (true) {
            int i11 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 >= 55296) {
                i8 |= (charAt2 & 8191) << i9;
                i9 += 13;
                i10 = i11;
            } else {
                this.f16433d = i8 | (charAt2 << i9);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a() {
        return this.f16431b;
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final boolean b() {
        if ((this.f16433d & 2) == 2) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] c() {
        return this.f16432c;
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final I5 w() {
        return this.f16430a;
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final R5 x() {
        int i8 = this.f16433d;
        if ((i8 & 1) != 0) {
            return R5.PROTO2;
        }
        if ((i8 & 4) == 4) {
            return R5.EDITIONS;
        }
        return R5.PROTO3;
    }
}
