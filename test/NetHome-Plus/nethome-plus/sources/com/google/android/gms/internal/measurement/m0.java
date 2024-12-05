package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class m0 {
    private final zztv a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f15994b;

    private m0(int i2) {
        byte[] bArr = new byte[i2];
        this.f15994b = bArr;
        this.a = zztv.y0(bArr);
    }

    public final zzte a() {
        if (this.a.F0() == 0) {
            return new o0(this.f15994b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public final zztv b() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ m0(int i2, g0 g0Var) {
        this(i2);
    }
}
