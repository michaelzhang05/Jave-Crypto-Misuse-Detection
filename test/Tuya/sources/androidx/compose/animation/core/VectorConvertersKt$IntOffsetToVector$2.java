package androidx.compose.animation.core;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class VectorConvertersKt$IntOffsetToVector$2 extends AbstractC3160z implements Function1 {
    public static final VectorConvertersKt$IntOffsetToVector$2 INSTANCE = new VectorConvertersKt$IntOffsetToVector$2();

    VectorConvertersKt$IntOffsetToVector$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntOffset.m5293boximpl(m256invokeBjo55l4((AnimationVector2D) obj));
    }

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m256invokeBjo55l4(AnimationVector2D it) {
        AbstractC3159y.i(it, "it");
        return IntOffsetKt.IntOffset(Z5.a.d(it.getV1()), Z5.a.d(it.getV2()));
    }
}
