package androidx.compose.foundation.lazy.grid;

import X5.n;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
public final class LazyGridDslKt$itemsIndexed$4 extends AbstractC3160z implements Function1 {
    final /* synthetic */ n $contentType;
    final /* synthetic */ List<T> $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$itemsIndexed$4(n nVar, List<? extends T> list) {
        super(1);
        this.$contentType = nVar;
        this.$items = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Object invoke(int i8) {
        return this.$contentType.invoke(Integer.valueOf(i8), this.$items.get(i8));
    }
}
