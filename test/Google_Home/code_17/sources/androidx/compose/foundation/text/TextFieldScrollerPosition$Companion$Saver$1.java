package androidx.compose.foundation.text;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class TextFieldScrollerPosition$Companion$Saver$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final TextFieldScrollerPosition$Companion$Saver$1 INSTANCE = new TextFieldScrollerPosition$Companion$Saver$1();

    TextFieldScrollerPosition$Companion$Saver$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public final List<Object> invoke(SaverScope listSaver, TextFieldScrollerPosition it) {
        AbstractC3255y.i(listSaver, "$this$listSaver");
        AbstractC3255y.i(it, "it");
        return AbstractC1378t.p(Float.valueOf(it.getOffset()), Boolean.valueOf(it.getOrientation() == Orientation.Vertical));
    }
}
