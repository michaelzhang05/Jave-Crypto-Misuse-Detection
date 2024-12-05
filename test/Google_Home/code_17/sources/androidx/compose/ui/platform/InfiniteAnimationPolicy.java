package androidx.compose.ui.platform;

import S5.g;
import a6.InterfaceC1668n;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface InfiniteAnimationPolicy extends g.b {
    public static final Key Key = Key.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static <R> R fold(InfiniteAnimationPolicy infiniteAnimationPolicy, R r8, InterfaceC1668n interfaceC1668n) {
            return (R) g.b.a.a(infiniteAnimationPolicy, r8, interfaceC1668n);
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

        public static S5.g minusKey(InfiniteAnimationPolicy infiniteAnimationPolicy, g.c cVar) {
            return g.b.a.c(infiniteAnimationPolicy, cVar);
        }

        public static S5.g plus(InfiniteAnimationPolicy infiniteAnimationPolicy, S5.g gVar) {
            return g.b.a.d(infiniteAnimationPolicy, gVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class Key implements g.c {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    @Override // S5.g.b, S5.g
    /* synthetic */ Object fold(Object obj, InterfaceC1668n interfaceC1668n);

    @Override // S5.g.b, S5.g
    /* synthetic */ g.b get(g.c cVar);

    @Override // S5.g.b
    g.c getKey();

    @Override // S5.g.b, S5.g
    /* synthetic */ S5.g minusKey(g.c cVar);

    <R> Object onInfiniteOperation(Function1 function1, S5.d dVar);

    @Override // S5.g
    /* synthetic */ S5.g plus(S5.g gVar);
}
