package androidx.compose.runtime.saveable;

import X5.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class MapSaverKt$mapSaver$1 extends AbstractC3160z implements n {
    final /* synthetic */ n $save;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapSaverKt$mapSaver$1(n nVar) {
        super(2);
        this.$save = nVar;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((SaverScope) obj, (SaverScope) obj2);
    }

    public final List<Object> invoke(SaverScope saverScope, T t8) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) this.$save.invoke(saverScope, t8)).entrySet()) {
            arrayList.add(entry.getKey());
            arrayList.add(entry.getValue());
        }
        return arrayList;
    }
}
