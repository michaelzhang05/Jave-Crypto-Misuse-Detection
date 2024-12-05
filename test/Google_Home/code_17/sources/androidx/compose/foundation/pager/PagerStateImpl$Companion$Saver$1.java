package androidx.compose.foundation.pager;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class PagerStateImpl$Companion$Saver$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final PagerStateImpl$Companion$Saver$1 INSTANCE = new PagerStateImpl$Companion$Saver$1();

    PagerStateImpl$Companion$Saver$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public final List<Object> invoke(SaverScope listSaver, PagerStateImpl it) {
        AbstractC3255y.i(listSaver, "$this$listSaver");
        AbstractC3255y.i(it, "it");
        return AbstractC1378t.p(Integer.valueOf(it.getCurrentPage()), Float.valueOf(it.getCurrentPageOffsetFraction()), Integer.valueOf(it.getPageCount()));
    }
}
