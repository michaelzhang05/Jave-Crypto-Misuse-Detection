package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.core.content.res.n;
import androidx.core.graphics.j;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class j extends androidx.vectordrawable.graphics.drawable.i {

    /* renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f3711k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    private h f3712b;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuffColorFilter f3713c;

    /* renamed from: d, reason: collision with root package name */
    private ColorFilter f3714d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3715e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f3716f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable.ConstantState f3717g;

    /* renamed from: h, reason: collision with root package name */
    private final float[] f3718h;

    /* renamed from: i, reason: collision with root package name */
    private final Matrix f3719i;

    /* renamed from: j, reason: collision with root package name */
    private final Rect f3720j;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends f {
        b() {
        }

        b(b bVar) {
            super(bVar);
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f3747b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f3746a = androidx.core.graphics.j.d(string2);
            }
            this.f3748c = n.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.j.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (n.j(xmlPullParser, "pathData")) {
                TypedArray k6 = n.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f3682d);
                f(k6, xmlPullParser);
                k6.recycle();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: e, reason: collision with root package name */
        private int[] f3721e;

        /* renamed from: f, reason: collision with root package name */
        androidx.core.content.res.d f3722f;

        /* renamed from: g, reason: collision with root package name */
        float f3723g;

        /* renamed from: h, reason: collision with root package name */
        androidx.core.content.res.d f3724h;

        /* renamed from: i, reason: collision with root package name */
        float f3725i;

        /* renamed from: j, reason: collision with root package name */
        float f3726j;

        /* renamed from: k, reason: collision with root package name */
        float f3727k;

        /* renamed from: l, reason: collision with root package name */
        float f3728l;

        /* renamed from: m, reason: collision with root package name */
        float f3729m;

        /* renamed from: n, reason: collision with root package name */
        Paint.Cap f3730n;

        /* renamed from: o, reason: collision with root package name */
        Paint.Join f3731o;

        /* renamed from: p, reason: collision with root package name */
        float f3732p;

        c() {
            this.f3723g = 0.0f;
            this.f3725i = 1.0f;
            this.f3726j = 1.0f;
            this.f3727k = 0.0f;
            this.f3728l = 1.0f;
            this.f3729m = 0.0f;
            this.f3730n = Paint.Cap.BUTT;
            this.f3731o = Paint.Join.MITER;
            this.f3732p = 4.0f;
        }

        private Paint.Cap e(int i6, Paint.Cap cap) {
            return i6 != 0 ? i6 != 1 ? i6 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join f(int i6, Paint.Join join) {
            return i6 != 0 ? i6 != 1 ? i6 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f3721e = null;
            if (n.j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f3747b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f3746a = androidx.core.graphics.j.d(string2);
                }
                this.f3724h = n.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f3726j = n.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f3726j);
                this.f3730n = e(n.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f3730n);
                this.f3731o = f(n.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f3731o);
                this.f3732p = n.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f3732p);
                this.f3722f = n.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f3725i = n.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f3725i);
                this.f3723g = n.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f3723g);
                this.f3728l = n.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f3728l);
                this.f3729m = n.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f3729m);
                this.f3727k = n.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f3727k);
                this.f3748c = n.g(typedArray, xmlPullParser, "fillType", 13, this.f3748c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.j.e
        public boolean a() {
            return this.f3724h.i() || this.f3722f.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.j.e
        public boolean b(int[] iArr) {
            return this.f3722f.j(iArr) | this.f3724h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k6 = n.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f3681c);
            h(k6, xmlPullParser, theme);
            k6.recycle();
        }

        float getFillAlpha() {
            return this.f3726j;
        }

        int getFillColor() {
            return this.f3724h.e();
        }

        float getStrokeAlpha() {
            return this.f3725i;
        }

        int getStrokeColor() {
            return this.f3722f.e();
        }

        float getStrokeWidth() {
            return this.f3723g;
        }

        float getTrimPathEnd() {
            return this.f3728l;
        }

        float getTrimPathOffset() {
            return this.f3729m;
        }

        float getTrimPathStart() {
            return this.f3727k;
        }

        void setFillAlpha(float f6) {
            this.f3726j = f6;
        }

        void setFillColor(int i6) {
            this.f3724h.k(i6);
        }

        void setStrokeAlpha(float f6) {
            this.f3725i = f6;
        }

        void setStrokeColor(int i6) {
            this.f3722f.k(i6);
        }

        void setStrokeWidth(float f6) {
            this.f3723g = f6;
        }

        void setTrimPathEnd(float f6) {
            this.f3728l = f6;
        }

        void setTrimPathOffset(float f6) {
            this.f3729m = f6;
        }

        void setTrimPathStart(float f6) {
            this.f3727k = f6;
        }

        c(c cVar) {
            super(cVar);
            this.f3723g = 0.0f;
            this.f3725i = 1.0f;
            this.f3726j = 1.0f;
            this.f3727k = 0.0f;
            this.f3728l = 1.0f;
            this.f3729m = 0.0f;
            this.f3730n = Paint.Cap.BUTT;
            this.f3731o = Paint.Join.MITER;
            this.f3732p = 4.0f;
            this.f3721e = cVar.f3721e;
            this.f3722f = cVar.f3722f;
            this.f3723g = cVar.f3723g;
            this.f3725i = cVar.f3725i;
            this.f3724h = cVar.f3724h;
            this.f3748c = cVar.f3748c;
            this.f3726j = cVar.f3726j;
            this.f3727k = cVar.f3727k;
            this.f3728l = cVar.f3728l;
            this.f3729m = cVar.f3729m;
            this.f3730n = cVar.f3730n;
            this.f3731o = cVar.f3731o;
            this.f3732p = cVar.f3732p;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        final Matrix f3733a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList f3734b;

        /* renamed from: c, reason: collision with root package name */
        float f3735c;

        /* renamed from: d, reason: collision with root package name */
        private float f3736d;

        /* renamed from: e, reason: collision with root package name */
        private float f3737e;

        /* renamed from: f, reason: collision with root package name */
        private float f3738f;

        /* renamed from: g, reason: collision with root package name */
        private float f3739g;

        /* renamed from: h, reason: collision with root package name */
        private float f3740h;

        /* renamed from: i, reason: collision with root package name */
        private float f3741i;

        /* renamed from: j, reason: collision with root package name */
        final Matrix f3742j;

        /* renamed from: k, reason: collision with root package name */
        int f3743k;

        /* renamed from: l, reason: collision with root package name */
        private int[] f3744l;

        /* renamed from: m, reason: collision with root package name */
        private String f3745m;

        public d() {
            super();
            this.f3733a = new Matrix();
            this.f3734b = new ArrayList();
            this.f3735c = 0.0f;
            this.f3736d = 0.0f;
            this.f3737e = 0.0f;
            this.f3738f = 1.0f;
            this.f3739g = 1.0f;
            this.f3740h = 0.0f;
            this.f3741i = 0.0f;
            this.f3742j = new Matrix();
            this.f3745m = null;
        }

        private void d() {
            this.f3742j.reset();
            this.f3742j.postTranslate(-this.f3736d, -this.f3737e);
            this.f3742j.postScale(this.f3738f, this.f3739g);
            this.f3742j.postRotate(this.f3735c, 0.0f, 0.0f);
            this.f3742j.postTranslate(this.f3740h + this.f3736d, this.f3741i + this.f3737e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f3744l = null;
            this.f3735c = n.f(typedArray, xmlPullParser, "rotation", 5, this.f3735c);
            this.f3736d = typedArray.getFloat(1, this.f3736d);
            this.f3737e = typedArray.getFloat(2, this.f3737e);
            this.f3738f = n.f(typedArray, xmlPullParser, "scaleX", 3, this.f3738f);
            this.f3739g = n.f(typedArray, xmlPullParser, "scaleY", 4, this.f3739g);
            this.f3740h = n.f(typedArray, xmlPullParser, "translateX", 6, this.f3740h);
            this.f3741i = n.f(typedArray, xmlPullParser, "translateY", 7, this.f3741i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f3745m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.j.e
        public boolean a() {
            for (int i6 = 0; i6 < this.f3734b.size(); i6++) {
                if (((e) this.f3734b.get(i6)).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.j.e
        public boolean b(int[] iArr) {
            boolean z5 = false;
            for (int i6 = 0; i6 < this.f3734b.size(); i6++) {
                z5 |= ((e) this.f3734b.get(i6)).b(iArr);
            }
            return z5;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k6 = n.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f3680b);
            e(k6, xmlPullParser);
            k6.recycle();
        }

        public String getGroupName() {
            return this.f3745m;
        }

        public Matrix getLocalMatrix() {
            return this.f3742j;
        }

        public float getPivotX() {
            return this.f3736d;
        }

        public float getPivotY() {
            return this.f3737e;
        }

        public float getRotation() {
            return this.f3735c;
        }

        public float getScaleX() {
            return this.f3738f;
        }

        public float getScaleY() {
            return this.f3739g;
        }

        public float getTranslateX() {
            return this.f3740h;
        }

        public float getTranslateY() {
            return this.f3741i;
        }

        public void setPivotX(float f6) {
            if (f6 != this.f3736d) {
                this.f3736d = f6;
                d();
            }
        }

        public void setPivotY(float f6) {
            if (f6 != this.f3737e) {
                this.f3737e = f6;
                d();
            }
        }

        public void setRotation(float f6) {
            if (f6 != this.f3735c) {
                this.f3735c = f6;
                d();
            }
        }

        public void setScaleX(float f6) {
            if (f6 != this.f3738f) {
                this.f3738f = f6;
                d();
            }
        }

        public void setScaleY(float f6) {
            if (f6 != this.f3739g) {
                this.f3739g = f6;
                d();
            }
        }

        public void setTranslateX(float f6) {
            if (f6 != this.f3740h) {
                this.f3740h = f6;
                d();
            }
        }

        public void setTranslateY(float f6) {
            if (f6 != this.f3741i) {
                this.f3741i = f6;
                d();
            }
        }

        public d(d dVar, l.a aVar) {
            super();
            f bVar;
            this.f3733a = new Matrix();
            this.f3734b = new ArrayList();
            this.f3735c = 0.0f;
            this.f3736d = 0.0f;
            this.f3737e = 0.0f;
            this.f3738f = 1.0f;
            this.f3739g = 1.0f;
            this.f3740h = 0.0f;
            this.f3741i = 0.0f;
            Matrix matrix = new Matrix();
            this.f3742j = matrix;
            this.f3745m = null;
            this.f3735c = dVar.f3735c;
            this.f3736d = dVar.f3736d;
            this.f3737e = dVar.f3737e;
            this.f3738f = dVar.f3738f;
            this.f3739g = dVar.f3739g;
            this.f3740h = dVar.f3740h;
            this.f3741i = dVar.f3741i;
            this.f3744l = dVar.f3744l;
            String str = dVar.f3745m;
            this.f3745m = str;
            this.f3743k = dVar.f3743k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f3742j);
            ArrayList arrayList = dVar.f3734b;
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                Object obj = arrayList.get(i6);
                if (obj instanceof d) {
                    this.f3734b.add(new d((d) obj, aVar));
                } else {
                    if (obj instanceof c) {
                        bVar = new c((c) obj);
                    } else {
                        if (!(obj instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) obj);
                    }
                    this.f3734b.add(bVar);
                    Object obj2 = bVar.f3747b;
                    if (obj2 != null) {
                        aVar.put(obj2, bVar);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class f extends e {

        /* renamed from: a, reason: collision with root package name */
        protected j.b[] f3746a;

        /* renamed from: b, reason: collision with root package name */
        String f3747b;

        /* renamed from: c, reason: collision with root package name */
        int f3748c;

        /* renamed from: d, reason: collision with root package name */
        int f3749d;

        public f() {
            super();
            this.f3746a = null;
            this.f3748c = 0;
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            j.b[] bVarArr = this.f3746a;
            if (bVarArr != null) {
                j.b.e(bVarArr, path);
            }
        }

        public j.b[] getPathData() {
            return this.f3746a;
        }

        public String getPathName() {
            return this.f3747b;
        }

        public void setPathData(j.b[] bVarArr) {
            if (androidx.core.graphics.j.b(this.f3746a, bVarArr)) {
                androidx.core.graphics.j.j(this.f3746a, bVarArr);
            } else {
                this.f3746a = androidx.core.graphics.j.f(bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f3746a = null;
            this.f3748c = 0;
            this.f3747b = fVar.f3747b;
            this.f3749d = fVar.f3749d;
            this.f3746a = androidx.core.graphics.j.f(fVar.f3746a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: q, reason: collision with root package name */
        private static final Matrix f3750q = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        private final Path f3751a;

        /* renamed from: b, reason: collision with root package name */
        private final Path f3752b;

        /* renamed from: c, reason: collision with root package name */
        private final Matrix f3753c;

        /* renamed from: d, reason: collision with root package name */
        Paint f3754d;

        /* renamed from: e, reason: collision with root package name */
        Paint f3755e;

        /* renamed from: f, reason: collision with root package name */
        private PathMeasure f3756f;

        /* renamed from: g, reason: collision with root package name */
        private int f3757g;

        /* renamed from: h, reason: collision with root package name */
        final d f3758h;

        /* renamed from: i, reason: collision with root package name */
        float f3759i;

        /* renamed from: j, reason: collision with root package name */
        float f3760j;

        /* renamed from: k, reason: collision with root package name */
        float f3761k;

        /* renamed from: l, reason: collision with root package name */
        float f3762l;

        /* renamed from: m, reason: collision with root package name */
        int f3763m;

        /* renamed from: n, reason: collision with root package name */
        String f3764n;

        /* renamed from: o, reason: collision with root package name */
        Boolean f3765o;

        /* renamed from: p, reason: collision with root package name */
        final l.a f3766p;

        public g() {
            this.f3753c = new Matrix();
            this.f3759i = 0.0f;
            this.f3760j = 0.0f;
            this.f3761k = 0.0f;
            this.f3762l = 0.0f;
            this.f3763m = 255;
            this.f3764n = null;
            this.f3765o = null;
            this.f3766p = new l.a();
            this.f3758h = new d();
            this.f3751a = new Path();
            this.f3752b = new Path();
        }

        private static float a(float f6, float f7, float f8, float f9) {
            return (f6 * f9) - (f7 * f8);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i6, int i7, ColorFilter colorFilter) {
            dVar.f3733a.set(matrix);
            dVar.f3733a.preConcat(dVar.f3742j);
            canvas.save();
            for (int i8 = 0; i8 < dVar.f3734b.size(); i8++) {
                e eVar = (e) dVar.f3734b.get(i8);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f3733a, canvas, i6, i7, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i6, i7, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i6, int i7, ColorFilter colorFilter) {
            float f6 = i6 / this.f3761k;
            float f7 = i7 / this.f3762l;
            float min = Math.min(f6, f7);
            Matrix matrix = dVar.f3733a;
            this.f3753c.set(matrix);
            this.f3753c.postScale(f6, f7);
            float e6 = e(matrix);
            if (e6 == 0.0f) {
                return;
            }
            fVar.d(this.f3751a);
            Path path = this.f3751a;
            this.f3752b.reset();
            if (fVar.c()) {
                this.f3752b.setFillType(fVar.f3748c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f3752b.addPath(path, this.f3753c);
                canvas.clipPath(this.f3752b);
                return;
            }
            c cVar = (c) fVar;
            float f8 = cVar.f3727k;
            if (f8 != 0.0f || cVar.f3728l != 1.0f) {
                float f9 = cVar.f3729m;
                float f10 = (f8 + f9) % 1.0f;
                float f11 = (cVar.f3728l + f9) % 1.0f;
                if (this.f3756f == null) {
                    this.f3756f = new PathMeasure();
                }
                this.f3756f.setPath(this.f3751a, false);
                float length = this.f3756f.getLength();
                float f12 = f10 * length;
                float f13 = f11 * length;
                path.reset();
                if (f12 > f13) {
                    this.f3756f.getSegment(f12, length, path, true);
                    this.f3756f.getSegment(0.0f, f13, path, true);
                } else {
                    this.f3756f.getSegment(f12, f13, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f3752b.addPath(path, this.f3753c);
            if (cVar.f3724h.l()) {
                androidx.core.content.res.d dVar2 = cVar.f3724h;
                if (this.f3755e == null) {
                    Paint paint = new Paint(1);
                    this.f3755e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f3755e;
                if (dVar2.h()) {
                    Shader f14 = dVar2.f();
                    f14.setLocalMatrix(this.f3753c);
                    paint2.setShader(f14);
                    paint2.setAlpha(Math.round(cVar.f3726j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(j.a(dVar2.e(), cVar.f3726j));
                }
                paint2.setColorFilter(colorFilter);
                this.f3752b.setFillType(cVar.f3748c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f3752b, paint2);
            }
            if (cVar.f3722f.l()) {
                androidx.core.content.res.d dVar3 = cVar.f3722f;
                if (this.f3754d == null) {
                    Paint paint3 = new Paint(1);
                    this.f3754d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f3754d;
                Paint.Join join = cVar.f3731o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f3730n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f3732p);
                if (dVar3.h()) {
                    Shader f15 = dVar3.f();
                    f15.setLocalMatrix(this.f3753c);
                    paint4.setShader(f15);
                    paint4.setAlpha(Math.round(cVar.f3725i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(j.a(dVar3.e(), cVar.f3725i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f3723g * min * e6);
                canvas.drawPath(this.f3752b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot(fArr[0], fArr[1]);
            float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float a6 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(a6) / max;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i6, int i7, ColorFilter colorFilter) {
            c(this.f3758h, f3750q, canvas, i6, i7, colorFilter);
        }

        public boolean f() {
            if (this.f3765o == null) {
                this.f3765o = Boolean.valueOf(this.f3758h.a());
            }
            return this.f3765o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f3758h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f3763m;
        }

        public void setAlpha(float f6) {
            setRootAlpha((int) (f6 * 255.0f));
        }

        public void setRootAlpha(int i6) {
            this.f3763m = i6;
        }

        public g(g gVar) {
            this.f3753c = new Matrix();
            this.f3759i = 0.0f;
            this.f3760j = 0.0f;
            this.f3761k = 0.0f;
            this.f3762l = 0.0f;
            this.f3763m = 255;
            this.f3764n = null;
            this.f3765o = null;
            l.a aVar = new l.a();
            this.f3766p = aVar;
            this.f3758h = new d(gVar.f3758h, aVar);
            this.f3751a = new Path(gVar.f3751a);
            this.f3752b = new Path(gVar.f3752b);
            this.f3759i = gVar.f3759i;
            this.f3760j = gVar.f3760j;
            this.f3761k = gVar.f3761k;
            this.f3762l = gVar.f3762l;
            this.f3757g = gVar.f3757g;
            this.f3763m = gVar.f3763m;
            this.f3764n = gVar.f3764n;
            String str = gVar.f3764n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f3765o = gVar.f3765o;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f3767a;

        /* renamed from: b, reason: collision with root package name */
        g f3768b;

        /* renamed from: c, reason: collision with root package name */
        ColorStateList f3769c;

        /* renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f3770d;

        /* renamed from: e, reason: collision with root package name */
        boolean f3771e;

        /* renamed from: f, reason: collision with root package name */
        Bitmap f3772f;

        /* renamed from: g, reason: collision with root package name */
        ColorStateList f3773g;

        /* renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f3774h;

        /* renamed from: i, reason: collision with root package name */
        int f3775i;

        /* renamed from: j, reason: collision with root package name */
        boolean f3776j;

        /* renamed from: k, reason: collision with root package name */
        boolean f3777k;

        /* renamed from: l, reason: collision with root package name */
        Paint f3778l;

        public h() {
            this.f3769c = null;
            this.f3770d = j.f3711k;
            this.f3768b = new g();
        }

        public boolean a(int i6, int i7) {
            return i6 == this.f3772f.getWidth() && i7 == this.f3772f.getHeight();
        }

        public boolean b() {
            return !this.f3777k && this.f3773g == this.f3769c && this.f3774h == this.f3770d && this.f3776j == this.f3771e && this.f3775i == this.f3768b.getRootAlpha();
        }

        public void c(int i6, int i7) {
            if (this.f3772f == null || !a(i6, i7)) {
                this.f3772f = Bitmap.createBitmap(i6, i7, Bitmap.Config.ARGB_8888);
                this.f3777k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f3772f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f3778l == null) {
                Paint paint = new Paint();
                this.f3778l = paint;
                paint.setFilterBitmap(true);
            }
            this.f3778l.setAlpha(this.f3768b.getRootAlpha());
            this.f3778l.setColorFilter(colorFilter);
            return this.f3778l;
        }

        public boolean f() {
            return this.f3768b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f3768b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f3767a;
        }

        public boolean h(int[] iArr) {
            boolean g6 = this.f3768b.g(iArr);
            this.f3777k |= g6;
            return g6;
        }

        public void i() {
            this.f3773g = this.f3769c;
            this.f3774h = this.f3770d;
            this.f3775i = this.f3768b.getRootAlpha();
            this.f3776j = this.f3771e;
            this.f3777k = false;
        }

        public void j(int i6, int i7) {
            this.f3772f.eraseColor(0);
            this.f3768b.b(new Canvas(this.f3772f), i6, i7, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new j(this);
        }

        public h(h hVar) {
            this.f3769c = null;
            this.f3770d = j.f3711k;
            if (hVar != null) {
                this.f3767a = hVar.f3767a;
                g gVar = new g(hVar.f3768b);
                this.f3768b = gVar;
                if (hVar.f3768b.f3755e != null) {
                    gVar.f3755e = new Paint(hVar.f3768b.f3755e);
                }
                if (hVar.f3768b.f3754d != null) {
                    this.f3768b.f3754d = new Paint(hVar.f3768b.f3754d);
                }
                this.f3769c = hVar.f3769c;
                this.f3770d = hVar.f3770d;
                this.f3771e = hVar.f3771e;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new j(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class i extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f3779a;

        public i(Drawable.ConstantState constantState) {
            this.f3779a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f3779a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f3779a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            j jVar = new j();
            jVar.f3710a = (VectorDrawable) this.f3779a.newDrawable();
            return jVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            j jVar = new j();
            jVar.f3710a = (VectorDrawable) this.f3779a.newDrawable(resources);
            return jVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            j jVar = new j();
            jVar.f3710a = (VectorDrawable) this.f3779a.newDrawable(resources, theme);
            return jVar;
        }
    }

    j() {
        this.f3716f = true;
        this.f3718h = new float[9];
        this.f3719i = new Matrix();
        this.f3720j = new Rect();
        this.f3712b = new h();
    }

    static int a(int i6, float f6) {
        return (i6 & 16777215) | (((int) (Color.alpha(i6) * f6)) << 24);
    }

    public static j b(Resources resources, int i6, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            j jVar = new j();
            jVar.f3710a = androidx.core.content.res.h.e(resources, i6, theme);
            jVar.f3717g = new i(jVar.f3710a.getConstantState());
            return jVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i6);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return c(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e6) {
            Log.e("VectorDrawableCompat", "parser error", e6);
            return null;
        }
    }

    public static j c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        j jVar = new j();
        jVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return jVar;
    }

    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i6;
        int i7;
        h hVar = this.f3712b;
        g gVar = hVar.f3768b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f3758h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z5 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f3734b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f3766p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f3767a = cVar.f3749d | hVar.f3767a;
                    z5 = false;
                } else {
                    if ("clip-path".equals(name)) {
                        b bVar = new b();
                        bVar.e(resources, attributeSet, theme, xmlPullParser);
                        dVar.f3734b.add(bVar);
                        if (bVar.getPathName() != null) {
                            gVar.f3766p.put(bVar.getPathName(), bVar);
                        }
                        i6 = hVar.f3767a;
                        i7 = bVar.f3749d;
                    } else if ("group".equals(name)) {
                        d dVar2 = new d();
                        dVar2.c(resources, attributeSet, theme, xmlPullParser);
                        dVar.f3734b.add(dVar2);
                        arrayDeque.push(dVar2);
                        if (dVar2.getGroupName() != null) {
                            gVar.f3766p.put(dVar2.getGroupName(), dVar2);
                        }
                        i6 = hVar.f3767a;
                        i7 = dVar2.f3743k;
                    }
                    hVar.f3767a = i7 | i6;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z5) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean f() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.f(this) == 1;
    }

    private static PorterDuff.Mode g(int i6, PorterDuff.Mode mode) {
        if (i6 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i6 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i6 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i6) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        h hVar = this.f3712b;
        g gVar = hVar.f3768b;
        hVar.f3770d = g(n.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c6 = n.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c6 != null) {
            hVar.f3769c = c6;
        }
        hVar.f3771e = n.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f3771e);
        gVar.f3761k = n.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f3761k);
        float f6 = n.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f3762l);
        gVar.f3762l = f6;
        if (gVar.f3761k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f6 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f3759i = typedArray.getDimension(3, gVar.f3759i);
        float dimension = typedArray.getDimension(2, gVar.f3760j);
        gVar.f3760j = dimension;
        if (gVar.f3759i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(n.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f3764n = string;
            gVar.f3766p.put(string, gVar);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f3710a;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.b(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object d(String str) {
        return this.f3712b.f3768b.f3766p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f3720j);
        if (this.f3720j.width() <= 0 || this.f3720j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f3714d;
        if (colorFilter == null) {
            colorFilter = this.f3713c;
        }
        canvas.getMatrix(this.f3719i);
        this.f3719i.getValues(this.f3718h);
        float abs = Math.abs(this.f3718h[0]);
        float abs2 = Math.abs(this.f3718h[4]);
        float abs3 = Math.abs(this.f3718h[1]);
        float abs4 = Math.abs(this.f3718h[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.f3720j.width() * abs));
        int min2 = Math.min(2048, (int) (this.f3720j.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.f3720j;
        canvas.translate(rect.left, rect.top);
        if (f()) {
            canvas.translate(this.f3720j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f3720j.offsetTo(0, 0);
        this.f3712b.c(min, min2);
        if (!this.f3716f) {
            this.f3712b.j(min, min2);
        } else if (!this.f3712b.b()) {
            this.f3712b.j(min, min2);
            this.f3712b.i();
        }
        this.f3712b.d(canvas, colorFilter, this.f3720j);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f3710a;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f3712b.f3768b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f3710a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3712b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f3710a;
        return drawable != null ? androidx.core.graphics.drawable.a.e(drawable) : this.f3714d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f3710a != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f3710a.getConstantState());
        }
        this.f3712b.f3767a = getChangingConfigurations();
        return this.f3712b;
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f3710a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f3712b.f3768b.f3760j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f3710a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f3712b.f3768b.f3759i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(boolean z5) {
        this.f3716f = z5;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f3710a;
        return drawable != null ? androidx.core.graphics.drawable.a.h(drawable) : this.f3712b.f3771e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f3710a;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f3712b) != null && (hVar.g() || ((colorStateList = this.f3712b.f3769c) != null && colorStateList.isStateful())));
    }

    PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3715e && super.mutate() == this) {
            this.f3712b = new h(this.f3712b);
            this.f3715e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z5;
        PorterDuff.Mode mode;
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f3712b;
        ColorStateList colorStateList = hVar.f3769c;
        if (colorStateList == null || (mode = hVar.f3770d) == null) {
            z5 = false;
        } else {
            this.f3713c = j(this.f3713c, colorStateList, mode);
            invalidateSelf();
            z5 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z5;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j6) {
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j6);
        } else {
            super.scheduleSelf(runnable, j6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i6) {
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            drawable.setAlpha(i6);
        } else if (this.f3712b.f3768b.getRootAlpha() != i6) {
            this.f3712b.f3768b.setRootAlpha(i6);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z5) {
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z5);
        } else {
            this.f3712b.f3771e = z5;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i6) {
        super.setChangingConfigurations(i6);
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i6, PorterDuff.Mode mode) {
        super.setColorFilter(i6, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z5) {
        super.setFilterBitmap(z5);
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f6, float f7) {
        super.setHotspot(f6, f7);
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i6, int i7, int i8, int i9) {
        super.setHotspotBounds(i6, i7, i8, i9);
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i6) {
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i6);
        } else {
            setTintList(ColorStateList.valueOf(i6));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f3712b;
        if (hVar.f3769c != colorStateList) {
            hVar.f3769c = colorStateList;
            this.f3713c = j(this.f3713c, colorStateList, hVar.f3770d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
            return;
        }
        h hVar = this.f3712b;
        if (hVar.f3770d != mode) {
            hVar.f3770d = mode;
            this.f3713c = j(this.f3713c, hVar.f3769c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z5, boolean z6) {
        Drawable drawable = this.f3710a;
        return drawable != null ? drawable.setVisible(z5, z6) : super.setVisible(z5, z6);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    j(h hVar) {
        this.f3716f = true;
        this.f3718h = new float[9];
        this.f3719i = new Matrix();
        this.f3720j = new Rect();
        this.f3712b = hVar;
        this.f3713c = j(this.f3713c, hVar.f3769c, hVar.f3770d);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f3712b;
        hVar.f3768b = new g();
        TypedArray k6 = n.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f3679a);
        i(k6, xmlPullParser, theme);
        k6.recycle();
        hVar.f3767a = getChangingConfigurations();
        hVar.f3777k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f3713c = j(this.f3713c, hVar.f3769c, hVar.f3770d);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3714d = colorFilter;
            invalidateSelf();
        }
    }
}
