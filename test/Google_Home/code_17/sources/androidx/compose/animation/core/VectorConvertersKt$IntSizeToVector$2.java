package androidx.compose.animation.core;

import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import c6.AbstractC2055a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class VectorConvertersKt$IntSizeToVector$2 extends AbstractC3256z implements Function1 {
    public static final VectorConvertersKt$IntSizeToVector$2 INSTANCE = new VectorConvertersKt$IntSizeToVector$2();

    VectorConvertersKt$IntSizeToVector$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntSize.m5341boximpl(m263invokeYEO4UFw((AnimationVector2D) obj));
    }

    /* renamed from: invoke-YEO4UFw, reason: not valid java name */
    public final long m263invokeYEO4UFw(AnimationVector2D it) {
        AbstractC3255y.i(it, "it");
        return IntSizeKt.IntSize(AbstractC2055a.d(it.getV1()), AbstractC2055a.d(it.getV2()));
    }
}
