package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.n2 */
/* loaded from: classes3.dex */
public final class C2055n2 extends AbstractC2112u4 implements Z4 {
    private static final C2055n2 zza;
    private int zzd;
    private A4 zze = AbstractC2112u4.p();
    private C2023j2 zzf;

    static {
        C2055n2 c2055n2 = new C2055n2();
        zza = c2055n2;
        AbstractC2112u4.w(C2055n2.class, c2055n2);
    }

    private C2055n2() {
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
                    return new C2047m2(null);
                }
                return new C2055n2();
            }
            return AbstractC2112u4.s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzd", "zze", C2094s2.class, "zzf"});
        }
        return (byte) 1;
    }

    public final C2023j2 B() {
        C2023j2 c2023j2 = this.zzf;
        if (c2023j2 == null) {
            return C2023j2.D();
        }
        return c2023j2;
    }

    public final List D() {
        return this.zze;
    }
}
