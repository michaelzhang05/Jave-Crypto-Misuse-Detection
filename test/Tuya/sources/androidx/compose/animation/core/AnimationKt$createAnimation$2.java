package androidx.compose.animation.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class AnimationKt$createAnimation$2 extends AbstractC3160z implements Function1 {
    public static final AnimationKt$createAnimation$2 INSTANCE = new AnimationKt$createAnimation$2();

    AnimationKt$createAnimation$2() {
        super(1);
    }

    /* JADX WARN: Incorrect return type in method signature: (TV;)TV; */
    @Override // kotlin.jvm.functions.Function1
    public final AnimationVector invoke(AnimationVector it) {
        AbstractC3159y.i(it, "it");
        return it;
    }
}
