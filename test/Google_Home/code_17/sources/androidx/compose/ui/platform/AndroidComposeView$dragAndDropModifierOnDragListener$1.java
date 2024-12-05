package androidx.compose.ui.platform;

import a6.InterfaceC1669o;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Size;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C3252v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public /* synthetic */ class AndroidComposeView$dragAndDropModifierOnDragListener$1 extends C3252v implements InterfaceC1669o {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AndroidComposeView$dragAndDropModifierOnDragListener$1(Object obj) {
        super(3, obj, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
    }

    @Override // a6.InterfaceC1669o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m4431invoke12SF9DM((DragAndDropTransferData) obj, ((Size) obj2).m2814unboximpl(), (Function1) obj3);
    }

    /* renamed from: invoke-12SF9DM, reason: not valid java name */
    public final Boolean m4431invoke12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j8, Function1 function1) {
        boolean m4429startDrag12SF9DM;
        m4429startDrag12SF9DM = ((AndroidComposeView) this.receiver).m4429startDrag12SF9DM(dragAndDropTransferData, j8, function1);
        return Boolean.valueOf(m4429startDrag12SF9DM);
    }
}
