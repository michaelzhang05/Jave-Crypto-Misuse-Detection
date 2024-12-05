package androidx.compose.foundation.pager;

import L5.I;
import X5.n;
import X5.p;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PagerLazyLayoutItemProvider$Item$1 extends AbstractC3160z implements n {
    final /* synthetic */ int $index;
    final /* synthetic */ PagerLazyLayoutItemProvider this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerLazyLayoutItemProvider$Item$1(PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i8) {
        super(2);
        this.this$0 = pagerLazyLayoutItemProvider;
        this.$index = i8;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    @Composable
    public final void invoke(Composer composer, int i8) {
        LazyLayoutIntervalContent lazyLayoutIntervalContent;
        PagerScopeImpl pagerScopeImpl;
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1142237095, i8, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item.<anonymous> (LazyLayoutPager.kt:188)");
        }
        lazyLayoutIntervalContent = this.this$0.intervalContent;
        int i9 = this.$index;
        PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider = this.this$0;
        IntervalList.Interval interval = lazyLayoutIntervalContent.getIntervals().get(i9);
        int startIndex = i9 - interval.getStartIndex();
        p item = ((PagerIntervalContent) interval.getValue()).getItem();
        pagerScopeImpl = pagerLazyLayoutItemProvider.pagerScopeImpl;
        item.invoke(pagerScopeImpl, Integer.valueOf(startIndex), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
