package com.airbnb.lottie.q.a;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.q.b.a;
import com.airbnb.lottie.s.j.q;
import java.util.List;

/* compiled from: RectangleContent.java */
/* loaded from: classes.dex */
public class n implements a.InterfaceC0101a, j, l {
    private final Path a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final RectF f8031b = new RectF();

    /* renamed from: c, reason: collision with root package name */
    private final String f8032c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.f f8033d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.q.b.a<?, PointF> f8034e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.q.b.a<?, PointF> f8035f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.q.b.a<?, Float> f8036g;

    /* renamed from: h, reason: collision with root package name */
    private r f8037h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8038i;

    public n(com.airbnb.lottie.f fVar, com.airbnb.lottie.s.k.a aVar, com.airbnb.lottie.s.j.j jVar) {
        this.f8032c = jVar.c();
        this.f8033d = fVar;
        com.airbnb.lottie.q.b.a<PointF, PointF> a = jVar.d().a();
        this.f8034e = a;
        com.airbnb.lottie.q.b.a<PointF, PointF> a2 = jVar.e().a();
        this.f8035f = a2;
        com.airbnb.lottie.q.b.a<Float, Float> a3 = jVar.b().a();
        this.f8036g = a3;
        aVar.i(a);
        aVar.i(a2);
        aVar.i(a3);
        a.a(this);
        a2.a(this);
        a3.a(this);
    }

    private void f() {
        this.f8038i = false;
        this.f8033d.invalidateSelf();
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
                    this.f8037h = rVar;
                    rVar.d(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.q.a.l
    public Path c() {
        if (this.f8038i) {
            return this.a;
        }
        this.a.reset();
        PointF h2 = this.f8035f.h();
        float f2 = h2.x / 2.0f;
        float f3 = h2.y / 2.0f;
        com.airbnb.lottie.q.b.a<?, Float> aVar = this.f8036g;
        float floatValue = aVar == null ? 0.0f : aVar.h().floatValue();
        float min = Math.min(f2, f3);
        if (floatValue > min) {
            floatValue = min;
        }
        PointF h3 = this.f8034e.h();
        this.a.moveTo(h3.x + f2, (h3.y - f3) + floatValue);
        this.a.lineTo(h3.x + f2, (h3.y + f3) - floatValue);
        if (floatValue > 0.0f) {
            RectF rectF = this.f8031b;
            float f4 = h3.x;
            float f5 = floatValue * 2.0f;
            float f6 = h3.y;
            rectF.set((f4 + f2) - f5, (f6 + f3) - f5, f4 + f2, f6 + f3);
            this.a.arcTo(this.f8031b, 0.0f, 90.0f, false);
        }
        this.a.lineTo((h3.x - f2) + floatValue, h3.y + f3);
        if (floatValue > 0.0f) {
            RectF rectF2 = this.f8031b;
            float f7 = h3.x;
            float f8 = h3.y;
            float f9 = floatValue * 2.0f;
            rectF2.set(f7 - f2, (f8 + f3) - f9, (f7 - f2) + f9, f8 + f3);
            this.a.arcTo(this.f8031b, 90.0f, 90.0f, false);
        }
        this.a.lineTo(h3.x - f2, (h3.y - f3) + floatValue);
        if (floatValue > 0.0f) {
            RectF rectF3 = this.f8031b;
            float f10 = h3.x;
            float f11 = h3.y;
            float f12 = floatValue * 2.0f;
            rectF3.set(f10 - f2, f11 - f3, (f10 - f2) + f12, (f11 - f3) + f12);
            this.a.arcTo(this.f8031b, 180.0f, 90.0f, false);
        }
        this.a.lineTo((h3.x + f2) - floatValue, h3.y - f3);
        if (floatValue > 0.0f) {
            RectF rectF4 = this.f8031b;
            float f13 = h3.x;
            float f14 = floatValue * 2.0f;
            float f15 = h3.y;
            rectF4.set((f13 + f2) - f14, f15 - f3, f13 + f2, (f15 - f3) + f14);
            this.a.arcTo(this.f8031b, 270.0f, 90.0f, false);
        }
        this.a.close();
        com.airbnb.lottie.v.f.b(this.a, this.f8037h);
        this.f8038i = true;
        return this.a;
    }

    @Override // com.airbnb.lottie.s.f
    public void d(com.airbnb.lottie.s.e eVar, int i2, List<com.airbnb.lottie.s.e> list, com.airbnb.lottie.s.e eVar2) {
        com.airbnb.lottie.v.e.l(eVar, i2, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.q.a.b
    public String getName() {
        return this.f8032c;
    }

    @Override // com.airbnb.lottie.s.f
    public <T> void h(T t, com.airbnb.lottie.w.c<T> cVar) {
    }
}
