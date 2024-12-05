package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.s2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2094s2 extends AbstractC2112u4 implements Z4 {
    private static final C2094s2 zza;
    private int zzd;
    private int zze;
    private A4 zzf = AbstractC2112u4.p();
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        C2094s2 c2094s2 = new C2094s2();
        zza = c2094s2;
        AbstractC2112u4.w(C2094s2.class, c2094s2);
    }

    private C2094s2() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2112u4
    public final Object A(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 != 0) {
            if (i9 != 2) {
                if (i9 != 3) {
                    AbstractC2007h2 abstractC2007h2 = null;
                    if (i9 != 4) {
                        if (i9 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new C2063o2(abstractC2007h2);
                }
                return new C2094s2();
            }
            return AbstractC2112u4.s(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzd", "zze", C2079q2.f15853a, "zzf", C2094s2.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final double B() {
        return this.zzj;
    }

    public final String D() {
        return this.zzg;
    }

    public final String E() {
        return this.zzh;
    }

    public final List F() {
        return this.zzf;
    }

    public final boolean G() {
        return this.zzi;
    }

    public final boolean H() {
        return (this.zzd & 8) != 0;
    }

    public final boolean J() {
        return (this.zzd & 16) != 0;
    }

    public final boolean K() {
        return (this.zzd & 4) != 0;
    }

    public final int M() {
        int a8 = AbstractC2086r2.a(this.zze);
        if (a8 == 0) {
            return 1;
        }
        return a8;
    }
}
