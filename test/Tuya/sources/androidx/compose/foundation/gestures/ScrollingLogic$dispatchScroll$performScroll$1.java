package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScrollingLogic$dispatchScroll$performScroll$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ int $source;
    final /* synthetic */ ScrollScope $this_dispatchScroll;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$dispatchScroll$performScroll$1(ScrollingLogic scrollingLogic, int i8, ScrollScope scrollScope) {
        super(1);
        this.this$0 = scrollingLogic;
        this.$source = i8;
        this.$this_dispatchScroll = scrollScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Offset.m2724boximpl(m470invokeMKHz9U(((Offset) obj).m2745unboximpl()));
    }

    /* renamed from: invoke-MK-Hz9U, reason: not valid java name */
    public final long m470invokeMKHz9U(long j8) {
        NestedScrollDispatcher value = this.this$0.getNestedScrollDispatcher().getValue();
        long m3914dispatchPreScrollOzD1aCk = value.m3914dispatchPreScrollOzD1aCk(j8, this.$source);
        long m2739minusMKHz9U = Offset.m2739minusMKHz9U(j8, m3914dispatchPreScrollOzD1aCk);
        ScrollingLogic scrollingLogic = this.this$0;
        long m463reverseIfNeededMKHz9U = scrollingLogic.m463reverseIfNeededMKHz9U(scrollingLogic.m468toOffsettuRUvjQ(this.$this_dispatchScroll.scrollBy(scrollingLogic.m467toFloatk4lQ0M(scrollingLogic.m463reverseIfNeededMKHz9U(m2739minusMKHz9U)))));
        return Offset.m2740plusMKHz9U(Offset.m2740plusMKHz9U(m3914dispatchPreScrollOzD1aCk, m463reverseIfNeededMKHz9U), value.m3912dispatchPostScrollDzOQY0M(m463reverseIfNeededMKHz9U, Offset.m2739minusMKHz9U(m2739minusMKHz9U, m463reverseIfNeededMKHz9U), this.$source));
    }
}
