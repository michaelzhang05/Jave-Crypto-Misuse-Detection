package androidx.compose.foundation.text;

import P5.g;
import X5.n;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.c;

/* loaded from: classes.dex */
final class FixedMotionDurationScale implements MotionDurationScale {
    public static final FixedMotionDurationScale INSTANCE = new FixedMotionDurationScale();

    private FixedMotionDurationScale() {
    }

    @Override // androidx.compose.ui.MotionDurationScale, P5.g.b, P5.g
    public <R> R fold(R r8, n nVar) {
        return (R) MotionDurationScale.DefaultImpls.fold(this, r8, nVar);
    }

    @Override // androidx.compose.ui.MotionDurationScale, P5.g.b, P5.g
    public <E extends g.b> E get(g.c cVar) {
        return (E) MotionDurationScale.DefaultImpls.get(this, cVar);
    }

    @Override // androidx.compose.ui.MotionDurationScale, P5.g.b
    public /* synthetic */ g.c getKey() {
        return c.a(this);
    }

    @Override // androidx.compose.ui.MotionDurationScale
    public float getScaleFactor() {
        return 1.0f;
    }

    @Override // androidx.compose.ui.MotionDurationScale, P5.g.b, P5.g
    public g minusKey(g.c cVar) {
        return MotionDurationScale.DefaultImpls.minusKey(this, cVar);
    }

    @Override // androidx.compose.ui.MotionDurationScale, P5.g
    public g plus(g gVar) {
        return MotionDurationScale.DefaultImpls.plus(this, gVar);
    }
}
