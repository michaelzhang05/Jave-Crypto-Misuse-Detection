package androidx.compose.animation;

import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$expandHorizontally$2 extends AbstractC3160z implements Function1 {
    final /* synthetic */ Function1 $initialWidth;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$expandHorizontally$2(Function1 function1) {
        super(1);
        this.$initialWidth = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntSize.m5336boximpl(m167invokemzRDjE0(((IntSize) obj).m5348unboximpl()));
    }

    /* renamed from: invoke-mzRDjE0, reason: not valid java name */
    public final long m167invokemzRDjE0(long j8) {
        return IntSizeKt.IntSize(((Number) this.$initialWidth.invoke(Integer.valueOf(IntSize.m5344getWidthimpl(j8)))).intValue(), IntSize.m5343getHeightimpl(j8));
    }
}
