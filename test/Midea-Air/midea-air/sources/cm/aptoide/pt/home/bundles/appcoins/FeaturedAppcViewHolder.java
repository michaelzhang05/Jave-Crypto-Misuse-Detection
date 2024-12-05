package cm.aptoide.pt.home.bundles.appcoins;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.aptoideviews.appcoins.BonusAppcView;
import cm.aptoide.aptoideviews.common.StringUtilsKt;
import cm.aptoide.aptoideviews.skeleton.Skeleton;
import cm.aptoide.aptoideviews.skeleton.SkeletonUtils;
import cm.aptoide.aptoideviews.skeleton.SkeletonView;
import cm.aptoide.pt.R;
import cm.aptoide.pt.dataprovider.model.v7.Type;
import cm.aptoide.pt.home.bundles.base.AppBundleViewHolder;
import cm.aptoide.pt.home.bundles.base.FeaturedAppcBundle;
import cm.aptoide.pt.home.bundles.base.HomeBundle;
import cm.aptoide.pt.home.bundles.base.HomeEvent;
import cm.aptoide.pt.utils.AptoideUtils;
import cm.aptoide.pt.view.app.Application;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* compiled from: FeaturedAppcViewHolder.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u001a\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcm/aptoide/pt/home/bundles/appcoins/FeaturedAppcViewHolder;", "Lcm/aptoide/pt/home/bundles/base/AppBundleViewHolder;", "view", "Landroid/view/View;", "oneDecimalFormatter", "Ljava/text/DecimalFormat;", "uiEventsListener", "Lrx/subjects/PublishSubject;", "Lcm/aptoide/pt/home/bundles/base/HomeEvent;", "(Landroid/view/View;Ljava/text/DecimalFormat;Lrx/subjects/PublishSubject;)V", "appsInBundleAdapter", "Lcm/aptoide/pt/home/bundles/appcoins/FeaturedAppcBundleAdapter;", "getOneDecimalFormatter", "()Ljava/text/DecimalFormat;", "skeleton", "Lcm/aptoide/aptoideviews/skeleton/Skeleton;", "getUiEventsListener", "()Lrx/subjects/PublishSubject;", "getView", "()Landroid/view/View;", "setBundle", HttpUrl.FRAGMENT_ENCODE_SET, "homeBundle", "Lcm/aptoide/pt/home/bundles/base/HomeBundle;", "position", HttpUrl.FRAGMENT_ENCODE_SET, "toggleSkeleton", "showSkeleton", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FeaturedAppcViewHolder extends AppBundleViewHolder {
    private final FeaturedAppcBundleAdapter appsInBundleAdapter;
    private final DecimalFormat oneDecimalFormatter;
    private Skeleton skeleton;
    private final rx.s.b<HomeEvent> uiEventsListener;
    private final View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeaturedAppcViewHolder(View view, DecimalFormat decimalFormat, rx.s.b<HomeEvent> bVar) {
        super(view);
        l.f(view, "view");
        l.f(decimalFormat, "oneDecimalFormatter");
        l.f(bVar, "uiEventsListener");
        this.view = view;
        this.oneDecimalFormatter = decimalFormat;
        this.uiEventsListener = bVar;
        FeaturedAppcBundleAdapter featuredAppcBundleAdapter = new FeaturedAppcBundleAdapter(new ArrayList(), decimalFormat, bVar);
        this.appsInBundleAdapter = featuredAppcBundleAdapter;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), 0, false);
        View view2 = this.itemView;
        int i2 = R.id.apps_list;
        ((RecyclerView) view2.findViewById(i2)).addItemDecoration(new RecyclerView.n() { // from class: cm.aptoide.pt.home.bundles.appcoins.FeaturedAppcViewHolder.1
            @Override // androidx.recyclerview.widget.RecyclerView.n
            public void getItemOffsets(Rect rect, View view3, RecyclerView recyclerView, RecyclerView.z zVar) {
                l.f(rect, "outRect");
                l.f(view3, "view");
                l.f(recyclerView, "parent");
                l.f(zVar, "state");
                int pixelsForDip = AptoideUtils.ScreenU.getPixelsForDip(5, view3.getResources());
                rect.set(pixelsForDip, pixelsForDip, 0, pixelsForDip);
            }
        });
        ((RecyclerView) this.itemView.findViewById(i2)).setLayoutManager(linearLayoutManager);
        ((RecyclerView) this.itemView.findViewById(i2)).setAdapter(featuredAppcBundleAdapter);
        ((RecyclerView) this.itemView.findViewById(i2)).setNestedScrollingEnabled(false);
        Resources resources = view.getContext().getResources();
        Object systemService = view.getContext().getSystemService("window");
        if (systemService != null) {
            RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(i2);
            l.e(recyclerView, "itemView.apps_list");
            this.skeleton = SkeletonUtils.applySkeleton(recyclerView, R.layout.app_home_item_skeleton, Type.APPS_GROUP.getPerLineCount(resources, (WindowManager) systemService) * 3);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setBundle$lambda-2$lambda-0, reason: not valid java name */
    public static final void m168setBundle$lambda2$lambda0(FeaturedAppcViewHolder featuredAppcViewHolder, HomeBundle homeBundle, View view) {
        l.f(featuredAppcViewHolder, "this$0");
        featuredAppcViewHolder.uiEventsListener.onNext(new HomeEvent(homeBundle, featuredAppcViewHolder.getAdapterPosition(), HomeEvent.Type.MORE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setBundle$lambda-2$lambda-1, reason: not valid java name */
    public static final void m169setBundle$lambda2$lambda1(FeaturedAppcViewHolder featuredAppcViewHolder, HomeBundle homeBundle, View view) {
        l.f(featuredAppcViewHolder, "this$0");
        featuredAppcViewHolder.uiEventsListener.onNext(new HomeEvent(homeBundle, featuredAppcViewHolder.getAdapterPosition(), HomeEvent.Type.APPC_KNOW_MORE));
    }

    private final void toggleSkeleton(boolean showSkeleton) {
        if (showSkeleton) {
            Skeleton skeleton = this.skeleton;
            if (skeleton != null) {
                skeleton.showSkeleton();
            }
            ((SkeletonView) this.itemView.findViewById(R.id.title_skeletonview)).setVisibility(0);
            ((TextView) this.itemView.findViewById(R.id.title)).setVisibility(4);
            ((SkeletonView) this.itemView.findViewById(R.id.description_skeletonview)).setVisibility(0);
            ((TextView) this.itemView.findViewById(R.id.description)).setVisibility(4);
            ((BonusAppcView) this.itemView.findViewById(R.id.bonus_appc_view)).setVisibility(4);
            ((SkeletonView) this.itemView.findViewById(R.id.bonus_appc_skeleton_view)).setVisibility(0);
            return;
        }
        Skeleton skeleton2 = this.skeleton;
        if (skeleton2 != null) {
            skeleton2.showOriginal();
        }
        ((SkeletonView) this.itemView.findViewById(R.id.title_skeletonview)).setVisibility(4);
        ((TextView) this.itemView.findViewById(R.id.title)).setVisibility(0);
        ((SkeletonView) this.itemView.findViewById(R.id.description_skeletonview)).setVisibility(4);
        ((TextView) this.itemView.findViewById(R.id.description)).setVisibility(0);
        ((BonusAppcView) this.itemView.findViewById(R.id.bonus_appc_view)).setVisibility(0);
        ((SkeletonView) this.itemView.findViewById(R.id.bonus_appc_skeleton_view)).setVisibility(4);
    }

    public final DecimalFormat getOneDecimalFormatter() {
        return this.oneDecimalFormatter;
    }

    public final rx.s.b<HomeEvent> getUiEventsListener() {
        return this.uiEventsListener;
    }

    public final View getView() {
        return this.view;
    }

    @Override // cm.aptoide.pt.home.bundles.base.AppBundleViewHolder
    public void setBundle(final HomeBundle homeBundle, int position) {
        boolean z = homeBundle instanceof FeaturedAppcBundle;
        if (z) {
            FeaturedAppcBundle featuredAppcBundle = z ? (FeaturedAppcBundle) homeBundle : null;
            if (featuredAppcBundle != null) {
                FeaturedAppcBundle featuredAppcBundle2 = (FeaturedAppcBundle) homeBundle;
                if (featuredAppcBundle2.getContent() != null && featuredAppcBundle2.getBonusPercentage() != -1) {
                    toggleSkeleton(false);
                    ((BonusAppcView) this.itemView.findViewById(R.id.bonus_appc_view)).setPercentage(featuredAppcBundle.getBonusPercentage());
                    ((TextView) this.itemView.findViewById(R.id.title)).setText(this.itemView.getContext().getString(R.string.incentives_banner_title, String.valueOf(featuredAppcBundle.getBonusPercentage())));
                    TextView textView = (TextView) this.itemView.findViewById(R.id.description);
                    String string = this.itemView.getResources().getString(R.string.incentives_banner_body);
                    l.e(string, "itemView.resources.getSt…g.incentives_banner_body)");
                    Resources resources = this.itemView.getResources();
                    l.e(resources, "itemView.resources");
                    textView.setText(StringUtilsKt.formatWithHtmlImage(string, R.drawable.ic_spend_appc, 24, 20, resources));
                    this.appsInBundleAdapter.updateBundle(homeBundle, position);
                    FeaturedAppcBundleAdapter featuredAppcBundleAdapter = this.appsInBundleAdapter;
                    List<Application> apps = featuredAppcBundle2.getApps();
                    l.e(apps, "homeBundle.apps");
                    featuredAppcBundleAdapter.update(apps);
                    ((RecyclerView) this.itemView.findViewById(R.id.apps_list)).addOnScrollListener(new RecyclerView.t() { // from class: cm.aptoide.pt.home.bundles.appcoins.FeaturedAppcViewHolder$setBundle$1$1
                        @Override // androidx.recyclerview.widget.RecyclerView.t
                        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                            l.f(recyclerView, "recyclerView");
                            super.onScrolled(recyclerView, dx, dy);
                            if (dx > 0) {
                                FeaturedAppcViewHolder.this.getUiEventsListener().onNext(new HomeEvent(homeBundle, FeaturedAppcViewHolder.this.getAdapterPosition(), HomeEvent.Type.SCROLL_RIGHT));
                            }
                        }
                    });
                    ((Button) this.itemView.findViewById(R.id.see_more_btn)).setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.bundles.appcoins.e
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            FeaturedAppcViewHolder.m168setBundle$lambda2$lambda0(FeaturedAppcViewHolder.this, homeBundle, view);
                        }
                    });
                    ((CardView) this.itemView.findViewById(R.id.featured_appc_card)).setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.bundles.appcoins.d
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            FeaturedAppcViewHolder.m169setBundle$lambda2$lambda1(FeaturedAppcViewHolder.this, homeBundle, view);
                        }
                    });
                    return;
                }
                toggleSkeleton(true);
                return;
            }
            return;
        }
        throw new IllegalStateException(FeaturedAppcViewHolder.class.getName() + " is getting non FeaturedAppcBundle instance!");
    }
}
