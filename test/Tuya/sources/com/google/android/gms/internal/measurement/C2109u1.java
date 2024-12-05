package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.u1 */
/* loaded from: classes3.dex */
public final class C2109u1 extends AbstractC2112u4 implements Z4 {
    private static final C2109u1 zza;
    private int zzd;
    private String zze = "";
    private A4 zzf = AbstractC2112u4.p();
    private boolean zzg;

    static {
        C2109u1 c2109u1 = new C2109u1();
        zza = c2109u1;
        AbstractC2112u4.w(C2109u1.class, c2109u1);
    }

    private C2109u1() {
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
                    return new C2101t1(null);
                }
                return new C2109u1();
            }
            return AbstractC2112u4.s(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzd", "zze", "zzf", A1.class, "zzg"});
        }
        return (byte) 1;
    }

    public final String C() {
        return this.zze;
    }
}
