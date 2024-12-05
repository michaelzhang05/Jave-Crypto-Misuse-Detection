package D0;

import b1.InterfaceC1955a;
import b1.InterfaceC1956b;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class G implements InterfaceC1055e {

    /* renamed from: a, reason: collision with root package name */
    private final Set f1703a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f1704b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f1705c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f1706d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f1707e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f1708f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC1055e f1709g;

    /* loaded from: classes3.dex */
    private static class a implements Y0.c {

        /* renamed from: a, reason: collision with root package name */
        private final Set f1710a;

        /* renamed from: b, reason: collision with root package name */
        private final Y0.c f1711b;

        public a(Set set, Y0.c cVar) {
            this.f1710a = set;
            this.f1711b = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public G(C1053c c1053c, InterfaceC1055e interfaceC1055e) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (r rVar : c1053c.g()) {
            if (rVar.e()) {
                if (rVar.g()) {
                    hashSet4.add(rVar.c());
                } else {
                    hashSet.add(rVar.c());
                }
            } else if (rVar.d()) {
                hashSet3.add(rVar.c());
            } else if (rVar.g()) {
                hashSet5.add(rVar.c());
            } else {
                hashSet2.add(rVar.c());
            }
        }
        if (!c1053c.k().isEmpty()) {
            hashSet.add(F.b(Y0.c.class));
        }
        this.f1703a = DesugarCollections.unmodifiableSet(hashSet);
        this.f1704b = DesugarCollections.unmodifiableSet(hashSet2);
        this.f1705c = DesugarCollections.unmodifiableSet(hashSet3);
        this.f1706d = DesugarCollections.unmodifiableSet(hashSet4);
        this.f1707e = DesugarCollections.unmodifiableSet(hashSet5);
        this.f1708f = c1053c.k();
        this.f1709g = interfaceC1055e;
    }

    @Override // D0.InterfaceC1055e
    public Object a(Class cls) {
        if (this.f1703a.contains(F.b(cls))) {
            Object a8 = this.f1709g.a(cls);
            if (!cls.equals(Y0.c.class)) {
                return a8;
            }
            return new a(this.f1708f, (Y0.c) a8);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // D0.InterfaceC1055e
    public Object b(F f8) {
        if (this.f1703a.contains(f8)) {
            return this.f1709g.b(f8);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", f8));
    }

    @Override // D0.InterfaceC1055e
    public InterfaceC1956b c(Class cls) {
        return f(F.b(cls));
    }

    @Override // D0.InterfaceC1055e
    public InterfaceC1955a d(F f8) {
        if (this.f1705c.contains(f8)) {
            return this.f1709g.d(f8);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Deferred<%s>.", f8));
    }

    @Override // D0.InterfaceC1055e
    public /* synthetic */ Set e(Class cls) {
        return AbstractC1054d.f(this, cls);
    }

    @Override // D0.InterfaceC1055e
    public InterfaceC1956b f(F f8) {
        if (this.f1704b.contains(f8)) {
            return this.f1709g.f(f8);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<%s>.", f8));
    }

    @Override // D0.InterfaceC1055e
    public InterfaceC1956b g(F f8) {
        if (this.f1707e.contains(f8)) {
            return this.f1709g.g(f8);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", f8));
    }

    @Override // D0.InterfaceC1055e
    public Set h(F f8) {
        if (this.f1706d.contains(f8)) {
            return this.f1709g.h(f8);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Set<%s>.", f8));
    }

    @Override // D0.InterfaceC1055e
    public InterfaceC1955a i(Class cls) {
        return d(F.b(cls));
    }
}
