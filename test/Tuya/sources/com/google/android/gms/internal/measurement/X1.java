package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class X1 extends AbstractC2112u4 implements Z4 {
    public static final /* synthetic */ int zza = 0;
    private static final X1 zzd;
    private long zzB;
    private int zzC;
    private boolean zzF;
    private int zzI;
    private int zzJ;
    private int zzK;
    private long zzM;
    private long zzN;
    private int zzQ;
    private C1944a2 zzS;
    private long zzU;
    private long zzV;
    private int zzY;
    private boolean zzZ;
    private boolean zzab;
    private S1 zzac;
    private long zzag;
    private int zze;
    private int zzf;
    private int zzg;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private int zzs;
    private long zzw;
    private long zzx;
    private boolean zzz;
    private A4 zzh = AbstractC2112u4.p();
    private A4 zzi = AbstractC2112u4.p();
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzt = "";
    private String zzu = "";
    private String zzv = "";
    private String zzy = "";
    private String zzA = "";
    private String zzD = "";
    private String zzE = "";
    private A4 zzG = AbstractC2112u4.p();
    private String zzH = "";
    private String zzL = "";
    private String zzO = "";
    private String zzP = "";
    private String zzR = "";
    private InterfaceC2144y4 zzT = AbstractC2112u4.m();
    private String zzW = "";
    private String zzX = "";
    private String zzaa = "";
    private String zzad = "";
    private A4 zzae = AbstractC2112u4.p();
    private String zzaf = "";

    static {
        X1 x12 = new X1();
        zzd = x12;
        AbstractC2112u4.w(X1.class, x12);
    }

    private X1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void A0(X1 x12) {
        x12.zze &= -268435457;
        x12.zzL = zzd.zzL;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void B0(X1 x12, long j8) {
        x12.zze |= 536870912;
        x12.zzM = j8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void E0(X1 x12, Iterable iterable) {
        x12.f1();
        H3.f(iterable, x12.zzh);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void F0(X1 x12, String str) {
        str.getClass();
        x12.zzf |= 8192;
        x12.zzad = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void G0(X1 x12) {
        x12.zzf &= -8193;
        x12.zzad = zzd.zzad;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void H0(X1 x12, Iterable iterable) {
        A4 a42 = x12.zzae;
        if (!a42.c()) {
            x12.zzae = AbstractC2112u4.q(a42);
        }
        H3.f(iterable, x12.zzae);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void J0(X1 x12, String str) {
        str.getClass();
        x12.zzf |= 16384;
        x12.zzaf = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void K0(X1 x12, long j8) {
        x12.zzf |= 32768;
        x12.zzag = j8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void L0(X1 x12, int i8) {
        x12.f1();
        x12.zzh.remove(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void M0(X1 x12, int i8, C1998g2 c1998g2) {
        c1998g2.getClass();
        x12.g1();
        x12.zzi.set(i8, c1998g2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void N0(X1 x12, C1998g2 c1998g2) {
        c1998g2.getClass();
        x12.g1();
        x12.zzi.add(c1998g2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void O0(X1 x12, Iterable iterable) {
        x12.g1();
        H3.f(iterable, x12.zzi);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void P0(X1 x12, int i8) {
        x12.g1();
        x12.zzi.remove(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void Q0(X1 x12, long j8) {
        x12.zze |= 2;
        x12.zzj = j8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void R0(X1 x12, long j8) {
        x12.zze |= 4;
        x12.zzk = j8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void S0(X1 x12, long j8) {
        x12.zze |= 8;
        x12.zzl = j8;
    }

    public static W1 S1() {
        return (W1) zzd.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void T(X1 x12) {
        x12.zze &= Integer.MAX_VALUE;
        x12.zzO = zzd.zzO;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void T0(X1 x12, long j8) {
        x12.zze |= 16;
        x12.zzm = j8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void U(X1 x12, int i8) {
        x12.zzf |= 2;
        x12.zzQ = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void U0(X1 x12) {
        x12.zze &= -17;
        x12.zzm = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void V(X1 x12, int i8, M1 m12) {
        m12.getClass();
        x12.f1();
        x12.zzh.set(i8, m12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void V0(X1 x12, long j8) {
        x12.zze |= 32;
        x12.zzn = j8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void W(X1 x12, String str) {
        str.getClass();
        x12.zzf |= 4;
        x12.zzR = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void W0(X1 x12) {
        x12.zze &= -33;
        x12.zzn = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void X(X1 x12, C1944a2 c1944a2) {
        c1944a2.getClass();
        x12.zzS = c1944a2;
        x12.zzf |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void X0(X1 x12, String str) {
        x12.zze |= 64;
        x12.zzo = "android";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void Y(X1 x12, Iterable iterable) {
        int i8;
        InterfaceC2144y4 interfaceC2144y4 = x12.zzT;
        if (!interfaceC2144y4.c()) {
            int size = interfaceC2144y4.size();
            if (size == 0) {
                i8 = 10;
            } else {
                i8 = size + size;
            }
            x12.zzT = interfaceC2144y4.k(i8);
        }
        H3.f(iterable, x12.zzT);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void Y0(X1 x12, String str) {
        str.getClass();
        x12.zze |= 128;
        x12.zzp = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void Z(X1 x12, M1 m12) {
        m12.getClass();
        x12.f1();
        x12.zzh.add(m12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void Z0(X1 x12) {
        x12.zze &= -129;
        x12.zzp = zzd.zzp;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a0(X1 x12, long j8) {
        x12.zzf |= 16;
        x12.zzU = j8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a1(X1 x12, String str) {
        str.getClass();
        x12.zze |= 256;
        x12.zzq = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b0(X1 x12, long j8) {
        x12.zzf |= 32;
        x12.zzV = j8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b1(X1 x12) {
        x12.zze &= -257;
        x12.zzq = zzd.zzq;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c0(X1 x12, String str) {
        x12.zzf |= 128;
        x12.zzX = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c1(X1 x12, String str) {
        str.getClass();
        x12.zze |= 512;
        x12.zzr = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void d1(X1 x12, int i8) {
        x12.zze |= 1024;
        x12.zzs = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void e0(X1 x12, String str) {
        str.getClass();
        x12.zze |= 2048;
        x12.zzt = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void f0(X1 x12, String str) {
        str.getClass();
        x12.zze |= 4096;
        x12.zzu = str;
    }

    private final void f1() {
        A4 a42 = this.zzh;
        if (!a42.c()) {
            this.zzh = AbstractC2112u4.q(a42);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void g0(X1 x12, String str) {
        str.getClass();
        x12.zze |= 8192;
        x12.zzv = str;
    }

    private final void g1() {
        A4 a42 = this.zzi;
        if (!a42.c()) {
            this.zzi = AbstractC2112u4.q(a42);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void h0(X1 x12, long j8) {
        x12.zze |= 16384;
        x12.zzw = j8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void i0(X1 x12, long j8) {
        x12.zze |= 32768;
        x12.zzx = 79000L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void j0(X1 x12, String str) {
        str.getClass();
        x12.zze |= 65536;
        x12.zzy = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void k0(X1 x12) {
        x12.zze &= -65537;
        x12.zzy = zzd.zzy;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void l0(X1 x12, boolean z8) {
        x12.zze |= 131072;
        x12.zzz = z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void m0(X1 x12) {
        x12.zze &= -131073;
        x12.zzz = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void n0(X1 x12, String str) {
        str.getClass();
        x12.zze |= 262144;
        x12.zzA = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void o0(X1 x12) {
        x12.zze &= -262145;
        x12.zzA = zzd.zzA;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void p0(X1 x12, long j8) {
        x12.zze |= 524288;
        x12.zzB = j8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void q0(X1 x12, int i8) {
        x12.zze |= 1048576;
        x12.zzC = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void r0(X1 x12, String str) {
        x12.zze |= 2097152;
        x12.zzD = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void s0(X1 x12) {
        x12.zze &= -2097153;
        x12.zzD = zzd.zzD;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void t0(X1 x12, String str) {
        str.getClass();
        x12.zze |= 4194304;
        x12.zzE = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void u0(X1 x12, boolean z8) {
        x12.zze |= 8388608;
        x12.zzF = z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void v0(X1 x12, Iterable iterable) {
        A4 a42 = x12.zzG;
        if (!a42.c()) {
            x12.zzG = AbstractC2112u4.q(a42);
        }
        H3.f(iterable, x12.zzG);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void x0(X1 x12, String str) {
        str.getClass();
        x12.zze |= 16777216;
        x12.zzH = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void y0(X1 x12, int i8) {
        x12.zze |= 33554432;
        x12.zzI = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void z0(X1 x12, int i8) {
        x12.zze |= 1;
        x12.zzg = 1;
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
                        return zzd;
                    }
                    return new W1(d12);
                }
                return new X1();
            }
            return AbstractC2112u4.s(zzd, "\u00015\u0000\u0002\u0001C5\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/", new Object[]{"zze", "zzf", "zzg", "zzh", M1.class, "zzi", C1998g2.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzm", "zzF", "zzG", I1.class, "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", E1.f15302a, "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag"});
        }
        return (byte) 1;
    }

    public final boolean A1() {
        return (this.zze & 32768) != 0;
    }

    public final String B() {
        return this.zzt;
    }

    public final int B1() {
        return this.zzh.size();
    }

    public final String C() {
        return this.zzv;
    }

    public final boolean C0() {
        return this.zzz;
    }

    public final int C1() {
        return this.zzg;
    }

    public final String D() {
        return this.zzX;
    }

    public final boolean D0() {
        return this.zzF;
    }

    public final int D1() {
        return this.zzQ;
    }

    public final String E() {
        return this.zzq;
    }

    public final int E1() {
        return this.zzs;
    }

    public final String F() {
        return this.zzO;
    }

    public final int F1() {
        return this.zzi.size();
    }

    public final String G() {
        return this.zzH;
    }

    public final long G1() {
        return this.zzM;
    }

    public final String H() {
        return this.zzE;
    }

    public final long H1() {
        return this.zzB;
    }

    public final long I1() {
        return this.zzU;
    }

    public final String J() {
        return this.zzD;
    }

    public final long J1() {
        return this.zzl;
    }

    public final String K() {
        return this.zzp;
    }

    public final long K1() {
        return this.zzw;
    }

    public final long L1() {
        return this.zzn;
    }

    public final String M() {
        return this.zzo;
    }

    public final long M1() {
        return this.zzm;
    }

    public final String N() {
        return this.zzy;
    }

    public final long N1() {
        return this.zzk;
    }

    public final String O() {
        return this.zzad;
    }

    public final long O1() {
        return this.zzag;
    }

    public final String P() {
        return this.zzr;
    }

    public final long P1() {
        return this.zzj;
    }

    public final List Q() {
        return this.zzG;
    }

    public final long Q1() {
        return this.zzx;
    }

    public final List R() {
        return this.zzh;
    }

    public final M1 R1(int i8) {
        return (M1) this.zzh.get(i8);
    }

    public final List S() {
        return this.zzi;
    }

    public final C1998g2 U1(int i8) {
        return (C1998g2) this.zzi.get(i8);
    }

    public final String V1() {
        return this.zzR;
    }

    public final String W1() {
        return this.zzu;
    }

    public final String X1() {
        return this.zzA;
    }

    public final int d0() {
        return this.zzI;
    }

    public final int e1() {
        return this.zzC;
    }

    public final boolean h1() {
        return (this.zze & 33554432) != 0;
    }

    public final boolean i1() {
        return (this.zze & 1048576) != 0;
    }

    public final boolean j1() {
        return (this.zze & 536870912) != 0;
    }

    public final boolean k1() {
        return (this.zzf & 128) != 0;
    }

    public final boolean l1() {
        return (this.zze & 524288) != 0;
    }

    public final boolean m1() {
        return (this.zzf & 16) != 0;
    }

    public final boolean n1() {
        return (this.zze & 8) != 0;
    }

    public final boolean o1() {
        return (this.zze & 16384) != 0;
    }

    public final boolean p1() {
        return (this.zze & 131072) != 0;
    }

    public final boolean q1() {
        return (this.zze & 32) != 0;
    }

    public final boolean r1() {
        return (this.zze & 16) != 0;
    }

    public final boolean s1() {
        return (this.zze & 1) != 0;
    }

    public final boolean t1() {
        return (this.zzf & 2) != 0;
    }

    public final boolean u1() {
        return (this.zze & 8388608) != 0;
    }

    public final boolean v1() {
        return (this.zzf & 8192) != 0;
    }

    public final boolean w1() {
        return (this.zze & 4) != 0;
    }

    public final boolean x1() {
        return (this.zzf & 32768) != 0;
    }

    public final boolean y1() {
        return (this.zze & 1024) != 0;
    }

    public final boolean z1() {
        return (this.zze & 2) != 0;
    }
}
