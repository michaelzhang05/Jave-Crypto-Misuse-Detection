package rx.s;

import java.util.ArrayList;
import rx.e;
import rx.n.a.h;
import rx.s.e;

/* compiled from: BehaviorSubject.java */
/* loaded from: classes.dex */
public final class a<T> extends d<T, T> {

    /* renamed from: g, reason: collision with root package name */
    private static final Object[] f23227g = new Object[0];

    /* renamed from: h, reason: collision with root package name */
    private final e<T> f23228h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BehaviorSubject.java */
    /* renamed from: rx.s.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0427a implements rx.m.b<e.c<T>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e f23229f;

        C0427a(e eVar) {
            this.f23229f = eVar;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(e.c<T> cVar) {
            cVar.b(this.f23229f.d());
        }
    }

    protected a(e.a<T> aVar, e<T> eVar) {
        super(aVar);
        this.f23228h = eVar;
    }

    public static <T> a<T> g1() {
        return h1(null, false);
    }

    private static <T> a<T> h1(T t, boolean z) {
        e eVar = new e();
        if (z) {
            eVar.g(h.g(t));
        }
        C0427a c0427a = new C0427a(eVar);
        eVar.f23243i = c0427a;
        eVar.f23244j = c0427a;
        return new a<>(eVar, eVar);
    }

    @Override // rx.f
    public void onCompleted() {
        if (this.f23228h.d() == null || this.f23228h.f23241g) {
            Object b2 = h.b();
            for (e.c<T> cVar : this.f23228h.h(b2)) {
                cVar.d(b2);
            }
        }
    }

    @Override // rx.f
    public void onError(Throwable th) {
        if (this.f23228h.d() == null || this.f23228h.f23241g) {
            Object c2 = h.c(th);
            ArrayList arrayList = null;
            for (e.c<T> cVar : this.f23228h.h(c2)) {
                try {
                    cVar.d(c2);
                } catch (Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
            rx.exceptions.a.d(arrayList);
        }
    }

    @Override // rx.f
    public void onNext(T t) {
        if (this.f23228h.d() == null || this.f23228h.f23241g) {
            Object g2 = h.g(t);
            for (e.c<T> cVar : this.f23228h.e(g2)) {
                cVar.d(g2);
            }
        }
    }
}
