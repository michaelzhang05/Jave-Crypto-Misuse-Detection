package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    private static final List f3067a;

    /* renamed from: b, reason: collision with root package name */
    private static final List f3068b;

    static {
        List f6;
        List b6;
        f6 = a5.n.f(Application.class, y.class);
        f3067a = f6;
        b6 = a5.m.b(y.class);
        f3068b = b6;
    }

    public static final Constructor c(Class cls, List list) {
        List l6;
        f5.h.e(cls, "modelClass");
        f5.h.e(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        f5.h.d(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            f5.h.d(parameterTypes, "constructor.parameterTypes");
            l6 = a5.j.l(parameterTypes);
            if (f5.h.a(list, l6)) {
                f5.h.c(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (list.size() == l6.size() && l6.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final e0 d(Class cls, Constructor constructor, Object... objArr) {
        f5.h.e(cls, "modelClass");
        f5.h.e(constructor, "constructor");
        f5.h.e(objArr, "params");
        try {
            return (e0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("Failed to access " + cls, e6);
        } catch (InstantiationException e7) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e8.getCause());
        }
    }
}
