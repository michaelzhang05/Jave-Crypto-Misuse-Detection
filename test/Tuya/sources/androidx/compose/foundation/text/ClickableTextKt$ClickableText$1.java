package androidx.compose.foundation.text;

import L5.I;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class ClickableTextKt$ClickableText$1 extends AbstractC3160z implements Function1 {
    public static final ClickableTextKt$ClickableText$1 INSTANCE = new ClickableTextKt$ClickableText$1();

    ClickableTextKt$ClickableText$1() {
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