package cm.aptoide.pt.home.bundles.base;

import cm.aptoide.pt.app.DownloadModel;
import cm.aptoide.pt.dataprovider.model.v7.Event;
import cm.aptoide.pt.home.bundles.base.HomeBundle;
import cm.aptoide.pt.view.app.ApplicationGraphic;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class PromotionalBundle implements HomeBundle {
    private final ApplicationGraphic app;
    private final DownloadModel downloadModel;
    private final Event event;
    private final String tag;
    private final String title;
    private final HomeBundle.BundleType type;

    public PromotionalBundle(String str, HomeBundle.BundleType bundleType, Event event, String str2, ApplicationGraphic applicationGraphic, DownloadModel downloadModel) {
        this.title = str;
        this.type = bundleType;
        this.event = event;
        this.tag = str2;
        this.app = applicationGraphic;
        this.downloadModel = downloadModel;
    }

    public ApplicationGraphic getApp() {
        return this.app;
    }

    @Override // cm.aptoide.pt.home.bundles.base.HomeBundle
    public List<?> getContent() {
        if (this.app != null) {
            return Collections.emptyList();
        }
        return null;
    }

    public DownloadModel getDownloadModel() {
        return this.downloadModel;
    }

    @Override // cm.aptoide.pt.home.bundles.base.HomeBundle
    public Event getEvent() {
        return this.event;
    }

    @Override // cm.aptoide.pt.home.bundles.base.HomeBundle
    public String getTag() {
        return this.tag;
    }

    @Override // cm.aptoide.pt.home.bundles.base.HomeBundle
    public String getTitle() {
        return this.title;
    }

    @Override // cm.aptoide.pt.home.bundles.base.HomeBundle
    public HomeBundle.BundleType getType() {
        return this.type;
    }
}
