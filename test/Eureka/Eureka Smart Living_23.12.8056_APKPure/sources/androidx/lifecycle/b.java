package androidx.lifecycle;

import androidx.lifecycle.h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class b {

    /* renamed from: c, reason: collision with root package name */
    static b f3054c = new b();

    /* renamed from: a, reason: collision with root package name */
    private final Map f3055a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f3056b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Map f3057a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        final Map f3058b;

        a(Map map) {
            this.f3058b = map;
            for (Map.Entry entry : map.entrySet()) {
                h.a aVar = (h.a) entry.getValue();
                List list = (List) this.f3057a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f3057a.put(aVar, list);
                }
                list.add((C0048b) entry.getKey());
            }
        }

        private static void b(List list, m mVar, h.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0048b) list.get(size)).a(mVar, aVar, obj);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(m mVar, h.a aVar, Object obj) {
            b((List) this.f3057a.get(aVar), mVar, aVar, obj);
            b((List) this.f3057a.get(h.a.ON_ANY), mVar, aVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0048b {

        /* renamed from: a, reason: collision with root package name */
        final int f3059a;

        /* renamed from: b, reason: collision with root package name */
        final Method f3060b;

        C0048b(int i6, Method method) {
            this.f3059a = i6;
            this.f3060b = method;
            method.setAccessible(true);
        }

        void a(m mVar, h.a aVar, Object obj) {
            try {
                int i6 = this.f3059a;
                if (i6 == 0) {
                    this.f3060b.invoke(obj, new Object[0]);
                } else if (i6 == 1) {
                    this.f3060b.invoke(obj, mVar);
                } else {
                    if (i6 != 2) {
                        return;
                    }
                    this.f3060b.invoke(obj, mVar, aVar);
                }
            } catch (IllegalAccessException e6) {
                throw new RuntimeException(e6);
            } catch (InvocationTargetException e7) {
                throw new RuntimeException("Failed to call observer method", e7.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0048b)) {
                return false;
            }
            C0048b c0048b = (C0048b) obj;
            return this.f3059a == c0048b.f3059a && this.f3060b.getName().equals(c0048b.f3060b.getName());
        }

        public int hashCode() {
            return (this.f3059a * 31) + this.f3060b.getName().hashCode();
        }
    }

    b() {
    }

    private a a(Class cls, Method[] methodArr) {
        int i6;
        a c6;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c6 = c(superclass)) != null) {
            hashMap.putAll(c6.f3058b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : c(cls2).f3058b.entrySet()) {
                e(hashMap, (C0048b) entry.getKey(), (h.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z5 = false;
        for (Method method : methodArr) {
            s sVar = (s) method.getAnnotation(s.class);
            if (sVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i6 = 0;
                } else {
                    if (!m.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i6 = 1;
                }
                h.a value = sVar.value();
                if (parameterTypes.length > 1) {
                    if (!h.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != h.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i6 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(hashMap, new C0048b(i6, method), value, cls);
                z5 = true;
            }
        }
        a aVar = new a(hashMap);
        this.f3055a.put(cls, aVar);
        this.f3056b.put(cls, Boolean.valueOf(z5));
        return aVar;
    }

    private Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e6) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e6);
        }
    }

    private void e(Map map, C0048b c0048b, h.a aVar, Class cls) {
        h.a aVar2 = (h.a) map.get(c0048b);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(c0048b, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0048b.f3060b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a c(Class cls) {
        a aVar = (a) this.f3055a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(Class cls) {
        Boolean bool = (Boolean) this.f3056b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b6 = b(cls);
        for (Method method : b6) {
            if (((s) method.getAnnotation(s.class)) != null) {
                a(cls, b6);
                return true;
            }
        }
        this.f3056b.put(cls, Boolean.FALSE);
        return false;
    }
}
