package cm.aptoide.pt.home.apps.list;

import cm.aptoide.pt.R;
import cm.aptoide.pt.database.room.RoomStore;
import cm.aptoide.pt.home.apps.AppClick;
import cm.aptoide.pt.home.apps.list.models.DownloadCardModel_;
import cm.aptoide.pt.home.apps.list.models.InstalledCardModel_;
import cm.aptoide.pt.home.apps.list.models.TitleModel_;
import cm.aptoide.pt.home.apps.list.models.UpdateCardModel_;
import cm.aptoide.pt.home.apps.model.DownloadApp;
import cm.aptoide.pt.home.apps.model.InstalledApp;
import cm.aptoide.pt.home.apps.model.UpdateApp;
import cm.aptoide.pt.themes.ThemeManager;
import com.airbnb.epoxy.Typed3EpoxyController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;
import rx.s.b;

/* compiled from: AppsController.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u0001B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ2\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0014J2\u0010\u0018\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0016R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u0019"}, d2 = {"Lcm/aptoide/pt/home/apps/list/AppsController;", "Lcom/airbnb/epoxy/Typed3EpoxyController;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/pt/home/apps/model/UpdateApp;", "Lcm/aptoide/pt/home/apps/model/InstalledApp;", "Lcm/aptoide/pt/home/apps/model/DownloadApp;", "themeManager", "Lcm/aptoide/pt/themes/ThemeManager;", "(Lcm/aptoide/pt/themes/ThemeManager;)V", "appEventListener", "Lrx/subjects/PublishSubject;", "Lcm/aptoide/pt/home/apps/AppClick;", "getAppEventListener", "()Lrx/subjects/PublishSubject;", "getThemeManager", "()Lcm/aptoide/pt/themes/ThemeManager;", "updateAllEvent", "Ljava/lang/Void;", "getUpdateAllEvent", "buildModels", HttpUrl.FRAGMENT_ENCODE_SET, "updates", "installedApps", RoomStore.DOWNLOADS, "setData", "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppsController extends Typed3EpoxyController<List<? extends UpdateApp>, List<? extends InstalledApp>, List<? extends DownloadApp>> {
    private final b<AppClick> appEventListener;
    private final ThemeManager themeManager;
    private final b<Void> updateAllEvent;

    public AppsController(ThemeManager themeManager) {
        l.f(themeManager, "themeManager");
        this.themeManager = themeManager;
        b<AppClick> g1 = b.g1();
        l.e(g1, "create()");
        this.appEventListener = g1;
        b<Void> g12 = b.g1();
        l.e(g12, "create()");
        this.updateAllEvent = g12;
    }

    @Override // com.airbnb.epoxy.Typed3EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends UpdateApp> list, List<? extends InstalledApp> list2, List<? extends DownloadApp> list3) {
        buildModels2((List<UpdateApp>) list, list2, (List<DownloadApp>) list3);
    }

    public final b<AppClick> getAppEventListener() {
        return this.appEventListener;
    }

    public final ThemeManager getThemeManager() {
        return this.themeManager;
    }

    public final b<Void> getUpdateAllEvent() {
        return this.updateAllEvent;
    }

    @Override // com.airbnb.epoxy.Typed3EpoxyController
    public /* bridge */ /* synthetic */ void setData(List<? extends UpdateApp> list, List<? extends InstalledApp> list2, List<? extends DownloadApp> list3) {
        setData2((List<UpdateApp>) list, list2, (List<DownloadApp>) list3);
    }

    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    protected void buildModels2(List<UpdateApp> updates, List<? extends InstalledApp> installedApps, List<DownloadApp> downloads) {
        l.f(updates, "updates");
        l.f(installedApps, "installedApps");
        l.f(downloads, RoomStore.DOWNLOADS);
        new TitleModel_().id((CharSequence) RoomStore.DOWNLOADS, "header").title(Integer.valueOf(R.string.apps_title_downloads_header)).shouldShowButton(false).addIf(!downloads.isEmpty(), this);
        for (DownloadApp downloadApp : downloads) {
            new DownloadCardModel_().id((CharSequence) RoomStore.DOWNLOADS, downloadApp.getIdentifier()).application(downloadApp).eventSubject(this.appEventListener).addTo(this);
        }
        new TitleModel_().id((CharSequence) "updates", "header").title(Integer.valueOf(R.string.apps_title_updates_header)).shouldShowButton(true).eventSubject(this.updateAllEvent).addIf(!updates.isEmpty(), this);
        for (UpdateApp updateApp : updates) {
            new UpdateCardModel_().id((CharSequence) "updates", updateApp.getIdentifier()).application(updateApp).eventSubject(this.appEventListener).themeManager(this.themeManager).addTo(this);
        }
        new TitleModel_().id((CharSequence) "installed", "header").title(Integer.valueOf(R.string.apps_title_installed_apps_header)).shouldShowButton(false).addIf(!installedApps.isEmpty(), this);
        for (InstalledApp installedApp : installedApps) {
            new InstalledCardModel_().id((CharSequence) "installed", installedApp.getIdentifier()).application(installedApp).addTo(this);
        }
    }

    /* renamed from: setData, reason: avoid collision after fix types in other method */
    public void setData2(List<UpdateApp> updates, List<? extends InstalledApp> installedApps, List<DownloadApp> downloads) {
        l.f(updates, "updates");
        l.f(installedApps, "installedApps");
        l.f(downloads, RoomStore.DOWNLOADS);
        super.setData((AppsController) updates, (List<UpdateApp>) installedApps, (List<? extends InstalledApp>) downloads);
    }
}
