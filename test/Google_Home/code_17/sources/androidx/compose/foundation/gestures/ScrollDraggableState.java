package androidx.compose.foundation.gestures;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScrollDraggableState implements DraggableState, DragScope {
    private ScrollScope latestScrollScope;
    private final State<ScrollingLogic> scrollLogic;

    public ScrollDraggableState(State<ScrollingLogic> scrollLogic) {
        ScrollScope scrollScope;
        AbstractC3255y.i(scrollLogic, "scrollLogic");
        this.scrollLogic = scrollLogic;
        scrollScope = ScrollableKt.NoOpScrollScope;
        this.latestScrollScope = scrollScope;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f8) {
        ScrollingLogic value = this.scrollLogic.getValue();
        value.m467performRawScrollMKHz9U(value.m473toOffsettuRUvjQ(f8));
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public Object drag(MutatePriority mutatePriority, InterfaceC1668n interfaceC1668n, S5.d dVar) {
        Object scroll = this.scrollLogic.getValue().getScrollableState().scroll(mutatePriority, new ScrollDraggableState$drag$2(this, interfaceC1668n, null), dVar);
        if (scroll == T5.b.e()) {
            return scroll;
        }
        return I.f8278a;
    }

    @Override // androidx.compose.foundation.gestures.DragScope
    public void dragBy(float f8) {
        ScrollingLogic value = this.scrollLogic.getValue();
        value.m464dispatchScroll3eAAhYA(this.latestScrollScope, value.m473toOffsettuRUvjQ(f8), NestedScrollSource.Companion.m3928getDragWNlRxjI());
    }

    public final ScrollScope getLatestScrollScope() {
        return this.latestScrollScope;
    }

    public final State<ScrollingLogic> getScrollLogic() {
        return this.scrollLogic;
    }

    public final void setLatestScrollScope(ScrollScope scrollScope) {
        AbstractC3255y.i(scrollScope, "<set-?>");
        this.latestScrollScope = scrollScope;
    }
}
