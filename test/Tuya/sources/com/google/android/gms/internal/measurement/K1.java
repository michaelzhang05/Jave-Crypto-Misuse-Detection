package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class K1 extends AbstractC2112u4 implements Z4 {
    private static final K1 zza;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        K1 k12 = new K1();
        zza = k12;
        AbstractC2112u4.w(K1.class, k12);
    }

    private K1() {
    }

    public static J1 D() {
        return (J1) zza.i();
    }

    public static /* synthetic */ void F(K1 k12, int i8) {
        k12.zzd |= 1;
        k12.zze = i8;
    }

    public static /* synthetic */ void G(K1 k12, long j8) {
        k12.zzd |= 2;
        k12.zzf = j8;
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
                    return new J1(null);
                }
                return new K1();
            }
            return AbstractC2112u4.s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int B() {
        return this.zze;
    }

    public final long C() {
        return this.zzf;
    }

    public final boolean H() {
        return (this.zzd & 2) != 0;
    }

    public final boolean J() {
        return (this.zzd & 1) != 0;
    }
}
