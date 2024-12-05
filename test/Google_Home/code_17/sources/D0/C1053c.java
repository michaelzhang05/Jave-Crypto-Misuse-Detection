package D0;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: D0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1053c {

    /* renamed from: a, reason: collision with root package name */
    private final String f1714a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f1715b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f1716c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1717d;

    /* renamed from: e, reason: collision with root package name */
    private final int f1718e;

    /* renamed from: f, reason: collision with root package name */
    private final h f1719f;

    /* renamed from: g, reason: collision with root package name */
    private final Set f1720g;

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

    public static C1053c l(final Object obj, Class cls) {
        return m(cls).f(new h() { // from class: D0.a
            @Override // D0.h
            public final Object a(InterfaceC1055e interfaceC1055e) {
                Object q8;
                q8 = C1053c.q(obj, interfaceC1055e);
                return q8;
            }
        }).d();
    }

    public static b m(Class cls) {
        return e(cls).g();
    }

    public static C1053c s(final Object obj, Class cls, Class... clsArr) {
        return f(cls, clsArr).f(new h() { // from class: D0.b
            @Override // D0.h
            public final Object a(InterfaceC1055e interfaceC1055e) {
                Object r8;
                r8 = C1053c.r(obj, interfaceC1055e);
                return r8;
            }
        }).d();
    }

    public Set g() {
        return this.f1716c;
    }

    public h h() {
        return this.f1719f;
    }

    public String i() {
        return this.f1714a;
    }

    public Set j() {
        return this.f1715b;
    }

    public Set k() {
        return this.f1720g;
    }

    public boolean n() {
        if (this.f1717d == 1) {
            return true;
        }
        return false;
    }

    public boolean o() {
        if (this.f1717d == 2) {
            return true;
        }
        return false;
    }

    public boolean p() {
        if (this.f1718e == 0) {
            return true;
        }
        return false;
    }

    public C1053c t(h hVar) {
        return new C1053c(this.f1714a, this.f1715b, this.f1716c, this.f1717d, this.f1718e, hVar, this.f1720g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f1715b.toArray()) + ">{" + this.f1717d + ", type=" + this.f1718e + ", deps=" + Arrays.toString(this.f1716c.toArray()) + "}";
    }

    /* renamed from: D0.c$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f1721a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f1722b;

        /* renamed from: c, reason: collision with root package name */
        private final Set f1723c;

        /* renamed from: d, reason: collision with root package name */
        private int f1724d;

        /* renamed from: e, reason: collision with root package name */
        private int f1725e;

        /* renamed from: f, reason: collision with root package name */
        private h f1726f;

        /* renamed from: g, reason: collision with root package name */
        private final Set f1727g;

        /* JADX INFO: Access modifiers changed from: private */
        public b g() {
            this.f1725e = 1;
            return this;
        }

        private b i(int i8) {
            boolean z8;
            if (this.f1724d == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            E.d(z8, "Instantiation type has already been set.");
            this.f1724d = i8;
            return this;
        }

        private void j(F f8) {
            E.a(!this.f1722b.contains(f8), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b b(r rVar) {
            E.c(rVar, "Null dependency");
            j(rVar.c());
            this.f1723c.add(rVar);
            return this;
        }

        public b c() {
            return i(1);
        }

        public C1053c d() {
            boolean z8;
            if (this.f1726f != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            E.d(z8, "Missing required property: factory.");
            return new C1053c(this.f1721a, new HashSet(this.f1722b), new HashSet(this.f1723c), this.f1724d, this.f1725e, this.f1726f, this.f1727g);
        }

        public b e() {
            return i(2);
        }

        public b f(h hVar) {
            this.f1726f = (h) E.c(hVar, "Null factory");
            return this;
        }

        public b h(String str) {
            this.f1721a = str;
            return this;
        }

        private b(Class cls, Class... clsArr) {
            this.f1721a = null;
            HashSet hashSet = new HashSet();
            this.f1722b = hashSet;
            this.f1723c = new HashSet();
            this.f1724d = 0;
            this.f1725e = 0;
            this.f1727g = new HashSet();
            E.c(cls, "Null interface");
            hashSet.add(F.b(cls));
            for (Class cls2 : clsArr) {
                E.c(cls2, "Null interface");
                this.f1722b.add(F.b(cls2));
            }
        }

        private b(F f8, F... fArr) {
            this.f1721a = null;
            HashSet hashSet = new HashSet();
            this.f1722b = hashSet;
            this.f1723c = new HashSet();
            this.f1724d = 0;
            this.f1725e = 0;
            this.f1727g = new HashSet();
            E.c(f8, "Null interface");
            hashSet.add(f8);
            for (F f9 : fArr) {
                E.c(f9, "Null interface");
            }
            Collections.addAll(this.f1722b, fArr);
        }
    }

    private C1053c(String str, Set set, Set set2, int i8, int i9, h hVar, Set set3) {
        this.f1714a = str;
        this.f1715b = DesugarCollections.unmodifiableSet(set);
        this.f1716c = DesugarCollections.unmodifiableSet(set2);
        this.f1717d = i8;
        this.f1718e = i9;
        this.f1719f = hVar;
        this.f1720g = DesugarCollections.unmodifiableSet(set3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object q(Object obj, InterfaceC1055e interfaceC1055e) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object r(Object obj, InterfaceC1055e interfaceC1055e) {
        return obj;
    }
}
