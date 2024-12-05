package z3;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f9975a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f9976b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f9977c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9978d;

    /* renamed from: e, reason: collision with root package name */
    private final int f9979e;

    /* renamed from: f, reason: collision with root package name */
    private final h f9980f;

    /* renamed from: g, reason: collision with root package name */
    private final Set f9981g;

    private c(String str, Set set, Set set2, int i6, int i7, h hVar, Set set3) {
        this.f9975a = str;
        this.f9976b = Collections.unmodifiableSet(set);
        this.f9977c = Collections.unmodifiableSet(set2);
        this.f9978d = i6;
        this.f9979e = i7;
        this.f9980f = hVar;
        this.f9981g = Collections.unmodifiableSet(set3);
    }

    public static b c(Class cls) {
        return new b(cls, new Class[0]);
    }

    public static b d(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    public static b e(e0 e0Var) {
        return new b(e0Var, new e0[0]);
    }

    public static b f(e0 e0Var, e0... e0VarArr) {
        return new b(e0Var, e0VarArr);
    }

    public static c l(final Object obj, Class cls) {
        return m(cls).e(new h() { // from class: z3.b
            @Override // z3.h
            public final Object a(e eVar) {
                Object q6;
                q6 = c.q(obj, eVar);
                return q6;
            }
        }).d();
    }

    public static b m(Class cls) {
        return c(cls).f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object q(Object obj, e eVar) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object r(Object obj, e eVar) {
        return obj;
    }

    public static c s(final Object obj, Class cls, Class... clsArr) {
        return d(cls, clsArr).e(new h() { // from class: z3.a
            @Override // z3.h
            public final Object a(e eVar) {
                Object r5;
                r5 = c.r(obj, eVar);
                return r5;
            }
        }).d();
    }

    public Set g() {
        return this.f9977c;
    }

    public h h() {
        return this.f9980f;
    }

    public String i() {
        return this.f9975a;
    }

    public Set j() {
        return this.f9976b;
    }

    public Set k() {
        return this.f9981g;
    }

    public boolean n() {
        return this.f9978d == 1;
    }

    public boolean o() {
        return this.f9978d == 2;
    }

    public boolean p() {
        return this.f9979e == 0;
    }

    public c t(h hVar) {
        return new c(this.f9975a, this.f9976b, this.f9977c, this.f9978d, this.f9979e, hVar, this.f9981g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f9976b.toArray()) + ">{" + this.f9978d + ", type=" + this.f9979e + ", deps=" + Arrays.toString(this.f9977c.toArray()) + "}";
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f9982a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f9983b;

        /* renamed from: c, reason: collision with root package name */
        private final Set f9984c;

        /* renamed from: d, reason: collision with root package name */
        private int f9985d;

        /* renamed from: e, reason: collision with root package name */
        private int f9986e;

        /* renamed from: f, reason: collision with root package name */
        private h f9987f;

        /* renamed from: g, reason: collision with root package name */
        private final Set f9988g;

        private b(Class cls, Class... clsArr) {
            this.f9982a = null;
            HashSet hashSet = new HashSet();
            this.f9983b = hashSet;
            this.f9984c = new HashSet();
            this.f9985d = 0;
            this.f9986e = 0;
            this.f9988g = new HashSet();
            d0.c(cls, "Null interface");
            hashSet.add(e0.b(cls));
            for (Class cls2 : clsArr) {
                d0.c(cls2, "Null interface");
                this.f9983b.add(e0.b(cls2));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b f() {
            this.f9986e = 1;
            return this;
        }

        private b h(int i6) {
            d0.d(this.f9985d == 0, "Instantiation type has already been set.");
            this.f9985d = i6;
            return this;
        }

        private void i(e0 e0Var) {
            d0.a(!this.f9983b.contains(e0Var), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b b(r rVar) {
            d0.c(rVar, "Null dependency");
            i(rVar.b());
            this.f9984c.add(rVar);
            return this;
        }

        public b c() {
            return h(1);
        }

        public c d() {
            d0.d(this.f9987f != null, "Missing required property: factory.");
            return new c(this.f9982a, new HashSet(this.f9983b), new HashSet(this.f9984c), this.f9985d, this.f9986e, this.f9987f, this.f9988g);
        }

        public b e(h hVar) {
            this.f9987f = (h) d0.c(hVar, "Null factory");
            return this;
        }

        public b g(String str) {
            this.f9982a = str;
            return this;
        }

        private b(e0 e0Var, e0... e0VarArr) {
            this.f9982a = null;
            HashSet hashSet = new HashSet();
            this.f9983b = hashSet;
            this.f9984c = new HashSet();
            this.f9985d = 0;
            this.f9986e = 0;
            this.f9988g = new HashSet();
            d0.c(e0Var, "Null interface");
            hashSet.add(e0Var);
            for (e0 e0Var2 : e0VarArr) {
                d0.c(e0Var2, "Null interface");
            }
            Collections.addAll(this.f9983b, e0VarArr);
        }
    }
}
