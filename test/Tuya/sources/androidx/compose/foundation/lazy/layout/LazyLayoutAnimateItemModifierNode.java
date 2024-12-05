package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import i6.AbstractC2829k;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class LazyLayoutAnimateItemModifierNode extends Modifier.Node {
    public static final Companion Companion = new Companion(null);
    private static final long NotInitialized = IntOffsetKt.IntOffset(Integer.MAX_VALUE, Integer.MAX_VALUE);
    private final MutableState isAnimationInProgress$delegate;
    private FiniteAnimationSpec<IntOffset> placementAnimationSpec;
    private final MutableState placementDelta$delegate;
    private final Animatable<IntOffset, AnimationVector2D> placementDeltaAnimation;
    private long rawOffset;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getNotInitialized-nOcc-ac, reason: not valid java name */
        public final long m746getNotInitializednOccac() {
            return LazyLayoutAnimateItemModifierNode.NotInitialized;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public LazyLayoutAnimateItemModifierNode(FiniteAnimationSpec<IntOffset> placementAnimationSpec) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        AbstractC3159y.i(placementAnimationSpec, "placementAnimationSpec");
        this.placementAnimationSpec = placementAnimationSpec;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isAnimationInProgress$delegate = mutableStateOf$default;
        this.rawOffset = NotInitialized;
        IntOffset.Companion companion = IntOffset.Companion;
        this.placementDeltaAnimation = new Animatable<>(IntOffset.m5293boximpl(companion.m5312getZeronOccac()), VectorConvertersKt.getVectorConverter(companion), null, null, 12, null);
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntOffset.m5293boximpl(companion.m5312getZeronOccac()), null, 2, null);
        this.placementDelta$delegate = mutableStateOf$default2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAnimationInProgress(boolean z8) {
        this.isAnimationInProgress$delegate.setValue(Boolean.valueOf(z8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setPlacementDelta--gyyYBs, reason: not valid java name */
    public final void m741setPlacementDeltagyyYBs(long j8) {
        this.placementDelta$delegate.setValue(IntOffset.m5293boximpl(j8));
    }

    /* renamed from: animatePlacementDelta--gyyYBs, reason: not valid java name */
    public final void m742animatePlacementDeltagyyYBs(long j8) {
        long m743getPlacementDeltanOccac = m743getPlacementDeltanOccac();
        long IntOffset = IntOffsetKt.IntOffset(IntOffset.m5302getXimpl(m743getPlacementDeltanOccac) - IntOffset.m5302getXimpl(j8), IntOffset.m5303getYimpl(m743getPlacementDeltanOccac) - IntOffset.m5303getYimpl(j8));
        m741setPlacementDeltagyyYBs(IntOffset);
        setAnimationInProgress(true);
        AbstractC2829k.d(getCoroutineScope(), null, null, new LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1(this, IntOffset, null), 3, null);
    }

    public final void cancelAnimation() {
        if (isAnimationInProgress()) {
            AbstractC2829k.d(getCoroutineScope(), null, null, new LazyLayoutAnimateItemModifierNode$cancelAnimation$1(this, null), 3, null);
        }
    }

    public final FiniteAnimationSpec<IntOffset> getPlacementAnimationSpec() {
        return this.placementAnimationSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getPlacementDelta-nOcc-ac, reason: not valid java name */
    public final long m743getPlacementDeltanOccac() {
        return ((IntOffset) this.placementDelta$delegate.getValue()).m5311unboximpl();
    }

    /* renamed from: getRawOffset-nOcc-ac, reason: not valid java name */
    public final long m744getRawOffsetnOccac() {
        return this.rawOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isAnimationInProgress() {
        return ((Boolean) this.isAnimationInProgress$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        m741setPlacementDeltagyyYBs(IntOffset.Companion.m5312getZeronOccac());
        setAnimationInProgress(false);
        this.rawOffset = NotInitialized;
    }

    public final void setPlacementAnimationSpec(FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        AbstractC3159y.i(finiteAnimationSpec, "<set-?>");
        this.placementAnimationSpec = finiteAnimationSpec;
    }

    /* renamed from: setRawOffset--gyyYBs, reason: not valid java name */
    public final void m745setRawOffsetgyyYBs(long j8) {
        this.rawOffset = j8;
    }
}
