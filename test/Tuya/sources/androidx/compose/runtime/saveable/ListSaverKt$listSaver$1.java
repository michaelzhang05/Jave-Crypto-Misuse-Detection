package androidx.compose.runtime.saveable;

import X5.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class ListSaverKt$listSaver$1 extends AbstractC3160z implements n {
    final /* synthetic */ n $save;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListSaverKt$listSaver$1(n nVar) {
        super(2);
        this.$save = nVar;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((SaverScope) obj, (SaverScope) obj2);
    }

    public final Object invoke(SaverScope saverScope, Original original) {
        List list = (List) this.$save.invoke(saverScope, original);
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = list.get(i8);
            if (obj != null && !saverScope.canBeSaved(obj)) {
                throw new IllegalArgumentException("item can't be saved".toString());
            }
        }
        List list2 = list;
        if (!list2.isEmpty()) {
            return new ArrayList(list2);
        }
        return null;
    }
}
