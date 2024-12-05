package androidx.customview.poolingcontainer;

import P5.AbstractC1378t;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class PoolingContainerListenerHolder {
    private final ArrayList<PoolingContainerListener> listeners = new ArrayList<>();

    public final void addListener(PoolingContainerListener listener) {
        AbstractC3255y.i(listener, "listener");
        this.listeners.add(listener);
    }

    public final void onRelease() {
        for (int o8 = AbstractC1378t.o(this.listeners); -1 < o8; o8--) {
            this.listeners.get(o8).onRelease();
        }
    }

    public final void removeListener(PoolingContainerListener listener) {
        AbstractC3255y.i(listener, "listener");
        this.listeners.remove(listener);
    }
}
