package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import f6.InterfaceC2680g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ValueElementSequence implements InterfaceC2680g {
    public static final int $stable = 8;
    private final List<ValueElement> elements = new ArrayList();

    @Override // f6.InterfaceC2680g
    public Iterator<ValueElement> iterator() {
        return this.elements.iterator();
    }

    public final void set(String str, Object obj) {
        this.elements.add(new ValueElement(str, obj));
    }
}
