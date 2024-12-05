package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* loaded from: classes.dex */
public class t extends l {

    /* renamed from: g, reason: collision with root package name */
    protected final Class f2131g;

    /* renamed from: h, reason: collision with root package name */
    protected final Constructor f2132h;

    /* renamed from: i, reason: collision with root package name */
    protected final Method f2133i;

    /* renamed from: j, reason: collision with root package name */
    protected final Method f2134j;

    /* renamed from: k, reason: collision with root package name */
    protected final Method f2135k;

    /* renamed from: l, reason: collision with root package name */
    protected final Method f2136l;

    /* renamed from: m, reason: collision with root package name */
    protected final Method f2137m;

    public t() {
        Class cls;
        Constructor constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = v();
            constructor = w(cls);
            method = s(cls);
            method2 = t(cls);
            method3 = x(cls);
            method4 = r(cls);
            method5 = u(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e6) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e6.getClass().getName(), e6);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f2131g = cls;
        this.f2132h = constructor;
        this.f2133i = method;
        this.f2134j = method2;
        this.f2135k = method3;
        this.f2136l = method4;
        this.f2137m = method5;
    }

    private Object l() {
        try {
            return this.f2132h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void m(Object obj) {
        try {
            this.f2136l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean n(Context context, Object obj, String str, int i6, int i7, int i8, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2133i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean o(Object obj, ByteBuffer byteBuffer, int i6, int i7, int i8) {
        try {
            return ((Boolean) this.f2134j.invoke(obj, byteBuffer, Integer.valueOf(i6), null, Integer.valueOf(i7), Integer.valueOf(i8))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean p(Object obj) {
        try {
            return ((Boolean) this.f2135k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean q() {
        if (this.f2133i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f2133i != null;
    }

    @Override // androidx.core.graphics.l, androidx.core.graphics.t0
    public Typeface a(Context context, e.c cVar, Resources resources, int i6) {
        FontVariationAxis[] fromFontVariationSettings;
        if (!q()) {
            return super.a(context, cVar, resources, i6);
        }
        Object l6 = l();
        if (l6 == null) {
            return null;
        }
        for (e.d dVar : cVar.a()) {
            String a6 = dVar.a();
            int c6 = dVar.c();
            int e6 = dVar.e();
            boolean f6 = dVar.f();
            fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(dVar.d());
            if (!n(context, l6, a6, c6, e6, f6 ? 1 : 0, fromFontVariationSettings)) {
                m(l6);
                return null;
            }
        }
        if (p(l6)) {
            return i(l6);
        }
        return null;
    }

    @Override // androidx.core.graphics.l, androidx.core.graphics.t0
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i6) {
        Typeface i7;
        Typeface.Builder weight;
        Typeface.Builder italic;
        Typeface build;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!q()) {
            g.b g6 = g(bVarArr, i6);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(g6.d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    s.a();
                    weight = r.a(openFileDescriptor.getFileDescriptor()).setWeight(g6.e());
                    italic = weight.setItalic(g6.f());
                    build = italic.build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map h6 = u0.h(context, bVarArr, cancellationSignal);
        Object l6 = l();
        if (l6 == null) {
            return null;
        }
        boolean z5 = false;
        for (g.b bVar : bVarArr) {
            ByteBuffer byteBuffer = (ByteBuffer) h6.get(bVar.d());
            if (byteBuffer != null) {
                if (!o(l6, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                    m(l6);
                    return null;
                }
                z5 = true;
            }
        }
        if (!z5) {
            m(l6);
            return null;
        }
        if (p(l6) && (i7 = i(l6)) != null) {
            return Typeface.create(i7, i6);
        }
        return null;
    }

    @Override // androidx.core.graphics.t0
    public Typeface d(Context context, Resources resources, int i6, String str, int i7) {
        if (!q()) {
            return super.d(context, resources, i6, str, i7);
        }
        Object l6 = l();
        if (l6 == null) {
            return null;
        }
        if (!n(context, l6, str, 0, -1, -1, null)) {
            m(l6);
            return null;
        }
        if (p(l6)) {
            return i(l6);
        }
        return null;
    }

    protected Typeface i(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f2131g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2137m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method r(Class cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    protected Method s(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    protected Method t(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method u(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class v() {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor w(Class cls) {
        return cls.getConstructor(new Class[0]);
    }

    protected Method x(Class cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}
