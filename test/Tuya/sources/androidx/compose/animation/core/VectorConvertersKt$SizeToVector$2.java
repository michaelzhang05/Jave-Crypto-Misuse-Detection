package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class VectorConvertersKt$SizeToVector$2 extends AbstractC3160z implements Function1 {
    public static final VectorConvertersKt$SizeToVector$2 INSTANCE = new VectorConvertersKt$SizeToVector$2();

    VectorConvertersKt$SizeToVector$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Size.m2792boximpl(m262invoke7Ah8Wj8((AnimationVector2D) obj));
    }

    /* renamed from: invoke-7Ah8Wj8, reason: not valid java name */
    public final long m262invoke7Ah8Wj8(AnimationVector2D it) {
        AbstractC3159y.i(it, "it");
        return SizeKt.Size(it.getV1(), it.getV2());
    }
}
