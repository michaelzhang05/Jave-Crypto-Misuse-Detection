package androidx.lifecycle;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class SavedStateHandlesVM extends ViewModel {
    private final Map<String, SavedStateHandle> handles = new LinkedHashMap();

    public final Map<String, SavedStateHandle> getHandles() {
        return this.handles;
    }
}
