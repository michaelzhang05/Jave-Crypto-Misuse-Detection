package androidx.core.content.d;

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
import c.h.j.j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: ResourcesCompat.java */
/* loaded from: classes.dex */
public final class f {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap<b, SparseArray<a>> f917b = new WeakHashMap<>(0);

    /* renamed from: c, reason: collision with root package name */
    private static final Object f918c = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        final ColorStateList a;

        /* renamed from: b, reason: collision with root package name */
        final Configuration f919b;

        a(ColorStateList colorStateList, Configuration configuration) {
            this.a = colorStateList;
            this.f919b = configuration;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static final class b {
        final Resources a;

        /* renamed from: b, reason: collision with root package name */
        final Resources.Theme f920b;

        b(Resources resources, Resources.Theme theme) {
            this.a = resources;
            this.f920b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && c.h.j.e.a(this.f920b, bVar.f920b);
        }

        public int hashCode() {
            return c.h.j.e.b(this.a, this.f920b);
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static abstract class c {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ResourcesCompat.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Typeface f921f;

            a(Typeface typeface) {
                this.f921f = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.e(this.f921f);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ResourcesCompat.java */
        /* loaded from: classes.dex */
        public class b implements Runnable {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f923f;

            b(int i2) {
                this.f923f = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.d(this.f923f);
            }
        }

        public static Handler c(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void a(int i2, Handler handler) {
            c(handler).post(new b(i2));
        }

        public final void b(Typeface typeface, Handler handler) {
            c(handler).post(new a(typeface));
        }

        public abstract void d(int i2);

        public abstract void e(Typeface typeface);
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static final class d {

        /* compiled from: ResourcesCompat.java */
        /* loaded from: classes.dex */
        static class a {
            private static final Object a = new Object();

            /* renamed from: b, reason: collision with root package name */
            private static Method f925b;

            /* renamed from: c, reason: collision with root package name */
            private static boolean f926c;

            static void a(Resources.Theme theme) {
                synchronized (a) {
                    if (!f926c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f925b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e2) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                        }
                        f926c = true;
                    }
                    Method method = f925b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e3) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                            f925b = null;
                        }
                    }
                }
            }
        }

        /* compiled from: ResourcesCompat.java */
        /* loaded from: classes.dex */
        static class b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                b.a(theme);
            } else if (i2 >= 23) {
                a.a(theme);
            }
        }
    }

    private static void a(b bVar, int i2, ColorStateList colorStateList) {
        synchronized (f918c) {
            WeakHashMap<b, SparseArray<a>> weakHashMap = f917b;
            SparseArray<a> sparseArray = weakHashMap.get(bVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(bVar, sparseArray);
            }
            sparseArray.append(i2, new a(colorStateList, bVar.a.getConfiguration()));
        }
    }

    private static ColorStateList b(b bVar, int i2) {
        a aVar;
        synchronized (f918c) {
            SparseArray<a> sparseArray = f917b.get(bVar);
            if (sparseArray != null && sparseArray.size() > 0 && (aVar = sparseArray.get(i2)) != null) {
                if (aVar.f919b.equals(bVar.a.getConfiguration())) {
                    return aVar.a;
                }
                sparseArray.remove(i2);
            }
            return null;
        }
    }

    public static ColorStateList c(Resources resources, int i2, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColorStateList(i2, theme);
        }
        b bVar = new b(resources, theme);
        ColorStateList b2 = b(bVar, i2);
        if (b2 != null) {
            return b2;
        }
        ColorStateList i3 = i(resources, i2, theme);
        if (i3 != null) {
            a(bVar, i2, i3);
            return i3;
        }
        return resources.getColorStateList(i2);
    }

    public static Drawable d(Resources resources, int i2, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i2, theme);
        }
        return resources.getDrawable(i2);
    }

    public static Typeface e(Context context, int i2) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return k(context, i2, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface f(Context context, int i2, TypedValue typedValue, int i3, c cVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return k(context, i2, typedValue, i3, cVar, null, true, false);
    }

    public static void g(Context context, int i2, c cVar, Handler handler) throws Resources.NotFoundException {
        j.c(cVar);
        if (context.isRestricted()) {
            cVar.a(-4, handler);
        } else {
            k(context, i2, new TypedValue(), 0, cVar, handler, false, false);
        }
    }

    private static TypedValue h() {
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList i(Resources resources, int i2, Resources.Theme theme) {
        if (j(resources, i2)) {
            return null;
        }
        try {
            return androidx.core.content.d.a.a(resources, resources.getXml(i2), theme);
        } catch (Exception e2) {
            Log.e("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            return null;
        }
    }

    private static boolean j(Resources resources, int i2) {
        TypedValue h2 = h();
        resources.getValue(i2, h2, true);
        int i3 = h2.type;
        return i3 >= 28 && i3 <= 31;
    }

    private static Typeface k(Context context, int i2, TypedValue typedValue, int i3, c cVar, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        Typeface l = l(context, resources, typedValue, i2, i3, cVar, handler, z, z2);
        if (l != null || cVar != null || z2) {
            return l;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i2) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Typeface l(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, androidx.core.content.d.f.c r20, android.os.Handler r21, boolean r22, boolean r23) {
        /*
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            r9 = r20
            r10 = r21
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto Laa
            java.lang.String r12 = r2.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = -3
            r14 = 0
            if (r1 != 0) goto L26
            if (r9 == 0) goto L25
            r9.a(r13, r10)
        L25:
            return r14
        L26:
            android.graphics.Typeface r1 = c.h.e.d.f(r0, r4, r5)
            if (r1 == 0) goto L32
            if (r9 == 0) goto L31
            r9.b(r1, r10)
        L31:
            return r1
        L32:
            if (r23 == 0) goto L35
            return r14
        L35:
            java.lang.String r1 = r12.toLowerCase()     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r1 == 0) goto L68
            android.content.res.XmlResourceParser r1 = r0.getXml(r4)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            androidx.core.content.d.c$a r2 = androidx.core.content.d.c.b(r1, r0)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r2 != 0) goto L56
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r9 == 0) goto L55
            r9.a(r13, r10)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
        L55:
            return r14
        L56:
            r1 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r0 = c.h.e.d.c(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            return r0
        L68:
            r1 = r15
            android.graphics.Typeface r0 = c.h.e.d.d(r15, r0, r4, r12, r5)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r9 == 0) goto L78
            if (r0 == 0) goto L75
            r9.b(r0, r10)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            goto L78
        L75:
            r9.a(r13, r10)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
        L78:
            return r0
        L79:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            goto La4
        L8f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
        La4:
            if (r9 == 0) goto La9
            r9.a(r13, r10)
        La9:
            return r14
        Laa:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r18)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.d.f.l(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.d.f$c, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
