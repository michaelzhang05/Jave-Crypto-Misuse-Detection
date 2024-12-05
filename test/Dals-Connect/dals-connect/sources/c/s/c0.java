package c.s;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewUtils.java */
/* loaded from: classes.dex */
public class c0 {
    private static final i0 a;

    /* renamed from: b, reason: collision with root package name */
    static final Property<View, Float> f2967b;

    /* renamed from: c, reason: collision with root package name */
    static final Property<View, Rect> f2968c;

    /* compiled from: ViewUtils.java */
    /* loaded from: classes.dex */
    static class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(c0.c(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f2) {
            c0.g(view, f2.floatValue());
        }
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: classes.dex */
    static class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return androidx.core.view.u.r(view);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            androidx.core.view.u.p0(view, rect);
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            a = new h0();
        } else if (i2 >= 23) {
            a = new g0();
        } else if (i2 >= 22) {
            a = new f0();
        } else if (i2 >= 21) {
            a = new e0();
        } else if (i2 >= 19) {
            a = new d0();
        } else {
            a = new i0();
        }
        f2967b = new a(Float.class, "translationAlpha");
        f2968c = new b(Rect.class, "clipBounds");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view) {
        a.a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b0 b(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new a0(view);
        }
        return z.e(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float c(View view) {
        return a.c(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m0 d(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new l0(view);
        }
        return new k0(view.getWindowToken());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(View view) {
        a.d(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(View view, int i2, int i3, int i4, int i5) {
        a.e(view, i2, i3, i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(View view, float f2) {
        a.f(view, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(View view, int i2) {
        a.g(view, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(View view, Matrix matrix) {
        a.h(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(View view, Matrix matrix) {
        a.i(view, matrix);
    }
}
