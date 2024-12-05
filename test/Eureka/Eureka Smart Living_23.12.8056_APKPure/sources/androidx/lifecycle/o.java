package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f3107a = new o();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f3108b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final Map f3109c = new HashMap();

    private o() {
    }

    private final f a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(obj);
            f5.h.d(newInstance, "{\n            constructo…tance(`object`)\n        }");
            androidx.appcompat.app.f0.a(newInstance);
            return null;
        } catch (IllegalAccessException e6) {
            throw new RuntimeException(e6);
        } catch (InstantiationException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Constructor b(Class cls) {
        try {
            Package r02 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r02 != null ? r02.getName() : "";
            f5.h.d(name, "fullPackage");
            if (!(name.length() == 0)) {
                f5.h.d(canonicalName, "name");
                canonicalName = canonicalName.substring(name.length() + 1);
                f5.h.d(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            f5.h.d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String c6 = c(canonicalName);
            if (!(name.length() == 0)) {
                c6 = name + '.' + c6;
            }
            Class<?> cls2 = Class.forName(c6);
            f5.h.c(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException(e6);
        }
    }

    public static final String c(String str) {
        String c6;
        f5.h.e(str, "className");
        StringBuilder sb = new StringBuilder();
        c6 = i5.l.c(str, ".", "_", false, 4, null);
        sb.append(c6);
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }

    private final int d(Class cls) {
        Map map = f3108b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g6 = g(cls);
        map.put(cls, Integer.valueOf(g6));
        return g6;
    }

    private final boolean e(Class cls) {
        return cls != null && l.class.isAssignableFrom(cls);
    }

    public static final k f(Object obj) {
        f5.h.e(obj, "object");
        boolean z5 = obj instanceof k;
        boolean z6 = obj instanceof d;
        if (z5 && z6) {
            return new DefaultLifecycleObserverAdapter((d) obj, (k) obj);
        }
        if (z6) {
            return new DefaultLifecycleObserverAdapter((d) obj, null);
        }
        if (z5) {
            return (k) obj;
        }
        Class<?> cls = obj.getClass();
        o oVar = f3107a;
        if (oVar.d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        Object obj2 = f3109c.get(cls);
        f5.h.b(obj2);
        List list = (List) obj2;
        if (list.size() == 1) {
            oVar.a((Constructor) list.get(0), obj);
            return new SingleGeneratedAdapterObserver(null);
        }
        int size = list.size();
        f[] fVarArr = new f[size];
        for (int i6 = 0; i6 < size; i6++) {
            f3107a.a((Constructor) list.get(i6), obj);
            fVarArr[i6] = null;
        }
        return new CompositeGeneratedAdaptersObserver(fVarArr);
    }

    private final int g(Class cls) {
        ArrayList arrayList;
        List b6;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor b7 = b(cls);
        if (b7 != null) {
            Map map = f3109c;
            b6 = a5.m.b(b7);
            map.put(cls, b6);
            return 2;
        }
        if (b.f3054c.d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (e(superclass)) {
            f5.h.d(superclass, "superclass");
            if (d(superclass) == 1) {
                return 1;
            }
            Object obj = f3109c.get(superclass);
            f5.h.b(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        f5.h.d(interfaces, "klass.interfaces");
        for (Class<?> cls2 : interfaces) {
            if (e(cls2)) {
                f5.h.d(cls2, "intrface");
                if (d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = f3109c.get(cls2);
                f5.h.b(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f3109c.put(cls, arrayList);
        return 2;
    }
}
