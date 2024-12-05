package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class I1 extends AbstractC2112u4 implements Z4 {
    private static final I1 zza;
    private int zzd;
    private int zze;
    private C1962c2 zzf;
    private C1962c2 zzg;
    private boolean zzh;

    static {
        I1 i12 = new I1();
        zza = i12;
        AbstractC2112u4.w(I1.class, i12);
    }

    private I1() {
    }

    public static H1 C() {
        return (H1) zza.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void G(I1 i12, int i8) {
        i12.zzd |= 1;
        i12.zze = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void H(I1 i12, C1962c2 c1962c2) {
        c1962c2.getClass();
        i12.zzf = c1962c2;
        i12.zzd |= 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void J(I1 i12, C1962c2 c1962c2) {
        i12.zzg = c1962c2;
        i12.zzd |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void K(I1 i12, boolean z8) {
        i12.zzd |= 8;
        i12.zzh = z8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2112u4
    public final Object A(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 != 0) {
            if (i9 != 2) {
                if (i9 != 3) {
                    D1 d12 = null;
                    if (i9 != 4) {
                        if (i9 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new H1(d12);
                }
                return new I1();
            }
            return AbstractC2112u4.s(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final int B() {
        return this.zze;
    }

    public final C1962c2 E() {
        C1962c2 c1962c2 = this.zzf;
        if (c1962c2 == null) {
            return C1962c2.H();
        }
        return c1962c2;
    }

    public final C1962c2 F() {
        C1962c2 c1962c2 = this.zzg;
        if (c1962c2 == null) {
            return C1962c2.H();
        }
        return c1962c2;
    }

    public final boolean M() {
        return this.zzh;
    }

    public final boolean N() {
        return (this.zzd & 1) != 0;
    }

    public final boolean O() {
        return (this.zzd & 8) != 0;
    }

    public final boolean P() {
        return (this.zzd & 4) != 0;
    }
}
