package androidx.compose.foundation.lazy.staggeredgrid;

import X5.n;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class LazyStaggeredGridDslKt$itemsIndexed$2$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ List<T> $items;
    final /* synthetic */ n $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridDslKt$itemsIndexed$2$1(n nVar, List<? extends T> list) {
        super(1);
        this.$key = nVar;
        this.$items = list;
    }

    public final Object invoke(int i8) {
        return this.$key.invoke(Integer.valueOf(i8), this.$items.get(i8));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
