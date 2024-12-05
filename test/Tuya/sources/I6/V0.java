package i6;

import P5.g;

/* loaded from: classes5.dex */
public interface V0 extends g.b {

    /* loaded from: classes5.dex */
    public static final class a {
        public static Object a(V0 v02, Object obj, X5.n nVar) {
            return g.b.a.a(v02, obj, nVar);
        }

        public static P5.g b(V0 v02, P5.g gVar) {
            return g.b.a.d(v02, gVar);
        }
    }

    void restoreThreadContext(P5.g gVar, Object obj);

    Object updateThreadContext(P5.g gVar);
}
