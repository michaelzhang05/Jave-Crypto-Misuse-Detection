package androidx.compose.animation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class AnimatedVisibilityKt$AnimatedVisibility$11 extends AbstractC3256z implements Function1 {
    public static final AnimatedVisibilityKt$AnimatedVisibility$11 INSTANCE = new AnimatedVisibilityKt$AnimatedVisibility$11();

    AnimatedVisibilityKt$AnimatedVisibility$11() {
        super(1);
    }

    public final Boolean invoke(boolean z8) {
        return Boolean.valueOf(z8);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Boolean) obj).booleanValue());
    }
}
