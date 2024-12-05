package androidx.compose.foundation.lazy.staggeredgrid;

import a6.InterfaceC1668n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class LazyStaggeredGridDslKt$itemsIndexed$9$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ T[] $items;
    final /* synthetic */ InterfaceC1668n $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridDslKt$itemsIndexed$9$1(InterfaceC1668n interfaceC1668n, T[] tArr) {
        super(1);
        this.$span = interfaceC1668n;
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
