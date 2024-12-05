package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.w1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2125w1 extends AbstractC2112u4 implements Z4 {
    private static final C2125w1 zza;
    private int zzd;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        C2125w1 c2125w1 = new C2125w1();
        zza = c2125w1;
        AbstractC2112u4.w(C2125w1.class, c2125w1);
    }

    private C2125w1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void E(C2125w1 c2125w1, String str) {
        str.getClass();
        c2125w1.zzd |= 1;
        c2125w1.zze = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2112u4
    public final Object A(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 != 0) {
            if (i9 != 2) {
                if (i9 != 3) {
                    AbstractC2085r1 abstractC2085r1 = null;
                    if (i9 != 4) {
                        if (i9 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new C2117v1(abstractC2085r1);
                }
                return new C2125w1();
            }
            return AbstractC2112u4.s(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final int B() {
        return this.zzh;
    }

    public final String D() {
        return this.zze;
    }

    public final boolean F() {
        return this.zzf;
    }

    public final boolean G() {
        return this.zzg;
    }

    public final boolean H() {
        return (this.zzd & 2) != 0;
    }

    public final boolean J() {
        return (this.zzd & 4) != 0;
    }

    public final boolean K() {
        return (this.zzd & 8) != 0;
    }
}
