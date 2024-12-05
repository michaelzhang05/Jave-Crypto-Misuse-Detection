package c3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public float f4120a;

    /* renamed from: b, reason: collision with root package name */
    public float f4121b;

    /* renamed from: c, reason: collision with root package name */
    public float f4122c;

    /* renamed from: d, reason: collision with root package name */
    public float f4123d;

    /* renamed from: e, reason: collision with root package name */
    public float f4124e;

    /* renamed from: f, reason: collision with root package name */
    public float f4125f;

    /* renamed from: g, reason: collision with root package name */
    private final List f4126g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final List f4127h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private boolean f4128i;

    /* loaded from: classes.dex */
    class a extends g {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f4129c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Matrix f4130d;

        a(List list, Matrix matrix) {
            this.f4129c = list;
            this.f4130d = matrix;
        }

        @Override // c3.m.g
        public void a(Matrix matrix, b3.a aVar, int i6, Canvas canvas) {
            Iterator it = this.f4129c.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(this.f4130d, aVar, i6, canvas);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends g {

        /* renamed from: c, reason: collision with root package name */
        private final d f4132c;

        public b(d dVar) {
            this.f4132c = dVar;
        }

        @Override // c3.m.g
        public void a(Matrix matrix, b3.a aVar, int i6, Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f4132c.k(), this.f4132c.o(), this.f4132c.l(), this.f4132c.j()), i6, this.f4132c.m(), this.f4132c.n());
        }
    }

    /* loaded from: classes.dex */
    static class c extends g {

        /* renamed from: c, reason: collision with root package name */
        private final e f4133c;

        /* renamed from: d, reason: collision with root package name */
        private final float f4134d;

        /* renamed from: e, reason: collision with root package name */
        private final float f4135e;

        public c(e eVar, float f6, float f7) {
            this.f4133c = eVar;
            this.f4134d = f6;
            this.f4135e = f7;
        }

        @Override // c3.m.g
        public void a(Matrix matrix, b3.a aVar, int i6, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f4133c.f4144c - this.f4135e, this.f4133c.f4143b - this.f4134d), 0.0f);
            this.f4147a.set(matrix);
            this.f4147a.preTranslate(this.f4134d, this.f4135e);
            this.f4147a.preRotate(c());
            aVar.b(canvas, this.f4147a, rectF, i6);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f4133c.f4144c - this.f4135e) / (this.f4133c.f4143b - this.f4134d)));
        }
    }

    /* loaded from: classes.dex */
    public static class d extends f {

        /* renamed from: h, reason: collision with root package name */
        private static final RectF f4136h = new RectF();

        /* renamed from: b, reason: collision with root package name */
        public float f4137b;

        /* renamed from: c, reason: collision with root package name */
        public float f4138c;

        /* renamed from: d, reason: collision with root package name */
        public float f4139d;

        /* renamed from: e, reason: collision with root package name */
        public float f4140e;

        /* renamed from: f, reason: collision with root package name */
        public float f4141f;

        /* renamed from: g, reason: collision with root package name */
        public float f4142g;

        public d(float f6, float f7, float f8, float f9) {
            q(f6);
            u(f7);
            r(f8);
            p(f9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.f4140e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f4137b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.f4139d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f4141f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.f4142g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f4138c;
        }

        private void p(float f6) {
            this.f4140e = f6;
        }

        private void q(float f6) {
            this.f4137b = f6;
        }

        private void r(float f6) {
            this.f4139d = f6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f6) {
            this.f4141f = f6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f6) {
            this.f4142g = f6;
        }

        private void u(float f6) {
            this.f4138c = f6;
        }

        @Override // c3.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f4145a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f4136h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    /* loaded from: classes.dex */
    public static class e extends f {

        /* renamed from: b, reason: collision with root package name */
        private float f4143b;

        /* renamed from: c, reason: collision with root package name */
        private float f4144c;

        @Override // c3.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f4145a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f4143b, this.f4144c);
            path.transform(matrix);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        protected final Matrix f4145a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class g {

        /* renamed from: b, reason: collision with root package name */
        static final Matrix f4146b = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        final Matrix f4147a = new Matrix();

        g() {
        }

        public abstract void a(Matrix matrix, b3.a aVar, int i6, Canvas canvas);

        public final void b(b3.a aVar, int i6, Canvas canvas) {
            a(f4146b, aVar, i6, canvas);
        }
    }

    public m() {
        n(0.0f, 0.0f);
    }

    private void b(float f6) {
        if (g() == f6) {
            return;
        }
        float g6 = ((f6 - g()) + 360.0f) % 360.0f;
        if (g6 > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(g6);
        this.f4127h.add(new b(dVar));
        p(f6);
    }

    private void c(g gVar, float f6, float f7) {
        b(f6);
        this.f4127h.add(gVar);
        p(f7);
    }

    private float g() {
        return this.f4124e;
    }

    private float h() {
        return this.f4125f;
    }

    private void p(float f6) {
        this.f4124e = f6;
    }

    private void q(float f6) {
        this.f4125f = f6;
    }

    private void r(float f6) {
        this.f4122c = f6;
    }

    private void s(float f6) {
        this.f4123d = f6;
    }

    private void t(float f6) {
        this.f4120a = f6;
    }

    private void u(float f6) {
        this.f4121b = f6;
    }

    public void a(float f6, float f7, float f8, float f9, float f10, float f11) {
        d dVar = new d(f6, f7, f8, f9);
        dVar.s(f10);
        dVar.t(f11);
        this.f4126g.add(dVar);
        b bVar = new b(dVar);
        float f12 = f10 + f11;
        boolean z5 = f11 < 0.0f;
        if (z5) {
            f10 = (f10 + 180.0f) % 360.0f;
        }
        c(bVar, f10, z5 ? (180.0f + f12) % 360.0f : f12);
        double d6 = f12;
        r(((f6 + f8) * 0.5f) + (((f8 - f6) / 2.0f) * ((float) Math.cos(Math.toRadians(d6)))));
        s(((f7 + f9) * 0.5f) + (((f9 - f7) / 2.0f) * ((float) Math.sin(Math.toRadians(d6)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f4126g.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((f) this.f4126g.get(i6)).a(matrix, path);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return this.f4128i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f4127h), new Matrix(matrix));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float i() {
        return this.f4122c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float j() {
        return this.f4123d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float k() {
        return this.f4120a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float l() {
        return this.f4121b;
    }

    public void m(float f6, float f7) {
        e eVar = new e();
        eVar.f4143b = f6;
        eVar.f4144c = f7;
        this.f4126g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f6);
        s(f7);
    }

    public void n(float f6, float f7) {
        o(f6, f7, 270.0f, 0.0f);
    }

    public void o(float f6, float f7, float f8, float f9) {
        t(f6);
        u(f7);
        r(f6);
        s(f7);
        p(f8);
        q((f8 + f9) % 360.0f);
        this.f4126g.clear();
        this.f4127h.clear();
        this.f4128i = false;
    }
}
