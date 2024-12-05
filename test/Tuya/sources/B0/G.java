package B0;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
final class G implements InterfaceC1064e {

    /* renamed from: a, reason: collision with root package name */
    private final Set f598a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f599b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f600c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f601d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f602e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f603f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC1064e f604g;

    /* loaded from: classes3.dex */
    private static class a implements W0.c {

        /* renamed from: a, reason: collision with root package name */
        private final Set f605a;

        /* renamed from: b, reason: collision with root package name */
        private final W0.c f606b;

        public a(Set set, W0.c cVar) {
            this.f605a = set;
            this.f606b = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public G(C1062c c1062c, InterfaceC1064e interfaceC1064e) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (r rVar : c1062c.g()) {
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
        if (!c1062c.k().isEmpty()) {
            hashSet.add(F.b(W0.c.class));
        }
        this.f598a = DesugarCollections.unmodifiableSet(hashSet);
        this.f599b = DesugarCollections.unmodifiableSet(hashSet2);
        this.f600c = DesugarCollections.unmodifiableSet(hashSet3);
        this.f601d = DesugarCollections.unmodifiableSet(hashSet4);
        this.f602e = DesugarCollections.unmodifiableSet(hashSet5);
        this.f603f = c1062c.k();
        this.f604g = interfaceC1064e;
    }

    @Override // B0.InterfaceC1064e
    public Object a(Class cls) {
        if (this.f598a.contains(F.b(cls))) {
            Object a8 = this.f604g.a(cls);
            if (!cls.equals(W0.c.class)) {
                return a8;
            }
            return new a(this.f603f, (W0.c) a8);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // B0.InterfaceC1064e
    public Z0.a b(F f8) {
        if (this.f600c.contains(f8)) {
            return this.f604g.b(f8);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Deferred<%s>.", f8));
    }

    @Override // B0.InterfaceC1064e
    public Set c(F f8) {
        if (this.f601d.contains(f8)) {
            return this.f604g.c(f8);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Set<%s>.", f8));
    }

    @Override // B0.InterfaceC1064e
    public Z0.b d(Class cls) {
        return e(F.b(cls));
    }

    @Override // B0.InterfaceC1064e
    public Z0.b e(F f8) {
        if (this.f599b.contains(f8)) {
            return this.f604g.e(f8);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<%s>.", f8));
    }

    @Override // B0.InterfaceC1064e
    public Object f(F f8) {
        if (this.f598a.contains(f8)) {
            return this.f604g.f(f8);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", f8));
    }

    @Override // B0.InterfaceC1064e
    public /* synthetic */ Set g(Class cls) {
        return AbstractC1063d.f(this, cls);
    }

    @Override // B0.InterfaceC1064e
    public Z0.b h(F f8) {
        if (this.f602e.contains(f8)) {
            return this.f604g.h(f8);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", f8));
    }

    @Override // B0.InterfaceC1064e
    public Z0.a i(Class cls) {
        return b(F.b(cls));
    }
}
