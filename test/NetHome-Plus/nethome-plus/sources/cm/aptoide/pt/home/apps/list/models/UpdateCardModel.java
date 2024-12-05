package cm.aptoide.pt.home.apps.list.models;

import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import cm.aptoide.aptoideviews.downloadprogressview.DownloadEventListener;
import cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView;
import cm.aptoide.pt.R;
import cm.aptoide.pt.home.apps.AppClick;
import cm.aptoide.pt.home.apps.model.StateApp;
import cm.aptoide.pt.home.apps.model.UpdateApp;
import cm.aptoide.pt.networking.image.ImageLoader;
import cm.aptoide.pt.themes.ThemeManager;
import com.airbnb.epoxy.s;
import com.airbnb.epoxy.t;
import e.c.a.a.a.base.BaseViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import okhttp3.HttpUrl;

/* compiled from: UpdateCardModel.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\u001c\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0005H\u0002J(\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0002J\u0018\u0010\"\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0005H\u0002R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcm/aptoide/pt/home/apps/list/models/UpdateCardModel;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lcm/aptoide/pt/home/apps/list/models/UpdateCardModel$CardHolder;", "()V", "application", "Lcm/aptoide/pt/home/apps/model/UpdateApp;", "getApplication", "()Lcm/aptoide/pt/home/apps/model/UpdateApp;", "setApplication", "(Lcm/aptoide/pt/home/apps/model/UpdateApp;)V", "eventSubject", "Lrx/subjects/PublishSubject;", "Lcm/aptoide/pt/home/apps/AppClick;", "getEventSubject", "()Lrx/subjects/PublishSubject;", "setEventSubject", "(Lrx/subjects/PublishSubject;)V", "themeManager", "Lcm/aptoide/pt/themes/ThemeManager;", "getThemeManager", "()Lcm/aptoide/pt/themes/ThemeManager;", "setThemeManager", "(Lcm/aptoide/pt/themes/ThemeManager;)V", "bind", HttpUrl.FRAGMENT_ENCODE_SET, "holder", "previouslyBoundModel", "Lcom/airbnb/epoxy/EpoxyModel;", "processDownload", "app", "setDownloadViewVisibility", "visible", HttpUrl.FRAGMENT_ENCODE_SET, "error", "setupListeners", "CardHolder", "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class UpdateCardModel extends t<CardHolder> {
    private UpdateApp application;
    private rx.s.b<AppClick> eventSubject;
    private ThemeManager themeManager;

    /* compiled from: UpdateCardModel.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\u001b\u0010\f\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\b\u001a\u0004\b\u001c\u0010\u0006R\u001b\u0010\u001e\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\b\u001a\u0004\b\u001f\u0010\u0014R\u001b\u0010!\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\b\u001a\u0004\b\"\u0010\u0014¨\u0006$"}, d2 = {"Lcm/aptoide/pt/home/apps/list/models/UpdateCardModel$CardHolder;", "Lcom/fa/epoxysample/bundles/models/base/BaseViewHolder;", "()V", "actionButton", "Landroid/widget/ImageView;", "getActionButton", "()Landroid/widget/ImageView;", "actionButton$delegate", "Lkotlin/properties/ReadOnlyProperty;", "appIcon", "getAppIcon", "appIcon$delegate", "downloadProgressView", "Lcm/aptoide/aptoideviews/downloadprogressview/DownloadProgressView;", "getDownloadProgressView", "()Lcm/aptoide/aptoideviews/downloadprogressview/DownloadProgressView;", "downloadProgressView$delegate", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "name$delegate", "rootLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getRootLayout", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "rootLayout$delegate", "secondaryIcon", "getSecondaryIcon", "secondaryIcon$delegate", "secondaryText", "getSecondaryText", "secondaryText$delegate", "tertiaryText", "getTertiaryText", "tertiaryText$delegate", "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class CardHolder extends BaseViewHolder {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {b0.g(new v(CardHolder.class, "name", "getName()Landroid/widget/TextView;", 0)), b0.g(new v(CardHolder.class, "appIcon", "getAppIcon()Landroid/widget/ImageView;", 0)), b0.g(new v(CardHolder.class, "secondaryText", "getSecondaryText()Landroid/widget/TextView;", 0)), b0.g(new v(CardHolder.class, "secondaryIcon", "getSecondaryIcon()Landroid/widget/ImageView;", 0)), b0.g(new v(CardHolder.class, "tertiaryText", "getTertiaryText()Landroid/widget/TextView;", 0)), b0.g(new v(CardHolder.class, "actionButton", "getActionButton()Landroid/widget/ImageView;", 0)), b0.g(new v(CardHolder.class, "downloadProgressView", "getDownloadProgressView()Lcm/aptoide/aptoideviews/downloadprogressview/DownloadProgressView;", 0)), b0.g(new v(CardHolder.class, "rootLayout", "getRootLayout()Landroidx/constraintlayout/widget/ConstraintLayout;", 0))};
        private final ReadOnlyProperty name$delegate = bind(R.id.apps_app_name);
        private final ReadOnlyProperty appIcon$delegate = bind(R.id.apps_app_icon);
        private final ReadOnlyProperty secondaryText$delegate = bind(R.id.apps_secondary_text);
        private final ReadOnlyProperty secondaryIcon$delegate = bind(R.id.secondary_icon);
        private final ReadOnlyProperty tertiaryText$delegate = bind(R.id.apps_tertiary_text);
        private final ReadOnlyProperty actionButton$delegate = bind(R.id.apps_action_button);
        private final ReadOnlyProperty downloadProgressView$delegate = bind(R.id.download_progress_view);
        private final ReadOnlyProperty rootLayout$delegate = bind(R.id.root_layout);

        public final ImageView getActionButton() {
            return (ImageView) this.actionButton$delegate.a(this, $$delegatedProperties[5]);
        }

        public final ImageView getAppIcon() {
            return (ImageView) this.appIcon$delegate.a(this, $$delegatedProperties[1]);
        }

        public final DownloadProgressView getDownloadProgressView() {
            return (DownloadProgressView) this.downloadProgressView$delegate.a(this, $$delegatedProperties[6]);
        }

        public final TextView getName() {
            return (TextView) this.name$delegate.a(this, $$delegatedProperties[0]);
        }

        public final ConstraintLayout getRootLayout() {
            return (ConstraintLayout) this.rootLayout$delegate.a(this, $$delegatedProperties[7]);
        }

        public final ImageView getSecondaryIcon() {
            return (ImageView) this.secondaryIcon$delegate.a(this, $$delegatedProperties[3]);
        }

        public final TextView getSecondaryText() {
            return (TextView) this.secondaryText$delegate.a(this, $$delegatedProperties[2]);
        }

        public final TextView getTertiaryText() {
            return (TextView) this.tertiaryText$delegate.a(this, $$delegatedProperties[4]);
        }
    }

    /* compiled from: UpdateCardModel.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StateApp.Status.values().length];
            iArr[StateApp.Status.ACTIVE.ordinal()] = 1;
            iArr[StateApp.Status.INSTALLING.ordinal()] = 2;
            iArr[StateApp.Status.PAUSE.ordinal()] = 3;
            iArr[StateApp.Status.ERROR.ordinal()] = 4;
            iArr[StateApp.Status.IN_QUEUE.ordinal()] = 5;
            iArr[StateApp.Status.STANDBY.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void processDownload(CardHolder holder, UpdateApp app) {
        StateApp.Status status = app.getStatus();
        switch (status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()]) {
            case 1:
                setDownloadViewVisibility(holder, app, true, false);
                holder.getDownloadProgressView().startDownload();
                break;
            case 2:
                setDownloadViewVisibility(holder, app, true, false);
                holder.getDownloadProgressView().startInstallation();
                break;
            case 3:
                setDownloadViewVisibility(holder, app, true, false);
                holder.getDownloadProgressView().pauseDownload();
                break;
            case 4:
                setDownloadViewVisibility(holder, app, false, true);
                break;
            case 5:
                holder.getDownloadProgressView().reset();
                setDownloadViewVisibility(holder, app, true, false);
                break;
            case 6:
                holder.getDownloadProgressView().reset();
                setDownloadViewVisibility(holder, app, false, false);
                break;
        }
        holder.getDownloadProgressView().setProgress(app.getProgress());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDownloadViewVisibility(CardHolder holder, UpdateApp app, boolean visible, boolean error) {
        TypedValue attributeForTheme;
        if (visible) {
            holder.getDownloadProgressView().setVisibility(0);
            holder.getSecondaryIcon().setVisibility(8);
            holder.getSecondaryText().setVisibility(8);
            holder.getTertiaryText().setVisibility(8);
            holder.getActionButton().setVisibility(4);
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            dVar.f(holder.getRootLayout());
            dVar.h(R.id.apps_app_name, 4, R.id.apps_app_icon, 4);
            dVar.h(R.id.apps_app_name, 3, R.id.apps_app_icon, 3);
            dVar.p(R.id.apps_app_name, 0.0f);
            dVar.c(holder.getRootLayout());
        } else {
            holder.getDownloadProgressView().setVisibility(8);
            holder.getSecondaryIcon().setVisibility(0);
            holder.getSecondaryText().setVisibility(0);
            holder.getTertiaryText().setVisibility(app.isInstalledWithAptoide() ? 0 : 8);
            holder.getActionButton().setVisibility(0);
            androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
            dVar2.f(holder.getRootLayout());
            dVar2.h(R.id.apps_app_name, 4, R.id.apps_secondary_text, 3);
            dVar2.h(R.id.apps_app_name, 3, holder.getRootLayout().getId(), 3);
            dVar2.p(R.id.apps_app_name, 0.5f);
            dVar2.c(holder.getRootLayout());
        }
        if (error) {
            holder.getSecondaryIcon().setImageResource(R.drawable.ic_error_outline_red);
            holder.getSecondaryText().setText(R.string.apps_short_error_download);
            holder.getSecondaryText().setTextAppearance(holder.getItemView().getContext(), R.style.Aptoide_TextView_Medium_XS_Red700);
        } else {
            ThemeManager themeManager = this.themeManager;
            if (themeManager != null && (attributeForTheme = themeManager.getAttributeForTheme(R.attr.version_refresh_icon)) != null) {
                holder.getSecondaryIcon().setImageResource(attributeForTheme.resourceId);
            }
            holder.getSecondaryText().setText(app.getVersion());
            holder.getSecondaryText().setTextAppearance(holder.getItemView().getContext(), R.style.Aptoide_TextView_Medium_XS_Grey);
        }
    }

    private final void setupListeners(final CardHolder holder, final UpdateApp app) {
        holder.getActionButton().setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.apps.list.models.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpdateCardModel.m162setupListeners$lambda1(UpdateCardModel.this, app, view);
            }
        });
        holder.getItemView().setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.apps.list.models.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpdateCardModel.m163setupListeners$lambda2(UpdateCardModel.this, app, view);
            }
        });
        holder.getItemView().setOnLongClickListener(new View.OnLongClickListener() { // from class: cm.aptoide.pt.home.apps.list.models.c
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean m164setupListeners$lambda3;
                m164setupListeners$lambda3 = UpdateCardModel.m164setupListeners$lambda3(UpdateCardModel.this, app, view);
                return m164setupListeners$lambda3;
            }
        });
        holder.getDownloadProgressView().setEventListener(new DownloadEventListener() { // from class: cm.aptoide.pt.home.apps.list.models.UpdateCardModel$setupListeners$4

            /* compiled from: UpdateCardModel.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            /* loaded from: classes.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[DownloadEventListener.Action.Type.values().length];
                    iArr[DownloadEventListener.Action.Type.CANCEL.ordinal()] = 1;
                    iArr[DownloadEventListener.Action.Type.RESUME.ordinal()] = 2;
                    iArr[DownloadEventListener.Action.Type.PAUSE.ordinal()] = 3;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // cm.aptoide.aptoideviews.downloadprogressview.DownloadEventListener
            public void onActionClick(DownloadEventListener.Action action) {
                rx.s.b<AppClick> eventSubject;
                l.f(action, "action");
                int i2 = WhenMappings.$EnumSwitchMapping$0[action.getType().ordinal()];
                if (i2 == 1) {
                    rx.s.b<AppClick> eventSubject2 = UpdateCardModel.this.getEventSubject();
                    if (eventSubject2 != null) {
                        eventSubject2.onNext(new AppClick(app, AppClick.ClickType.CANCEL_CLICK));
                    }
                    UpdateCardModel.this.setDownloadViewVisibility(holder, app, false, false);
                    return;
                }
                if (i2 != 2) {
                    if (i2 == 3 && (eventSubject = UpdateCardModel.this.getEventSubject()) != null) {
                        eventSubject.onNext(new AppClick(app, AppClick.ClickType.PAUSE_CLICK));
                        return;
                    }
                    return;
                }
                rx.s.b<AppClick> eventSubject3 = UpdateCardModel.this.getEventSubject();
                if (eventSubject3 != null) {
                    eventSubject3.onNext(new AppClick(app, AppClick.ClickType.RESUME_CLICK));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupListeners$lambda-1, reason: not valid java name */
    public static final void m162setupListeners$lambda1(UpdateCardModel updateCardModel, UpdateApp updateApp, View view) {
        l.f(updateCardModel, "this$0");
        l.f(updateApp, "$app");
        rx.s.b<AppClick> bVar = updateCardModel.eventSubject;
        if (bVar != null) {
            bVar.onNext(new AppClick(updateApp, AppClick.ClickType.DOWNLOAD_ACTION_CLICK));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupListeners$lambda-2, reason: not valid java name */
    public static final void m163setupListeners$lambda2(UpdateCardModel updateCardModel, UpdateApp updateApp, View view) {
        l.f(updateCardModel, "this$0");
        l.f(updateApp, "$app");
        rx.s.b<AppClick> bVar = updateCardModel.eventSubject;
        if (bVar != null) {
            bVar.onNext(new AppClick(updateApp, AppClick.ClickType.CARD_CLICK));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupListeners$lambda-3, reason: not valid java name */
    public static final boolean m164setupListeners$lambda3(UpdateCardModel updateCardModel, UpdateApp updateApp, View view) {
        l.f(updateCardModel, "this$0");
        l.f(updateApp, "$app");
        rx.s.b<AppClick> bVar = updateCardModel.eventSubject;
        if (bVar == null) {
            return true;
        }
        bVar.onNext(new AppClick(updateApp, AppClick.ClickType.CARD_LONG_CLICK));
        return true;
    }

    public final UpdateApp getApplication() {
        return this.application;
    }

    public final rx.s.b<AppClick> getEventSubject() {
        return this.eventSubject;
    }

    public final ThemeManager getThemeManager() {
        return this.themeManager;
    }

    public final void setApplication(UpdateApp updateApp) {
        this.application = updateApp;
    }

    public final void setEventSubject(rx.s.b<AppClick> bVar) {
        this.eventSubject = bVar;
    }

    public final void setThemeManager(ThemeManager themeManager) {
        this.themeManager = themeManager;
    }

    @Override // com.airbnb.epoxy.t
    public /* bridge */ /* synthetic */ void bind(CardHolder cardHolder, s sVar) {
        bind2(cardHolder, (s<?>) sVar);
    }

    @Override // com.airbnb.epoxy.t, com.airbnb.epoxy.s
    public /* bridge */ /* synthetic */ void bind(Object obj, s sVar) {
        bind2((CardHolder) obj, (s<?>) sVar);
    }

    @Override // com.airbnb.epoxy.t, com.airbnb.epoxy.s
    public void bind(CardHolder holder) {
        l.f(holder, "holder");
        UpdateApp updateApp = this.application;
        if (updateApp != null) {
            holder.getName().setText(updateApp.getName());
            ImageLoader.with(holder.getItemView().getContext()).load(updateApp.getIcon(), holder.getAppIcon());
            holder.getSecondaryText().setText(updateApp.getVersion());
            setupListeners(holder, updateApp);
            processDownload(holder, updateApp);
        }
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(CardHolder cardHolder, s<?> sVar) {
        l.f(cardHolder, "holder");
        l.f(sVar, "previouslyBoundModel");
        UpdateApp updateApp = this.application;
        if (updateApp != null) {
            processDownload(cardHolder, updateApp);
        }
    }
}
