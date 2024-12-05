package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.a2 */
/* loaded from: classes3.dex */
public final class C1944a2 extends AbstractC2112u4 implements Z4 {
    private static final C1944a2 zza;
    private int zzd;
    private int zze = 1;
    private A4 zzf = AbstractC2112u4.p();

    static {
        C1944a2 c1944a2 = new C1944a2();
        zza = c1944a2;
        AbstractC2112u4.w(C1944a2.class, c1944a2);
    }

    private C1944a2() {
    }

    public static Y1 B() {
        return (Y1) zza.i();
    }

    public static /* synthetic */ void D(C1944a2 c1944a2, O1 o12) {
        o12.getClass();
        A4 a42 = c1944a2.zzf;
        if (!a42.c()) {
            c1944a2.zzf = AbstractC2112u4.q(a42);
        }
        c1944a2.zzf.add(o12);
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
                    return new Y1(null);
                }
                return new C1944a2();
            }
            return AbstractC2112u4.s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzd", "zze", Z1.f15630a, "zzf", O1.class});
        }
        return (byte) 1;
    }
}
