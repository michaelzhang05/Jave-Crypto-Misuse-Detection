package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.s2;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    private static final PorterDuff.Mode f1111b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    private static k f1112c;

    /* renamed from: a, reason: collision with root package name */
    private s2 f1113a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements s2.f {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f1114a = {d.e.R, d.e.P, d.e.f6162a};

        /* renamed from: b, reason: collision with root package name */
        private final int[] f1115b = {d.e.f6176o, d.e.B, d.e.f6181t, d.e.f6177p, d.e.f6178q, d.e.f6180s, d.e.f6179r};

        /* renamed from: c, reason: collision with root package name */
        private final int[] f1116c = {d.e.O, d.e.Q, d.e.f6172k, d.e.K, d.e.L, d.e.M, d.e.N};

        /* renamed from: d, reason: collision with root package name */
        private final int[] f1117d = {d.e.f6184w, d.e.f6170i, d.e.f6183v};

        /* renamed from: e, reason: collision with root package name */
        private final int[] f1118e = {d.e.J, d.e.S};

        /* renamed from: f, reason: collision with root package name */
        private final int[] f1119f = {d.e.f6164c, d.e.f6168g, d.e.f6165d, d.e.f6169h};

        a() {
        }

        private boolean f(int[] iArr, int i6) {
            for (int i7 : iArr) {
                if (i7 == i6) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i6) {
            int c6 = y2.c(context, d.a.f6133t);
            return new ColorStateList(new int[][]{y2.f1278b, y2.f1281e, y2.f1279c, y2.f1285i}, new int[]{y2.b(context, d.a.f6131r), androidx.core.graphics.a.f(c6, i6), androidx.core.graphics.a.f(c6, i6), i6});
        }

        private ColorStateList i(Context context) {
            return h(context, y2.c(context, d.a.f6130q));
        }

        private ColorStateList j(Context context) {
            return h(context, y2.c(context, d.a.f6131r));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList e6 = y2.e(context, d.a.f6135v);
            if (e6 == null || !e6.isStateful()) {
                iArr[0] = y2.f1278b;
                iArr2[0] = y2.b(context, d.a.f6135v);
                iArr[1] = y2.f1282f;
                iArr2[1] = y2.c(context, d.a.f6132s);
                iArr[2] = y2.f1285i;
                iArr2[2] = y2.c(context, d.a.f6135v);
            } else {
                int[] iArr3 = y2.f1278b;
                iArr[0] = iArr3;
                iArr2[0] = e6.getColorForState(iArr3, 0);
                iArr[1] = y2.f1282f;
                iArr2[1] = y2.c(context, d.a.f6132s);
                iArr[2] = y2.f1285i;
                iArr2[2] = e6.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(s2 s2Var, Context context, int i6) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i6);
            Drawable j6 = s2Var.j(context, d.e.F);
            Drawable j7 = s2Var.j(context, d.e.G);
            if ((j6 instanceof BitmapDrawable) && j6.getIntrinsicWidth() == dimensionPixelSize && j6.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) j6;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j6.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j6.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((j7 instanceof BitmapDrawable) && j7.getIntrinsicWidth() == dimensionPixelSize && j7.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j7;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j7.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j7.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i6, PorterDuff.Mode mode) {
            if (c2.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = k.f1111b;
            }
            drawable.setColorFilter(k.e(i6, mode));
        }

        @Override // androidx.appcompat.widget.s2.f
        public Drawable a(s2 s2Var, Context context, int i6) {
            int i7;
            if (i6 == d.e.f6171j) {
                return new LayerDrawable(new Drawable[]{s2Var.j(context, d.e.f6170i), s2Var.j(context, d.e.f6172k)});
            }
            if (i6 == d.e.f6186y) {
                i7 = d.d.f6155g;
            } else if (i6 == d.e.f6185x) {
                i7 = d.d.f6156h;
            } else {
                if (i6 != d.e.f6187z) {
                    return null;
                }
                i7 = d.d.f6157i;
            }
            return l(s2Var, context, i7);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x006d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0052  */
        @Override // androidx.appcompat.widget.s2.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean b(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.k.a()
                int[] r1 = r6.f1114a
                boolean r1 = r6.f(r1, r8)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r8 = d.a.f6134u
            L11:
                r1 = r0
            L12:
                r0 = -1
                r5 = 1
                goto L50
            L15:
                int[] r1 = r6.f1116c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L20
                int r8 = d.a.f6132s
                goto L11
            L20:
                int[] r1 = r6.f1117d
                boolean r1 = r6.f(r1, r8)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r8 = 16842801(0x1010031, float:2.3693695E-38)
                goto L12
            L32:
                int r1 = d.e.f6182u
                if (r8 != r1) goto L47
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r1 = r0
                r5 = 1
                r0 = r8
                r8 = 16842800(0x1010030, float:2.3693693E-38)
                goto L50
            L47:
                int r1 = d.e.f6173l
                if (r8 != r1) goto L4c
                goto L2d
            L4c:
                r1 = r0
                r8 = 0
                r0 = -1
                r5 = 0
            L50:
                if (r5 == 0) goto L6d
                boolean r3 = androidx.appcompat.widget.c2.a(r9)
                if (r3 == 0) goto L5c
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L5c:
                int r7 = androidx.appcompat.widget.y2.c(r7, r8)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.k.e(r7, r1)
                r9.setColorFilter(r7)
                if (r0 == r4) goto L6c
                r9.setAlpha(r0)
            L6c:
                return r2
            L6d:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.k.a.b(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.s2.f
        public ColorStateList c(Context context, int i6) {
            if (i6 == d.e.f6174m) {
                return e.a.a(context, d.c.f6145e);
            }
            if (i6 == d.e.I) {
                return e.a.a(context, d.c.f6148h);
            }
            if (i6 == d.e.H) {
                return k(context);
            }
            if (i6 == d.e.f6167f) {
                return j(context);
            }
            if (i6 == d.e.f6163b) {
                return g(context);
            }
            if (i6 == d.e.f6166e) {
                return i(context);
            }
            if (i6 == d.e.D || i6 == d.e.E) {
                return e.a.a(context, d.c.f6147g);
            }
            if (f(this.f1115b, i6)) {
                return y2.e(context, d.a.f6134u);
            }
            if (f(this.f1118e, i6)) {
                return e.a.a(context, d.c.f6144d);
            }
            if (f(this.f1119f, i6)) {
                return e.a.a(context, d.c.f6143c);
            }
            if (i6 == d.e.A) {
                return e.a.a(context, d.c.f6146f);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.s2.f
        public boolean d(Context context, int i6, Drawable drawable) {
            LayerDrawable layerDrawable;
            Drawable findDrawableByLayerId;
            int i7;
            if (i6 == d.e.C) {
                layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(R.id.background), y2.c(context, d.a.f6134u), k.f1111b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.secondaryProgress);
                i7 = d.a.f6134u;
            } else {
                if (i6 != d.e.f6186y && i6 != d.e.f6185x && i6 != d.e.f6187z) {
                    return false;
                }
                layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(R.id.background), y2.b(context, d.a.f6134u), k.f1111b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.secondaryProgress);
                i7 = d.a.f6132s;
            }
            m(findDrawableByLayerId, y2.c(context, i7), k.f1111b);
            m(layerDrawable.findDrawableByLayerId(R.id.progress), y2.c(context, d.a.f6132s), k.f1111b);
            return true;
        }

        @Override // androidx.appcompat.widget.s2.f
        public PorterDuff.Mode e(int i6) {
            if (i6 == d.e.H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }
    }

    public static synchronized k b() {
        k kVar;
        synchronized (k.class) {
            if (f1112c == null) {
                h();
            }
            kVar = f1112c;
        }
        return kVar;
    }

    public static synchronized PorterDuffColorFilter e(int i6, PorterDuff.Mode mode) {
        PorterDuffColorFilter l6;
        synchronized (k.class) {
            l6 = s2.l(i6, mode);
        }
        return l6;
    }

    public static synchronized void h() {
        synchronized (k.class) {
            if (f1112c == null) {
                k kVar = new k();
                f1112c = kVar;
                kVar.f1113a = s2.h();
                f1112c.f1113a.u(new a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(Drawable drawable, a3 a3Var, int[] iArr) {
        s2.w(drawable, a3Var, iArr);
    }

    public synchronized Drawable c(Context context, int i6) {
        return this.f1113a.j(context, i6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable d(Context context, int i6, boolean z5) {
        return this.f1113a.k(context, i6, z5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized ColorStateList f(Context context, int i6) {
        return this.f1113a.m(context, i6);
    }

    public synchronized void g(Context context) {
        this.f1113a.s(context);
    }
}
