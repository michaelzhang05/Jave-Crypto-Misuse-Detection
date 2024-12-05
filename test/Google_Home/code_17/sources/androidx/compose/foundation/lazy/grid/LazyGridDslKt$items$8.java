package androidx.compose.foundation.lazy.grid;

import a6.InterfaceC1668n;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
public final class LazyGridDslKt$items$8 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ T[] $items;
    final /* synthetic */ InterfaceC1668n $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$items$8(InterfaceC1668n interfaceC1668n, T[] tArr) {
        super(2);
        this.$span = interfaceC1668n;
        this.$items = tArr;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return GridItemSpan.m718boximpl(m728invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
    }

    /* renamed from: invoke-_-orMbw, reason: not valid java name */
    public final long m728invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i8) {
        AbstractC3255y.i(lazyGridItemSpanScope, "$this$null");
        return ((GridItemSpan) this.$span.invoke(lazyGridItemSpanScope, this.$items[i8])).m725unboximpl();
    }
}
