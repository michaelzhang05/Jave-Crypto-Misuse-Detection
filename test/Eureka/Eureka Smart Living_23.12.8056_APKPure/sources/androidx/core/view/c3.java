package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public class c3 {

    /* renamed from: b, reason: collision with root package name */
    public static final c3 f2337b;

    /* renamed from: a, reason: collision with root package name */
    private final l f2338a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static Field f2339a;

        /* renamed from: b, reason: collision with root package name */
        private static Field f2340b;

        /* renamed from: c, reason: collision with root package name */
        private static Field f2341c;

        /* renamed from: d, reason: collision with root package name */
        private static boolean f2342d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f2339a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f2340b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f2341c = declaredField3;
                declaredField3.setAccessible(true);
                f2342d = true;
            } catch (ReflectiveOperationException e6) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e6.getMessage(), e6);
            }
        }

        public static c3 a(View view) {
            if (f2342d && view.isAttachedToWindow()) {
                try {
                    Object obj = f2339a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f2340b.get(obj);
                        Rect rect2 = (Rect) f2341c.get(obj);
                        if (rect != null && rect2 != null) {
                            c3 a6 = new b().b(androidx.core.graphics.g.c(rect)).c(androidx.core.graphics.g.c(rect2)).a();
                            a6.s(a6);
                            a6.d(view.getRootView());
                            return a6;
                        }
                    }
                } catch (IllegalAccessException e6) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e6.getMessage(), e6);
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final f f2343a;

        public b() {
            int i6 = Build.VERSION.SDK_INT;
            this.f2343a = i6 >= 30 ? new e() : i6 >= 29 ? new d() : new c();
        }

        public c3 a() {
            return this.f2343a.b();
        }

        public b b(androidx.core.graphics.g gVar) {
            this.f2343a.d(gVar);
            return this;
        }

        public b c(androidx.core.graphics.g gVar) {
            this.f2343a.f(gVar);
            return this;
        }

        public b(c3 c3Var) {
            int i6 = Build.VERSION.SDK_INT;
            this.f2343a = i6 >= 30 ? new e(c3Var) : i6 >= 29 ? new d(c3Var) : new c(c3Var);
        }
    }

    /* loaded from: classes.dex */
    private static class c extends f {

        /* renamed from: e, reason: collision with root package name */
        private static Field f2344e = null;

        /* renamed from: f, reason: collision with root package name */
        private static boolean f2345f = false;

        /* renamed from: g, reason: collision with root package name */
        private static Constructor f2346g = null;

        /* renamed from: h, reason: collision with root package name */
        private static boolean f2347h = false;

        /* renamed from: c, reason: collision with root package name */
        private WindowInsets f2348c;

        /* renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.g f2349d;

        c() {
            this.f2348c = h();
        }

        private static WindowInsets h() {
            if (!f2345f) {
                try {
                    f2344e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e6) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e6);
                }
                f2345f = true;
            }
            Field field = f2344e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e7) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e7);
                }
            }
            if (!f2347h) {
                try {
                    f2346g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e8) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e8);
                }
                f2347h = true;
            }
            Constructor constructor = f2346g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e9) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e9);
                }
            }
            return null;
        }

        @Override // androidx.core.view.c3.f
        c3 b() {
            a();
            c3 v5 = c3.v(this.f2348c);
            v5.q(this.f2352b);
            v5.t(this.f2349d);
            return v5;
        }

        @Override // androidx.core.view.c3.f
        void d(androidx.core.graphics.g gVar) {
            this.f2349d = gVar;
        }

        @Override // androidx.core.view.c3.f
        void f(androidx.core.graphics.g gVar) {
            WindowInsets windowInsets = this.f2348c;
            if (windowInsets != null) {
                this.f2348c = windowInsets.replaceSystemWindowInsets(gVar.f2110a, gVar.f2111b, gVar.f2112c, gVar.f2113d);
            }
        }

        c(c3 c3Var) {
            super(c3Var);
            this.f2348c = c3Var.u();
        }
    }

    /* loaded from: classes.dex */
    private static class d extends f {

        /* renamed from: c, reason: collision with root package name */
        final WindowInsets.Builder f2350c;

        d() {
            l3.a();
            this.f2350c = j3.a();
        }

        @Override // androidx.core.view.c3.f
        c3 b() {
            WindowInsets build;
            a();
            build = this.f2350c.build();
            c3 v5 = c3.v(build);
            v5.q(this.f2352b);
            return v5;
        }

        @Override // androidx.core.view.c3.f
        void c(androidx.core.graphics.g gVar) {
            this.f2350c.setMandatorySystemGestureInsets(gVar.e());
        }

        @Override // androidx.core.view.c3.f
        void d(androidx.core.graphics.g gVar) {
            this.f2350c.setStableInsets(gVar.e());
        }

        @Override // androidx.core.view.c3.f
        void e(androidx.core.graphics.g gVar) {
            this.f2350c.setSystemGestureInsets(gVar.e());
        }

        @Override // androidx.core.view.c3.f
        void f(androidx.core.graphics.g gVar) {
            this.f2350c.setSystemWindowInsets(gVar.e());
        }

        @Override // androidx.core.view.c3.f
        void g(androidx.core.graphics.g gVar) {
            this.f2350c.setTappableElementInsets(gVar.e());
        }

        d(c3 c3Var) {
            super(c3Var);
            WindowInsets.Builder a6;
            WindowInsets u5 = c3Var.u();
            if (u5 != null) {
                l3.a();
                a6 = k3.a(u5);
            } else {
                l3.a();
                a6 = j3.a();
            }
            this.f2350c = a6;
        }
    }

    /* loaded from: classes.dex */
    private static class e extends d {
        e() {
        }

        e(c3 c3Var) {
            super(c3Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        private final c3 f2351a;

        /* renamed from: b, reason: collision with root package name */
        androidx.core.graphics.g[] f2352b;

        f() {
            this(new c3((c3) null));
        }

        protected final void a() {
            androidx.core.graphics.g[] gVarArr = this.f2352b;
            if (gVarArr != null) {
                androidx.core.graphics.g gVar = gVarArr[m.a(1)];
                androidx.core.graphics.g gVar2 = this.f2352b[m.a(2)];
                if (gVar2 == null) {
                    gVar2 = this.f2351a.f(2);
                }
                if (gVar == null) {
                    gVar = this.f2351a.f(1);
                }
                f(androidx.core.graphics.g.a(gVar, gVar2));
                androidx.core.graphics.g gVar3 = this.f2352b[m.a(16)];
                if (gVar3 != null) {
                    e(gVar3);
                }
                androidx.core.graphics.g gVar4 = this.f2352b[m.a(32)];
                if (gVar4 != null) {
                    c(gVar4);
                }
                androidx.core.graphics.g gVar5 = this.f2352b[m.a(64)];
                if (gVar5 != null) {
                    g(gVar5);
                }
            }
        }

        abstract c3 b();

        void c(androidx.core.graphics.g gVar) {
        }

        abstract void d(androidx.core.graphics.g gVar);

        void e(androidx.core.graphics.g gVar) {
        }

        abstract void f(androidx.core.graphics.g gVar);

        void g(androidx.core.graphics.g gVar) {
        }

        f(c3 c3Var) {
            this.f2351a = c3Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g extends l {

        /* renamed from: h, reason: collision with root package name */
        private static boolean f2353h = false;

        /* renamed from: i, reason: collision with root package name */
        private static Method f2354i;

        /* renamed from: j, reason: collision with root package name */
        private static Class f2355j;

        /* renamed from: k, reason: collision with root package name */
        private static Field f2356k;

        /* renamed from: l, reason: collision with root package name */
        private static Field f2357l;

        /* renamed from: c, reason: collision with root package name */
        final WindowInsets f2358c;

        /* renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.g[] f2359d;

        /* renamed from: e, reason: collision with root package name */
        private androidx.core.graphics.g f2360e;

        /* renamed from: f, reason: collision with root package name */
        private c3 f2361f;

        /* renamed from: g, reason: collision with root package name */
        androidx.core.graphics.g f2362g;

        g(c3 c3Var, WindowInsets windowInsets) {
            super(c3Var);
            this.f2360e = null;
            this.f2358c = windowInsets;
        }

        private androidx.core.graphics.g u(int i6, boolean z5) {
            androidx.core.graphics.g gVar = androidx.core.graphics.g.f2109e;
            for (int i7 = 1; i7 <= 256; i7 <<= 1) {
                if ((i6 & i7) != 0) {
                    gVar = androidx.core.graphics.g.a(gVar, v(i7, z5));
                }
            }
            return gVar;
        }

        private androidx.core.graphics.g w() {
            c3 c3Var = this.f2361f;
            return c3Var != null ? c3Var.g() : androidx.core.graphics.g.f2109e;
        }

        private androidx.core.graphics.g x(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f2353h) {
                z();
            }
            Method method = f2354i;
            if (method != null && f2355j != null && f2356k != null) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f2356k.get(f2357l.get(invoke));
                    if (rect != null) {
                        return androidx.core.graphics.g.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e6) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
                }
            }
            return null;
        }

        private static void z() {
            try {
                f2354i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f2355j = cls;
                f2356k = cls.getDeclaredField("mVisibleInsets");
                f2357l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f2356k.setAccessible(true);
                f2357l.setAccessible(true);
            } catch (ReflectiveOperationException e6) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
            }
            f2353h = true;
        }

        @Override // androidx.core.view.c3.l
        void d(View view) {
            androidx.core.graphics.g x5 = x(view);
            if (x5 == null) {
                x5 = androidx.core.graphics.g.f2109e;
            }
            r(x5);
        }

        @Override // androidx.core.view.c3.l
        void e(c3 c3Var) {
            c3Var.s(this.f2361f);
            c3Var.r(this.f2362g);
        }

        @Override // androidx.core.view.c3.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f2362g, ((g) obj).f2362g);
            }
            return false;
        }

        @Override // androidx.core.view.c3.l
        public androidx.core.graphics.g g(int i6) {
            return u(i6, false);
        }

        @Override // androidx.core.view.c3.l
        final androidx.core.graphics.g k() {
            if (this.f2360e == null) {
                this.f2360e = androidx.core.graphics.g.b(this.f2358c.getSystemWindowInsetLeft(), this.f2358c.getSystemWindowInsetTop(), this.f2358c.getSystemWindowInsetRight(), this.f2358c.getSystemWindowInsetBottom());
            }
            return this.f2360e;
        }

        @Override // androidx.core.view.c3.l
        c3 m(int i6, int i7, int i8, int i9) {
            b bVar = new b(c3.v(this.f2358c));
            bVar.c(c3.m(k(), i6, i7, i8, i9));
            bVar.b(c3.m(i(), i6, i7, i8, i9));
            return bVar.a();
        }

        @Override // androidx.core.view.c3.l
        boolean o() {
            return this.f2358c.isRound();
        }

        @Override // androidx.core.view.c3.l
        boolean p(int i6) {
            for (int i7 = 1; i7 <= 256; i7 <<= 1) {
                if ((i6 & i7) != 0 && !y(i7)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.c3.l
        public void q(androidx.core.graphics.g[] gVarArr) {
            this.f2359d = gVarArr;
        }

        @Override // androidx.core.view.c3.l
        void r(androidx.core.graphics.g gVar) {
            this.f2362g = gVar;
        }

        @Override // androidx.core.view.c3.l
        void s(c3 c3Var) {
            this.f2361f = c3Var;
        }

        protected androidx.core.graphics.g v(int i6, boolean z5) {
            androidx.core.graphics.g g6;
            int i7;
            if (i6 == 1) {
                return z5 ? androidx.core.graphics.g.b(0, Math.max(w().f2111b, k().f2111b), 0, 0) : androidx.core.graphics.g.b(0, k().f2111b, 0, 0);
            }
            if (i6 == 2) {
                if (z5) {
                    androidx.core.graphics.g w5 = w();
                    androidx.core.graphics.g i8 = i();
                    return androidx.core.graphics.g.b(Math.max(w5.f2110a, i8.f2110a), 0, Math.max(w5.f2112c, i8.f2112c), Math.max(w5.f2113d, i8.f2113d));
                }
                androidx.core.graphics.g k6 = k();
                c3 c3Var = this.f2361f;
                g6 = c3Var != null ? c3Var.g() : null;
                int i9 = k6.f2113d;
                if (g6 != null) {
                    i9 = Math.min(i9, g6.f2113d);
                }
                return androidx.core.graphics.g.b(k6.f2110a, 0, k6.f2112c, i9);
            }
            if (i6 != 8) {
                if (i6 == 16) {
                    return j();
                }
                if (i6 == 32) {
                    return h();
                }
                if (i6 == 64) {
                    return l();
                }
                if (i6 != 128) {
                    return androidx.core.graphics.g.f2109e;
                }
                c3 c3Var2 = this.f2361f;
                v e6 = c3Var2 != null ? c3Var2.e() : f();
                return e6 != null ? androidx.core.graphics.g.b(e6.b(), e6.d(), e6.c(), e6.a()) : androidx.core.graphics.g.f2109e;
            }
            androidx.core.graphics.g[] gVarArr = this.f2359d;
            g6 = gVarArr != null ? gVarArr[m.a(8)] : null;
            if (g6 != null) {
                return g6;
            }
            androidx.core.graphics.g k7 = k();
            androidx.core.graphics.g w6 = w();
            int i10 = k7.f2113d;
            if (i10 > w6.f2113d) {
                return androidx.core.graphics.g.b(0, 0, 0, i10);
            }
            androidx.core.graphics.g gVar = this.f2362g;
            return (gVar == null || gVar.equals(androidx.core.graphics.g.f2109e) || (i7 = this.f2362g.f2113d) <= w6.f2113d) ? androidx.core.graphics.g.f2109e : androidx.core.graphics.g.b(0, 0, 0, i7);
        }

        protected boolean y(int i6) {
            if (i6 != 1 && i6 != 2) {
                if (i6 == 4) {
                    return false;
                }
                if (i6 != 8 && i6 != 128) {
                    return true;
                }
            }
            return !v(i6, false).equals(androidx.core.graphics.g.f2109e);
        }

        g(c3 c3Var, g gVar) {
            this(c3Var, new WindowInsets(gVar.f2358c));
        }
    }

    /* loaded from: classes.dex */
    private static class h extends g {

        /* renamed from: m, reason: collision with root package name */
        private androidx.core.graphics.g f2363m;

        h(c3 c3Var, WindowInsets windowInsets) {
            super(c3Var, windowInsets);
            this.f2363m = null;
        }

        @Override // androidx.core.view.c3.l
        c3 b() {
            return c3.v(this.f2358c.consumeStableInsets());
        }

        @Override // androidx.core.view.c3.l
        c3 c() {
            return c3.v(this.f2358c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.c3.l
        final androidx.core.graphics.g i() {
            if (this.f2363m == null) {
                this.f2363m = androidx.core.graphics.g.b(this.f2358c.getStableInsetLeft(), this.f2358c.getStableInsetTop(), this.f2358c.getStableInsetRight(), this.f2358c.getStableInsetBottom());
            }
            return this.f2363m;
        }

        @Override // androidx.core.view.c3.l
        boolean n() {
            return this.f2358c.isConsumed();
        }

        @Override // androidx.core.view.c3.l
        public void t(androidx.core.graphics.g gVar) {
            this.f2363m = gVar;
        }

        h(c3 c3Var, h hVar) {
            super(c3Var, hVar);
            this.f2363m = null;
            this.f2363m = hVar.f2363m;
        }
    }

    /* loaded from: classes.dex */
    private static class i extends h {
        i(c3 c3Var, WindowInsets windowInsets) {
            super(c3Var, windowInsets);
        }

        @Override // androidx.core.view.c3.l
        c3 a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f2358c.consumeDisplayCutout();
            return c3.v(consumeDisplayCutout);
        }

        @Override // androidx.core.view.c3.g, androidx.core.view.c3.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f2358c, iVar.f2358c) && Objects.equals(this.f2362g, iVar.f2362g);
        }

        @Override // androidx.core.view.c3.l
        v f() {
            DisplayCutout displayCutout;
            displayCutout = this.f2358c.getDisplayCutout();
            return v.e(displayCutout);
        }

        @Override // androidx.core.view.c3.l
        public int hashCode() {
            return this.f2358c.hashCode();
        }

        i(c3 c3Var, i iVar) {
            super(c3Var, iVar);
        }
    }

    /* loaded from: classes.dex */
    private static class j extends i {

        /* renamed from: n, reason: collision with root package name */
        private androidx.core.graphics.g f2364n;

        /* renamed from: o, reason: collision with root package name */
        private androidx.core.graphics.g f2365o;

        /* renamed from: p, reason: collision with root package name */
        private androidx.core.graphics.g f2366p;

        j(c3 c3Var, WindowInsets windowInsets) {
            super(c3Var, windowInsets);
            this.f2364n = null;
            this.f2365o = null;
            this.f2366p = null;
        }

        @Override // androidx.core.view.c3.l
        androidx.core.graphics.g h() {
            Insets mandatorySystemGestureInsets;
            if (this.f2365o == null) {
                mandatorySystemGestureInsets = this.f2358c.getMandatorySystemGestureInsets();
                this.f2365o = androidx.core.graphics.g.d(mandatorySystemGestureInsets);
            }
            return this.f2365o;
        }

        @Override // androidx.core.view.c3.l
        androidx.core.graphics.g j() {
            Insets systemGestureInsets;
            if (this.f2364n == null) {
                systemGestureInsets = this.f2358c.getSystemGestureInsets();
                this.f2364n = androidx.core.graphics.g.d(systemGestureInsets);
            }
            return this.f2364n;
        }

        @Override // androidx.core.view.c3.l
        androidx.core.graphics.g l() {
            Insets tappableElementInsets;
            if (this.f2366p == null) {
                tappableElementInsets = this.f2358c.getTappableElementInsets();
                this.f2366p = androidx.core.graphics.g.d(tappableElementInsets);
            }
            return this.f2366p;
        }

        @Override // androidx.core.view.c3.g, androidx.core.view.c3.l
        c3 m(int i6, int i7, int i8, int i9) {
            WindowInsets inset;
            inset = this.f2358c.inset(i6, i7, i8, i9);
            return c3.v(inset);
        }

        @Override // androidx.core.view.c3.h, androidx.core.view.c3.l
        public void t(androidx.core.graphics.g gVar) {
        }

        j(c3 c3Var, j jVar) {
            super(c3Var, jVar);
            this.f2364n = null;
            this.f2365o = null;
            this.f2366p = null;
        }
    }

    /* loaded from: classes.dex */
    private static class k extends j {

        /* renamed from: q, reason: collision with root package name */
        static final c3 f2367q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f2367q = c3.v(windowInsets);
        }

        k(c3 c3Var, WindowInsets windowInsets) {
            super(c3Var, windowInsets);
        }

        @Override // androidx.core.view.c3.g, androidx.core.view.c3.l
        final void d(View view) {
        }

        @Override // androidx.core.view.c3.g, androidx.core.view.c3.l
        public androidx.core.graphics.g g(int i6) {
            Insets insets;
            insets = this.f2358c.getInsets(n.a(i6));
            return androidx.core.graphics.g.d(insets);
        }

        @Override // androidx.core.view.c3.g, androidx.core.view.c3.l
        public boolean p(int i6) {
            boolean isVisible;
            isVisible = this.f2358c.isVisible(n.a(i6));
            return isVisible;
        }

        k(c3 c3Var, k kVar) {
            super(c3Var, kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: b, reason: collision with root package name */
        static final c3 f2368b = new b().a().a().b().c();

        /* renamed from: a, reason: collision with root package name */
        final c3 f2369a;

        l(c3 c3Var) {
            this.f2369a = c3Var;
        }

        c3 a() {
            return this.f2369a;
        }

        c3 b() {
            return this.f2369a;
        }

        c3 c() {
            return this.f2369a;
        }

        void d(View view) {
        }

        void e(c3 c3Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return o() == lVar.o() && n() == lVar.n() && androidx.core.util.c.a(k(), lVar.k()) && androidx.core.util.c.a(i(), lVar.i()) && androidx.core.util.c.a(f(), lVar.f());
        }

        v f() {
            return null;
        }

        androidx.core.graphics.g g(int i6) {
            return androidx.core.graphics.g.f2109e;
        }

        androidx.core.graphics.g h() {
            return k();
        }

        public int hashCode() {
            return androidx.core.util.c.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        androidx.core.graphics.g i() {
            return androidx.core.graphics.g.f2109e;
        }

        androidx.core.graphics.g j() {
            return k();
        }

        androidx.core.graphics.g k() {
            return androidx.core.graphics.g.f2109e;
        }

        androidx.core.graphics.g l() {
            return k();
        }

        c3 m(int i6, int i7, int i8, int i9) {
            return f2368b;
        }

        boolean n() {
            return false;
        }

        boolean o() {
            return false;
        }

        boolean p(int i6) {
            return true;
        }

        public void q(androidx.core.graphics.g[] gVarArr) {
        }

        void r(androidx.core.graphics.g gVar) {
        }

        void s(c3 c3Var) {
        }

        public void t(androidx.core.graphics.g gVar) {
        }
    }

    /* loaded from: classes.dex */
    public static final class m {
        static int a(int i6) {
            if (i6 == 1) {
                return 0;
            }
            if (i6 == 2) {
                return 1;
            }
            if (i6 == 4) {
                return 2;
            }
            if (i6 == 8) {
                return 3;
            }
            if (i6 == 16) {
                return 4;
            }
            if (i6 == 32) {
                return 5;
            }
            if (i6 == 64) {
                return 6;
            }
            if (i6 == 128) {
                return 7;
            }
            if (i6 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i6);
        }

        public static int b() {
            return 32;
        }

        public static int c() {
            return 1;
        }

        public static int d() {
            return 7;
        }
    }

    /* loaded from: classes.dex */
    private static final class n {
        static int a(int i6) {
            int statusBars;
            int i7 = 0;
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((i6 & i8) != 0) {
                    if (i8 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i8 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i8 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i8 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i8 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i8 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i8 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i8 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i7 |= statusBars;
                }
            }
            return i7;
        }
    }

    static {
        f2337b = Build.VERSION.SDK_INT >= 30 ? k.f2367q : l.f2368b;
    }

    private c3(WindowInsets windowInsets) {
        int i6 = Build.VERSION.SDK_INT;
        this.f2338a = i6 >= 30 ? new k(this, windowInsets) : i6 >= 29 ? new j(this, windowInsets) : i6 >= 28 ? new i(this, windowInsets) : new h(this, windowInsets);
    }

    static androidx.core.graphics.g m(androidx.core.graphics.g gVar, int i6, int i7, int i8, int i9) {
        int max = Math.max(0, gVar.f2110a - i6);
        int max2 = Math.max(0, gVar.f2111b - i7);
        int max3 = Math.max(0, gVar.f2112c - i8);
        int max4 = Math.max(0, gVar.f2113d - i9);
        return (max == i6 && max2 == i7 && max3 == i8 && max4 == i9) ? gVar : androidx.core.graphics.g.b(max, max2, max3, max4);
    }

    public static c3 v(WindowInsets windowInsets) {
        return w(windowInsets, null);
    }

    public static c3 w(WindowInsets windowInsets, View view) {
        c3 c3Var = new c3((WindowInsets) androidx.core.util.h.f(windowInsets));
        if (view != null && b1.T(view)) {
            c3Var.s(b1.K(view));
            c3Var.d(view.getRootView());
        }
        return c3Var;
    }

    public c3 a() {
        return this.f2338a.a();
    }

    public c3 b() {
        return this.f2338a.b();
    }

    public c3 c() {
        return this.f2338a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(View view) {
        this.f2338a.d(view);
    }

    public v e() {
        return this.f2338a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c3) {
            return androidx.core.util.c.a(this.f2338a, ((c3) obj).f2338a);
        }
        return false;
    }

    public androidx.core.graphics.g f(int i6) {
        return this.f2338a.g(i6);
    }

    public androidx.core.graphics.g g() {
        return this.f2338a.i();
    }

    public int h() {
        return this.f2338a.k().f2113d;
    }

    public int hashCode() {
        l lVar = this.f2338a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public int i() {
        return this.f2338a.k().f2110a;
    }

    public int j() {
        return this.f2338a.k().f2112c;
    }

    public int k() {
        return this.f2338a.k().f2111b;
    }

    public c3 l(int i6, int i7, int i8, int i9) {
        return this.f2338a.m(i6, i7, i8, i9);
    }

    public boolean n() {
        return this.f2338a.n();
    }

    public boolean o(int i6) {
        return this.f2338a.p(i6);
    }

    public c3 p(int i6, int i7, int i8, int i9) {
        return new b(this).c(androidx.core.graphics.g.b(i6, i7, i8, i9)).a();
    }

    void q(androidx.core.graphics.g[] gVarArr) {
        this.f2338a.q(gVarArr);
    }

    void r(androidx.core.graphics.g gVar) {
        this.f2338a.r(gVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(c3 c3Var) {
        this.f2338a.s(c3Var);
    }

    void t(androidx.core.graphics.g gVar) {
        this.f2338a.t(gVar);
    }

    public WindowInsets u() {
        l lVar = this.f2338a;
        if (lVar instanceof g) {
            return ((g) lVar).f2358c;
        }
        return null;
    }

    public c3(c3 c3Var) {
        if (c3Var == null) {
            this.f2338a = new l(this);
            return;
        }
        l lVar = c3Var.f2338a;
        int i6 = Build.VERSION.SDK_INT;
        this.f2338a = (i6 < 30 || !(lVar instanceof k)) ? (i6 < 29 || !(lVar instanceof j)) ? (i6 < 28 || !(lVar instanceof i)) ? lVar instanceof h ? new h(this, (h) lVar) : lVar instanceof g ? new g(this, (g) lVar) : new l(this) : new i(this, (i) lVar) : new j(this, (j) lVar) : new k(this, (k) lVar);
        lVar.e(this);
    }
}
