package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class A1 extends AbstractC2112u4 implements Z4 {
    private static final A1 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        A1 a12 = new A1();
        zza = a12;
        AbstractC2112u4.w(A1.class, a12);
    }

    private A1() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2112u4
    public final Object A(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 != 0) {
            if (i9 != 2) {
                if (i9 != 3) {
                    AbstractC2085r1 abstractC2085r1 = null;
                    if (i9 != 4) {
                        if (i9 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new C2149z1(abstractC2085r1);
                }
                return new A1();
            }
            return AbstractC2112u4.s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
