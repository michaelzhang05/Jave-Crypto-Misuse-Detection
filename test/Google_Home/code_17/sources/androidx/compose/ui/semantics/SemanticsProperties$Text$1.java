package androidx.compose.ui.semantics;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import androidx.compose.ui.text.AnnotatedString;
import java.util.List;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class SemanticsProperties$Text$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final SemanticsProperties$Text$1 INSTANCE = new SemanticsProperties$Text$1();

    SemanticsProperties$Text$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public final List<AnnotatedString> invoke(List<AnnotatedString> list, List<AnnotatedString> list2) {
        List<AnnotatedString> Z02;
        if (list == null || (Z02 = AbstractC1378t.Z0(list)) == null) {
            return list2;
        }
        Z02.addAll(list2);
        return Z02;
    }
}