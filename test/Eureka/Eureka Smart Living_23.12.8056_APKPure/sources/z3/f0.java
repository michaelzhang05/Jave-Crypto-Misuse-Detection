package z3;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
final class f0 implements e {

    /* renamed from: a, reason: collision with root package name */
    private final Set f9996a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f9997b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f9998c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f9999d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f10000e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f10001f;

    /* renamed from: g, reason: collision with root package name */
    private final e f10002g;

    /* loaded from: classes.dex */
    private static class a implements h4.c {

        /* renamed from: a, reason: collision with root package name */
        private final Set f10003a;

        /* renamed from: b, reason: collision with root package name */
        private final h4.c f10004b;

        public a(Set set, h4.c cVar) {
            this.f10003a = set;
            this.f10004b = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(c cVar, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (r rVar : cVar.g()) {
            if (rVar.d()) {
                boolean f6 = rVar.f();
                e0 b6 = rVar.b();
                if (f6) {
                    hashSet4.add(b6);
                } else {
                    hashSet.add(b6);
                }
            } else if (rVar.c()) {
                hashSet3.add(rVar.b());
            } else {
                boolean f7 = rVar.f();
                e0 b7 = rVar.b();
                if (f7) {
                    hashSet5.add(b7);
                } else {
                    hashSet2.add(b7);
                }
            }
        }
        if (!cVar.k().isEmpty()) {
            hashSet.add(e0.b(h4.c.class));
        }
        this.f9996a = Collections.unmodifiableSet(hashSet);
        this.f9997b = Collections.unmodifiableSet(hashSet2);
        this.f9998c = Collections.unmodifiableSet(hashSet3);
        this.f9999d = Collections.unmodifiableSet(hashSet4);
        this.f10000e = Collections.unmodifiableSet(hashSet5);
        this.f10001f = cVar.k();
        this.f10002g = eVar;
    }

    @Override // z3.e
    public Object a(Class cls) {
        if (!this.f9996a.contains(e0.b(cls))) {
            throw new t(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object a6 = this.f10002g.a(cls);
        return !cls.equals(h4.c.class) ? a6 : new a(this.f10001f, (h4.c) a6);
    }

    @Override // z3.e
    public k4.b b(Class cls) {
        return f(e0.b(cls));
    }

    @Override // z3.e
    public /* synthetic */ Set c(Class cls) {
        return d.d(this, cls);
    }

    @Override // z3.e
    public Set d(e0 e0Var) {
        if (this.f9999d.contains(e0Var)) {
            return this.f10002g.d(e0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Set<%s>.", e0Var));
    }

    @Override // z3.e
    public k4.b e(e0 e0Var) {
        if (this.f10000e.contains(e0Var)) {
            return this.f10002g.e(e0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", e0Var));
    }

    @Override // z3.e
    public k4.b f(e0 e0Var) {
        if (this.f9997b.contains(e0Var)) {
            return this.f10002g.f(e0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<%s>.", e0Var));
    }

    @Override // z3.e
    public Object g(e0 e0Var) {
        if (this.f9996a.contains(e0Var)) {
            return this.f10002g.g(e0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", e0Var));
    }
}
