package cm.aptoide.pt.app;

import cm.aptoide.pt.ads.data.ApplicationAd;
import cm.aptoide.pt.ads.data.ApplicationAdError;
import cm.aptoide.pt.view.app.Application;
import cm.aptoide.pt.view.app.AppsList;
import java.util.List;

/* loaded from: classes.dex */
public class SimilarAppsViewModel {
    private final ApplicationAd ad;
    private final ApplicationAdError adError;
    private boolean hasRecordedAdImpression;
    private final boolean loading;
    private final List<Application> recommendedApps;
    private final AppsList.Error recommendedAppsError;

    public SimilarAppsViewModel(ApplicationAd applicationAd, List<Application> list, boolean z, AppsList.Error error, ApplicationAdError applicationAdError) {
        this.ad = applicationAd;
        this.recommendedApps = list;
        this.loading = z;
        this.recommendedAppsError = error;
        this.adError = applicationAdError;
    }

    public ApplicationAd getAd() {
        return this.ad;
    }

    public ApplicationAdError getAdError() {
        return this.adError;
    }

    public List<Application> getRecommendedApps() {
        return this.recommendedApps;
    }

    public AppsList.Error getRecommendedAppsError() {
        return this.recommendedAppsError;
    }

    public boolean hasAd() {
        return this.ad != null;
    }

    public boolean hasAdError() {
        return this.adError != null || this.ad == null;
    }

    public boolean hasError() {
        return (this.recommendedAppsError == null && this.adError == null && this.ad != null) ? false : true;
    }

    public boolean hasRecommendedAppsError() {
        return this.recommendedAppsError != null;
    }

    public boolean hasRecordedAdImpression() {
        return this.hasRecordedAdImpression;
    }

    public boolean hasSimilarApps() {
        return (hasRecommendedAppsError() || this.recommendedApps.isEmpty()) ? false : true;
    }

    public boolean isLoading() {
        return this.loading;
    }

    public void setHasRecordedAdImpression(boolean z) {
        this.hasRecordedAdImpression = z;
    }
}
