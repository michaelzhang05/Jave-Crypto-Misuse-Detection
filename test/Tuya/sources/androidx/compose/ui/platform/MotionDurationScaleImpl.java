package androidx.compose.ui.platform;

import P5.g;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.ui.MotionDurationScale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MotionDurationScaleImpl implements MotionDurationScale {
    private final MutableFloatState scaleFactor$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);

    @Override // androidx.compose.ui.MotionDurationScale, P5.g.b, P5.g
    public <R> R fold(R r8, X5.n nVar) {
        return (R) MotionDurationScale.DefaultImpls.fold(this, r8, nVar);
    }

    @Override // androidx.compose.ui.MotionDurationScale, P5.g.b, P5.g
    public <E extends g.b> E get(g.c cVar) {
        return (E) MotionDurationScale.DefaultImpls.get(this, cVar);
    }

    @Override // androidx.compose.ui.MotionDurationScale, P5.g.b
    public /* synthetic */ g.c getKey() {
        return androidx.compose.ui.c.a(this);
    }

    @Override // androidx.compose.ui.MotionDurationScale
    public float getScaleFactor() {
        return this.scaleFactor$delegate.getFloatValue();
    }

    @Override // androidx.compose.ui.MotionDurationScale, P5.g.b, P5.g
    public P5.g minusKey(g.c cVar) {
        return MotionDurationScale.DefaultImpls.minusKey(this, cVar);
    }

    @Override // androidx.compose.ui.MotionDurationScale, P5.g
    public P5.g plus(P5.g gVar) {
        return MotionDurationScale.DefaultImpls.plus(this, gVar);
    }

    public void setScaleFactor(float f8) {
        this.scaleFactor$delegate.setFloatValue(f8);
    }
}
