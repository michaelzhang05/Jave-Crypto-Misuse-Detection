package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1 extends AbstractC3256z implements Function1 {
    public static final SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1 INSTANCE = new SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1();

    SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m1035invokek4lQ0M(((Offset) obj).m2750unboximpl());
    }

    /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
    public final AnimationVector2D m1035invokek4lQ0M(long j8) {
        AnimationVector2D animationVector2D;
        if (!OffsetKt.m2759isSpecifiedk4lQ0M(j8)) {
            animationVector2D = SelectionMagnifierKt.UnspecifiedAnimationVector2D;
            return animationVector2D;
        }
        return new AnimationVector2D(Offset.m2740getXimpl(j8), Offset.m2741getYimpl(j8));
    }
}
