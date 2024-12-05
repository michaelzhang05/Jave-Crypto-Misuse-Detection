package androidx.compose.foundation.lazy.staggeredgrid;

import X5.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class LazyStaggeredGridDslKt$itemsIndexed$7$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ T[] $items;
    final /* synthetic */ n $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridDslKt$itemsIndexed$7$1(n nVar, T[] tArr) {
        super(1);
        this.$key = nVar;
        this.$items = tArr;
    }

    public final Object invoke(int i8) {
        return this.$key.invoke(Integer.valueOf(i8), this.$items[i8]);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
