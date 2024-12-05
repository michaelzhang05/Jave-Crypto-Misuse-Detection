package com.airbnb.lottie.s.k;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.j;
import com.airbnb.lottie.q.b.p;
import com.airbnb.lottie.s.k.d;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CompositionLayer.java */
/* loaded from: classes.dex */
public class b extends com.airbnb.lottie.s.k.a {
    private com.airbnb.lottie.q.b.a<Float, Float> w;
    private final List<com.airbnb.lottie.s.k.a> x;
    private final RectF y;
    private final RectF z;

    /* compiled from: CompositionLayer.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.b.values().length];
            a = iArr;
            try {
                iArr[d.b.Add.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.b.Invert.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public b(com.airbnb.lottie.f fVar, d dVar, List<d> list, com.airbnb.lottie.d dVar2) {
        super(fVar, dVar);
        int i2;
        com.airbnb.lottie.s.k.a aVar;
        this.x = new ArrayList();
        this.y = new RectF();
        this.z = new RectF();
        com.airbnb.lottie.s.i.b s = dVar.s();
        if (s != null) {
            com.airbnb.lottie.q.b.a<Float, Float> a2 = s.a();
            this.w = a2;
            i(a2);
            this.w.a(this);
        } else {
            this.w = null;
        }
        c.e.d dVar3 = new c.e.d(dVar2.j().size());
        int size = list.size() - 1;
        com.airbnb.lottie.s.k.a aVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            d dVar4 = list.get(size);
            com.airbnb.lottie.s.k.a o = com.airbnb.lottie.s.k.a.o(dVar4, fVar, dVar2);
            if (o != null) {
                dVar3.k(o.p().b(), o);
                if (aVar2 != null) {
                    aVar2.y(o);
                    aVar2 = null;
                } else {
                    this.x.add(0, o);
                    int i3 = a.a[dVar4.f().ordinal()];
                    if (i3 == 1 || i3 == 2) {
                        aVar2 = o;
                    }
                }
            }
            size--;
        }
        for (i2 = 0; i2 < dVar3.n(); i2++) {
            com.airbnb.lottie.s.k.a aVar3 = (com.airbnb.lottie.s.k.a) dVar3.g(dVar3.j(i2));
            if (aVar3 != null && (aVar = (com.airbnb.lottie.s.k.a) dVar3.g(aVar3.p().h())) != null) {
                aVar3.z(aVar);
            }
        }
    }

    @Override // com.airbnb.lottie.s.k.a
    public void A(float f2) {
        super.A(f2);
        if (this.w != null) {
            f2 = (this.w.h().floatValue() * 1000.0f) / this.n.j().d();
        }
        if (this.o.t() != 0.0f) {
            f2 /= this.o.t();
        }
        float p = f2 - this.o.p();
        for (int size = this.x.size() - 1; size >= 0; size--) {
            this.x.get(size).A(p);
        }
    }

    @Override // com.airbnb.lottie.s.k.a, com.airbnb.lottie.q.a.d
    public void e(RectF rectF, Matrix matrix) {
        super.e(rectF, matrix);
        this.y.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.x.size() - 1; size >= 0; size--) {
            this.x.get(size).e(this.y, this.m);
            if (rectF.isEmpty()) {
                rectF.set(this.y);
            } else {
                rectF.set(Math.min(rectF.left, this.y.left), Math.min(rectF.top, this.y.top), Math.max(rectF.right, this.y.right), Math.max(rectF.bottom, this.y.bottom));
            }
        }
    }

    @Override // com.airbnb.lottie.s.k.a, com.airbnb.lottie.s.f
    public <T> void h(T t, com.airbnb.lottie.w.c<T> cVar) {
        super.h(t, cVar);
        if (t == j.w) {
            if (cVar == null) {
                this.w = null;
                return;
            }
            p pVar = new p(cVar);
            this.w = pVar;
            i(pVar);
        }
    }

    @Override // com.airbnb.lottie.s.k.a
    void n(Canvas canvas, Matrix matrix, int i2) {
        com.airbnb.lottie.c.a("CompositionLayer#draw");
        canvas.save();
        this.z.set(0.0f, 0.0f, this.o.j(), this.o.i());
        matrix.mapRect(this.z);
        for (int size = this.x.size() - 1; size >= 0; size--) {
            if (!this.z.isEmpty() ? canvas.clipRect(this.z) : true) {
                this.x.get(size).g(canvas, matrix, i2);
            }
        }
        canvas.restore();
        com.airbnb.lottie.c.c("CompositionLayer#draw");
    }

    @Override // com.airbnb.lottie.s.k.a
    protected void w(com.airbnb.lottie.s.e eVar, int i2, List<com.airbnb.lottie.s.e> list, com.airbnb.lottie.s.e eVar2) {
        for (int i3 = 0; i3 < this.x.size(); i3++) {
            this.x.get(i3).d(eVar, i2, list, eVar2);
        }
    }
}
