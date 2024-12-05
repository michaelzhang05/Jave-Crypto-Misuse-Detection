package cm.aptoide.pt.home.bundles.appcoins;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.pt.R;
import cm.aptoide.pt.home.bundles.apps.RewardApp;
import cm.aptoide.pt.home.bundles.base.AppBundle;
import cm.aptoide.pt.home.bundles.base.HomeBundle;
import cm.aptoide.pt.home.bundles.base.HomeEvent;
import cm.aptoide.pt.view.app.Application;
import java.text.DecimalFormat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* compiled from: EarnAppCoinsListAdapter.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u0016\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\fR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcm/aptoide/pt/home/bundles/appcoins/EarnAppCoinsListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcm/aptoide/pt/home/bundles/appcoins/EarnAppCoinsItemViewHolder;", "decimalFormatter", "Ljava/text/DecimalFormat;", "appClickedEvents", "Lrx/subjects/PublishSubject;", "Lcm/aptoide/pt/home/bundles/base/HomeEvent;", "(Ljava/text/DecimalFormat;Lrx/subjects/PublishSubject;)V", "appBundle", "Lcm/aptoide/pt/home/bundles/base/AppBundle;", "bundlePosition", HttpUrl.FRAGMENT_ENCODE_SET, "getItemCount", "onBindViewHolder", HttpUrl.FRAGMENT_ENCODE_SET, "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateBundle", "bundle", "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EarnAppCoinsListAdapter extends RecyclerView.g<EarnAppCoinsItemViewHolder> {
    private AppBundle appBundle;
    private final rx.s.b<HomeEvent> appClickedEvents;
    private int bundlePosition;
    private final DecimalFormat decimalFormatter;

    public EarnAppCoinsListAdapter(DecimalFormat decimalFormat, rx.s.b<HomeEvent> bVar) {
        l.f(decimalFormat, "decimalFormatter");
        l.f(bVar, "appClickedEvents");
        this.decimalFormatter = decimalFormat;
        this.appClickedEvents = bVar;
        this.bundlePosition = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemCount() {
        List<Application> apps;
        AppBundle appBundle = this.appBundle;
        if (appBundle == null || (apps = appBundle.getApps()) == null) {
            return 0;
        }
        return apps.size();
    }

    public final void updateBundle(AppBundle bundle, int position) {
        l.f(bundle, "bundle");
        if (bundle.getType() == HomeBundle.BundleType.APPCOINS_ADS) {
            this.appBundle = bundle;
            this.bundlePosition = position;
            return;
        }
        throw new IllegalArgumentException("Wrong bundle type");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(EarnAppCoinsItemViewHolder holder, int position) {
        l.f(holder, "holder");
        AppBundle appBundle = this.appBundle;
        l.c(appBundle);
        List<Application> apps = appBundle.getApps();
        l.c(apps);
        Application application = apps.get(position);
        if (application == null) {
            throw new NullPointerException("null cannot be cast to non-null type cm.aptoide.pt.home.bundles.apps.RewardApp");
        }
        holder.setApp((RewardApp) application, this.appBundle, this.bundlePosition);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public EarnAppCoinsItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        l.f(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.earn_appcoins_item_home, parent, false);
        l.e(inflate, "from(parent.context)\n   …item_home, parent, false)");
        return new EarnAppCoinsItemViewHolder(inflate, this.appClickedEvents, this.decimalFormatter);
    }
}
