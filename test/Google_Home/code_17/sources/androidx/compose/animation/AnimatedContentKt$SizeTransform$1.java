package androidx.compose.animation;

import a6.InterfaceC1668n;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AnimatedContentKt$SizeTransform$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final AnimatedContentKt$SizeTransform$1 INSTANCE = new AnimatedContentKt$SizeTransform$1();

    AnimatedContentKt$SizeTransform$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m136invokeTemP2vQ(((IntSize) obj).m5353unboximpl(), ((IntSize) obj2).m5353unboximpl());
    }

    /* renamed from: invoke-TemP2vQ, reason: not valid java name */
    public final SpringSpec<IntSize> m136invokeTemP2vQ(long j8, long j9) {
        return AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5341boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
    }
}
