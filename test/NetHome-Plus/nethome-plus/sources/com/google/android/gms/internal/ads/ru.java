package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ru implements lw {
    private final zzdnd a;

    /* renamed from: b, reason: collision with root package name */
    private int f12123b;

    /* renamed from: c, reason: collision with root package name */
    private int f12124c;

    /* renamed from: d, reason: collision with root package name */
    private int f12125d = 0;

    private ru(zzdnd zzdndVar) {
        zzdnd zzdndVar2 = (zzdnd) zzdod.d(zzdndVar, "input");
        this.a = zzdndVar2;
        zzdndVar2.f14811d = this;
    }

    public static ru N(zzdnd zzdndVar) {
        ru ruVar = zzdndVar.f14811d;
        return ruVar != null ? ruVar : new ru(zzdndVar);
    }

    private final void O(List<String> list, boolean z) throws IOException {
        int d2;
        int d3;
        if ((this.f12123b & 7) == 2) {
            if ((list instanceof zzdot) && !z) {
                zzdot zzdotVar = (zzdot) list;
                do {
                    zzdotVar.u(u());
                    if (this.a.t()) {
                        return;
                    } else {
                        d3 = this.a.d();
                    }
                } while (d3 == this.f12123b);
                this.f12125d = d3;
                return;
            }
            do {
                list.add(z ? m() : B());
                if (this.a.t()) {
                    return;
                } else {
                    d2 = this.a.d();
                }
            } while (d2 == this.f12123b);
            this.f12125d = d2;
            return;
        }
        throw zzdok.f();
    }

    private final <T> T P(mw<T> mwVar, zzdno zzdnoVar) throws IOException {
        int m = this.a.m();
        zzdnd zzdndVar = this.a;
        if (zzdndVar.a < zzdndVar.f14809b) {
            int z = zzdndVar.z(m);
            T j2 = mwVar.j();
            this.a.a++;
            mwVar.g(j2, this, zzdnoVar);
            mwVar.e(j2);
            this.a.x(0);
            r5.a--;
            this.a.A(z);
            return j2;
        }
        throw new zzdok("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private final <T> T Q(mw<T> mwVar, zzdno zzdnoVar) throws IOException {
        int i2 = this.f12124c;
        this.f12124c = ((this.f12123b >>> 3) << 3) | 4;
        try {
            T j2 = mwVar.j();
            mwVar.g(j2, this, zzdnoVar);
            mwVar.e(j2);
            if (this.f12123b == this.f12124c) {
                return j2;
            }
            throw zzdok.g();
        } finally {
            this.f12124c = i2;
        }
    }

    private final void R(int i2) throws IOException {
        if ((this.f12123b & 7) != i2) {
            throw zzdok.f();
        }
    }

    private static void S(int i2) throws IOException {
        if ((i2 & 7) != 0) {
            throw zzdok.g();
        }
    }

    private static void T(int i2) throws IOException {
        if ((i2 & 3) != 0) {
            throw zzdok.g();
        }
    }

    private final void U(int i2) throws IOException {
        if (this.a.u() != i2) {
            throw zzdok.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final void A(List<Long> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof pv) {
            pv pvVar = (pv) list;
            int i2 = this.f12123b & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int u = this.a.u() + this.a.m();
                    do {
                        pvVar.w(this.a.e());
                    } while (this.a.u() < u);
                    U(u);
                    return;
                }
                throw zzdok.f();
            }
            do {
                pvVar.w(this.a.e());
                if (this.a.t()) {
                    return;
                } else {
                    d3 = this.a.d();
                }
            } while (d3 == this.f12123b);
            this.f12125d = d3;
            return;
        }
        int i3 = this.f12123b & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                int u2 = this.a.u() + this.a.m();
                do {
                    list.add(Long.valueOf(this.a.e()));
                } while (this.a.u() < u2);
                U(u2);
                return;
            }
            throw zzdok.f();
        }
        do {
            list.add(Long.valueOf(this.a.e()));
            if (this.a.t()) {
                return;
            } else {
                d2 = this.a.d();
            }
        } while (d2 == this.f12123b);
        this.f12125d = d2;
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final String B() throws IOException {
        R(2);
        return this.a.c();
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final int C() throws IOException {
        R(0);
        return this.a.n();
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final void D(List<Integer> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof hv) {
            hv hvVar = (hv) list;
            int i2 = this.f12123b & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int u = this.a.u() + this.a.m();
                    do {
                        hvVar.F(this.a.m());
                    } while (this.a.u() < u);
                    U(u);
                    return;
                }
                throw zzdok.f();
            }
            do {
                hvVar.F(this.a.m());
                if (this.a.t()) {
                    return;
                } else {
                    d3 = this.a.d();
                }
            } while (d3 == this.f12123b);
            this.f12125d = d3;
            return;
        }
        int i3 = this.f12123b & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                int u2 = this.a.u() + this.a.m();
                do {
                    list.add(Integer.valueOf(this.a.m()));
                } while (this.a.u() < u2);
                U(u2);
                return;
            }
            throw zzdok.f();
        }
        do {
            list.add(Integer.valueOf(this.a.m()));
            if (this.a.t()) {
                return;
            } else {
                d2 = this.a.d();
            }
        } while (d2 == this.f12123b);
        this.f12125d = d2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.lw
    public final <T> void E(List<T> list, mw<T> mwVar, zzdno zzdnoVar) throws IOException {
        int d2;
        int i2 = this.f12123b;
        if ((i2 & 7) != 2) {
            throw zzdok.f();
        }
        do {
            list.add(P(mwVar, zzdnoVar));
            if (this.a.t() || this.f12125d != 0) {
                return;
            } else {
                d2 = this.a.d();
            }
        } while (d2 == i2);
        this.f12125d = d2;
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final void F(List<String> list) throws IOException {
        O(list, false);
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final void G(List<Long> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof pv) {
            pv pvVar = (pv) list;
            int i2 = this.f12123b & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    int m = this.a.m();
                    S(m);
                    int u = this.a.u() + m;
                    do {
                        pvVar.w(this.a.h());
                    } while (this.a.u() < u);
                    return;
                }
                throw zzdok.f();
            }
            do {
                pvVar.w(this.a.h());
                if (this.a.t()) {
                    return;
                } else {
                    d3 = this.a.d();
                }
            } while (d3 == this.f12123b);
            this.f12125d = d3;
            return;
        }
        int i3 = this.f12123b & 7;
        if (i3 != 1) {
            if (i3 == 2) {
                int m2 = this.a.m();
                S(m2);
                int u2 = this.a.u() + m2;
                do {
                    list.add(Long.valueOf(this.a.h()));
                } while (this.a.u() < u2);
                return;
            }
            throw zzdok.f();
        }
        do {
            list.add(Long.valueOf(this.a.h()));
            if (this.a.t()) {
                return;
            } else {
                d2 = this.a.d();
            }
        } while (d2 == this.f12123b);
        this.f12125d = d2;
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final void H(List<Long> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof pv) {
            pv pvVar = (pv) list;
            int i2 = this.f12123b & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    int m = this.a.m();
                    S(m);
                    int u = this.a.u() + m;
                    do {
                        pvVar.w(this.a.p());
                    } while (this.a.u() < u);
                    return;
                }
                throw zzdok.f();
            }
            do {
                pvVar.w(this.a.p());
                if (this.a.t()) {
                    return;
                } else {
                    d3 = this.a.d();
                }
            } while (d3 == this.f12123b);
            this.f12125d = d3;
            return;
        }
        int i3 = this.f12123b & 7;
        if (i3 != 1) {
            if (i3 == 2) {
                int m2 = this.a.m();
                S(m2);
                int u2 = this.a.u() + m2;
                do {
                    list.add(Long.valueOf(this.a.p()));
                } while (this.a.u() < u2);
                return;
            }
            throw zzdok.f();
        }
        do {
            list.add(Long.valueOf(this.a.p()));
            if (this.a.t()) {
                return;
            } else {
                d2 = this.a.d();
            }
        } while (d2 == this.f12123b);
        this.f12125d = d2;
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final int I() throws IOException {
        R(5);
        return this.a.o();
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final void J(List<Integer> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof hv) {
            hv hvVar = (hv) list;
            int i2 = this.f12123b & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int u = this.a.u() + this.a.m();
                    do {
                        hvVar.F(this.a.g());
                    } while (this.a.u() < u);
                    U(u);
                    return;
                }
                throw zzdok.f();
            }
            do {
                hvVar.F(this.a.g());
                if (this.a.t()) {
                    return;
                } else {
                    d3 = this.a.d();
                }
            } while (d3 == this.f12123b);
            this.f12125d = d3;
            return;
        }
        int i3 = this.f12123b & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                int u2 = this.a.u() + this.a.m();
                do {
                    list.add(Integer.valueOf(this.a.g()));
                } while (this.a.u() < u2);
                U(u2);
                return;
            }
            throw zzdok.f();
        }
        do {
            list.add(Integer.valueOf(this.a.g()));
            if (this.a.t()) {
                return;
            } else {
                d2 = this.a.d();
            }
        } while (d2 == this.f12123b);
        this.f12125d = d2;
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final <T> T K(mw<T> mwVar, zzdno zzdnoVar) throws IOException {
        R(3);
        return (T) Q(mwVar, zzdnoVar);
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final void L(List<Integer> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof hv) {
            hv hvVar = (hv) list;
            int i2 = this.f12123b & 7;
            if (i2 != 2) {
                if (i2 != 5) {
                    throw zzdok.f();
                }
                do {
                    hvVar.F(this.a.o());
                    if (this.a.t()) {
                        return;
                    } else {
                        d3 = this.a.d();
                    }
                } while (d3 == this.f12123b);
                this.f12125d = d3;
                return;
            }
            int m = this.a.m();
            T(m);
            int u = this.a.u() + m;
            do {
                hvVar.F(this.a.o());
            } while (this.a.u() < u);
            return;
        }
        int i3 = this.f12123b & 7;
        if (i3 != 2) {
            if (i3 != 5) {
                throw zzdok.f();
            }
            do {
                list.add(Integer.valueOf(this.a.o()));
                if (this.a.t()) {
                    return;
                } else {
                    d2 = this.a.d();
                }
            } while (d2 == this.f12123b);
            this.f12125d = d2;
            return;
        }
        int m2 = this.a.m();
        T(m2);
        int u2 = this.a.u() + m2;
        do {
            list.add(Integer.valueOf(this.a.o()));
        } while (this.a.u() < u2);
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final long M() throws IOException {
        R(1);
        return this.a.p();
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final int a() throws IOException {
        R(0);
        return this.a.q();
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final long b() throws IOException {
        R(0);
        return this.a.e();
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final void c(List<Boolean> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof cu) {
            cu cuVar = (cu) list;
            int i2 = this.f12123b & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int u = this.a.u() + this.a.m();
                    do {
                        cuVar.b(this.a.j());
                    } while (this.a.u() < u);
                    U(u);
                    return;
                }
                throw zzdok.f();
            }
            do {
                cuVar.b(this.a.j());
                if (this.a.t()) {
                    return;
                } else {
                    d3 = this.a.d();
                }
            } while (d3 == this.f12123b);
            this.f12125d = d3;
            return;
        }
        int i3 = this.f12123b & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                int u2 = this.a.u() + this.a.m();
                do {
                    list.add(Boolean.valueOf(this.a.j()));
                } while (this.a.u() < u2);
                U(u2);
                return;
            }
            throw zzdok.f();
        }
        do {
            list.add(Boolean.valueOf(this.a.j()));
            if (this.a.t()) {
                return;
            } else {
                d2 = this.a.d();
            }
        } while (d2 == this.f12123b);
        this.f12125d = d2;
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final <K, V> void d(Map<K, V> map, uv<K, V> uvVar, zzdno zzdnoVar) throws IOException {
        R(2);
        this.a.z(this.a.m());
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final void e(List<Integer> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof hv) {
            hv hvVar = (hv) list;
            int i2 = this.f12123b & 7;
            if (i2 != 2) {
                if (i2 != 5) {
                    throw zzdok.f();
                }
                do {
                    hvVar.F(this.a.i());
                    if (this.a.t()) {
                        return;
                    } else {
                        d3 = this.a.d();
                    }
                } while (d3 == this.f12123b);
                this.f12125d = d3;
                return;
            }
            int m = this.a.m();
            T(m);
            int u = this.a.u() + m;
            do {
                hvVar.F(this.a.i());
            } while (this.a.u() < u);
            return;
        }
        int i3 = this.f12123b & 7;
        if (i3 != 2) {
            if (i3 != 5) {
                throw zzdok.f();
            }
            do {
                list.add(Integer.valueOf(this.a.i()));
                if (this.a.t()) {
                    return;
                } else {
                    d2 = this.a.d();
                }
            } while (d2 == this.f12123b);
            this.f12125d = d2;
            return;
        }
        int m2 = this.a.m();
        T(m2);
        int u2 = this.a.u() + m2;
        do {
            list.add(Integer.valueOf(this.a.i()));
        } while (this.a.u() < u2);
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final boolean f() throws IOException {
        R(0);
        return this.a.j();
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final void g(List<Long> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof pv) {
            pv pvVar = (pv) list;
            int i2 = this.f12123b & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int u = this.a.u() + this.a.m();
                    do {
                        pvVar.w(this.a.r());
                    } while (this.a.u() < u);
                    U(u);
                    return;
                }
                throw zzdok.f();
            }
            do {
                pvVar.w(this.a.r());
                if (this.a.t()) {
                    return;
                } else {
                    d3 = this.a.d();
                }
            } while (d3 == this.f12123b);
            this.f12125d = d3;
            return;
        }
        int i3 = this.f12123b & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                int u2 = this.a.u() + this.a.m();
                do {
                    list.add(Long.valueOf(this.a.r()));
                } while (this.a.u() < u2);
                U(u2);
                return;
            }
            throw zzdok.f();
        }
        do {
            list.add(Long.valueOf(this.a.r()));
            if (this.a.t()) {
                return;
            } else {
                d2 = this.a.d();
            }
        } while (d2 == this.f12123b);
        this.f12125d = d2;
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final int getTag() {
        return this.f12123b;
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final void h(List<Integer> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof hv) {
            hv hvVar = (hv) list;
            int i2 = this.f12123b & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int u = this.a.u() + this.a.m();
                    do {
                        hvVar.F(this.a.q());
                    } while (this.a.u() < u);
                    U(u);
                    return;
                }
                throw zzdok.f();
            }
            do {
                hvVar.F(this.a.q());
                if (this.a.t()) {
                    return;
                } else {
                    d3 = this.a.d();
                }
            } while (d3 == this.f12123b);
            this.f12125d = d3;
            return;
        }
        int i3 = this.f12123b & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                int u2 = this.a.u() + this.a.m();
                do {
                    list.add(Integer.valueOf(this.a.q()));
                } while (this.a.u() < u2);
                U(u2);
                return;
            }
            throw zzdok.f();
        }
        do {
            list.add(Integer.valueOf(this.a.q()));
            if (this.a.t()) {
                return;
            } else {
                d2 = this.a.d();
            }
        } while (d2 == this.f12123b);
        this.f12125d = d2;
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final long i() throws IOException {
        R(0);
        return this.a.r();
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final long j() throws IOException {
        R(0);
        return this.a.f();
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final long k() throws IOException {
        R(1);
        return this.a.h();
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final void l(List<Float> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof dv) {
            dv dvVar = (dv) list;
            int i2 = this.f12123b & 7;
            if (i2 != 2) {
                if (i2 != 5) {
                    throw zzdok.f();
                }
                do {
                    dvVar.w(this.a.b());
                    if (this.a.t()) {
                        return;
                    } else {
                        d3 = this.a.d();
                    }
                } while (d3 == this.f12123b);
                this.f12125d = d3;
                return;
            }
            int m = this.a.m();
            T(m);
            int u = this.a.u() + m;
            do {
                dvVar.w(this.a.b());
            } while (this.a.u() < u);
            return;
        }
        int i3 = this.f12123b & 7;
        if (i3 != 2) {
            if (i3 != 5) {
                throw zzdok.f();
            }
            do {
                list.add(Float.valueOf(this.a.b()));
                if (this.a.t()) {
                    return;
                } else {
                    d2 = this.a.d();
                }
            } while (d2 == this.f12123b);
            this.f12125d = d2;
            return;
        }
        int m2 = this.a.m();
        T(m2);
        int u2 = this.a.u() + m2;
        do {
            list.add(Float.valueOf(this.a.b()));
        } while (this.a.u() < u2);
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final String m() throws IOException {
        R(2);
        return this.a.k();
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final int n() throws IOException {
        int i2 = this.f12125d;
        if (i2 != 0) {
            this.f12123b = i2;
            this.f12125d = 0;
        } else {
            this.f12123b = this.a.d();
        }
        int i3 = this.f12123b;
        if (i3 == 0 || i3 == this.f12124c) {
            return Integer.MAX_VALUE;
        }
        return i3 >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final void o(List<zzdmr> list) throws IOException {
        int d2;
        if ((this.f12123b & 7) != 2) {
            throw zzdok.f();
        }
        do {
            list.add(u());
            if (this.a.t()) {
                return;
            } else {
                d2 = this.a.d();
            }
        } while (d2 == this.f12123b);
        this.f12125d = d2;
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final int p() throws IOException {
        R(0);
        return this.a.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.lw
    public final <T> void q(List<T> list, mw<T> mwVar, zzdno zzdnoVar) throws IOException {
        int d2;
        int i2 = this.f12123b;
        if ((i2 & 7) != 3) {
            throw zzdok.f();
        }
        do {
            list.add(Q(mwVar, zzdnoVar));
            if (this.a.t() || this.f12125d != 0) {
                return;
            } else {
                d2 = this.a.d();
            }
        } while (d2 == i2);
        this.f12125d = d2;
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final int r() throws IOException {
        R(5);
        return this.a.i();
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final double readDouble() throws IOException {
        R(1);
        return this.a.a();
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final float readFloat() throws IOException {
        R(5);
        return this.a.b();
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final void s(List<Double> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof uu) {
            uu uuVar = (uu) list;
            int i2 = this.f12123b & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    int m = this.a.m();
                    S(m);
                    int u = this.a.u() + m;
                    do {
                        uuVar.b(this.a.a());
                    } while (this.a.u() < u);
                    return;
                }
                throw zzdok.f();
            }
            do {
                uuVar.b(this.a.a());
                if (this.a.t()) {
                    return;
                } else {
                    d3 = this.a.d();
                }
            } while (d3 == this.f12123b);
            this.f12125d = d3;
            return;
        }
        int i3 = this.f12123b & 7;
        if (i3 != 1) {
            if (i3 == 2) {
                int m2 = this.a.m();
                S(m2);
                int u2 = this.a.u() + m2;
                do {
                    list.add(Double.valueOf(this.a.a()));
                } while (this.a.u() < u2);
                return;
            }
            throw zzdok.f();
        }
        do {
            list.add(Double.valueOf(this.a.a()));
            if (this.a.t()) {
                return;
            } else {
                d2 = this.a.d();
            }
        } while (d2 == this.f12123b);
        this.f12125d = d2;
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final boolean t() throws IOException {
        int i2;
        if (this.a.t() || (i2 = this.f12123b) == this.f12124c) {
            return false;
        }
        return this.a.y(i2);
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final zzdmr u() throws IOException {
        R(2);
        return this.a.l();
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final void v(List<String> list) throws IOException {
        O(list, true);
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final void w(List<Long> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof pv) {
            pv pvVar = (pv) list;
            int i2 = this.f12123b & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int u = this.a.u() + this.a.m();
                    do {
                        pvVar.w(this.a.f());
                    } while (this.a.u() < u);
                    U(u);
                    return;
                }
                throw zzdok.f();
            }
            do {
                pvVar.w(this.a.f());
                if (this.a.t()) {
                    return;
                } else {
                    d3 = this.a.d();
                }
            } while (d3 == this.f12123b);
            this.f12125d = d3;
            return;
        }
        int i3 = this.f12123b & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                int u2 = this.a.u() + this.a.m();
                do {
                    list.add(Long.valueOf(this.a.f()));
                } while (this.a.u() < u2);
                U(u2);
                return;
            }
            throw zzdok.f();
        }
        do {
            list.add(Long.valueOf(this.a.f()));
            if (this.a.t()) {
                return;
            } else {
                d2 = this.a.d();
            }
        } while (d2 == this.f12123b);
        this.f12125d = d2;
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final <T> T x(mw<T> mwVar, zzdno zzdnoVar) throws IOException {
        R(2);
        return (T) P(mwVar, zzdnoVar);
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final int y() throws IOException {
        R(0);
        return this.a.m();
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final void z(List<Integer> list) throws IOException {
        int d2;
        int d3;
        if (list instanceof hv) {
            hv hvVar = (hv) list;
            int i2 = this.f12123b & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int u = this.a.u() + this.a.m();
                    do {
                        hvVar.F(this.a.n());
                    } while (this.a.u() < u);
                    U(u);
                    return;
                }
                throw zzdok.f();
            }
            do {
                hvVar.F(this.a.n());
                if (this.a.t()) {
                    return;
                } else {
                    d3 = this.a.d();
                }
            } while (d3 == this.f12123b);
            this.f12125d = d3;
            return;
        }
        int i3 = this.f12123b & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                int u2 = this.a.u() + this.a.m();
                do {
                    list.add(Integer.valueOf(this.a.n()));
                } while (this.a.u() < u2);
                U(u2);
                return;
            }
            throw zzdok.f();
        }
        do {
            list.add(Integer.valueOf(this.a.n()));
            if (this.a.t()) {
                return;
            } else {
                d2 = this.a.d();
            }
        } while (d2 == this.f12123b);
        this.f12125d = d2;
    }
}
