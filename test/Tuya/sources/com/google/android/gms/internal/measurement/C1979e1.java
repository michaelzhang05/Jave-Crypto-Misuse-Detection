package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.e1 */
/* loaded from: classes3.dex */
public final class C1979e1 extends AbstractC2112u4 implements Z4 {
    private static final C1979e1 zza;
    private int zzd;
    private C2078q1 zze;
    private C2022j1 zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        C1979e1 c1979e1 = new C1979e1();
        zza = c1979e1;
        AbstractC2112u4.w(C1979e1.class, c1979e1);
    }

    private C1979e1() {
    }

    public static C1979e1 C() {
        return zza;
    }

    public static /* synthetic */ void G(C1979e1 c1979e1, String str) {
        c1979e1.zzd |= 8;
        c1979e1.zzh = str;
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
                    return new C1970d1(null);
                }
                return new C1979e1();
            }
            return AbstractC2112u4.s(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final C2022j1 D() {
        C2022j1 c2022j1 = this.zzf;
        if (c2022j1 == null) {
            return C2022j1.C();
        }
        return c2022j1;
    }

    public final C2078q1 E() {
        C2078q1 c2078q1 = this.zze;
        if (c2078q1 == null) {
            return C2078q1.D();
        }
        return c2078q1;
    }

    public final String F() {
        return this.zzh;
    }

    public final boolean H() {
        return this.zzg;
    }

    public final boolean J() {
        return (this.zzd & 4) != 0;
    }

    public final boolean K() {
        return (this.zzd & 2) != 0;
    }

    public final boolean M() {
        return (this.zzd & 8) != 0;
    }

    public final boolean N() {
        return (this.zzd & 1) != 0;
    }
}
