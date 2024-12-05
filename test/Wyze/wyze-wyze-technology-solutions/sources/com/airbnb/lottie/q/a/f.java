package com.airbnb.lottie.q.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.q.b.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FillContent.java */
/* loaded from: classes.dex */
public class f implements d, a.InterfaceC0101a, j {
    private final Path a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f7998b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.s.k.a f7999c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8000d;

    /* renamed from: e, reason: collision with root package name */
    private final List<l> f8001e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.q.b.a<Integer, Integer> f8002f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.q.b.a<Integer, Integer> f8003g;

    /* renamed from: h, reason: collision with root package name */
    private com.airbnb.lottie.q.b.a<ColorFilter, ColorFilter> f8004h;

    /* renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.f f8005i;

    public f(com.airbnb.lottie.f fVar, com.airbnb.lottie.s.k.a aVar, com.airbnb.lottie.s.j.m mVar) {
        Path path = new Path();
        this.a = path;
        this.f7998b = new Paint(1);
        this.f8001e = new ArrayList();
        this.f7999c = aVar;
        this.f8000d = mVar.d();
        this.f8005i = fVar;
        if (mVar.b() != null && mVar.e() != null) {
            path.setFillType(mVar.c());
            com.airbnb.lottie.q.b.a<Integer, Integer> a = mVar.b().a();
            this.f8002f = a;
            a.a(this);
            aVar.i(a);
            com.airbnb.lottie.q.b.a<Integer, Integer> a2 = mVar.e().a();
            this.f8003g = a2;
            a2.a(this);
            aVar.i(a2);
            return;
        }
        this.f8002f = null;
        this.f8003g = null;
    }

    @Override // com.airbnb.lottie.q.b.a.InterfaceC0101a
    public void a() {
        this.f8005i.invalidateSelf();
    }

    @Override // com.airbnb.lottie.q.a.b
    public void b(List<b> list, List<b> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            b bVar = list2.get(i2);
            if (bVar instanceof l) {
                this.f8001e.add((l) bVar);
            }
        }
    }

    @Override // com.airbnb.lottie.s.f
    public void d(com.airbnb.lottie.s.e eVar, int i2, List<com.airbnb.lottie.s.e> list, com.airbnb.lottie.s.e eVar2) {
        com.airbnb.lottie.v.e.l(eVar, i2, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.q.a.d
    public void e(RectF rectF, Matrix matrix) {
        this.a.reset();
        for (int i2 = 0; i2 < this.f8001e.size(); i2++) {
            this.a.addPath(this.f8001e.get(i2).c(), matrix);
        }
        this.a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.q.a.d
    public void g(Canvas canvas, Matrix matrix, int i2) {
        com.airbnb.lottie.c.a("FillContent#draw");
        this.f7998b.setColor(this.f8002f.h().intValue());
        this.f7998b.setAlpha(com.airbnb.lottie.v.e.c((int) ((((i2 / 255.0f) * this.f8003g.h().intValue()) / 100.0f) * 255.0f), 0, 255));
        com.airbnb.lottie.q.b.a<ColorFilter, ColorFilter> aVar = this.f8004h;
        if (aVar != null) {
            this.f7998b.setColorFilter(aVar.h());
        }
        this.a.reset();
        for (int i3 = 0; i3 < this.f8001e.size(); i3++) {
            this.a.addPath(this.f8001e.get(i3).c(), matrix);
        }
        canvas.drawPath(this.a, this.f7998b);
        com.airbnb.lottie.c.c("FillContent#draw");
    }

    @Override // com.airbnb.lottie.q.a.b
    public String getName() {
        return this.f8000d;
    }

    @Override // com.airbnb.lottie.s.f
    public <T> void h(T t, com.airbnb.lottie.w.c<T> cVar) {
        if (t == com.airbnb.lottie.j.a) {
            this.f8002f.m(cVar);
            return;
        }
        if (t == com.airbnb.lottie.j.f7941d) {
            this.f8003g.m(cVar);
            return;
        }
        if (t == com.airbnb.lottie.j.x) {
            if (cVar == null) {
                this.f8004h = null;
                return;
            }
            com.airbnb.lottie.q.b.p pVar = new com.airbnb.lottie.q.b.p(cVar);
            this.f8004h = pVar;
            pVar.a(this);
            this.f7999c.i(this.f8004h);
        }
    }
}
