package com.mbridge.msdk.foundation.same.net;

/* loaded from: classes4.dex */
public final class b implements l {

    /* renamed from: a, reason: collision with root package name */
    private final int f19593a;

    /* renamed from: b, reason: collision with root package name */
    private int f19594b;

    /* renamed from: c, reason: collision with root package name */
    private int f19595c;

    /* renamed from: d, reason: collision with root package name */
    private int f19596d;

    /* renamed from: e, reason: collision with root package name */
    private int f19597e;

    /* renamed from: f, reason: collision with root package name */
    private int f19598f;

    /* renamed from: g, reason: collision with root package name */
    private int f19599g;

    /* renamed from: h, reason: collision with root package name */
    private int f19600h;

    public b() {
        this(30000, 0);
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final int a() {
        return this.f19597e;
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final int b() {
        return this.f19593a;
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final int c() {
        return this.f19595c;
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final int d() {
        return this.f19598f;
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final int e() {
        return this.f19599g;
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final int f() {
        return this.f19594b;
    }

    private b(int i8, int i9) {
        this.f19594b = 0;
        this.f19595c = 0;
        this.f19598f = 0;
        this.f19599g = 0;
        this.f19600h = 2;
        this.f19597e = i8 <= 0 ? 30000 : i8;
        this.f19593a = i9;
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final boolean a(com.mbridge.msdk.foundation.same.net.b.a aVar) {
        int i8 = this.f19596d + 1;
        this.f19596d = i8;
        return i8 <= this.f19593a;
    }

    public b(int i8, int i9, int i10, int i11, int i12, int i13) {
        this.f19594b = 0;
        this.f19595c = 0;
        this.f19598f = 0;
        this.f19599g = 0;
        this.f19600h = 2;
        this.f19595c = Math.max(i8, 0);
        this.f19598f = Math.max(i9, 0);
        this.f19599g = Math.max(i10, 0);
        this.f19594b = Math.max(i11, 0);
        this.f19593a = Math.max(i12, 0);
        this.f19600h = i13;
    }

    public b(int i8, int i9, int i10, int i11, int i12) {
        this.f19594b = 0;
        this.f19595c = 0;
        this.f19598f = 0;
        this.f19599g = 0;
        this.f19600h = 2;
        this.f19595c = Math.max(i8, 0);
        this.f19598f = Math.max(i9, 0);
        this.f19599g = Math.max(i10, 0);
        this.f19594b = Math.max(i11, 0);
        this.f19593a = Math.max(i12, 0);
    }
}
