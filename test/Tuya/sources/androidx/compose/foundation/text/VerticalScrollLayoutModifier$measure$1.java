package androidx.compose.foundation.text;

import L5.I;
import Z5.a;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.input.TransformedText;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class VerticalScrollLayoutModifier$measure$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ int $height;
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ VerticalScrollLayoutModifier this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalScrollLayoutModifier$measure$1(MeasureScope measureScope, VerticalScrollLayoutModifier verticalScrollLayoutModifier, Placeable placeable, int i8) {
        super(1);
        this.$this_measure = measureScope;
        this.this$0 = verticalScrollLayoutModifier;
        this.$placeable = placeable;
        this.$height = i8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f6487a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        Rect cursorRectInScroller;
        AbstractC3159y.i(layout, "$this$layout");
        MeasureScope measureScope = this.$this_measure;
        int cursorOffset = this.this$0.getCursorOffset();
        TransformedText transformedText = this.this$0.getTransformedText();
        TextLayoutResultProxy textLayoutResultProxy = (TextLayoutResultProxy) this.this$0.getTextLayoutResultProvider().invoke();
        cursorRectInScroller = TextFieldScrollKt.getCursorRectInScroller(measureScope, cursorOffset, transformedText, textLayoutResultProxy != null ? textLayoutResultProxy.getValue() : null, false, this.$placeable.getWidth());
        this.this$0.getScrollerPosition().update(Orientation.Vertical, cursorRectInScroller, this.$height, this.$placeable.getHeight());
        Placeable.PlacementScope.placeRelative$default(layout, this.$placeable, 0, a.d(-this.this$0.getScrollerPosition().getOffset()), 0.0f, 4, null);
    }
}
