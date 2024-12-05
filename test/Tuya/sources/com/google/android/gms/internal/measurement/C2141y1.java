package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.y1 */
/* loaded from: classes3.dex */
public final class C2141y1 extends AbstractC2112u4 implements Z4 {
    private static final C2141y1 zza;
    private int zzd;
    private long zze;
    private int zzg;
    private boolean zzl;
    private String zzf = "";
    private A4 zzh = AbstractC2112u4.p();
    private A4 zzi = AbstractC2112u4.p();
    private A4 zzj = AbstractC2112u4.p();
    private String zzk = "";
    private A4 zzm = AbstractC2112u4.p();
    private A4 zzn = AbstractC2112u4.p();
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";

    static {
        C2141y1 c2141y1 = new C2141y1();
        zza = c2141y1;
        AbstractC2112u4.w(C2141y1.class, c2141y1);
    }

    private C2141y1() {
    }

    public static C2133x1 F() {
        return (C2133x1) zza.i();
    }

    public static C2141y1 H() {
        return zza;
    }

    public static /* synthetic */ void S(C2141y1 c2141y1, int i8, C2125w1 c2125w1) {
        c2125w1.getClass();
        A4 a42 = c2141y1.zzi;
        if (!a42.c()) {
            c2141y1.zzi = AbstractC2112u4.q(a42);
        }
        c2141y1.zzi.set(i8, c2125w1);
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
                    return new C2133x1(null);
                }
                return new C2141y1();
            }
            return AbstractC2112u4.s(zza, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\fဈ\u0006\rဈ\u0007\u000eဈ\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C1.class, "zzi", C2125w1.class, "zzj", C1943a1.class, "zzk", "zzl", "zzm", C2055n2.class, "zzn", C2109u1.class, "zzo", "zzp", "zzq", "zzr"});
        }
        return (byte) 1;
    }

    public final int B() {
        return this.zzm.size();
    }

    public final int C() {
        return this.zzi.size();
    }

    public final long D() {
        return this.zze;
    }

    public final C2125w1 E(int i8) {
        return (C2125w1) this.zzi.get(i8);
    }

    public final String J() {
        return this.zzf;
    }

    public final String K() {
        return this.zzq;
    }

    public final String M() {
        return this.zzp;
    }

    public final String N() {
        return this.zzo;
    }

    public final List O() {
        return this.zzj;
    }

    public final List P() {
        return this.zzn;
    }

    public final List Q() {
        return this.zzm;
    }

    public final List R() {
        return this.zzh;
    }

    public final boolean U() {
        return this.zzl;
    }

    public final boolean V() {
        return (this.zzd & 2) != 0;
    }

    public final boolean W() {
        return (this.zzd & 1) != 0;
    }
}
