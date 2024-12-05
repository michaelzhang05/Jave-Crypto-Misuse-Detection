package androidx.compose.material3;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class TopAppBarState$Companion$Saver$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final TopAppBarState$Companion$Saver$1 INSTANCE = new TopAppBarState$Companion$Saver$1();

    TopAppBarState$Companion$Saver$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public final List<Float> invoke(SaverScope listSaver, TopAppBarState it) {
        AbstractC3255y.i(listSaver, "$this$listSaver");
        AbstractC3255y.i(it, "it");
        return AbstractC1378t.p(Float.valueOf(it.getHeightOffsetLimit()), Float.valueOf(it.getHeightOffset()), Float.valueOf(it.getContentOffset()));
    }
}
