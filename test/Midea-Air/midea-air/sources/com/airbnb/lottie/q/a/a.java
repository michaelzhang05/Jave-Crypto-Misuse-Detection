package com.airbnb.lottie.q.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.q.b.a;
import com.airbnb.lottie.s.j.q;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseStrokeContent.java */
/* loaded from: classes.dex */
public abstract class a implements a.InterfaceC0101a, j, d {

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.f f7976e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.s.k.a f7977f;

    /* renamed from: h, reason: collision with root package name */
    private final float[] f7979h;

    /* renamed from: i, reason: collision with root package name */
    final Paint f7980i;

    /* renamed from: j, reason: collision with root package name */
    private final com.airbnb.lottie.q.b.a<?, Float> f7981j;

    /* renamed from: k, reason: collision with root package name */
    private final com.airbnb.lottie.q.b.a<?, Integer> f7982k;
    private final List<com.airbnb.lottie.q.b.a<?, Float>> l;
    private final com.airbnb.lottie.q.b.a<?, Float> m;
    private com.airbnb.lottie.q.b.a<ColorFilter, ColorFilter> n;
    private final PathMeasure a = new PathMeasure();

    /* renamed from: b, reason: collision with root package name */
    private final Path f7973b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final Path f7974c = new Path();

    /* renamed from: d, reason: collision with root package name */
    private final RectF f7975d = new RectF();

    /* renamed from: g, reason: collision with root package name */
    private final List<b> f7978g = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BaseStrokeContent.java */
    /* loaded from: classes.dex */
    public static final class b {
        private final List<l> a;

        /* renamed from: b, reason: collision with root package name */
        private final r f7983b;

        private b(r rVar) {
            this.a = new ArrayList();
            this.f7983b = rVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(com.airbnb.lottie.f fVar, com.airbnb.lottie.s.k.a aVar, Paint.Cap cap, Paint.Join join, float f2, com.airbnb.lottie.s.i.d dVar, com.airbnb.lottie.s.i.b bVar, List<com.airbnb.lottie.s.i.b> list, com.airbnb.lottie.s.i.b bVar2) {
        Paint paint = new Paint(1);
        this.f7980i = paint;
        this.f7976e = fVar;
        this.f7977f = aVar;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(cap);
        paint.setStrokeJoin(join);
        paint.setStrokeMiter(f2);
        this.f7982k = dVar.a();
        this.f7981j = bVar.a();
        if (bVar2 == null) {
            this.m = null;
        } else {
            this.m = bVar2.a();
        }
        this.l = new ArrayList(list.size());
        this.f7979h = new float[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.l.add(list.get(i2).a());
        }
        aVar.i(this.f7982k);
        aVar.i(this.f7981j);
        for (int i3 = 0; i3 < this.l.size(); i3++) {
            aVar.i(this.l.get(i3));
        }
        com.airbnb.lottie.q.b.a<?, Float> aVar2 = this.m;
        if (aVar2 != null) {
            aVar.i(aVar2);
        }
        this.f7982k.a(this);
        this.f7981j.a(this);
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.l.get(i4).a(this);
        }
        com.airbnb.lottie.q.b.a<?, Float> aVar3 = this.m;
        if (aVar3 != null) {
            aVar3.a(this);
        }
    }

    private void f(Matrix matrix) {
        com.airbnb.lottie.c.a("StrokeContent#applyDashPattern");
        if (this.l.isEmpty()) {
            com.airbnb.lottie.c.c("StrokeContent#applyDashPattern");
            return;
        }
        float f2 = com.airbnb.lottie.v.f.f(matrix);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            this.f7979h[i2] = this.l.get(i2).h().floatValue();
            if (i2 % 2 == 0) {
                float[] fArr = this.f7979h;
                if (fArr[i2] < 1.0f) {
                    fArr[i2] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f7979h;
                if (fArr2[i2] < 0.1f) {
                    fArr2[i2] = 0.1f;
                }
            }
            float[] fArr3 = this.f7979h;
            fArr3[i2] = fArr3[i2] * f2;
        }
        com.airbnb.lottie.q.b.a<?, Float> aVar = this.m;
        this.f7980i.setPathEffect(new DashPathEffect(this.f7979h, aVar == null ? 0.0f : aVar.h().floatValue()));
        com.airbnb.lottie.c.c("StrokeContent#applyDashPattern");
    }

    private void i(Canvas canvas, b bVar, Matrix matrix) {
        com.airbnb.lottie.c.a("StrokeContent#applyTrimPath");
        if (bVar.f7983b == null) {
            com.airbnb.lottie.c.c("StrokeContent#applyTrimPath");
            return;
        }
        this.f7973b.reset();
        for (int size = bVar.a.size() - 1; size >= 0; size--) {
            this.f7973b.addPath(((l) bVar.a.get(size)).c(), matrix);
        }
        this.a.setPath(this.f7973b, false);
        float length = this.a.getLength();
        while (this.a.nextContour()) {
            length += this.a.getLength();
        }
        float floatValue = (bVar.f7983b.h().h().floatValue() * length) / 360.0f;
        float floatValue2 = ((bVar.f7983b.i().h().floatValue() * length) / 100.0f) + floatValue;
        float floatValue3 = ((bVar.f7983b.f().h().floatValue() * length) / 100.0f) + floatValue;
        float f2 = 0.0f;
        for (int size2 = bVar.a.size() - 1; size2 >= 0; size2--) {
            this.f7974c.set(((l) bVar.a.get(size2)).c());
            this.f7974c.transform(matrix);
            this.a.setPath(this.f7974c, false);
            float length2 = this.a.getLength();
            if (floatValue3 > length) {
                float f3 = floatValue3 - length;
                if (f3 < f2 + length2 && f2 < f3) {
                    com.airbnb.lottie.v.f.a(this.f7974c, floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f, Math.min(f3 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f7974c, this.f7980i);
                    f2 += length2;
                }
            }
            float f4 = f2 + length2;
            if (f4 >= floatValue2 && f2 <= floatValue3) {
                if (f4 <= floatValue3 && floatValue2 < f2) {
                    canvas.drawPath(this.f7974c, this.f7980i);
                } else {
                    com.airbnb.lottie.v.f.a(this.f7974c, floatValue2 < f2 ? 0.0f : (floatValue2 - f2) / length2, floatValue3 <= f4 ? (floatValue3 - f2) / length2 : 1.0f, 0.0f);
                    canvas.drawPath(this.f7974c, this.f7980i);
                }
            }
            f2 += length2;
        }
        com.airbnb.lottie.c.c("StrokeContent#applyTrimPath");
    }

    @Override // com.airbnb.lottie.q.b.a.InterfaceC0101a
    public void a() {
        this.f7976e.invalidateSelf();
    }

    @Override // com.airbnb.lottie.q.a.b
    public void b(List<com.airbnb.lottie.q.a.b> list, List<com.airbnb.lottie.q.a.b> list2) {
        r rVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            com.airbnb.lottie.q.a.b bVar = list.get(size);
            if (bVar instanceof r) {
                r rVar2 = (r) bVar;
                if (rVar2.j() == q.a.Individually) {
                    rVar = rVar2;
                }
            }
        }
        if (rVar != null) {
            rVar.d(this);
        }
        b bVar2 = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            com.airbnb.lottie.q.a.b bVar3 = list2.get(size2);
            if (bVar3 instanceof r) {
                r rVar3 = (r) bVar3;
                if (rVar3.j() == q.a.Individually) {
                    if (bVar2 != null) {
                        this.f7978g.add(bVar2);
                    }
                    bVar2 = new b(rVar3);
                    rVar3.d(this);
                }
            }
            if (bVar3 instanceof l) {
                if (bVar2 == null) {
                    bVar2 = new b(rVar);
                }
                bVar2.a.add((l) bVar3);
            }
        }
        if (bVar2 != null) {
            this.f7978g.add(bVar2);
        }
    }

    @Override // com.airbnb.lottie.s.f
    public void d(com.airbnb.lottie.s.e eVar, int i2, List<com.airbnb.lottie.s.e> list, com.airbnb.lottie.s.e eVar2) {
        com.airbnb.lottie.v.e.l(eVar, i2, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.q.a.d
    public void e(RectF rectF, Matrix matrix) {
        com.airbnb.lottie.c.a("StrokeContent#getBounds");
        this.f7973b.reset();
        for (int i2 = 0; i2 < this.f7978g.size(); i2++) {
            b bVar = this.f7978g.get(i2);
            for (int i3 = 0; i3 < bVar.a.size(); i3++) {
                this.f7973b.addPath(((l) bVar.a.get(i3)).c(), matrix);
            }
        }
        this.f7973b.computeBounds(this.f7975d, false);
        float floatValue = this.f7981j.h().floatValue();
        RectF rectF2 = this.f7975d;
        float f2 = floatValue / 2.0f;
        rectF2.set(rectF2.left - f2, rectF2.top - f2, rectF2.right + f2, rectF2.bottom + f2);
        rectF.set(this.f7975d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.airbnb.lottie.c.c("StrokeContent#getBounds");
    }

    @Override // com.airbnb.lottie.q.a.d
    public void g(Canvas canvas, Matrix matrix, int i2) {
        com.airbnb.lottie.c.a("StrokeContent#draw");
        this.f7980i.setAlpha(com.airbnb.lottie.v.e.c((int) ((((i2 / 255.0f) * this.f7982k.h().intValue()) / 100.0f) * 255.0f), 0, 255));
        this.f7980i.setStrokeWidth(this.f7981j.h().floatValue() * com.airbnb.lottie.v.f.f(matrix));
        if (this.f7980i.getStrokeWidth() <= 0.0f) {
            com.airbnb.lottie.c.c("StrokeContent#draw");
            return;
        }
        f(matrix);
        com.airbnb.lottie.q.b.a<ColorFilter, ColorFilter> aVar = this.n;
        if (aVar != null) {
            this.f7980i.setColorFilter(aVar.h());
        }
        for (int i3 = 0; i3 < this.f7978g.size(); i3++) {
            b bVar = this.f7978g.get(i3);
            if (bVar.f7983b != null) {
                i(canvas, bVar, matrix);
            } else {
                com.airbnb.lottie.c.a("StrokeContent#buildPath");
                this.f7973b.reset();
                for (int size = bVar.a.size() - 1; size >= 0; size--) {
                    this.f7973b.addPath(((l) bVar.a.get(size)).c(), matrix);
                }
                com.airbnb.lottie.c.c("StrokeContent#buildPath");
                com.airbnb.lottie.c.a("StrokeContent#drawPath");
                canvas.drawPath(this.f7973b, this.f7980i);
                com.airbnb.lottie.c.c("StrokeContent#drawPath");
            }
        }
        com.airbnb.lottie.c.c("StrokeContent#draw");
    }

    @Override // com.airbnb.lottie.s.f
    public <T> void h(T t, com.airbnb.lottie.w.c<T> cVar) {
        if (t == com.airbnb.lottie.j.f7941d) {
            this.f7982k.m(cVar);
            return;
        }
        if (t == com.airbnb.lottie.j.f7948k) {
            this.f7981j.m(cVar);
            return;
        }
        if (t == com.airbnb.lottie.j.x) {
            if (cVar == null) {
                this.n = null;
                return;
            }
            com.airbnb.lottie.q.b.p pVar = new com.airbnb.lottie.q.b.p(cVar);
            this.n = pVar;
            pVar.a(this);
            this.f7977f.i(this.n);
        }
    }
}
