package cm.aptoide.pt.app.view;

import cm.aptoide.pt.crashreports.CrashReport;
import cm.aptoide.pt.home.ChipManager;
import cm.aptoide.pt.home.HomeAnalytics;
import cm.aptoide.pt.home.HomeNavigator;
import cm.aptoide.pt.home.bundles.HomeBundlesModel;
import cm.aptoide.pt.home.bundles.ads.AdClick;
import cm.aptoide.pt.home.bundles.ads.AdHomeEvent;
import cm.aptoide.pt.home.bundles.ads.AdMapper;
import cm.aptoide.pt.home.bundles.ads.SearchAdNavigationResult;
import cm.aptoide.pt.home.bundles.base.AppHomeEvent;
import cm.aptoide.pt.home.bundles.base.HomeEvent;
import cm.aptoide.pt.presenter.Presenter;
import cm.aptoide.pt.presenter.View;
import cm.aptoide.pt.view.BundleEvent;
import cm.aptoide.pt.view.app.Application;
import rx.Single;
import rx.exceptions.OnErrorNotImplementedException;

/* loaded from: classes.dex */
public class MoreBundlePresenter implements Presenter {
    private final AdMapper adMapper;
    private final BundleEvent bundleEvent;
    private final ChipManager chipManager;
    private final CrashReport crashReporter;
    private final HomeAnalytics homeAnalytics;
    private final HomeNavigator homeNavigator;
    private final MoreBundleManager moreBundleManager;
    private final MoreBundleView view;
    private final rx.h viewScheduler;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cm.aptoide.pt.app.view.MoreBundlePresenter$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$home$bundles$HomeBundlesModel$Error;

        static {
            int[] iArr = new int[HomeBundlesModel.Error.values().length];
            $SwitchMap$cm$aptoide$pt$home$bundles$HomeBundlesModel$Error = iArr;
            try {
                iArr[HomeBundlesModel.Error.NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$home$bundles$HomeBundlesModel$Error[HomeBundlesModel.Error.GENERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MoreBundlePresenter(MoreBundleView moreBundleView, MoreBundleManager moreBundleManager, rx.h hVar, CrashReport crashReport, HomeNavigator homeNavigator, AdMapper adMapper, BundleEvent bundleEvent, HomeAnalytics homeAnalytics, ChipManager chipManager) {
        this.view = moreBundleView;
        this.moreBundleManager = moreBundleManager;
        this.viewScheduler = hVar;
        this.crashReporter = crashReport;
        this.homeNavigator = homeNavigator;
        this.adMapper = adMapper;
        this.bundleEvent = bundleEvent;
        this.homeAnalytics = homeAnalytics;
        this.chipManager = chipManager;
    }

    private void handleError(HomeBundlesModel.Error error) {
        int i2 = AnonymousClass1.$SwitchMap$cm$aptoide$pt$home$bundles$HomeBundlesModel$Error[error.ordinal()];
        if (i2 == 1) {
            this.view.showNetworkError();
        } else {
            if (i2 != 2) {
                return;
            }
            this.view.showGenericError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAdClick$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void a(SearchAdNavigationResult searchAdNavigationResult) {
        this.homeNavigator.navigateToAppView(searchAdNavigationResult.getTag(), searchAdNavigationResult.getSearchAdResult());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAdClick$16, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e b(View.LifecycleEvent lifecycleEvent) {
        rx.e<R> X = this.view.adClicked().X(new rx.m.e() { // from class: cm.aptoide.pt.app.view.bg
            @Override // rx.m.e
            public final Object call(Object obj) {
                return ((AdHomeEvent) obj).getAdClick();
            }
        });
        final AdMapper adMapper = this.adMapper;
        adMapper.getClass();
        return X.X(new rx.m.e() { // from class: cm.aptoide.pt.app.view.c
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AdMapper.this.mapAdToSearchAd((AdClick) obj);
            }
        }).j0(this.viewScheduler).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.df
            @Override // rx.m.b
            public final void call(Object obj) {
                MoreBundlePresenter.this.a((SearchAdNavigationResult) obj);
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleAdClick$17(SearchAdNavigationResult searchAdNavigationResult) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleAdClick$18(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAppClick$10, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void c(AppHomeEvent appHomeEvent) {
        Application app = appHomeEvent.getApp();
        this.homeNavigator.navigateToAppView(app.getAppId(), app.getPackageName(), app.getTag());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAppClick$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e d(View.LifecycleEvent lifecycleEvent) {
        return this.view.appClicked().x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.jf
            @Override // rx.m.b
            public final void call(Object obj) {
                MoreBundlePresenter.this.e((AppHomeEvent) obj);
            }
        }).j0(this.viewScheduler).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.be
            @Override // rx.m.b
            public final void call(Object obj) {
                MoreBundlePresenter.this.c((AppHomeEvent) obj);
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleAppClick$12(AppHomeEvent appHomeEvent) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleAppClick$13(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAppClick$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void e(AppHomeEvent appHomeEvent) {
        ChipManager.Chip currentChip = this.chipManager.getCurrentChip();
        this.homeAnalytics.sendTapOnAppInteractEvent(appHomeEvent.getApp().getRating(), appHomeEvent.getApp().getPackageName(), appHomeEvent.getAppPosition(), appHomeEvent.getBundlePosition(), appHomeEvent.getBundle().getTag(), appHomeEvent.getBundle().getContent().size(), currentChip != null ? currentChip.getName() : null);
        if (currentChip != null) {
            this.homeAnalytics.sendChipTapOnApp(appHomeEvent.getBundle().getTag(), appHomeEvent.getApp().getPackageName(), currentChip.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBottomReached$30, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean f(Object obj) {
        return Boolean.valueOf(this.moreBundleManager.hasMore(this.bundleEvent.getTitle()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBottomReached$31, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void g(Object obj) {
        this.view.showLoadMore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBottomReached$32, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single h(Object obj) {
        return loadNextBundles();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBottomReached$33, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void i(HomeBundlesModel homeBundlesModel) {
        this.homeAnalytics.sendLoadMoreInteractEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBottomReached$34, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e j(View.LifecycleEvent lifecycleEvent) {
        return this.view.reachesBottom().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.oe
            @Override // rx.m.e
            public final Object call(Object obj) {
                return MoreBundlePresenter.this.f(obj);
            }
        }).j0(this.viewScheduler).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.ke
            @Override // rx.m.b
            public final void call(Object obj) {
                MoreBundlePresenter.this.g(obj);
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.app.view.ce
            @Override // rx.m.e
            public final Object call(Object obj) {
                return MoreBundlePresenter.this.h(obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.pf
            @Override // rx.m.b
            public final void call(Object obj) {
                MoreBundlePresenter.this.i((HomeBundlesModel) obj);
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleBottomReached$35(HomeBundlesModel homeBundlesModel) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleBottomReached$36(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBundleScrolledRight$25, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void k(HomeEvent homeEvent) {
        this.homeAnalytics.sendScrollRightInteractEvent(homeEvent.getBundlePosition(), homeEvent.getBundle().getTag(), homeEvent.getBundle().getContent().size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBundleScrolledRight$26, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e l(View.LifecycleEvent lifecycleEvent) {
        rx.e<HomeEvent> x = this.view.bundleScrolled().x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.ef
            @Override // rx.m.b
            public final void call(Object obj) {
                MoreBundlePresenter.this.k((HomeEvent) obj);
            }
        });
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        return x.w(new d(crashReport)).s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleBundleScrolledRight$27(HomeEvent homeEvent) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleBundleScrolledRight$28(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleMoreClick$20, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m(HomeEvent homeEvent) {
        ChipManager.Chip currentChip = this.chipManager.getCurrentChip();
        this.homeAnalytics.sendTapOnMoreInteractEvent(homeEvent.getBundlePosition(), homeEvent.getBundle().getTag(), homeEvent.getBundle().getContent().size(), currentChip != null ? currentChip.getName() : null);
        if (currentChip != null) {
            this.homeAnalytics.sendChipTapOnMore(homeEvent.getBundle().getTag(), currentChip.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleMoreClick$21, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e n(View.LifecycleEvent lifecycleEvent) {
        rx.e<HomeEvent> j0 = this.view.moreClicked().x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.we
            @Override // rx.m.b
            public final void call(Object obj) {
                MoreBundlePresenter.this.m((HomeEvent) obj);
            }
        }).j0(this.viewScheduler);
        final HomeNavigator homeNavigator = this.homeNavigator;
        homeNavigator.getClass();
        return j0.x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.zf
            @Override // rx.m.b
            public final void call(Object obj) {
                HomeNavigator.this.navigateWithAction((HomeEvent) obj);
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleMoreClick$22(HomeEvent homeEvent) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleMoreClick$23(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePullToRefresh$39, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void o(Void r1) {
        this.homeAnalytics.sendPullRefreshInteractEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePullToRefresh$40, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single p(Void r1) {
        return loadFreshBundles();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePullToRefresh$41, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e q(View.LifecycleEvent lifecycleEvent) {
        return this.view.refreshes().x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.xd
            @Override // rx.m.b
            public final void call(Object obj) {
                MoreBundlePresenter.this.o((Void) obj);
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.app.view.pe
            @Override // rx.m.e
            public final Object call(Object obj) {
                return MoreBundlePresenter.this.p((Void) obj);
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handlePullToRefresh$42(HomeBundlesModel homeBundlesModel) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handlePullToRefresh$43(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRetryClick$46, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void r(Void r1) {
        this.view.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRetryClick$47, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single s(Void r1) {
        return loadNextBundles();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRetryClick$48, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e t(View.LifecycleEvent lifecycleEvent) {
        return this.view.retryClicked().j0(this.viewScheduler).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.de
            @Override // rx.m.b
            public final void call(Object obj) {
                MoreBundlePresenter.this.r((Void) obj);
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.app.view.je
            @Override // rx.m.e
            public final Object call(Object obj) {
                return MoreBundlePresenter.this.s((Void) obj);
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleRetryClick$49(HomeBundlesModel homeBundlesModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadBundles$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void u(HomeBundlesModel homeBundlesModel) {
        if (homeBundlesModel.hasErrors()) {
            handleError(homeBundlesModel.getError());
        } else {
            if (homeBundlesModel.isLoading()) {
                return;
            }
            this.view.showBundles(homeBundlesModel.getList());
            this.view.hideLoading();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadFreshBundles$44, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void v(HomeBundlesModel homeBundlesModel) {
        this.view.hideRefresh();
        if (homeBundlesModel.hasErrors()) {
            handleError(homeBundlesModel.getError());
        } else {
            if (homeBundlesModel.isLoading()) {
                return;
            }
            this.view.showBundles(homeBundlesModel.getList());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadNextBundles$37, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void w(HomeBundlesModel homeBundlesModel) {
        if (homeBundlesModel.hasErrors()) {
            handleError(homeBundlesModel.getError());
        } else if (!homeBundlesModel.isLoading()) {
            this.view.showMoreHomeBundles(homeBundlesModel.getList());
            this.view.hideLoading();
        }
        this.view.hideShowMore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateLoadBundles$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void x(View.LifecycleEvent lifecycleEvent) {
        this.view.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateLoadBundles$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single y(View.LifecycleEvent lifecycleEvent) {
        return loadBundles();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$onCreateLoadBundles$6(HomeBundlesModel homeBundlesModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateSetupToolbar$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void z(View.LifecycleEvent lifecycleEvent) {
        this.view.setToolbarInfo(this.bundleEvent.getTitle());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$onCreateSetupToolbar$2(View.LifecycleEvent lifecycleEvent) {
    }

    private Single<HomeBundlesModel> loadBundles() {
        return this.moreBundleManager.loadBundle(this.bundleEvent.getTitle(), this.bundleEvent.getAction()).p(this.viewScheduler).g(new rx.m.b() { // from class: cm.aptoide.pt.app.view.me
            @Override // rx.m.b
            public final void call(Object obj) {
                MoreBundlePresenter.this.u((HomeBundlesModel) obj);
            }
        });
    }

    private Single<HomeBundlesModel> loadFreshBundles() {
        return this.moreBundleManager.loadFreshBundles(this.bundleEvent.getTitle(), this.bundleEvent.getAction()).p(this.viewScheduler).g(new rx.m.b() { // from class: cm.aptoide.pt.app.view.ne
            @Override // rx.m.b
            public final void call(Object obj) {
                MoreBundlePresenter.this.v((HomeBundlesModel) obj);
            }
        });
    }

    private Single<HomeBundlesModel> loadNextBundles() {
        return this.moreBundleManager.loadNextBundles(this.bundleEvent.getTitle(), this.bundleEvent.getAction()).p(this.viewScheduler).g(new rx.m.b() { // from class: cm.aptoide.pt.app.view.sf
            @Override // rx.m.b
            public final void call(Object obj) {
                MoreBundlePresenter.this.w((HomeBundlesModel) obj);
            }
        });
    }

    public void handleAdClick() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.ue
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.ze
            @Override // rx.m.e
            public final Object call(Object obj) {
                return MoreBundlePresenter.this.b((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.ie
            @Override // rx.m.b
            public final void call(Object obj) {
                MoreBundlePresenter.lambda$handleAdClick$17((SearchAdNavigationResult) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.ae
            @Override // rx.m.b
            public final void call(Object obj) {
                MoreBundlePresenter.lambda$handleAdClick$18((Throwable) obj);
                throw null;
            }
        });
    }

    public void handleAppClick() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.af
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.ge
            @Override // rx.m.e
            public final Object call(Object obj) {
                return MoreBundlePresenter.this.d((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.se
            @Override // rx.m.b
            public final void call(Object obj) {
                MoreBundlePresenter.lambda$handleAppClick$12((AppHomeEvent) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.gf
            @Override // rx.m.b
            public final void call(Object obj) {
                MoreBundlePresenter.lambda$handleAppClick$13((Throwable) obj);
                throw null;
            }
        });
    }

    public void handleBottomReached() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.of
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.cf
            @Override // rx.m.e
            public final Object call(Object obj) {
                return MoreBundlePresenter.this.j((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.yd
            @Override // rx.m.b
            public final void call(Object obj) {
                MoreBundlePresenter.lambda$handleBottomReached$35((HomeBundlesModel) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.zd
            @Override // rx.m.b
            public final void call(Object obj) {
                MoreBundlePresenter.lambda$handleBottomReached$36((Throwable) obj);
                throw null;
            }
        });
    }

    public void handleBundleScrolledRight() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.rf
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.re
            @Override // rx.m.e
            public final Object call(Object obj) {
                return MoreBundlePresenter.this.l((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.ee
            @Override // rx.m.b
            public final void call(Object obj) {
                MoreBundlePresenter.lambda$handleBundleScrolledRight$27((HomeEvent) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.tf
            @Override // rx.m.b
            public final void call(Object obj) {
                MoreBundlePresenter.lambda$handleBundleScrolledRight$28((Throwable) obj);
                throw null;
            }
        });
    }

    public void handleMoreClick() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.bf
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.xe
            @Override // rx.m.e
            public final Object call(Object obj) {
                return MoreBundlePresenter.this.n((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.uf
            @Override // rx.m.b
            public final void call(Object obj) {
                MoreBundlePresenter.lambda$handleMoreClick$22((HomeEvent) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.if
            @Override // rx.m.b
            public final void call(Object obj) {
                MoreBundlePresenter.lambda$handleMoreClick$23((Throwable) obj);
                throw null;
            }
        });
    }

    public void handlePullToRefresh() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.ff
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.te
            @Override // rx.m.e
            public final Object call(Object obj) {
                return MoreBundlePresenter.this.q((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.app.view.nf
            @Override // rx.m.b
            public final void call(Object obj) {
                MoreBundlePresenter.lambda$handlePullToRefresh$42((HomeBundlesModel) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.app.view.he
            @Override // rx.m.b
            public final void call(Object obj) {
                MoreBundlePresenter.lambda$handlePullToRefresh$43((Throwable) obj);
                throw null;
            }
        });
    }

    public void handleRetryClick() {
        rx.e f2 = this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.ye
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.app.view.le
            @Override // rx.m.e
            public final Object call(Object obj) {
                return MoreBundlePresenter.this.t((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        fe feVar = new rx.m.b() { // from class: cm.aptoide.pt.app.view.fe
            @Override // rx.m.b
            public final void call(Object obj) {
                MoreBundlePresenter.lambda$handleRetryClick$49((HomeBundlesModel) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        f2.H0(feVar, new d(crashReport));
    }

    public void onCreateLoadBundles() {
        rx.e f2 = this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.kf
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).j0(this.viewScheduler).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.mf
            @Override // rx.m.b
            public final void call(Object obj) {
                MoreBundlePresenter.this.x((View.LifecycleEvent) obj);
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.app.view.ve
            @Override // rx.m.e
            public final Object call(Object obj) {
                return MoreBundlePresenter.this.y((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        qe qeVar = new rx.m.b() { // from class: cm.aptoide.pt.app.view.qe
            @Override // rx.m.b
            public final void call(Object obj) {
                MoreBundlePresenter.lambda$onCreateLoadBundles$6((HomeBundlesModel) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        f2.H0(qeVar, new d(crashReport));
    }

    public void onCreateSetupToolbar() {
        rx.e<View.LifecycleEvent> x = this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.app.view.lf
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).j0(this.viewScheduler).x(new rx.m.b() { // from class: cm.aptoide.pt.app.view.hf
            @Override // rx.m.b
            public final void call(Object obj) {
                MoreBundlePresenter.this.z((View.LifecycleEvent) obj);
            }
        });
        qf qfVar = new rx.m.b() { // from class: cm.aptoide.pt.app.view.qf
            @Override // rx.m.b
            public final void call(Object obj) {
                MoreBundlePresenter.lambda$onCreateSetupToolbar$2((View.LifecycleEvent) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        x.H0(qfVar, new d(crashReport));
    }

    @Override // cm.aptoide.pt.presenter.Presenter
    public void present() {
        onCreateSetupToolbar();
        onCreateLoadBundles();
        handleAppClick();
        handleAdClick();
        handleMoreClick();
        handleBottomReached();
        handlePullToRefresh();
        handleRetryClick();
        handleBundleScrolledRight();
    }
}
