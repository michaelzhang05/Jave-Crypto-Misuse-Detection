package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.e2 */
/* loaded from: classes3.dex */
public final class C1980e2 extends AbstractC2112u4 implements Z4 {
    private static final C1980e2 zza;
    private int zzd;
    private int zze;
    private InterfaceC2152z4 zzf = AbstractC2112u4.n();

    static {
        C1980e2 c1980e2 = new C1980e2();
        zza = c1980e2;
        AbstractC2112u4.w(C1980e2.class, c1980e2);
    }

    private C1980e2() {
    }

    public static C1971d2 E() {
        return (C1971d2) zza.i();
    }

    public static /* synthetic */ void H(C1980e2 c1980e2, int i8) {
        c1980e2.zzd |= 1;
        c1980e2.zze = i8;
    }

    public static /* synthetic */ void J(C1980e2 c1980e2, Iterable iterable) {
        InterfaceC2152z4 interfaceC2152z4 = c1980e2.zzf;
        if (!interfaceC2152z4.c()) {
            c1980e2.zzf = AbstractC2112u4.o(interfaceC2152z4);
        }
        H3.f(iterable, c1980e2.zzf);
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
                    return new C1971d2(null);
                }
                return new C1980e2();
            }
            return AbstractC2112u4.s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int B() {
        return this.zzf.size();
    }

    public final int C() {
        return this.zze;
    }

    public final long D(int i8) {
        return this.zzf.j(i8);
    }

    public final List G() {
        return this.zzf;
    }

    public final boolean K() {
        return (this.zzd & 1) != 0;
    }
}
