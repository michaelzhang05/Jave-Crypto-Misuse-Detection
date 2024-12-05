package p5;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import i2.InterfaceC2777e;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: p5.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3609g implements InterfaceC2777e {

    /* renamed from: a, reason: collision with root package name */
    private final int f37059a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37060b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37061c;

    /* renamed from: d, reason: collision with root package name */
    private final a f37062d;

    /* renamed from: p5.g$a */
    /* loaded from: classes5.dex */
    public enum a {
        ALL,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT,
        OTHER_TOP_LEFT,
        OTHER_TOP_RIGHT,
        OTHER_BOTTOM_LEFT,
        OTHER_BOTTOM_RIGHT,
        DIAGONAL_FROM_TOP_LEFT,
        DIAGONAL_FROM_TOP_RIGHT
    }

    /* renamed from: p5.g$b */
    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37079a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.TOP_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.TOP_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.BOTTOM_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.BOTTOM_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.TOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a.BOTTOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[a.LEFT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[a.RIGHT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[a.OTHER_TOP_LEFT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[a.OTHER_TOP_RIGHT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[a.OTHER_BOTTOM_LEFT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[a.OTHER_BOTTOM_RIGHT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[a.DIAGONAL_FROM_TOP_LEFT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[a.DIAGONAL_FROM_TOP_RIGHT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            f37079a = iArr;
        }
    }

    public C3609g(int i8, a cornerType) {
        AbstractC3159y.i(cornerType, "cornerType");
        this.f37059a = i8;
        this.f37060b = i8 * 2;
        this.f37062d = cornerType;
    }

    private final void b(Canvas canvas, Paint paint, float f8, float f9) {
        RectF rectF = new RectF(this.f37061c, f9 - this.f37060b, r1 + r3, f9);
        int i8 = this.f37059a;
        canvas.drawRoundRect(rectF, i8, i8, paint);
        int i9 = this.f37061c;
        canvas.drawRect(new RectF(i9, i9, i9 + this.f37060b, f9 - this.f37059a), paint);
        canvas.drawRect(new RectF(this.f37059a + r1, this.f37061c, f8, f9), paint);
    }

    private final void c(Canvas canvas, Paint paint, float f8, float f9) {
        int i8 = this.f37060b;
        RectF rectF = new RectF(f8 - i8, f9 - i8, f8, f9);
        int i9 = this.f37059a;
        canvas.drawRoundRect(rectF, i9, i9, paint);
        int i10 = this.f37061c;
        canvas.drawRect(new RectF(i10, i10, f8 - this.f37059a, f9), paint);
        int i11 = this.f37059a;
        canvas.drawRect(new RectF(f8 - i11, this.f37061c, f8, f9 - i11), paint);
    }

    private final void d(Canvas canvas, Paint paint, float f8, float f9) {
        RectF rectF = new RectF(this.f37061c, f9 - this.f37060b, f8, f9);
        int i8 = this.f37059a;
        canvas.drawRoundRect(rectF, i8, i8, paint);
        int i9 = this.f37061c;
        canvas.drawRect(new RectF(i9, i9, f8, f9 - this.f37059a), paint);
    }

    private final void e(Canvas canvas, Paint paint, float f8, float f9) {
        int i8 = this.f37061c;
        int i9 = this.f37060b;
        RectF rectF = new RectF(i8, i8, i8 + i9, i8 + i9);
        int i10 = this.f37059a;
        canvas.drawRoundRect(rectF, i10, i10, paint);
        int i11 = this.f37060b;
        RectF rectF2 = new RectF(f8 - i11, f9 - i11, f8, f9);
        int i12 = this.f37059a;
        canvas.drawRoundRect(rectF2, i12, i12, paint);
        canvas.drawRect(new RectF(this.f37061c, r1 + r3, f8 - this.f37059a, f9), paint);
        canvas.drawRect(new RectF(r1 + r2, this.f37061c, f8, f9 - this.f37059a), paint);
    }

    private final void f(Canvas canvas, Paint paint, float f8, float f9) {
        int i8 = this.f37060b;
        RectF rectF = new RectF(f8 - i8, this.f37061c, f8, r3 + i8);
        int i9 = this.f37059a;
        canvas.drawRoundRect(rectF, i9, i9, paint);
        RectF rectF2 = new RectF(this.f37061c, f9 - this.f37060b, r1 + r3, f9);
        int i10 = this.f37059a;
        canvas.drawRoundRect(rectF2, i10, i10, paint);
        int i11 = this.f37061c;
        int i12 = this.f37059a;
        canvas.drawRect(new RectF(i11, i11, f8 - i12, f9 - i12), paint);
        int i13 = this.f37061c;
        int i14 = this.f37059a;
        canvas.drawRect(new RectF(i13 + i14, i13 + i14, f8, f9), paint);
    }

    private final void g(Canvas canvas, Paint paint, float f8, float f9) {
        int i8 = this.f37061c;
        RectF rectF = new RectF(i8, i8, i8 + this.f37060b, f9);
        int i9 = this.f37059a;
        canvas.drawRoundRect(rectF, i9, i9, paint);
        canvas.drawRect(new RectF(this.f37059a + r1, this.f37061c, f8, f9), paint);
    }

    private final void h(Canvas canvas, Paint paint, float f8, float f9) {
        int i8 = this.f37061c;
        RectF rectF = new RectF(i8, i8, f8, i8 + this.f37060b);
        int i9 = this.f37059a;
        canvas.drawRoundRect(rectF, i9, i9, paint);
        RectF rectF2 = new RectF(f8 - this.f37060b, this.f37061c, f8, f9);
        int i10 = this.f37059a;
        canvas.drawRoundRect(rectF2, i10, i10, paint);
        canvas.drawRect(new RectF(this.f37061c, r1 + r3, f8 - this.f37059a, f9), paint);
    }

    private final void i(Canvas canvas, Paint paint, float f8, float f9) {
        int i8 = this.f37061c;
        RectF rectF = new RectF(i8, i8, f8, i8 + this.f37060b);
        int i9 = this.f37059a;
        canvas.drawRoundRect(rectF, i9, i9, paint);
        int i10 = this.f37061c;
        RectF rectF2 = new RectF(i10, i10, i10 + this.f37060b, f9);
        int i11 = this.f37059a;
        canvas.drawRoundRect(rectF2, i11, i11, paint);
        int i12 = this.f37061c;
        int i13 = this.f37059a;
        canvas.drawRect(new RectF(i12 + i13, i12 + i13, f8, f9), paint);
    }

    private final void j(Canvas canvas, Paint paint, float f8, float f9) {
        RectF rectF = new RectF(this.f37061c, f9 - this.f37060b, f8, f9);
        int i8 = this.f37059a;
        canvas.drawRoundRect(rectF, i8, i8, paint);
        RectF rectF2 = new RectF(f8 - this.f37060b, this.f37061c, f8, f9);
        int i9 = this.f37059a;
        canvas.drawRoundRect(rectF2, i9, i9, paint);
        int i10 = this.f37061c;
        int i11 = this.f37059a;
        canvas.drawRect(new RectF(i10, i10, f8 - i11, f9 - i11), paint);
    }

    private final void k(Canvas canvas, Paint paint, float f8, float f9) {
        int i8 = this.f37061c;
        RectF rectF = new RectF(i8, i8, i8 + this.f37060b, f9);
        int i9 = this.f37059a;
        canvas.drawRoundRect(rectF, i9, i9, paint);
        RectF rectF2 = new RectF(this.f37061c, f9 - this.f37060b, f8, f9);
        int i10 = this.f37059a;
        canvas.drawRoundRect(rectF2, i10, i10, paint);
        canvas.drawRect(new RectF(r1 + r2, this.f37061c, f8, f9 - this.f37059a), paint);
    }

    private final void l(Canvas canvas, Paint paint, float f8, float f9) {
        RectF rectF = new RectF(f8 - this.f37060b, this.f37061c, f8, f9);
        int i8 = this.f37059a;
        canvas.drawRoundRect(rectF, i8, i8, paint);
        int i9 = this.f37061c;
        canvas.drawRect(new RectF(i9, i9, f8 - this.f37059a, f9), paint);
    }

    private final void m(Canvas canvas, Paint paint, float f8, float f9) {
        int i8 = this.f37061c;
        float f10 = f8 - i8;
        float f11 = f9 - i8;
        switch (b.f37079a[this.f37062d.ordinal()]) {
            case 1:
                int i9 = this.f37061c;
                RectF rectF = new RectF(i9, i9, f10, f11);
                int i10 = this.f37059a;
                canvas.drawRoundRect(rectF, i10, i10, paint);
                return;
            case 2:
                n(canvas, paint, f10, f11);
                return;
            case 3:
                o(canvas, paint, f10, f11);
                return;
            case 4:
                b(canvas, paint, f10, f11);
                return;
            case 5:
                c(canvas, paint, f10, f11);
                return;
            case 6:
                p(canvas, paint, f10, f11);
                return;
            case 7:
                d(canvas, paint, f10, f11);
                return;
            case 8:
                g(canvas, paint, f10, f11);
                return;
            case 9:
                l(canvas, paint, f10, f11);
                return;
            case 10:
                j(canvas, paint, f10, f11);
                return;
            case 11:
                k(canvas, paint, f10, f11);
                return;
            case 12:
                h(canvas, paint, f10, f11);
                return;
            case 13:
                i(canvas, paint, f10, f11);
                return;
            case 14:
                e(canvas, paint, f10, f11);
                return;
            case 15:
                f(canvas, paint, f10, f11);
                return;
            default:
                return;
        }
    }

    private final void n(Canvas canvas, Paint paint, float f8, float f9) {
        int i8 = this.f37061c;
        int i9 = this.f37060b;
        RectF rectF = new RectF(i8, i8, i8 + i9, i8 + i9);
        int i10 = this.f37059a;
        canvas.drawRoundRect(rectF, i10, i10, paint);
        int i11 = this.f37061c;
        int i12 = this.f37059a;
        canvas.drawRect(new RectF(i11, i11 + i12, i11 + i12, f9), paint);
        canvas.drawRect(new RectF(this.f37059a + r1, this.f37061c, f8, f9), paint);
    }

    private final void o(Canvas canvas, Paint paint, float f8, float f9) {
        int i8 = this.f37060b;
        RectF rectF = new RectF(f8 - i8, this.f37061c, f8, r3 + i8);
        int i9 = this.f37059a;
        canvas.drawRoundRect(rectF, i9, i9, paint);
        int i10 = this.f37061c;
        canvas.drawRect(new RectF(i10, i10, f8 - this.f37059a, f9), paint);
        canvas.drawRect(new RectF(f8 - this.f37059a, this.f37061c + r1, f8, f9), paint);
    }

    private final void p(Canvas canvas, Paint paint, float f8, float f9) {
        int i8 = this.f37061c;
        RectF rectF = new RectF(i8, i8, f8, i8 + this.f37060b);
        int i9 = this.f37059a;
        canvas.drawRoundRect(rectF, i9, i9, paint);
        canvas.drawRect(new RectF(this.f37061c, r1 + this.f37059a, f8, f9), paint);
    }

    @Override // i2.InterfaceC2777e
    public Bitmap a(Bitmap source) {
        AbstractC3159y.i(source, "source");
        int width = source.getWidth();
        int height = source.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        AbstractC3159y.h(createBitmap, "createBitmap(width, heig… Bitmap.Config.ARGB_8888)");
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(source, tileMode, tileMode));
        m(canvas, paint, width, height);
        source.recycle();
        return createBitmap;
    }

    @Override // i2.InterfaceC2777e
    public String key() {
        return "RoundedTransformation(radius=" + this.f37059a + ", margin=" + this.f37061c + ", diameter=" + this.f37060b + ", cornerType=" + this.f37062d.name() + ')';
    }

    public /* synthetic */ C3609g(int i8, a aVar, int i9, AbstractC3151p abstractC3151p) {
        this(i8, (i9 & 2) != 0 ? a.ALL : aVar);
    }
}
