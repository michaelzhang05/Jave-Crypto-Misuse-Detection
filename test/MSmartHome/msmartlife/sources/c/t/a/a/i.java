package c.t.a.a;

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
import androidx.recyclerview.widget.RecyclerView;
import c.h.e.c;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: VectorDrawableCompat.java */
/* loaded from: classes.dex */
public class i extends c.t.a.a.h {

    /* renamed from: g, reason: collision with root package name */
    static final PorterDuff.Mode f3067g = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    private h f3068h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuffColorFilter f3069i;

    /* renamed from: j, reason: collision with root package name */
    private ColorFilter f3070j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f3071k;
    private boolean l;
    private Drawable.ConstantState m;
    private final float[] n;
    private final Matrix o;
    private final Rect p;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class b extends f {
        b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f3089b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.a = c.h.e.c.d(string2);
            }
            this.f3090c = androidx.core.content.d.g.k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // c.t.a.a.i.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (androidx.core.content.d.g.r(xmlPullParser, "pathData")) {
                TypedArray s = androidx.core.content.d.g.s(resources, theme, attributeSet, c.t.a.a.a.f3047d);
                f(s, xmlPullParser);
                s.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
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
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class h extends Drawable.ConstantState {
        int a;

        /* renamed from: b, reason: collision with root package name */
        g f3102b;

        /* renamed from: c, reason: collision with root package name */
        ColorStateList f3103c;

        /* renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f3104d;

        /* renamed from: e, reason: collision with root package name */
        boolean f3105e;

        /* renamed from: f, reason: collision with root package name */
        Bitmap f3106f;

        /* renamed from: g, reason: collision with root package name */
        ColorStateList f3107g;

        /* renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f3108h;

        /* renamed from: i, reason: collision with root package name */
        int f3109i;

        /* renamed from: j, reason: collision with root package name */
        boolean f3110j;

        /* renamed from: k, reason: collision with root package name */
        boolean f3111k;
        Paint l;

        public h(h hVar) {
            this.f3103c = null;
            this.f3104d = i.f3067g;
            if (hVar != null) {
                this.a = hVar.a;
                g gVar = new g(hVar.f3102b);
                this.f3102b = gVar;
                if (hVar.f3102b.f3096f != null) {
                    gVar.f3096f = new Paint(hVar.f3102b.f3096f);
                }
                if (hVar.f3102b.f3095e != null) {
                    this.f3102b.f3095e = new Paint(hVar.f3102b.f3095e);
                }
                this.f3103c = hVar.f3103c;
                this.f3104d = hVar.f3104d;
                this.f3105e = hVar.f3105e;
            }
        }

        public boolean a(int i2, int i3) {
            return i2 == this.f3106f.getWidth() && i3 == this.f3106f.getHeight();
        }

        public boolean b() {
            return !this.f3111k && this.f3107g == this.f3103c && this.f3108h == this.f3104d && this.f3110j == this.f3105e && this.f3109i == this.f3102b.getRootAlpha();
        }

        public void c(int i2, int i3) {
            if (this.f3106f == null || !a(i2, i3)) {
                this.f3106f = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                this.f3111k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f3106f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.l == null) {
                Paint paint = new Paint();
                this.l = paint;
                paint.setFilterBitmap(true);
            }
            this.l.setAlpha(this.f3102b.getRootAlpha());
            this.l.setColorFilter(colorFilter);
            return this.l;
        }

        public boolean f() {
            return this.f3102b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f3102b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a;
        }

        public boolean h(int[] iArr) {
            boolean g2 = this.f3102b.g(iArr);
            this.f3111k |= g2;
            return g2;
        }

        public void i() {
            this.f3107g = this.f3103c;
            this.f3108h = this.f3104d;
            this.f3109i = this.f3102b.getRootAlpha();
            this.f3110j = this.f3105e;
            this.f3111k = false;
        }

        public void j(int i2, int i3) {
            this.f3106f.eraseColor(0);
            this.f3102b.b(new Canvas(this.f3106f), i2, i3, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new i(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new i(this);
        }

        public h() {
            this.f3103c = null;
            this.f3104d = i.f3067g;
            this.f3102b = new g();
        }
    }

    i() {
        this.l = true;
        this.n = new float[9];
        this.o = new Matrix();
        this.p = new Rect();
        this.f3068h = new h();
    }

    static int a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (Color.alpha(i2) * f2)) << 24);
    }

    public static i b(Resources resources, int i2, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            i iVar = new i();
            iVar.f3066f = androidx.core.content.d.f.d(resources, i2, theme);
            iVar.m = new C0087i(iVar.f3066f.getConstantState());
            return iVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i2);
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
        } catch (IOException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        } catch (XmlPullParserException e3) {
            Log.e("VectorDrawableCompat", "parser error", e3);
            return null;
        }
    }

    public static i c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        i iVar = new i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f3068h;
        g gVar = hVar.f3102b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f3099i);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f3079b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.q.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    hVar.a = cVar.f3091d | hVar.a;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f3079b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.q.put(bVar.getPathName(), bVar);
                    }
                    hVar.a = bVar.f3091d | hVar.a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f3079b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.q.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.a = dVar2.f3088k | hVar.a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean f() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && androidx.core.graphics.drawable.a.f(this) == 1;
    }

    private static PorterDuff.Mode g(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 != 9) {
            switch (i2) {
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
        return PorterDuff.Mode.SRC_ATOP;
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f3068h;
        g gVar = hVar.f3102b;
        hVar.f3104d = g(androidx.core.content.d.g.k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList g2 = androidx.core.content.d.g.g(typedArray, xmlPullParser, theme, "tint", 1);
        if (g2 != null) {
            hVar.f3103c = g2;
        }
        hVar.f3105e = androidx.core.content.d.g.e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f3105e);
        gVar.l = androidx.core.content.d.g.j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.l);
        float j2 = androidx.core.content.d.g.j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.m);
        gVar.m = j2;
        if (gVar.l <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (j2 > 0.0f) {
            gVar.f3100j = typedArray.getDimension(3, gVar.f3100j);
            float dimension = typedArray.getDimension(2, gVar.f3101k);
            gVar.f3101k = dimension;
            if (gVar.f3100j <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                gVar.setAlpha(androidx.core.content.d.g.j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.o = string;
                    gVar.q.put(string, gVar);
                    return;
                }
                return;
            }
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f3066f;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.b(drawable);
        return false;
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object d(String str) {
        return this.f3068h.f3102b.q.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f3066f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.p);
        if (this.p.width() <= 0 || this.p.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f3070j;
        if (colorFilter == null) {
            colorFilter = this.f3069i;
        }
        canvas.getMatrix(this.o);
        this.o.getValues(this.n);
        float abs = Math.abs(this.n[0]);
        float abs2 = Math.abs(this.n[4]);
        float abs3 = Math.abs(this.n[1]);
        float abs4 = Math.abs(this.n[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(RecyclerView.l.FLAG_MOVED, (int) (this.p.width() * abs));
        int min2 = Math.min(RecyclerView.l.FLAG_MOVED, (int) (this.p.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.p;
        canvas.translate(rect.left, rect.top);
        if (f()) {
            canvas.translate(this.p.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.p.offsetTo(0, 0);
        this.f3068h.c(min, min2);
        if (!this.l) {
            this.f3068h.j(min, min2);
        } else if (!this.f3068h.b()) {
            this.f3068h.j(min, min2);
            this.f3068h.i();
        }
        this.f3068h.d(canvas, colorFilter, this.p);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f3066f;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.d(drawable);
        }
        return this.f3068h.f3102b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f3066f;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f3068h.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f3066f;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.e(drawable);
        }
        return this.f3070j;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f3066f != null && Build.VERSION.SDK_INT >= 24) {
            return new C0087i(this.f3066f.getConstantState());
        }
        this.f3068h.a = getChangingConfigurations();
        return this.f3068h;
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f3066f;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f3068h.f3102b.f3101k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f3066f;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f3068h.f3102b.f3100j;
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f3066f;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(boolean z) {
        this.l = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f3066f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f3066f;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f3066f;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.h(drawable);
        }
        return this.f3068h.f3105e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f3066f;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((hVar = this.f3068h) != null && (hVar.g() || ((colorStateList = this.f3068h.f3103c) != null && colorStateList.isStateful())));
    }

    PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f3066f;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3071k && super.mutate() == this) {
            this.f3068h = new h(this.f3068h);
            this.f3071k = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3066f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f3066f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        h hVar = this.f3068h;
        ColorStateList colorStateList = hVar.f3103c;
        if (colorStateList != null && (mode = hVar.f3104d) != null) {
            this.f3069i = j(this.f3069i, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f3066f;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f3066f;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f3068h.f3102b.getRootAlpha() != i2) {
            this.f3068h.f3102b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f3066f;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z);
        } else {
            this.f3068h.f3105e = z;
        }
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i2) {
        super.setChangingConfigurations(i2);
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i2, PorterDuff.Mode mode) {
        super.setColorFilter(i2, mode);
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // c.t.a.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i2) {
        Drawable drawable = this.f3066f;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3066f;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f3068h;
        if (hVar.f3103c != colorStateList) {
            hVar.f3103c = colorStateList;
            this.f3069i = j(this.f3069i, colorStateList, hVar.f3104d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3066f;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
            return;
        }
        h hVar = this.f3068h;
        if (hVar.f3104d != mode) {
            hVar.f3104d = mode;
            this.f3069i = j(this.f3069i, hVar.f3103c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f3066f;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3066f;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: c.t.a.a.i$i, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0087i extends Drawable.ConstantState {
        private final Drawable.ConstantState a;

        public C0087i(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            i iVar = new i();
            iVar.f3066f = (VectorDrawable) this.a.newDrawable();
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            i iVar = new i();
            iVar.f3066f = (VectorDrawable) this.a.newDrawable(resources);
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            i iVar = new i();
            iVar.f3066f = (VectorDrawable) this.a.newDrawable(resources, theme);
            return iVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3066f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3070j = colorFilter;
            invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static abstract class f extends e {
        protected c.b[] a;

        /* renamed from: b, reason: collision with root package name */
        String f3089b;

        /* renamed from: c, reason: collision with root package name */
        int f3090c;

        /* renamed from: d, reason: collision with root package name */
        int f3091d;

        public f() {
            super();
            this.a = null;
            this.f3090c = 0;
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            c.b[] bVarArr = this.a;
            if (bVarArr != null) {
                c.b.e(bVarArr, path);
            }
        }

        public c.b[] getPathData() {
            return this.a;
        }

        public String getPathName() {
            return this.f3089b;
        }

        public void setPathData(c.b[] bVarArr) {
            if (!c.h.e.c.b(this.a, bVarArr)) {
                this.a = c.h.e.c.f(bVarArr);
            } else {
                c.h.e.c.j(this.a, bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.a = null;
            this.f3090c = 0;
            this.f3089b = fVar.f3089b;
            this.f3091d = fVar.f3091d;
            this.a = c.h.e.c.f(fVar.a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f3066f;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f3068h;
        hVar.f3102b = new g();
        TypedArray s = androidx.core.content.d.g.s(resources, theme, attributeSet, c.t.a.a.a.a);
        i(s, xmlPullParser, theme);
        s.recycle();
        hVar.a = getChangingConfigurations();
        hVar.f3111k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f3069i = j(this.f3069i, hVar.f3103c, hVar.f3104d);
    }

    i(h hVar) {
        this.l = true;
        this.n = new float[9];
        this.o = new Matrix();
        this.p = new Rect();
        this.f3068h = hVar;
        this.f3069i = j(this.f3069i, hVar.f3103c, hVar.f3104d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: e, reason: collision with root package name */
        private int[] f3072e;

        /* renamed from: f, reason: collision with root package name */
        androidx.core.content.d.b f3073f;

        /* renamed from: g, reason: collision with root package name */
        float f3074g;

        /* renamed from: h, reason: collision with root package name */
        androidx.core.content.d.b f3075h;

        /* renamed from: i, reason: collision with root package name */
        float f3076i;

        /* renamed from: j, reason: collision with root package name */
        float f3077j;

        /* renamed from: k, reason: collision with root package name */
        float f3078k;
        float l;
        float m;
        Paint.Cap n;
        Paint.Join o;
        float p;

        c() {
            this.f3074g = 0.0f;
            this.f3076i = 1.0f;
            this.f3077j = 1.0f;
            this.f3078k = 0.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
        }

        private Paint.Cap e(int i2, Paint.Cap cap) {
            if (i2 == 0) {
                return Paint.Cap.BUTT;
            }
            if (i2 != 1) {
                return i2 != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        private Paint.Join f(int i2, Paint.Join join) {
            if (i2 == 0) {
                return Paint.Join.MITER;
            }
            if (i2 != 1) {
                return i2 != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f3072e = null;
            if (androidx.core.content.d.g.r(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f3089b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.a = c.h.e.c.d(string2);
                }
                this.f3075h = androidx.core.content.d.g.i(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f3077j = androidx.core.content.d.g.j(typedArray, xmlPullParser, "fillAlpha", 12, this.f3077j);
                this.n = e(androidx.core.content.d.g.k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.n);
                this.o = f(androidx.core.content.d.g.k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.o);
                this.p = androidx.core.content.d.g.j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.p);
                this.f3073f = androidx.core.content.d.g.i(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f3076i = androidx.core.content.d.g.j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f3076i);
                this.f3074g = androidx.core.content.d.g.j(typedArray, xmlPullParser, "strokeWidth", 4, this.f3074g);
                this.l = androidx.core.content.d.g.j(typedArray, xmlPullParser, "trimPathEnd", 6, this.l);
                this.m = androidx.core.content.d.g.j(typedArray, xmlPullParser, "trimPathOffset", 7, this.m);
                this.f3078k = androidx.core.content.d.g.j(typedArray, xmlPullParser, "trimPathStart", 5, this.f3078k);
                this.f3090c = androidx.core.content.d.g.k(typedArray, xmlPullParser, "fillType", 13, this.f3090c);
            }
        }

        @Override // c.t.a.a.i.e
        public boolean a() {
            return this.f3075h.i() || this.f3073f.i();
        }

        @Override // c.t.a.a.i.e
        public boolean b(int[] iArr) {
            return this.f3073f.j(iArr) | this.f3075h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s = androidx.core.content.d.g.s(resources, theme, attributeSet, c.t.a.a.a.f3046c);
            h(s, xmlPullParser, theme);
            s.recycle();
        }

        float getFillAlpha() {
            return this.f3077j;
        }

        int getFillColor() {
            return this.f3075h.e();
        }

        float getStrokeAlpha() {
            return this.f3076i;
        }

        int getStrokeColor() {
            return this.f3073f.e();
        }

        float getStrokeWidth() {
            return this.f3074g;
        }

        float getTrimPathEnd() {
            return this.l;
        }

        float getTrimPathOffset() {
            return this.m;
        }

        float getTrimPathStart() {
            return this.f3078k;
        }

        void setFillAlpha(float f2) {
            this.f3077j = f2;
        }

        void setFillColor(int i2) {
            this.f3075h.k(i2);
        }

        void setStrokeAlpha(float f2) {
            this.f3076i = f2;
        }

        void setStrokeColor(int i2) {
            this.f3073f.k(i2);
        }

        void setStrokeWidth(float f2) {
            this.f3074g = f2;
        }

        void setTrimPathEnd(float f2) {
            this.l = f2;
        }

        void setTrimPathOffset(float f2) {
            this.m = f2;
        }

        void setTrimPathStart(float f2) {
            this.f3078k = f2;
        }

        c(c cVar) {
            super(cVar);
            this.f3074g = 0.0f;
            this.f3076i = 1.0f;
            this.f3077j = 1.0f;
            this.f3078k = 0.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
            this.f3072e = cVar.f3072e;
            this.f3073f = cVar.f3073f;
            this.f3074g = cVar.f3074g;
            this.f3076i = cVar.f3076i;
            this.f3075h = cVar.f3075h;
            this.f3090c = cVar.f3090c;
            this.f3077j = cVar.f3077j;
            this.f3078k = cVar.f3078k;
            this.l = cVar.l;
            this.m = cVar.m;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class g {
        private static final Matrix a = new Matrix();

        /* renamed from: b, reason: collision with root package name */
        private final Path f3092b;

        /* renamed from: c, reason: collision with root package name */
        private final Path f3093c;

        /* renamed from: d, reason: collision with root package name */
        private final Matrix f3094d;

        /* renamed from: e, reason: collision with root package name */
        Paint f3095e;

        /* renamed from: f, reason: collision with root package name */
        Paint f3096f;

        /* renamed from: g, reason: collision with root package name */
        private PathMeasure f3097g;

        /* renamed from: h, reason: collision with root package name */
        private int f3098h;

        /* renamed from: i, reason: collision with root package name */
        final d f3099i;

        /* renamed from: j, reason: collision with root package name */
        float f3100j;

        /* renamed from: k, reason: collision with root package name */
        float f3101k;
        float l;
        float m;
        int n;
        String o;
        Boolean p;
        final c.e.a<String, Object> q;

        public g() {
            this.f3094d = new Matrix();
            this.f3100j = 0.0f;
            this.f3101k = 0.0f;
            this.l = 0.0f;
            this.m = 0.0f;
            this.n = 255;
            this.o = null;
            this.p = null;
            this.q = new c.e.a<>();
            this.f3099i = new d();
            this.f3092b = new Path();
            this.f3093c = new Path();
        }

        private static float a(float f2, float f3, float f4, float f5) {
            return (f2 * f5) - (f3 * f4);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            dVar.a.set(matrix);
            dVar.a.preConcat(dVar.f3087j);
            canvas.save();
            for (int i4 = 0; i4 < dVar.f3079b.size(); i4++) {
                e eVar = dVar.f3079b.get(i4);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.a, canvas, i2, i3, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i2, i3, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            float f2 = i2 / this.l;
            float f3 = i3 / this.m;
            float min = Math.min(f2, f3);
            Matrix matrix = dVar.a;
            this.f3094d.set(matrix);
            this.f3094d.postScale(f2, f3);
            float e2 = e(matrix);
            if (e2 == 0.0f) {
                return;
            }
            fVar.d(this.f3092b);
            Path path = this.f3092b;
            this.f3093c.reset();
            if (fVar.c()) {
                this.f3093c.setFillType(fVar.f3090c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f3093c.addPath(path, this.f3094d);
                canvas.clipPath(this.f3093c);
                return;
            }
            c cVar = (c) fVar;
            float f4 = cVar.f3078k;
            if (f4 != 0.0f || cVar.l != 1.0f) {
                float f5 = cVar.m;
                float f6 = (f4 + f5) % 1.0f;
                float f7 = (cVar.l + f5) % 1.0f;
                if (this.f3097g == null) {
                    this.f3097g = new PathMeasure();
                }
                this.f3097g.setPath(this.f3092b, false);
                float length = this.f3097g.getLength();
                float f8 = f6 * length;
                float f9 = f7 * length;
                path.reset();
                if (f8 > f9) {
                    this.f3097g.getSegment(f8, length, path, true);
                    this.f3097g.getSegment(0.0f, f9, path, true);
                } else {
                    this.f3097g.getSegment(f8, f9, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f3093c.addPath(path, this.f3094d);
            if (cVar.f3075h.l()) {
                androidx.core.content.d.b bVar = cVar.f3075h;
                if (this.f3096f == null) {
                    Paint paint = new Paint(1);
                    this.f3096f = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f3096f;
                if (bVar.h()) {
                    Shader f10 = bVar.f();
                    f10.setLocalMatrix(this.f3094d);
                    paint2.setShader(f10);
                    paint2.setAlpha(Math.round(cVar.f3077j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(i.a(bVar.e(), cVar.f3077j));
                }
                paint2.setColorFilter(colorFilter);
                this.f3093c.setFillType(cVar.f3090c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f3093c, paint2);
            }
            if (cVar.f3073f.l()) {
                androidx.core.content.d.b bVar2 = cVar.f3073f;
                if (this.f3095e == null) {
                    Paint paint3 = new Paint(1);
                    this.f3095e = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f3095e;
                Paint.Join join = cVar.o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.p);
                if (bVar2.h()) {
                    Shader f11 = bVar2.f();
                    f11.setLocalMatrix(this.f3094d);
                    paint4.setShader(f11);
                    paint4.setAlpha(Math.round(cVar.f3076i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(i.a(bVar2.e(), cVar.f3076i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f3074g * min * e2);
                canvas.drawPath(this.f3093c, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot(fArr[0], fArr[1]);
            float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float a2 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(a2) / max;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            c(this.f3099i, a, canvas, i2, i3, colorFilter);
        }

        public boolean f() {
            if (this.p == null) {
                this.p = Boolean.valueOf(this.f3099i.a());
            }
            return this.p.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f3099i.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.n;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.n = i2;
        }

        public g(g gVar) {
            this.f3094d = new Matrix();
            this.f3100j = 0.0f;
            this.f3101k = 0.0f;
            this.l = 0.0f;
            this.m = 0.0f;
            this.n = 255;
            this.o = null;
            this.p = null;
            c.e.a<String, Object> aVar = new c.e.a<>();
            this.q = aVar;
            this.f3099i = new d(gVar.f3099i, aVar);
            this.f3092b = new Path(gVar.f3092b);
            this.f3093c = new Path(gVar.f3093c);
            this.f3100j = gVar.f3100j;
            this.f3101k = gVar.f3101k;
            this.l = gVar.l;
            this.m = gVar.m;
            this.f3098h = gVar.f3098h;
            this.n = gVar.n;
            this.o = gVar.o;
            String str = gVar.o;
            if (str != null) {
                aVar.put(str, this);
            }
            this.p = gVar.p;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class d extends e {
        final Matrix a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<e> f3079b;

        /* renamed from: c, reason: collision with root package name */
        float f3080c;

        /* renamed from: d, reason: collision with root package name */
        private float f3081d;

        /* renamed from: e, reason: collision with root package name */
        private float f3082e;

        /* renamed from: f, reason: collision with root package name */
        private float f3083f;

        /* renamed from: g, reason: collision with root package name */
        private float f3084g;

        /* renamed from: h, reason: collision with root package name */
        private float f3085h;

        /* renamed from: i, reason: collision with root package name */
        private float f3086i;

        /* renamed from: j, reason: collision with root package name */
        final Matrix f3087j;

        /* renamed from: k, reason: collision with root package name */
        int f3088k;
        private int[] l;
        private String m;

        public d(d dVar, c.e.a<String, Object> aVar) {
            super();
            f bVar;
            this.a = new Matrix();
            this.f3079b = new ArrayList<>();
            this.f3080c = 0.0f;
            this.f3081d = 0.0f;
            this.f3082e = 0.0f;
            this.f3083f = 1.0f;
            this.f3084g = 1.0f;
            this.f3085h = 0.0f;
            this.f3086i = 0.0f;
            Matrix matrix = new Matrix();
            this.f3087j = matrix;
            this.m = null;
            this.f3080c = dVar.f3080c;
            this.f3081d = dVar.f3081d;
            this.f3082e = dVar.f3082e;
            this.f3083f = dVar.f3083f;
            this.f3084g = dVar.f3084g;
            this.f3085h = dVar.f3085h;
            this.f3086i = dVar.f3086i;
            this.l = dVar.l;
            String str = dVar.m;
            this.m = str;
            this.f3088k = dVar.f3088k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f3087j);
            ArrayList<e> arrayList = dVar.f3079b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                e eVar = arrayList.get(i2);
                if (eVar instanceof d) {
                    this.f3079b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        bVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f3079b.add(bVar);
                    String str2 = bVar.f3089b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f3087j.reset();
            this.f3087j.postTranslate(-this.f3081d, -this.f3082e);
            this.f3087j.postScale(this.f3083f, this.f3084g);
            this.f3087j.postRotate(this.f3080c, 0.0f, 0.0f);
            this.f3087j.postTranslate(this.f3085h + this.f3081d, this.f3086i + this.f3082e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.l = null;
            this.f3080c = androidx.core.content.d.g.j(typedArray, xmlPullParser, "rotation", 5, this.f3080c);
            this.f3081d = typedArray.getFloat(1, this.f3081d);
            this.f3082e = typedArray.getFloat(2, this.f3082e);
            this.f3083f = androidx.core.content.d.g.j(typedArray, xmlPullParser, "scaleX", 3, this.f3083f);
            this.f3084g = androidx.core.content.d.g.j(typedArray, xmlPullParser, "scaleY", 4, this.f3084g);
            this.f3085h = androidx.core.content.d.g.j(typedArray, xmlPullParser, "translateX", 6, this.f3085h);
            this.f3086i = androidx.core.content.d.g.j(typedArray, xmlPullParser, "translateY", 7, this.f3086i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.m = string;
            }
            d();
        }

        @Override // c.t.a.a.i.e
        public boolean a() {
            for (int i2 = 0; i2 < this.f3079b.size(); i2++) {
                if (this.f3079b.get(i2).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // c.t.a.a.i.e
        public boolean b(int[] iArr) {
            boolean z = false;
            for (int i2 = 0; i2 < this.f3079b.size(); i2++) {
                z |= this.f3079b.get(i2).b(iArr);
            }
            return z;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s = androidx.core.content.d.g.s(resources, theme, attributeSet, c.t.a.a.a.f3045b);
            e(s, xmlPullParser);
            s.recycle();
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.f3087j;
        }

        public float getPivotX() {
            return this.f3081d;
        }

        public float getPivotY() {
            return this.f3082e;
        }

        public float getRotation() {
            return this.f3080c;
        }

        public float getScaleX() {
            return this.f3083f;
        }

        public float getScaleY() {
            return this.f3084g;
        }

        public float getTranslateX() {
            return this.f3085h;
        }

        public float getTranslateY() {
            return this.f3086i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.f3081d) {
                this.f3081d = f2;
                d();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.f3082e) {
                this.f3082e = f2;
                d();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.f3080c) {
                this.f3080c = f2;
                d();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f3083f) {
                this.f3083f = f2;
                d();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.f3084g) {
                this.f3084g = f2;
                d();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.f3085h) {
                this.f3085h = f2;
                d();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.f3086i) {
                this.f3086i = f2;
                d();
            }
        }

        public d() {
            super();
            this.a = new Matrix();
            this.f3079b = new ArrayList<>();
            this.f3080c = 0.0f;
            this.f3081d = 0.0f;
            this.f3082e = 0.0f;
            this.f3083f = 1.0f;
            this.f3084g = 1.0f;
            this.f3085h = 0.0f;
            this.f3086i = 0.0f;
            this.f3087j = new Matrix();
            this.m = null;
        }
    }
}
