package com.mbridge.msdk.newreward.a;

import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: A, reason: collision with root package name */
    private int f20818A;

    /* renamed from: B, reason: collision with root package name */
    private long f20819B;

    /* renamed from: K, reason: collision with root package name */
    private RewardVideoListener f20828K;

    /* renamed from: a, reason: collision with root package name */
    public b f20829a;

    /* renamed from: b, reason: collision with root package name */
    int f20830b;

    /* renamed from: c, reason: collision with root package name */
    private String f20831c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f20832d;

    /* renamed from: e, reason: collision with root package name */
    private int f20833e;

    /* renamed from: f, reason: collision with root package name */
    private int f20834f;

    /* renamed from: g, reason: collision with root package name */
    private int f20835g;

    /* renamed from: h, reason: collision with root package name */
    private int f20836h;

    /* renamed from: k, reason: collision with root package name */
    private boolean f20839k;

    /* renamed from: m, reason: collision with root package name */
    private long f20841m;

    /* renamed from: n, reason: collision with root package name */
    private long f20842n;

    /* renamed from: r, reason: collision with root package name */
    private String f20846r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f20847s;

    /* renamed from: u, reason: collision with root package name */
    private String f20849u;

    /* renamed from: v, reason: collision with root package name */
    private String f20850v;

    /* renamed from: w, reason: collision with root package name */
    private int f20851w;

    /* renamed from: x, reason: collision with root package name */
    private String f20852x;

    /* renamed from: y, reason: collision with root package name */
    private String f20853y;

    /* renamed from: i, reason: collision with root package name */
    private int f20837i = 2;

    /* renamed from: j, reason: collision with root package name */
    private int f20838j = MBridgeCommon.DEFAULT_LOAD_TIMEOUT;

    /* renamed from: l, reason: collision with root package name */
    private boolean f20840l = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f20843o = false;

    /* renamed from: p, reason: collision with root package name */
    private int f20844p = 0;

    /* renamed from: q, reason: collision with root package name */
    private int f20845q = 0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f20848t = false;

    /* renamed from: z, reason: collision with root package name */
    private String f20854z = "";

    /* renamed from: C, reason: collision with root package name */
    private boolean f20820C = false;

    /* renamed from: D, reason: collision with root package name */
    private boolean f20821D = false;

    /* renamed from: E, reason: collision with root package name */
    private boolean f20822E = false;

    /* renamed from: F, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.f.a f20823F = new com.mbridge.msdk.newreward.function.f.a();

    /* renamed from: G, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.f.d f20824G = new com.mbridge.msdk.newreward.function.f.d();

    /* renamed from: H, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.f.e f20825H = new com.mbridge.msdk.newreward.function.f.e();

    /* renamed from: I, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.f.c f20826I = new com.mbridge.msdk.newreward.function.f.c();

    /* renamed from: J, reason: collision with root package name */
    private int f20827J = 25000;

    public e(boolean z8, int i8, String str, String str2, boolean z9) {
        this.f20832d = z8;
        this.f20851w = i8;
        this.f20849u = str;
        this.f20850v = str2;
        this.f20839k = z9;
    }

    public final String A() {
        return this.f20850v;
    }

    public final boolean B() {
        return this.f20832d;
    }

    public final String C() {
        return this.f20849u;
    }

    public final RewardVideoListener D() {
        return this.f20828K;
    }

    public final int E() {
        return this.f20834f;
    }

    public final int F() {
        if (this.f20832d) {
            return 2;
        }
        return 3;
    }

    public final int G() {
        return this.f20833e;
    }

    public final int H() {
        return this.f20837i;
    }

    public final int I() {
        int i8 = this.f20827J;
        if (i8 <= 0) {
            return 25000;
        }
        return i8;
    }

    public final int J() {
        return this.f20838j;
    }

    public final boolean K() {
        return this.f20839k;
    }

    public final long L() {
        long f8;
        com.mbridge.msdk.newreward.function.f.a aVar = this.f20823F;
        if (aVar != null && aVar.b() != null && this.f20823F.b().n() > 0) {
            return this.f20823F.b().n();
        }
        long currentTimeMillis = System.currentTimeMillis();
        com.mbridge.msdk.videocommon.d.a a8 = this.f20825H.a();
        if (a8 == null) {
            f8 = 3600000;
        } else {
            f8 = a8.f();
        }
        return f8 + currentTimeMillis;
    }

    public final boolean a() {
        return this.f20847s;
    }

    public final String b() {
        return this.f20846r;
    }

    public final void c() {
        this.f20844p++;
    }

    public final void d() {
        this.f20845q++;
    }

    public final boolean e() {
        return this.f20843o;
    }

    public final long f() {
        return this.f20842n;
    }

    public final long g() {
        return this.f20841m;
    }

    public final boolean h() {
        return this.f20840l;
    }

    public final boolean i() {
        return this.f20848t;
    }

    public final int j() {
        return this.f20835g;
    }

    public final int k() {
        return this.f20836h;
    }

    public final boolean l() {
        return this.f20822E;
    }

    public final boolean m() {
        return this.f20821D;
    }

    public final boolean n() {
        return this.f20820C;
    }

    public final long o() {
        return this.f20819B;
    }

    public final int p() {
        return this.f20851w;
    }

    public final String q() {
        return this.f20854z;
    }

    public final com.mbridge.msdk.newreward.function.f.e r() {
        return this.f20825H;
    }

    public final int s() {
        return this.f20818A;
    }

    public final com.mbridge.msdk.newreward.function.f.c t() {
        return this.f20826I;
    }

    public final int u() {
        return this.f20830b;
    }

    public final String v() {
        return this.f20852x;
    }

    public final String w() {
        return this.f20853y;
    }

    public final com.mbridge.msdk.newreward.function.f.a x() {
        return this.f20823F;
    }

    public final com.mbridge.msdk.newreward.function.f.d y() {
        return this.f20824G;
    }

    public final String z() {
        return this.f20831c;
    }

    public final void a(boolean z8) {
        this.f20847s = z8;
    }

    public final void b(boolean z8) {
        this.f20843o = z8;
    }

    public final void c(boolean z8) {
        this.f20840l = z8;
    }

    public final void d(boolean z8) {
        this.f20848t = z8;
    }

    public final void e(boolean z8) {
        this.f20822E = z8;
    }

    public final void f(boolean z8) {
        this.f20821D = z8;
    }

    public final void g(boolean z8) {
        this.f20820C = z8;
    }

    public final void a(String str) {
        this.f20846r = str;
    }

    public final void b(long j8) {
        this.f20841m = j8;
    }

    public final void c(long j8) {
        this.f20819B = j8;
    }

    public final void d(String str) {
        this.f20853y = str;
    }

    public final void e(String str) {
        this.f20831c = str;
    }

    public final void f(int i8) {
        this.f20838j = i8;
    }

    public final void a(long j8) {
        this.f20842n = j8;
    }

    public final void b(String str) {
        this.f20854z = str;
    }

    public final void c(int i8) {
        this.f20830b = i8;
    }

    public final void d(int i8) {
        this.f20837i = i8;
    }

    public final void e(int i8) {
        this.f20827J = i8;
    }

    public final void a(int i8) {
        this.f20833e = i8;
    }

    public final void b(int i8) {
        this.f20818A = i8;
    }

    public final void c(String str) {
        this.f20852x = str;
    }

    public final void a(com.mbridge.msdk.newreward.function.f.e eVar) {
        this.f20825H = eVar;
    }

    public final void a(com.mbridge.msdk.newreward.function.f.a aVar) {
        this.f20823F = aVar;
    }

    public final void a(RewardVideoListener rewardVideoListener) {
        this.f20828K = rewardVideoListener;
    }

    public final void a(int i8, int i9, int i10) {
        this.f20834f = i8;
        this.f20835g = i9;
        this.f20836h = i10;
    }
}
