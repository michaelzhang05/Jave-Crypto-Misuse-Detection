package cm.aptoide.pt.download.view.outofspace;

import com.airbnb.epoxy.TypedEpoxyController;
import java.util.List;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: OutOfSpaceController.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/pt/download/view/outofspace/InstalledApp;", "()V", "uninstallEvent", "Lrx/subjects/PublishSubject;", HttpUrl.FRAGMENT_ENCODE_SET, "getUninstallEvent", "()Lrx/subjects/PublishSubject;", "buildModels", HttpUrl.FRAGMENT_ENCODE_SET, "installedApps", "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OutOfSpaceController extends TypedEpoxyController<List<? extends InstalledApp>> {
    private final rx.s.b<String> uninstallEvent;

    public OutOfSpaceController() {
        rx.s.b<String> g1 = rx.s.b.g1();
        kotlin.jvm.internal.l.e(g1, "create()");
        this.uninstallEvent = g1;
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends InstalledApp> list) {
        buildModels2((List<InstalledApp>) list);
    }

    public final rx.s.b<String> getUninstallEvent() {
        return this.uninstallEvent;
    }

    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    protected void buildModels2(List<InstalledApp> installedApps) {
        kotlin.jvm.internal.l.f(installedApps, "installedApps");
        for (InstalledApp installedApp : installedApps) {
            new InstalledAppCardModel_().id((CharSequence) "installed", installedApp.getIdentifier()).eventSubject(this.uninstallEvent).application(installedApp).addTo(this);
        }
    }
}
