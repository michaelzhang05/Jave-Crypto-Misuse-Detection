package androidx.compose.ui.platform;

import P5.g;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface InfiniteAnimationPolicy extends g.b {
    public static final Key Key = Key.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static <R> R fold(InfiniteAnimationPolicy infiniteAnimationPolicy, R r8, X5.n nVar) {
            return (R) g.b.a.a(infiniteAnimationPolicy, r8, nVar);
        }

        public static <E extends g.b> E get(InfiniteAnimationPolicy infiniteAnimationPolicy, g.c cVar) {
            return (E) g.b.a.b(infiniteAnimationPolicy, cVar);
        }

        @Deprecated
        public static g.c getKey(InfiniteAnimationPolicy infiniteAnimationPolicy) {
            g.c a8;
            a8 = J.a(infiniteAnimationPolicy);
            return a8;
        }

        public static P5.g minusKey(InfiniteAnimationPolicy infiniteAnimationPolicy, g.c cVar) {
            return g.b.a.c(infiniteAnimationPolicy, cVar);
        }

        public static P5.g plus(InfiniteAnimationPolicy infiniteAnimationPolicy, P5.g gVar) {
            return g.b.a.d(infiniteAnimationPolicy, gVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class Key implements g.c {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    @Override // P5.g.b, P5.g
    /* synthetic */ Object fold(Object obj, X5.n nVar);

    @Override // P5.g.b, P5.g
    /* synthetic */ g.b get(g.c cVar);

    @Override // P5.g.b
    g.c getKey();

    @Override // P5.g.b, P5.g
    /* synthetic */ P5.g minusKey(g.c cVar);

    <R> Object onInfiniteOperation(Function1 function1, P5.d dVar);

    @Override // P5.g
    /* synthetic */ P5.g plus(P5.g gVar);
}
