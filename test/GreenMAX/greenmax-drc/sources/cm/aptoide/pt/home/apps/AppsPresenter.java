package cm.aptoide.pt.home.apps;

import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.pt.actions.PermissionManager;
import cm.aptoide.pt.actions.PermissionService;
import cm.aptoide.pt.crashreports.CrashReport;
import cm.aptoide.pt.home.apps.App;
import cm.aptoide.pt.home.apps.model.StateApp;
import cm.aptoide.pt.presenter.Presenter;
import cm.aptoide.pt.presenter.View;
import cm.aptoide.pt.view.rx.RxAlertDialog;
import java.util.List;
import rx.exceptions.OnErrorNotImplementedException;

/* loaded from: classes.dex */
public class AppsPresenter implements Presenter {
    private final AptoideAccountManager accountManager;
    private final AppsManager appsManager;
    private final AppsNavigator appsNavigator;
    private final CrashReport crashReport;
    private final rx.h ioScheduler;
    private final PermissionManager permissionManager;
    private final PermissionService permissionService;
    private final AppsFragmentView view;
    private final rx.h viewScheduler;

    public AppsPresenter(AppsFragmentView appsFragmentView, AppsManager appsManager, rx.h hVar, rx.h hVar2, CrashReport crashReport, PermissionManager permissionManager, PermissionService permissionService, AptoideAccountManager aptoideAccountManager, AppsNavigator appsNavigator) {
        this.view = appsFragmentView;
        this.appsManager = appsManager;
        this.viewScheduler = hVar;
        this.ioScheduler = hVar2;
        this.crashReport = crashReport;
        this.permissionManager = permissionManager;
        this.permissionService = permissionService;
        this.accountManager = aptoideAccountManager;
        this.appsNavigator = appsNavigator;
    }

    private rx.e<AppsModel> getAppsModel() {
        return rx.e.d(this.appsManager.getDownloadApps(), this.appsManager.getInstalledApps(), this.appsManager.getUpdatesList(), new rx.m.g() { // from class: cm.aptoide.pt.home.apps.n1
            @Override // rx.m.g
            public final Object a(Object obj, Object obj2, Object obj3) {
                return AppsPresenter.lambda$getAppsModel$60((List) obj, (List) obj2, (List) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getUserAvatar, reason: merged with bridge method [inline-methods] */
    public rx.e<String> L(Account account) {
        return rx.e.S((account == null || !account.isLoggedIn()) ? null : account.getAvatar());
    }

    private void handleBottomNavigationEvents() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.y0
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.z2
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppsPresenter.this.a((View.LifecycleEvent) obj);
            }
        }).j0(this.viewScheduler).x(new rx.m.b() { // from class: cm.aptoide.pt.home.apps.r1
            @Override // rx.m.b
            public final void call(Object obj) {
                AppsPresenter.this.b((Integer) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.home.apps.a3
            @Override // rx.m.b
            public final void call(Object obj) {
                AppsPresenter.lambda$handleBottomNavigationEvents$36((Integer) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.home.apps.p1
            @Override // rx.m.b
            public final void call(Object obj) {
                AppsPresenter.lambda$handleBottomNavigationEvents$37((Throwable) obj);
                throw null;
            }
        });
    }

    private void handleCancelDownloadClick() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.e2
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).j0(this.viewScheduler).G(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.y2
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppsPresenter.this.c((View.LifecycleEvent) obj);
            }
        }).j0(this.viewScheduler).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.home.apps.t2
            @Override // rx.m.b
            public final void call(Object obj) {
                AppsPresenter.lambda$handleCancelDownloadClick$50((App) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.home.apps.r2
            @Override // rx.m.b
            public final void call(Object obj) {
                AppsPresenter.this.d((Throwable) obj);
            }
        });
    }

    private void handleCardClick() {
        rx.e f2 = this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.w1
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).j0(this.viewScheduler).G(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.m3
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppsPresenter.this.e((View.LifecycleEvent) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.home.apps.j3
            @Override // rx.m.b
            public final void call(Object obj) {
                AppsPresenter.this.f((App) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        k2 k2Var = new rx.m.b() { // from class: cm.aptoide.pt.home.apps.k2
            @Override // rx.m.b
            public final void call(Object obj) {
                AppsPresenter.lambda$handleCardClick$13((App) obj);
            }
        };
        CrashReport crashReport = this.crashReport;
        crashReport.getClass();
        f2.H0(k2Var, new b(crashReport));
    }

    private void handleInstallAppClick() {
        rx.e j0 = this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.z0
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).j0(this.viewScheduler).G(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.h3
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppsPresenter.this.g((View.LifecycleEvent) obj);
            }
        }).j0(this.ioScheduler);
        final AppsManager appsManager = this.appsManager;
        appsManager.getClass();
        j0.H(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.n3
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppsManager.this.installApp((App) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.home.apps.d3
            @Override // rx.m.b
            public final void call(Object obj) {
                AppsPresenter.lambda$handleInstallAppClick$46((App) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.home.apps.t1
            @Override // rx.m.b
            public final void call(Object obj) {
                AppsPresenter.this.h((Throwable) obj);
            }
        });
    }

    private void handleOutOfSpaceAnalytics() {
        rx.e f2 = this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.c3
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.g1
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppsPresenter.this.i((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        t0 t0Var = new rx.m.b() { // from class: cm.aptoide.pt.home.apps.t0
            @Override // rx.m.b
            public final void call(Object obj) {
                AppsPresenter.lambda$handleOutOfSpaceAnalytics$2((List) obj);
            }
        };
        CrashReport crashReport = this.crashReport;
        crashReport.getClass();
        f2.H0(t0Var, new b(crashReport));
    }

    private void handlePauseDownloadClick() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.w0
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).j0(this.viewScheduler).G(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.z1
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppsPresenter.this.j((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.home.apps.f2
            @Override // rx.m.b
            public final void call(Object obj) {
                AppsPresenter.lambda$handlePauseDownloadClick$54((App) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.home.apps.y1
            @Override // rx.m.b
            public final void call(Object obj) {
                AppsPresenter.this.k((Throwable) obj);
            }
        });
    }

    private void handleRefreshApps() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.s2
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.h1
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppsPresenter.this.o((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.home.apps.u2
            @Override // rx.m.b
            public final void call(Object obj) {
                AppsPresenter.this.p((Void) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.home.apps.v1
            @Override // rx.m.b
            public final void call(Object obj) {
                AppsPresenter.this.q((Throwable) obj);
            }
        });
    }

    private void handleResumeClick() {
        rx.e f2 = this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.x1
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).j0(this.viewScheduler).G(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.b3
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppsPresenter.this.r((View.LifecycleEvent) obj);
            }
        }).j0(this.ioScheduler).H(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.o2
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppsPresenter.this.s((App) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        i3 i3Var = new rx.m.b() { // from class: cm.aptoide.pt.home.apps.i3
            @Override // rx.m.b
            public final void call(Object obj) {
                AppsPresenter.lambda$handleResumeClick$23((App) obj);
            }
        };
        CrashReport crashReport = this.crashReport;
        crashReport.getClass();
        f2.H0(i3Var, new b(crashReport));
    }

    private void handleStartDownloadClick() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.j1
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).j0(this.viewScheduler).G(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.l3
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppsPresenter.this.y((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.home.apps.b1
            @Override // rx.m.b
            public final void call(Object obj) {
                AppsPresenter.lambda$handleStartDownloadClick$31((Void) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.home.apps.d1
            @Override // rx.m.b
            public final void call(Object obj) {
                AppsPresenter.this.z((Throwable) obj);
            }
        });
    }

    private void handleUpdateAllClick() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.n2
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).j0(this.viewScheduler).G(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.a1
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppsPresenter.this.B((View.LifecycleEvent) obj);
            }
        }).j0(this.ioScheduler).H(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.l2
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppsPresenter.this.C((Void) obj);
            }
        }).j0(this.viewScheduler).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.home.apps.p2
            @Override // rx.m.b
            public final void call(Object obj) {
                AppsPresenter.lambda$handleUpdateAllClick$42((Void) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.home.apps.q1
            @Override // rx.m.b
            public final void call(Object obj) {
                AppsPresenter.this.D((Throwable) obj);
            }
        });
    }

    private void handleUpdateCardLongClick() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.u1
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).j0(this.viewScheduler).G(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.i2
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppsPresenter.this.E((View.LifecycleEvent) obj);
            }
        }).H(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.c2
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppsPresenter.this.G((App) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.home.apps.b2
            @Override // rx.m.b
            public final void call(Object obj) {
                AppsPresenter.lambda$handleUpdateCardLongClick$18((App) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.home.apps.g3
            @Override // rx.m.b
            public final void call(Object obj) {
                AppsPresenter.this.H((Throwable) obj);
            }
        });
    }

    private void handleUserAvatarClick() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.e1
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.g2
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppsPresenter.this.J((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.home.apps.x0
            @Override // rx.m.b
            public final void call(Object obj) {
                AppsPresenter.lambda$handleUserAvatarClick$70((Void) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.home.apps.s1
            @Override // rx.m.b
            public final void call(Object obj) {
                AppsPresenter.lambda$handleUserAvatarClick$71((Throwable) obj);
                throw null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ AppsModel lambda$getAppsModel$60(List list, List list2, List list3) {
        return new AppsModel(list3, list2, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBottomNavigationEvents$34, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e a(View.LifecycleEvent lifecycleEvent) {
        return this.appsNavigator.bottomNavigation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBottomNavigationEvents$35, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void b(Integer num) {
        this.view.scrollToTop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleBottomNavigationEvents$36(Integer num) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleBottomNavigationEvents$37(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCancelDownloadClick$49, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e c(View.LifecycleEvent lifecycleEvent) {
        rx.e<App> j0 = this.view.cancelDownload().j0(this.ioScheduler);
        final AppsManager appsManager = this.appsManager;
        appsManager.getClass();
        return j0.H(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.q3
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppsManager.this.cancelDownload((App) obj);
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleCancelDownloadClick$50(App app) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCancelDownloadClick$51, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void d(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCardClick$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e e(View.LifecycleEvent lifecycleEvent) {
        return this.view.cardClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCardClick$12, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void f(App app) {
        if (app.getType() == App.Type.DOWNLOAD || app.getType() == App.Type.UPDATE) {
            this.appsManager.setAppViewAnalyticsEvent();
        }
        this.appsNavigator.navigateToAppView(((StateApp) app).getMd5());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleCardClick$13(App app) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallAppClick$45, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e g(View.LifecycleEvent lifecycleEvent) {
        return this.view.installApp();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleInstallAppClick$46(App app) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallAppClick$47, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void h(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOutOfSpaceAnalytics$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e i(View.LifecycleEvent lifecycleEvent) {
        return this.appsManager.observeOutOfSpaceApps();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleOutOfSpaceAnalytics$2(List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePauseDownloadClick$53, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e j(View.LifecycleEvent lifecycleEvent) {
        rx.e<App> j0 = this.view.pauseDownload().j0(this.ioScheduler);
        final AppsManager appsManager = this.appsManager;
        appsManager.getClass();
        return j0.H(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.t3
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppsManager.this.pauseDownload((App) obj);
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handlePauseDownloadClick$54(App app) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePauseDownloadClick$55, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void k(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRefreshApps$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void l() {
        this.view.hidePullToRefresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRefreshApps$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m(Throwable th) {
        this.view.hidePullToRefresh();
        th.printStackTrace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRefreshApps$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b n(Void r2) {
        return this.appsManager.refreshAllUpdates().z(this.viewScheduler).m(new rx.m.a() { // from class: cm.aptoide.pt.home.apps.q2
            @Override // rx.m.a
            public final void call() {
                AppsPresenter.this.l();
            }
        }).n(new rx.m.b() { // from class: cm.aptoide.pt.home.apps.m1
            @Override // rx.m.b
            public final void call(Object obj) {
                AppsPresenter.this.m((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRefreshApps$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e o(View.LifecycleEvent lifecycleEvent) {
        return this.view.refreshApps().j0(this.ioScheduler).H(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.f1
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppsPresenter.this.n((Void) obj);
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRefreshApps$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void p(Void r1) {
        this.view.hidePullToRefresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRefreshApps$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void q(Throwable th) {
        this.view.hidePullToRefresh();
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleResumeClick$21, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e r(View.LifecycleEvent lifecycleEvent) {
        return this.view.resumeDownload();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleResumeClick$22, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b s(App app) {
        return this.appsManager.resumeDownload(app, app.getType().toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleResumeClick$23(App app) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleStartDownloadClick$25, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void t(Boolean bool) {
        this.appsManager.storeRootAnswer(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleStartDownloadClick$26, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e u(Void r2) {
        if (this.appsManager.showWarning()) {
            return this.view.showRootWarning().x(new rx.m.b() { // from class: cm.aptoide.pt.home.apps.e3
                @Override // rx.m.b
                public final void call(Object obj) {
                    AppsPresenter.this.t((Boolean) obj);
                }
            });
        }
        return rx.e.S(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleStartDownloadClick$27, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e v(Boolean bool) {
        return this.permissionManager.requestDownloadAccess(this.permissionService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleStartDownloadClick$28, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b w(App app, Void r2) {
        return this.appsManager.updateApp(app);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleStartDownloadClick$29, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e x(final App app) {
        return this.permissionManager.requestExternalStoragePermission(this.permissionService).G(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.u0
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppsPresenter.this.u((Void) obj);
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.i1
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppsPresenter.this.v((Boolean) obj);
            }
        }).j0(this.ioScheduler).H(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.m2
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppsPresenter.this.w(app, (Void) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleStartDownloadClick$30, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e y(View.LifecycleEvent lifecycleEvent) {
        return this.view.startDownload().G(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.f3
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppsPresenter.this.x((App) obj);
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleStartDownloadClick$31(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleStartDownloadClick$32, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void z(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUpdateAllClick$39, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e A(Void r2) {
        return this.permissionManager.requestExternalStoragePermission(this.permissionService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUpdateAllClick$40, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e B(View.LifecycleEvent lifecycleEvent) {
        return this.view.updateAll().G(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.x2
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppsPresenter.this.A((Void) obj);
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUpdateAllClick$41, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b C(Void r1) {
        return this.appsManager.updateAll();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleUpdateAllClick$42(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUpdateAllClick$43, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void D(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUpdateCardLongClick$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e E(View.LifecycleEvent lifecycleEvent) {
        return this.view.updateLongClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUpdateCardLongClick$16, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b F(App app, RxAlertDialog.Result result) {
        if (result == RxAlertDialog.Result.POSITIVE) {
            return this.appsManager.excludeUpdate(app);
        }
        return rx.b.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUpdateCardLongClick$17, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b G(final App app) {
        return this.view.showIgnoreUpdateDialog().j(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.a2
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppsPresenter.this.F(app, (RxAlertDialog.Result) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleUpdateCardLongClick$18(App app) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUpdateCardLongClick$19, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void H(Throwable th) {
        this.view.showUnknownErrorMessage();
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUserAvatarClick$68, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void I(Void r1) {
        this.appsNavigator.navigateToMyAccount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUserAvatarClick$69, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e J(View.LifecycleEvent lifecycleEvent) {
        return this.view.imageClick().j0(this.viewScheduler).x(new rx.m.b() { // from class: cm.aptoide.pt.home.apps.l1
            @Override // rx.m.b
            public final void call(Object obj) {
                AppsPresenter.this.I((Void) obj);
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleUserAvatarClick$70(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleUserAvatarClick$71(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadUserImage$62, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e K(View.LifecycleEvent lifecycleEvent) {
        return this.accountManager.accountStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadUserImage$64, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void M(String str) {
        if (str != null) {
            this.view.setUserImage(str);
        } else {
            this.view.setDefaultUserImage();
        }
        this.view.showAvatar();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$loadUserImage$65(String str) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$loadUserImage$66(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observeAppModelState$57, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e N(View.LifecycleEvent lifecycleEvent) {
        return getAppsModel();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$observeAppModelState$58(AppsModel appsModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observeAppModelState$59, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void O(Throwable th) {
        this.crashReport.log(th);
    }

    private void loadUserImage() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.h2
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.d2
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppsPresenter.this.K((View.LifecycleEvent) obj);
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.w2
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppsPresenter.this.L((Account) obj);
            }
        }).j0(this.viewScheduler).x(new rx.m.b() { // from class: cm.aptoide.pt.home.apps.v2
            @Override // rx.m.b
            public final void call(Object obj) {
                AppsPresenter.this.M((String) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.home.apps.o1
            @Override // rx.m.b
            public final void call(Object obj) {
                AppsPresenter.lambda$loadUserImage$65((String) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.home.apps.v0
            @Override // rx.m.b
            public final void call(Object obj) {
                AppsPresenter.lambda$loadUserImage$66((Throwable) obj);
                throw null;
            }
        });
    }

    private void observeAppModelState() {
        rx.e j0 = this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.j2
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).j0(this.ioScheduler).G(new rx.m.e() { // from class: cm.aptoide.pt.home.apps.k1
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AppsPresenter.this.N((View.LifecycleEvent) obj);
            }
        }).j0(this.viewScheduler);
        final AppsFragmentView appsFragmentView = this.view;
        appsFragmentView.getClass();
        j0.x(new rx.m.b() { // from class: cm.aptoide.pt.home.apps.w3
            @Override // rx.m.b
            public final void call(Object obj) {
                AppsFragmentView.this.showModel((AppsModel) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.home.apps.k3
            @Override // rx.m.b
            public final void call(Object obj) {
                AppsPresenter.lambda$observeAppModelState$58((AppsModel) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.home.apps.c1
            @Override // rx.m.b
            public final void call(Object obj) {
                AppsPresenter.this.O((Throwable) obj);
            }
        });
    }

    @Override // cm.aptoide.pt.presenter.Presenter
    public void present() {
        observeAppModelState();
        handlePauseDownloadClick();
        handleResumeClick();
        handleCancelDownloadClick();
        handleInstallAppClick();
        handleUpdateAllClick();
        handleStartDownloadClick();
        handleCardClick();
        handleUpdateCardLongClick();
        loadUserImage();
        handleUserAvatarClick();
        handleBottomNavigationEvents();
        handleRefreshApps();
        handleOutOfSpaceAnalytics();
    }
}
