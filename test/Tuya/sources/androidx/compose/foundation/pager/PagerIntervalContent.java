package androidx.compose.foundation.pager;

import X5.p;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class PagerIntervalContent implements LazyLayoutIntervalContent.Interval {
    private final p item;
    private final Function1 key;

    public PagerIntervalContent(Function1 function1, p item) {
        AbstractC3159y.i(item, "item");
        this.key = function1;
        this.item = item;
    }

    public final p getItem() {
        return this.item;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public Function1 getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public /* synthetic */ Function1 getType() {
        return LazyLayoutIntervalContent.Interval.CC.b(this);
    }
}
