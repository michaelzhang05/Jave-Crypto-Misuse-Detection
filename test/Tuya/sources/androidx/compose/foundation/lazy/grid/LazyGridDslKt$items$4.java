package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
public final class LazyGridDslKt$items$4 extends AbstractC3160z implements Function1 {
    final /* synthetic */ Function1 $contentType;
    final /* synthetic */ List<T> $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$items$4(Function1 function1, List<? extends T> list) {
        super(1);
        this.$contentType = function1;
        this.$items = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Object invoke(int i8) {
        return this.$contentType.invoke(this.$items.get(i8));
    }
}
