package androidx.compose.foundation.pager;

import X5.p;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
final class PagerLayoutIntervalContent extends LazyLayoutIntervalContent<PagerIntervalContent> {
    private final IntervalList<PagerIntervalContent> intervals;
    private final Function1 key;
    private final p pageContent;
    private final int pageCount;

    public PagerLayoutIntervalContent(p pageContent, Function1 function1, int i8) {
        AbstractC3159y.i(pageContent, "pageContent");
        this.pageContent = pageContent;
        this.key = function1;
        this.pageCount = i8;
        MutableIntervalList mutableIntervalList = new MutableIntervalList();
        mutableIntervalList.addInterval(i8, new PagerIntervalContent(function1, pageContent));
        this.intervals = mutableIntervalList;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public IntervalList<PagerIntervalContent> getIntervals() {
        return this.intervals;
    }

    public final Function1 getKey() {
        return this.key;
    }

    public final p getPageContent() {
        return this.pageContent;
    }

    public final int getPageCount() {
        return this.pageCount;
    }
}
