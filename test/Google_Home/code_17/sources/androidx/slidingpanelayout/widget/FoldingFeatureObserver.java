package androidx.slidingpanelayout.widget;

import android.app.Activity;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.AbstractC3375p0;
import l6.InterfaceC3390x0;
import l6.N;

/* loaded from: classes3.dex */
public final class FoldingFeatureObserver {
    private final Executor executor;
    private InterfaceC3390x0 job;
    private OnFoldingFeatureChangeListener onFoldingFeatureChangeListener;
    private final WindowInfoTracker windowInfoTracker;

    /* loaded from: classes3.dex */
    public interface OnFoldingFeatureChangeListener {
        void onFoldingFeatureChange(FoldingFeature foldingFeature);
    }

    public FoldingFeatureObserver(WindowInfoTracker windowInfoTracker, Executor executor) {
        AbstractC3255y.i(windowInfoTracker, "windowInfoTracker");
        AbstractC3255y.i(executor, "executor");
        this.windowInfoTracker = windowInfoTracker;
        this.executor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FoldingFeature getFoldingFeature(WindowLayoutInfo windowLayoutInfo) {
        Object obj;
        Iterator<T> it = windowLayoutInfo.getDisplayFeatures().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((DisplayFeature) obj) instanceof FoldingFeature) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (!(obj instanceof FoldingFeature)) {
            return null;
        }
        return (FoldingFeature) obj;
    }

    public final void registerLayoutStateChangeCallback(Activity activity) {
        InterfaceC3390x0 d8;
        AbstractC3255y.i(activity, "activity");
        InterfaceC3390x0 interfaceC3390x0 = this.job;
        if (interfaceC3390x0 != null) {
            InterfaceC3390x0.a.a(interfaceC3390x0, null, 1, null);
        }
        d8 = AbstractC3364k.d(N.a(AbstractC3375p0.a(this.executor)), null, null, new FoldingFeatureObserver$registerLayoutStateChangeCallback$1(this, activity, null), 3, null);
        this.job = d8;
    }

    public final void setOnFoldingFeatureChangeListener(OnFoldingFeatureChangeListener onFoldingFeatureChangeListener) {
        AbstractC3255y.i(onFoldingFeatureChangeListener, "onFoldingFeatureChangeListener");
        this.onFoldingFeatureChangeListener = onFoldingFeatureChangeListener;
    }

    public final void unregisterLayoutStateChangeCallback() {
        InterfaceC3390x0 interfaceC3390x0 = this.job;
        if (interfaceC3390x0 != null) {
            InterfaceC3390x0.a.a(interfaceC3390x0, null, 1, null);
        }
    }
}
