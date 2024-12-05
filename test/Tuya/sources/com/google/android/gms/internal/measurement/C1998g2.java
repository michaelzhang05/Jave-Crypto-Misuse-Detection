package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.g2 */
/* loaded from: classes3.dex */
public final class C1998g2 extends AbstractC2112u4 implements Z4 {
    private static final C1998g2 zza;
    private int zzd;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        C1998g2 c1998g2 = new C1998g2();
        zza = c1998g2;
        AbstractC2112u4.w(C1998g2.class, c1998g2);
    }

    private C1998g2() {
    }

    public static C1989f2 E() {
        return (C1989f2) zza.i();
    }

    public static /* synthetic */ void J(C1998g2 c1998g2, long j8) {
        c1998g2.zzd |= 1;
        c1998g2.zze = j8;
    }

    public static /* synthetic */ void K(C1998g2 c1998g2, String str) {
        str.getClass();
        c1998g2.zzd |= 2;
        c1998g2.zzf = str;
    }

    public static /* synthetic */ void M(C1998g2 c1998g2, String str) {
        str.getClass();
        c1998g2.zzd |= 4;
        c1998g2.zzg = str;
    }

    public static /* synthetic */ void N(C1998g2 c1998g2) {
        c1998g2.zzd &= -5;
        c1998g2.zzg = zza.zzg;
    }

    public static /* synthetic */ void O(C1998g2 c1998g2, long j8) {
        c1998g2.zzd |= 8;
        c1998g2.zzh = j8;
    }

    public static /* synthetic */ void P(C1998g2 c1998g2) {
        c1998g2.zzd &= -9;
        c1998g2.zzh = 0L;
    }

    public static /* synthetic */ void Q(C1998g2 c1998g2, double d8) {
        c1998g2.zzd |= 32;
        c1998g2.zzj = d8;
    }

    public static /* synthetic */ void R(C1998g2 c1998g2) {
        c1998g2.zzd &= -33;
        c1998g2.zzj = 0.0d;
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
                    return new C1989f2(null);
                }
                return new C1998g2();
            }
            return AbstractC2112u4.s(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final double B() {
        return this.zzj;
    }

    public final long C() {
        return this.zzh;
    }

    public final long D() {
        return this.zze;
    }

    public final String G() {
        return this.zzf;
    }

    public final String H() {
        return this.zzg;
    }

    public final boolean S() {
        return (this.zzd & 32) != 0;
    }

    public final boolean T() {
        return (this.zzd & 8) != 0;
    }

    public final boolean U() {
        return (this.zzd & 1) != 0;
    }

    public final boolean V() {
        return (this.zzd & 4) != 0;
    }
}
