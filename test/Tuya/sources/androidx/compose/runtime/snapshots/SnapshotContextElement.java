package androidx.compose.runtime.snapshots;

import P5.g;
import X5.n;
import androidx.compose.runtime.ExperimentalComposeApi;

@ExperimentalComposeApi
/* loaded from: classes.dex */
public interface SnapshotContextElement extends g.b {
    public static final Key Key = Key.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static <R> R fold(SnapshotContextElement snapshotContextElement, R r8, n nVar) {
            return (R) g.b.a.a(snapshotContextElement, r8, nVar);
        }

        public static <E extends g.b> E get(SnapshotContextElement snapshotContextElement, g.c cVar) {
            return (E) g.b.a.b(snapshotContextElement, cVar);
        }

        public static g minusKey(SnapshotContextElement snapshotContextElement, g.c cVar) {
            return g.b.a.c(snapshotContextElement, cVar);
        }

        public static g plus(SnapshotContextElement snapshotContextElement, g gVar) {
            return g.b.a.d(snapshotContextElement, gVar);
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
    /* synthetic */ g.c getKey();

    @Override // P5.g.b, P5.g
    /* synthetic */ g minusKey(g.c cVar);

    @Override // P5.g
    /* synthetic */ g plus(g gVar);
}
