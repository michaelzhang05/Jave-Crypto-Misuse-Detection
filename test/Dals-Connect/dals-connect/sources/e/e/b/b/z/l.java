package e.e.b.b.z;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;

/* compiled from: ShapeAppearancePathProvider.java */
/* loaded from: classes2.dex */
public class l {
    private final m[] a = new m[4];

    /* renamed from: b, reason: collision with root package name */
    private final Matrix[] f17610b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    private final Matrix[] f17611c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    private final PointF f17612d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    private final Path f17613e = new Path();

    /* renamed from: f, reason: collision with root package name */
    private final Path f17614f = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final m f17615g = new m();

    /* renamed from: h, reason: collision with root package name */
    private final float[] f17616h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    private final float[] f17617i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    private boolean f17618j = true;

    /* compiled from: ShapeAppearancePathProvider.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(m mVar, Matrix matrix, int i2);

        void b(m mVar, Matrix matrix, int i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShapeAppearancePathProvider.java */
    /* loaded from: classes2.dex */
    public static final class b {
        public final k a;

        /* renamed from: b, reason: collision with root package name */
        public final Path f17619b;

        /* renamed from: c, reason: collision with root package name */
        public final RectF f17620c;

        /* renamed from: d, reason: collision with root package name */
        public final a f17621d;

        /* renamed from: e, reason: collision with root package name */
        public final float f17622e;

        b(k kVar, float f2, RectF rectF, a aVar, Path path) {
            this.f17621d = aVar;
            this.a = kVar;
            this.f17622e = f2;
            this.f17620c = rectF;
            this.f17619b = path;
        }
    }

    public l() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.a[i2] = new m();
            this.f17610b[i2] = new Matrix();
            this.f17611c[i2] = new Matrix();
        }
    }

    private float a(int i2) {
        return (i2 + 1) * 90;
    }

    private void b(b bVar, int i2) {
        this.f17616h[0] = this.a[i2].k();
        this.f17616h[1] = this.a[i2].l();
        this.f17610b[i2].mapPoints(this.f17616h);
        if (i2 == 0) {
            Path path = bVar.f17619b;
            float[] fArr = this.f17616h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = bVar.f17619b;
            float[] fArr2 = this.f17616h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.a[i2].d(this.f17610b[i2], bVar.f17619b);
        a aVar = bVar.f17621d;
        if (aVar != null) {
            aVar.a(this.a[i2], this.f17610b[i2], i2);
        }
    }

    private void c(b bVar, int i2) {
        int i3 = (i2 + 1) % 4;
        this.f17616h[0] = this.a[i2].i();
        this.f17616h[1] = this.a[i2].j();
        this.f17610b[i2].mapPoints(this.f17616h);
        this.f17617i[0] = this.a[i3].k();
        this.f17617i[1] = this.a[i3].l();
        this.f17610b[i3].mapPoints(this.f17617i);
        float f2 = this.f17616h[0];
        float[] fArr = this.f17617i;
        float max = Math.max(((float) Math.hypot(f2 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float i4 = i(bVar.f17620c, i2);
        this.f17615g.n(0.0f, 0.0f);
        f j2 = j(i2, bVar.a);
        j2.c(max, i4, bVar.f17622e, this.f17615g);
        Path path = new Path();
        this.f17615g.d(this.f17611c[i2], path);
        if (this.f17618j && Build.VERSION.SDK_INT >= 19 && (j2.b() || k(path, i2) || k(path, i3))) {
            path.op(path, this.f17614f, Path.Op.DIFFERENCE);
            this.f17616h[0] = this.f17615g.k();
            this.f17616h[1] = this.f17615g.l();
            this.f17611c[i2].mapPoints(this.f17616h);
            Path path2 = this.f17613e;
            float[] fArr2 = this.f17616h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f17615g.d(this.f17611c[i2], this.f17613e);
        } else {
            this.f17615g.d(this.f17611c[i2], bVar.f17619b);
        }
        a aVar = bVar.f17621d;
        if (aVar != null) {
            aVar.b(this.f17615g, this.f17611c[i2], i2);
        }
    }

    private void f(int i2, RectF rectF, PointF pointF) {
        if (i2 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i2 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i2 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private c g(int i2, k kVar) {
        if (i2 == 1) {
            return kVar.l();
        }
        if (i2 == 2) {
            return kVar.j();
        }
        if (i2 != 3) {
            return kVar.t();
        }
        return kVar.r();
    }

    private d h(int i2, k kVar) {
        if (i2 == 1) {
            return kVar.k();
        }
        if (i2 == 2) {
            return kVar.i();
        }
        if (i2 != 3) {
            return kVar.s();
        }
        return kVar.q();
    }

    private float i(RectF rectF, int i2) {
        float[] fArr = this.f17616h;
        m[] mVarArr = this.a;
        fArr[0] = mVarArr[i2].f17624c;
        fArr[1] = mVarArr[i2].f17625d;
        this.f17610b[i2].mapPoints(fArr);
        if (i2 != 1 && i2 != 3) {
            return Math.abs(rectF.centerY() - this.f17616h[1]);
        }
        return Math.abs(rectF.centerX() - this.f17616h[0]);
    }

    private f j(int i2, k kVar) {
        if (i2 == 1) {
            return kVar.h();
        }
        if (i2 == 2) {
            return kVar.n();
        }
        if (i2 != 3) {
            return kVar.o();
        }
        return kVar.p();
    }

    private boolean k(Path path, int i2) {
        Path path2 = new Path();
        this.a[i2].d(this.f17610b[i2], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private void l(b bVar, int i2) {
        h(i2, bVar.a).b(this.a[i2], 90.0f, bVar.f17622e, bVar.f17620c, g(i2, bVar.a));
        float a2 = a(i2);
        this.f17610b[i2].reset();
        f(i2, bVar.f17620c, this.f17612d);
        Matrix matrix = this.f17610b[i2];
        PointF pointF = this.f17612d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f17610b[i2].preRotate(a2);
    }

    private void m(int i2) {
        this.f17616h[0] = this.a[i2].i();
        this.f17616h[1] = this.a[i2].j();
        this.f17610b[i2].mapPoints(this.f17616h);
        float a2 = a(i2);
        this.f17611c[i2].reset();
        Matrix matrix = this.f17611c[i2];
        float[] fArr = this.f17616h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f17611c[i2].preRotate(a2);
    }

    public void d(k kVar, float f2, RectF rectF, Path path) {
        e(kVar, f2, rectF, null, path);
    }

    public void e(k kVar, float f2, RectF rectF, a aVar, Path path) {
        path.rewind();
        this.f17613e.rewind();
        this.f17614f.rewind();
        this.f17614f.addRect(rectF, Path.Direction.CW);
        b bVar = new b(kVar, f2, rectF, aVar, path);
        for (int i2 = 0; i2 < 4; i2++) {
            l(bVar, i2);
            m(i2);
        }
        for (int i3 = 0; i3 < 4; i3++) {
            b(bVar, i3);
            c(bVar, i3);
        }
        path.close();
        this.f17613e.close();
        if (Build.VERSION.SDK_INT < 19 || this.f17613e.isEmpty()) {
            return;
        }
        path.op(this.f17613e, Path.Op.UNION);
    }
}
