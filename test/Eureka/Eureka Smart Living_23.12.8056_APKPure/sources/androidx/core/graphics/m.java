package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
class m extends t0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Class f2127b;

    /* renamed from: c, reason: collision with root package name */
    private static final Constructor f2128c;

    /* renamed from: d, reason: collision with root package name */
    private static final Method f2129d;

    /* renamed from: e, reason: collision with root package name */
    private static final Method f2130e;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e6) {
            Log.e("TypefaceCompatApi24Impl", e6.getClass().getName(), e6);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f2128c = constructor;
        f2127b = cls;
        f2129d = method2;
        f2130e = method;
    }

    private static boolean h(Object obj, ByteBuffer byteBuffer, int i6, int i7, boolean z5) {
        try {
            return ((Boolean) f2129d.invoke(obj, byteBuffer, Integer.valueOf(i6), null, Integer.valueOf(i7), Boolean.valueOf(z5))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface i(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f2127b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2130e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean j() {
        Method method = f2129d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object k() {
        try {
            return f2128c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.t0
    public Typeface a(Context context, e.c cVar, Resources resources, int i6) {
        Object k6 = k();
        if (k6 == null) {
            return null;
        }
        for (e.d dVar : cVar.a()) {
            ByteBuffer b6 = u0.b(context, resources, dVar.b());
            if (b6 == null || !h(k6, b6, dVar.c(), dVar.e(), dVar.f())) {
                return null;
            }
        }
        return i(k6);
    }

    @Override // androidx.core.graphics.t0
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i6) {
        Object k6 = k();
        if (k6 == null) {
            return null;
        }
        l.g gVar = new l.g();
        for (g.b bVar : bVarArr) {
            Uri d6 = bVar.d();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(d6);
            if (byteBuffer == null) {
                byteBuffer = u0.f(context, cancellationSignal, d6);
                gVar.put(d6, byteBuffer);
            }
            if (byteBuffer == null || !h(k6, byteBuffer, bVar.c(), bVar.e(), bVar.f())) {
                return null;
            }
        }
        Typeface i7 = i(k6);
        if (i7 == null) {
            return null;
        }
        return Typeface.create(i7, i6);
    }
}
