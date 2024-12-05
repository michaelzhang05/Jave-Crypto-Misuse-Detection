package androidx.compose.foundation.text;

import L5.I;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.TextInputSession;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.T;

/* loaded from: classes.dex */
final class TextFieldDelegate$Companion$restartInput$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ EditProcessor $editProcessor;
    final /* synthetic */ Function1 $onValueChange;
    final /* synthetic */ T $session;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDelegate$Companion$restartInput$1(EditProcessor editProcessor, Function1 function1, T t8) {
        super(1);
        this.$editProcessor = editProcessor;
        this.$onValueChange = function1;
        this.$session = t8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends EditCommand>) obj);
        return I.f6487a;
    }

    public final void invoke(List<? extends EditCommand> it) {
        AbstractC3159y.i(it, "it");
        TextFieldDelegate.Companion.onEditCommand$foundation_release(it, this.$editProcessor, this.$onValueChange, (TextInputSession) this.$session.f33761a);
    }
}
