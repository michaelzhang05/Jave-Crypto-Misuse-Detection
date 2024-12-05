package androidx.compose.ui;

import a6.InterfaceC1668n;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class CombinedModifier$toString$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final CombinedModifier$toString$1 INSTANCE = new CombinedModifier$toString$1();

    CombinedModifier$toString$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public final String invoke(String str, Modifier.Element element) {
        if (str.length() == 0) {
            return element.toString();
        }
        return str + ", " + element;
    }
}
