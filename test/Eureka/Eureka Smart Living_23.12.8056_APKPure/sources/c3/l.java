package c3;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final m[] f4102a = new m[4];

    /* renamed from: b, reason: collision with root package name */
    private final Matrix[] f4103b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    private final Matrix[] f4104c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    private final PointF f4105d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    private final Path f4106e = new Path();

    /* renamed from: f, reason: collision with root package name */
    private final Path f4107f = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final m f4108g = new m();

    /* renamed from: h, reason: collision with root package name */
    private final float[] f4109h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    private final float[] f4110i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    private final Path f4111j = new Path();

    /* renamed from: k, reason: collision with root package name */
    private final Path f4112k = new Path();

    /* renamed from: l, reason: collision with root package name */
    private boolean f4113l = true;

    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        static final l f4114a = new l();
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(m mVar, Matrix matrix, int i6);

        void b(m mVar, Matrix matrix, int i6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final k f4115a;

        /* renamed from: b, reason: collision with root package name */
        public final Path f4116b;

        /* renamed from: c, reason: collision with root package name */
        public final RectF f4117c;

        /* renamed from: d, reason: collision with root package name */
        public final b f4118d;

        /* renamed from: e, reason: collision with root package name */
        public final float f4119e;

        c(k kVar, float f6, RectF rectF, b bVar, Path path) {
            this.f4118d = bVar;
            this.f4115a = kVar;
            this.f4119e = f6;
            this.f4117c = rectF;
            this.f4116b = path;
        }
    }

    public l() {
        for (int i6 = 0; i6 < 4; i6++) {
            this.f4102a[i6] = new m();
            this.f4103b[i6] = new Matrix();
            this.f4104c[i6] = new Matrix();
        }
    }

    private float a(int i6) {
        return ((i6 + 1) % 4) * 90;
    }

    private void b(c cVar, int i6) {
        this.f4109h[0] = this.f4102a[i6].k();
        this.f4109h[1] = this.f4102a[i6].l();
        this.f4103b[i6].mapPoints(this.f4109h);
        Path path = cVar.f4116b;
        float[] fArr = this.f4109h;
        if (i6 == 0) {
            path.moveTo(fArr[0], fArr[1]);
        } else {
            path.lineTo(fArr[0], fArr[1]);
        }
        this.f4102a[i6].d(this.f4103b[i6], cVar.f4116b);
        b bVar = cVar.f4118d;
        if (bVar != null) {
            bVar.b(this.f4102a[i6], this.f4103b[i6], i6);
        }
    }

    private void c(c cVar, int i6) {
        m mVar;
        Matrix matrix;
        Path path;
        int i7 = (i6 + 1) % 4;
        this.f4109h[0] = this.f4102a[i6].i();
        this.f4109h[1] = this.f4102a[i6].j();
        this.f4103b[i6].mapPoints(this.f4109h);
        this.f4110i[0] = this.f4102a[i7].k();
        this.f4110i[1] = this.f4102a[i7].l();
        this.f4103b[i7].mapPoints(this.f4110i);
        float f6 = this.f4109h[0];
        float[] fArr = this.f4110i;
        float max = Math.max(((float) Math.hypot(f6 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float i8 = i(cVar.f4117c, i6);
        this.f4108g.n(0.0f, 0.0f);
        f j6 = j(i6, cVar.f4115a);
        j6.b(max, i8, cVar.f4119e, this.f4108g);
        this.f4111j.reset();
        this.f4108g.d(this.f4104c[i6], this.f4111j);
        if (this.f4113l && (j6.a() || l(this.f4111j, i6) || l(this.f4111j, i7))) {
            Path path2 = this.f4111j;
            path2.op(path2, this.f4107f, Path.Op.DIFFERENCE);
            this.f4109h[0] = this.f4108g.k();
            this.f4109h[1] = this.f4108g.l();
            this.f4104c[i6].mapPoints(this.f4109h);
            Path path3 = this.f4106e;
            float[] fArr2 = this.f4109h;
            path3.moveTo(fArr2[0], fArr2[1]);
            mVar = this.f4108g;
            matrix = this.f4104c[i6];
            path = this.f4106e;
        } else {
            mVar = this.f4108g;
            matrix = this.f4104c[i6];
            path = cVar.f4116b;
        }
        mVar.d(matrix, path);
        b bVar = cVar.f4118d;
        if (bVar != null) {
            bVar.a(this.f4108g, this.f4104c[i6], i6);
        }
    }

    private void f(int i6, RectF rectF, PointF pointF) {
        float f6;
        float f7;
        if (i6 == 1) {
            f6 = rectF.right;
        } else {
            if (i6 != 2) {
                f6 = i6 != 3 ? rectF.right : rectF.left;
                f7 = rectF.top;
                pointF.set(f6, f7);
            }
            f6 = rectF.left;
        }
        f7 = rectF.bottom;
        pointF.set(f6, f7);
    }

    private c3.c g(int i6, k kVar) {
        return i6 != 1 ? i6 != 2 ? i6 != 3 ? kVar.t() : kVar.r() : kVar.j() : kVar.l();
    }

    private d h(int i6, k kVar) {
        return i6 != 1 ? i6 != 2 ? i6 != 3 ? kVar.s() : kVar.q() : kVar.i() : kVar.k();
    }

    private float i(RectF rectF, int i6) {
        float centerX;
        float f6;
        float[] fArr = this.f4109h;
        m mVar = this.f4102a[i6];
        fArr[0] = mVar.f4122c;
        fArr[1] = mVar.f4123d;
        this.f4103b[i6].mapPoints(fArr);
        if (i6 == 1 || i6 == 3) {
            centerX = rectF.centerX();
            f6 = this.f4109h[0];
        } else {
            centerX = rectF.centerY();
            f6 = this.f4109h[1];
        }
        return Math.abs(centerX - f6);
    }

    private f j(int i6, k kVar) {
        return i6 != 1 ? i6 != 2 ? i6 != 3 ? kVar.o() : kVar.p() : kVar.n() : kVar.h();
    }

    public static l k() {
        return a.f4114a;
    }

    private boolean l(Path path, int i6) {
        this.f4112k.reset();
        this.f4102a[i6].d(this.f4103b[i6], this.f4112k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f4112k.computeBounds(rectF, true);
        path.op(this.f4112k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private void m(c cVar, int i6) {
        h(i6, cVar.f4115a).b(this.f4102a[i6], 90.0f, cVar.f4119e, cVar.f4117c, g(i6, cVar.f4115a));
        float a6 = a(i6);
        this.f4103b[i6].reset();
        f(i6, cVar.f4117c, this.f4105d);
        Matrix matrix = this.f4103b[i6];
        PointF pointF = this.f4105d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f4103b[i6].preRotate(a6);
    }

    private void n(int i6) {
        this.f4109h[0] = this.f4102a[i6].i();
        this.f4109h[1] = this.f4102a[i6].j();
        this.f4103b[i6].mapPoints(this.f4109h);
        float a6 = a(i6);
        this.f4104c[i6].reset();
        Matrix matrix = this.f4104c[i6];
        float[] fArr = this.f4109h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f4104c[i6].preRotate(a6);
    }

    public void d(k kVar, float f6, RectF rectF, Path path) {
        e(kVar, f6, rectF, null, path);
    }

    public void e(k kVar, float f6, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f4106e.rewind();
        this.f4107f.rewind();
        this.f4107f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(kVar, f6, rectF, bVar, path);
        for (int i6 = 0; i6 < 4; i6++) {
            m(cVar, i6);
            n(i6);
        }
        for (int i7 = 0; i7 < 4; i7++) {
            b(cVar, i7);
            c(cVar, i7);
        }
        path.close();
        this.f4106e.close();
        if (this.f4106e.isEmpty()) {
            return;
        }
        path.op(this.f4106e, Path.Op.UNION);
    }
}
