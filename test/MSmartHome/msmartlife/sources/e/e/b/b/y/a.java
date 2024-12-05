package e.e.b.b.y;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: ShadowRenderer.java */
/* loaded from: classes2.dex */
public class a {
    private static final int[] a = new int[3];

    /* renamed from: b, reason: collision with root package name */
    private static final float[] f17562b = {0.0f, 0.5f, 1.0f};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f17563c = new int[4];

    /* renamed from: d, reason: collision with root package name */
    private static final float[] f17564d = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: e, reason: collision with root package name */
    private final Paint f17565e;

    /* renamed from: f, reason: collision with root package name */
    private final Paint f17566f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f17567g;

    /* renamed from: h, reason: collision with root package name */
    private int f17568h;

    /* renamed from: i, reason: collision with root package name */
    private int f17569i;

    /* renamed from: j, reason: collision with root package name */
    private int f17570j;

    /* renamed from: k, reason: collision with root package name */
    private final Path f17571k;
    private Paint l;

    public a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i2, float f2, float f3) {
        boolean z = f3 < 0.0f;
        Path path = this.f17571k;
        if (z) {
            int[] iArr = f17563c;
            iArr[0] = 0;
            iArr[1] = this.f17570j;
            iArr[2] = this.f17569i;
            iArr[3] = this.f17568h;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f3);
            path.close();
            float f4 = -i2;
            rectF.inset(f4, f4);
            int[] iArr2 = f17563c;
            iArr2[0] = 0;
            iArr2[1] = this.f17568h;
            iArr2[2] = this.f17569i;
            iArr2[3] = this.f17570j;
        }
        float width = 1.0f - (i2 / (rectF.width() / 2.0f));
        float[] fArr = f17564d;
        fArr[1] = width;
        fArr[2] = ((1.0f - width) / 2.0f) + width;
        this.f17566f.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, f17563c, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.l);
        }
        canvas.drawArc(rectF, f2, f3, true, this.f17566f);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i2) {
        rectF.bottom += i2;
        rectF.offset(0.0f, -i2);
        int[] iArr = a;
        iArr[0] = this.f17570j;
        iArr[1] = this.f17569i;
        iArr[2] = this.f17568h;
        Paint paint = this.f17567g;
        float f2 = rectF.left;
        paint.setShader(new LinearGradient(f2, rectF.top, f2, rectF.bottom, iArr, f17562b, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f17567g);
        canvas.restore();
    }

    public Paint c() {
        return this.f17565e;
    }

    public void d(int i2) {
        this.f17568h = c.h.e.a.o(i2, 68);
        this.f17569i = c.h.e.a.o(i2, 20);
        this.f17570j = c.h.e.a.o(i2, 0);
        this.f17565e.setColor(this.f17568h);
    }

    public a(int i2) {
        this.f17571k = new Path();
        this.l = new Paint();
        this.f17565e = new Paint();
        d(i2);
        this.l.setColor(0);
        Paint paint = new Paint(4);
        this.f17566f = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f17567g = new Paint(paint);
    }
}
