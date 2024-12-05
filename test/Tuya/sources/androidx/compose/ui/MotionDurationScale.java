package androidx.compose.ui;

import P5.g;
import X5.n;
import androidx.compose.runtime.Stable;

@Stable
/* loaded from: classes.dex */
public interface MotionDurationScale extends g.b {
    public static final Key Key = Key.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static <R> R fold(MotionDurationScale motionDurationScale, R r8, n nVar) {
            return (R) g.b.a.a(motionDurationScale, r8, nVar);
        }

        public static <E extends g.b> E get(MotionDurationScale motionDurationScale, g.c cVar) {
            return (E) g.b.a.b(motionDurationScale, cVar);
        }

        public static g minusKey(MotionDurationScale motionDurationScale, g.c cVar) {
            return g.b.a.c(motionDurationScale, cVar);
        }

        public static g plus(MotionDurationScale motionDurationScale, g gVar) {
            return g.b.a.d(motionDurationScale, gVar);
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

    float getScaleFactor();

    @Override // P5.g.b, P5.g
    /* synthetic */ g minusKey(g.c cVar);

    @Override // P5.g
    /* synthetic */ g plus(g gVar);
}
