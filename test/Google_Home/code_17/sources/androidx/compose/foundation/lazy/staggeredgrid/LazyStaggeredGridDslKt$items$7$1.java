package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class LazyStaggeredGridDslKt$items$7$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ T[] $items;
    final /* synthetic */ Function1 $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridDslKt$items$7$1(Function1 function1, T[] tArr) {
        super(1);
        this.$key = function1;
        this.$items = tArr;
    }

    public final Object invoke(int i8) {
        return this.$key.invoke(this.$items[i8]);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
