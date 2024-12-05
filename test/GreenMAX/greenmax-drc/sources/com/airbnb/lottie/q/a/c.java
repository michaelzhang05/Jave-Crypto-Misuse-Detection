package com.airbnb.lottie.q.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.q.b.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ContentGroup.java */
/* loaded from: classes.dex */
public class c implements d, l, a.InterfaceC0101a, com.airbnb.lottie.s.f {
    private final Matrix a;

    /* renamed from: b, reason: collision with root package name */
    private final Path f7984b;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f7985c;

    /* renamed from: d, reason: collision with root package name */
    private final String f7986d;

    /* renamed from: e, reason: collision with root package name */
    private final List<b> f7987e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.f f7988f;

    /* renamed from: g, reason: collision with root package name */
    private List<l> f7989g;

    /* renamed from: h, reason: collision with root package name */
    private com.airbnb.lottie.q.b.o f7990h;

    public c(com.airbnb.lottie.f fVar, com.airbnb.lottie.s.k.a aVar, com.airbnb.lottie.s.j.n nVar) {
        this(fVar, aVar, nVar.c(), f(fVar, aVar, nVar.b()), i(nVar.b()));
    }

    private static List<b> f(com.airbnb.lottie.f fVar, com.airbnb.lottie.s.k.a aVar, List<com.airbnb.lottie.s.j.b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            b a = list.get(i2).a(fVar, aVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    static com.airbnb.lottie.s.i.l i(List<com.airbnb.lottie.s.j.b> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.airbnb.lottie.s.j.b bVar = list.get(i2);
            if (bVar instanceof com.airbnb.lottie.s.i.l) {
                return (com.airbnb.lottie.s.i.l) bVar;
            }
        }
        return null;
    }

    @Override // com.airbnb.lottie.q.b.a.InterfaceC0101a
    public void a() {
        this.f7988f.invalidateSelf();
    }

    @Override // com.airbnb.lottie.q.a.b
    public void b(List<b> list, List<b> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f7987e.size());
        arrayList.addAll(list);
        for (int size = this.f7987e.size() - 1; size >= 0; size--) {
            b bVar = this.f7987e.get(size);
            bVar.b(arrayList, this.f7987e.subList(0, size));
            arrayList.add(bVar);
        }
    }

    @Override // com.airbnb.lottie.q.a.l
    public Path c() {
        this.a.reset();
        com.airbnb.lottie.q.b.o oVar = this.f7990h;
        if (oVar != null) {
            this.a.set(oVar.e());
        }
        this.f7984b.reset();
        for (int size = this.f7987e.size() - 1; size >= 0; size--) {
            b bVar = this.f7987e.get(size);
            if (bVar instanceof l) {
                this.f7984b.addPath(((l) bVar).c(), this.a);
            }
        }
        return this.f7984b;
    }

    @Override // com.airbnb.lottie.s.f
    public void d(com.airbnb.lottie.s.e eVar, int i2, List<com.airbnb.lottie.s.e> list, com.airbnb.lottie.s.e eVar2) {
        if (eVar.g(getName(), i2)) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i2)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i2)) {
                int e2 = i2 + eVar.e(getName(), i2);
                for (int i3 = 0; i3 < this.f7987e.size(); i3++) {
                    b bVar = this.f7987e.get(i3);
                    if (bVar instanceof com.airbnb.lottie.s.f) {
                        ((com.airbnb.lottie.s.f) bVar).d(eVar, e2, list, eVar2);
                    }
                }
            }
        }
    }

    @Override // com.airbnb.lottie.q.a.d
    public void e(RectF rectF, Matrix matrix) {
        this.a.set(matrix);
        com.airbnb.lottie.q.b.o oVar = this.f7990h;
        if (oVar != null) {
            this.a.preConcat(oVar.e());
        }
        this.f7985c.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f7987e.size() - 1; size >= 0; size--) {
            b bVar = this.f7987e.get(size);
            if (bVar instanceof d) {
                ((d) bVar).e(this.f7985c, this.a);
                if (rectF.isEmpty()) {
                    rectF.set(this.f7985c);
                } else {
                    rectF.set(Math.min(rectF.left, this.f7985c.left), Math.min(rectF.top, this.f7985c.top), Math.max(rectF.right, this.f7985c.right), Math.max(rectF.bottom, this.f7985c.bottom));
                }
            }
        }
    }

    @Override // com.airbnb.lottie.q.a.d
    public void g(Canvas canvas, Matrix matrix, int i2) {
        this.a.set(matrix);
        com.airbnb.lottie.q.b.o oVar = this.f7990h;
        if (oVar != null) {
            this.a.preConcat(oVar.e());
            i2 = (int) ((((this.f7990h.g().h().intValue() / 100.0f) * i2) / 255.0f) * 255.0f);
        }
        for (int size = this.f7987e.size() - 1; size >= 0; size--) {
            b bVar = this.f7987e.get(size);
            if (bVar instanceof d) {
                ((d) bVar).g(canvas, this.a, i2);
            }
        }
    }

    @Override // com.airbnb.lottie.q.a.b
    public String getName() {
        return this.f7986d;
    }

    @Override // com.airbnb.lottie.s.f
    public <T> void h(T t, com.airbnb.lottie.w.c<T> cVar) {
        com.airbnb.lottie.q.b.o oVar = this.f7990h;
        if (oVar != null) {
            oVar.c(t, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<l> j() {
        if (this.f7989g == null) {
            this.f7989g = new ArrayList();
            for (int i2 = 0; i2 < this.f7987e.size(); i2++) {
                b bVar = this.f7987e.get(i2);
                if (bVar instanceof l) {
                    this.f7989g.add((l) bVar);
                }
            }
        }
        return this.f7989g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Matrix k() {
        com.airbnb.lottie.q.b.o oVar = this.f7990h;
        if (oVar != null) {
            return oVar.e();
        }
        this.a.reset();
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(com.airbnb.lottie.f fVar, com.airbnb.lottie.s.k.a aVar, String str, List<b> list, com.airbnb.lottie.s.i.l lVar) {
        this.a = new Matrix();
        this.f7984b = new Path();
        this.f7985c = new RectF();
        this.f7986d = str;
        this.f7988f = fVar;
        this.f7987e = list;
        if (lVar != null) {
            com.airbnb.lottie.q.b.o b2 = lVar.b();
            this.f7990h = b2;
            b2.a(aVar);
            this.f7990h.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            b bVar = list.get(size);
            if (bVar instanceof i) {
                arrayList.add((i) bVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((i) arrayList.get(size2)).f(list.listIterator(list.size()));
        }
    }
}
