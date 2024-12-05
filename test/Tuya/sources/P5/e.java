package P5;

import P5.g;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public interface e extends g.b {

    /* renamed from: a0, reason: collision with root package name */
    public static final b f7991a0 = b.f7992a;

    /* loaded from: classes5.dex */
    public static final class a {
        public static g.b a(e eVar, g.c key) {
            AbstractC3159y.i(key, "key");
            if (key instanceof P5.b) {
                P5.b bVar = (P5.b) key;
                if (!bVar.a(eVar.getKey())) {
                    return null;
                }
                g.b b8 = bVar.b(eVar);
                if (!(b8 instanceof g.b)) {
                    return null;
                }
                return b8;
            }
            if (e.f7991a0 != key) {
                return null;
            }
            AbstractC3159y.g(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
            return eVar;
        }

        public static g b(e eVar, g.c key) {
            AbstractC3159y.i(key, "key");
            if (key instanceof P5.b) {
                P5.b bVar = (P5.b) key;
                if (bVar.a(eVar.getKey()) && bVar.b(eVar) != null) {
                    return h.f7994a;
                }
                return eVar;
            }
            if (e.f7991a0 == key) {
                return h.f7994a;
            }
            return eVar;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements g.c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f7992a = new b();

        private b() {
        }
    }

    d interceptContinuation(d dVar);

    void releaseInterceptedContinuation(d dVar);
}
