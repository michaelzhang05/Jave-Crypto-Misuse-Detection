package androidx.compose.foundation.lazy.layout;

import X5.n;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class LazySaveableStateHolder$Companion$saver$1 extends AbstractC3160z implements n {
    public static final LazySaveableStateHolder$Companion$saver$1 INSTANCE = new LazySaveableStateHolder$Companion$saver$1();

    LazySaveableStateHolder$Companion$saver$1() {
        super(2);
    }

    @Override // X5.n
    public final Map<String, List<Object>> invoke(SaverScope Saver, LazySaveableStateHolder it) {
        AbstractC3159y.i(Saver, "$this$Saver");
        AbstractC3159y.i(it, "it");
        Map<String, List<Object>> performSave = it.performSave();
        if (performSave.isEmpty()) {
            return null;
        }
        return performSave;
    }
}
