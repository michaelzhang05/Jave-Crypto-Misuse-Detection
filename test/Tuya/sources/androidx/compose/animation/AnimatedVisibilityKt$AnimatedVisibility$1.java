package androidx.compose.animation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class AnimatedVisibilityKt$AnimatedVisibility$1 extends AbstractC3160z implements Function1 {
    public static final AnimatedVisibilityKt$AnimatedVisibility$1 INSTANCE = new AnimatedVisibilityKt$AnimatedVisibility$1();

    AnimatedVisibilityKt$AnimatedVisibility$1() {
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