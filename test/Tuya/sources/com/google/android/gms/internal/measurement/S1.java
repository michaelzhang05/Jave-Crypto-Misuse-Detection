package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class S1 extends AbstractC2112u4 implements Z4 {
    private static final S1 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private G1 zzg;

    static {
        S1 s12 = new S1();
        zza = s12;
        AbstractC2112u4.w(S1.class, s12);
    }

    private S1() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2112u4
    public final Object A(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 != 0) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        if (i9 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new R1(null);
                }
                return new S1();
            }
            return AbstractC2112u4.s(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
