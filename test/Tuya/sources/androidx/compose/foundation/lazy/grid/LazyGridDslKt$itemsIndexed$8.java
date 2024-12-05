package androidx.compose.foundation.lazy.grid;

import X5.n;
import X5.o;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
public final class LazyGridDslKt$itemsIndexed$8 extends AbstractC3160z implements n {
    final /* synthetic */ T[] $items;
    final /* synthetic */ o $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$itemsIndexed$8(o oVar, T[] tArr) {
        super(2);
        this.$span = oVar;
        this.$items = tArr;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return GridItemSpan.m713boximpl(m725invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
    }

    /* renamed from: invoke-_-orMbw, reason: not valid java name */
    public final long m725invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i8) {
        AbstractC3159y.i(lazyGridItemSpanScope, "$this$null");
        return ((GridItemSpan) this.$span.invoke(lazyGridItemSpanScope, Integer.valueOf(i8), this.$items[i8])).m720unboximpl();
    }
}
