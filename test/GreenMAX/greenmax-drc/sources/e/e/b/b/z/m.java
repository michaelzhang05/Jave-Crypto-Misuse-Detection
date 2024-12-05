package e.e.b.b.z;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ShapePath.java */
/* loaded from: classes2.dex */
public class m {

    @Deprecated
    public float a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public float f17623b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f17624c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f17625d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f17626e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public float f17627f;

    /* renamed from: g, reason: collision with root package name */
    private final List<f> f17628g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final List<g> f17629h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private boolean f17630i;

    /* compiled from: ShapePath.java */
    /* loaded from: classes2.dex */
    class a extends g {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f17631b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Matrix f17632c;

        a(List list, Matrix matrix) {
            this.f17631b = list;
            this.f17632c = matrix;
        }

        @Override // e.e.b.b.z.m.g
        public void a(Matrix matrix, e.e.b.b.y.a aVar, int i2, Canvas canvas) {
            Iterator it = this.f17631b.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(this.f17632c, aVar, i2, canvas);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShapePath.java */
    /* loaded from: classes2.dex */
    public static class b extends g {

        /* renamed from: b, reason: collision with root package name */
        private final d f17634b;

        public b(d dVar) {
            this.f17634b = dVar;
        }

        @Override // e.e.b.b.z.m.g
        public void a(Matrix matrix, e.e.b.b.y.a aVar, int i2, Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f17634b.k(), this.f17634b.o(), this.f17634b.l(), this.f17634b.j()), i2, this.f17634b.m(), this.f17634b.n());
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes2.dex */
    static class c extends g {

        /* renamed from: b, reason: collision with root package name */
        private final e f17635b;

        /* renamed from: c, reason: collision with root package name */
        private final float f17636c;

        /* renamed from: d, reason: collision with root package name */
        private final float f17637d;

        public c(e eVar, float f2, float f3) {
            this.f17635b = eVar;
            this.f17636c = f2;
            this.f17637d = f3;
        }

        @Override // e.e.b.b.z.m.g
        public void a(Matrix matrix, e.e.b.b.y.a aVar, int i2, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f17635b.f17646c - this.f17637d, this.f17635b.f17645b - this.f17636c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f17636c, this.f17637d);
            matrix2.preRotate(c());
            aVar.b(canvas, matrix2, rectF, i2);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f17635b.f17646c - this.f17637d) / (this.f17635b.f17645b - this.f17636c)));
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes2.dex */
    public static class d extends f {

        /* renamed from: b, reason: collision with root package name */
        private static final RectF f17638b = new RectF();

        /* renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f17639c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public float f17640d;

        /* renamed from: e, reason: collision with root package name */
        @Deprecated
        public float f17641e;

        /* renamed from: f, reason: collision with root package name */
        @Deprecated
        public float f17642f;

        /* renamed from: g, reason: collision with root package name */
        @Deprecated
        public float f17643g;

        /* renamed from: h, reason: collision with root package name */
        @Deprecated
        public float f17644h;

        public d(float f2, float f3, float f4, float f5) {
            q(f2);
            u(f3);
            r(f4);
            p(f5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.f17642f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f17639c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.f17641e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f17643g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.f17644h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f17640d;
        }

        private void p(float f2) {
            this.f17642f = f2;
        }

        private void q(float f2) {
            this.f17639c = f2;
        }

        private void r(float f2) {
            this.f17641e = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f2) {
            this.f17643g = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f2) {
            this.f17644h = f2;
        }

        private void u(float f2) {
            this.f17640d = f2;
        }

        @Override // e.e.b.b.z.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f17638b;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes2.dex */
    public static class e extends f {

        /* renamed from: b, reason: collision with root package name */
        private float f17645b;

        /* renamed from: c, reason: collision with root package name */
        private float f17646c;

        @Override // e.e.b.b.z.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f17645b, this.f17646c);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes2.dex */
    public static abstract class f {
        protected final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShapePath.java */
    /* loaded from: classes2.dex */
    public static abstract class g {
        static final Matrix a = new Matrix();

        g() {
        }

        public abstract void a(Matrix matrix, e.e.b.b.y.a aVar, int i2, Canvas canvas);

        public final void b(e.e.b.b.y.a aVar, int i2, Canvas canvas) {
            a(a, aVar, i2, canvas);
        }
    }

    public m() {
        n(0.0f, 0.0f);
    }

    private void b(float f2) {
        if (g() == f2) {
            return;
        }
        float g2 = ((f2 - g()) + 360.0f) % 360.0f;
        if (g2 > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(g2);
        this.f17629h.add(new b(dVar));
        p(f2);
    }

    private void c(g gVar, float f2, float f3) {
        b(f2);
        this.f17629h.add(gVar);
        p(f3);
    }

    private float g() {
        return this.f17626e;
    }

    private float h() {
        return this.f17627f;
    }

    private void p(float f2) {
        this.f17626e = f2;
    }

    private void q(float f2) {
        this.f17627f = f2;
    }

    private void r(float f2) {
        this.f17624c = f2;
    }

    private void s(float f2) {
        this.f17625d = f2;
    }

    private void t(float f2) {
        this.a = f2;
    }

    private void u(float f2) {
        this.f17623b = f2;
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        d dVar = new d(f2, f3, f4, f5);
        dVar.s(f6);
        dVar.t(f7);
        this.f17628g.add(dVar);
        b bVar = new b(dVar);
        float f8 = f6 + f7;
        boolean z = f7 < 0.0f;
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        c(bVar, f6, z ? (180.0f + f8) % 360.0f : f8);
        double d2 = f8;
        r(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))));
        s(((f3 + f5) * 0.5f) + (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f17628g.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f17628g.get(i2).a(matrix, path);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return this.f17630i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f17629h), matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float i() {
        return this.f17624c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float j() {
        return this.f17625d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float k() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float l() {
        return this.f17623b;
    }

    public void m(float f2, float f3) {
        e eVar = new e();
        eVar.f17645b = f2;
        eVar.f17646c = f3;
        this.f17628g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f2);
        s(f3);
    }

    public void n(float f2, float f3) {
        o(f2, f3, 270.0f, 0.0f);
    }

    public void o(float f2, float f3, float f4, float f5) {
        t(f2);
        u(f3);
        r(f2);
        s(f3);
        p(f4);
        q((f4 + f5) % 360.0f);
        this.f17628g.clear();
        this.f17629h.clear();
        this.f17630i = false;
    }
}
