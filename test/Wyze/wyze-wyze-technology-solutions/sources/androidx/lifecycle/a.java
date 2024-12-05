package androidx.lifecycle;

import androidx.lifecycle.f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ClassesInfoCache.java */
/* loaded from: classes.dex */
class a {
    static a a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, C0025a> f1252b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, Boolean> f1253c = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClassesInfoCache.java */
    /* renamed from: androidx.lifecycle.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0025a {
        final Map<f.a, List<b>> a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        final Map<b, f.a> f1254b;

        C0025a(Map<b, f.a> map) {
            this.f1254b = map;
            for (Map.Entry<b, f.a> entry : map.entrySet()) {
                f.a value = entry.getValue();
                List<b> list = this.a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        private static void b(List<b> list, j jVar, f.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(jVar, aVar, obj);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(j jVar, f.a aVar, Object obj) {
            b(this.a.get(aVar), jVar, aVar, obj);
            b(this.a.get(f.a.ON_ANY), jVar, aVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClassesInfoCache.java */
    /* loaded from: classes.dex */
    public static class b {
        final int a;

        /* renamed from: b, reason: collision with root package name */
        final Method f1255b;

        b(int i2, Method method) {
            this.a = i2;
            this.f1255b = method;
            method.setAccessible(true);
        }

        void a(j jVar, f.a aVar, Object obj) {
            try {
                int i2 = this.a;
                if (i2 == 0) {
                    this.f1255b.invoke(obj, new Object[0]);
                } else if (i2 == 1) {
                    this.f1255b.invoke(obj, jVar);
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    this.f1255b.invoke(obj, jVar, aVar);
                }
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("Failed to call observer method", e3.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.f1255b.getName().equals(bVar.f1255b.getName());
        }

        public int hashCode() {
            return (this.a * 31) + this.f1255b.getName().hashCode();
        }
    }

    a() {
    }

    private C0025a a(Class<?> cls, Method[] methodArr) {
        int i2;
        C0025a c2;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c2 = c(superclass)) != null) {
            hashMap.putAll(c2.f1254b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, f.a> entry : c(cls2).f1254b.entrySet()) {
                e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            r rVar = (r) method.getAnnotation(r.class);
            if (rVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(j.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i2 = 1;
                }
                f.a value = rVar.value();
                if (parameterTypes.length > 1) {
                    if (parameterTypes[1].isAssignableFrom(f.a.class)) {
                        if (value != f.a.ON_ANY) {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                        i2 = 2;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    e(hashMap, new b(i2, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0025a c0025a = new C0025a(hashMap);
        this.f1252b.put(cls, c0025a);
        this.f1253c.put(cls, Boolean.valueOf(z));
        return c0025a;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e2) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
        }
    }

    private void e(Map<b, f.a> map, b bVar, f.a aVar, Class<?> cls) {
        f.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f1255b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0025a c(Class<?> cls) {
        C0025a c0025a = this.f1252b.get(cls);
        return c0025a != null ? c0025a : a(cls, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(Class<?> cls) {
        Boolean bool = this.f1253c.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b2 = b(cls);
        for (Method method : b2) {
            if (((r) method.getAnnotation(r.class)) != null) {
                a(cls, b2);
                return true;
            }
        }
        this.f1253c.put(cls, Boolean.FALSE);
        return false;
    }
}
