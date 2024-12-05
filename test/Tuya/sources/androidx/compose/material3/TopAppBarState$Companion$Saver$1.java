package androidx.compose.material3;

import M5.AbstractC1246t;
import X5.n;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class TopAppBarState$Companion$Saver$1 extends AbstractC3160z implements n {
    public static final TopAppBarState$Companion$Saver$1 INSTANCE = new TopAppBarState$Companion$Saver$1();

    TopAppBarState$Companion$Saver$1() {
        super(2);
    }

    @Override // X5.n
    public final List<Float> invoke(SaverScope listSaver, TopAppBarState it) {
        AbstractC3159y.i(listSaver, "$this$listSaver");
        AbstractC3159y.i(it, "it");
        return AbstractC1246t.p(Float.valueOf(it.getHeightOffsetLimit()), Float.valueOf(it.getHeightOffset()), Float.valueOf(it.getContentOffset()));
    }
}
