package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class s2 {

    /* renamed from: i, reason: collision with root package name */
    private static s2 f1214i;

    /* renamed from: a, reason: collision with root package name */
    private WeakHashMap f1216a;

    /* renamed from: b, reason: collision with root package name */
    private l.g f1217b;

    /* renamed from: c, reason: collision with root package name */
    private l.h f1218c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakHashMap f1219d = new WeakHashMap(0);

    /* renamed from: e, reason: collision with root package name */
    private TypedValue f1220e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1221f;

    /* renamed from: g, reason: collision with root package name */
    private f f1222g;

    /* renamed from: h, reason: collision with root package name */
    private static final PorterDuff.Mode f1213h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j, reason: collision with root package name */
    private static final c f1215j = new c(6);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements e {
        a() {
        }

        @Override // androidx.appcompat.widget.s2.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return f.a.l(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e6) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e6);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements e {
        b() {
        }

        @Override // androidx.appcompat.widget.s2.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.e.b(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e6) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e6);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends l.e {
        public c(int i6) {
            super(i6);
        }

        private static int h(int i6, PorterDuff.Mode mode) {
            return ((i6 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter i(int i6, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) c(Integer.valueOf(h(i6, mode)));
        }

        PorterDuffColorFilter j(int i6, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) d(Integer.valueOf(h(i6, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d implements e {
        d() {
        }

        @Override // androidx.appcompat.widget.s2.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    g.c.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e6) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e6);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* loaded from: classes.dex */
    public interface f {
        Drawable a(s2 s2Var, Context context, int i6);

        boolean b(Context context, int i6, Drawable drawable);

        ColorStateList c(Context context, int i6);

        boolean d(Context context, int i6, Drawable drawable);

        PorterDuff.Mode e(int i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g implements e {
        g() {
        }

        @Override // androidx.appcompat.widget.s2.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.j.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e6) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e6);
                return null;
            }
        }
    }

    private void a(String str, e eVar) {
        if (this.f1217b == null) {
            this.f1217b = new l.g();
        }
        this.f1217b.put(str, eVar);
    }

    private synchronized boolean b(Context context, long j6, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        l.d dVar = (l.d) this.f1219d.get(context);
        if (dVar == null) {
            dVar = new l.d();
            this.f1219d.put(context, dVar);
        }
        dVar.j(j6, new WeakReference(constantState));
        return true;
    }

    private void c(Context context, int i6, ColorStateList colorStateList) {
        if (this.f1216a == null) {
            this.f1216a = new WeakHashMap();
        }
        l.h hVar = (l.h) this.f1216a.get(context);
        if (hVar == null) {
            hVar = new l.h();
            this.f1216a.put(context, hVar);
        }
        hVar.a(i6, colorStateList);
    }

    private void d(Context context) {
        if (this.f1221f) {
            return;
        }
        this.f1221f = true;
        Drawable j6 = j(context, g.d.f6622a);
        if (j6 == null || !q(j6)) {
            this.f1221f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable f(Context context, int i6) {
        if (this.f1220e == null) {
            this.f1220e = new TypedValue();
        }
        TypedValue typedValue = this.f1220e;
        context.getResources().getValue(i6, typedValue, true);
        long e6 = e(typedValue);
        Drawable i7 = i(context, e6);
        if (i7 != null) {
            return i7;
        }
        f fVar = this.f1222g;
        Drawable a6 = fVar == null ? null : fVar.a(this, context, i6);
        if (a6 != null) {
            a6.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e6, a6);
        }
        return a6;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized s2 h() {
        s2 s2Var;
        synchronized (s2.class) {
            if (f1214i == null) {
                s2 s2Var2 = new s2();
                f1214i = s2Var2;
                p(s2Var2);
            }
            s2Var = f1214i;
        }
        return s2Var;
    }

    private synchronized Drawable i(Context context, long j6) {
        l.d dVar = (l.d) this.f1219d.get(context);
        if (dVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) dVar.e(j6);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            dVar.k(j6);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter l(int i6, PorterDuff.Mode mode) {
        PorterDuffColorFilter i7;
        synchronized (s2.class) {
            c cVar = f1215j;
            i7 = cVar.i(i6, mode);
            if (i7 == null) {
                i7 = new PorterDuffColorFilter(i6, mode);
                cVar.j(i6, mode, i7);
            }
        }
        return i7;
    }

    private ColorStateList n(Context context, int i6) {
        l.h hVar;
        WeakHashMap weakHashMap = this.f1216a;
        if (weakHashMap == null || (hVar = (l.h) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) hVar.e(i6);
    }

    private static void p(s2 s2Var) {
        if (Build.VERSION.SDK_INT < 24) {
            s2Var.a("vector", new g());
            s2Var.a("animated-vector", new b());
            s2Var.a("animated-selector", new a());
            s2Var.a("drawable", new d());
        }
    }

    private static boolean q(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.j) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable r(Context context, int i6) {
        int next;
        l.g gVar = this.f1217b;
        if (gVar == null || gVar.isEmpty()) {
            return null;
        }
        l.h hVar = this.f1218c;
        if (hVar != null) {
            String str = (String) hVar.e(i6);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f1217b.get(str) == null)) {
                return null;
            }
        } else {
            this.f1218c = new l.h();
        }
        if (this.f1220e == null) {
            this.f1220e = new TypedValue();
        }
        TypedValue typedValue = this.f1220e;
        Resources resources = context.getResources();
        resources.getValue(i6, typedValue, true);
        long e6 = e(typedValue);
        Drawable i7 = i(context, e6);
        if (i7 != null) {
            return i7;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i6);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f1218c.a(i6, name);
                e eVar = (e) this.f1217b.get(name);
                if (eVar != null) {
                    i7 = eVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (i7 != null) {
                    i7.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, e6, i7);
                }
            } catch (Exception e7) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e7);
            }
        }
        if (i7 == null) {
            this.f1218c.a(i6, "appcompat_skip_skip");
        }
        return i7;
    }

    private Drawable v(Context context, int i6, boolean z5, Drawable drawable) {
        ColorStateList m6 = m(context, i6);
        if (m6 == null) {
            f fVar = this.f1222g;
            if ((fVar == null || !fVar.d(context, i6, drawable)) && !x(context, i6, drawable) && z5) {
                return null;
            }
            return drawable;
        }
        if (c2.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable r5 = androidx.core.graphics.drawable.a.r(drawable);
        androidx.core.graphics.drawable.a.o(r5, m6);
        PorterDuff.Mode o6 = o(i6);
        if (o6 == null) {
            return r5;
        }
        androidx.core.graphics.drawable.a.p(r5, o6);
        return r5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void w(Drawable drawable, a3 a3Var, int[] iArr) {
        int[] state = drawable.getState();
        if (c2.a(drawable)) {
            if (!(drawable.mutate() == drawable)) {
                Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
                return;
            }
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z5 = a3Var.f917d;
        if (z5 || a3Var.f916c) {
            drawable.setColorFilter(g(z5 ? a3Var.f914a : null, a3Var.f916c ? a3Var.f915b : f1213h, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public synchronized Drawable j(Context context, int i6) {
        return k(context, i6, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable k(Context context, int i6, boolean z5) {
        Drawable r5;
        d(context);
        r5 = r(context, i6);
        if (r5 == null) {
            r5 = f(context, i6);
        }
        if (r5 == null) {
            r5 = androidx.core.content.a.e(context, i6);
        }
        if (r5 != null) {
            r5 = v(context, i6, z5, r5);
        }
        if (r5 != null) {
            c2.b(r5);
        }
        return r5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized ColorStateList m(Context context, int i6) {
        ColorStateList n6;
        n6 = n(context, i6);
        if (n6 == null) {
            f fVar = this.f1222g;
            n6 = fVar == null ? null : fVar.c(context, i6);
            if (n6 != null) {
                c(context, i6, n6);
            }
        }
        return n6;
    }

    PorterDuff.Mode o(int i6) {
        f fVar = this.f1222g;
        if (fVar == null) {
            return null;
        }
        return fVar.e(i6);
    }

    public synchronized void s(Context context) {
        l.d dVar = (l.d) this.f1219d.get(context);
        if (dVar != null) {
            dVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable t(Context context, o3 o3Var, int i6) {
        Drawable r5 = r(context, i6);
        if (r5 == null) {
            r5 = o3Var.a(i6);
        }
        if (r5 == null) {
            return null;
        }
        return v(context, i6, false, r5);
    }

    public synchronized void u(f fVar) {
        this.f1222g = fVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x(Context context, int i6, Drawable drawable) {
        f fVar = this.f1222g;
        return fVar != null && fVar.b(context, i6, drawable);
    }
}
