package androidx.compose.animation;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$slideInVertically$2 extends AbstractC3160z implements Function1 {
    final /* synthetic */ Function1 $initialOffsetY;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$slideInVertically$2(Function1 function1) {
        super(1);
        this.$initialOffsetY = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntOffset.m5293boximpl(m174invokemHKZG7I(((IntSize) obj).m5348unboximpl()));
    }

    /* renamed from: invoke-mHKZG7I, reason: not valid java name */
    public final long m174invokemHKZG7I(long j8) {
        return IntOffsetKt.IntOffset(0, ((Number) this.$initialOffsetY.invoke(Integer.valueOf(IntSize.m5343getHeightimpl(j8)))).intValue());
    }
}
