package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class V1 extends AbstractC2112u4 implements Z4 {
    private static final V1 zza;
    private A4 zzd = AbstractC2112u4.p();

    static {
        V1 v12 = new V1();
        zza = v12;
        AbstractC2112u4.w(V1.class, v12);
    }

    private V1() {
    }

    public static U1 B() {
        return (U1) zza.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void F(V1 v12, X1 x12) {
        x12.getClass();
        A4 a42 = v12.zzd;
        if (!a42.c()) {
            v12.zzd = AbstractC2112u4.q(a42);
        }
        v12.zzd.add(x12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2112u4
    public final Object A(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 != 0) {
            if (i9 != 2) {
                if (i9 != 3) {
                    D1 d12 = null;
                    if (i9 != 4) {
                        if (i9 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new U1(d12);
                }
                return new V1();
            }
            return AbstractC2112u4.s(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", X1.class});
        }
        return (byte) 1;
    }

    public final X1 D(int i8) {
        return (X1) this.zzd.get(0);
    }

    public final List E() {
        return this.zzd;
    }
}
