package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2018i5 implements V4 {

    /* renamed from: a, reason: collision with root package name */
    private final Y4 f15733a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15734b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f15735c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15736d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2018i5(Y4 y42, String str, Object[] objArr) {
        this.f15733a = y42;
        this.f15734b = str;
        this.f15735c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f15736d = charAt;
            return;
        }
        int i8 = charAt & 8191;
        int i9 = 1;
        int i10 = 13;
        while (true) {
            int i11 = i9 + 1;
            char charAt2 = str.charAt(i9);
            if (charAt2 >= 55296) {
                i8 |= (charAt2 & 8191) << i10;
                i10 += 13;
                i9 = i11;
            } else {
                this.f15736d = i8 | (charAt2 << i10);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Y4 a() {
        return this.f15733a;
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final boolean b() {
        return (this.f15736d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final int c() {
        return (this.f15736d & 1) == 1 ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String d() {
        return this.f15734b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] e() {
        return this.f15735c;
    }
}
