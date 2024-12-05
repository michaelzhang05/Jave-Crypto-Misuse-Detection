package androidx.compose.foundation.gestures;

import L5.I;
import X5.n;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScrollDraggableState implements DraggableState, DragScope {
    private ScrollScope latestScrollScope;
    private final State<ScrollingLogic> scrollLogic;

    public ScrollDraggableState(State<ScrollingLogic> scrollLogic) {
        ScrollScope scrollScope;
        AbstractC3159y.i(scrollLogic, "scrollLogic");
        this.scrollLogic = scrollLogic;
        scrollScope = ScrollableKt.NoOpScrollScope;
        this.latestScrollScope = scrollScope;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f8) {
        ScrollingLogic value = this.scrollLogic.getValue();
        value.m462performRawScrollMKHz9U(value.m468toOffsettuRUvjQ(f8));
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public Object drag(MutatePriority mutatePriority, n nVar, P5.d dVar) {
        Object scroll = this.scrollLogic.getValue().getScrollableState().scroll(mutatePriority, new ScrollDraggableState$drag$2(this, nVar, null), dVar);
        if (scroll == Q5.b.e()) {
            return scroll;
        }
        return I.f6487a;
    }

    @Override // androidx.compose.foundation.gestures.DragScope
    public void dragBy(float f8) {
        ScrollingLogic value = this.scrollLogic.getValue();
        value.m459dispatchScroll3eAAhYA(this.latestScrollScope, value.m468toOffsettuRUvjQ(f8), NestedScrollSource.Companion.m3923getDragWNlRxjI());
    }

    public final ScrollScope getLatestScrollScope() {
        return this.latestScrollScope;
    }

    public final State<ScrollingLogic> getScrollLogic() {
        return this.scrollLogic;
    }

    public final void setLatestScrollScope(ScrollScope scrollScope) {
        AbstractC3159y.i(scrollScope, "<set-?>");
        this.latestScrollScope = scrollScope;
    }
}
