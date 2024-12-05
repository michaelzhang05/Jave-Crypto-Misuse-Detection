package androidx.compose.foundation.lazy.grid;

import a6.InterfaceC1668n;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
public final class LazyGridDslKt$items$3 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ List<T> $items;
    final /* synthetic */ InterfaceC1668n $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$items$3(InterfaceC1668n interfaceC1668n, List<? extends T> list) {
        super(2);
        this.$span = interfaceC1668n;
        this.$items = list;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return GridItemSpan.m718boximpl(m727invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
    }

    /* renamed from: invoke-_-orMbw, reason: not valid java name */
    public final long m727invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i8) {
        AbstractC3255y.i(lazyGridItemSpanScope, "$this$null");
        return ((GridItemSpan) this.$span.invoke(lazyGridItemSpanScope, this.$items.get(i8))).m725unboximpl();
    }
}
