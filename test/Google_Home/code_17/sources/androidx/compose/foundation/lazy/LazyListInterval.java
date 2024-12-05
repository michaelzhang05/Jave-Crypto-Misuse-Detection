package androidx.compose.foundation.lazy;

import a6.InterfaceC1670p;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class LazyListInterval implements LazyLayoutIntervalContent.Interval {
    private final InterfaceC1670p item;
    private final Function1 key;
    private final Function1 type;

    public LazyListInterval(Function1 function1, Function1 type, InterfaceC1670p item) {
        AbstractC3255y.i(type, "type");
        AbstractC3255y.i(item, "item");
        this.key = function1;
        this.type = type;
        this.item = item;
    }

    public final InterfaceC1670p getItem() {
        return this.item;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public Function1 getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public Function1 getType() {
        return this.type;
    }
}
