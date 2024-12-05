package androidx.compose.runtime;

import P5.g;
import X5.n;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface MonotonicFrameClock extends g.b {
    public static final Key Key = Key.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static <R> R fold(MonotonicFrameClock monotonicFrameClock, R r8, n nVar) {
            return (R) g.b.a.a(monotonicFrameClock, r8, nVar);
        }

        public static <E extends g.b> E get(MonotonicFrameClock monotonicFrameClock, g.c cVar) {
            return (E) g.b.a.b(monotonicFrameClock, cVar);
        }

        @Deprecated
        public static g.c getKey(MonotonicFrameClock monotonicFrameClock) {
            g.c a8;
            a8 = h.a(monotonicFrameClock);
            return a8;
        }

        public static P5.g minusKey(MonotonicFrameClock monotonicFrameClock, g.c cVar) {
            return g.b.a.c(monotonicFrameClock, cVar);
        }

        public static P5.g plus(MonotonicFrameClock monotonicFrameClock, P5.g gVar) {
            return g.b.a.d(monotonicFrameClock, gVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class Key implements g.c {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    @Override // P5.g.b, P5.g
    /* synthetic */ Object fold(Object obj, n nVar);

    @Override // P5.g.b, P5.g
    /* synthetic */ g.b get(g.c cVar);

    @Override // P5.g.b
    g.c getKey();

    @Override // P5.g.b, P5.g
    /* synthetic */ P5.g minusKey(g.c cVar);

    @Override // P5.g
    /* synthetic */ P5.g plus(P5.g gVar);

    <R> Object withFrameNanos(Function1 function1, P5.d dVar);
}
