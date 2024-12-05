package com.airbnb.lottie.q.a;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.q.b.a;
import com.airbnb.lottie.s.j.q;
import java.util.List;

/* compiled from: EllipseContent.java */
/* loaded from: classes.dex */
public class e implements l, a.InterfaceC0101a, j {
    private final Path a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final String f7991b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.f f7992c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.q.b.a<?, PointF> f7993d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.q.b.a<?, PointF> f7994e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.s.j.a f7995f;

    /* renamed from: g, reason: collision with root package name */
    private r f7996g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f7997h;

    public e(com.airbnb.lottie.f fVar, com.airbnb.lottie.s.k.a aVar, com.airbnb.lottie.s.j.a aVar2) {
        this.f7991b = aVar2.b();
        this.f7992c = fVar;
        com.airbnb.lottie.q.b.a<PointF, PointF> a = aVar2.d().a();
        this.f7993d = a;
        com.airbnb.lottie.q.b.a<PointF, PointF> a2 = aVar2.c().a();
        this.f7994e = a2;
        this.f7995f = aVar2;
        aVar.i(a);
        aVar.i(a2);
        a.a(this);
        a2.a(this);
    }

    private void f() {
        this.f7997h = false;
        this.f7992c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.q.b.a.InterfaceC0101a
    public void a() {
        f();
    }

    @Override // com.airbnb.lottie.q.a.b
    public void b(List<b> list, List<b> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            b bVar = list.get(i2);
            if (bVar instanceof r) {
                r rVar = (r) bVar;
                if (rVar.j() == q.a.Simultaneously) {
                    this.f7996g = rVar;
                    rVar.d(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.q.a.l
    public Path c() {
        if (this.f7997h) {
            return this.a;
        }
        this.a.reset();
        PointF h2 = this.f7993d.h();
        float f2 = h2.x / 2.0f;
        float f3 = h2.y / 2.0f;
        float f4 = f2 * 0.55228f;
        float f5 = 0.55228f * f3;
        this.a.reset();
        if (this.f7995f.e()) {
            float f6 = -f3;
            this.a.moveTo(0.0f, f6);
            float f7 = 0.0f - f4;
            float f8 = -f2;
            float f9 = 0.0f - f5;
            this.a.cubicTo(f7, f6, f8, f9, f8, 0.0f);
            float f10 = f5 + 0.0f;
            this.a.cubicTo(f8, f10, f7, f3, 0.0f, f3);
            float f11 = f4 + 0.0f;
            this.a.cubicTo(f11, f3, f2, f10, f2, 0.0f);
            this.a.cubicTo(f2, f9, f11, f6, 0.0f, f6);
        } else {
            float f12 = -f3;
            this.a.moveTo(0.0f, f12);
            float f13 = f4 + 0.0f;
            float f14 = 0.0f - f5;
            this.a.cubicTo(f13, f12, f2, f14, f2, 0.0f);
            float f15 = f5 + 0.0f;
            this.a.cubicTo(f2, f15, f13, f3, 0.0f, f3);
            float f16 = 0.0f - f4;
            float f17 = -f2;
            this.a.cubicTo(f16, f3, f17, f15, f17, 0.0f);
            this.a.cubicTo(f17, f14, f16, f12, 0.0f, f12);
        }
        PointF h3 = this.f7994e.h();
        this.a.offset(h3.x, h3.y);
        this.a.close();
        com.airbnb.lottie.v.f.b(this.a, this.f7996g);
        this.f7997h = true;
        return this.a;
    }

    @Override // com.airbnb.lottie.s.f
    public void d(com.airbnb.lottie.s.e eVar, int i2, List<com.airbnb.lottie.s.e> list, com.airbnb.lottie.s.e eVar2) {
        com.airbnb.lottie.v.e.l(eVar, i2, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.q.a.b
    public String getName() {
        return this.f7991b;
    }

    @Override // com.airbnb.lottie.s.f
    public <T> void h(T t, com.airbnb.lottie.w.c<T> cVar) {
        if (t == com.airbnb.lottie.j.f7944g) {
            this.f7993d.m(cVar);
        } else if (t == com.airbnb.lottie.j.f7945h) {
            this.f7994e.m(cVar);
        }
    }
}
