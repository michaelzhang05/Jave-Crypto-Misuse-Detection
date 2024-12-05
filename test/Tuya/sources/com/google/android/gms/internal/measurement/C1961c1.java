package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.c1 */
/* loaded from: classes3.dex */
public final class C1961c1 extends AbstractC2112u4 implements Z4 {
    private static final C1961c1 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private A4 zzg = AbstractC2112u4.p();
    private boolean zzh;
    private C2022j1 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        C1961c1 c1961c1 = new C1961c1();
        zza = c1961c1;
        AbstractC2112u4.w(C1961c1.class, c1961c1);
    }

    private C1961c1() {
    }

    public static C1952b1 D() {
        return (C1952b1) zza.i();
    }

    public static /* synthetic */ void K(C1961c1 c1961c1, String str) {
        c1961c1.zzd |= 2;
        c1961c1.zzf = str;
    }

    public static /* synthetic */ void M(C1961c1 c1961c1, int i8, C1979e1 c1979e1) {
        c1979e1.getClass();
        A4 a42 = c1961c1.zzg;
        if (!a42.c()) {
            c1961c1.zzg = AbstractC2112u4.q(a42);
        }
        c1961c1.zzg.set(i8, c1979e1);
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
                    return new C1952b1(null);
                }
                return new C1961c1();
            }
            return AbstractC2112u4.s(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", C1979e1.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }

    public final int B() {
        return this.zzg.size();
    }

    public final int C() {
        return this.zze;
    }

    public final C1979e1 F(int i8) {
        return (C1979e1) this.zzg.get(i8);
    }

    public final C2022j1 G() {
        C2022j1 c2022j1 = this.zzi;
        if (c2022j1 == null) {
            return C2022j1.C();
        }
        return c2022j1;
    }

    public final String H() {
        return this.zzf;
    }

    public final List J() {
        return this.zzg;
    }

    public final boolean N() {
        return this.zzj;
    }

    public final boolean O() {
        return this.zzk;
    }

    public final boolean P() {
        return this.zzl;
    }

    public final boolean Q() {
        return (this.zzd & 8) != 0;
    }

    public final boolean R() {
        return (this.zzd & 1) != 0;
    }

    public final boolean S() {
        return (this.zzd & 64) != 0;
    }
}
