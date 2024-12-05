package androidx.compose.animation;

import X5.n;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AnimatedContentKt$SizeTransform$1 extends AbstractC3160z implements n {
    public static final AnimatedContentKt$SizeTransform$1 INSTANCE = new AnimatedContentKt$SizeTransform$1();

    AnimatedContentKt$SizeTransform$1() {
        super(2);
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m131invokeTemP2vQ(((IntSize) obj).m5348unboximpl(), ((IntSize) obj2).m5348unboximpl());
    }

    /* renamed from: invoke-TemP2vQ, reason: not valid java name */
    public final SpringSpec<IntSize> m131invokeTemP2vQ(long j8, long j9) {
        return AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5336boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
    }
}
