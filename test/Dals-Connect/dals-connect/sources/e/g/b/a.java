package e.g.b;

import e.g.b.e;
import rx.e;

/* compiled from: BehaviorRelay.java */
/* loaded from: classes.dex */
public class a<T> extends d<T, T> {

    /* renamed from: g, reason: collision with root package name */
    private static final Object[] f17720g = new Object[0];

    /* renamed from: h, reason: collision with root package name */
    private final e<T> f17721h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BehaviorRelay.java */
    /* renamed from: e.g.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0229a implements rx.m.b<e.b<T>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e f17722f;

        C0229a(e eVar) {
            this.f17722f = eVar;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(e.b<T> bVar) {
            bVar.b(this.f17722f.d());
        }
    }

    protected a(e.a<T> aVar, e<T> eVar) {
        super(aVar);
        this.f17721h = eVar;
    }

    public static <T> a<T> f1() {
        return g1(null, false);
    }

    private static <T> a<T> g1(T t, boolean z) {
        e eVar = new e();
        if (z) {
            eVar.h(b.b(t));
        }
        eVar.f17727i = new C0229a(eVar);
        return new a<>(eVar, eVar);
    }

    @Override // rx.m.b
    public void call(T t) {
        if (this.f17721h.d() == null || this.f17721h.f17725g) {
            Object b2 = b.b(t);
            for (e.b<T> bVar : this.f17721h.e(b2)) {
                bVar.d(b2);
            }
        }
    }
}
