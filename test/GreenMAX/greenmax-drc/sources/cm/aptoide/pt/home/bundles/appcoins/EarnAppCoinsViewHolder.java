package cm.aptoide.pt.home.bundles.appcoins;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.aptoideviews.skeleton.Skeleton;
import cm.aptoide.aptoideviews.skeleton.SkeletonUtils;
import cm.aptoide.pt.R;
import cm.aptoide.pt.dataprovider.model.v7.Type;
import cm.aptoide.pt.home.bundles.base.AppBundle;
import cm.aptoide.pt.home.bundles.base.AppBundleViewHolder;
import cm.aptoide.pt.home.bundles.base.HomeBundle;
import cm.aptoide.pt.home.bundles.base.HomeEvent;
import cm.aptoide.pt.utils.AptoideUtils;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* compiled from: EarnAppCoinsViewHolder.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u001a\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcm/aptoide/pt/home/bundles/appcoins/EarnAppCoinsViewHolder;", "Lcm/aptoide/pt/home/bundles/base/AppBundleViewHolder;", "view", "Landroid/view/View;", "decimalFormatter", "Ljava/text/DecimalFormat;", "uiEventsListener", "Lrx/subjects/PublishSubject;", "Lcm/aptoide/pt/home/bundles/base/HomeEvent;", "(Landroid/view/View;Ljava/text/DecimalFormat;Lrx/subjects/PublishSubject;)V", "adapter", "Lcm/aptoide/pt/home/bundles/appcoins/EarnAppCoinsListAdapter;", "skeleton", "Lcm/aptoide/aptoideviews/skeleton/Skeleton;", "getUiEventsListener", "()Lrx/subjects/PublishSubject;", "getView", "()Landroid/view/View;", "setBundle", HttpUrl.FRAGMENT_ENCODE_SET, "homeBundle", "Lcm/aptoide/pt/home/bundles/base/HomeBundle;", "position", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EarnAppCoinsViewHolder extends AppBundleViewHolder {
    private EarnAppCoinsListAdapter adapter;
    private Skeleton skeleton;
    private final rx.s.b<HomeEvent> uiEventsListener;
    private final View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarnAppCoinsViewHolder(View view, DecimalFormat decimalFormat, rx.s.b<HomeEvent> bVar) {
        super(view);
        l.f(view, "view");
        l.f(decimalFormat, "decimalFormatter");
        l.f(bVar, "uiEventsListener");
        this.view = view;
        this.uiEventsListener = bVar;
        this.adapter = new EarnAppCoinsListAdapter(decimalFormat, bVar);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), 0, false);
        View view2 = this.itemView;
        int i2 = R.id.apps_list;
        ((RecyclerView) view2.findViewById(i2)).addItemDecoration(new RecyclerView.n() { // from class: cm.aptoide.pt.home.bundles.appcoins.EarnAppCoinsViewHolder.1
            @Override // androidx.recyclerview.widget.RecyclerView.n
            public void getItemOffsets(Rect rect, View view3, RecyclerView recyclerView, RecyclerView.z zVar) {
                l.f(rect, "outRect");
                l.f(view3, "view");
                l.f(recyclerView, "parent");
                l.f(zVar, "state");
                int pixelsForDip = AptoideUtils.ScreenU.getPixelsForDip(8, view3.getResources());
                rect.set(pixelsForDip, pixelsForDip, 0, AptoideUtils.ScreenU.getPixelsForDip(4, view3.getResources()));
            }
        });
        ((RecyclerView) this.itemView.findViewById(i2)).setLayoutManager(linearLayoutManager);
        ((RecyclerView) this.itemView.findViewById(i2)).setAdapter(this.adapter);
        ((RecyclerView) this.itemView.findViewById(i2)).setNestedScrollingEnabled(false);
        ((RecyclerView) this.itemView.findViewById(i2)).setHasFixedSize(true);
        Resources resources = view.getContext().getResources();
        Object systemService = view.getContext().getSystemService("window");
        if (systemService != null) {
            RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(i2);
            l.e(recyclerView, "itemView.apps_list");
            this.skeleton = SkeletonUtils.applySkeleton(recyclerView, R.layout.earn_appcoins_item_skeleton, Type.APPCOINS_ADS.getPerLineCount(resources, (WindowManager) systemService) * 3);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setBundle$lambda-0, reason: not valid java name */
    public static final void m166setBundle$lambda0(EarnAppCoinsViewHolder earnAppCoinsViewHolder, HomeBundle homeBundle, View view) {
        l.f(earnAppCoinsViewHolder, "this$0");
        earnAppCoinsViewHolder.uiEventsListener.onNext(new HomeEvent(homeBundle, earnAppCoinsViewHolder.getAdapterPosition(), HomeEvent.Type.APPC_KNOW_MORE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setBundle$lambda-1, reason: not valid java name */
    public static final void m167setBundle$lambda1(EarnAppCoinsViewHolder earnAppCoinsViewHolder, HomeBundle homeBundle, View view) {
        l.f(earnAppCoinsViewHolder, "this$0");
        earnAppCoinsViewHolder.uiEventsListener.onNext(new HomeEvent(homeBundle, earnAppCoinsViewHolder.getAdapterPosition(), HomeEvent.Type.MORE));
    }

    public final rx.s.b<HomeEvent> getUiEventsListener() {
        return this.uiEventsListener;
    }

    public final View getView() {
        return this.view;
    }

    @Override // cm.aptoide.pt.home.bundles.base.AppBundleViewHolder
    public void setBundle(final HomeBundle homeBundle, int position) {
        if (homeBundle instanceof AppBundle) {
            AppBundle appBundle = (AppBundle) homeBundle;
            if (appBundle.getContent() == null) {
                Skeleton skeleton = this.skeleton;
                if (skeleton != null) {
                    skeleton.showSkeleton();
                    return;
                }
                return;
            }
            Skeleton skeleton2 = this.skeleton;
            if (skeleton2 != null) {
                skeleton2.showOriginal();
            }
            this.adapter.updateBundle(appBundle, position);
            ((RecyclerView) this.itemView.findViewById(R.id.apps_list)).addOnScrollListener(new RecyclerView.t() { // from class: cm.aptoide.pt.home.bundles.appcoins.EarnAppCoinsViewHolder$setBundle$1
                @Override // androidx.recyclerview.widget.RecyclerView.t
                public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                    l.f(recyclerView, "recyclerView");
                    super.onScrolled(recyclerView, dx, dy);
                    if (dx > 0) {
                        EarnAppCoinsViewHolder.this.getUiEventsListener().onNext(new HomeEvent(homeBundle, EarnAppCoinsViewHolder.this.getAdapterPosition(), HomeEvent.Type.SCROLL_RIGHT));
                    }
                }
            });
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.bundles.appcoins.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EarnAppCoinsViewHolder.m166setBundle$lambda0(EarnAppCoinsViewHolder.this, homeBundle, view);
                }
            });
            ((Button) this.itemView.findViewById(R.id.see_more_btn)).setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.bundles.appcoins.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EarnAppCoinsViewHolder.m167setBundle$lambda1(EarnAppCoinsViewHolder.this, homeBundle, view);
                }
            });
            return;
        }
        throw new IllegalStateException(EarnAppCoinsViewHolder.class.getName() + " is getting non AppBundle instance!");
    }
}
