package androidx.compose.animation;

import L5.p;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SlideModifier extends LayoutModifierWithPassThroughIntrinsics {
    private final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> lazyAnimation;
    private final State<Slide> slideIn;
    private final State<Slide> slideOut;
    private final Function1 transitionSpec;

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

    public SlideModifier(Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> lazyAnimation, State<Slide> slideIn, State<Slide> slideOut) {
        AbstractC3159y.i(lazyAnimation, "lazyAnimation");
        AbstractC3159y.i(slideIn, "slideIn");
        AbstractC3159y.i(slideOut, "slideOut");
        this.lazyAnimation = lazyAnimation;
        this.slideIn = slideIn;
        this.slideOut = slideOut;
        this.transitionSpec = new SlideModifier$transitionSpec$1(this);
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getLazyAnimation() {
        return this.lazyAnimation;
    }

    public final State<Slide> getSlideIn() {
        return this.slideIn;
    }

    public final State<Slide> getSlideOut() {
        return this.slideOut;
    }

    public final Function1 getTransitionSpec() {
        return this.transitionSpec;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo156measure3p2s80s(MeasureScope measure, Measurable measurable, long j8) {
        AbstractC3159y.i(measure, "$this$measure");
        AbstractC3159y.i(measurable, "measurable");
        Placeable mo4131measureBRTryo0 = measurable.mo4131measureBRTryo0(j8);
        return MeasureScope.CC.q(measure, mo4131measureBRTryo0.getWidth(), mo4131measureBRTryo0.getHeight(), null, new SlideModifier$measure$1(this, mo4131measureBRTryo0, IntSizeKt.IntSize(mo4131measureBRTryo0.getWidth(), mo4131measureBRTryo0.getHeight())), 4, null);
    }

    /* renamed from: targetValueByState-oFUgxo0, reason: not valid java name */
    public final long m195targetValueByStateoFUgxo0(EnterExitState targetState, long j8) {
        long m5312getZeronOccac;
        long m5312getZeronOccac2;
        Function1 slideOffset;
        Function1 slideOffset2;
        AbstractC3159y.i(targetState, "targetState");
        Slide value = this.slideIn.getValue();
        if (value != null && (slideOffset2 = value.getSlideOffset()) != null) {
            m5312getZeronOccac = ((IntOffset) slideOffset2.invoke(IntSize.m5336boximpl(j8))).m5311unboximpl();
        } else {
            m5312getZeronOccac = IntOffset.Companion.m5312getZeronOccac();
        }
        Slide value2 = this.slideOut.getValue();
        if (value2 != null && (slideOffset = value2.getSlideOffset()) != null) {
            m5312getZeronOccac2 = ((IntOffset) slideOffset.invoke(IntSize.m5336boximpl(j8))).m5311unboximpl();
        } else {
            m5312getZeronOccac2 = IntOffset.Companion.m5312getZeronOccac();
        }
        int i8 = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    return m5312getZeronOccac2;
                }
                throw new p();
            }
            return m5312getZeronOccac;
        }
        return IntOffset.Companion.m5312getZeronOccac();
    }
}
