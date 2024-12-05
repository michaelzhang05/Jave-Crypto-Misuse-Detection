package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class Q1 extends AbstractC2112u4 implements Z4 {
    private static final Q1 zza;
    private int zzd;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private A4 zzj = AbstractC2112u4.p();

    static {
        Q1 q12 = new Q1();
        zza = q12;
        AbstractC2112u4.w(Q1.class, q12);
    }

    private Q1() {
    }

    public static P1 F() {
        return (P1) zza.i();
    }

    public static /* synthetic */ void M(Q1 q12, String str) {
        str.getClass();
        q12.zzd |= 1;
        q12.zze = str;
    }

    public static /* synthetic */ void N(Q1 q12, String str) {
        str.getClass();
        q12.zzd |= 2;
        q12.zzf = str;
    }

    public static /* synthetic */ void O(Q1 q12) {
        q12.zzd &= -3;
        q12.zzf = zza.zzf;
    }

    public static /* synthetic */ void P(Q1 q12, long j8) {
        q12.zzd |= 4;
        q12.zzg = j8;
    }

    public static /* synthetic */ void Q(Q1 q12) {
        q12.zzd &= -5;
        q12.zzg = 0L;
    }

    public static /* synthetic */ void R(Q1 q12, double d8) {
        q12.zzd |= 16;
        q12.zzi = d8;
    }

    public static /* synthetic */ void S(Q1 q12) {
        q12.zzd &= -17;
        q12.zzi = 0.0d;
    }

    public static /* synthetic */ void T(Q1 q12, Q1 q13) {
        q13.getClass();
        q12.b0();
        q12.zzj.add(q13);
    }

    public static /* synthetic */ void U(Q1 q12, Iterable iterable) {
        q12.b0();
        H3.f(iterable, q12.zzj);
    }

    private final void b0() {
        A4 a42 = this.zzj;
        if (!a42.c()) {
            this.zzj = AbstractC2112u4.q(a42);
        }
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
                    return new P1(null);
                }
                return new Q1();
            }
            return AbstractC2112u4.s(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", Q1.class});
        }
        return (byte) 1;
    }

    public final double B() {
        return this.zzi;
    }

    public final float C() {
        return this.zzh;
    }

    public final int D() {
        return this.zzj.size();
    }

    public final long E() {
        return this.zzg;
    }

    public final String H() {
        return this.zze;
    }

    public final String J() {
        return this.zzf;
    }

    public final List K() {
        return this.zzj;
    }

    public final boolean W() {
        return (this.zzd & 16) != 0;
    }

    public final boolean X() {
        return (this.zzd & 8) != 0;
    }

    public final boolean Y() {
        return (this.zzd & 4) != 0;
    }

    public final boolean Z() {
        return (this.zzd & 1) != 0;
    }

    public final boolean a0() {
        return (this.zzd & 2) != 0;
    }
}
