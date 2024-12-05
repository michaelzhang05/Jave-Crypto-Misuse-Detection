package androidx.compose.foundation.lazy.staggeredgrid;

import a6.InterfaceC1670p;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class LazyStaggeredGridInterval implements LazyLayoutIntervalContent.Interval {
    private final InterfaceC1670p item;
    private final Function1 key;
    private final Function1 span;
    private final Function1 type;

    public LazyStaggeredGridInterval(Function1 function1, Function1 type, Function1 function12, InterfaceC1670p item) {
        AbstractC3255y.i(type, "type");
        AbstractC3255y.i(item, "item");
        this.key = function1;
        this.type = type;
        this.span = function12;
        this.item = item;
    }

    public final InterfaceC1670p getItem() {
        return this.item;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public Function1 getKey() {
        return this.key;
    }

    public final Function1 getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public Function1 getType() {
        return this.type;
    }
}
