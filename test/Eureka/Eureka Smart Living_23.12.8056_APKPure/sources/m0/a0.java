package m0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.b1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    private static final m0 f7416a;

    /* renamed from: b, reason: collision with root package name */
    static final Property f7417b;

    /* renamed from: c, reason: collision with root package name */
    static final Property f7418c;

    /* loaded from: classes.dex */
    static class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(a0.c(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f6) {
            a0.g(view, f6.floatValue());
        }
    }

    /* loaded from: classes.dex */
    static class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return b1.w(view);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            b1.x0(view, rect);
        }
    }

    static {
        int i6 = Build.VERSION.SDK_INT;
        f7416a = i6 >= 29 ? new l0() : i6 >= 23 ? new k0() : new i0();
        f7417b = new a(Float.class, "translationAlpha");
        f7418c = new b(Rect.class, "clipBounds");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view) {
        f7416a.a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z b(View view) {
        return new y(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float c(View view) {
        return f7416a.b(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p0 d(View view) {
        return new o0(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(View view) {
        f7416a.c(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(View view, int i6, int i7, int i8, int i9) {
        f7416a.d(view, i6, i7, i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(View view, float f6) {
        f7416a.e(view, f6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(View view, int i6) {
        f7416a.f(view, i6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(View view, Matrix matrix) {
        f7416a.g(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(View view, Matrix matrix) {
        f7416a.h(view, matrix);
    }
}
