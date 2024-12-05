package com.getcapacitor;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class x0 {

    /* renamed from: a, reason: collision with root package name */
    private final h f4491a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f4492b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f4493c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4494d;

    /* renamed from: e, reason: collision with root package name */
    private q0 f4495e;

    /* renamed from: f, reason: collision with root package name */
    private v0.b f4496f;

    /* renamed from: g, reason: collision with root package name */
    private u0 f4497g;

    public x0(h hVar, u0 u0Var) {
        this(u0Var.getClass(), hVar);
        i(u0Var);
    }

    private void f(Class cls) {
        for (Method method : this.f4492b.getMethods()) {
            a1 a1Var = (a1) method.getAnnotation(a1.class);
            if (a1Var != null) {
                this.f4493c.put(method.getName(), new b1(method, a1Var));
            }
        }
    }

    public String a() {
        return this.f4494d;
    }

    public u0 b() {
        return this.f4497g;
    }

    public q0 c() {
        return this.f4495e;
    }

    public Collection d() {
        return this.f4493c.values();
    }

    public v0.b e() {
        return this.f4496f;
    }

    public void g(String str, v0 v0Var) {
        if (this.f4497g == null) {
            h();
        }
        b1 b1Var = (b1) this.f4493c.get(str);
        if (b1Var != null) {
            b1Var.a().invoke(this.f4497g, v0Var);
            return;
        }
        throw new f0("No method " + str + " found for plugin " + this.f4492b.getName());
    }

    public u0 h() {
        u0 u0Var = this.f4497g;
        if (u0Var != null) {
            return u0Var;
        }
        try {
            u0 u0Var2 = (u0) this.f4492b.newInstance();
            this.f4497g = u0Var2;
            return i(u0Var2);
        } catch (IllegalAccessException | InstantiationException unused) {
            throw new y0("Unable to load plugin instance. Ensure plugin is publicly accessible");
        }
    }

    public u0 i(u0 u0Var) {
        this.f4497g = u0Var;
        u0Var.setPluginHandle(this);
        this.f4497g.setBridge(this.f4491a);
        this.f4497g.load();
        this.f4497g.initializeActivityLaunchers();
        return this.f4497g;
    }

    public x0(h hVar, Class cls) {
        this(cls, hVar);
        h();
    }

    private x0(Class cls, h hVar) {
        this.f4493c = new HashMap();
        this.f4491a = hVar;
        this.f4492b = cls;
        v0.b bVar = (v0.b) cls.getAnnotation(v0.b.class);
        if (bVar == null) {
            q0 q0Var = (q0) cls.getAnnotation(q0.class);
            if (q0Var == null) {
                throw new e0("No @CapacitorPlugin annotation found for plugin " + cls.getName());
            }
            this.f4494d = !q0Var.name().equals("") ? q0Var.name() : cls.getSimpleName();
            this.f4495e = q0Var;
        } else {
            this.f4494d = !bVar.name().equals("") ? bVar.name() : cls.getSimpleName();
            this.f4496f = bVar;
        }
        f(cls);
    }
}
