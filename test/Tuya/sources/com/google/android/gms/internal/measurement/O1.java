package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class O1 extends AbstractC2112u4 implements Z4 {
    private static final O1 zza;
    private int zzd;
    private String zze = "";
    private long zzf;

    static {
        O1 o12 = new O1();
        zza = o12;
        AbstractC2112u4.w(O1.class, o12);
    }

    private O1() {
    }

    public static N1 B() {
        return (N1) zza.i();
    }

    public static /* synthetic */ void D(O1 o12, String str) {
        str.getClass();
        o12.zzd |= 1;
        o12.zze = str;
    }

    public static /* synthetic */ void E(O1 o12, long j8) {
        o12.zzd |= 2;
        o12.zzf = j8;
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
                    return new N1(null);
                }
                return new O1();
            }
            return AbstractC2112u4.s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
