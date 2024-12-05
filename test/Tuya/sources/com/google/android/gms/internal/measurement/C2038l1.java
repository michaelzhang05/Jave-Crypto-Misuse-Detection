package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.l1 */
/* loaded from: classes3.dex */
public final class C2038l1 extends AbstractC2112u4 implements Z4 {
    private static final C2038l1 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private C1979e1 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        C2038l1 c2038l1 = new C2038l1();
        zza = c2038l1;
        AbstractC2112u4.w(C2038l1.class, c2038l1);
    }

    private C2038l1() {
    }

    public static C2030k1 D() {
        return (C2030k1) zza.i();
    }

    public static /* synthetic */ void G(C2038l1 c2038l1, String str) {
        c2038l1.zzd |= 2;
        c2038l1.zzf = str;
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
                    return new C2030k1(null);
                }
                return new C2038l1();
            }
            return AbstractC2112u4.s(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final int B() {
        return this.zze;
    }

    public final C1979e1 C() {
        C1979e1 c1979e1 = this.zzg;
        if (c1979e1 == null) {
            return C1979e1.C();
        }
        return c1979e1;
    }

    public final String F() {
        return this.zzf;
    }

    public final boolean H() {
        return this.zzh;
    }

    public final boolean J() {
        return this.zzi;
    }

    public final boolean K() {
        return this.zzj;
    }

    public final boolean M() {
        return (this.zzd & 1) != 0;
    }

    public final boolean N() {
        return (this.zzd & 32) != 0;
    }
}
