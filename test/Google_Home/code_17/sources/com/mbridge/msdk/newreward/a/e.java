package com.mbridge.msdk.newreward.a;

import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: A, reason: collision with root package name */
    private int f21873A;

    /* renamed from: B, reason: collision with root package name */
    private long f21874B;

    /* renamed from: K, reason: collision with root package name */
    private RewardVideoListener f21883K;

    /* renamed from: a, reason: collision with root package name */
    public b f21884a;

    /* renamed from: b, reason: collision with root package name */
    int f21885b;

    /* renamed from: c, reason: collision with root package name */
    private String f21886c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f21887d;

    /* renamed from: e, reason: collision with root package name */
    private int f21888e;

    /* renamed from: f, reason: collision with root package name */
    private int f21889f;

    /* renamed from: g, reason: collision with root package name */
    private int f21890g;

    /* renamed from: h, reason: collision with root package name */
    private int f21891h;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21894k;

    /* renamed from: m, reason: collision with root package name */
    private long f21896m;

    /* renamed from: n, reason: collision with root package name */
    private long f21897n;

    /* renamed from: r, reason: collision with root package name */
    private String f21901r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f21902s;

    /* renamed from: u, reason: collision with root package name */
    private String f21904u;

    /* renamed from: v, reason: collision with root package name */
    private String f21905v;

    /* renamed from: w, reason: collision with root package name */
    private int f21906w;

    /* renamed from: x, reason: collision with root package name */
    private String f21907x;

    /* renamed from: y, reason: collision with root package name */
    private String f21908y;

    /* renamed from: i, reason: collision with root package name */
    private int f21892i = 2;

    /* renamed from: j, reason: collision with root package name */
    private int f21893j = MBridgeCommon.DEFAULT_LOAD_TIMEOUT;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21895l = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f21898o = false;

    /* renamed from: p, reason: collision with root package name */
    private int f21899p = 0;

    /* renamed from: q, reason: collision with root package name */
    private int f21900q = 0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f21903t = false;

    /* renamed from: z, reason: collision with root package name */
    private String f21909z = "";

    /* renamed from: C, reason: collision with root package name */
    private boolean f21875C = false;

    /* renamed from: D, reason: collision with root package name */
    private boolean f21876D = false;

    /* renamed from: E, reason: collision with root package name */
    private boolean f21877E = false;

    /* renamed from: F, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.f.a f21878F = new com.mbridge.msdk.newreward.function.f.a();

    /* renamed from: G, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.f.d f21879G = new com.mbridge.msdk.newreward.function.f.d();

    /* renamed from: H, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.f.e f21880H = new com.mbridge.msdk.newreward.function.f.e();

    /* renamed from: I, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.f.c f21881I = new com.mbridge.msdk.newreward.function.f.c();

    /* renamed from: J, reason: collision with root package name */
    private int f21882J = 25000;

    public e(boolean z8, int i8, String str, String str2, boolean z9) {
        this.f21887d = z8;
        this.f21906w = i8;
        this.f21904u = str;
        this.f21905v = str2;
        this.f21894k = z9;
    }

    public final String A() {
        return this.f21905v;
    }

    public final boolean B() {
        return this.f21887d;
    }

    public final String C() {
        return this.f21904u;
    }

    public final RewardVideoListener D() {
        return this.f21883K;
    }

    public final int E() {
        return this.f21889f;
    }

    public final int F() {
        if (this.f21887d) {
            return 2;
        }
        return 3;
    }

    public final int G() {
        return this.f21888e;
    }

    public final int H() {
        return this.f21892i;
    }

    public final int I() {
        int i8 = this.f21882J;
        if (i8 <= 0) {
            return 25000;
        }
        return i8;
    }

    public final int J() {
        return this.f21893j;
    }

    public final boolean K() {
        return this.f21894k;
    }

    public final long L() {
        long f8;
        com.mbridge.msdk.newreward.function.f.a aVar = this.f21878F;
        if (aVar != null && aVar.b() != null && this.f21878F.b().n() > 0) {
            return this.f21878F.b().n();
        }
        long currentTimeMillis = System.currentTimeMillis();
        com.mbridge.msdk.videocommon.d.a a8 = this.f21880H.a();
        if (a8 == null) {
            f8 = 3600000;
        } else {
            f8 = a8.f();
        }
        return f8 + currentTimeMillis;
    }

    public final boolean a() {
        return this.f21902s;
    }

    public final String b() {
        return this.f21901r;
    }

    public final void c() {
        this.f21899p++;
    }

    public final void d() {
        this.f21900q++;
    }

    public final boolean e() {
        return this.f21898o;
    }

    public final long f() {
        return this.f21897n;
    }

    public final long g() {
        return this.f21896m;
    }

    public final boolean h() {
        return this.f21895l;
    }

    public final boolean i() {
        return this.f21903t;
    }

    public final int j() {
        return this.f21890g;
    }

    public final int k() {
        return this.f21891h;
    }

    public final boolean l() {
        return this.f21877E;
    }

    public final boolean m() {
        return this.f21876D;
    }

    public final boolean n() {
        return this.f21875C;
    }

    public final long o() {
        return this.f21874B;
    }

    public final int p() {
        return this.f21906w;
    }

    public final String q() {
        return this.f21909z;
    }

    public final com.mbridge.msdk.newreward.function.f.e r() {
        return this.f21880H;
    }

    public final int s() {
        return this.f21873A;
    }

    public final com.mbridge.msdk.newreward.function.f.c t() {
        return this.f21881I;
    }

    public final int u() {
        return this.f21885b;
    }

    public final String v() {
        return this.f21907x;
    }

    public final String w() {
        return this.f21908y;
    }

    public final com.mbridge.msdk.newreward.function.f.a x() {
        return this.f21878F;
    }

    public final com.mbridge.msdk.newreward.function.f.d y() {
        return this.f21879G;
    }

    public final String z() {
        return this.f21886c;
    }

    public final void a(boolean z8) {
        this.f21902s = z8;
    }

    public final void b(boolean z8) {
        this.f21898o = z8;
    }

    public final void c(boolean z8) {
        this.f21895l = z8;
    }

    public final void d(boolean z8) {
        this.f21903t = z8;
    }

    public final void e(boolean z8) {
        this.f21877E = z8;
    }

    public final void f(boolean z8) {
        this.f21876D = z8;
    }

    public final void g(boolean z8) {
        this.f21875C = z8;
    }

    public final void a(String str) {
        this.f21901r = str;
    }

    public final void b(long j8) {
        this.f21896m = j8;
    }

    public final void c(long j8) {
        this.f21874B = j8;
    }

    public final void d(String str) {
        this.f21908y = str;
    }

    public final void e(String str) {
        this.f21886c = str;
    }

    public final void f(int i8) {
        this.f21893j = i8;
    }

    public final void a(long j8) {
        this.f21897n = j8;
    }

    public final void b(String str) {
        this.f21909z = str;
    }

    public final void c(int i8) {
        this.f21885b = i8;
    }

    public final void d(int i8) {
        this.f21892i = i8;
    }

    public final void e(int i8) {
        this.f21882J = i8;
    }

    public final void a(int i8) {
        this.f21888e = i8;
    }

    public final void b(int i8) {
        this.f21873A = i8;
    }

    public final void c(String str) {
        this.f21907x = str;
    }

    public final void a(com.mbridge.msdk.newreward.function.f.e eVar) {
        this.f21880H = eVar;
    }

    public final void a(com.mbridge.msdk.newreward.function.f.a aVar) {
        this.f21878F = aVar;
    }

    public final void a(RewardVideoListener rewardVideoListener) {
        this.f21883K = rewardVideoListener;
    }

    public final void a(int i8, int i9, int i10) {
        this.f21889f = i8;
        this.f21890g = i9;
        this.f21891h = i10;
    }
}
