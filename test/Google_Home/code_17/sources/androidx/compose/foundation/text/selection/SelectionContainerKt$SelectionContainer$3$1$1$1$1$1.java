package androidx.compose.foundation.text.selection;

import O5.I;
import O5.t;
import S5.d;
import a6.InterfaceC1668n;
import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1$1$1$1$1", f = "SelectionContainer.kt", l = {126}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SelectionContainerKt$SelectionContainer$3$1$1$1$1$1 extends l implements InterfaceC1668n {
    final /* synthetic */ TextDragObserver $observer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionContainerKt$SelectionContainer$3$1$1$1$1$1(TextDragObserver textDragObserver, d dVar) {
        super(2, dVar);
        this.$observer = textDragObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        SelectionContainerKt$SelectionContainer$3$1$1$1$1$1 selectionContainerKt$SelectionContainer$3$1$1$1$1$1 = new SelectionContainerKt$SelectionContainer$3$1$1$1$1$1(this.$observer, dVar);
        selectionContainerKt$SelectionContainer$3$1$1$1$1$1.L$0 = obj;
        return selectionContainerKt$SelectionContainer$3$1$1$1$1$1;
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(PointerInputScope pointerInputScope, d dVar) {
        return ((SelectionContainerKt$SelectionContainer$3$1$1$1$1$1) create(pointerInputScope, dVar)).invokeSuspend(I.f8278a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = T5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            TextDragObserver textDragObserver = this.$observer;
            this.label = 1;
            if (LongPressTextDragObserverKt.detectDownAndDragGesturesWithObserver(pointerInputScope, textDragObserver, this) == e8) {
                return e8;
            }
        }
        return I.f8278a;
    }
}
