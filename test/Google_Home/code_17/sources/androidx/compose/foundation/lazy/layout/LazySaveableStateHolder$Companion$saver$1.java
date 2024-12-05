package androidx.compose.foundation.lazy.layout;

import a6.InterfaceC1668n;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class LazySaveableStateHolder$Companion$saver$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final LazySaveableStateHolder$Companion$saver$1 INSTANCE = new LazySaveableStateHolder$Companion$saver$1();

    LazySaveableStateHolder$Companion$saver$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public final Map<String, List<Object>> invoke(SaverScope Saver, LazySaveableStateHolder it) {
        AbstractC3255y.i(Saver, "$this$Saver");
        AbstractC3255y.i(it, "it");
        Map<String, List<Object>> performSave = it.performSave();
        if (performSave.isEmpty()) {
            return null;
        }
        return performSave;
    }
}
