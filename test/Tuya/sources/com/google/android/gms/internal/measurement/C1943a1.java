package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.a1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1943a1 extends AbstractC2112u4 implements Z4 {
    private static final C1943a1 zza;
    private int zzd;
    private int zze;
    private A4 zzf = AbstractC2112u4.p();
    private A4 zzg = AbstractC2112u4.p();
    private boolean zzh;
    private boolean zzi;

    static {
        C1943a1 c1943a1 = new C1943a1();
        zza = c1943a1;
        AbstractC2112u4.w(C1943a1.class, c1943a1);
    }

    private C1943a1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void K(C1943a1 c1943a1, int i8, C2038l1 c2038l1) {
        c2038l1.getClass();
        A4 a42 = c1943a1.zzf;
        if (!a42.c()) {
            c1943a1.zzf = AbstractC2112u4.q(a42);
        }
        c1943a1.zzf.set(i8, c2038l1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void M(C1943a1 c1943a1, int i8, C1961c1 c1961c1) {
        c1961c1.getClass();
        A4 a42 = c1943a1.zzg;
        if (!a42.c()) {
            c1943a1.zzg = AbstractC2112u4.q(a42);
        }
        c1943a1.zzg.set(i8, c1961c1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2112u4
    public final Object A(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 != 0) {
            if (i9 != 2) {
                if (i9 != 3) {
                    Y0 y02 = null;
                    if (i9 != 4) {
                        if (i9 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new Z0(y02);
                }
                return new C1943a1();
            }
            return AbstractC2112u4.s(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzd", "zze", "zzf", C2038l1.class, "zzg", C1961c1.class, "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final int B() {
        return this.zze;
    }

    public final int C() {
        return this.zzg.size();
    }

    public final int D() {
        return this.zzf.size();
    }

    public final C1961c1 F(int i8) {
        return (C1961c1) this.zzg.get(i8);
    }

    public final C2038l1 G(int i8) {
        return (C2038l1) this.zzf.get(i8);
    }

    public final List H() {
        return this.zzg;
    }

    public final List J() {
        return this.zzf;
    }

    public final boolean N() {
        return (this.zzd & 1) != 0;
    }
}
