package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.u2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2268u2 {

    /* renamed from: A, reason: collision with root package name */
    private long f16842A;

    /* renamed from: B, reason: collision with root package name */
    private long f16843B;

    /* renamed from: C, reason: collision with root package name */
    private long f16844C;

    /* renamed from: D, reason: collision with root package name */
    private long f16845D;

    /* renamed from: E, reason: collision with root package name */
    private String f16846E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f16847F;

    /* renamed from: G, reason: collision with root package name */
    private long f16848G;

    /* renamed from: H, reason: collision with root package name */
    private long f16849H;

    /* renamed from: a, reason: collision with root package name */
    private final Y1 f16850a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16851b;

    /* renamed from: c, reason: collision with root package name */
    private String f16852c;

    /* renamed from: d, reason: collision with root package name */
    private String f16853d;

    /* renamed from: e, reason: collision with root package name */
    private String f16854e;

    /* renamed from: f, reason: collision with root package name */
    private String f16855f;

    /* renamed from: g, reason: collision with root package name */
    private long f16856g;

    /* renamed from: h, reason: collision with root package name */
    private long f16857h;

    /* renamed from: i, reason: collision with root package name */
    private long f16858i;

    /* renamed from: j, reason: collision with root package name */
    private String f16859j;

    /* renamed from: k, reason: collision with root package name */
    private long f16860k;

    /* renamed from: l, reason: collision with root package name */
    private String f16861l;

    /* renamed from: m, reason: collision with root package name */
    private long f16862m;

    /* renamed from: n, reason: collision with root package name */
    private long f16863n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f16864o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f16865p;

    /* renamed from: q, reason: collision with root package name */
    private String f16866q;

    /* renamed from: r, reason: collision with root package name */
    private Boolean f16867r;

    /* renamed from: s, reason: collision with root package name */
    private long f16868s;

    /* renamed from: t, reason: collision with root package name */
    private List f16869t;

    /* renamed from: u, reason: collision with root package name */
    private String f16870u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f16871v;

    /* renamed from: w, reason: collision with root package name */
    private long f16872w;

    /* renamed from: x, reason: collision with root package name */
    private long f16873x;

    /* renamed from: y, reason: collision with root package name */
    private long f16874y;

    /* renamed from: z, reason: collision with root package name */
    private long f16875z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2268u2(Y1 y12, String str) {
        AbstractC1319p.l(y12);
        AbstractC1319p.f(str);
        this.f16850a = y12;
        this.f16851b = str;
        y12.f().h();
    }

    public final long A() {
        this.f16850a.f().h();
        return 0L;
    }

    public final void B(String str) {
        this.f16850a.f().h();
        this.f16847F |= !m0.l.a(this.f16846E, str);
        this.f16846E = str;
    }

    public final void C(long j8) {
        boolean z8;
        this.f16850a.f().h();
        boolean z9 = this.f16847F;
        if (this.f16858i != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16847F = z9 | z8;
        this.f16858i = j8;
    }

    public final void D(long j8) {
        boolean z8;
        boolean z9 = false;
        if (j8 >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC1319p.a(z8);
        this.f16850a.f().h();
        boolean z10 = this.f16847F;
        if (this.f16856g != j8) {
            z9 = true;
        }
        this.f16847F = z10 | z9;
        this.f16856g = j8;
    }

    public final void E(long j8) {
        boolean z8;
        this.f16850a.f().h();
        boolean z9 = this.f16847F;
        if (this.f16857h != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16847F = z9 | z8;
        this.f16857h = j8;
    }

    public final void F(boolean z8) {
        boolean z9;
        this.f16850a.f().h();
        boolean z10 = this.f16847F;
        if (this.f16864o != z8) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f16847F = z10 | z9;
        this.f16864o = z8;
    }

    public final void G(Boolean bool) {
        this.f16850a.f().h();
        this.f16847F |= !m0.l.a(this.f16867r, bool);
        this.f16867r = bool;
    }

    public final void H(String str) {
        this.f16850a.f().h();
        this.f16847F |= !m0.l.a(this.f16854e, str);
        this.f16854e = str;
    }

    public final void I(List list) {
        ArrayList arrayList;
        this.f16850a.f().h();
        if (!m0.l.a(this.f16869t, list)) {
            this.f16847F = true;
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            this.f16869t = arrayList;
        }
    }

    public final void J(String str) {
        this.f16850a.f().h();
        this.f16847F |= !m0.l.a(this.f16870u, str);
        this.f16870u = str;
    }

    public final void K(long j8) {
        boolean z8;
        this.f16850a.f().h();
        boolean z9 = this.f16847F;
        if (this.f16873x != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16847F = z9 | z8;
        this.f16873x = j8;
    }

    public final void L(boolean z8) {
        boolean z9;
        this.f16850a.f().h();
        boolean z10 = this.f16847F;
        if (this.f16871v != z8) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f16847F = z10 | z9;
        this.f16871v = z8;
    }

    public final void M(long j8) {
        boolean z8;
        this.f16850a.f().h();
        boolean z9 = this.f16847F;
        if (this.f16872w != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16847F = z9 | z8;
        this.f16872w = j8;
    }

    public final boolean N() {
        this.f16850a.f().h();
        return this.f16865p;
    }

    public final boolean O() {
        this.f16850a.f().h();
        return this.f16864o;
    }

    public final boolean P() {
        this.f16850a.f().h();
        return this.f16847F;
    }

    public final boolean Q() {
        this.f16850a.f().h();
        return this.f16871v;
    }

    public final long R() {
        this.f16850a.f().h();
        return this.f16860k;
    }

    public final long S() {
        this.f16850a.f().h();
        return this.f16848G;
    }

    public final long T() {
        this.f16850a.f().h();
        return this.f16843B;
    }

    public final long U() {
        this.f16850a.f().h();
        return this.f16844C;
    }

    public final long V() {
        this.f16850a.f().h();
        return this.f16842A;
    }

    public final long W() {
        this.f16850a.f().h();
        return this.f16875z;
    }

    public final long X() {
        this.f16850a.f().h();
        return this.f16845D;
    }

    public final long Y() {
        this.f16850a.f().h();
        return this.f16874y;
    }

    public final long Z() {
        this.f16850a.f().h();
        return this.f16863n;
    }

    public final String a() {
        this.f16850a.f().h();
        return this.f16853d;
    }

    public final long a0() {
        this.f16850a.f().h();
        return this.f16868s;
    }

    public final String b() {
        this.f16850a.f().h();
        return this.f16846E;
    }

    public final long b0() {
        this.f16850a.f().h();
        return this.f16849H;
    }

    public final String c() {
        this.f16850a.f().h();
        return this.f16854e;
    }

    public final long c0() {
        this.f16850a.f().h();
        return this.f16862m;
    }

    public final String d() {
        this.f16850a.f().h();
        return this.f16870u;
    }

    public final long d0() {
        this.f16850a.f().h();
        return this.f16858i;
    }

    public final List e() {
        this.f16850a.f().h();
        return this.f16869t;
    }

    public final long e0() {
        this.f16850a.f().h();
        return this.f16856g;
    }

    public final void f() {
        this.f16850a.f().h();
        this.f16847F = false;
    }

    public final long f0() {
        this.f16850a.f().h();
        return this.f16857h;
    }

    public final void g() {
        this.f16850a.f().h();
        long j8 = this.f16856g + 1;
        if (j8 > 2147483647L) {
            this.f16850a.d().w().b("Bundle index overflow. appId", C2267u1.z(this.f16851b));
            j8 = 0;
        }
        this.f16847F = true;
        this.f16856g = j8;
    }

    public final long g0() {
        this.f16850a.f().h();
        return this.f16873x;
    }

    public final void h(String str) {
        this.f16850a.f().h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f16847F |= true ^ m0.l.a(this.f16866q, str);
        this.f16866q = str;
    }

    public final long h0() {
        this.f16850a.f().h();
        return this.f16872w;
    }

    public final void i(boolean z8) {
        boolean z9;
        this.f16850a.f().h();
        boolean z10 = this.f16847F;
        if (this.f16865p != z8) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f16847F = z10 | z9;
        this.f16865p = z8;
    }

    public final Boolean i0() {
        this.f16850a.f().h();
        return this.f16867r;
    }

    public final void j(String str) {
        this.f16850a.f().h();
        this.f16847F |= !m0.l.a(this.f16852c, str);
        this.f16852c = str;
    }

    public final String j0() {
        this.f16850a.f().h();
        return this.f16866q;
    }

    public final void k(String str) {
        this.f16850a.f().h();
        this.f16847F |= !m0.l.a(this.f16861l, str);
        this.f16861l = str;
    }

    public final String k0() {
        this.f16850a.f().h();
        String str = this.f16846E;
        B(null);
        return str;
    }

    public final void l(String str) {
        this.f16850a.f().h();
        this.f16847F |= !m0.l.a(this.f16859j, str);
        this.f16859j = str;
    }

    public final String l0() {
        this.f16850a.f().h();
        return this.f16851b;
    }

    public final void m(long j8) {
        boolean z8;
        this.f16850a.f().h();
        boolean z9 = this.f16847F;
        if (this.f16860k != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16847F = z9 | z8;
        this.f16860k = j8;
    }

    public final String m0() {
        this.f16850a.f().h();
        return this.f16852c;
    }

    public final void n(long j8) {
        boolean z8;
        this.f16850a.f().h();
        boolean z9 = this.f16847F;
        if (this.f16848G != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16847F = z9 | z8;
        this.f16848G = j8;
    }

    public final String n0() {
        this.f16850a.f().h();
        return this.f16861l;
    }

    public final void o(long j8) {
        boolean z8;
        this.f16850a.f().h();
        boolean z9 = this.f16847F;
        if (this.f16843B != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16847F = z9 | z8;
        this.f16843B = j8;
    }

    public final String o0() {
        this.f16850a.f().h();
        return this.f16859j;
    }

    public final void p(long j8) {
        boolean z8;
        this.f16850a.f().h();
        boolean z9 = this.f16847F;
        if (this.f16844C != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16847F = z9 | z8;
        this.f16844C = j8;
    }

    public final String p0() {
        this.f16850a.f().h();
        return this.f16855f;
    }

    public final void q(long j8) {
        boolean z8;
        this.f16850a.f().h();
        boolean z9 = this.f16847F;
        if (this.f16842A != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16847F = z9 | z8;
        this.f16842A = j8;
    }

    public final void r(long j8) {
        boolean z8;
        this.f16850a.f().h();
        boolean z9 = this.f16847F;
        if (this.f16875z != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16847F = z9 | z8;
        this.f16875z = j8;
    }

    public final void s(long j8) {
        boolean z8;
        this.f16850a.f().h();
        boolean z9 = this.f16847F;
        if (this.f16845D != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16847F = z9 | z8;
        this.f16845D = j8;
    }

    public final void t(long j8) {
        boolean z8;
        this.f16850a.f().h();
        boolean z9 = this.f16847F;
        if (this.f16874y != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16847F = z9 | z8;
        this.f16874y = j8;
    }

    public final void u(long j8) {
        boolean z8;
        this.f16850a.f().h();
        boolean z9 = this.f16847F;
        if (this.f16863n != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16847F = z9 | z8;
        this.f16863n = j8;
    }

    public final void v(long j8) {
        boolean z8;
        this.f16850a.f().h();
        boolean z9 = this.f16847F;
        if (this.f16868s != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16847F = z9 | z8;
        this.f16868s = j8;
    }

    public final void w(long j8) {
        boolean z8;
        this.f16850a.f().h();
        boolean z9 = this.f16847F;
        if (this.f16849H != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16847F = z9 | z8;
        this.f16849H = j8;
    }

    public final void x(String str) {
        this.f16850a.f().h();
        this.f16847F |= !m0.l.a(this.f16855f, str);
        this.f16855f = str;
    }

    public final void y(String str) {
        this.f16850a.f().h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f16847F |= true ^ m0.l.a(this.f16853d, str);
        this.f16853d = str;
    }

    public final void z(long j8) {
        boolean z8;
        this.f16850a.f().h();
        boolean z9 = this.f16847F;
        if (this.f16862m != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16847F = z9 | z8;
        this.f16862m = j8;
    }
}
