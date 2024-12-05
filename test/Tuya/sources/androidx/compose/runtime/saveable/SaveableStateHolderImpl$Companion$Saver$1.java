package androidx.compose.runtime.saveable;

import X5.n;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class SaveableStateHolderImpl$Companion$Saver$1 extends AbstractC3160z implements n {
    public static final SaveableStateHolderImpl$Companion$Saver$1 INSTANCE = new SaveableStateHolderImpl$Companion$Saver$1();

    SaveableStateHolderImpl$Companion$Saver$1() {
        super(2);
    }

    @Override // X5.n
    public final Map<Object, Map<String, List<Object>>> invoke(SaverScope saverScope, SaveableStateHolderImpl saveableStateHolderImpl) {
        Map<Object, Map<String, List<Object>>> saveAll;
        saveAll = saveableStateHolderImpl.saveAll();
        return saveAll;
    }
}
