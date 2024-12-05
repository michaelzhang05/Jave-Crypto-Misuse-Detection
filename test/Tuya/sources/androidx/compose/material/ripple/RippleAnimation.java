package androidx.compose.material.ripple;

import L5.I;
import P5.d;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.c;
import androidx.compose.ui.util.MathHelpersKt;
import i6.AbstractC2858z;
import i6.InterfaceC2854x;
import i6.N;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class RippleAnimation {
    private final Animatable<Float, AnimationVector1D> animatedAlpha;
    private final Animatable<Float, AnimationVector1D> animatedCenterPercent;
    private final Animatable<Float, AnimationVector1D> animatedRadiusPercent;
    private final boolean bounded;
    private final MutableState finishRequested$delegate;
    private final InterfaceC2854x finishSignalDeferred;
    private final MutableState finishedFadingIn$delegate;
    private Offset origin;
    private final float radius;
    private Float startRadius;
    private Offset targetCenter;
    private Float targetRadius;

    public /* synthetic */ RippleAnimation(Offset offset, float f8, boolean z8, AbstractC3151p abstractC3151p) {
        this(offset, f8, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fadeIn(d dVar) {
        Object e8 = N.e(new RippleAnimation$fadeIn$2(this, null), dVar);
        if (e8 == Q5.b.e()) {
            return e8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fadeOut(d dVar) {
        Object e8 = N.e(new RippleAnimation$fadeOut$2(this, null), dVar);
        if (e8 == Q5.b.e()) {
            return e8;
        }
        return I.f6487a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getFinishRequested() {
        return ((Boolean) this.finishRequested$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getFinishedFadingIn() {
        return ((Boolean) this.finishedFadingIn$delegate.getValue()).booleanValue();
    }

    private final void setFinishRequested(boolean z8) {
        this.finishRequested$delegate.setValue(Boolean.valueOf(z8));
    }

    private final void setFinishedFadingIn(boolean z8) {
        this.finishedFadingIn$delegate.setValue(Boolean.valueOf(z8));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animate(P5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.material.ripple.RippleAnimation$animate$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = (androidx.compose.material.ripple.RippleAnimation$animate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = new androidx.compose.material.ripple.RippleAnimation$animate$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r7)
            goto L72
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            java.lang.Object r2 = r0.L$0
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            L5.t.b(r7)
            goto L66
        L3f:
            java.lang.Object r2 = r0.L$0
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            L5.t.b(r7)
            goto L56
        L47:
            L5.t.b(r7)
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r6.fadeIn(r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            r2 = r6
        L56:
            r2.setFinishedFadingIn(r5)
            i6.x r7 = r2.finishSignalDeferred
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r7 = r7.g(r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r7 = r2.fadeOut(r0)
            if (r7 != r1) goto L72
            return r1
        L72:
            L5.I r7 = L5.I.f6487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.RippleAnimation.animate(P5.d):java.lang.Object");
    }

    /* renamed from: draw-4WTKRHQ, reason: not valid java name */
    public final void m1438draw4WTKRHQ(DrawScope draw, long j8) {
        float floatValue;
        Float valueOf;
        AbstractC3159y.i(draw, "$this$draw");
        if (this.startRadius == null) {
            this.startRadius = Float.valueOf(RippleAnimationKt.m1440getRippleStartRadiusuvyYCjk(draw.mo3414getSizeNHjbRc()));
        }
        if (this.targetRadius == null) {
            if (Float.isNaN(this.radius)) {
                valueOf = Float.valueOf(RippleAnimationKt.m1439getRippleEndRadiuscSwnlzA(draw, this.bounded, draw.mo3414getSizeNHjbRc()));
            } else {
                valueOf = Float.valueOf(draw.mo448toPx0680j_4(this.radius));
            }
            this.targetRadius = valueOf;
        }
        if (this.origin == null) {
            this.origin = Offset.m2724boximpl(draw.mo3413getCenterF1C5BW0());
        }
        if (this.targetCenter == null) {
            this.targetCenter = Offset.m2724boximpl(OffsetKt.Offset(Size.m2804getWidthimpl(draw.mo3414getSizeNHjbRc()) / 2.0f, Size.m2801getHeightimpl(draw.mo3414getSizeNHjbRc()) / 2.0f));
        }
        if (getFinishRequested() && !getFinishedFadingIn()) {
            floatValue = 1.0f;
        } else {
            floatValue = this.animatedAlpha.getValue().floatValue();
        }
        Float f8 = this.startRadius;
        AbstractC3159y.f(f8);
        float floatValue2 = f8.floatValue();
        Float f9 = this.targetRadius;
        AbstractC3159y.f(f9);
        float lerp = MathHelpersKt.lerp(floatValue2, f9.floatValue(), this.animatedRadiusPercent.getValue().floatValue());
        Offset offset = this.origin;
        AbstractC3159y.f(offset);
        float m2735getXimpl = Offset.m2735getXimpl(offset.m2745unboximpl());
        Offset offset2 = this.targetCenter;
        AbstractC3159y.f(offset2);
        float lerp2 = MathHelpersKt.lerp(m2735getXimpl, Offset.m2735getXimpl(offset2.m2745unboximpl()), this.animatedCenterPercent.getValue().floatValue());
        Offset offset3 = this.origin;
        AbstractC3159y.f(offset3);
        float m2736getYimpl = Offset.m2736getYimpl(offset3.m2745unboximpl());
        Offset offset4 = this.targetCenter;
        AbstractC3159y.f(offset4);
        long Offset = OffsetKt.Offset(lerp2, MathHelpersKt.lerp(m2736getYimpl, Offset.m2736getYimpl(offset4.m2745unboximpl()), this.animatedCenterPercent.getValue().floatValue()));
        long m2970copywmQWz5c$default = Color.m2970copywmQWz5c$default(j8, Color.m2973getAlphaimpl(j8) * floatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (this.bounded) {
            float m2804getWidthimpl = Size.m2804getWidthimpl(draw.mo3414getSizeNHjbRc());
            float m2801getHeightimpl = Size.m2801getHeightimpl(draw.mo3414getSizeNHjbRc());
            int m2960getIntersectrtfAjoo = ClipOp.Companion.m2960getIntersectrtfAjoo();
            DrawContext drawContext = draw.getDrawContext();
            long mo3420getSizeNHjbRc = drawContext.mo3420getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo3423clipRectN_I0leg(0.0f, 0.0f, m2804getWidthimpl, m2801getHeightimpl, m2960getIntersectrtfAjoo);
            c.x(draw, m2970copywmQWz5c$default, lerp, Offset, 0.0f, null, null, 0, 120, null);
            drawContext.getCanvas().restore();
            drawContext.mo3421setSizeuvyYCjk(mo3420getSizeNHjbRc);
            return;
        }
        c.x(draw, m2970copywmQWz5c$default, lerp, Offset, 0.0f, null, null, 0, 120, null);
    }

    public final void finish() {
        setFinishRequested(true);
        this.finishSignalDeferred.x(I.f6487a);
    }

    private RippleAnimation(Offset offset, float f8, boolean z8) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        this.origin = offset;
        this.radius = f8;
        this.bounded = z8;
        this.animatedAlpha = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.animatedRadiusPercent = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.animatedCenterPercent = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.finishSignalDeferred = AbstractC2858z.a(null);
        Boolean bool = Boolean.FALSE;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.finishedFadingIn$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.finishRequested$delegate = mutableStateOf$default2;
    }
}
