package cm.aptoide.pt.home.bundles.misc;

import cm.aptoide.pt.home.bundles.base.DummyBundle;
import cm.aptoide.pt.home.bundles.base.HomeBundle;

/* loaded from: classes.dex */
public class ProgressBundle extends DummyBundle {
    @Override // cm.aptoide.pt.home.bundles.base.DummyBundle, cm.aptoide.pt.home.bundles.base.HomeBundle
    public HomeBundle.BundleType getType() {
        return HomeBundle.BundleType.LOADING;
    }
}
