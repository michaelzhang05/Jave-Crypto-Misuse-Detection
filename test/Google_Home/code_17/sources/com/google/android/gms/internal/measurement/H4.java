package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public abstract class H4 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile int f16145b = 100;

    /* renamed from: a, reason: collision with root package name */
    int f16146a;

    public static long b(long j8) {
        return (-(j8 & 1)) ^ (j8 >>> 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static H4 c(byte[] bArr, int i8, int i9, boolean z8) {
        G4 g42 = new G4(bArr, i9);
        try {
            g42.a(i9);
            return g42;
        } catch (C2171k5 e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public static int e(int i8) {
        return (-(i8 & 1)) ^ (i8 >>> 1);
    }

    public abstract int a(int i8);

    public abstract int d();

    private H4() {
        this.f16146a = f16145b;
    }
}
