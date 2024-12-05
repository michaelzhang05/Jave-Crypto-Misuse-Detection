package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.j2 */
/* loaded from: classes3.dex */
public final class C2023j2 extends AbstractC2112u4 implements Z4 {
    private static final C2023j2 zza;
    private A4 zzd = AbstractC2112u4.p();

    static {
        C2023j2 c2023j2 = new C2023j2();
        zza = c2023j2;
        AbstractC2112u4.w(C2023j2.class, c2023j2);
    }

    private C2023j2() {
    }

    public static C2023j2 D() {
        return zza;
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
                    return new C2015i2(null);
                }
                return new C2023j2();
            }
            return AbstractC2112u4.s(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C2039l2.class});
        }
        return (byte) 1;
    }

    public final int B() {
        return this.zzd.size();
    }

    public final List E() {
        return this.zzd;
    }
}
