package androidx.compose.animation.core;

import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class VectorConvertersKt$IntSizeToVector$2 extends AbstractC3160z implements Function1 {
    public static final VectorConvertersKt$IntSizeToVector$2 INSTANCE = new VectorConvertersKt$IntSizeToVector$2();

    VectorConvertersKt$IntSizeToVector$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntSize.m5336boximpl(m258invokeYEO4UFw((AnimationVector2D) obj));
    }

    /* renamed from: invoke-YEO4UFw, reason: not valid java name */
    public final long m258invokeYEO4UFw(AnimationVector2D it) {
        AbstractC3159y.i(it, "it");
        return IntSizeKt.IntSize(Z5.a.d(it.getV1()), Z5.a.d(it.getV2()));
    }
}
