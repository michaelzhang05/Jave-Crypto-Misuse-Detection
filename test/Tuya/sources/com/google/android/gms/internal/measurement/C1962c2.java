package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.c2 */
/* loaded from: classes3.dex */
public final class C1962c2 extends AbstractC2112u4 implements Z4 {
    private static final C1962c2 zza;
    private InterfaceC2152z4 zzd = AbstractC2112u4.n();
    private InterfaceC2152z4 zze = AbstractC2112u4.n();
    private A4 zzf = AbstractC2112u4.p();
    private A4 zzg = AbstractC2112u4.p();

    static {
        C1962c2 c1962c2 = new C1962c2();
        zza = c1962c2;
        AbstractC2112u4.w(C1962c2.class, c1962c2);
    }

    private C1962c2() {
    }

    public static C1953b2 F() {
        return (C1953b2) zza.i();
    }

    public static C1962c2 H() {
        return zza;
    }

    public static /* synthetic */ void O(C1962c2 c1962c2, Iterable iterable) {
        InterfaceC2152z4 interfaceC2152z4 = c1962c2.zzd;
        if (!interfaceC2152z4.c()) {
            c1962c2.zzd = AbstractC2112u4.o(interfaceC2152z4);
        }
        H3.f(iterable, c1962c2.zzd);
    }

    public static /* synthetic */ void Q(C1962c2 c1962c2, Iterable iterable) {
        InterfaceC2152z4 interfaceC2152z4 = c1962c2.zze;
        if (!interfaceC2152z4.c()) {
            c1962c2.zze = AbstractC2112u4.o(interfaceC2152z4);
        }
        H3.f(iterable, c1962c2.zze);
    }

    public static /* synthetic */ void S(C1962c2 c1962c2, Iterable iterable) {
        A4 a42 = c1962c2.zzf;
        if (!a42.c()) {
            c1962c2.zzf = AbstractC2112u4.q(a42);
        }
        H3.f(iterable, c1962c2.zzf);
    }

    public static /* synthetic */ void U(C1962c2 c1962c2, Iterable iterable) {
        A4 a42 = c1962c2.zzg;
        if (!a42.c()) {
            c1962c2.zzg = AbstractC2112u4.q(a42);
        }
        H3.f(iterable, c1962c2.zzg);
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
                    return new C1953b2(null);
                }
                return new C1962c2();
            }
            return AbstractC2112u4.s(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzd", "zze", "zzf", K1.class, "zzg", C1980e2.class});
        }
        return (byte) 1;
    }

    public final int B() {
        return this.zzf.size();
    }

    public final int C() {
        return this.zze.size();
    }

    public final int D() {
        return this.zzg.size();
    }

    public final int E() {
        return this.zzd.size();
    }

    public final List J() {
        return this.zzf;
    }

    public final List K() {
        return this.zze;
    }

    public final List M() {
        return this.zzg;
    }

    public final List N() {
        return this.zzd;
    }
}
