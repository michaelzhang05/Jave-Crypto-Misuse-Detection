package androidx.compose.animation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class EnterExitTransitionKt$slideInHorizontally$1 extends AbstractC3160z implements Function1 {
    public static final EnterExitTransitionKt$slideInHorizontally$1 INSTANCE = new EnterExitTransitionKt$slideInHorizontally$1();

    EnterExitTransitionKt$slideInHorizontally$1() {
        super(1);
    }

    public final Integer invoke(int i8) {
        return Integer.valueOf((-i8) / 2);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
