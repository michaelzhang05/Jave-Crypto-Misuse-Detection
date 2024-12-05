package androidx.compose.ui;

import X5.n;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class CombinedModifier$toString$1 extends AbstractC3160z implements n {
    public static final CombinedModifier$toString$1 INSTANCE = new CombinedModifier$toString$1();

    CombinedModifier$toString$1() {
        super(2);
    }

    @Override // X5.n
    public final String invoke(String str, Modifier.Element element) {
        if (str.length() == 0) {
            return element.toString();
        }
        return str + ", " + element;
    }
}
