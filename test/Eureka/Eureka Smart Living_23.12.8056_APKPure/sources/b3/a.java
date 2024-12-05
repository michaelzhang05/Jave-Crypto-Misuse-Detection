package b3;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes.dex */
public class a {

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f3825i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    private static final float[] f3826j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f3827k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f3828l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private final Paint f3829a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f3830b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f3831c;

    /* renamed from: d, reason: collision with root package name */
    private int f3832d;

    /* renamed from: e, reason: collision with root package name */
    private int f3833e;

    /* renamed from: f, reason: collision with root package name */
    private int f3834f;

    /* renamed from: g, reason: collision with root package name */
    private final Path f3835g;

    /* renamed from: h, reason: collision with root package name */
    private final Paint f3836h;

    public a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i6, float f6, float f7) {
        boolean z5 = f7 < 0.0f;
        Path path = this.f3835g;
        if (z5) {
            int[] iArr = f3827k;
            iArr[0] = 0;
            iArr[1] = this.f3834f;
            iArr[2] = this.f3833e;
            iArr[3] = this.f3832d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f6, f7);
            path.close();
            float f8 = -i6;
            rectF.inset(f8, f8);
            int[] iArr2 = f3827k;
            iArr2[0] = 0;
            iArr2[1] = this.f3832d;
            iArr2[2] = this.f3833e;
            iArr2[3] = this.f3834f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f9 = 1.0f - (i6 / width);
        float[] fArr = f3828l;
        fArr[1] = f9;
        fArr[2] = ((1.0f - f9) / 2.0f) + f9;
        this.f3830b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f3827k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z5) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f3836h);
        }
        canvas.drawArc(rectF, f6, f7, true, this.f3830b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i6) {
        rectF.bottom += i6;
        rectF.offset(0.0f, -i6);
        int[] iArr = f3825i;
        iArr[0] = this.f3834f;
        iArr[1] = this.f3833e;
        iArr[2] = this.f3832d;
        Paint paint = this.f3831c;
        float f6 = rectF.left;
        paint.setShader(new LinearGradient(f6, rectF.top, f6, rectF.bottom, iArr, f3826j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f3831c);
        canvas.restore();
    }

    public Paint c() {
        return this.f3829a;
    }

    public void d(int i6) {
        this.f3832d = androidx.core.graphics.a.j(i6, 68);
        this.f3833e = androidx.core.graphics.a.j(i6, 20);
        this.f3834f = androidx.core.graphics.a.j(i6, 0);
        this.f3829a.setColor(this.f3832d);
    }

    public a(int i6) {
        this.f3835g = new Path();
        Paint paint = new Paint();
        this.f3836h = paint;
        this.f3829a = new Paint();
        d(i6);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f3830b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f3831c = new Paint(paint2);
    }
}
