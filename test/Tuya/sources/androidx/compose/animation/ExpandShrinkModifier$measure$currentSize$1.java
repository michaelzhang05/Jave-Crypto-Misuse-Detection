package androidx.compose.animation;

import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class ExpandShrinkModifier$measure$currentSize$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ long $measuredSize;
    final /* synthetic */ ExpandShrinkModifier this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandShrinkModifier$measure$currentSize$1(ExpandShrinkModifier expandShrinkModifier, long j8) {
        super(1);
        this.this$0 = expandShrinkModifier;
        this.$measuredSize = j8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntSize.m5336boximpl(m179invokeYEO4UFw((EnterExitState) obj));
    }

    /* renamed from: invoke-YEO4UFw, reason: not valid java name */
    public final long m179invokeYEO4UFw(EnterExitState it) {
        AbstractC3159y.i(it, "it");
        return this.this$0.m177sizeByStateUzc_VyU(it, this.$measuredSize);
    }
}
