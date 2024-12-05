package androidx.compose.material;

import L5.I;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextKt$Text$3 extends AbstractC3160z implements Function1 {
    public static final TextKt$Text$3 INSTANCE = new TextKt$Text$3();

    TextKt$Text$3() {
        super(1);
    }

    public final void invoke(TextLayoutResult it) {
        AbstractC3159y.i(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TextLayoutResult) obj);
        return I.f6487a;
    }
}
