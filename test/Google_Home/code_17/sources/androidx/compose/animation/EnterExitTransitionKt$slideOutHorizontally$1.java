package androidx.compose.animation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class EnterExitTransitionKt$slideOutHorizontally$1 extends AbstractC3256z implements Function1 {
    public static final EnterExitTransitionKt$slideOutHorizontally$1 INSTANCE = new EnterExitTransitionKt$slideOutHorizontally$1();

    EnterExitTransitionKt$slideOutHorizontally$1() {
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
