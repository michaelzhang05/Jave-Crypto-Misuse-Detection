package androidx.compose.material;

import a6.InterfaceC1668n;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class BackdropScaffoldState$Companion$Saver$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final BackdropScaffoldState$Companion$Saver$1 INSTANCE = new BackdropScaffoldState$Companion$Saver$1();

    BackdropScaffoldState$Companion$Saver$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public final BackdropValue invoke(SaverScope Saver, BackdropScaffoldState it) {
        AbstractC3255y.i(Saver, "$this$Saver");
        AbstractC3255y.i(it, "it");
        return it.getCurrentValue();
    }
}
