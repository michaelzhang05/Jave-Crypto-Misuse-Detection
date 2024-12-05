package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import i6.InterfaceC2998g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ValueElementSequence implements InterfaceC2998g {
    public static final int $stable = 8;
    private final List<ValueElement> elements = new ArrayList();

    @Override // i6.InterfaceC2998g
    public Iterator<ValueElement> iterator() {
        return this.elements.iterator();
    }

    public final void set(String str, Object obj) {
        this.elements.add(new ValueElement(str, obj));
    }
}
