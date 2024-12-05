package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2146i0 extends AbstractC2220q0 {

    /* renamed from: a, reason: collision with root package name */
    private String f16663a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16664b;

    /* renamed from: c, reason: collision with root package name */
    private EnumC2246t0 f16665c;

    /* renamed from: d, reason: collision with root package name */
    private byte f16666d;

    @Override // com.google.android.gms.internal.measurement.AbstractC2220q0
    public final AbstractC2220q0 a(EnumC2246t0 enumC2246t0) {
        if (enumC2246t0 != null) {
            this.f16665c = enumC2246t0;
            return this;
        }
        throw new NullPointerException("Null filePurpose");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2220q0
    public final AbstractC2220q0 b(boolean z8) {
        this.f16666d = (byte) (this.f16666d | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2220q0
    public final AbstractC2228r0 c() {
        if (this.f16666d == 3 && this.f16663a != null && this.f16665c != null) {
            return new C2156j0(this.f16663a, this.f16664b, this.f16665c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f16663a == null) {
            sb.append(" fileOwner");
        }
        if ((this.f16666d & 1) == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if ((this.f16666d & 2) == 0) {
            sb.append(" skipChecks");
        }
        if (this.f16665c == null) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:" + String.valueOf(sb));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2220q0
    final AbstractC2220q0 d(boolean z8) {
        this.f16664b = z8;
        this.f16666d = (byte) (this.f16666d | 2);
        return this;
    }

    public final AbstractC2220q0 e(String str) {
        this.f16663a = str;
        return this;
    }
}
