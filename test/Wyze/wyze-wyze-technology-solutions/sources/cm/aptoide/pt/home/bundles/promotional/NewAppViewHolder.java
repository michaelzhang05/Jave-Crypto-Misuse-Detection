package cm.aptoide.pt.home.bundles.promotional;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import cm.aptoide.aptoideviews.appcoins.BonusAppcView;
import cm.aptoide.aptoideviews.skeleton.Skeleton;
import cm.aptoide.aptoideviews.skeleton.SkeletonView;
import cm.aptoide.pt.R;
import cm.aptoide.pt.app.DownloadModel;
import cm.aptoide.pt.home.bundles.base.AppBundleViewHolder;
import cm.aptoide.pt.home.bundles.base.AppHomeEvent;
import cm.aptoide.pt.home.bundles.base.BonusPromotionalBundle;
import cm.aptoide.pt.home.bundles.base.HomeBundle;
import cm.aptoide.pt.home.bundles.base.HomeEvent;
import cm.aptoide.pt.home.bundles.base.PromotionalBundle;
import cm.aptoide.pt.networking.image.ImageLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* compiled from: NewAppViewHolder.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u001a\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, d2 = {"Lcm/aptoide/pt/home/bundles/promotional/NewAppViewHolder;", "Lcm/aptoide/pt/home/bundles/base/AppBundleViewHolder;", "view", "Landroid/view/View;", "uiEventsListener", "Lrx/subjects/PublishSubject;", "Lcm/aptoide/pt/home/bundles/base/HomeEvent;", "(Landroid/view/View;Lrx/subjects/PublishSubject;)V", "skeleton", "Lcm/aptoide/aptoideviews/skeleton/Skeleton;", "getUiEventsListener", "()Lrx/subjects/PublishSubject;", "getView", "()Landroid/view/View;", "fireAppClickEvent", HttpUrl.FRAGMENT_ENCODE_SET, "homeBundle", "Lcm/aptoide/pt/home/bundles/base/PromotionalBundle;", "setBundle", "Lcm/aptoide/pt/home/bundles/base/HomeBundle;", "position", HttpUrl.FRAGMENT_ENCODE_SET, "setButtonText", "model", "Lcm/aptoide/pt/app/DownloadModel;", "toggleSkeleton", "showSkeleton", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NewAppViewHolder extends AppBundleViewHolder {
    private Skeleton skeleton;
    private final rx.s.b<HomeEvent> uiEventsListener;
    private final View view;

    /* compiled from: NewAppViewHolder.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DownloadModel.Action.values().length];
            iArr[DownloadModel.Action.UPDATE.ordinal()] = 1;
            iArr[DownloadModel.Action.INSTALL.ordinal()] = 2;
            iArr[DownloadModel.Action.OPEN.ordinal()] = 3;
            iArr[DownloadModel.Action.DOWNGRADE.ordinal()] = 4;
            iArr[DownloadModel.Action.MIGRATE.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewAppViewHolder(View view, rx.s.b<HomeEvent> bVar) {
        super(view);
        l.f(view, "view");
        l.f(bVar, "uiEventsListener");
        this.view = view;
        this.uiEventsListener = bVar;
    }

    private final void fireAppClickEvent(PromotionalBundle homeBundle) {
        this.uiEventsListener.onNext(new AppHomeEvent(homeBundle.getApp(), 0, homeBundle, getAdapterPosition(), HomeEvent.Type.INSTALL_PROMOTIONAL));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setBundle$lambda-2$lambda-0, reason: not valid java name */
    public static final void m175setBundle$lambda2$lambda0(NewAppViewHolder newAppViewHolder, HomeBundle homeBundle, View view) {
        l.f(newAppViewHolder, "this$0");
        newAppViewHolder.fireAppClickEvent((PromotionalBundle) homeBundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setBundle$lambda-2$lambda-1, reason: not valid java name */
    public static final void m176setBundle$lambda2$lambda1(NewAppViewHolder newAppViewHolder, HomeBundle homeBundle, View view) {
        l.f(newAppViewHolder, "this$0");
        newAppViewHolder.fireAppClickEvent((PromotionalBundle) homeBundle);
    }

    private final void setButtonText(DownloadModel model) {
        DownloadModel.Action action = model.getAction();
        int i2 = action == null ? -1 : WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
        if (i2 == 1) {
            ((Button) this.itemView.findViewById(R.id.action_button)).setText(this.itemView.getResources().getString(R.string.appview_button_update));
            return;
        }
        if (i2 == 2) {
            ((Button) this.itemView.findViewById(R.id.action_button)).setText(this.itemView.getResources().getString(R.string.appview_button_install));
            return;
        }
        if (i2 == 3) {
            ((Button) this.itemView.findViewById(R.id.action_button)).setText(this.itemView.getResources().getString(R.string.appview_button_open));
        } else if (i2 == 4) {
            ((Button) this.itemView.findViewById(R.id.action_button)).setText(this.itemView.getResources().getString(R.string.appview_button_downgrade));
        } else {
            if (i2 != 5) {
                return;
            }
            ((Button) this.itemView.findViewById(R.id.action_button)).setText(this.itemView.getResources().getString(R.string.promo_update2appc_appview_update_button));
        }
    }

    private final void toggleSkeleton(boolean showSkeleton) {
        if (showSkeleton) {
            Skeleton skeleton = this.skeleton;
            if (skeleton != null) {
                skeleton.showSkeleton();
            }
            ((SkeletonView) this.itemView.findViewById(R.id.card_title_label_skeletonview)).setVisibility(0);
            ((CardView) this.itemView.findViewById(R.id.card_title_label)).setVisibility(4);
            ((SkeletonView) this.itemView.findViewById(R.id.app_icon_skeletonview)).setVisibility(0);
            ((ImageView) this.itemView.findViewById(R.id.app_icon)).setVisibility(4);
            ((SkeletonView) this.itemView.findViewById(R.id.app_name_skeletonview)).setVisibility(0);
            ((TextView) this.itemView.findViewById(R.id.app_name)).setVisibility(4);
            ((SkeletonView) this.itemView.findViewById(R.id.bonus_appc_skeleton_view)).setVisibility(0);
            ((SkeletonView) this.itemView.findViewById(R.id.appcoins_icon_skeleton)).setVisibility(0);
            ((ImageView) this.itemView.findViewById(R.id.appcoins_icon)).setVisibility(4);
            ((SkeletonView) this.itemView.findViewById(R.id.appcoins_system_text_skeleton_1)).setVisibility(0);
            ((SkeletonView) this.itemView.findViewById(R.id.appcoins_system_text_skeleton_2)).setVisibility(0);
            ((TextView) this.itemView.findViewById(R.id.appcoins_system_text)).setVisibility(4);
            ((SkeletonView) this.itemView.findViewById(R.id.action_button_skeleton)).setVisibility(0);
            ((Button) this.itemView.findViewById(R.id.action_button)).setVisibility(4);
            return;
        }
        Skeleton skeleton2 = this.skeleton;
        if (skeleton2 != null) {
            skeleton2.showOriginal();
        }
        ((SkeletonView) this.itemView.findViewById(R.id.card_title_label_skeletonview)).setVisibility(4);
        ((SkeletonView) this.itemView.findViewById(R.id.app_icon_skeletonview)).setVisibility(4);
        ((ImageView) this.itemView.findViewById(R.id.app_icon)).setVisibility(0);
        ((SkeletonView) this.itemView.findViewById(R.id.app_name_skeletonview)).setVisibility(4);
        ((TextView) this.itemView.findViewById(R.id.app_name)).setVisibility(0);
        ((SkeletonView) this.itemView.findViewById(R.id.bonus_appc_skeleton_view)).setVisibility(4);
        ((SkeletonView) this.itemView.findViewById(R.id.appcoins_icon_skeleton)).setVisibility(4);
        ((ImageView) this.itemView.findViewById(R.id.appcoins_icon)).setVisibility(0);
        ((SkeletonView) this.itemView.findViewById(R.id.appcoins_system_text_skeleton_1)).setVisibility(4);
        ((SkeletonView) this.itemView.findViewById(R.id.appcoins_system_text_skeleton_2)).setVisibility(4);
        ((TextView) this.itemView.findViewById(R.id.appcoins_system_text)).setVisibility(0);
        ((SkeletonView) this.itemView.findViewById(R.id.action_button_skeleton)).setVisibility(4);
        ((Button) this.itemView.findViewById(R.id.action_button)).setVisibility(0);
    }

    public final rx.s.b<HomeEvent> getUiEventsListener() {
        return this.uiEventsListener;
    }

    public final View getView() {
        return this.view;
    }

    @Override // cm.aptoide.pt.home.bundles.base.AppBundleViewHolder
    public void setBundle(final HomeBundle homeBundle, int position) {
        boolean z = homeBundle instanceof BonusPromotionalBundle;
        if (z) {
            BonusPromotionalBundle bonusPromotionalBundle = z ? (BonusPromotionalBundle) homeBundle : null;
            if (bonusPromotionalBundle != null) {
                BonusPromotionalBundle bonusPromotionalBundle2 = (BonusPromotionalBundle) homeBundle;
                if (bonusPromotionalBundle2.getContent() == null) {
                    toggleSkeleton(true);
                    return;
                }
                toggleSkeleton(false);
                ImageLoader.with(this.itemView.getContext()).loadWithRoundCorners(bonusPromotionalBundle2.getApp().getIcon(), 32, (ImageView) this.itemView.findViewById(R.id.app_icon), R.attr.placeholder_square);
                ((TextView) this.itemView.findViewById(R.id.card_title_label_text)).setText(bonusPromotionalBundle2.getTitle());
                ImageLoader.with(this.itemView.getContext()).load(bonusPromotionalBundle2.getApp().getFeatureGraphic(), (ImageView) this.itemView.findViewById(R.id.app_background_image));
                ((TextView) this.itemView.findViewById(R.id.app_name)).setText(bonusPromotionalBundle2.getApp().getName());
                View view = this.itemView;
                int i2 = R.id.bonus_appc_view;
                ((BonusAppcView) view.findViewById(i2)).setPercentage(bonusPromotionalBundle.getBonusPercentage());
                if (!bonusPromotionalBundle.getApp().hasAppcBilling()) {
                    ((BonusAppcView) this.itemView.findViewById(i2)).setVisibility(4);
                    ((ImageView) this.itemView.findViewById(R.id.appcoins_icon)).setImageDrawable(this.itemView.getContext().getResources().getDrawable(R.mipmap.ic_launcher));
                    ((TextView) this.itemView.findViewById(R.id.appcoins_system_text)).setText(this.itemView.getContext().getText(R.string.promotional_new_in_aptoide));
                    ((CardView) this.itemView.findViewById(R.id.card_title_label)).setVisibility(0);
                } else {
                    ((Button) this.itemView.findViewById(R.id.action_button)).setBackgroundDrawable(this.itemView.getContext().getResources().getDrawable(R.drawable.appc_gradient_rounded));
                }
                ((Button) this.itemView.findViewById(R.id.action_button)).setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.bundles.promotional.g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        NewAppViewHolder.m175setBundle$lambda2$lambda0(NewAppViewHolder.this, homeBundle, view2);
                    }
                });
                this.itemView.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.bundles.promotional.f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        NewAppViewHolder.m176setBundle$lambda2$lambda1(NewAppViewHolder.this, homeBundle, view2);
                    }
                });
                DownloadModel downloadModel = bonusPromotionalBundle2.getDownloadModel();
                l.e(downloadModel, "homeBundle.downloadModel");
                setButtonText(downloadModel);
                return;
            }
            return;
        }
        throw new IllegalStateException(NewAppViewHolder.class.getName() + " is getting non BonusPromotionalBundle instance!");
    }
}
