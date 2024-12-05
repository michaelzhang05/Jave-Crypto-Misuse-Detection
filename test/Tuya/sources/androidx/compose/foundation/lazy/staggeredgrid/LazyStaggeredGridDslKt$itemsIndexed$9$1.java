package androidx.compose.foundation.lazy.staggeredgrid;

import X5.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class LazyStaggeredGridDslKt$itemsIndexed$9$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ T[] $items;
    final /* synthetic */ n $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridDslKt$itemsIndexed$9$1(n nVar, T[] tArr) {
        super(1);
        this.$span = nVar;
        this.$items = tArr;
    }

    public final StaggeredGridItemSpan invoke(int i8) {
        return (StaggeredGridItemSpan) this.$span.invoke(Integer.valueOf(i8), this.$items[i8]);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
