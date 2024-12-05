package com.mbridge.msdk.foundation.same.net;

/* loaded from: classes4.dex */
public final class b implements l {

    /* renamed from: a, reason: collision with root package name */
    private final int f20648a;

    /* renamed from: b, reason: collision with root package name */
    private int f20649b;

    /* renamed from: c, reason: collision with root package name */
    private int f20650c;

    /* renamed from: d, reason: collision with root package name */
    private int f20651d;

    /* renamed from: e, reason: collision with root package name */
    private int f20652e;

    /* renamed from: f, reason: collision with root package name */
    private int f20653f;

    /* renamed from: g, reason: collision with root package name */
    private int f20654g;

    /* renamed from: h, reason: collision with root package name */
    private int f20655h;

    public b() {
        this(30000, 0);
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final int a() {
        return this.f20652e;
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final int b() {
        return this.f20648a;
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final int c() {
        return this.f20650c;
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final int d() {
        return this.f20653f;
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final int e() {
        return this.f20654g;
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final int f() {
        return this.f20649b;
    }

    private b(int i8, int i9) {
        this.f20649b = 0;
        this.f20650c = 0;
        this.f20653f = 0;
        this.f20654g = 0;
        this.f20655h = 2;
        this.f20652e = i8 <= 0 ? 30000 : i8;
        this.f20648a = i9;
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final boolean a(com.mbridge.msdk.foundation.same.net.b.a aVar) {
        int i8 = this.f20651d + 1;
        this.f20651d = i8;
        return i8 <= this.f20648a;
    }

    public b(int i8, int i9, int i10, int i11, int i12, int i13) {
        this.f20649b = 0;
        this.f20650c = 0;
        this.f20653f = 0;
        this.f20654g = 0;
        this.f20655h = 2;
        this.f20650c = Math.max(i8, 0);
        this.f20653f = Math.max(i9, 0);
        this.f20654g = Math.max(i10, 0);
        this.f20649b = Math.max(i11, 0);
        this.f20648a = Math.max(i12, 0);
        this.f20655h = i13;
    }

    public b(int i8, int i9, int i10, int i11, int i12) {
        this.f20649b = 0;
        this.f20650c = 0;
        this.f20653f = 0;
        this.f20654g = 0;
        this.f20655h = 2;
        this.f20650c = Math.max(i8, 0);
        this.f20653f = Math.max(i9, 0);
        this.f20654g = Math.max(i10, 0);
        this.f20649b = Math.max(i11, 0);
        this.f20648a = Math.max(i12, 0);
    }
}
