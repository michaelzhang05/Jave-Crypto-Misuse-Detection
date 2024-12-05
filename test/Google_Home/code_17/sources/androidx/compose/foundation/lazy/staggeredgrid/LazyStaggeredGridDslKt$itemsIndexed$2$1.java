package androidx.compose.foundation.lazy.staggeredgrid;

import a6.InterfaceC1668n;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class LazyStaggeredGridDslKt$itemsIndexed$2$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ List<T> $items;
    final /* synthetic */ InterfaceC1668n $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridDslKt$itemsIndexed$2$1(InterfaceC1668n interfaceC1668n, List<? extends T> list) {
        super(1);
        this.$key = interfaceC1668n;
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
