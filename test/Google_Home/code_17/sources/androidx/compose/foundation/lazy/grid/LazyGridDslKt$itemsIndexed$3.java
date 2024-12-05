package androidx.compose.foundation.lazy.grid;

import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
public final class LazyGridDslKt$itemsIndexed$3 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ List<T> $items;
    final /* synthetic */ InterfaceC1669o $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$itemsIndexed$3(InterfaceC1669o interfaceC1669o, List<? extends T> list) {
        super(2);
        this.$span = interfaceC1669o;
        this.$items = list;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return GridItemSpan.m718boximpl(m729invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
    }

    /* renamed from: invoke-_-orMbw, reason: not valid java name */
    public final long m729invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i8) {
        AbstractC3255y.i(lazyGridItemSpanScope, "$this$null");
        return ((GridItemSpan) this.$span.invoke(lazyGridItemSpanScope, Integer.valueOf(i8), this.$items.get(i8))).m725unboximpl();
    }
}
