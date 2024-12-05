package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.l2 */
/* loaded from: classes3.dex */
public final class C2039l2 extends AbstractC2112u4 implements Z4 {
    private static final C2039l2 zza;
    private int zzd;
    private String zze = "";
    private A4 zzf = AbstractC2112u4.p();

    static {
        C2039l2 c2039l2 = new C2039l2();
        zza = c2039l2;
        AbstractC2112u4.w(C2039l2.class, c2039l2);
    }

    private C2039l2() {
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
                    return new C2031k2(null);
                }
                return new C2039l2();
            }
            return AbstractC2112u4.s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", C2094s2.class});
        }
        return (byte) 1;
    }

    public final String C() {
        return this.zze;
    }

    public final List D() {
        return this.zzf;
    }
}
