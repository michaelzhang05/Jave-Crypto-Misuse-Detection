package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyStaggeredGridState$scrollableState$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ LazyStaggeredGridState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridState$scrollableState$1(LazyStaggeredGridState lazyStaggeredGridState) {
        super(1);
        this.this$0 = lazyStaggeredGridState;
    }

    public final Float invoke(float f8) {
        float onScroll;
        onScroll = this.this$0.onScroll(-f8);
        return Float.valueOf(-onScroll);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).floatValue());
    }
}
