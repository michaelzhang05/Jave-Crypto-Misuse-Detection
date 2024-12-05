package androidx.compose.animation;

import O5.p;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ExpandShrinkModifier extends LayoutModifierWithPassThroughIntrinsics {
    private final State<Alignment> alignment;
    private Alignment currentAlignment;
    private final State<ChangeSize> expand;
    private final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation;
    private final State<ChangeSize> shrink;
    private final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
    private final Function1 sizeTransitionSpec;

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            try {
                iArr[EnterExitState.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnterExitState.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnterExitState.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExpandShrinkModifier(Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation, Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation, State<ChangeSize> expand, State<ChangeSize> shrink, State<? extends Alignment> alignment) {
        AbstractC3255y.i(sizeAnimation, "sizeAnimation");
        AbstractC3255y.i(offsetAnimation, "offsetAnimation");
        AbstractC3255y.i(expand, "expand");
        AbstractC3255y.i(shrink, "shrink");
        AbstractC3255y.i(alignment, "alignment");
        this.sizeAnimation = sizeAnimation;
        this.offsetAnimation = offsetAnimation;
        this.expand = expand;
        this.shrink = shrink;
        this.alignment = alignment;
        this.sizeTransitionSpec = new ExpandShrinkModifier$sizeTransitionSpec$1(this);
    }

    public final State<Alignment> getAlignment() {
        return this.alignment;
    }

    public final Alignment getCurrentAlignment() {
        return this.currentAlignment;
    }

    public final State<ChangeSize> getExpand() {
        return this.expand;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getOffsetAnimation() {
        return this.offsetAnimation;
    }

    public final State<ChangeSize> getShrink() {
        return this.shrink;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
        return this.sizeAnimation;
    }

    public final Function1 getSizeTransitionSpec() {
        return this.sizeTransitionSpec;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo161measure3p2s80s(MeasureScope measure, Measurable measurable, long j8) {
        long m5317getZeronOccac;
        AbstractC3255y.i(measure, "$this$measure");
        AbstractC3255y.i(measurable, "measurable");
        Placeable mo4136measureBRTryo0 = measurable.mo4136measureBRTryo0(j8);
        long IntSize = IntSizeKt.IntSize(mo4136measureBRTryo0.getWidth(), mo4136measureBRTryo0.getHeight());
        long m5353unboximpl = this.sizeAnimation.animate(this.sizeTransitionSpec, new ExpandShrinkModifier$measure$currentSize$1(this, IntSize)).getValue().m5353unboximpl();
        long m5316unboximpl = this.offsetAnimation.animate(ExpandShrinkModifier$measure$offsetDelta$1.INSTANCE, new ExpandShrinkModifier$measure$offsetDelta$2(this, IntSize)).getValue().m5316unboximpl();
        Alignment alignment = this.currentAlignment;
        if (alignment != null) {
            m5317getZeronOccac = alignment.mo2613alignKFBX0sM(IntSize, m5353unboximpl, LayoutDirection.Ltr);
        } else {
            m5317getZeronOccac = IntOffset.Companion.m5317getZeronOccac();
        }
        return MeasureScope.CC.q(measure, IntSize.m5349getWidthimpl(m5353unboximpl), IntSize.m5348getHeightimpl(m5353unboximpl), null, new ExpandShrinkModifier$measure$1(mo4136measureBRTryo0, m5317getZeronOccac, m5316unboximpl), 4, null);
    }

    public final void setCurrentAlignment(Alignment alignment) {
        this.currentAlignment = alignment;
    }

    /* renamed from: sizeByState-Uzc_VyU, reason: not valid java name */
    public final long m182sizeByStateUzc_VyU(EnterExitState targetState, long j8) {
        long j9;
        long j10;
        AbstractC3255y.i(targetState, "targetState");
        ChangeSize value = this.expand.getValue();
        if (value != null) {
            j9 = ((IntSize) value.getSize().invoke(IntSize.m5341boximpl(j8))).m5353unboximpl();
        } else {
            j9 = j8;
        }
        ChangeSize value2 = this.shrink.getValue();
        if (value2 != null) {
            j10 = ((IntSize) value2.getSize().invoke(IntSize.m5341boximpl(j8))).m5353unboximpl();
        } else {
            j10 = j8;
        }
        int i8 = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    return j10;
                }
                throw new p();
            }
            return j9;
        }
        return j8;
    }

    /* renamed from: targetOffsetByState-oFUgxo0, reason: not valid java name */
    public final long m183targetOffsetByStateoFUgxo0(EnterExitState targetState, long j8) {
        AbstractC3255y.i(targetState, "targetState");
        if (this.currentAlignment == null) {
            return IntOffset.Companion.m5317getZeronOccac();
        }
        if (this.alignment.getValue() == null) {
            return IntOffset.Companion.m5317getZeronOccac();
        }
        if (AbstractC3255y.d(this.currentAlignment, this.alignment.getValue())) {
            return IntOffset.Companion.m5317getZeronOccac();
        }
        int i8 = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    ChangeSize value = this.shrink.getValue();
                    if (value != null) {
                        long m5353unboximpl = ((IntSize) value.getSize().invoke(IntSize.m5341boximpl(j8))).m5353unboximpl();
                        Alignment value2 = this.alignment.getValue();
                        AbstractC3255y.f(value2);
                        Alignment alignment = value2;
                        LayoutDirection layoutDirection = LayoutDirection.Ltr;
                        long mo2613alignKFBX0sM = alignment.mo2613alignKFBX0sM(j8, m5353unboximpl, layoutDirection);
                        Alignment alignment2 = this.currentAlignment;
                        AbstractC3255y.f(alignment2);
                        long mo2613alignKFBX0sM2 = alignment2.mo2613alignKFBX0sM(j8, m5353unboximpl, layoutDirection);
                        return IntOffsetKt.IntOffset(IntOffset.m5307getXimpl(mo2613alignKFBX0sM) - IntOffset.m5307getXimpl(mo2613alignKFBX0sM2), IntOffset.m5308getYimpl(mo2613alignKFBX0sM) - IntOffset.m5308getYimpl(mo2613alignKFBX0sM2));
                    }
                    return IntOffset.Companion.m5317getZeronOccac();
                }
                throw new p();
            }
            return IntOffset.Companion.m5317getZeronOccac();
        }
        return IntOffset.Companion.m5317getZeronOccac();
    }
}
