package com.airbnb.lottie.q.b;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.q.b.a;

/* compiled from: TransformKeyframeAnimation.java */
/* loaded from: classes.dex */
public class o {
    private final Matrix a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    private final a<PointF, PointF> f8076b;

    /* renamed from: c, reason: collision with root package name */
    private final a<?, PointF> f8077c;

    /* renamed from: d, reason: collision with root package name */
    private final a<com.airbnb.lottie.w.d, com.airbnb.lottie.w.d> f8078d;

    /* renamed from: e, reason: collision with root package name */
    private final a<Float, Float> f8079e;

    /* renamed from: f, reason: collision with root package name */
    private final a<Integer, Integer> f8080f;

    /* renamed from: g, reason: collision with root package name */
    private final a<?, Float> f8081g;

    /* renamed from: h, reason: collision with root package name */
    private final a<?, Float> f8082h;

    public o(com.airbnb.lottie.s.i.l lVar) {
        this.f8076b = lVar.c().a();
        this.f8077c = lVar.f().a();
        this.f8078d = lVar.h().a();
        this.f8079e = lVar.g().a();
        this.f8080f = lVar.e().a();
        if (lVar.i() != null) {
            this.f8081g = lVar.i().a();
        } else {
            this.f8081g = null;
        }
        if (lVar.d() != null) {
            this.f8082h = lVar.d().a();
        } else {
            this.f8082h = null;
        }
    }

    public void a(com.airbnb.lottie.s.k.a aVar) {
        aVar.i(this.f8076b);
        aVar.i(this.f8077c);
        aVar.i(this.f8078d);
        aVar.i(this.f8079e);
        aVar.i(this.f8080f);
        a<?, Float> aVar2 = this.f8081g;
        if (aVar2 != null) {
            aVar.i(aVar2);
        }
        a<?, Float> aVar3 = this.f8082h;
        if (aVar3 != null) {
            aVar.i(aVar3);
        }
    }

    public void b(a.InterfaceC0101a interfaceC0101a) {
        this.f8076b.a(interfaceC0101a);
        this.f8077c.a(interfaceC0101a);
        this.f8078d.a(interfaceC0101a);
        this.f8079e.a(interfaceC0101a);
        this.f8080f.a(interfaceC0101a);
        a<?, Float> aVar = this.f8081g;
        if (aVar != null) {
            aVar.a(interfaceC0101a);
        }
        a<?, Float> aVar2 = this.f8082h;
        if (aVar2 != null) {
            aVar2.a(interfaceC0101a);
        }
    }

    public <T> boolean c(T t, com.airbnb.lottie.w.c<T> cVar) {
        a<?, Float> aVar;
        a<?, Float> aVar2;
        if (t == com.airbnb.lottie.j.f7942e) {
            this.f8076b.m(cVar);
            return true;
        }
        if (t == com.airbnb.lottie.j.f7943f) {
            this.f8077c.m(cVar);
            return true;
        }
        if (t == com.airbnb.lottie.j.f7946i) {
            this.f8078d.m(cVar);
            return true;
        }
        if (t == com.airbnb.lottie.j.f7947j) {
            this.f8079e.m(cVar);
            return true;
        }
        if (t == com.airbnb.lottie.j.f7940c) {
            this.f8080f.m(cVar);
            return true;
        }
        if (t == com.airbnb.lottie.j.u && (aVar2 = this.f8081g) != null) {
            aVar2.m(cVar);
            return true;
        }
        if (t != com.airbnb.lottie.j.v || (aVar = this.f8082h) == null) {
            return false;
        }
        aVar.m(cVar);
        return true;
    }

    public a<?, Float> d() {
        return this.f8082h;
    }

    public Matrix e() {
        this.a.reset();
        PointF h2 = this.f8077c.h();
        float f2 = h2.x;
        if (f2 != 0.0f || h2.y != 0.0f) {
            this.a.preTranslate(f2, h2.y);
        }
        float floatValue = this.f8079e.h().floatValue();
        if (floatValue != 0.0f) {
            this.a.preRotate(floatValue);
        }
        com.airbnb.lottie.w.d h3 = this.f8078d.h();
        if (h3.a() != 1.0f || h3.b() != 1.0f) {
            this.a.preScale(h3.a(), h3.b());
        }
        PointF h4 = this.f8076b.h();
        float f3 = h4.x;
        if (f3 != 0.0f || h4.y != 0.0f) {
            this.a.preTranslate(-f3, -h4.y);
        }
        return this.a;
    }

    public Matrix f(float f2) {
        PointF h2 = this.f8077c.h();
        PointF h3 = this.f8076b.h();
        com.airbnb.lottie.w.d h4 = this.f8078d.h();
        float floatValue = this.f8079e.h().floatValue();
        this.a.reset();
        this.a.preTranslate(h2.x * f2, h2.y * f2);
        double d2 = f2;
        this.a.preScale((float) Math.pow(h4.a(), d2), (float) Math.pow(h4.b(), d2));
        this.a.preRotate(floatValue * f2, h3.x, h3.y);
        return this.a;
    }

    public a<?, Integer> g() {
        return this.f8080f;
    }

    public a<?, Float> h() {
        return this.f8081g;
    }

    public void i(float f2) {
        this.f8076b.l(f2);
        this.f8077c.l(f2);
        this.f8078d.l(f2);
        this.f8079e.l(f2);
        this.f8080f.l(f2);
        a<?, Float> aVar = this.f8081g;
        if (aVar != null) {
            aVar.l(f2);
        }
        a<?, Float> aVar2 = this.f8082h;
        if (aVar2 != null) {
            aVar2.l(f2);
        }
    }
}
