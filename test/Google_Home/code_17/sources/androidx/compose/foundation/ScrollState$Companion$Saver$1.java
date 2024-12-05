package androidx.compose.foundation;

import a6.InterfaceC1668n;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class ScrollState$Companion$Saver$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final ScrollState$Companion$Saver$1 INSTANCE = new ScrollState$Companion$Saver$1();

    ScrollState$Companion$Saver$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public final Integer invoke(SaverScope Saver, ScrollState it) {
        AbstractC3255y.i(Saver, "$this$Saver");
        AbstractC3255y.i(it, "it");
        return Integer.valueOf(it.getValue());
    }
}
