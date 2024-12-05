package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class l extends t0 {

    /* renamed from: b, reason: collision with root package name */
    private static Class f2122b = null;

    /* renamed from: c, reason: collision with root package name */
    private static Constructor f2123c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Method f2124d = null;

    /* renamed from: e, reason: collision with root package name */
    private static Method f2125e = null;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f2126f = false;

    private static boolean h(Object obj, String str, int i6, boolean z5) {
        k();
        try {
            return ((Boolean) f2124d.invoke(obj, str, Integer.valueOf(i6), Boolean.valueOf(z5))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    private static Typeface i(Object obj) {
        k();
        try {
            Object newInstance = Array.newInstance((Class<?>) f2122b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2125e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    private File j(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void k() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f2126f) {
            return;
        }
        f2126f = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e6) {
            Log.e("TypefaceCompatApi21Impl", e6.getClass().getName(), e6);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f2123c = constructor;
        f2122b = cls;
        f2124d = method2;
        f2125e = method;
    }

    private static Object l() {
        k();
        try {
            return f2123c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    @Override // androidx.core.graphics.t0
    public Typeface a(Context context, e.c cVar, Resources resources, int i6) {
        Object l6 = l();
        for (e.d dVar : cVar.a()) {
            File e6 = u0.e(context);
            if (e6 == null) {
                return null;
            }
            try {
                if (!u0.c(e6, resources, dVar.b())) {
                    return null;
                }
                if (!h(l6, e6.getPath(), dVar.e(), dVar.f())) {
                    return null;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e6.delete();
            }
        }
        return i(l6);
    }

    @Override // androidx.core.graphics.t0
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i6) {
        if (bVarArr.length < 1) {
            return null;
        }
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
                File j6 = j(openFileDescriptor);
                if (j6 != null && j6.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(j6);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    Typeface c6 = super.c(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return c6;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
