package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: Hint.java */
/* loaded from: classes2.dex */
public final class n1 {
    private static final Map<String, Class<?>> a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, Object> f19028b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final List<s0> f19029c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private s0 f19030d = null;

    /* renamed from: e, reason: collision with root package name */
    private s0 f19031e = null;

    /* renamed from: f, reason: collision with root package name */
    private s0 f19032f = null;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put("boolean", Boolean.class);
        hashMap.put("char", Character.class);
        hashMap.put("byte", Byte.class);
        hashMap.put("short", Short.class);
        hashMap.put("int", Integer.class);
        hashMap.put("long", Long.class);
        hashMap.put("float", Float.class);
        hashMap.put("double", Double.class);
    }

    private boolean i(Object obj, Class<?> cls) {
        Class<?> cls2 = a.get(cls.getCanonicalName());
        return obj != null && cls.isPrimitive() && cls2 != null && cls2.isInstance(obj);
    }

    public void a(List<s0> list) {
        if (list != null) {
            this.f19029c.addAll(list);
        }
    }

    @ApiStatus.Internal
    public synchronized void b() {
        Iterator<Map.Entry<String, Object>> it = this.f19028b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> next = it.next();
            if (next.getKey() == null || !next.getKey().startsWith("sentry:")) {
                it.remove();
            }
        }
    }

    public synchronized Object c(String str) {
        return this.f19028b.get(str);
    }

    public synchronized <T> T d(String str, Class<T> cls) {
        T t = (T) this.f19028b.get(str);
        if (cls.isInstance(t)) {
            return t;
        }
        if (i(t, cls)) {
            return t;
        }
        return null;
    }

    public List<s0> e() {
        return new ArrayList(this.f19029c);
    }

    public s0 f() {
        return this.f19030d;
    }

    public s0 g() {
        return this.f19032f;
    }

    public s0 h() {
        return this.f19031e;
    }

    public synchronized void j(String str, Object obj) {
        this.f19028b.put(str, obj);
    }

    public void k(s0 s0Var) {
        this.f19030d = s0Var;
    }

    public void l(s0 s0Var) {
        this.f19032f = s0Var;
    }

    public void m(s0 s0Var) {
        this.f19031e = s0Var;
    }
}
