package androidx.compose.foundation.pager;

import X5.p;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$intervalContentState$1 extends AbstractC3160z implements Function0 {
    final /* synthetic */ Function1 $key;
    final /* synthetic */ State<p> $latestContent;
    final /* synthetic */ Function0 $pageCount;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$intervalContentState$1(State<? extends p> state, Function1 function1, Function0 function0) {
        super(0);
        this.$latestContent = state;
        this.$key = function1;
        this.$pageCount = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PagerLayoutIntervalContent invoke() {
        return new PagerLayoutIntervalContent(this.$latestContent.getValue(), this.$key, ((Number) this.$pageCount.invoke()).intValue());
    }
}
