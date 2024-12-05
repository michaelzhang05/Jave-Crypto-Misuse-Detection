package androidx.compose.animation;

import L5.p;
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
import kotlin.jvm.internal.AbstractC3159y;

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
        AbstractC3159y.i(sizeAnimation, "sizeAnimation");
        AbstractC3159y.i(offsetAnimation, "offsetAnimation");
        AbstractC3159y.i(expand, "expand");
        AbstractC3159y.i(shrink, "shrink");
        AbstractC3159y.i(alignment, "alignment");
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
    public MeasureResult mo156measure3p2s80s(MeasureScope measure, Measurable measurable, long j8) {
        long m5312getZeronOccac;
        AbstractC3159y.i(measure, "$this$measure");
        AbstractC3159y.i(measurable, "measurable");
        Placeable mo4131measureBRTryo0 = measurable.mo4131measureBRTryo0(j8);
        long IntSize = IntSizeKt.IntSize(mo4131measureBRTryo0.getWidth(), mo4131measureBRTryo0.getHeight());
        long m5348unboximpl = this.sizeAnimation.animate(this.sizeTransitionSpec, new ExpandShrinkModifier$measure$currentSize$1(this, IntSize)).getValue().m5348unboximpl();
        long m5311unboximpl = this.offsetAnimation.animate(ExpandShrinkModifier$measure$offsetDelta$1.INSTANCE, new ExpandShrinkModifier$measure$offsetDelta$2(this, IntSize)).getValue().m5311unboximpl();
        Alignment alignment = this.currentAlignment;
        if (alignment != null) {
            m5312getZeronOccac = alignment.mo2608alignKFBX0sM(IntSize, m5348unboximpl, LayoutDirection.Ltr);
        } else {
            m5312getZeronOccac = IntOffset.Companion.m5312getZeronOccac();
        }
        return MeasureScope.CC.q(measure, IntSize.m5344getWidthimpl(m5348unboximpl), IntSize.m5343getHeightimpl(m5348unboximpl), null, new ExpandShrinkModifier$measure$1(mo4131measureBRTryo0, m5312getZeronOccac, m5311unboximpl), 4, null);
    }

    public final void setCurrentAlignment(Alignment alignment) {
        this.currentAlignment = alignment;
    }

    /* renamed from: sizeByState-Uzc_VyU, reason: not valid java name */
    public final long m177sizeByStateUzc_VyU(EnterExitState targetState, long j8) {
        long j9;
        long j10;
        AbstractC3159y.i(targetState, "targetState");
        ChangeSize value = this.expand.getValue();
        if (value != null) {
            j9 = ((IntSize) value.getSize().invoke(IntSize.m5336boximpl(j8))).m5348unboximpl();
        } else {
            j9 = j8;
        }
        ChangeSize value2 = this.shrink.getValue();
        if (value2 != null) {
            j10 = ((IntSize) value2.getSize().invoke(IntSize.m5336boximpl(j8))).m5348unboximpl();
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
    public final long m178targetOffsetByStateoFUgxo0(EnterExitState targetState, long j8) {
        AbstractC3159y.i(targetState, "targetState");
        if (this.currentAlignment == null) {
            return IntOffset.Companion.m5312getZeronOccac();
        }
        if (this.alignment.getValue() == null) {
            return IntOffset.Companion.m5312getZeronOccac();
        }
        if (AbstractC3159y.d(this.currentAlignment, this.alignment.getValue())) {
            return IntOffset.Companion.m5312getZeronOccac();
        }
        int i8 = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    ChangeSize value = this.shrink.getValue();
                    if (value != null) {
                        long m5348unboximpl = ((IntSize) value.getSize().invoke(IntSize.m5336boximpl(j8))).m5348unboximpl();
                        Alignment value2 = this.alignment.getValue();
                        AbstractC3159y.f(value2);
                        Alignment alignment = value2;
                        LayoutDirection layoutDirection = LayoutDirection.Ltr;
                        long mo2608alignKFBX0sM = alignment.mo2608alignKFBX0sM(j8, m5348unboximpl, layoutDirection);
                        Alignment alignment2 = this.currentAlignment;
                        AbstractC3159y.f(alignment2);
                        long mo2608alignKFBX0sM2 = alignment2.mo2608alignKFBX0sM(j8, m5348unboximpl, layoutDirection);
                        return IntOffsetKt.IntOffset(IntOffset.m5302getXimpl(mo2608alignKFBX0sM) - IntOffset.m5302getXimpl(mo2608alignKFBX0sM2), IntOffset.m5303getYimpl(mo2608alignKFBX0sM) - IntOffset.m5303getYimpl(mo2608alignKFBX0sM2));
                    }
                    return IntOffset.Companion.m5312getZeronOccac();
                }
                throw new p();
            }
            return IntOffset.Companion.m5312getZeronOccac();
        }
        return IntOffset.Companion.m5312getZeronOccac();
    }
}
