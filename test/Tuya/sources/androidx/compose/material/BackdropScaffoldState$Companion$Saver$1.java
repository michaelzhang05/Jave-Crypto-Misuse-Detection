package androidx.compose.material;

import X5.n;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class BackdropScaffoldState$Companion$Saver$1 extends AbstractC3160z implements n {
    public static final BackdropScaffoldState$Companion$Saver$1 INSTANCE = new BackdropScaffoldState$Companion$Saver$1();

    BackdropScaffoldState$Companion$Saver$1() {
        super(2);
    }

    @Override // X5.n
    public final BackdropValue invoke(SaverScope Saver, BackdropScaffoldState it) {
        AbstractC3159y.i(Saver, "$this$Saver");
        AbstractC3159y.i(it, "it");
        return it.getCurrentValue();
    }
}
