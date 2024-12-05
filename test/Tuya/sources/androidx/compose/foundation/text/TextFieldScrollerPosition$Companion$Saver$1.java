package androidx.compose.foundation.text;

import M5.AbstractC1246t;
import X5.n;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class TextFieldScrollerPosition$Companion$Saver$1 extends AbstractC3160z implements n {
    public static final TextFieldScrollerPosition$Companion$Saver$1 INSTANCE = new TextFieldScrollerPosition$Companion$Saver$1();

    TextFieldScrollerPosition$Companion$Saver$1() {
        super(2);
    }

    @Override // X5.n
    public final List<Object> invoke(SaverScope listSaver, TextFieldScrollerPosition it) {
        AbstractC3159y.i(listSaver, "$this$listSaver");
        AbstractC3159y.i(it, "it");
        return AbstractC1246t.p(Float.valueOf(it.getOffset()), Boolean.valueOf(it.getOrientation() == Orientation.Vertical));
    }
}
