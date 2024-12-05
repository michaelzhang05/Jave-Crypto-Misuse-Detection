package com.airbnb.lottie.q.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.q.b.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GradientFillContent.java */
/* loaded from: classes.dex */
public class g implements d, a.InterfaceC0101a, j {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.s.k.a f8006b;

    /* renamed from: c, reason: collision with root package name */
    private final c.e.d<LinearGradient> f8007c = new c.e.d<>();

    /* renamed from: d, reason: collision with root package name */
    private final c.e.d<RadialGradient> f8008d = new c.e.d<>();

    /* renamed from: e, reason: collision with root package name */
    private final Matrix f8009e = new Matrix();

    /* renamed from: f, reason: collision with root package name */
    private final Path f8010f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f8011g;

    /* renamed from: h, reason: collision with root package name */
    private final RectF f8012h;

    /* renamed from: i, reason: collision with root package name */
    private final List<l> f8013i;

    /* renamed from: j, reason: collision with root package name */
    private final com.airbnb.lottie.s.j.f f8014j;

    /* renamed from: k, reason: collision with root package name */
    private final com.airbnb.lottie.q.b.a<com.airbnb.lottie.s.j.c, com.airbnb.lottie.s.j.c> f8015k;
    private final com.airbnb.lottie.q.b.a<Integer, Integer> l;
    private final com.airbnb.lottie.q.b.a<PointF, PointF> m;
    private final com.airbnb.lottie.q.b.a<PointF, PointF> n;
    private com.airbnb.lottie.q.b.a<ColorFilter, ColorFilter> o;
    private final com.airbnb.lottie.f p;
    private final int q;

    public g(com.airbnb.lottie.f fVar, com.airbnb.lottie.s.k.a aVar, com.airbnb.lottie.s.j.d dVar) {
        Path path = new Path();
        this.f8010f = path;
        this.f8011g = new Paint(1);
        this.f8012h = new RectF();
        this.f8013i = new ArrayList();
        this.f8006b = aVar;
        this.a = dVar.f();
        this.p = fVar;
        this.f8014j = dVar.e();
        path.setFillType(dVar.c());
        this.q = (int) (fVar.j().d() / 32.0f);
        com.airbnb.lottie.q.b.a<com.airbnb.lottie.s.j.c, com.airbnb.lottie.s.j.c> a = dVar.d().a();
        this.f8015k = a;
        a.a(this);
        aVar.i(a);
        com.airbnb.lottie.q.b.a<Integer, Integer> a2 = dVar.g().a();
        this.l = a2;
        a2.a(this);
        aVar.i(a2);
        com.airbnb.lottie.q.b.a<PointF, PointF> a3 = dVar.h().a();
        this.m = a3;
        a3.a(this);
        aVar.i(a3);
        com.airbnb.lottie.q.b.a<PointF, PointF> a4 = dVar.b().a();
        this.n = a4;
        a4.a(this);
        aVar.i(a4);
    }

    private int f() {
        int round = Math.round(this.m.f() * this.q);
        int round2 = Math.round(this.n.f() * this.q);
        int round3 = Math.round(this.f8015k.f() * this.q);
        int i2 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i2 = i2 * 31 * round2;
        }
        return round3 != 0 ? i2 * 31 * round3 : i2;
    }

    private LinearGradient i() {
        long f2 = f();
        LinearGradient g2 = this.f8007c.g(f2);
        if (g2 != null) {
            return g2;
        }
        PointF h2 = this.m.h();
        PointF h3 = this.n.h();
        com.airbnb.lottie.s.j.c h4 = this.f8015k.h();
        LinearGradient linearGradient = new LinearGradient(h2.x, h2.y, h3.x, h3.y, h4.a(), h4.b(), Shader.TileMode.CLAMP);
        this.f8007c.k(f2, linearGradient);
        return linearGradient;
    }

    private RadialGradient j() {
        long f2 = f();
        RadialGradient g2 = this.f8008d.g(f2);
        if (g2 != null) {
            return g2;
        }
        PointF h2 = this.m.h();
        PointF h3 = this.n.h();
        com.airbnb.lottie.s.j.c h4 = this.f8015k.h();
        int[] a = h4.a();
        float[] b2 = h4.b();
        RadialGradient radialGradient = new RadialGradient(h2.x, h2.y, (float) Math.hypot(h3.x - r6, h3.y - r7), a, b2, Shader.TileMode.CLAMP);
        this.f8008d.k(f2, radialGradient);
        return radialGradient;
    }

    @Override // com.airbnb.lottie.q.b.a.InterfaceC0101a
    public void a() {
        this.p.invalidateSelf();
    }

    @Override // com.airbnb.lottie.q.a.b
    public void b(List<b> list, List<b> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            b bVar = list2.get(i2);
            if (bVar instanceof l) {
                this.f8013i.add((l) bVar);
            }
        }
    }

    @Override // com.airbnb.lottie.s.f
    public void d(com.airbnb.lottie.s.e eVar, int i2, List<com.airbnb.lottie.s.e> list, com.airbnb.lottie.s.e eVar2) {
        com.airbnb.lottie.v.e.l(eVar, i2, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.q.a.d
    public void e(RectF rectF, Matrix matrix) {
        this.f8010f.reset();
        for (int i2 = 0; i2 < this.f8013i.size(); i2++) {
            this.f8010f.addPath(this.f8013i.get(i2).c(), matrix);
        }
        this.f8010f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.q.a.d
    public void g(Canvas canvas, Matrix matrix, int i2) {
        Shader j2;
        com.airbnb.lottie.c.a("GradientFillContent#draw");
        this.f8010f.reset();
        for (int i3 = 0; i3 < this.f8013i.size(); i3++) {
            this.f8010f.addPath(this.f8013i.get(i3).c(), matrix);
        }
        this.f8010f.computeBounds(this.f8012h, false);
        if (this.f8014j == com.airbnb.lottie.s.j.f.Linear) {
            j2 = i();
        } else {
            j2 = j();
        }
        this.f8009e.set(matrix);
        j2.setLocalMatrix(this.f8009e);
        this.f8011g.setShader(j2);
        com.airbnb.lottie.q.b.a<ColorFilter, ColorFilter> aVar = this.o;
        if (aVar != null) {
            this.f8011g.setColorFilter(aVar.h());
        }
        this.f8011g.setAlpha(com.airbnb.lottie.v.e.c((int) ((((i2 / 255.0f) * this.l.h().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f8010f, this.f8011g);
        com.airbnb.lottie.c.c("GradientFillContent#draw");
    }

    @Override // com.airbnb.lottie.q.a.b
    public String getName() {
        return this.a;
    }

    @Override // com.airbnb.lottie.s.f
    public <T> void h(T t, com.airbnb.lottie.w.c<T> cVar) {
        if (t == com.airbnb.lottie.j.x) {
            if (cVar == null) {
                this.o = null;
                return;
            }
            com.airbnb.lottie.q.b.p pVar = new com.airbnb.lottie.q.b.p(cVar);
            this.o = pVar;
            pVar.a(this);
            this.f8006b.i(this.o);
        }
    }
}
