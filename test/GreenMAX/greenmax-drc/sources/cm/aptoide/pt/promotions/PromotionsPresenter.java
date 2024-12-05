package cm.aptoide.pt.promotions;

import cm.aptoide.pt.AptoideApplication;
import cm.aptoide.pt.actions.PermissionManager;
import cm.aptoide.pt.actions.PermissionService;
import cm.aptoide.pt.ads.MoPubAdsManager;
import cm.aptoide.pt.ads.WalletAdsOfferManager;
import cm.aptoide.pt.app.DownloadModel;
import cm.aptoide.pt.download.view.outofspace.OutOfSpaceNavigatorWrapper;
import cm.aptoide.pt.presenter.Presenter;
import cm.aptoide.pt.presenter.View;
import java.util.List;
import rx.Single;
import rx.exceptions.OnErrorNotImplementedException;
import rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class PromotionsPresenter implements Presenter {
    private final MoPubAdsManager moPubAdsManager;
    private final PermissionManager permissionManager;
    private final PermissionService permissionService;
    private String promotionId;
    private final String promotionType;
    private final PromotionsAnalytics promotionsAnalytics;
    private final PromotionsManager promotionsManager;
    private final PromotionsNavigator promotionsNavigator;
    private final PromotionsView view;
    private final rx.h viewScheduler;

    public PromotionsPresenter(PromotionsView promotionsView, PromotionsManager promotionsManager, PermissionManager permissionManager, PermissionService permissionService, rx.h hVar, PromotionsAnalytics promotionsAnalytics, PromotionsNavigator promotionsNavigator, String str, MoPubAdsManager moPubAdsManager) {
        this.view = promotionsView;
        this.promotionsManager = promotionsManager;
        this.permissionManager = permissionManager;
        this.permissionService = permissionService;
        this.viewScheduler = hVar;
        this.promotionsAnalytics = promotionsAnalytics;
        this.promotionsNavigator = promotionsNavigator;
        this.promotionType = str;
        this.moPubAdsManager = moPubAdsManager;
    }

    private void cancelDownload() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.promotions.p4
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.promotions.k3
            @Override // rx.m.e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.c((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.promotions.e6
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$cancelDownload$26((PromotionViewApp) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.promotions.l4
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$cancelDownload$27((Throwable) obj);
            }
        });
    }

    private void claimApp() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.promotions.h3
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.promotions.d5
            @Override // rx.m.e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.e((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.promotions.c6
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$claimApp$12((String) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.promotions.y3
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$claimApp$13((Throwable) obj);
            }
        });
    }

    /* renamed from: downloadApp, reason: merged with bridge method [inline-methods] */
    public rx.b O(final PromotionViewApp promotionViewApp) {
        return rx.e.p(new rx.m.d() { // from class: cm.aptoide.pt.promotions.p5
            @Override // rx.m.d, java.util.concurrent.Callable
            public final Object call() {
                return PromotionsPresenter.this.g();
            }
        }).j0(this.viewScheduler).G(new rx.m.e() { // from class: cm.aptoide.pt.promotions.w4
            @Override // rx.m.e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.h((Boolean) obj);
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.promotions.n4
            @Override // rx.m.e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.i((Void) obj);
            }
        }).j0(Schedulers.io()).H(new rx.m.e() { // from class: cm.aptoide.pt.promotions.h6
            @Override // rx.m.e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.j(promotionViewApp, (Void) obj);
            }
        }).X0();
    }

    private void getPromotionApps() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.promotions.b3
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.promotions.m6
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.this.l((View.LifecycleEvent) obj);
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.promotions.q5
            @Override // rx.m.e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.m((View.LifecycleEvent) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.promotions.p6
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.this.n((PromotionsModel) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.promotions.m3
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.this.o((PromotionsModel) obj);
            }
        }).j0(this.viewScheduler).G(new i5(this)).w(new rx.m.b() { // from class: cm.aptoide.pt.promotions.x2
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.this.p((Throwable) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.promotions.g4
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$getPromotionApps$63((PromotionsModel) obj);
            }
        }, v6.f6600f);
    }

    private void handleClickOnAppCard() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.promotions.g5
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.promotions.a4
            @Override // rx.m.e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.q((View.LifecycleEvent) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.promotions.b4
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.this.r((PromotionAppClick) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.promotions.n6
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$handleClickOnAppCard$45((PromotionAppClick) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.promotions.t4
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$handleClickOnAppCard$46((Throwable) obj);
                throw null;
            }
        });
    }

    private rx.e<PromotionsModel> handleDownloadErrors(final PromotionsModel promotionsModel) {
        return rx.e.a0(this.view.installButtonClick(), this.view.resumeDownload()).G(new rx.m.e() { // from class: cm.aptoide.pt.promotions.k4
            @Override // rx.m.e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.u(promotionsModel, (PromotionViewApp) obj);
            }
        }).X(new rx.m.e() { // from class: cm.aptoide.pt.promotions.z2
            @Override // rx.m.e
            public final Object call(Object obj) {
                PromotionsModel promotionsModel2 = PromotionsModel.this;
                PromotionsPresenter.lambda$handleDownloadErrors$93(promotionsModel2, (PromotionViewApp) obj);
                return promotionsModel2;
            }
        });
    }

    private void handleOutOfSpaceDialog() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.promotions.v3
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.promotions.s5
            @Override // rx.m.e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.v((View.LifecycleEvent) obj);
            }
        }).D(new rx.m.e() { // from class: cm.aptoide.pt.promotions.v5
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((OutOfSpaceNavigatorWrapper) obj).getClearedSuccessfully());
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.promotions.u4
            @Override // rx.m.e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.x((OutOfSpaceNavigatorWrapper) obj);
            }
        }).s0().f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.promotions.l5
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$handleOutOfSpaceDialog$7((PromotionApp) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.promotions.q4
            @Override // rx.m.b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        });
    }

    private rx.e<PromotionsModel> handlePromotionApps(final PromotionsModel promotionsModel) {
        return rx.e.S(promotionsModel).J(new rx.m.e() { // from class: cm.aptoide.pt.promotions.n5
            @Override // rx.m.e
            public final Object call(Object obj) {
                Iterable appsList;
                appsList = PromotionsModel.this.getAppsList();
                return appsList;
            }
        }).D(new rx.m.e() { // from class: cm.aptoide.pt.promotions.f6
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((PromotionApp) obj).getPackageName().equals(AptoideApplication.APPCOINS_WALLET_PACKAGE_NAME));
                return valueOf;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.promotions.d4
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.this.y(promotionsModel, (PromotionApp) obj);
            }
        }).X(new rx.m.e() { // from class: cm.aptoide.pt.promotions.j5
            @Override // rx.m.e
            public final Object call(Object obj) {
                PromotionsModel promotionsModel2 = PromotionsModel.this;
                PromotionsPresenter.lambda$handlePromotionApps$79(promotionsModel2, (PromotionApp) obj);
                return promotionsModel2;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.promotions.m4
            @Override // rx.m.e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.D(promotionsModel, (PromotionsModel) obj);
            }
        });
    }

    private void handlePromotionClaimResult() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.promotions.l3
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.promotions.s4
            @Override // rx.m.e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.E((View.LifecycleEvent) obj);
            }
        }).D(new rx.m.e() { // from class: cm.aptoide.pt.promotions.z0
            @Override // rx.m.e
            public final Object call(Object obj) {
                return Boolean.valueOf(((ClaimDialogResultWrapper) obj).isOk());
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.promotions.v2
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.this.F((ClaimDialogResultWrapper) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.promotions.e5
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$handlePromotionClaimResult$67((ClaimDialogResultWrapper) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.promotions.y4
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$handlePromotionClaimResult$68((Throwable) obj);
                throw null;
            }
        });
    }

    private void handlePromotionOverDialogClick() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.promotions.q3
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.promotions.t5
            @Override // rx.m.e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.G((View.LifecycleEvent) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.promotions.g3
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.this.H((Void) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.promotions.m5
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$handlePromotionOverDialogClick$50((Void) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.promotions.r4
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$handlePromotionOverDialogClick$51((Throwable) obj);
            }
        });
    }

    private void handleRetryClick() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.promotions.o3
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.promotions.w5
            @Override // rx.m.e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.M((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.promotions.p3
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$handleRetryClick$75((PromotionsModel) obj);
            }
        }, v6.f6600f);
    }

    private void installButtonClick() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.promotions.i6
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.promotions.w2
            @Override // rx.m.e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.P((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.promotions.n3
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$installButtonClick$40((PromotionViewApp) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.promotions.j4
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$installButtonClick$41((Throwable) obj);
                throw null;
            }
        });
    }

    /* renamed from: lambda$cancelDownload$24 */
    public /* synthetic */ rx.b b(PromotionViewApp promotionViewApp) {
        return this.promotionsManager.cancelDownload(promotionViewApp.getMd5(), promotionViewApp.getPackageName(), promotionViewApp.getVersionCode());
    }

    /* renamed from: lambda$cancelDownload$25 */
    public /* synthetic */ rx.e c(View.LifecycleEvent lifecycleEvent) {
        return this.view.cancelDownload().H(new rx.m.e() { // from class: cm.aptoide.pt.promotions.u5
            @Override // rx.m.e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.b((PromotionViewApp) obj);
            }
        }).s0();
    }

    public static /* synthetic */ void lambda$cancelDownload$26(PromotionViewApp promotionViewApp) {
    }

    public static /* synthetic */ void lambda$cancelDownload$27(Throwable th) {
    }

    /* renamed from: lambda$claimApp$10 */
    public /* synthetic */ void d(PromotionViewApp promotionViewApp) {
        this.promotionsAnalytics.sendPromotionsAppInteractClaimEvent(promotionViewApp.getPackageName(), promotionViewApp.getAppcValue());
    }

    /* renamed from: lambda$claimApp$11 */
    public /* synthetic */ rx.e e(View.LifecycleEvent lifecycleEvent) {
        return this.view.claimAppClick().x(new rx.m.b() { // from class: cm.aptoide.pt.promotions.r3
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.this.d((PromotionViewApp) obj);
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.promotions.y5
            @Override // rx.m.e
            public final Object call(Object obj) {
                Single showClaimView;
                showClaimView = PromotionsPresenter.this.showClaimView((PromotionViewApp) obj);
                return showClaimView;
            }
        }).s0();
    }

    public static /* synthetic */ void lambda$claimApp$12(String str) {
    }

    public static /* synthetic */ void lambda$claimApp$13(Throwable th) {
    }

    /* renamed from: lambda$downloadApp$52 */
    public /* synthetic */ void f(Boolean bool) {
        this.promotionsManager.allowRootInstall(bool);
    }

    /* renamed from: lambda$downloadApp$53 */
    public /* synthetic */ rx.e g() {
        if (this.promotionsManager.shouldShowRootInstallWarningPopup()) {
            return this.view.showRootInstallWarningPopup().x(new rx.m.b() { // from class: cm.aptoide.pt.promotions.f5
                @Override // rx.m.b
                public final void call(Object obj) {
                    PromotionsPresenter.this.f((Boolean) obj);
                }
            });
        }
        return rx.e.S(null);
    }

    /* renamed from: lambda$downloadApp$54 */
    public /* synthetic */ rx.e h(Boolean bool) {
        return this.permissionManager.requestDownloadAccess(this.permissionService);
    }

    /* renamed from: lambda$downloadApp$55 */
    public /* synthetic */ rx.e i(Void r2) {
        return this.permissionManager.requestExternalStoragePermission(this.permissionService);
    }

    /* renamed from: lambda$downloadApp$56 */
    public /* synthetic */ rx.b j(PromotionViewApp promotionViewApp, Void r2) {
        return this.promotionsManager.downloadApp(promotionViewApp);
    }

    /* renamed from: lambda$getPromotionApps$58 */
    public /* synthetic */ void l(View.LifecycleEvent lifecycleEvent) {
        this.view.showLoading();
    }

    /* renamed from: lambda$getPromotionApps$59 */
    public /* synthetic */ Single m(View.LifecycleEvent lifecycleEvent) {
        return this.promotionsManager.getPromotionsModel(this.promotionType);
    }

    /* renamed from: lambda$getPromotionApps$60 */
    public /* synthetic */ void n(PromotionsModel promotionsModel) {
        this.promotionId = promotionsModel.getPromotionId();
    }

    /* renamed from: lambda$getPromotionApps$61 */
    public /* synthetic */ void o(PromotionsModel promotionsModel) {
        this.promotionsAnalytics.sendOpenPromotionsFragmentEvent();
    }

    /* renamed from: lambda$getPromotionApps$62 */
    public /* synthetic */ void p(Throwable th) {
        this.view.showErrorView();
    }

    public static /* synthetic */ void lambda$getPromotionApps$63(PromotionsModel promotionsModel) {
    }

    /* renamed from: lambda$handleClickOnAppCard$43 */
    public /* synthetic */ rx.e q(View.LifecycleEvent lifecycleEvent) {
        return this.view.appCardClick();
    }

    /* renamed from: lambda$handleClickOnAppCard$44 */
    public /* synthetic */ void r(PromotionAppClick promotionAppClick) {
        this.promotionsNavigator.navigateToAppView(promotionAppClick.getApp().getAppId(), promotionAppClick.getApp().getPackageName());
    }

    public static /* synthetic */ void lambda$handleClickOnAppCard$45(PromotionAppClick promotionAppClick) {
    }

    public static /* synthetic */ void lambda$handleClickOnAppCard$46(Throwable th) {
        throw new IllegalStateException(th);
    }

    /* renamed from: lambda$handleDownloadErrors$90 */
    public /* synthetic */ void s(PromotionViewApp promotionViewApp) {
        if (promotionViewApp.getDownloadModel().getDownloadState().equals(DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR)) {
            this.promotionsNavigator.navigateToOutOfSpaceDialog(promotionViewApp.getSize(), promotionViewApp.getPackageName());
        } else {
            this.view.showDownloadError(promotionViewApp);
        }
    }

    /* renamed from: lambda$handleDownloadErrors$91 */
    public /* synthetic */ rx.e t(PromotionApp promotionApp) {
        return this.promotionsManager.getDownload(promotionApp).D(new rx.m.e() { // from class: cm.aptoide.pt.promotions.o6
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((PromotionViewApp) obj).getDownloadModel().hasError());
                return valueOf;
            }
        }).E().j0(this.viewScheduler).x(new rx.m.b() { // from class: cm.aptoide.pt.promotions.x4
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.this.s((PromotionViewApp) obj);
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.promotions.u3
            @Override // rx.m.e
            public final Object call(Object obj) {
                rx.e verifyNotEnoughSpaceError;
                verifyNotEnoughSpaceError = PromotionsPresenter.this.verifyNotEnoughSpaceError((PromotionViewApp) obj);
                return verifyNotEnoughSpaceError;
            }
        });
    }

    /* renamed from: lambda$handleDownloadErrors$92 */
    public /* synthetic */ rx.e u(PromotionsModel promotionsModel, PromotionViewApp promotionViewApp) {
        return rx.e.N(promotionsModel.getAppsList()).G(new rx.m.e() { // from class: cm.aptoide.pt.promotions.o5
            @Override // rx.m.e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.t((PromotionApp) obj);
            }
        });
    }

    public static /* synthetic */ PromotionsModel lambda$handleDownloadErrors$93(PromotionsModel promotionsModel, PromotionViewApp promotionViewApp) {
        return promotionsModel;
    }

    /* renamed from: lambda$handleOutOfSpaceDialog$1 */
    public /* synthetic */ rx.e v(View.LifecycleEvent lifecycleEvent) {
        return this.promotionsNavigator.outOfSpaceDialogResult();
    }

    public static /* synthetic */ Iterable lambda$handleOutOfSpaceDialog$3(List list) {
        return list;
    }

    /* renamed from: lambda$handleOutOfSpaceDialog$5 */
    public /* synthetic */ rx.b w(PromotionApp promotionApp) {
        return this.promotionsManager.resumeDownload(promotionApp.getMd5(), promotionApp.getPackageName(), promotionApp.getAppId());
    }

    /* renamed from: lambda$handleOutOfSpaceDialog$6 */
    public /* synthetic */ rx.e x(final OutOfSpaceNavigatorWrapper outOfSpaceNavigatorWrapper) {
        return this.promotionsManager.getPromotionApps(this.promotionId).A().J(new rx.m.e() { // from class: cm.aptoide.pt.promotions.c3
            @Override // rx.m.e
            public final Object call(Object obj) {
                List list = (List) obj;
                PromotionsPresenter.lambda$handleOutOfSpaceDialog$3(list);
                return list;
            }
        }).D(new rx.m.e() { // from class: cm.aptoide.pt.promotions.h5
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((PromotionApp) obj).getPackageName().equals(OutOfSpaceNavigatorWrapper.this.getPackageName()));
                return valueOf;
            }
        }).H(new rx.m.e() { // from class: cm.aptoide.pt.promotions.f3
            @Override // rx.m.e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.w((PromotionApp) obj);
            }
        });
    }

    public static /* synthetic */ void lambda$handleOutOfSpaceDialog$7(PromotionApp promotionApp) {
    }

    /* renamed from: lambda$handlePromotionApps$78 */
    public /* synthetic */ void y(PromotionsModel promotionsModel, PromotionApp promotionApp) {
        this.view.lockPromotionApps(promotionsModel.isWalletInstalled() && promotionApp.isClaimed());
    }

    public static /* synthetic */ PromotionsModel lambda$handlePromotionApps$79(PromotionsModel promotionsModel, PromotionApp promotionApp) {
        return promotionsModel;
    }

    /* renamed from: lambda$handlePromotionApps$81 */
    public /* synthetic */ rx.e z(PromotionApp promotionApp) {
        return this.promotionsManager.getDownload(promotionApp);
    }

    /* renamed from: lambda$handlePromotionApps$82 */
    public /* synthetic */ void A(PromotionViewApp promotionViewApp) {
        this.view.showPromotionApp(promotionViewApp, true);
    }

    /* renamed from: lambda$handlePromotionApps$85 */
    public /* synthetic */ void B(PromotionViewApp promotionViewApp, Boolean bool) {
        this.promotionsAnalytics.sendValentineMigratorEvent(promotionViewApp.getPackageName(), bool);
    }

    public static /* synthetic */ PromotionsModel lambda$handlePromotionApps$86(PromotionsModel promotionsModel, Boolean bool) {
        return promotionsModel;
    }

    /* renamed from: lambda$handlePromotionApps$87 */
    public /* synthetic */ rx.e C(final PromotionsModel promotionsModel, final PromotionViewApp promotionViewApp) {
        return this.promotionsManager.getPackageSignature(promotionViewApp.getPackageName()).j0(this.viewScheduler).X(new rx.m.e() { // from class: cm.aptoide.pt.promotions.a5
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(PromotionViewApp.this.getSignature().equals((String) obj));
                return valueOf;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.promotions.z5
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.this.B(promotionViewApp, (Boolean) obj);
            }
        }).X(new rx.m.e() { // from class: cm.aptoide.pt.promotions.e3
            @Override // rx.m.e
            public final Object call(Object obj) {
                PromotionsModel promotionsModel2 = PromotionsModel.this;
                PromotionsPresenter.lambda$handlePromotionApps$86(promotionsModel2, (Boolean) obj);
                return promotionsModel2;
            }
        });
    }

    /* renamed from: lambda$handlePromotionApps$88 */
    public /* synthetic */ rx.e D(final PromotionsModel promotionsModel, PromotionsModel promotionsModel2) {
        return rx.e.S(promotionsModel).J(new rx.m.e() { // from class: cm.aptoide.pt.promotions.i3
            @Override // rx.m.e
            public final Object call(Object obj) {
                Iterable appsList;
                appsList = PromotionsModel.this.getAppsList();
                return appsList;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.promotions.r5
            @Override // rx.m.e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.z((PromotionApp) obj);
            }
        }).j0(this.viewScheduler).x(new rx.m.b() { // from class: cm.aptoide.pt.promotions.z4
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.this.A((PromotionViewApp) obj);
            }
        }).D(new rx.m.e() { // from class: cm.aptoide.pt.promotions.g6
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((PromotionViewApp) obj).getDownloadModel().getAction().equals(DownloadModel.Action.UPDATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.promotions.k6
            @Override // rx.m.e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.C(promotionsModel, (PromotionViewApp) obj);
            }
        });
    }

    /* renamed from: lambda$handlePromotionClaimResult$65 */
    public /* synthetic */ rx.e E(View.LifecycleEvent lifecycleEvent) {
        return this.promotionsNavigator.claimDialogResults();
    }

    /* renamed from: lambda$handlePromotionClaimResult$66 */
    public /* synthetic */ void F(ClaimDialogResultWrapper claimDialogResultWrapper) {
        this.view.updateClaimStatus(claimDialogResultWrapper.getPackageName());
    }

    public static /* synthetic */ void lambda$handlePromotionClaimResult$67(ClaimDialogResultWrapper claimDialogResultWrapper) {
    }

    public static /* synthetic */ void lambda$handlePromotionClaimResult$68(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: lambda$handlePromotionOverDialogClick$48 */
    public /* synthetic */ rx.e G(View.LifecycleEvent lifecycleEvent) {
        return this.view.promotionOverDialogClick();
    }

    /* renamed from: lambda$handlePromotionOverDialogClick$49 */
    public /* synthetic */ void H(Void r1) {
        this.promotionsNavigator.navigateToHome();
    }

    public static /* synthetic */ void lambda$handlePromotionOverDialogClick$50(Void r0) {
    }

    public static /* synthetic */ void lambda$handlePromotionOverDialogClick$51(Throwable th) {
    }

    /* renamed from: lambda$handleRetryClick$70 */
    public /* synthetic */ void I(Void r1) {
        this.view.showLoading();
    }

    /* renamed from: lambda$handleRetryClick$71 */
    public /* synthetic */ Single J(Void r2) {
        return this.promotionsManager.getPromotionsModel(this.promotionType);
    }

    /* renamed from: lambda$handleRetryClick$72 */
    public /* synthetic */ void K(PromotionsModel promotionsModel) {
        this.promotionId = promotionsModel.getPromotionId();
    }

    /* renamed from: lambda$handleRetryClick$73 */
    public /* synthetic */ void L(Throwable th) {
        this.view.showErrorView();
    }

    /* renamed from: lambda$handleRetryClick$74 */
    public /* synthetic */ rx.e M(View.LifecycleEvent lifecycleEvent) {
        return this.view.retryClicked().x(new rx.m.b() { // from class: cm.aptoide.pt.promotions.d3
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.this.I((Void) obj);
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.promotions.c4
            @Override // rx.m.e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.J((Void) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.promotions.h4
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.this.K((PromotionsModel) obj);
            }
        }).j0(this.viewScheduler).G(new i5(this)).w(new rx.m.b() { // from class: cm.aptoide.pt.promotions.x3
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.this.L((Throwable) obj);
            }
        }).s0();
    }

    public static /* synthetic */ void lambda$handleRetryClick$75(PromotionsModel promotionsModel) {
    }

    /* renamed from: lambda$installButtonClick$36 */
    public /* synthetic */ void N(PromotionViewApp promotionViewApp) {
        this.promotionsAnalytics.sendPromotionsAppInteractInstallEvent(promotionViewApp.getPackageName(), promotionViewApp.getAppcValue(), promotionViewApp.getDownloadModel().getAction(), promotionViewApp.hasSplits(), promotionViewApp.hasAppc(), promotionViewApp.getRank(), null, promotionViewApp.getStoreName(), promotionViewApp.getObb() != null, promotionViewApp.getBdsFlags());
    }

    /* renamed from: lambda$installButtonClick$39 */
    public /* synthetic */ rx.e P(View.LifecycleEvent lifecycleEvent) {
        return this.view.installButtonClick().D(new rx.m.e() { // from class: cm.aptoide.pt.promotions.e4
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((PromotionViewApp) obj).getDownloadModel().isDownloadable());
                return valueOf;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.promotions.c5
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.this.N((PromotionViewApp) obj);
            }
        }).H(new rx.m.e() { // from class: cm.aptoide.pt.promotions.b6
            @Override // rx.m.e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.O((PromotionViewApp) obj);
            }
        }).j0(this.viewScheduler).w(new rx.m.b() { // from class: cm.aptoide.pt.promotions.f4
            @Override // rx.m.b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }).s0();
    }

    public static /* synthetic */ void lambda$installButtonClick$40(PromotionViewApp promotionViewApp) {
    }

    public static /* synthetic */ void lambda$installButtonClick$41(Throwable th) {
        throw new IllegalStateException(th);
    }

    /* renamed from: lambda$pauseDownload$29 */
    public /* synthetic */ rx.b R(PromotionViewApp promotionViewApp) {
        return this.promotionsManager.pauseDownload(promotionViewApp.getMd5());
    }

    /* renamed from: lambda$pauseDownload$30 */
    public /* synthetic */ rx.e S(View.LifecycleEvent lifecycleEvent) {
        return this.view.pauseDownload().H(new rx.m.e() { // from class: cm.aptoide.pt.promotions.l6
            @Override // rx.m.e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.R((PromotionViewApp) obj);
            }
        }).s0();
    }

    public static /* synthetic */ void lambda$pauseDownload$32(PromotionViewApp promotionViewApp) {
    }

    public static /* synthetic */ void lambda$pauseDownload$33(Throwable th) {
        throw new IllegalStateException(th);
    }

    /* renamed from: lambda$resumeDownload$17 */
    public /* synthetic */ rx.e T(Void r2) {
        return this.permissionManager.requestExternalStoragePermission(this.permissionService);
    }

    /* renamed from: lambda$resumeDownload$18 */
    public /* synthetic */ rx.b U(PromotionViewApp promotionViewApp, Void r6) {
        return this.promotionsManager.resumeDownload(promotionViewApp.getMd5(), promotionViewApp.getPackageName(), promotionViewApp.getAppId());
    }

    /* renamed from: lambda$resumeDownload$19 */
    public /* synthetic */ rx.e V(final PromotionViewApp promotionViewApp) {
        return this.permissionManager.requestDownloadAccess(this.permissionService).G(new rx.m.e() { // from class: cm.aptoide.pt.promotions.i4
            @Override // rx.m.e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.T((Void) obj);
            }
        }).H(new rx.m.e() { // from class: cm.aptoide.pt.promotions.o4
            @Override // rx.m.e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.U(promotionViewApp, (Void) obj);
            }
        }).s0();
    }

    /* renamed from: lambda$resumeDownload$20 */
    public /* synthetic */ rx.e W(View.LifecycleEvent lifecycleEvent) {
        return this.view.resumeDownload().G(new rx.m.e() { // from class: cm.aptoide.pt.promotions.k5
            @Override // rx.m.e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.V((PromotionViewApp) obj);
            }
        });
    }

    public static /* synthetic */ void lambda$resumeDownload$21(Void r0) {
    }

    public static /* synthetic */ void lambda$resumeDownload$22(Throwable th) {
    }

    /* renamed from: lambda$showClaimView$14 */
    public /* synthetic */ void X(PromotionViewApp promotionViewApp, String str) {
        this.promotionsNavigator.navigateToClaimDialog(promotionViewApp.getPackageName(), this.promotionId);
    }

    /* renamed from: lambda$showClaimView$15 */
    public /* synthetic */ void Y(PromotionViewApp promotionViewApp, String str) {
        this.promotionsNavigator.navigateToClaimDialog(promotionViewApp.getPackageName(), this.promotionId);
    }

    /* renamed from: lambda$verifyNotEnoughSpaceError$94 */
    public /* synthetic */ void Z(PromotionViewApp promotionViewApp, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        this.promotionsAnalytics.sendNotEnoughSpaceErrorEvent(promotionViewApp.getMd5());
    }

    public static /* synthetic */ PromotionViewApp lambda$verifyNotEnoughSpaceError$95(PromotionViewApp promotionViewApp, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        return promotionViewApp;
    }

    private void pauseDownload() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.promotions.j6
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.promotions.j3
            @Override // rx.m.e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.S((View.LifecycleEvent) obj);
            }
        }).j0(this.viewScheduler).w(new rx.m.b() { // from class: cm.aptoide.pt.promotions.d6
            @Override // rx.m.b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }).s0().f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.promotions.a6
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$pauseDownload$32((PromotionViewApp) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.promotions.w3
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$pauseDownload$33((Throwable) obj);
                throw null;
            }
        });
    }

    private void resumeDownload() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.promotions.a3
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.promotions.z3
            @Override // rx.m.e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.W((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.promotions.s3
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$resumeDownload$21((Void) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.promotions.y2
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$resumeDownload$22((Throwable) obj);
            }
        });
    }

    public Single<? extends String> showClaimView(final PromotionViewApp promotionViewApp) {
        String str = this.promotionId;
        if (str != null) {
            return Single.m(str).g(new rx.m.b() { // from class: cm.aptoide.pt.promotions.t3
                @Override // rx.m.b
                public final void call(Object obj) {
                    PromotionsPresenter.this.X(promotionViewApp, (String) obj);
                }
            });
        }
        return this.promotionsManager.getPromotionsModel(this.promotionType).n(new rx.m.e() { // from class: cm.aptoide.pt.promotions.x6
            @Override // rx.m.e
            public final Object call(Object obj) {
                return ((PromotionsModel) obj).getPromotionId();
            }
        }).g(new rx.m.b() { // from class: cm.aptoide.pt.promotions.b5
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsPresenter.this.Y(promotionViewApp, (String) obj);
            }
        });
    }

    public rx.e<? extends PromotionsModel> showPromotions(PromotionsModel promotionsModel) {
        if (promotionsModel.getAppsList().isEmpty()) {
            this.view.showPromotionOverDialog();
            return rx.e.B();
        }
        this.view.setPromotionMessage(promotionsModel.getDescription());
        this.view.showPromotionTitle(promotionsModel.getTitle());
        this.view.showPromotionFeatureGraphic(promotionsModel.getFeatureGraphic());
        return rx.e.f0(handlePromotionApps(promotionsModel), handleDownloadErrors(promotionsModel));
    }

    public rx.e<PromotionViewApp> verifyNotEnoughSpaceError(final PromotionViewApp promotionViewApp) {
        if (promotionViewApp.getDownloadModel().getDownloadState() == DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR) {
            return this.moPubAdsManager.getAdsVisibilityStatus().g(new rx.m.b() { // from class: cm.aptoide.pt.promotions.x5
                @Override // rx.m.b
                public final void call(Object obj) {
                    PromotionsPresenter.this.Z(promotionViewApp, (WalletAdsOfferManager.OfferResponseStatus) obj);
                }
            }).A().X(new rx.m.e() { // from class: cm.aptoide.pt.promotions.v4
                @Override // rx.m.e
                public final Object call(Object obj) {
                    PromotionViewApp promotionViewApp2 = PromotionViewApp.this;
                    PromotionsPresenter.lambda$verifyNotEnoughSpaceError$95(promotionViewApp2, (WalletAdsOfferManager.OfferResponseStatus) obj);
                    return promotionViewApp2;
                }
            });
        }
        return rx.e.S(promotionViewApp);
    }

    @Override // cm.aptoide.pt.presenter.Presenter
    public void present() {
        getPromotionApps();
        installButtonClick();
        handleClickOnAppCard();
        pauseDownload();
        cancelDownload();
        resumeDownload();
        claimApp();
        handlePromotionClaimResult();
        handleRetryClick();
        handlePromotionOverDialogClick();
        handleOutOfSpaceDialog();
    }
}
