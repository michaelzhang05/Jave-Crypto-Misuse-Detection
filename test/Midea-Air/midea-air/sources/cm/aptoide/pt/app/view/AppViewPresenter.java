package cm.aptoide.pt.app.view;

import android.text.TextUtils;
import android.util.Pair;
import android.view.MenuItem;
import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.pt.AptoideApplication;
import cm.aptoide.pt.BuildConfig;
import cm.aptoide.pt.R;
import cm.aptoide.pt.account.AccountAnalytics;
import cm.aptoide.pt.account.view.AccountNavigator;
import cm.aptoide.pt.actions.PermissionManager;
import cm.aptoide.pt.actions.PermissionService;
import cm.aptoide.pt.ads.data.ApplicationAd;
import cm.aptoide.pt.ads.data.AptoideNativeAd;
import cm.aptoide.pt.app.AppModel;
import cm.aptoide.pt.app.AppViewAnalytics;
import cm.aptoide.pt.app.AppViewManager;
import cm.aptoide.pt.app.AppViewModel;
import cm.aptoide.pt.app.AppViewSimilarApp;
import cm.aptoide.pt.app.CampaignAnalytics;
import cm.aptoide.pt.app.DownloadModel;
import cm.aptoide.pt.app.PromotionViewModel;
import cm.aptoide.pt.app.ReviewsViewModel;
import cm.aptoide.pt.app.SimilarAppsViewModel;
import cm.aptoide.pt.app.view.AppViewFragment;
import cm.aptoide.pt.app.view.screenshots.ScreenShotClickEvent;
import cm.aptoide.pt.app.view.similar.SimilarAppClickEvent;
import cm.aptoide.pt.app.view.similar.SimilarAppsBundle;
import cm.aptoide.pt.crashreports.CrashReport;
import cm.aptoide.pt.download.InvalidAppException;
import cm.aptoide.pt.download.view.outofspace.OutOfSpaceNavigatorWrapper;
import cm.aptoide.pt.logger.Logger;
import cm.aptoide.pt.presenter.Presenter;
import cm.aptoide.pt.presenter.View;
import cm.aptoide.pt.promotions.ClaimDialogResultWrapper;
import cm.aptoide.pt.promotions.Promotion;
import cm.aptoide.pt.promotions.PromotionsNavigator;
import cm.aptoide.pt.promotions.WalletApp;
import cm.aptoide.pt.search.model.SearchAdResult;
import cm.aptoide.pt.utils.GenericDialogs;
import cm.aptoide.pt.view.app.FlagsVote;
import cm.aptoide.pt.wallet.WalletAppProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import rx.Single;
import rx.exceptions.OnErrorNotImplementedException;
import rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class AppViewPresenter implements Presenter {
    private static final String TAG = "AppViewPresenter";
    private static final long TIME_BETWEEN_SCROLL = 2000;
    private final AptoideAccountManager accountManager;
    private final AccountNavigator accountNavigator;
    private final AppViewAnalytics appViewAnalytics;
    private final AppViewManager appViewManager;
    private final AppViewNavigator appViewNavigator;
    private final CampaignAnalytics campaignAnalytics;
    private final CrashReport crashReport;
    private boolean openTypeAlreadyRegistered = false;
    private final PermissionManager permissionManager;
    private final PermissionService permissionService;
    private final PromotionsNavigator promotionsNavigator;
    private final AppViewView view;
    private final rx.h viewScheduler;
    private final WalletAppProvider walletAppProvider;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cm.aptoide.pt.app.view.AppViewPresenter$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action;

        static {
            int[] iArr = new int[DownloadModel.Action.values().length];
            $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action = iArr;
            try {
                iArr[DownloadModel.Action.INSTALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.DOWNGRADE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.MIGRATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public AppViewPresenter(AppViewView appViewView, AccountNavigator accountNavigator, AppViewAnalytics appViewAnalytics, CampaignAnalytics campaignAnalytics, AppViewNavigator appViewNavigator, AppViewManager appViewManager, AptoideAccountManager aptoideAccountManager, rx.h hVar, CrashReport crashReport, PermissionManager permissionManager, PermissionService permissionService, PromotionsNavigator promotionsNavigator, WalletAppProvider walletAppProvider) {
        this.view = appViewView;
        this.accountNavigator = accountNavigator;
        this.appViewAnalytics = appViewAnalytics;
        this.campaignAnalytics = campaignAnalytics;
        this.appViewNavigator = appViewNavigator;
        this.appViewManager = appViewManager;
        this.accountManager = aptoideAccountManager;
        this.viewScheduler = hVar;
        this.crashReport = crashReport;
        this.permissionManager = permissionManager;
        this.permissionService = permissionService;
        this.promotionsNavigator = promotionsNavigator;
        this.walletAppProvider = walletAppProvider;
    }

    private void cancelDownload() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.s4
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.j1
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.f((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.m9
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$cancelDownload$220((AppModel) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.f3
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$cancelDownload$221((Throwable) obj);
            }
        });
    }

    private void cancelPromotionDownload() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.la
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.e7
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.h((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.l3
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$cancelPromotionDownload$284((WalletApp) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.u5
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$cancelPromotionDownload$285((Throwable) obj);
                throw null;
            }
        });
    }

    private void claimApp() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.v1
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.jc
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.k((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.c3
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$claimApp$295((AppModel) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.t5
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$claimApp$296((Throwable) obj);
                throw null;
            }
        });
    }

    private rx.b downgradeApp(final DownloadModel.Action action, final AppModel appModel, final boolean z) {
        return this.view.showDowngradeMessage().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.f4
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean bool = (Boolean) obj;
                AppViewPresenter.lambda$downgradeApp$249(bool);
                return bool;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.x5
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.l((Boolean) obj);
            }
        }).H(new rx.m.e() { // from class: cm.aptoide.pt.app.view.c9
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.m(action, appModel, z, (Boolean) obj);
            }
        }).X0();
    }

    private rx.b downloadApp(final DownloadModel.Action action, final AppModel appModel, final boolean z) {
        return rx.e.p(new rx.m.d() { // from class: cm.aptoide.pt.app.view.q8
            @Override // rx.m.d, java.util.concurrent.Callable
            public final Object call() {
                return AppViewPresenter.this.o(action);
            }
        }).j0(this.viewScheduler).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.e6
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.r(appModel, action, z, (DownloadModel.Action) obj);
            }
        }).X0();
    }

    private rx.e<DownloadModel> downloadInRange(final int i2, final int i3) {
        return this.appViewManager.downloadStarted().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.a8
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((DownloadModel) obj).isDownloading());
                return valueOf;
            }
        }).D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.ba
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                int i4 = i2;
                int i5 = i3;
                valueOf = Boolean.valueOf(r3.getProgress() >= r1 && r3.getProgress() < r2);
                return valueOf;
            }
        }).E();
    }

    private rx.b downloadWallet(final WalletApp walletApp) {
        return rx.e.p(new rx.m.d() { // from class: cm.aptoide.pt.app.view.j2
            @Override // rx.m.d, java.util.concurrent.Callable
            public final Object call() {
                return AppViewPresenter.this.t();
            }
        }).j0(this.viewScheduler).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.q1
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.u(walletApp, (Boolean) obj);
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.c5
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.v((Void) obj);
            }
        }).j0(Schedulers.io()).H(new rx.m.e() { // from class: cm.aptoide.pt.app.view.ub
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.w(walletApp, (Void) obj);
            }
        }).X0();
    }

    private void handleAdsLogic(SearchAdResult searchAdResult) {
        this.appViewManager.handleAdsLogic(searchAdResult);
        this.view.extractReferrer(searchAdResult);
    }

    private void handleApkfyDialogPositiveClick() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.y5
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.n1
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.x((View.LifecycleEvent) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.v7
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.y((String) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.p2
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleApkfyDialogPositiveClick$262((String) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.u6
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleApkfyDialogPositiveClick$263((Throwable) obj);
                throw null;
            }
        });
    }

    private void handleClickFlags() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.j6
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.zb
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.D((View.LifecycleEvent) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.x4
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.E((FlagsVote.VoteType) obj);
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.g4
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.J((FlagsVote.VoteType) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.b9
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickFlags$175((Boolean) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.h8
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.K((Throwable) obj);
            }
        });
    }

    private void handleClickLoginSnack() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.m5
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.s6
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.L((View.LifecycleEvent) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.e4
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.M((Void) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.t2
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickLoginSnack$180((Void) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.lb
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.N((Throwable) obj);
            }
        });
    }

    private void handleClickOnAppcIabInfo() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.b6
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.b8
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.O((View.LifecycleEvent) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.r2
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.P((Void) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.k5
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnAppcIabInfo$106((Void) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.g2
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.Q((Throwable) obj);
            }
        });
    }

    private void handleClickOnAppcInfo() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.j8
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.y2
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.R((View.LifecycleEvent) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.zc
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.S((Void) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.l9
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnAppcInfo$96((Void) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.h1
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.T((Throwable) obj);
            }
        });
    }

    private void handleClickOnBonusAppcFlair() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.g5
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.f9
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.W((View.LifecycleEvent) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.m8
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.U((Void) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.qb
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnBonusAppcFlair$101((Void) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.nc
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.V((Throwable) obj);
            }
        });
    }

    private void handleClickOnCatappultCard() {
        rx.e f2 = this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.z6
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.sb
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.X((View.LifecycleEvent) obj);
            }
        }).j0(this.viewScheduler).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.mc
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.Y((Void) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        c6 c6Var = new rx.m.b() { // from class: cm.aptoide.pt.app.view.c6
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnCatappultCard$203((Void) obj);
            }
        };
        CrashReport crashReport = this.crashReport;
        crashReport.getClass();
        f2.H0(c6Var, new d(crashReport));
    }

    private void handleClickOnDescriptionReadMore() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.a2
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.z9
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.Z((View.LifecycleEvent) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.v9
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.a0((ReadMoreClickEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.rb
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnDescriptionReadMore$84((ReadMoreClickEvent) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.e8
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.b0((Throwable) obj);
            }
        });
    }

    private void handleClickOnDeveloperEmail() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.i4
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.ua
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.c0((View.LifecycleEvent) obj);
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.app.view.h4
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.d0((Void) obj);
            }
        }).D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.h3
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                AppModel appModel = (AppModel) obj;
                valueOf = Boolean.valueOf(!TextUtils.isEmpty(appModel.getDeveloper().getEmail()));
                return valueOf;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.f6
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.e0((AppModel) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.m7
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnDeveloperEmail$113((AppModel) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.q9
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.f0((Throwable) obj);
            }
        });
    }

    private void handleClickOnDeveloperPermissions() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.l7
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.pa
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.g0((View.LifecycleEvent) obj);
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.app.view.za
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.h0((Void) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.p3
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.i0((AppModel) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.n3
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnDeveloperPermissions$126((AppModel) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.r9
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.j0((Throwable) obj);
            }
        });
    }

    private void handleClickOnDeveloperPrivacy() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.a7
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.n9
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.k0((View.LifecycleEvent) obj);
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.app.view.d3
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.l0((Void) obj);
            }
        }).D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.w3
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                AppModel appModel = (AppModel) obj;
                valueOf = Boolean.valueOf(!TextUtils.isEmpty(appModel.getDeveloper().getPrivacy()));
                return valueOf;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.pb
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.m0((AppModel) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.v5
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnDeveloperPrivacy$120((AppModel) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.ad
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.n0((Throwable) obj);
            }
        });
    }

    private void handleClickOnDeveloperWebsite() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.s9
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.u3
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.o0((View.LifecycleEvent) obj);
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.app.view.e9
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.p0((Void) obj);
            }
        }).D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.i1
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                AppModel appModel = (AppModel) obj;
                valueOf = Boolean.valueOf(!TextUtils.isEmpty(appModel.getDeveloper().getWebsite()));
                return valueOf;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.k8
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.q0((AppModel) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.x8
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnDeveloperWebsite$91((AppModel) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.c7
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.r0((Throwable) obj);
            }
        });
    }

    private void handleClickOnFollowStore() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.m4
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.c8
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.s0((View.LifecycleEvent) obj);
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.app.view.fc
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.t0((Void) obj);
            }
        }).j0(this.viewScheduler).H(new rx.m.e() { // from class: cm.aptoide.pt.app.view.wb
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.u0((AppModel) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.ia
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnFollowStore$138((AppModel) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.j4
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnFollowStore$139((Throwable) obj);
                throw null;
            }
        });
    }

    private void handleClickOnOtherVersions() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.y9
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.lc
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.v0((View.LifecycleEvent) obj);
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.app.view.xa
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.w0((Void) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.p8
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.x0((AppModel) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.j3
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnOtherVersions$144((AppModel) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.u4
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.y0((Throwable) obj);
            }
        });
    }

    private void handleClickOnRateApp() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.ca
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.ib
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.z0((View.LifecycleEvent) obj);
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.app.view.z7
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.A0((Void) obj);
            }
        }).j0(this.viewScheduler).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.g8
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.B0((AppModel) obj);
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.y8
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.C0((AppModel) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.n2
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnRateApp$157((GenericDialogs.EResponse) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.k7
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.D0((Throwable) obj);
            }
        });
    }

    private void handleClickOnRetry() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.fa
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.z5
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.G0((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.yb
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnRetry$198((AppViewModel) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.p9
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.H0((Throwable) obj);
            }
        });
    }

    private void handleClickOnScreenshot() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.xb
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.p5
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.I0((View.LifecycleEvent) obj);
            }
        }).D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.x1
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                ScreenShotClickEvent screenShotClickEvent = (ScreenShotClickEvent) obj;
                valueOf = Boolean.valueOf(!screenShotClickEvent.isVideo());
                return valueOf;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.gc
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.J0((ScreenShotClickEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.kb
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnScreenshot$73((ScreenShotClickEvent) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.na
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.K0((Throwable) obj);
            }
        });
    }

    private void handleClickOnSimilarApps() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.l8
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.y6
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.L0((View.LifecycleEvent) obj);
            }
        }).j0(this.viewScheduler).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.oa
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.M0((SimilarAppClickEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.tb
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnSimilarApps$185((Boolean) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.vb
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.N0((Throwable) obj);
            }
        });
    }

    private void handleClickOnStoreLayout() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.o1
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.a9
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.O0((View.LifecycleEvent) obj);
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.app.view.eb
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.P0((Void) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.b5
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.Q0((AppModel) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.ob
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnStoreLayout$132((AppModel) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.k4
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.R0((Throwable) obj);
            }
        });
    }

    private void handleClickOnToolbar() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.z3
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.ic
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.U0((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.t8
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnToolbar$192((AppModel) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.h5
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.V0((Throwable) obj);
            }
        });
    }

    private void handleClickOnTrustedBadge() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.m1
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.n8
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.W0((View.LifecycleEvent) obj);
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.app.view.w5
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.X0((Void) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.q2
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.Y0((AppModel) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.cd
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnTrustedBadge$150((AppModel) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.v2
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.Z0((Throwable) obj);
            }
        });
    }

    private void handleClickOnVideo() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.dd
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.t3
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.a1((View.LifecycleEvent) obj);
            }
        }).D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.d5
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((ScreenShotClickEvent) obj).isVideo());
                return valueOf;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.n4
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.b1((ScreenShotClickEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.e5
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnVideo$79((ScreenShotClickEvent) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.q7
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.c1((Throwable) obj);
            }
        });
    }

    private void handleClickReadReviews() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.x7
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.sa
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.d1((View.LifecycleEvent) obj);
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.app.view.k9
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.e1((Void) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.z8
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.f1((AppModel) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.h6
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickReadReviews$163((AppModel) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.r1
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.g1((Throwable) obj);
            }
        });
    }

    private void handleDismissWalletPromotion() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.r3
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.s7
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.h1((View.LifecycleEvent) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.s5
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.i1((Promotion) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.b2
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleDismissWalletPromotion$267((Promotion) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.d2
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleDismissWalletPromotion$268((Throwable) obj);
                throw null;
            }
        });
    }

    private void handleDownloadingSimilarApp() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.ac
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.q3
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.j1((View.LifecycleEvent) obj);
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.b7
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.k1((Serializable) obj);
            }
        }).j0(this.viewScheduler).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.q5
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.l1((DownloadModel) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.vc
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleDownloadingSimilarApp$49((DownloadModel) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.k3
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.m1((Throwable) obj);
            }
        });
    }

    private void handleInstallButtonClick() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.ed
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.r4
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.q1((View.LifecycleEvent) obj);
            }
        }).E().j0(this.viewScheduler).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.g3
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.z1((Account) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.a4
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleInstallButtonClick$247((DownloadModel.Action) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.u9
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleInstallButtonClick$248((Throwable) obj);
                throw null;
            }
        });
    }

    private void handleInstallWalletPromotion() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.i9
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.z1
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.C1((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.z2
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleInstallWalletPromotion$273((Pair) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.uc
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleInstallWalletPromotion$274((Throwable) obj);
                throw null;
            }
        });
    }

    private void handleOnSimilarAppsVisible() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.g1
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.ja
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.D1((View.LifecycleEvent) obj);
            }
        }).E().j0(Schedulers.io()).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.sc
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.E1((Boolean) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.j9
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleOnSimilarAppsVisible$62((Boolean) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.o6
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.F1((Throwable) obj);
            }
        });
    }

    private rx.e<Boolean> handleOpenAppViewDialogInput(AppModel appModel) {
        if (!this.openTypeAlreadyRegistered) {
            this.openTypeAlreadyRegistered = true;
            if (appModel.getOpenType() == AppViewFragment.OpenType.OPEN_AND_INSTALL) {
                return rx.e.S(Boolean.TRUE);
            }
            if (appModel.getOpenType() == AppViewFragment.OpenType.OPEN_WITH_INSTALL_POPUP) {
                return this.view.showOpenAndInstallDialog(appModel.getMarketName(), appModel.getAppName()).X(new rx.m.e() { // from class: cm.aptoide.pt.app.view.ta
                    @Override // rx.m.e
                    public final Object call(Object obj) {
                        Boolean bool;
                        bool = Boolean.TRUE;
                        return bool;
                    }
                });
            }
            if (appModel.getOpenType() == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP) {
                return this.view.showOpenAndInstallApkFyDialog(appModel.getMarketName(), appModel.getAppName(), appModel.getAppc(), appModel.getRating().getAverage(), appModel.getIcon(), appModel.getPackageDownloads()).X(new rx.m.e() { // from class: cm.aptoide.pt.app.view.wc
                    @Override // rx.m.e
                    public final Object call(Object obj) {
                        Boolean bool;
                        bool = Boolean.TRUE;
                        return bool;
                    }
                });
            }
        }
        return rx.e.S(Boolean.FALSE);
    }

    private void handleOutOfSpaceDialogResult() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.u8
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.da
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.G1((View.LifecycleEvent) obj);
            }
        }).D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.wa
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((OutOfSpaceNavigatorWrapper) obj).getClearedSuccessfully());
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.jb
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.J1((OutOfSpaceNavigatorWrapper) obj);
            }
        }).s0().f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.p7
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleOutOfSpaceDialogResult$6(obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.r7
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.K1((Throwable) obj);
            }
        });
    }

    private void handlePromotionClaimResult() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.dc
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.m6
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.L1((View.LifecycleEvent) obj);
            }
        }).D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.ld
            @Override // rx.m.e
            public final Object call(Object obj) {
                return Boolean.valueOf(((ClaimDialogResultWrapper) obj).isOk());
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.y3
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.M1((ClaimDialogResultWrapper) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.u2
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handlePromotionClaimResult$300((ClaimDialogResultWrapper) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.kc
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handlePromotionClaimResult$301((Throwable) obj);
                throw null;
            }
        });
    }

    private void handleReviewAutoScroll() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.y7
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.s8
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.N1((View.LifecycleEvent) obj);
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.k6
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.O1((Integer) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.v8
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleReviewAutoScroll$67((Integer) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.z4
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.P1((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cancelDownload$216, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single c(Void r1) {
        return this.appViewManager.getAppModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cancelDownload$217, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void d(AppModel appModel) {
        this.appViewAnalytics.sendDownloadCancelEvent(appModel.getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cancelDownload$218, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b e(AppModel appModel) {
        return this.appViewManager.cancelDownload(appModel.getMd5(), appModel.getPackageName(), appModel.getVersionCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cancelDownload$219, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e f(View.LifecycleEvent lifecycleEvent) {
        return this.view.cancelDownload().L(new rx.m.e() { // from class: cm.aptoide.pt.app.view.t7
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.c((Void) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.bc
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.d((AppModel) obj);
            }
        }).H(new rx.m.e() { // from class: cm.aptoide.pt.app.view.oc
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.e((AppModel) obj);
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$cancelDownload$220(AppModel appModel) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$cancelDownload$221(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cancelPromotionDownload$282, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b g(WalletApp walletApp) {
        return this.appViewManager.cancelDownload(walletApp.getMd5sum(), walletApp.getPackageName(), walletApp.getVersionCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cancelPromotionDownload$283, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e h(View.LifecycleEvent lifecycleEvent) {
        return this.view.cancelPromotionDownload().H(new rx.m.e() { // from class: cm.aptoide.pt.app.view.x6
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.g((WalletApp) obj);
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$cancelPromotionDownload$284(WalletApp walletApp) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$cancelPromotionDownload$285(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$claimApp$292, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void i(Promotion promotion, AppModel appModel) {
        this.promotionsNavigator.navigateToClaimDialog(appModel.getPackageName(), promotion.getPromotionId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$claimApp$293, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e j(final Promotion promotion) {
        this.appViewAnalytics.sendClickOnClaimAppViewPromotion(promotion.getPromotionId());
        return this.appViewManager.getAppModel().A().x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.y4
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.i(promotion, (AppModel) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$claimApp$294, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e k(View.LifecycleEvent lifecycleEvent) {
        return this.view.claimAppClick().G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.d7
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.j((Promotion) obj);
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$claimApp$295(AppModel appModel) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$claimApp$296(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Boolean lambda$downgradeApp$249(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downgradeApp$250, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void l(Boolean bool) {
        this.view.showDowngradingMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downgradeApp$251, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b m(DownloadModel.Action action, AppModel appModel, boolean z, Boolean bool) {
        return downloadApp(action, appModel, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$253, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void n(Boolean bool) {
        this.appViewManager.allowRootInstall(bool);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ DownloadModel.Action lambda$downloadApp$254(DownloadModel.Action action, Boolean bool) {
        return action;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$255, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e o(final DownloadModel.Action action) {
        if (this.appViewManager.shouldShowRootInstallWarningPopup()) {
            return this.view.showRootInstallWarningPopup().x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.e2
                @Override // rx.m.b
                public final void call(Object obj) {
                    AppViewPresenter.this.n((Boolean) obj);
                }
            }).X(new rx.m.e() { // from class: cm.aptoide.pt.app.view.j5
                @Override // rx.m.e
                public final Object call(Object obj) {
                    DownloadModel.Action action2 = DownloadModel.Action.this;
                    AppViewPresenter.lambda$downloadApp$254(action2, (Boolean) obj);
                    return action2;
                }
            });
        }
        return rx.e.S(action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$256, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e p(Void r2) {
        return this.permissionManager.requestExternalStoragePermission(this.permissionService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$257, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b q(DownloadModel.Action action, AppModel appModel, boolean z, Void r11) {
        return this.appViewManager.downloadApp(action, appModel.getAppId(), appModel.getMalware().getRank().name(), appModel.getEditorsChoice(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$258, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e r(final AppModel appModel, final DownloadModel.Action action, final boolean z, DownloadModel.Action action2) {
        return this.permissionManager.requestDownloadAccessWithWifiBypass(this.permissionService, appModel.getSize()).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.pc
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.p((Void) obj);
            }
        }).j0(Schedulers.io()).H(new rx.m.e() { // from class: cm.aptoide.pt.app.view.o9
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.q(action, appModel, z, (Void) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadWallet$302, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void s(Boolean bool) {
        this.appViewManager.allowRootInstall(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadWallet$303, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e t() {
        if (this.appViewManager.shouldShowRootInstallWarningPopup()) {
            return this.view.showRootInstallWarningPopup().x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.l2
                @Override // rx.m.b
                public final void call(Object obj) {
                    AppViewPresenter.this.s((Boolean) obj);
                }
            });
        }
        return rx.e.S(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadWallet$304, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e u(WalletApp walletApp, Boolean bool) {
        return this.permissionManager.requestDownloadAccessWithWifiBypass(this.permissionService, walletApp.getSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadWallet$305, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e v(Void r2) {
        return this.permissionManager.requestExternalStoragePermission(this.permissionService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadWallet$306, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b w(WalletApp walletApp, Void r2) {
        return this.appViewManager.downloadApp(walletApp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleApkfyDialogPositiveClick$260, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e x(View.LifecycleEvent lifecycleEvent) {
        return this.view.apkfyDialogPositiveClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleApkfyDialogPositiveClick$261, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void y(String str) {
        this.view.showApkfyElement(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleApkfyDialogPositiveClick$262(String str) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleApkfyDialogPositiveClick$263(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Boolean lambda$handleAppViewOpenOptions$18(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAppViewOpenOptions$19, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void z(AppModel appModel, DownloadModel.Action action, AppViewModel appViewModel, Boolean bool) {
        this.appViewAnalytics.clickOnInstallButton(appModel.getPackageName(), appModel.getDeveloper().getName(), action.toString(), appModel.hasSplits(), appModel.hasBilling(), action.equals(DownloadModel.Action.MIGRATE), appModel.getMalware().getRank().name(), appModel.getOriginTag(), appModel.getStore().getName(), appModel.getOpenType() == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP, appModel.getObb() != null, appModel.getBdsFlags(), appViewModel.getAppModel().getAppCategory());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAppViewOpenOptions$20, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void A(Throwable th) {
        if (th instanceof InvalidAppException) {
            this.view.showInvalidAppInfoErrorDialog();
        } else {
            this.view.showGenericErrorDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAppViewOpenOptions$21, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b B(DownloadModel.Action action, AppModel appModel, Boolean bool) {
        return downloadApp(action, appModel, appModel.getOpenType() == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP).n(new rx.m.b() { // from class: cm.aptoide.pt.app.view.ga
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.A((Throwable) obj);
            }
        }).A();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ AppViewModel lambda$handleAppViewOpenOptions$22(AppViewModel appViewModel, Boolean bool) {
        return appViewModel;
    }

    private /* synthetic */ AppViewModel lambda$handleAppViewOpenOptions$23(AppViewModel appViewModel, Throwable th) {
        this.crashReport.log(th);
        return appViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickFlags$166, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e D(View.LifecycleEvent lifecycleEvent) {
        return rx.e.c0(this.view.clickVirusFlag(), this.view.clickLicenseFlag(), this.view.clickWorkingFlag(), this.view.clickFakeFlag());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickFlags$167, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void E(FlagsVote.VoteType voteType) {
        this.view.disableFlags();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickFlags$168, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e F(Account account) {
        if (!account.isLoggedIn()) {
            this.view.enableFlags();
            this.view.displayNotLoggedInSnack();
            return rx.e.S(Boolean.FALSE);
        }
        return rx.e.S(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Boolean lambda$handleClickFlags$169(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickFlags$170, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single G(Boolean bool) {
        return this.appViewManager.getAppModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickFlags$171, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single H(FlagsVote.VoteType voteType, AppModel appModel) {
        return this.appViewManager.flagApk(appModel.getStore().getName(), appModel.getMd5(), voteType);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Boolean lambda$handleClickFlags$172(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickFlags$173, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void I(FlagsVote.VoteType voteType, Boolean bool) {
        this.view.incrementFlags(voteType);
        this.view.showFlagVoteSubmittedMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickFlags$174, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e J(final FlagsVote.VoteType voteType) {
        return this.accountManager.accountStatus().E().j0(this.viewScheduler).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.d4
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.F((Account) obj);
            }
        }).D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.ra
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean bool = (Boolean) obj;
                AppViewPresenter.lambda$handleClickFlags$169(bool);
                return bool;
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.app.view.p6
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.G((Boolean) obj);
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.app.view.hb
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.H(voteType, (AppModel) obj);
            }
        }).D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.g6
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean bool = (Boolean) obj;
                AppViewPresenter.lambda$handleClickFlags$172(bool);
                return bool;
            }
        }).j0(this.viewScheduler).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.ab
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.I(voteType, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleClickFlags$175(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickFlags$176, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void K(Throwable th) {
        this.view.enableFlags();
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickLoginSnack$178, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e L(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickLoginSnack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickLoginSnack$179, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void M(Void r2) {
        this.accountNavigator.navigateToAccountView(AccountAnalytics.AccountOrigins.APP_VIEW_FLAG);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleClickLoginSnack$180(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickLoginSnack$181, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void N(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnAppcIabInfo$104, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e O(View.LifecycleEvent lifecycleEvent) {
        return this.view.iabInfoClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnAppcIabInfo$105, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void P(Void r1) {
        this.appViewNavigator.navigateToAppCoinsInfo();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleClickOnAppcIabInfo$106(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnAppcIabInfo$107, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void Q(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnAppcInfo$94, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e R(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickGetAppcInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnAppcInfo$95, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void S(Void r1) {
        this.appViewAnalytics.sendAppcInfoInteractEvent();
        this.appViewNavigator.navigateToAppCoinsInfo();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleClickOnAppcInfo$96(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnAppcInfo$97, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void T(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnBonusAppcFlair$100, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void U(Void r1) {
        this.appViewAnalytics.sendAppcInfoInteractEvent();
        this.appViewNavigator.navigateToAppCoinsInfo();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleClickOnBonusAppcFlair$101(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnBonusAppcFlair$102, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void V(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnBonusAppcFlair$99, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e W(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickBonusAppcFlair();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnCatappultCard$201, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e X(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickCatappultCard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnCatappultCard$202, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void Y(Void r1) {
        this.appViewNavigator.navigateToCatappultWebsite();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleClickOnCatappultCard$203(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDescriptionReadMore$82, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e Z(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickedReadMore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDescriptionReadMore$83, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void a0(ReadMoreClickEvent readMoreClickEvent) {
        this.appViewAnalytics.sendReadMoreEvent();
        this.appViewNavigator.navigateToDescriptionReadMore(readMoreClickEvent.getStoreName(), readMoreClickEvent.getDescription(), readMoreClickEvent.hasAppc());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleClickOnDescriptionReadMore$84(ReadMoreClickEvent readMoreClickEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDescriptionReadMore$85, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void b0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperEmail$109, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e c0(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickDeveloperEmail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperEmail$110, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single d0(Void r1) {
        return this.appViewManager.getAppModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperEmail$112, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void e0(AppModel appModel) {
        this.view.navigateToDeveloperEmail(appModel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleClickOnDeveloperEmail$113(AppModel appModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperEmail$114, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void f0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperPermissions$123, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e g0(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickDeveloperPermissions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperPermissions$124, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single h0(Void r1) {
        return this.appViewManager.getAppModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperPermissions$125, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void i0(AppModel appModel) {
        this.view.navigateToDeveloperPermissions(appModel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleClickOnDeveloperPermissions$126(AppModel appModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperPermissions$127, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void j0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperPrivacy$116, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e k0(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickDeveloperPrivacy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperPrivacy$117, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single l0(Void r1) {
        return this.appViewManager.getAppModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperPrivacy$119, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m0(AppModel appModel) {
        this.view.navigateToDeveloperPrivacy(appModel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleClickOnDeveloperPrivacy$120(AppModel appModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperPrivacy$121, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void n0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperWebsite$87, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e o0(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickDeveloperWebsite();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperWebsite$88, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single p0(Void r1) {
        return this.appViewManager.getAppModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperWebsite$90, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void q0(AppModel appModel) {
        this.view.navigateToDeveloperWebsite(appModel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleClickOnDeveloperWebsite$91(AppModel appModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperWebsite$92, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void r0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnFollowStore$135, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e s0(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickFollowStore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnFollowStore$136, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single t0(Void r1) {
        return this.appViewManager.getAppModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnFollowStore$137, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b u0(AppModel appModel) {
        if (appModel.isStoreFollowed()) {
            this.view.setFollowButton(true);
            this.appViewAnalytics.sendOpenStoreEvent();
            this.appViewNavigator.navigateToStore(appModel.getStore());
            return rx.b.e();
        }
        this.view.setFollowButton(false);
        this.appViewAnalytics.sendFollowStoreEvent();
        this.view.displayStoreFollowedSnack(appModel.getStore().getName());
        return this.appViewManager.subscribeStore(appModel.getStore().getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleClickOnFollowStore$138(AppModel appModel) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleClickOnFollowStore$139(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnOtherVersions$141, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e v0(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickOtherVersions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnOtherVersions$142, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single w0(Void r1) {
        return this.appViewManager.getAppModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnOtherVersions$143, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void x0(AppModel appModel) {
        this.appViewAnalytics.sendOtherVersionsEvent();
        this.appViewNavigator.navigateToOtherVersions(appModel.getAppName(), appModel.getIcon(), appModel.getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleClickOnOtherVersions$144(AppModel appModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnOtherVersions$145, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void y0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnRateApp$153, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e z0(View.LifecycleEvent lifecycleEvent) {
        return rx.e.b0(this.view.clickRateApp(), this.view.clickRateAppLarge(), this.view.clickRateAppLayout());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnRateApp$154, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single A0(Void r1) {
        return this.appViewManager.getAppModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnRateApp$155, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void B0(AppModel appModel) {
        this.appViewAnalytics.sendRateThisAppEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnRateApp$156, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e C0(AppModel appModel) {
        return this.view.showRateDialog(appModel.getAppName(), appModel.getPackageName(), appModel.getStore().getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleClickOnRateApp$157(GenericDialogs.EResponse eResponse) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnRateApp$158, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void D0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnRetry$195, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void E0(Void r1) {
        this.view.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnRetry$196, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e F0(Void r1) {
        return loadAppView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnRetry$197, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e G0(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickErrorRetry().x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.h2
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.E0((Void) obj);
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.q4
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.F0((Void) obj);
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleClickOnRetry$198(AppViewModel appViewModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnRetry$199, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void H0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnScreenshot$70, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e I0(View.LifecycleEvent lifecycleEvent) {
        return this.view.getScreenshotClickEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnScreenshot$72, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void J0(ScreenShotClickEvent screenShotClickEvent) {
        this.appViewAnalytics.sendOpenScreenshotEvent();
        this.appViewNavigator.navigateToScreenshots(screenShotClickEvent.getImagesUris(), screenShotClickEvent.getImagesIndex());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleClickOnScreenshot$73(ScreenShotClickEvent screenShotClickEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnScreenshot$74, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void K0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnSimilarApps$183, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e L0(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickSimilarApp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnSimilarApps$184, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e M0(SimilarAppClickEvent similarAppClickEvent) {
        String packageName;
        boolean z;
        ApplicationAd.Network network;
        AppViewSimilarApp similar = similarAppClickEvent.getSimilar();
        if (similar.isAd()) {
            z = true;
            network = similar.getAd().getNetwork();
            packageName = similar.getAd().getPackageName();
            if (similar.getAd().getNetwork() == ApplicationAd.Network.SERVER) {
                this.appViewNavigator.navigateToAd((AptoideNativeAd) similar.getAd(), similarAppClickEvent.getType().getDescription());
            }
        } else {
            packageName = similar.getApp().getPackageName();
            this.appViewNavigator.navigateToAppView(similar.getApp().getAppId(), packageName, similarAppClickEvent.getType().getDescription());
            z = false;
            network = null;
        }
        this.appViewAnalytics.sendSimilarAppsInteractEvent(similarAppClickEvent.getType().getDescription());
        this.appViewAnalytics.similarAppClick(similarAppClickEvent.getType(), network, packageName, similarAppClickEvent.getPosition(), z);
        return rx.e.S(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleClickOnSimilarApps$185(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnSimilarApps$186, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void N0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnStoreLayout$129, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e O0(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickStoreLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnStoreLayout$130, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single P0(Void r1) {
        return this.appViewManager.getAppModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnStoreLayout$131, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void Q0(AppModel appModel) {
        this.appViewAnalytics.sendStoreOpenEvent(appModel.getStore());
        this.appViewAnalytics.sendOpenStoreEvent();
        this.appViewNavigator.navigateToStore(appModel.getStore());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleClickOnStoreLayout$132(AppModel appModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnStoreLayout$133, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void R0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnToolbar$189, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void S0(MenuItem menuItem, AppModel appModel) {
        switch (menuItem.getItemId()) {
            case R.id.menu_item_share /* 2131296929 */:
                this.view.defaultShare(appModel.getAppName(), appModel.getUniqueName() + ".en.aptoide.com/");
                return;
            case R.id.menu_remote_install /* 2131296930 */:
                this.appViewAnalytics.sendRemoteInstallEvent();
                this.view.showShareOnTvDialog(appModel.getAppId());
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnToolbar$190, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e T0(final MenuItem menuItem) {
        return this.appViewManager.getAppModel().A().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.hc
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                MenuItem menuItem2 = menuItem;
                valueOf = Boolean.valueOf(r0 != null);
                return valueOf;
            }
        }).j0(this.viewScheduler).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.i7
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.S0(menuItem, (AppModel) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnToolbar$191, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e U0(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickToolbar().G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.t6
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.T0((MenuItem) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleClickOnToolbar$192(AppModel appModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnToolbar$193, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void V0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnTrustedBadge$147, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e W0(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickTrustedBadge();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnTrustedBadge$148, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single X0(Void r1) {
        return this.appViewManager.getAppModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnTrustedBadge$149, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void Y0(AppModel appModel) {
        this.appViewAnalytics.sendBadgeClickEvent();
        this.view.showTrustedDialog(appModel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleClickOnTrustedBadge$150(AppModel appModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnTrustedBadge$151, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void Z0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnVideo$76, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e a1(View.LifecycleEvent lifecycleEvent) {
        return this.view.getScreenshotClickEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnVideo$78, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void b1(ScreenShotClickEvent screenShotClickEvent) {
        this.appViewAnalytics.sendOpenVideoEvent();
        this.appViewNavigator.navigateToUri(screenShotClickEvent.getUri());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleClickOnVideo$79(ScreenShotClickEvent screenShotClickEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnVideo$80, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void c1(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickReadReviews$160, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e d1(View.LifecycleEvent lifecycleEvent) {
        return rx.e.a0(this.view.clickReviewsLayout(), this.view.clickReadAllReviews());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickReadReviews$161, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single e1(Void r1) {
        return this.appViewManager.getAppModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickReadReviews$162, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void f1(AppModel appModel) {
        this.appViewAnalytics.sendReadAllEvent();
        this.appViewNavigator.navigateToRateAndReview(appModel.getAppId(), appModel.getAppName(), appModel.getStore().getName(), appModel.getPackageName(), BuildConfig.APTOIDE_THEME);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleClickReadReviews$163(AppModel appModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickReadReviews$164, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void g1(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDismissWalletPromotion$265, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e h1(View.LifecycleEvent lifecycleEvent) {
        return this.view.dismissWalletPromotionClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDismissWalletPromotion$266, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void i1(Promotion promotion) {
        this.appViewAnalytics.sendClickOnNoThanksWallet(promotion.getPromotionId());
        this.view.dismissWalletPromotionView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleDismissWalletPromotion$267(Promotion promotion) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleDismissWalletPromotion$268(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDownloadingSimilarApp$46, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e j1(View.LifecycleEvent lifecycleEvent) {
        return rx.e.a0(this.view.installAppClick(), this.view.apkfyDialogPositiveClick());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDownloadingSimilarApp$47, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e k1(Serializable serializable) {
        return downloadInRange(0, 100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDownloadingSimilarApp$48, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void l1(DownloadModel downloadModel) {
        this.view.showDownloadingSimilarApps(this.appViewManager.getCachedAppcSimilarAppsViewModel().hasSimilarApps() || this.appViewManager.getCachedSimilarAppsViewModel().hasSimilarApps());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleDownloadingSimilarApp$49(DownloadModel downloadModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDownloadingSimilarApp$50, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m1(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFirstLoad$54, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void n1(View.LifecycleEvent lifecycleEvent) {
        this.view.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFirstLoad$55, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e o1(View.LifecycleEvent lifecycleEvent) {
        return loadAppView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleFirstLoad$56(AppViewModel appViewModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFirstLoad$57, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void p1(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallButtonClick$237, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e q1(View.LifecycleEvent lifecycleEvent) {
        return this.accountManager.accountStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallButtonClick$238, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void r1(AppModel appModel, DownloadModel.Action action) {
        String campaignUrl = appModel.getCampaignUrl();
        if (!campaignUrl.isEmpty()) {
            this.campaignAnalytics.sendCampaignConversionEvent(campaignUrl, appModel.getPackageName(), appModel.getVersionCode());
        }
        this.appViewAnalytics.clickOnInstallButton(appModel.getPackageName(), appModel.getDeveloper().getName(), action.toString(), appModel.hasSplits(), appModel.hasBilling(), false, appModel.getMalware().getRank().name(), appModel.getOriginTag(), appModel.getStore().getName(), appModel.getOpenType() == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP, appModel.getObb() != null, appModel.getBdsFlags(), appModel.getAppCategory());
        if (this.appViewManager.hasClaimablePromotion(Promotion.ClaimAction.INSTALL)) {
            this.appViewAnalytics.sendInstallPromotionApp();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallButtonClick$239, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b s1(final DownloadModel.Action action, final AppModel appModel) {
        return downloadApp(action, appModel, appModel.getOpenType() == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP).a(this.appViewManager.convertCampaign()).z(this.viewScheduler).m(new rx.m.a() { // from class: cm.aptoide.pt.app.view.w4
            @Override // rx.m.a
            public final void call() {
                AppViewPresenter.this.r1(appModel, action);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallButtonClick$240, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b t1(AppModel appModel) {
        return openInstalledApp(appModel.getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallButtonClick$241, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void u1(AppModel appModel, DownloadModel.Action action) {
        this.appViewAnalytics.clickOnInstallButton(appModel.getPackageName(), appModel.getDeveloper().getName(), action.toString(), appModel.hasSplits(), appModel.hasBilling(), false, appModel.getMalware().getRank().name(), appModel.getOriginTag(), appModel.getStore().getName(), appModel.getOpenType() == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP, appModel.getObb() != null, appModel.getBdsFlags(), appModel.getAppCategory());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallButtonClick$242, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b v1(final DownloadModel.Action action, final AppModel appModel) {
        return downgradeApp(action, appModel, appModel.getOpenType() == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP).a(this.appViewManager.convertCampaign()).m(new rx.m.a() { // from class: cm.aptoide.pt.app.view.d8
            @Override // rx.m.a
            public final void call() {
                AppViewPresenter.this.u1(appModel, action);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallButtonClick$243, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b w1(DownloadModel.Action action, AppModel appModel) {
        AppViewPresenter appViewPresenter;
        DownloadModel.Action action2;
        AppModel appModel2;
        boolean z;
        if (this.appViewManager.hasClaimablePromotion(Promotion.ClaimAction.MIGRATE)) {
            this.appViewAnalytics.sendAppcMigrationUpdateClick();
        }
        AppViewAnalytics appViewAnalytics = this.appViewAnalytics;
        String packageName = appModel.getPackageName();
        String name = appModel.getDeveloper().getName();
        boolean hasSplits = appModel.hasSplits();
        boolean hasBilling = appModel.hasBilling();
        String name2 = appModel.getMalware().getRank().name();
        String originTag = appModel.getOriginTag();
        String name3 = appModel.getStore().getName();
        AppViewFragment.OpenType openType = appModel.getOpenType();
        AppViewFragment.OpenType openType2 = AppViewFragment.OpenType.APK_FY_INSTALL_POPUP;
        appViewAnalytics.clickOnInstallButton(packageName, name, "UPDATE TO APPC", hasSplits, hasBilling, true, name2, originTag, name3, openType == openType2, appModel.getObb() != null, appModel.getBdsFlags(), appModel.getAppCategory());
        if (appModel.getOpenType() == openType2) {
            appViewPresenter = this;
            action2 = action;
            appModel2 = appModel;
            z = true;
        } else {
            appViewPresenter = this;
            action2 = action;
            appModel2 = appModel;
            z = false;
        }
        return appViewPresenter.migrateApp(action2, appModel2, z).a(appViewPresenter.appViewManager.convertCampaign());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallButtonClick$244, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b x1(final DownloadModel.Action action) {
        int i2 = AnonymousClass1.$SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[action.ordinal()];
        if (i2 == 1 || i2 == 2) {
            return this.appViewManager.getAppModel().j(new rx.m.e() { // from class: cm.aptoide.pt.app.view.n5
                @Override // rx.m.e
                public final Object call(Object obj) {
                    return AppViewPresenter.this.s1(action, (AppModel) obj);
                }
            });
        }
        if (i2 == 3) {
            return this.appViewManager.getAppModel().p(this.viewScheduler).j(new rx.m.e() { // from class: cm.aptoide.pt.app.view.h7
                @Override // rx.m.e
                public final Object call(Object obj) {
                    return AppViewPresenter.this.t1((AppModel) obj);
                }
            });
        }
        if (i2 == 4) {
            return this.appViewManager.getAppModel().p(this.viewScheduler).j(new rx.m.e() { // from class: cm.aptoide.pt.app.view.x3
                @Override // rx.m.e
                public final Object call(Object obj) {
                    return AppViewPresenter.this.v1(action, (AppModel) obj);
                }
            });
        }
        if (i2 != 5) {
            return rx.b.s(new IllegalArgumentException("Invalid type of action"));
        }
        return this.appViewManager.getAppModel().p(this.viewScheduler).j(new rx.m.e() { // from class: cm.aptoide.pt.app.view.i5
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.w1(action, (AppModel) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallButtonClick$245, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void y1(Throwable th) {
        this.crashReport.log(th);
        if (th instanceof InvalidAppException) {
            this.view.showInvalidAppInfoErrorDialog();
        } else {
            this.view.showGenericErrorDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallButtonClick$246, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e z1(Account account) {
        return this.view.installAppClick().H(new rx.m.e() { // from class: cm.aptoide.pt.app.view.k2
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.x1((DownloadModel.Action) obj);
            }
        }).w(new rx.m.b() { // from class: cm.aptoide.pt.app.view.t4
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.y1((Throwable) obj);
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleInstallButtonClick$247(DownloadModel.Action action) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleInstallButtonClick$248(Throwable th) {
        throw new IllegalStateException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallWalletPromotion$270, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void A1(Pair pair) {
        this.appViewAnalytics.sendInstallAppcWallet(((Promotion) pair.first).getPromotionId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallWalletPromotion$271, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b B1(Pair pair) {
        return downloadWallet((WalletApp) pair.second);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallWalletPromotion$272, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e C1(View.LifecycleEvent lifecycleEvent) {
        return this.view.installWalletButtonClick().x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.p1
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.A1((Pair) obj);
            }
        }).H(new rx.m.e() { // from class: cm.aptoide.pt.app.view.s1
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.B1((Pair) obj);
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleInstallWalletPromotion$273(Pair pair) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleInstallWalletPromotion$274(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOnSimilarAppsVisible$60, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e D1(View.LifecycleEvent lifecycleEvent) {
        return rx.e.a0(this.view.scrollVisibleSimilarApps().X(new rx.m.e() { // from class: cm.aptoide.pt.app.view.db
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean bool;
                bool = Boolean.TRUE;
                return bool;
            }
        }), this.view.similarAppsVisibilityFromInstallClick());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOnSimilarAppsVisible$61, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void E1(Boolean bool) {
        sendSimilarAppInteractEvent(this.appViewManager.getCachedSimilarAppsViewModel());
        sendSimilarAppcAppsImpressionEvent(this.appViewManager.getCachedAppcSimilarAppsViewModel());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleOnSimilarAppsVisible$62(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOnSimilarAppsVisible$63, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void F1(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOutOfSpaceDialogResult$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e G1(View.LifecycleEvent lifecycleEvent) {
        return this.appViewNavigator.outOfSpaceDialogResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOutOfSpaceDialogResult$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b H1(PromotionViewModel promotionViewModel) {
        return this.appViewManager.resumeDownload(promotionViewModel.getWalletApp().getMd5sum(), promotionViewModel.getWalletApp().getId(), promotionViewModel.getWalletApp().getDownloadModel().getAction(), promotionViewModel.getWalletApp().getTrustedBadge(), false, true, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOutOfSpaceDialogResult$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b I1(AppViewModel appViewModel) {
        return this.appViewManager.resumeDownload(appViewModel.getAppModel().getMd5(), appViewModel.getAppModel().getAppId(), appViewModel.getDownloadModel().getAction(), appViewModel.getAppModel().getMalware().getRank().toString(), appViewModel.getAppModel().getOpenType() == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP, appViewModel.getAppModel().getBdsFlags().contains("STORE_BDS"), appViewModel.getAppModel().getAppCategory());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOutOfSpaceDialogResult$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e J1(OutOfSpaceNavigatorWrapper outOfSpaceNavigatorWrapper) {
        if (outOfSpaceNavigatorWrapper.getPackageName().equals(AptoideApplication.APPCOINS_WALLET_PACKAGE_NAME)) {
            return this.appViewManager.loadPromotionViewModel().H(new rx.m.e() { // from class: cm.aptoide.pt.app.view.b4
                @Override // rx.m.e
                public final Object call(Object obj) {
                    return AppViewPresenter.this.H1((PromotionViewModel) obj);
                }
            });
        }
        return this.appViewManager.getAppViewModel().A().H(new rx.m.e() { // from class: cm.aptoide.pt.app.view.w7
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.I1((AppViewModel) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleOutOfSpaceDialogResult$6(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOutOfSpaceDialogResult$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void K1(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePromotionClaimResult$298, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e L1(View.LifecycleEvent lifecycleEvent) {
        return this.promotionsNavigator.claimDialogResults();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePromotionClaimResult$299, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void M1(ClaimDialogResultWrapper claimDialogResultWrapper) {
        this.appViewManager.unscheduleNotificationSync();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handlePromotionClaimResult$300(ClaimDialogResultWrapper claimDialogResultWrapper) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handlePromotionClaimResult$301(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleReviewAutoScroll$65, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e N1(View.LifecycleEvent lifecycleEvent) {
        return this.view.scrollReviewsResponse();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleReviewAutoScroll$66, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e O1(Integer num) {
        return scheduleAnimations(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleReviewAutoScroll$67(Integer num) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleReviewAutoScroll$68, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void P1(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadAds$10, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e R1(AppViewModel appViewModel, Boolean bool) {
        return loadOrganicAds(appViewModel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ AppViewModel lambda$loadAds$11(AppViewModel appViewModel, SearchAdResult searchAdResult) {
        return appViewModel;
    }

    private /* synthetic */ AppViewModel lambda$loadAds$12(AppViewModel appViewModel, Throwable th) {
        this.crashReport.log(th);
        return appViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadAppView$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e T1(AppViewModel appViewModel) {
        return rx.e.h0(loadAds(appViewModel), handleAppViewOpenOptions(appViewModel), loadAppcPromotion(appViewModel), observePromotionDownloadErrors(appViewModel), observeDownloadApp(), observeDownloadErrors(), loadOtherAppViewComponents(appViewModel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadAppcPromotion$29, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e U1(AppModel appModel) {
        return this.appViewManager.loadPromotionViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadAppcPromotion$30, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void V1(PromotionViewModel promotionViewModel) {
        if (promotionViewModel.getAppViewModel() == null) {
            return;
        }
        DownloadModel downloadModel = promotionViewModel.getAppViewModel().getDownloadModel();
        AppModel appModel = promotionViewModel.getAppViewModel().getAppModel();
        Promotion.ClaimAction claimAction = Promotion.ClaimAction.INSTALL;
        if (downloadModel != null && downloadModel.getAction() == DownloadModel.Action.MIGRATE) {
            claimAction = Promotion.ClaimAction.MIGRATE;
        } else if (promotionViewModel.getAppViewModel().getMigrationModel().isMigrated() && downloadModel != null && downloadModel.getAction() == DownloadModel.Action.OPEN) {
            claimAction = Promotion.ClaimAction.MIGRATE;
        }
        Promotion claimablePromotion = this.appViewManager.getClaimablePromotion(promotionViewModel.getPromotions(), claimAction);
        if (claimablePromotion == null || appModel == null || downloadModel == null) {
            return;
        }
        this.view.showAppcWalletPromotionView(claimablePromotion, promotionViewModel.getWalletApp(), claimAction, downloadModel);
        if (!this.appViewManager.isAppcPromotionImpressionSent()) {
            this.appViewAnalytics.sendPromotionImpression(claimablePromotion.getPromotionId());
            this.appViewManager.setAppcPromotionImpressionSent();
        }
        if (promotionViewModel.getWalletApp().isInstalled() && downloadModel.getAction() == DownloadModel.Action.OPEN) {
            this.appViewManager.scheduleNotification(String.valueOf(claimablePromotion.getAppc()), appModel.getIcon(), appModel.getPackageName(), appModel.getStore().getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ AppViewModel lambda$loadAppcPromotion$31(AppViewModel appViewModel, PromotionViewModel promotionViewModel) {
        return appViewModel;
    }

    private /* synthetic */ AppViewModel lambda$loadAppcPromotion$32(AppViewModel appViewModel, Throwable th) {
        th.printStackTrace();
        this.crashReport.log(th);
        return appViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadOrganicAds$13, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void X1(SearchAdResult searchAdResult) {
        this.appViewManager.setSearchAdResult(searchAdResult);
        handleAdsLogic(this.appViewManager.getSearchAdResult());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$loadOrganicAds$14(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadOrganicAds$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void Y1(SearchAdResult searchAdResult, SearchAdResult searchAdResult2) {
        handleAdsLogic(searchAdResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadOrganicAds$16, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single Z1(final SearchAdResult searchAdResult) {
        if (searchAdResult == null) {
            return this.appViewManager.loadAdsFromAppView().g(new rx.m.b() { // from class: cm.aptoide.pt.app.view.o3
                @Override // rx.m.b
                public final void call(Object obj) {
                    AppViewPresenter.this.X1((SearchAdResult) obj);
                }
            }).e(new rx.m.b() { // from class: cm.aptoide.pt.app.view.w9
                @Override // rx.m.b
                public final void call(Object obj) {
                    AppViewPresenter.lambda$loadOrganicAds$14((Throwable) obj);
                }
            });
        }
        return Single.m(searchAdResult).g(new rx.m.b() { // from class: cm.aptoide.pt.app.view.xc
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.Y1(searchAdResult, (SearchAdResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ SearchAdResult lambda$loadOrganicAds$17(Throwable th) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ AppViewModel lambda$loadOtherAppViewComponents$27(AppViewModel appViewModel, rx.e eVar) {
        return appViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observeDownloadApp$37, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void a2(AppViewModel appViewModel) {
        this.view.showDownloadAppModel(appViewModel.getDownloadModel(), appViewModel.getAppCoinsViewModel(), appViewModel.getAppModel().hasSplits());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observeDownloadErrors$39, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e b2(DownloadModel.Action action) {
        return this.appViewManager.observeAppViewModel().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.n7
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((AppViewModel) obj).getDownloadModel().hasError());
                return valueOf;
            }
        }).E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observeDownloadErrors$40, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void c2(AppViewModel appViewModel) {
        if (appViewModel.getDownloadModel().getDownloadState().equals(DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR)) {
            this.appViewNavigator.navigateToOutOfSpaceDialog(appViewModel.getAppModel().getSize(), appViewModel.getAppModel().getPackageName());
        } else {
            this.view.showDownloadError(appViewModel.getDownloadModel());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observePromotionDownloadErrors$34, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e d2(Object obj) {
        return this.appViewManager.loadPromotionViewModel().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.w1
            @Override // rx.m.e
            public final Object call(Object obj2) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1.getWalletApp().getDownloadModel() != null && r1.getWalletApp().getDownloadModel().hasError());
                return valueOf;
            }
        }).E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observePromotionDownloadErrors$35, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void e2(PromotionViewModel promotionViewModel) {
        if (promotionViewModel.getWalletApp().getDownloadModel().getDownloadState().equals(DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR)) {
            this.appViewNavigator.navigateToOutOfSpaceDialog(promotionViewModel.getWalletApp().getSize(), promotionViewModel.getWalletApp().getPackageName());
        } else {
            this.view.showDownloadError(promotionViewModel.getWalletApp().getDownloadModel());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ AppViewModel lambda$observePromotionDownloadErrors$36(AppViewModel appViewModel, PromotionViewModel promotionViewModel) {
        return appViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$openInstalledApp$252, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void f2(String str) {
        this.view.openApp(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$pauseDownload$230, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single g2(Void r1) {
        return this.appViewManager.getAppModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$pauseDownload$231, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void h2(AppModel appModel) {
        this.appViewAnalytics.sendDownloadPauseEvent(appModel.getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$pauseDownload$232, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b i2(AppModel appModel) {
        return this.appViewManager.pauseDownload(appModel.getMd5());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$pauseDownload$233, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e j2(View.LifecycleEvent lifecycleEvent) {
        return this.view.pauseDownload().L(new rx.m.e() { // from class: cm.aptoide.pt.app.view.o5
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.g2((Void) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.x2
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.h2((AppModel) obj);
            }
        }).H(new rx.m.e() { // from class: cm.aptoide.pt.app.view.g7
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.i2((AppModel) obj);
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$pauseDownload$234(AppModel appModel) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$pauseDownload$235(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$pauseWalletDownload$287, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b k2(WalletApp walletApp) {
        return this.appViewManager.pauseDownload(walletApp.getMd5sum());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$pauseWalletDownload$288, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e l2(View.LifecycleEvent lifecycleEvent) {
        return this.view.pausePromotionDownload().H(new rx.m.e() { // from class: cm.aptoide.pt.app.view.r6
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.k2((WalletApp) obj);
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$pauseWalletDownload$289(WalletApp walletApp) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$pauseWalletDownload$290(Throwable th) {
        throw new IllegalStateException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$223, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e n2(DownloadModel.Action action) {
        return this.permissionManager.requestExternalStoragePermission(this.permissionService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$224, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single o2(Void r1) {
        return this.appViewManager.getAppViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$225, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b p2(AppViewModel appViewModel) {
        return this.appViewManager.resumeDownload(appViewModel.getAppModel().getMd5(), appViewModel.getAppModel().getAppId(), appViewModel.getDownloadModel().getAction(), appViewModel.getAppModel().getMalware().getRank().toString(), appViewModel.getAppModel().getOpenType() == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP, appViewModel.getAppModel().getBdsFlags().contains("STORE_BDS"), appViewModel.getAppModel().getAppCategory()).E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$226, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e q2(View.LifecycleEvent lifecycleEvent) {
        return this.view.resumeDownload().G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.ma
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.n2((DownloadModel.Action) obj);
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.app.view.k1
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.o2((Void) obj);
            }
        }).H(new rx.m.e() { // from class: cm.aptoide.pt.app.view.d9
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.p2((AppViewModel) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$resumeDownload$227(AppViewModel appViewModel) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$resumeDownload$228(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeWalletDownload$276, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b r2(WalletApp walletApp, Void r11) {
        return this.appViewManager.resumeDownload(walletApp.getMd5sum(), walletApp.getId(), walletApp.getDownloadModel().getAction(), walletApp.getTrustedBadge(), false, true, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeWalletDownload$277, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e s2(final WalletApp walletApp) {
        return this.permissionManager.requestExternalStoragePermission(this.permissionService).H(new rx.m.e() { // from class: cm.aptoide.pt.app.view.l5
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.r2(walletApp, (Void) obj);
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeWalletDownload$278, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e t2(View.LifecycleEvent lifecycleEvent) {
        return this.view.resumePromotionDownload().G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.a6
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.s2((WalletApp) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$resumeWalletDownload$279(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$resumeWalletDownload$280(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$scheduleAnimations$204, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void u2(Integer num) {
        this.view.scrollReviews(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$scheduleAnimations$205, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e v2(Integer num) {
        return rx.e.S(num).q(TIME_BETWEEN_SCROLL, TimeUnit.MILLISECONDS).j0(rx.l.c.a.b()).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.o2
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.u2((Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ List lambda$sortSuggestedApps$210(List list, AppModel appModel, List list2) {
        if (list.size() >= 2) {
            if (appModel.isAppCoinApp()) {
                if (((SimilarAppsBundle) list.get(0)).getType() == SimilarAppsBundle.BundleType.APPS) {
                    Collections.swap(list, 0, 1);
                }
            } else if (((SimilarAppsBundle) list.get(0)).getType() == SimilarAppsBundle.BundleType.APPC_APPS) {
                Collections.swap(list, 0, 1);
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateReviews$213, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void w2(Throwable th) {
        this.view.hideReviews();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateReviews$214, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void x2(AppModel appModel, ReviewsViewModel reviewsViewModel) {
        if (reviewsViewModel.hasError()) {
            this.view.hideReviews();
        } else {
            this.view.populateReviews(reviewsViewModel, appModel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateSimilarAppsBundles$209, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void B2(List list) {
        this.view.populateSimilar(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ List lambda$updateSuggestedAppcApps$211(List list, SimilarAppsViewModel similarAppsViewModel) {
        if (similarAppsViewModel.hasSimilarApps()) {
            list.add(new SimilarAppsBundle(similarAppsViewModel, SimilarAppsBundle.BundleType.APPC_APPS));
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ List lambda$updateSuggestedApps$212(List list, SimilarAppsViewModel similarAppsViewModel) {
        if (similarAppsViewModel.hasSimilarApps()) {
            list.add(new SimilarAppsBundle(similarAppsViewModel, SimilarAppsBundle.BundleType.APPS));
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$verifyNotEnoughSpaceError$41, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void C2(AppModel appModel) {
        this.appViewAnalytics.sendNotEnoughSpaceErrorEvent(appModel.getMd5());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ AppViewModel lambda$verifyNotEnoughSpaceError$42(AppViewModel appViewModel, Object obj) {
        return appViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$verifyNotEnoughSpaceError$43, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void D2(WalletApp walletApp) {
        this.appViewAnalytics.sendNotEnoughSpaceErrorEvent(walletApp.getMd5sum());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ PromotionViewModel lambda$verifyNotEnoughSpaceError$44(PromotionViewModel promotionViewModel, Object obj) {
        return promotionViewModel;
    }

    private rx.e<AppViewModel> loadAppView() {
        return this.appViewManager.getAppViewModel().p(this.viewScheduler).g(new rx.m.b() { // from class: cm.aptoide.pt.app.view.o7
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.showAppView((AppViewModel) obj);
            }
        }).g(new rx.m.b() { // from class: cm.aptoide.pt.app.view.aa
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.sendAppViewLoadAnalytics((AppViewModel) obj);
            }
        }).A().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.f5
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                AppViewModel appViewModel = (AppViewModel) obj;
                valueOf = Boolean.valueOf(!appViewModel.getAppModel().hasError());
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.f8
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.T1((AppViewModel) obj);
            }
        });
    }

    private rx.e<SearchAdResult> loadOrganicAds(AppViewModel appViewModel) {
        return Single.m(appViewModel.getAppModel().getMinimalAd()).p(Schedulers.io()).i(new rx.m.e() { // from class: cm.aptoide.pt.app.view.w8
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.Z1((SearchAdResult) obj);
            }
        }).r(new rx.m.e() { // from class: cm.aptoide.pt.app.view.f7
            @Override // rx.m.e
            public final Object call(Object obj) {
                AppViewPresenter.lambda$loadOrganicAds$17((Throwable) obj);
                return null;
            }
        }).A().j0(this.viewScheduler);
    }

    private rx.b migrateApp(DownloadModel.Action action, AppModel appModel, boolean z) {
        return downloadApp(action, appModel, false);
    }

    private rx.e<AppViewModel> observeDownloadErrors() {
        return rx.e.a0(this.view.installAppClick(), this.view.resumeDownload()).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.ha
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.b2((DownloadModel.Action) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.j7
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.c2((AppViewModel) obj);
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.mb
            @Override // rx.m.e
            public final Object call(Object obj) {
                rx.e verifyNotEnoughSpaceError;
                verifyNotEnoughSpaceError = AppViewPresenter.this.verifyNotEnoughSpaceError((AppViewModel) obj);
                return verifyNotEnoughSpaceError;
            }
        }).s0();
    }

    private rx.b openInstalledApp(final String str) {
        return rx.b.t(new rx.m.a() { // from class: cm.aptoide.pt.app.view.b3
            @Override // rx.m.a
            public final void call() {
                AppViewPresenter.this.f2(str);
            }
        });
    }

    private void pauseDownload() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.ya
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.i6
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.j2((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.e3
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$pauseDownload$234((AppModel) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.nb
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$pauseDownload$235((Throwable) obj);
            }
        });
    }

    private void pauseWalletDownload() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.o4
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.v6
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.l2((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.h9
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$pauseWalletDownload$289((WalletApp) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.ea
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$pauseWalletDownload$290((Throwable) obj);
                throw null;
            }
        });
    }

    private void resumeDownload() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.qc
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.bb
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.q2((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.w2
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$resumeDownload$227((AppViewModel) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.m3
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$resumeDownload$228((Throwable) obj);
            }
        });
    }

    private void resumeWalletDownload() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.i8
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.ka
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.t2((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.s3
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$resumeWalletDownload$279((Void) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.s2
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$resumeWalletDownload$280((Throwable) obj);
            }
        });
    }

    private rx.e<Integer> scheduleAnimations(int i2) {
        if (i2 <= 1) {
            Logger.getInstance().w(TAG, "Not enough top reviews to do paging animation.");
            return rx.e.B();
        }
        return rx.e.r0(0, i2).i(new rx.m.e() { // from class: cm.aptoide.pt.app.view.c2
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.v2((Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAppViewLoadAnalytics(AppViewModel appViewModel) {
        AppModel appModel = appViewModel.getAppModel();
        if (appModel.isFromEditorsChoice()) {
            this.appViewManager.sendEditorsAppOpenAnalytics(appModel.getPackageName(), appModel.getDeveloper().getName(), appModel.getMalware().getRank().name(), appModel.hasBilling(), appModel.hasAdvertising(), appModel.getEditorsChoice());
        } else {
            this.appViewManager.sendAppOpenAnalytics(appModel.getPackageName(), appModel.getDeveloper().getName(), appModel.getMalware().getRank().name(), appModel.hasBilling(), appModel.hasAdvertising());
        }
        if (!appViewModel.getDownloadModel().getAction().equals(DownloadModel.Action.MIGRATE) || this.appViewManager.isMigrationImpressionSent()) {
            return;
        }
        this.appViewManager.setMigrationImpressionSent();
        this.appViewAnalytics.sendAppcMigrationAppOpen();
    }

    private void sendSimilarAppInteractEvent(SimilarAppsViewModel similarAppsViewModel) {
        sendSimilarAppsAdImpressionEvent(similarAppsViewModel);
        this.appViewAnalytics.similarAppBundleImpression(null, false);
    }

    private void sendSimilarAppcAppsImpressionEvent(SimilarAppsViewModel similarAppsViewModel) {
        if (similarAppsViewModel != null) {
            this.appViewAnalytics.similarAppcAppBundleImpression();
        }
    }

    private void sendSimilarAppsAdImpressionEvent(SimilarAppsViewModel similarAppsViewModel) {
        if (similarAppsViewModel == null || !similarAppsViewModel.hasAd() || similarAppsViewModel.hasRecordedAdImpression()) {
            return;
        }
        similarAppsViewModel.setHasRecordedAdImpression(true);
        this.appViewAnalytics.similarAppBundleImpression(similarAppsViewModel.getAd().getNetwork(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showAppView(AppViewModel appViewModel) {
        if (appViewModel.getAppModel().hasError()) {
            this.view.handleError(appViewModel.getAppModel().getError());
            return;
        }
        this.view.setInstallButton(appViewModel.getAppCoinsViewModel());
        this.view.showAppView(appViewModel.getAppModel());
        this.view.showDownloadAppModel(appViewModel.getDownloadModel(), appViewModel.getAppCoinsViewModel(), appViewModel.getAppModel().hasSplits());
        if (appViewModel.getAppCoinsViewModel().hasAdvertising() || appViewModel.getAppCoinsViewModel().hasBilling()) {
            this.view.setupAppcAppView(appViewModel.getAppCoinsViewModel().hasBilling(), appViewModel.getAppCoinsViewModel().getBonusAppcModel());
        }
        this.view.recoverScrollViewState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sortSuggestedApps, reason: merged with bridge method [inline-methods] */
    public rx.e<List<SimilarAppsBundle>> A2(final AppModel appModel, final List<SimilarAppsBundle> list) {
        return rx.e.S(list).X(new rx.m.e() { // from class: cm.aptoide.pt.app.view.t1
            @Override // rx.m.e
            public final Object call(Object obj) {
                List list2 = list;
                AppViewPresenter.lambda$sortSuggestedApps$210(list2, appModel, (List) obj);
                return list2;
            }
        });
    }

    private rx.e<ReviewsViewModel> updateReviews(final AppModel appModel) {
        return this.appViewManager.loadReviewsViewModel(appModel.getStore().getName(), appModel.getPackageName(), this.view.getLanguageFilter()).p(this.viewScheduler).e(new rx.m.b() { // from class: cm.aptoide.pt.app.view.t9
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.w2((Throwable) obj);
            }
        }).g(new rx.m.b() { // from class: cm.aptoide.pt.app.view.a5
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.x2(appModel, (ReviewsViewModel) obj);
            }
        }).A();
    }

    private rx.e<List<SimilarAppsBundle>> updateSimilarAppsBundles(final AppModel appModel) {
        return rx.e.S(new ArrayList()).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.l4
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.y2(appModel, (ArrayList) obj);
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.p4
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.z2(appModel, (List) obj);
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.x9
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.A2(appModel, (List) obj);
            }
        }).j0(this.viewScheduler).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.tc
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.B2((List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateSuggestedAppcApps, reason: merged with bridge method [inline-methods] */
    public rx.e<List<SimilarAppsBundle>> y2(AppModel appModel, final List<SimilarAppsBundle> list) {
        return this.appViewManager.loadAppcSimilarAppsViewModel(appModel.getPackageName()).n(new rx.m.e() { // from class: cm.aptoide.pt.app.view.yc
            @Override // rx.m.e
            public final Object call(Object obj) {
                List list2 = list;
                AppViewPresenter.lambda$updateSuggestedAppcApps$211(list2, (SimilarAppsViewModel) obj);
                return list2;
            }
        }).A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateSuggestedApps, reason: merged with bridge method [inline-methods] */
    public rx.e<List<SimilarAppsBundle>> z2(AppModel appModel, final List<SimilarAppsBundle> list) {
        return this.appViewManager.loadSimilarAppsViewModel(appModel.getPackageName(), appModel.getMedia().getKeywords()).n(new rx.m.e() { // from class: cm.aptoide.pt.app.view.m2
            @Override // rx.m.e
            public final Object call(Object obj) {
                List list2 = list;
                AppViewPresenter.lambda$updateSuggestedApps$212(list2, (SimilarAppsViewModel) obj);
                return list2;
            }
        }).A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public rx.e<AppViewModel> verifyNotEnoughSpaceError(final AppViewModel appViewModel) {
        final AppModel appModel = appViewModel.getAppModel();
        if (appViewModel.getDownloadModel().getDownloadState() == DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR) {
            return rx.b.t(new rx.m.a() { // from class: cm.aptoide.pt.app.view.r5
                @Override // rx.m.a
                public final void call() {
                    AppViewPresenter.this.C2(appModel);
                }
            }).M().X(new rx.m.e() { // from class: cm.aptoide.pt.app.view.u1
                @Override // rx.m.e
                public final Object call(Object obj) {
                    AppViewModel appViewModel2 = AppViewModel.this;
                    AppViewPresenter.lambda$verifyNotEnoughSpaceError$42(appViewModel2, obj);
                    return appViewModel2;
                }
            });
        }
        return rx.e.S(appViewModel);
    }

    public /* synthetic */ AppViewModel C(AppViewModel appViewModel, Throwable th) {
        lambda$handleAppViewOpenOptions$23(appViewModel, th);
        return appViewModel;
    }

    public /* synthetic */ AppViewModel S1(AppViewModel appViewModel, Throwable th) {
        lambda$loadAds$12(appViewModel, th);
        return appViewModel;
    }

    public /* synthetic */ AppViewModel W1(AppViewModel appViewModel, Throwable th) {
        lambda$loadAppcPromotion$32(appViewModel, th);
        return appViewModel;
    }

    public rx.e<AppViewModel> handleAppViewOpenOptions(final AppViewModel appViewModel) {
        final AppModel appModel = appViewModel.getAppModel();
        final DownloadModel.Action action = appViewModel.getDownloadModel().getAction();
        return handleOpenAppViewDialogInput(appViewModel.getAppModel()).D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.va
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean bool = (Boolean) obj;
                AppViewPresenter.lambda$handleAppViewOpenOptions$18(bool);
                return bool;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.y1
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.z(appModel, action, appViewModel, (Boolean) obj);
            }
        }).H(new rx.m.e() { // from class: cm.aptoide.pt.app.view.g9
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.B(action, appModel, (Boolean) obj);
            }
        }).K0(rx.e.S(Boolean.FALSE)).X(new rx.m.e() { // from class: cm.aptoide.pt.app.view.qa
            @Override // rx.m.e
            public final Object call(Object obj) {
                AppViewModel appViewModel2 = AppViewModel.this;
                AppViewPresenter.lambda$handleAppViewOpenOptions$22(appViewModel2, (Boolean) obj);
                return appViewModel2;
            }
        }).p0(new rx.m.e() { // from class: cm.aptoide.pt.app.view.q6
            @Override // rx.m.e
            public final Object call(Object obj) {
                AppViewPresenter appViewPresenter = AppViewPresenter.this;
                AppViewModel appViewModel2 = appViewModel;
                appViewPresenter.C(appViewModel2, (Throwable) obj);
                return appViewModel2;
            }
        });
    }

    public void handleFirstLoad() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.o8
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.fb
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.n1((View.LifecycleEvent) obj);
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.n6
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.o1((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.cc
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleFirstLoad$56((AppViewModel) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.v3
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.p1((Throwable) obj);
            }
        });
    }

    public rx.e<AppViewModel> loadAds(final AppViewModel appViewModel) {
        return this.appViewManager.registerAppsFlyerImpression(appViewModel.getAppModel().getPackageName()).e(new rx.m.b() { // from class: cm.aptoide.pt.app.view.cg
            @Override // rx.m.b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }).A().I0(Schedulers.io()).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.r8
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.R1(appViewModel, (Boolean) obj);
            }
        }).X(new rx.m.e() { // from class: cm.aptoide.pt.app.view.l6
            @Override // rx.m.e
            public final Object call(Object obj) {
                AppViewModel appViewModel2 = AppViewModel.this;
                AppViewPresenter.lambda$loadAds$11(appViewModel2, (SearchAdResult) obj);
                return appViewModel2;
            }
        }).p0(new rx.m.e() { // from class: cm.aptoide.pt.app.view.rc
            @Override // rx.m.e
            public final Object call(Object obj) {
                AppViewPresenter appViewPresenter = AppViewPresenter.this;
                AppViewModel appViewModel2 = appViewModel;
                appViewPresenter.S1(appViewModel2, (Throwable) obj);
                return appViewModel2;
            }
        });
    }

    public rx.e<AppViewModel> loadAppcPromotion(final AppViewModel appViewModel) {
        return rx.e.S(appViewModel.getAppModel()).D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.gb
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1.hasBilling() || r1.hasAdvertising());
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.d6
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.U1((AppModel) obj);
            }
        }).j0(this.viewScheduler).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.i3
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.V1((PromotionViewModel) obj);
            }
        }).X(new rx.m.e() { // from class: cm.aptoide.pt.app.view.c4
            @Override // rx.m.e
            public final Object call(Object obj) {
                AppViewModel appViewModel2 = AppViewModel.this;
                AppViewPresenter.lambda$loadAppcPromotion$31(appViewModel2, (PromotionViewModel) obj);
                return appViewModel2;
            }
        }).p0(new rx.m.e() { // from class: cm.aptoide.pt.app.view.cb
            @Override // rx.m.e
            public final Object call(Object obj) {
                AppViewPresenter appViewPresenter = AppViewPresenter.this;
                AppViewModel appViewModel2 = appViewModel;
                appViewPresenter.W1(appViewModel2, (Throwable) obj);
                return appViewModel2;
            }
        });
    }

    public rx.e<AppViewModel> loadOtherAppViewComponents(final AppViewModel appViewModel) {
        return rx.e.d1(updateSimilarAppsBundles(appViewModel.getAppModel()), updateReviews(appViewModel.getAppModel()), new rx.m.f() { // from class: cm.aptoide.pt.app.view.bd
            @Override // rx.m.f
            public final Object a(Object obj, Object obj2) {
                rx.e S;
                S = rx.e.S(AppViewModel.this);
                return S;
            }
        }).E().X(new rx.m.e() { // from class: cm.aptoide.pt.app.view.w6
            @Override // rx.m.e
            public final Object call(Object obj) {
                AppViewModel appViewModel2 = AppViewModel.this;
                AppViewPresenter.lambda$loadOtherAppViewComponents$27(appViewModel2, (rx.e) obj);
                return appViewModel2;
            }
        });
    }

    public rx.e<AppViewModel> observeDownloadApp() {
        return this.appViewManager.observeAppViewModel().j0(this.viewScheduler).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.l1
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.a2((AppViewModel) obj);
            }
        });
    }

    public rx.e<AppViewModel> observePromotionDownloadErrors(final AppViewModel appViewModel) {
        return rx.e.a0(this.view.resumePromotionDownload(), this.view.installWalletButtonClick()).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.f2
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppViewPresenter.this.d2(obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.u7
            @Override // rx.m.b
            public final void call(Object obj) {
                AppViewPresenter.this.e2((PromotionViewModel) obj);
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.i2
            @Override // rx.m.e
            public final Object call(Object obj) {
                rx.e verifyNotEnoughSpaceError;
                verifyNotEnoughSpaceError = AppViewPresenter.this.verifyNotEnoughSpaceError((PromotionViewModel) obj);
                return verifyNotEnoughSpaceError;
            }
        }).X(new rx.m.e() { // from class: cm.aptoide.pt.app.view.ec
            @Override // rx.m.e
            public final Object call(Object obj) {
                AppViewModel appViewModel2 = AppViewModel.this;
                AppViewPresenter.lambda$observePromotionDownloadErrors$36(appViewModel2, (PromotionViewModel) obj);
                return appViewModel2;
            }
        }).s0();
    }

    @Override // cm.aptoide.pt.presenter.Presenter
    public void present() {
        handleFirstLoad();
        handleReviewAutoScroll();
        handleClickOnScreenshot();
        handleClickOnVideo();
        handleClickOnDescriptionReadMore();
        handleClickOnDeveloperWebsite();
        handleClickOnDeveloperEmail();
        handleClickOnDeveloperPrivacy();
        handleClickOnDeveloperPermissions();
        handleClickOnStoreLayout();
        handleClickOnFollowStore();
        handleClickOnOtherVersions();
        handleClickOnTrustedBadge();
        handleClickOnRateApp();
        handleClickReadReviews();
        handleClickFlags();
        handleClickLoginSnack();
        handleClickOnAppcInfo();
        handleClickOnBonusAppcFlair();
        handleClickOnAppcIabInfo();
        handleClickOnSimilarApps();
        handleClickOnToolbar();
        handleClickOnRetry();
        handleClickOnCatappultCard();
        handleOnSimilarAppsVisible();
        handleInstallButtonClick();
        pauseDownload();
        resumeDownload();
        cancelDownload();
        handleApkfyDialogPositiveClick();
        handleDismissWalletPromotion();
        handleInstallWalletPromotion();
        claimApp();
        handlePromotionClaimResult();
        resumeWalletDownload();
        cancelPromotionDownload();
        pauseWalletDownload();
        handleDownloadingSimilarApp();
        handleOutOfSpaceDialogResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public rx.e<PromotionViewModel> verifyNotEnoughSpaceError(final PromotionViewModel promotionViewModel) {
        final WalletApp walletApp = promotionViewModel.getWalletApp();
        DownloadModel downloadModel = walletApp.getDownloadModel();
        if (downloadModel != null && downloadModel.getDownloadState() == DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR) {
            return rx.b.t(new rx.m.a() { // from class: cm.aptoide.pt.app.view.a3
                @Override // rx.m.a
                public final void call() {
                    AppViewPresenter.this.D2(walletApp);
                }
            }).M().X(new rx.m.e() { // from class: cm.aptoide.pt.app.view.v4
                @Override // rx.m.e
                public final Object call(Object obj) {
                    PromotionViewModel promotionViewModel2 = PromotionViewModel.this;
                    AppViewPresenter.lambda$verifyNotEnoughSpaceError$44(promotionViewModel2, obj);
                    return promotionViewModel2;
                }
            });
        }
        return rx.e.S(promotionViewModel);
    }
}
