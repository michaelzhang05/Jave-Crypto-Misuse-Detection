package B0;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: B0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1062c {

    /* renamed from: a, reason: collision with root package name */
    private final String f609a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f610b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f611c;

    /* renamed from: d, reason: collision with root package name */
    private final int f612d;

    /* renamed from: e, reason: collision with root package name */
    private final int f613e;

    /* renamed from: f, reason: collision with root package name */
    private final h f614f;

    /* renamed from: g, reason: collision with root package name */
    private final Set f615g;

    public static b c(F f8) {
        return new b(f8, new F[0]);
    }

    public static b d(F f8, F... fArr) {
        return new b(f8, fArr);
    }

    public static b e(Class cls) {
        return new b(cls, new Class[0]);
    }

    public static b f(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    public static C1062c l(final Object obj, Class cls) {
        return m(cls).f(new h() { // from class: B0.a
            @Override // B0.h
            public final Object a(InterfaceC1064e interfaceC1064e) {
                Object q8;
                q8 = C1062c.q(obj, interfaceC1064e);
                return q8;
            }
        }).d();
    }

    public static b m(Class cls) {
        return e(cls).g();
    }

    public static C1062c s(final Object obj, Class cls, Class... clsArr) {
        return f(cls, clsArr).f(new h() { // from class: B0.b
            @Override // B0.h
            public final Object a(InterfaceC1064e interfaceC1064e) {
                Object r8;
                r8 = C1062c.r(obj, interfaceC1064e);
                return r8;
            }
        }).d();
    }

    public Set g() {
        return this.f611c;
    }

    public h h() {
        return this.f614f;
    }

    public String i() {
        return this.f609a;
    }

    public Set j() {
        return this.f610b;
    }

    public Set k() {
        return this.f615g;
    }

    public boolean n() {
        if (this.f612d == 1) {
            return true;
        }
        return false;
    }

    public boolean o() {
        if (this.f612d == 2) {
            return true;
        }
        return false;
    }

    public boolean p() {
        if (this.f613e == 0) {
            return true;
        }
        return false;
    }

    public C1062c t(h hVar) {
        return new C1062c(this.f609a, this.f610b, this.f611c, this.f612d, this.f613e, hVar, this.f615g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f610b.toArray()) + ">{" + this.f612d + ", type=" + this.f613e + ", deps=" + Arrays.toString(this.f611c.toArray()) + "}";
    }

    /* renamed from: B0.c$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f616a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f617b;

        /* renamed from: c, reason: collision with root package name */
        private final Set f618c;

        /* renamed from: d, reason: collision with root package name */
        private int f619d;

        /* renamed from: e, reason: collision with root package name */
        private int f620e;

        /* renamed from: f, reason: collision with root package name */
        private h f621f;

        /* renamed from: g, reason: collision with root package name */
        private final Set f622g;

        /* JADX INFO: Access modifiers changed from: private */
        public b g() {
            this.f620e = 1;
            return this;
        }

        private b i(int i8) {
            boolean z8;
            if (this.f619d == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            E.d(z8, "Instantiation type has already been set.");
            this.f619d = i8;
            return this;
        }

        private void j(F f8) {
            E.a(!this.f617b.contains(f8), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b b(r rVar) {
            E.c(rVar, "Null dependency");
            j(rVar.c());
            this.f618c.add(rVar);
            return this;
        }

        public b c() {
            return i(1);
        }

        public C1062c d() {
            boolean z8;
            if (this.f621f != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            E.d(z8, "Missing required property: factory.");
            return new C1062c(this.f616a, new HashSet(this.f617b), new HashSet(this.f618c), this.f619d, this.f620e, this.f621f, this.f622g);
        }

        public b e() {
            return i(2);
        }

        public b f(h hVar) {
            this.f621f = (h) E.c(hVar, "Null factory");
            return this;
        }

        public b h(String str) {
            this.f616a = str;
            return this;
        }

        private b(Class cls, Class... clsArr) {
            this.f616a = null;
            HashSet hashSet = new HashSet();
            this.f617b = hashSet;
            this.f618c = new HashSet();
            this.f619d = 0;
            this.f620e = 0;
            this.f622g = new HashSet();
            E.c(cls, "Null interface");
            hashSet.add(F.b(cls));
            for (Class cls2 : clsArr) {
                E.c(cls2, "Null interface");
                this.f617b.add(F.b(cls2));
            }
        }

        private b(F f8, F... fArr) {
            this.f616a = null;
            HashSet hashSet = new HashSet();
            this.f617b = hashSet;
            this.f618c = new HashSet();
            this.f619d = 0;
            this.f620e = 0;
            this.f622g = new HashSet();
            E.c(f8, "Null interface");
            hashSet.add(f8);
            for (F f9 : fArr) {
                E.c(f9, "Null interface");
            }
            Collections.addAll(this.f617b, fArr);
        }
    }

    private C1062c(String str, Set set, Set set2, int i8, int i9, h hVar, Set set3) {
        this.f609a = str;
        this.f610b = DesugarCollections.unmodifiableSet(set);
        this.f611c = DesugarCollections.unmodifiableSet(set2);
        this.f612d = i8;
        this.f613e = i9;
        this.f614f = hVar;
        this.f615g = DesugarCollections.unmodifiableSet(set3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object q(Object obj, InterfaceC1064e interfaceC1064e) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object r(Object obj, InterfaceC1064e interfaceC1064e) {
        return obj;
    }
}
