package androidx.compose.foundation.lazy.grid;

import a6.InterfaceC1668n;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class LazyGridIntervalContent$Companion$DefaultSpan$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final LazyGridIntervalContent$Companion$DefaultSpan$1 INSTANCE = new LazyGridIntervalContent$Companion$DefaultSpan$1();

    LazyGridIntervalContent$Companion$DefaultSpan$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return GridItemSpan.m718boximpl(m733invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
    }

    /* renamed from: invoke-_-orMbw, reason: not valid java name */
    public final long m733invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i8) {
        AbstractC3255y.i(lazyGridItemSpanScope, "$this$null");
        return LazyGridSpanKt.GridItemSpan(1);
    }
}
