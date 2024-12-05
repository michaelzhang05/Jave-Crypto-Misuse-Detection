package cm.aptoide.pt.download.view.outofspace;

import cm.aptoide.pt.crashreports.CrashReport;
import cm.aptoide.pt.presenter.Presenter;
import cm.aptoide.pt.presenter.View;
import java.util.List;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import rx.Single;

/* compiled from: OutOfSpaceDialogPresenter.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceDialogPresenter;", "Lcm/aptoide/pt/presenter/Presenter;", "view", "Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceDialogView;", "crashReporter", "Lcm/aptoide/pt/crashreports/CrashReport;", "viewScheduler", "Lrx/Scheduler;", "ioScheduler", "outOfSpaceManager", "Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceManager;", "outOfSpaceNavigator", "Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceNavigator;", "(Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceDialogView;Lcm/aptoide/pt/crashreports/CrashReport;Lrx/Scheduler;Lrx/Scheduler;Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceManager;Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceNavigator;)V", "handleDismissDialogButtonClick", HttpUrl.FRAGMENT_ENCODE_SET, "handleUninstalledEnoughApps", "loadAppsToUninstall", "loadRequiredStorageSize", "present", "uninstallApp", "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OutOfSpaceDialogPresenter implements Presenter {
    private final CrashReport crashReporter;
    private final rx.h ioScheduler;
    private final OutOfSpaceManager outOfSpaceManager;
    private final OutOfSpaceNavigator outOfSpaceNavigator;
    private final OutOfSpaceDialogView view;
    private final rx.h viewScheduler;

    public OutOfSpaceDialogPresenter(OutOfSpaceDialogView outOfSpaceDialogView, CrashReport crashReport, rx.h hVar, rx.h hVar2, OutOfSpaceManager outOfSpaceManager, OutOfSpaceNavigator outOfSpaceNavigator) {
        kotlin.jvm.internal.l.f(outOfSpaceDialogView, "view");
        kotlin.jvm.internal.l.f(crashReport, "crashReporter");
        kotlin.jvm.internal.l.f(hVar, "viewScheduler");
        kotlin.jvm.internal.l.f(hVar2, "ioScheduler");
        kotlin.jvm.internal.l.f(outOfSpaceManager, "outOfSpaceManager");
        kotlin.jvm.internal.l.f(outOfSpaceNavigator, "outOfSpaceNavigator");
        this.view = outOfSpaceDialogView;
        this.crashReporter = crashReport;
        this.viewScheduler = hVar;
        this.ioScheduler = hVar2;
        this.outOfSpaceManager = outOfSpaceManager;
        this.outOfSpaceNavigator = outOfSpaceNavigator;
    }

    private final void handleDismissDialogButtonClick() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.download.view.outofspace.g
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean m111handleDismissDialogButtonClick$lambda10;
                m111handleDismissDialogButtonClick$lambda10 = OutOfSpaceDialogPresenter.m111handleDismissDialogButtonClick$lambda10((View.LifecycleEvent) obj);
                return m111handleDismissDialogButtonClick$lambda10;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.download.view.outofspace.k
            @Override // rx.m.e
            public final Object call(Object obj) {
                rx.e m112handleDismissDialogButtonClick$lambda11;
                m112handleDismissDialogButtonClick$lambda11 = OutOfSpaceDialogPresenter.m112handleDismissDialogButtonClick$lambda11(OutOfSpaceDialogPresenter.this, (View.LifecycleEvent) obj);
                return m112handleDismissDialogButtonClick$lambda11;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.download.view.outofspace.d
            @Override // rx.m.b
            public final void call(Object obj) {
                OutOfSpaceDialogPresenter.m113handleDismissDialogButtonClick$lambda12(OutOfSpaceDialogPresenter.this, (Void) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.download.view.outofspace.z
            @Override // rx.m.b
            public final void call(Object obj) {
                OutOfSpaceDialogPresenter.m114handleDismissDialogButtonClick$lambda13((Void) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.download.view.outofspace.m
            @Override // rx.m.b
            public final void call(Object obj) {
                OutOfSpaceDialogPresenter.m115handleDismissDialogButtonClick$lambda14(OutOfSpaceDialogPresenter.this, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleDismissDialogButtonClick$lambda-10, reason: not valid java name */
    public static final Boolean m111handleDismissDialogButtonClick$lambda10(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleDismissDialogButtonClick$lambda-11, reason: not valid java name */
    public static final rx.e m112handleDismissDialogButtonClick$lambda11(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, View.LifecycleEvent lifecycleEvent) {
        kotlin.jvm.internal.l.f(outOfSpaceDialogPresenter, "this$0");
        return outOfSpaceDialogPresenter.view.dismissDialogClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleDismissDialogButtonClick$lambda-12, reason: not valid java name */
    public static final void m113handleDismissDialogButtonClick$lambda12(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, Void r1) {
        kotlin.jvm.internal.l.f(outOfSpaceDialogPresenter, "this$0");
        outOfSpaceDialogPresenter.view.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleDismissDialogButtonClick$lambda-13, reason: not valid java name */
    public static final void m114handleDismissDialogButtonClick$lambda13(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleDismissDialogButtonClick$lambda-14, reason: not valid java name */
    public static final void m115handleDismissDialogButtonClick$lambda14(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, Throwable th) {
        kotlin.jvm.internal.l.f(outOfSpaceDialogPresenter, "this$0");
        outOfSpaceDialogPresenter.crashReporter.log(th);
    }

    private final void handleUninstalledEnoughApps() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.download.view.outofspace.b
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean m116handleUninstalledEnoughApps$lambda5;
                m116handleUninstalledEnoughApps$lambda5 = OutOfSpaceDialogPresenter.m116handleUninstalledEnoughApps$lambda5((View.LifecycleEvent) obj);
                return m116handleUninstalledEnoughApps$lambda5;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.download.view.outofspace.f
            @Override // rx.m.e
            public final Object call(Object obj) {
                rx.e m117handleUninstalledEnoughApps$lambda6;
                m117handleUninstalledEnoughApps$lambda6 = OutOfSpaceDialogPresenter.m117handleUninstalledEnoughApps$lambda6(OutOfSpaceDialogPresenter.this, (View.LifecycleEvent) obj);
                return m117handleUninstalledEnoughApps$lambda6;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.download.view.outofspace.t
            @Override // rx.m.b
            public final void call(Object obj) {
                OutOfSpaceDialogPresenter.m118handleUninstalledEnoughApps$lambda7(OutOfSpaceDialogPresenter.this, (Void) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.download.view.outofspace.a0
            @Override // rx.m.b
            public final void call(Object obj) {
                OutOfSpaceDialogPresenter.m119handleUninstalledEnoughApps$lambda8((Void) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.download.view.outofspace.n
            @Override // rx.m.b
            public final void call(Object obj) {
                OutOfSpaceDialogPresenter.m120handleUninstalledEnoughApps$lambda9(OutOfSpaceDialogPresenter.this, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleUninstalledEnoughApps$lambda-5, reason: not valid java name */
    public static final Boolean m116handleUninstalledEnoughApps$lambda5(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleUninstalledEnoughApps$lambda-6, reason: not valid java name */
    public static final rx.e m117handleUninstalledEnoughApps$lambda6(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, View.LifecycleEvent lifecycleEvent) {
        kotlin.jvm.internal.l.f(outOfSpaceDialogPresenter, "this$0");
        return outOfSpaceDialogPresenter.outOfSpaceManager.uninstalledEnoughApps();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleUninstalledEnoughApps$lambda-7, reason: not valid java name */
    public static final void m118handleUninstalledEnoughApps$lambda7(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, Void r1) {
        kotlin.jvm.internal.l.f(outOfSpaceDialogPresenter, "this$0");
        outOfSpaceDialogPresenter.outOfSpaceNavigator.clearedEnoughSpace();
        outOfSpaceDialogPresenter.view.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleUninstalledEnoughApps$lambda-8, reason: not valid java name */
    public static final void m119handleUninstalledEnoughApps$lambda8(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleUninstalledEnoughApps$lambda-9, reason: not valid java name */
    public static final void m120handleUninstalledEnoughApps$lambda9(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, Throwable th) {
        kotlin.jvm.internal.l.f(outOfSpaceDialogPresenter, "this$0");
        outOfSpaceDialogPresenter.crashReporter.log(th);
    }

    private final void loadAppsToUninstall() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.download.view.outofspace.h
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean m121loadAppsToUninstall$lambda21;
                m121loadAppsToUninstall$lambda21 = OutOfSpaceDialogPresenter.m121loadAppsToUninstall$lambda21((View.LifecycleEvent) obj);
                return m121loadAppsToUninstall$lambda21;
            }
        }).j0(this.ioScheduler).G(new rx.m.e() { // from class: cm.aptoide.pt.download.view.outofspace.p
            @Override // rx.m.e
            public final Object call(Object obj) {
                rx.e m122loadAppsToUninstall$lambda22;
                m122loadAppsToUninstall$lambda22 = OutOfSpaceDialogPresenter.m122loadAppsToUninstall$lambda22(OutOfSpaceDialogPresenter.this, (View.LifecycleEvent) obj);
                return m122loadAppsToUninstall$lambda22;
            }
        }).j0(this.viewScheduler).x(new rx.m.b() { // from class: cm.aptoide.pt.download.view.outofspace.e
            @Override // rx.m.b
            public final void call(Object obj) {
                OutOfSpaceDialogPresenter.m123loadAppsToUninstall$lambda23(OutOfSpaceDialogPresenter.this, (List) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.download.view.outofspace.u
            @Override // rx.m.b
            public final void call(Object obj) {
                OutOfSpaceDialogPresenter.m124loadAppsToUninstall$lambda24((List) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.download.view.outofspace.s
            @Override // rx.m.b
            public final void call(Object obj) {
                OutOfSpaceDialogPresenter.m125loadAppsToUninstall$lambda25(OutOfSpaceDialogPresenter.this, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadAppsToUninstall$lambda-21, reason: not valid java name */
    public static final Boolean m121loadAppsToUninstall$lambda21(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadAppsToUninstall$lambda-22, reason: not valid java name */
    public static final rx.e m122loadAppsToUninstall$lambda22(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, View.LifecycleEvent lifecycleEvent) {
        kotlin.jvm.internal.l.f(outOfSpaceDialogPresenter, "this$0");
        return outOfSpaceDialogPresenter.outOfSpaceManager.getInstalledApps();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadAppsToUninstall$lambda-23, reason: not valid java name */
    public static final void m123loadAppsToUninstall$lambda23(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, List list) {
        kotlin.jvm.internal.l.f(outOfSpaceDialogPresenter, "this$0");
        kotlin.jvm.internal.l.e(list, "appsList");
        if (!list.isEmpty()) {
            outOfSpaceDialogPresenter.view.showInstalledApps(list);
        } else {
            outOfSpaceDialogPresenter.view.showGeneralOutOfSpaceError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadAppsToUninstall$lambda-24, reason: not valid java name */
    public static final void m124loadAppsToUninstall$lambda24(List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadAppsToUninstall$lambda-25, reason: not valid java name */
    public static final void m125loadAppsToUninstall$lambda25(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, Throwable th) {
        kotlin.jvm.internal.l.f(outOfSpaceDialogPresenter, "this$0");
        outOfSpaceDialogPresenter.crashReporter.log(th);
    }

    private final void loadRequiredStorageSize() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.download.view.outofspace.x
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean m126loadRequiredStorageSize$lambda0;
                m126loadRequiredStorageSize$lambda0 = OutOfSpaceDialogPresenter.m126loadRequiredStorageSize$lambda0((View.LifecycleEvent) obj);
                return m126loadRequiredStorageSize$lambda0;
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.download.view.outofspace.j
            @Override // rx.m.e
            public final Object call(Object obj) {
                Single m127loadRequiredStorageSize$lambda1;
                m127loadRequiredStorageSize$lambda1 = OutOfSpaceDialogPresenter.m127loadRequiredStorageSize$lambda1(OutOfSpaceDialogPresenter.this, (View.LifecycleEvent) obj);
                return m127loadRequiredStorageSize$lambda1;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.download.view.outofspace.y
            @Override // rx.m.b
            public final void call(Object obj) {
                OutOfSpaceDialogPresenter.m128loadRequiredStorageSize$lambda2(OutOfSpaceDialogPresenter.this, (Long) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.download.view.outofspace.v
            @Override // rx.m.b
            public final void call(Object obj) {
                OutOfSpaceDialogPresenter.m129loadRequiredStorageSize$lambda3((Long) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.download.view.outofspace.r
            @Override // rx.m.b
            public final void call(Object obj) {
                OutOfSpaceDialogPresenter.m130loadRequiredStorageSize$lambda4(OutOfSpaceDialogPresenter.this, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadRequiredStorageSize$lambda-0, reason: not valid java name */
    public static final Boolean m126loadRequiredStorageSize$lambda0(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadRequiredStorageSize$lambda-1, reason: not valid java name */
    public static final Single m127loadRequiredStorageSize$lambda1(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, View.LifecycleEvent lifecycleEvent) {
        kotlin.jvm.internal.l.f(outOfSpaceDialogPresenter, "this$0");
        return outOfSpaceDialogPresenter.outOfSpaceManager.getRequiredStorageSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadRequiredStorageSize$lambda-2, reason: not valid java name */
    public static final void m128loadRequiredStorageSize$lambda2(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, Long l) {
        kotlin.jvm.internal.l.f(outOfSpaceDialogPresenter, "this$0");
        OutOfSpaceDialogView outOfSpaceDialogView = outOfSpaceDialogPresenter.view;
        kotlin.jvm.internal.l.e(l, "it");
        outOfSpaceDialogView.requiredSpaceToInstall(l.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadRequiredStorageSize$lambda-3, reason: not valid java name */
    public static final void m129loadRequiredStorageSize$lambda3(Long l) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadRequiredStorageSize$lambda-4, reason: not valid java name */
    public static final void m130loadRequiredStorageSize$lambda4(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, Throwable th) {
        kotlin.jvm.internal.l.f(outOfSpaceDialogPresenter, "this$0");
        outOfSpaceDialogPresenter.crashReporter.log(th);
    }

    private final void uninstallApp() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.download.view.outofspace.l
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean m131uninstallApp$lambda15;
                m131uninstallApp$lambda15 = OutOfSpaceDialogPresenter.m131uninstallApp$lambda15((View.LifecycleEvent) obj);
                return m131uninstallApp$lambda15;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.download.view.outofspace.c
            @Override // rx.m.e
            public final Object call(Object obj) {
                rx.e m132uninstallApp$lambda16;
                m132uninstallApp$lambda16 = OutOfSpaceDialogPresenter.m132uninstallApp$lambda16(OutOfSpaceDialogPresenter.this, (View.LifecycleEvent) obj);
                return m132uninstallApp$lambda16;
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.download.view.outofspace.i
            @Override // rx.m.e
            public final Object call(Object obj) {
                Single m133uninstallApp$lambda17;
                m133uninstallApp$lambda17 = OutOfSpaceDialogPresenter.m133uninstallApp$lambda17(OutOfSpaceDialogPresenter.this, (String) obj);
                return m133uninstallApp$lambda17;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.download.view.outofspace.o
            @Override // rx.m.b
            public final void call(Object obj) {
                OutOfSpaceDialogPresenter.m134uninstallApp$lambda18(OutOfSpaceDialogPresenter.this, (Long) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.download.view.outofspace.q
            @Override // rx.m.b
            public final void call(Object obj) {
                OutOfSpaceDialogPresenter.m135uninstallApp$lambda19((Long) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.download.view.outofspace.w
            @Override // rx.m.b
            public final void call(Object obj) {
                OutOfSpaceDialogPresenter.m136uninstallApp$lambda20(OutOfSpaceDialogPresenter.this, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uninstallApp$lambda-15, reason: not valid java name */
    public static final Boolean m131uninstallApp$lambda15(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uninstallApp$lambda-16, reason: not valid java name */
    public static final rx.e m132uninstallApp$lambda16(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, View.LifecycleEvent lifecycleEvent) {
        kotlin.jvm.internal.l.f(outOfSpaceDialogPresenter, "this$0");
        return outOfSpaceDialogPresenter.view.uninstallClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uninstallApp$lambda-17, reason: not valid java name */
    public static final Single m133uninstallApp$lambda17(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, String str) {
        kotlin.jvm.internal.l.f(outOfSpaceDialogPresenter, "this$0");
        return outOfSpaceDialogPresenter.outOfSpaceManager.uninstallApp(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uninstallApp$lambda-18, reason: not valid java name */
    public static final void m134uninstallApp$lambda18(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, Long l) {
        kotlin.jvm.internal.l.f(outOfSpaceDialogPresenter, "this$0");
        OutOfSpaceDialogView outOfSpaceDialogView = outOfSpaceDialogPresenter.view;
        kotlin.jvm.internal.l.e(l, "removedAppSize");
        outOfSpaceDialogView.requiredSpaceToInstall(l.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uninstallApp$lambda-19, reason: not valid java name */
    public static final void m135uninstallApp$lambda19(Long l) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uninstallApp$lambda-20, reason: not valid java name */
    public static final void m136uninstallApp$lambda20(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, Throwable th) {
        kotlin.jvm.internal.l.f(outOfSpaceDialogPresenter, "this$0");
        outOfSpaceDialogPresenter.crashReporter.log(th);
    }

    @Override // cm.aptoide.pt.presenter.Presenter
    public void present() {
        loadAppsToUninstall();
        loadRequiredStorageSize();
        uninstallApp();
        handleDismissDialogButtonClick();
        handleUninstalledEnoughApps();
    }
}
