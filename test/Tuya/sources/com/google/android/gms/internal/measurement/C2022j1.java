package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.j1 */
/* loaded from: classes3.dex */
public final class C2022j1 extends AbstractC2112u4 implements Z4 {
    private static final C2022j1 zza;
    private int zzd;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        C2022j1 c2022j1 = new C2022j1();
        zza = c2022j1;
        AbstractC2112u4.w(C2022j1.class, c2022j1);
    }

    private C2022j1() {
    }

    public static C2022j1 C() {
        return zza;
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
                    return new C1988f1(null);
                }
                return new C2022j1();
            }
            return AbstractC2112u4.s(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzd", "zze", C2006h1.f15724a, "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final String D() {
        return this.zzg;
    }

    public final String E() {
        return this.zzi;
    }

    public final String F() {
        return this.zzh;
    }

    public final boolean G() {
        return this.zzf;
    }

    public final boolean H() {
        return (this.zzd & 1) != 0;
    }

    public final boolean J() {
        return (this.zzd & 4) != 0;
    }

    public final boolean K() {
        return (this.zzd & 2) != 0;
    }

    public final boolean M() {
        return (this.zzd & 16) != 0;
    }

    public final boolean N() {
        return (this.zzd & 8) != 0;
    }

    public final int O() {
        int a8 = AbstractC2014i1.a(this.zze);
        if (a8 == 0) {
            return 1;
        }
        return a8;
    }
}
