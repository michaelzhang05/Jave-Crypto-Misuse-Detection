package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public abstract class zztq {
    int a;

    /* renamed from: b, reason: collision with root package name */
    private int f16108b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16109c;

    private zztq() {
        this.a = 100;
        this.f16108b = Integer.MAX_VALUE;
        this.f16109c = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zztq a(byte[] bArr, int i2, int i3, boolean z) {
        r0 r0Var = new r0(bArr, i2, i3, false);
        try {
            r0Var.b(i3);
            return r0Var;
        } catch (zzuv e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract int b(int i2) throws zzuv;

    public abstract int c();
}
