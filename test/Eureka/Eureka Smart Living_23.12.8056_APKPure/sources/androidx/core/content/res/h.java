package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.content.res.h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f2055a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap f2056b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    private static final Object f2057c = new Object();

    /* loaded from: classes.dex */
    static class a {
        static Drawable a(Resources resources, int i6, Resources.Theme theme) {
            return resources.getDrawable(i6, theme);
        }

        static Drawable b(Resources resources, int i6, int i7, Resources.Theme theme) {
            return resources.getDrawableForDensity(i6, i7, theme);
        }
    }

    /* loaded from: classes.dex */
    static class b {
        static int a(Resources resources, int i6, Resources.Theme theme) {
            int color;
            color = resources.getColor(i6, theme);
            return color;
        }

        static ColorStateList b(Resources resources, int i6, Resources.Theme theme) {
            ColorStateList colorStateList;
            colorStateList = resources.getColorStateList(i6, theme);
            return colorStateList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final ColorStateList f2058a;

        /* renamed from: b, reason: collision with root package name */
        final Configuration f2059b;

        /* renamed from: c, reason: collision with root package name */
        final int f2060c;

        c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f2058a = colorStateList;
            this.f2059b = configuration;
            this.f2060c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        final Resources f2061a;

        /* renamed from: b, reason: collision with root package name */
        final Resources.Theme f2062b;

        d(Resources resources, Resources.Theme theme) {
            this.f2061a = resources;
            this.f2062b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f2061a.equals(dVar.f2061a) && androidx.core.util.c.a(this.f2062b, dVar.f2062b);
        }

        public int hashCode() {
            return androidx.core.util.c.b(this.f2061a, this.f2062b);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(final int i6, Handler handler) {
            e(handler).post(new Runnable() { // from class: androidx.core.content.res.l
                @Override // java.lang.Runnable
                public final void run() {
                    h.e.this.f(i6);
                }
            });
        }

        public final void d(final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() { // from class: androidx.core.content.res.k
                @Override // java.lang.Runnable
                public final void run() {
                    h.e.this.g(typeface);
                }
            });
        }

        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public abstract void f(int i6);

        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public abstract void g(Typeface typeface);
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* loaded from: classes.dex */
        static class a {

            /* renamed from: a, reason: collision with root package name */
            private static final Object f2063a = new Object();

            /* renamed from: b, reason: collision with root package name */
            private static Method f2064b;

            /* renamed from: c, reason: collision with root package name */
            private static boolean f2065c;

            static void a(Resources.Theme theme) {
                synchronized (f2063a) {
                    if (!f2065c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f2064b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e6) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e6);
                        }
                        f2065c = true;
                    }
                    Method method = f2064b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e7) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e7);
                            f2064b = null;
                        }
                    }
                }
            }
        }

        /* loaded from: classes.dex */
        static class b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 29) {
                b.a(theme);
            } else if (i6 >= 23) {
                a.a(theme);
            }
        }
    }

    private static void a(d dVar, int i6, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f2057c) {
            WeakHashMap weakHashMap = f2056b;
            SparseArray sparseArray = (SparseArray) weakHashMap.get(dVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(dVar, sparseArray);
            }
            sparseArray.append(i6, new c(colorStateList, dVar.f2061a.getConfiguration(), theme));
        }
    }

    private static ColorStateList b(d dVar, int i6) {
        c cVar;
        Resources.Theme theme;
        synchronized (f2057c) {
            SparseArray sparseArray = (SparseArray) f2056b.get(dVar);
            if (sparseArray != null && sparseArray.size() > 0 && (cVar = (c) sparseArray.get(i6)) != null) {
                if (cVar.f2059b.equals(dVar.f2061a.getConfiguration()) && (((theme = dVar.f2062b) == null && cVar.f2060c == 0) || (theme != null && cVar.f2060c == theme.hashCode()))) {
                    return cVar.f2058a;
                }
                sparseArray.remove(i6);
            }
            return null;
        }
    }

    public static Typeface c(Context context, int i6) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i6, new TypedValue(), 0, null, null, false, true);
    }

    public static ColorStateList d(Resources resources, int i6, Resources.Theme theme) {
        d dVar = new d(resources, theme);
        ColorStateList b6 = b(dVar, i6);
        if (b6 != null) {
            return b6;
        }
        ColorStateList k6 = k(resources, i6, theme);
        if (k6 == null) {
            return Build.VERSION.SDK_INT >= 23 ? b.b(resources, i6, theme) : resources.getColorStateList(i6);
        }
        a(dVar, i6, k6, theme);
        return k6;
    }

    public static Drawable e(Resources resources, int i6, Resources.Theme theme) {
        return a.a(resources, i6, theme);
    }

    public static Drawable f(Resources resources, int i6, int i7, Resources.Theme theme) {
        return a.b(resources, i6, i7, theme);
    }

    public static Typeface g(Context context, int i6) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i6, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface h(Context context, int i6, TypedValue typedValue, int i7, e eVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i6, typedValue, i7, eVar, null, true, false);
    }

    public static void i(Context context, int i6, e eVar, Handler handler) {
        androidx.core.util.h.f(eVar);
        if (context.isRestricted()) {
            eVar.c(-4, handler);
        } else {
            m(context, i6, new TypedValue(), 0, eVar, handler, false, false);
        }
    }

    private static TypedValue j() {
        ThreadLocal threadLocal = f2055a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList k(Resources resources, int i6, Resources.Theme theme) {
        if (l(resources, i6)) {
            return null;
        }
        try {
            return androidx.core.content.res.c.a(resources, resources.getXml(i6), theme);
        } catch (Exception e6) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e6);
            return null;
        }
    }

    private static boolean l(Resources resources, int i6) {
        TypedValue j6 = j();
        resources.getValue(i6, j6, true);
        int i7 = j6.type;
        return i7 >= 28 && i7 <= 31;
    }

    private static Typeface m(Context context, int i6, TypedValue typedValue, int i7, e eVar, Handler handler, boolean z5, boolean z6) {
        Resources resources = context.getResources();
        resources.getValue(i6, typedValue, true);
        Typeface n6 = n(context, resources, typedValue, i6, i7, eVar, handler, z5, z6);
        if (n6 != null || eVar != null || z6) {
            return n6;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i6) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Typeface n(android.content.Context r17, android.content.res.Resources r18, android.util.TypedValue r19, int r20, int r21, androidx.core.content.res.h.e r22, android.os.Handler r23, boolean r24, boolean r25) {
        /*
            r0 = r18
            r1 = r19
            r4 = r20
            r11 = r22
            r12 = r23
            java.lang.String r13 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto Lae
            java.lang.String r14 = r2.toString()
            java.lang.String r2 = "res/"
            boolean r2 = r14.startsWith(r2)
            r15 = -3
            r16 = 0
            if (r2 != 0) goto L25
            if (r11 == 0) goto L24
            r11.c(r15, r12)
        L24:
            return r16
        L25:
            int r2 = r1.assetCookie
            r7 = r21
            android.graphics.Typeface r2 = androidx.core.graphics.k.f(r0, r4, r14, r2, r7)
            if (r2 == 0) goto L35
            if (r11 == 0) goto L34
            r11.d(r2, r12)
        L34:
            return r2
        L35:
            if (r25 == 0) goto L38
            return r16
        L38:
            java.lang.String r2 = r14.toLowerCase()     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
            java.lang.String r3 = ".xml"
            boolean r2 = r2.endsWith(r3)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
            if (r2 == 0) goto L6f
            android.content.res.XmlResourceParser r2 = r0.getXml(r4)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
            androidx.core.content.res.e$b r2 = androidx.core.content.res.e.b(r2, r0)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
            if (r2 != 0) goto L59
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r13, r0)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
            if (r11 == 0) goto L58
            r11.c(r15, r12)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
        L58:
            return r16
        L59:
            int r6 = r1.assetCookie     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
            r1 = r17
            r3 = r18
            r4 = r20
            r5 = r14
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            android.graphics.Typeface r0 = androidx.core.graphics.k.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
            return r0
        L6f:
            int r5 = r1.assetCookie     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
            r1 = r17
            r2 = r18
            r3 = r20
            r4 = r14
            r6 = r21
            android.graphics.Typeface r0 = androidx.core.graphics.k.d(r1, r2, r3, r4, r5, r6)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
            if (r11 == 0) goto L89
            if (r0 == 0) goto L86
            r11.d(r0, r12)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
            goto L89
        L86:
            r11.c(r15, r12)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
        L89:
            return r0
        L8a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            goto L9b
        L93:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
        L9b:
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
            if (r11 == 0) goto Lad
            r11.c(r15, r12)
        Lad:
            return r16
        Lae:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r20)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.h.n(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.h$e, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
