package androidx.compose.runtime.saveable;

import a6.InterfaceC1668n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class MapSaverKt$mapSaver$1 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ InterfaceC1668n $save;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapSaverKt$mapSaver$1(InterfaceC1668n interfaceC1668n) {
        super(2);
        this.$save = interfaceC1668n;
    }

    @Override // a6.InterfaceC1668n
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
