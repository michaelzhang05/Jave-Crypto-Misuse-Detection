package androidx.compose.animation;

import X5.n;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import i6.AbstractC2829k;
import i6.M;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
final class SizeAnimationModifier extends LayoutModifierWithPassThroughIntrinsics {
    private final MutableState animData$delegate;
    private final AnimationSpec<IntSize> animSpec;
    private n listener;
    private final M scope;

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class AnimData {
        public static final int $stable = 8;
        private final Animatable<IntSize, AnimationVector2D> anim;
        private long startSize;

        public /* synthetic */ AnimData(Animatable animatable, long j8, AbstractC3151p abstractC3151p) {
            this(animatable, j8);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: copy-O0kMr_c$default, reason: not valid java name */
        public static /* synthetic */ AnimData m189copyO0kMr_c$default(AnimData animData, Animatable animatable, long j8, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                animatable = animData.anim;
            }
            if ((i8 & 2) != 0) {
                j8 = animData.startSize;
            }
            return animData.m191copyO0kMr_c(animatable, j8);
        }

        public final Animatable<IntSize, AnimationVector2D> component1() {
            return this.anim;
        }

        /* renamed from: component2-YbymL2g, reason: not valid java name */
        public final long m190component2YbymL2g() {
            return this.startSize;
        }

        /* renamed from: copy-O0kMr_c, reason: not valid java name */
        public final AnimData m191copyO0kMr_c(Animatable<IntSize, AnimationVector2D> anim, long j8) {
            AbstractC3159y.i(anim, "anim");
            return new AnimData(anim, j8, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnimData)) {
                return false;
            }
            AnimData animData = (AnimData) obj;
            return AbstractC3159y.d(this.anim, animData.anim) && IntSize.m5342equalsimpl0(this.startSize, animData.startSize);
        }

        public final Animatable<IntSize, AnimationVector2D> getAnim() {
            return this.anim;
        }

        /* renamed from: getStartSize-YbymL2g, reason: not valid java name */
        public final long m192getStartSizeYbymL2g() {
            return this.startSize;
        }

        public int hashCode() {
            return (this.anim.hashCode() * 31) + IntSize.m5345hashCodeimpl(this.startSize);
        }

        /* renamed from: setStartSize-ozmzZPI, reason: not valid java name */
        public final void m193setStartSizeozmzZPI(long j8) {
            this.startSize = j8;
        }

        public String toString() {
            return "AnimData(anim=" + this.anim + ", startSize=" + ((Object) IntSize.m5347toStringimpl(this.startSize)) + ')';
        }

        private AnimData(Animatable<IntSize, AnimationVector2D> anim, long j8) {
            AbstractC3159y.i(anim, "anim");
            this.anim = anim;
            this.startSize = j8;
        }
    }

    public SizeAnimationModifier(AnimationSpec<IntSize> animSpec, M scope) {
        MutableState mutableStateOf$default;
        AbstractC3159y.i(animSpec, "animSpec");
        AbstractC3159y.i(scope, "scope");
        this.animSpec = animSpec;
        this.scope = scope;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.animData$delegate = mutableStateOf$default;
    }

    /* renamed from: animateTo-mzRDjE0, reason: not valid java name */
    public final long m188animateTomzRDjE0(long j8) {
        AnimData animData = getAnimData();
        if (animData != null) {
            if (!IntSize.m5342equalsimpl0(j8, animData.getAnim().getTargetValue().m5348unboximpl())) {
                animData.m193setStartSizeozmzZPI(animData.getAnim().getValue().m5348unboximpl());
                AbstractC2829k.d(this.scope, null, null, new SizeAnimationModifier$animateTo$data$1$1(animData, j8, this, null), 3, null);
            }
        } else {
            animData = new AnimData(new Animatable(IntSize.m5336boximpl(j8), VectorConvertersKt.getVectorConverter(IntSize.Companion), IntSize.m5336boximpl(IntSizeKt.IntSize(1, 1)), null, 8, null), j8, null);
        }
        setAnimData(animData);
        return animData.getAnim().getValue().m5348unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AnimData getAnimData() {
        return (AnimData) this.animData$delegate.getValue();
    }

    public final AnimationSpec<IntSize> getAnimSpec() {
        return this.animSpec;
    }

    public final n getListener() {
        return this.listener;
    }

    public final M getScope() {
        return this.scope;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo156measure3p2s80s(MeasureScope measure, Measurable measurable, long j8) {
        AbstractC3159y.i(measure, "$this$measure");
        AbstractC3159y.i(measurable, "measurable");
        Placeable mo4131measureBRTryo0 = measurable.mo4131measureBRTryo0(j8);
        long m188animateTomzRDjE0 = m188animateTomzRDjE0(IntSizeKt.IntSize(mo4131measureBRTryo0.getWidth(), mo4131measureBRTryo0.getHeight()));
        return MeasureScope.CC.q(measure, IntSize.m5344getWidthimpl(m188animateTomzRDjE0), IntSize.m5343getHeightimpl(m188animateTomzRDjE0), null, new SizeAnimationModifier$measure$1(mo4131measureBRTryo0), 4, null);
    }

    public final void setAnimData(AnimData animData) {
        this.animData$delegate.setValue(animData);
    }

    public final void setListener(n nVar) {
        this.listener = nVar;
    }
}
