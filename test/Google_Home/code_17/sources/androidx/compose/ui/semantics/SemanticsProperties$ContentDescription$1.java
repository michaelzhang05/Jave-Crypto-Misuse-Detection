package androidx.compose.ui.semantics;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import java.util.List;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class SemanticsProperties$ContentDescription$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final SemanticsProperties$ContentDescription$1 INSTANCE = new SemanticsProperties$ContentDescription$1();

    SemanticsProperties$ContentDescription$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public final List<String> invoke(List<String> list, List<String> list2) {
        List<String> Z02;
        if (list == null || (Z02 = AbstractC1378t.Z0(list)) == null) {
            return list2;
        }
        Z02.addAll(list2);
        return Z02;
    }
}
