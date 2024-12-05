package androidx.compose.foundation.lazy;

import P5.AbstractC1378t;
import a6.InterfaceC1669o;
import a6.InterfaceC1670p;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class LazyListIntervalContent extends LazyLayoutIntervalContent<LazyListInterval> implements LazyListScope {
    private List<Integer> _headerIndexes;
    private final MutableIntervalList<LazyListInterval> intervals;

    public LazyListIntervalContent(Function1 content) {
        AbstractC3255y.i(content, "content");
        this.intervals = new MutableIntervalList<>();
        content.invoke(this);
    }

    public final List<Integer> getHeaderIndexes() {
        List<Integer> list = this._headerIndexes;
        if (list == null) {
            return AbstractC1378t.m();
        }
        return list;
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public /* synthetic */ void item(Object obj, InterfaceC1669o interfaceC1669o) {
        LazyListScope.CC.a(this, obj, interfaceC1669o);
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public /* synthetic */ void items(int i8, Function1 function1, InterfaceC1670p interfaceC1670p) {
        LazyListScope.CC.c(this, i8, function1, interfaceC1670p);
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    @ExperimentalFoundationApi
    public void stickyHeader(Object obj, Object obj2, InterfaceC1669o content) {
        AbstractC3255y.i(content, "content");
        List list = this._headerIndexes;
        if (list == null) {
            list = new ArrayList();
            this._headerIndexes = list;
        }
        list.add(Integer.valueOf(getIntervals().getSize()));
        item(obj, obj2, content);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public IntervalList<LazyListInterval> getIntervals() {
        return this.intervals;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.foundation.lazy.layout.MutableIntervalList] */
    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void item(Object obj, Object obj2, InterfaceC1669o content) {
        AbstractC3255y.i(content, "content");
        getIntervals().addInterval(1, new LazyListInterval(obj != null ? new LazyListIntervalContent$item$1(obj) : null, new LazyListIntervalContent$item$2(obj2), ComposableLambdaKt.composableLambdaInstance(-1010194746, true, new LazyListIntervalContent$item$3(content))));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.foundation.lazy.layout.MutableIntervalList] */
    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void items(int i8, Function1 function1, Function1 contentType, InterfaceC1670p itemContent) {
        AbstractC3255y.i(contentType, "contentType");
        AbstractC3255y.i(itemContent, "itemContent");
        getIntervals().addInterval(i8, new LazyListInterval(function1, contentType, itemContent));
    }
}
