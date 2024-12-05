package S5;

import S5.g;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public interface e extends g.b {

    /* renamed from: a0, reason: collision with root package name */
    public static final b f9822a0 = b.f9823a;

    /* loaded from: classes5.dex */
    public static final class a {
        public static g.b a(e eVar, g.c key) {
            AbstractC3255y.i(key, "key");
            if (key instanceof S5.b) {
                S5.b bVar = (S5.b) key;
                if (!bVar.a(eVar.getKey())) {
                    return null;
                }
                g.b b8 = bVar.b(eVar);
                if (!(b8 instanceof g.b)) {
                    return null;
                }
                return b8;
            }
            if (e.f9822a0 != key) {
                return null;
            }
            AbstractC3255y.g(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
            return eVar;
        }

        public static g b(e eVar, g.c key) {
            AbstractC3255y.i(key, "key");
            if (key instanceof S5.b) {
                S5.b bVar = (S5.b) key;
                if (bVar.a(eVar.getKey()) && bVar.b(eVar) != null) {
                    return h.f9825a;
                }
                return eVar;
            }
            if (e.f9822a0 == key) {
                return h.f9825a;
            }
            return eVar;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements g.c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f9823a = new b();

        private b() {
        }
    }

    d interceptContinuation(d dVar);

    void releaseInterceptedContinuation(d dVar);
}
