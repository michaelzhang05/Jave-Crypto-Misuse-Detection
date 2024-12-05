package r1;

import com.google.gson.g;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: r1.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3915a {

    /* renamed from: a, reason: collision with root package name */
    private static final b f38570a;

    /* renamed from: r1.a$b */
    /* loaded from: classes4.dex */
    private static abstract class b {
        private b() {
        }

        public abstract Method a(Class cls, Field field);

        abstract Constructor b(Class cls);

        abstract String[] c(Class cls);

        abstract boolean d(Class cls);
    }

    /* renamed from: r1.a$c */
    /* loaded from: classes4.dex */
    private static class c extends b {
        private c() {
            super();
        }

        @Override // r1.AbstractC3915a.b
        public Method a(Class cls, Field field) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // r1.AbstractC3915a.b
        Constructor b(Class cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // r1.AbstractC3915a.b
        String[] c(Class cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // r1.AbstractC3915a.b
        boolean d(Class cls) {
            return false;
        }
    }

    /* renamed from: r1.a$d */
    /* loaded from: classes4.dex */
    private static class d extends b {

        /* renamed from: a, reason: collision with root package name */
        private final Method f38571a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f38572b;

        /* renamed from: c, reason: collision with root package name */
        private final Method f38573c;

        /* renamed from: d, reason: collision with root package name */
        private final Method f38574d;

        @Override // r1.AbstractC3915a.b
        public Method a(Class cls, Field field) {
            try {
                return cls.getMethod(field.getName(), null);
            } catch (ReflectiveOperationException e8) {
                throw AbstractC3915a.d(e8);
            }
        }

        @Override // r1.AbstractC3915a.b
        public Constructor b(Class cls) {
            try {
                Object[] objArr = (Object[]) this.f38572b.invoke(cls, null);
                Class<?>[] clsArr = new Class[objArr.length];
                for (int i8 = 0; i8 < objArr.length; i8++) {
                    clsArr[i8] = (Class) this.f38574d.invoke(objArr[i8], null);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (ReflectiveOperationException e8) {
                throw AbstractC3915a.d(e8);
            }
        }

        @Override // r1.AbstractC3915a.b
        String[] c(Class cls) {
            try {
                Object[] objArr = (Object[]) this.f38572b.invoke(cls, null);
                String[] strArr = new String[objArr.length];
                for (int i8 = 0; i8 < objArr.length; i8++) {
                    strArr[i8] = (String) this.f38573c.invoke(objArr[i8], null);
                }
                return strArr;
            } catch (ReflectiveOperationException e8) {
                throw AbstractC3915a.d(e8);
            }
        }

        @Override // r1.AbstractC3915a.b
        boolean d(Class cls) {
            try {
                return ((Boolean) this.f38571a.invoke(cls, null)).booleanValue();
            } catch (ReflectiveOperationException e8) {
                throw AbstractC3915a.d(e8);
            }
        }

        private d() {
            super();
            this.f38571a = Class.class.getMethod("isRecord", null);
            Method method = Class.class.getMethod("getRecordComponents", null);
            this.f38572b = method;
            Class<?> componentType = method.getReturnType().getComponentType();
            this.f38573c = componentType.getMethod("getName", null);
            this.f38574d = componentType.getMethod("getType", null);
        }
    }

    static {
        b cVar;
        try {
            cVar = new d();
        } catch (NoSuchMethodException unused) {
            cVar = new c();
        }
        f38570a = cVar;
    }

    private static void b(AccessibleObject accessibleObject, StringBuilder sb) {
        Class<?>[] parameterTypes;
        sb.append('(');
        if (accessibleObject instanceof Method) {
            parameterTypes = ((Method) accessibleObject).getParameterTypes();
        } else {
            parameterTypes = ((Constructor) accessibleObject).getParameterTypes();
        }
        for (int i8 = 0; i8 < parameterTypes.length; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i8].getSimpleName());
        }
        sb.append(')');
    }

    public static String c(Constructor constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        b(constructor, sb);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RuntimeException d(ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
    }

    public static RuntimeException e(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    public static String f(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String g(AccessibleObject accessibleObject, boolean z8) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + f((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb = new StringBuilder(method.getName());
            b(method, sb);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + c((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (z8 && Character.isLowerCase(str.charAt(0))) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }

    public static Method h(Class cls, Field field) {
        return f38570a.a(cls, field);
    }

    public static Constructor i(Class cls) {
        return f38570a.b(cls);
    }

    public static String[] j(Class cls) {
        return f38570a.c(cls);
    }

    public static boolean k(Class cls) {
        return f38570a.d(cls);
    }

    public static void l(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e8) {
            throw new g("Failed making " + g(accessibleObject, false) + " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.", e8);
        }
    }

    public static String m(Constructor constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e8) {
            return "Failed making constructor '" + c(constructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e8.getMessage();
        }
    }
}
