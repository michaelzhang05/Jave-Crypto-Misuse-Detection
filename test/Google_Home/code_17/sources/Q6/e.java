package Q6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    private final Class f9498a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9499b;

    /* renamed from: c, reason: collision with root package name */
    private final Class[] f9500c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Class cls, String str, Class... clsArr) {
        this.f9498a = cls;
        this.f9499b = str;
        this.f9500c = clsArr;
    }

    private Method a(Class cls) {
        Class cls2;
        String str = this.f9499b;
        if (str == null) {
            return null;
        }
        Method b8 = b(cls, str, this.f9500c);
        if (b8 != null && (cls2 = this.f9498a) != null && !cls2.isAssignableFrom(b8.getReturnType())) {
            return null;
        }
        return b8;
    }

    private static Method b(Class cls, String str, Class[] clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    public Object c(Object obj, Object... objArr) {
        Method a8 = a(obj.getClass());
        if (a8 != null) {
            try {
                return a8.invoke(obj, objArr);
            } catch (IllegalAccessException e8) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + a8);
                assertionError.initCause(e8);
                throw assertionError;
            }
        }
        throw new AssertionError("Method " + this.f9499b + " not supported for object " + obj);
    }

    public Object d(Object obj, Object... objArr) {
        Method a8 = a(obj.getClass());
        if (a8 == null) {
            return null;
        }
        try {
            return a8.invoke(obj, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    public Object e(Object obj, Object... objArr) {
        try {
            return d(obj, objArr);
        } catch (InvocationTargetException e8) {
            Throwable targetException = e8.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public Object f(Object obj, Object... objArr) {
        try {
            return c(obj, objArr);
        } catch (InvocationTargetException e8) {
            Throwable targetException = e8.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public boolean g(Object obj) {
        if (a(obj.getClass()) != null) {
            return true;
        }
        return false;
    }
}
