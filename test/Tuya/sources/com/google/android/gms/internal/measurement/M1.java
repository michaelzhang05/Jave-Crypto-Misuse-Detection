package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class M1 extends AbstractC2112u4 implements Z4 {
    private static final M1 zza;
    private int zzd;
    private A4 zze = AbstractC2112u4.p();
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        M1 m12 = new M1();
        zza = m12;
        AbstractC2112u4.w(M1.class, m12);
    }

    private M1() {
    }

    public static L1 F() {
        return (L1) zza.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void M(M1 m12, int i8, Q1 q12) {
        q12.getClass();
        m12.X();
        m12.zze.set(i8, q12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void N(M1 m12, Q1 q12) {
        q12.getClass();
        m12.X();
        m12.zze.add(q12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void O(M1 m12, Iterable iterable) {
        m12.X();
        H3.f(iterable, m12.zze);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void Q(M1 m12, int i8) {
        m12.X();
        m12.zze.remove(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void R(M1 m12, String str) {
        str.getClass();
        m12.zzd |= 1;
        m12.zzf = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void S(M1 m12, long j8) {
        m12.zzd |= 2;
        m12.zzg = j8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void T(M1 m12, long j8) {
        m12.zzd |= 4;
        m12.zzh = j8;
    }

    private final void X() {
        A4 a42 = this.zze;
        if (!a42.c()) {
            this.zze = AbstractC2112u4.q(a42);
        }
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
                    return new L1(d12);
                }
                return new M1();
            }
            return AbstractC2112u4.s(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzd", "zze", Q1.class, "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final int B() {
        return this.zzi;
    }

    public final int C() {
        return this.zze.size();
    }

    public final long D() {
        return this.zzh;
    }

    public final long E() {
        return this.zzg;
    }

    public final Q1 H(int i8) {
        return (Q1) this.zze.get(i8);
    }

    public final String J() {
        return this.zzf;
    }

    public final List K() {
        return this.zze;
    }

    public final boolean U() {
        return (this.zzd & 8) != 0;
    }

    public final boolean V() {
        return (this.zzd & 4) != 0;
    }

    public final boolean W() {
        return (this.zzd & 2) != 0;
    }
}
