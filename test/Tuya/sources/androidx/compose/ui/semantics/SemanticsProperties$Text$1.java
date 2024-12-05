package androidx.compose.ui.semantics;

import M5.AbstractC1246t;
import X5.n;
import androidx.compose.ui.text.AnnotatedString;
import java.util.List;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class SemanticsProperties$Text$1 extends AbstractC3160z implements n {
    public static final SemanticsProperties$Text$1 INSTANCE = new SemanticsProperties$Text$1();

    SemanticsProperties$Text$1() {
        super(2);
    }

    @Override // X5.n
    public final List<AnnotatedString> invoke(List<AnnotatedString> list, List<AnnotatedString> list2) {
        List<AnnotatedString> Z02;
        if (list == null || (Z02 = AbstractC1246t.Z0(list)) == null) {
            return list2;
        }
        Z02.addAll(list2);
        return Z02;
    }
}
