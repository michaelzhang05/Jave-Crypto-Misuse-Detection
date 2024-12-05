package com.airbnb.lottie.s.j;

import com.airbnb.lottie.q.a.r;

/* compiled from: ShapeTrimPath.java */
/* loaded from: classes.dex */
public class q implements b {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final a f8208b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.s.i.b f8209c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.s.i.b f8210d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.s.i.b f8211e;

    /* compiled from: ShapeTrimPath.java */
    /* loaded from: classes.dex */
    public enum a {
        Simultaneously,
        Individually;

        public static a d(int i2) {
            if (i2 == 1) {
                return Simultaneously;
            }
            if (i2 == 2) {
                return Individually;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i2);
        }
    }

    public q(String str, a aVar, com.airbnb.lottie.s.i.b bVar, com.airbnb.lottie.s.i.b bVar2, com.airbnb.lottie.s.i.b bVar3) {
        this.a = str;
        this.f8208b = aVar;
        this.f8209c = bVar;
        this.f8210d = bVar2;
        this.f8211e = bVar3;
    }

    @Override // com.airbnb.lottie.s.j.b
    public com.airbnb.lottie.q.a.b a(com.airbnb.lottie.f fVar, com.airbnb.lottie.s.k.a aVar) {
        return new r(aVar, this);
    }

    public com.airbnb.lottie.s.i.b b() {
        return this.f8210d;
    }

    public String c() {
        return this.a;
    }

    public com.airbnb.lottie.s.i.b d() {
        return this.f8211e;
    }

    public com.airbnb.lottie.s.i.b e() {
        return this.f8209c;
    }

    public a f() {
        return this.f8208b;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f8209c + ", end: " + this.f8210d + ", offset: " + this.f8211e + "}";
    }
}
