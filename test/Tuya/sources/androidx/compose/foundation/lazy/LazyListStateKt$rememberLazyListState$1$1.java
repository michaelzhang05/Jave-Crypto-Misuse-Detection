package androidx.compose.foundation.lazy;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class LazyListStateKt$rememberLazyListState$1$1 extends AbstractC3160z implements Function0 {
    final /* synthetic */ int $initialFirstVisibleItemIndex;
    final /* synthetic */ int $initialFirstVisibleItemScrollOffset;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListStateKt$rememberLazyListState$1$1(int i8, int i9) {
        super(0);
        this.$initialFirstVisibleItemIndex = i8;
        this.$initialFirstVisibleItemScrollOffset = i9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LazyListState invoke() {
        return new LazyListState(this.$initialFirstVisibleItemIndex, this.$initialFirstVisibleItemScrollOffset);
    }
}
