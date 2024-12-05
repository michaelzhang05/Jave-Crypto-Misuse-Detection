package cm.aptoide.pt.feature;

import cm.aptoide.pt.presenter.Presenter;
import cm.aptoide.pt.presenter.View;
import cm.aptoide.pt.themes.NewFeatureDialogView;
import cm.aptoide.pt.themes.NewFeatureManager;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: NewFeatureDialogPresenter.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcm/aptoide/pt/feature/NewFeatureDialogPresenter;", "Lcm/aptoide/pt/presenter/Presenter;", "view", "Lcm/aptoide/pt/themes/NewFeatureDialogView;", "newFeatureManager", "Lcm/aptoide/pt/themes/NewFeatureManager;", "newFeatureListener", "Lcm/aptoide/pt/feature/NewFeatureListener;", "(Lcm/aptoide/pt/themes/NewFeatureDialogView;Lcm/aptoide/pt/themes/NewFeatureManager;Lcm/aptoide/pt/feature/NewFeatureListener;)V", "getView", "()Lcm/aptoide/pt/themes/NewFeatureDialogView;", "handleDialogShown", HttpUrl.FRAGMENT_ENCODE_SET, "handleDismissClick", "handleTurnItOnClick", "present", "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NewFeatureDialogPresenter implements Presenter {
    private final NewFeatureListener newFeatureListener;
    private final NewFeatureManager newFeatureManager;
    private final NewFeatureDialogView view;

    public NewFeatureDialogPresenter(NewFeatureDialogView newFeatureDialogView, NewFeatureManager newFeatureManager, NewFeatureListener newFeatureListener) {
        kotlin.jvm.internal.l.f(newFeatureDialogView, "view");
        kotlin.jvm.internal.l.f(newFeatureManager, "newFeatureManager");
        kotlin.jvm.internal.l.f(newFeatureListener, "newFeatureListener");
        this.view = newFeatureDialogView;
        this.newFeatureManager = newFeatureManager;
        this.newFeatureListener = newFeatureListener;
    }

    private final void handleDialogShown() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.feature.i
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean m146handleDialogShown$lambda0;
                m146handleDialogShown$lambda0 = NewFeatureDialogPresenter.m146handleDialogShown$lambda0((View.LifecycleEvent) obj);
                return m146handleDialogShown$lambda0;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.feature.c
            @Override // rx.m.b
            public final void call(Object obj) {
                NewFeatureDialogPresenter.m147handleDialogShown$lambda1(NewFeatureDialogPresenter.this, (View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.feature.k
            @Override // rx.m.b
            public final void call(Object obj) {
                NewFeatureDialogPresenter.m148handleDialogShown$lambda2((View.LifecycleEvent) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.feature.n
            @Override // rx.m.b
            public final void call(Object obj) {
                NewFeatureDialogPresenter.m149handleDialogShown$lambda3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleDialogShown$lambda-0, reason: not valid java name */
    public static final Boolean m146handleDialogShown$lambda0(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.RESUME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleDialogShown$lambda-1, reason: not valid java name */
    public static final void m147handleDialogShown$lambda1(NewFeatureDialogPresenter newFeatureDialogPresenter, View.LifecycleEvent lifecycleEvent) {
        kotlin.jvm.internal.l.f(newFeatureDialogPresenter, "this$0");
        newFeatureDialogPresenter.newFeatureManager.setFeatureAsShown();
        newFeatureDialogPresenter.newFeatureManager.unscheduleNotification();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleDialogShown$lambda-2, reason: not valid java name */
    public static final void m148handleDialogShown$lambda2(View.LifecycleEvent lifecycleEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleDialogShown$lambda-3, reason: not valid java name */
    public static final void m149handleDialogShown$lambda3(Throwable th) {
    }

    private final void handleDismissClick() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.feature.e
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean m154handleDismissClick$lambda9;
                m154handleDismissClick$lambda9 = NewFeatureDialogPresenter.m154handleDismissClick$lambda9((View.LifecycleEvent) obj);
                return m154handleDismissClick$lambda9;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.feature.l
            @Override // rx.m.e
            public final Object call(Object obj) {
                rx.e m150handleDismissClick$lambda10;
                m150handleDismissClick$lambda10 = NewFeatureDialogPresenter.m150handleDismissClick$lambda10(NewFeatureDialogPresenter.this, (View.LifecycleEvent) obj);
                return m150handleDismissClick$lambda10;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.feature.a
            @Override // rx.m.b
            public final void call(Object obj) {
                NewFeatureDialogPresenter.m151handleDismissClick$lambda11(NewFeatureDialogPresenter.this, (Void) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.feature.m
            @Override // rx.m.b
            public final void call(Object obj) {
                NewFeatureDialogPresenter.m152handleDismissClick$lambda12((Void) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.feature.d
            @Override // rx.m.b
            public final void call(Object obj) {
                NewFeatureDialogPresenter.m153handleDismissClick$lambda13((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleDismissClick$lambda-10, reason: not valid java name */
    public static final rx.e m150handleDismissClick$lambda10(NewFeatureDialogPresenter newFeatureDialogPresenter, View.LifecycleEvent lifecycleEvent) {
        kotlin.jvm.internal.l.f(newFeatureDialogPresenter, "this$0");
        return newFeatureDialogPresenter.view.clickDismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleDismissClick$lambda-11, reason: not valid java name */
    public static final void m151handleDismissClick$lambda11(NewFeatureDialogPresenter newFeatureDialogPresenter, Void r1) {
        kotlin.jvm.internal.l.f(newFeatureDialogPresenter, "this$0");
        newFeatureDialogPresenter.view.dismissView();
        newFeatureDialogPresenter.newFeatureListener.onDismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleDismissClick$lambda-12, reason: not valid java name */
    public static final void m152handleDismissClick$lambda12(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleDismissClick$lambda-13, reason: not valid java name */
    public static final void m153handleDismissClick$lambda13(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleDismissClick$lambda-9, reason: not valid java name */
    public static final Boolean m154handleDismissClick$lambda9(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    private final void handleTurnItOnClick() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.feature.h
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean m155handleTurnItOnClick$lambda4;
                m155handleTurnItOnClick$lambda4 = NewFeatureDialogPresenter.m155handleTurnItOnClick$lambda4((View.LifecycleEvent) obj);
                return m155handleTurnItOnClick$lambda4;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.feature.j
            @Override // rx.m.e
            public final Object call(Object obj) {
                rx.e m156handleTurnItOnClick$lambda5;
                m156handleTurnItOnClick$lambda5 = NewFeatureDialogPresenter.m156handleTurnItOnClick$lambda5(NewFeatureDialogPresenter.this, (View.LifecycleEvent) obj);
                return m156handleTurnItOnClick$lambda5;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.feature.g
            @Override // rx.m.b
            public final void call(Object obj) {
                NewFeatureDialogPresenter.m157handleTurnItOnClick$lambda6(NewFeatureDialogPresenter.this, (Void) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.feature.f
            @Override // rx.m.b
            public final void call(Object obj) {
                NewFeatureDialogPresenter.m158handleTurnItOnClick$lambda7((Void) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.feature.b
            @Override // rx.m.b
            public final void call(Object obj) {
                NewFeatureDialogPresenter.m159handleTurnItOnClick$lambda8((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleTurnItOnClick$lambda-4, reason: not valid java name */
    public static final Boolean m155handleTurnItOnClick$lambda4(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleTurnItOnClick$lambda-5, reason: not valid java name */
    public static final rx.e m156handleTurnItOnClick$lambda5(NewFeatureDialogPresenter newFeatureDialogPresenter, View.LifecycleEvent lifecycleEvent) {
        kotlin.jvm.internal.l.f(newFeatureDialogPresenter, "this$0");
        return newFeatureDialogPresenter.view.clickTurnItOn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleTurnItOnClick$lambda-6, reason: not valid java name */
    public static final void m157handleTurnItOnClick$lambda6(NewFeatureDialogPresenter newFeatureDialogPresenter, Void r1) {
        kotlin.jvm.internal.l.f(newFeatureDialogPresenter, "this$0");
        newFeatureDialogPresenter.view.dismissView();
        newFeatureDialogPresenter.newFeatureListener.onActivateFeature();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleTurnItOnClick$lambda-7, reason: not valid java name */
    public static final void m158handleTurnItOnClick$lambda7(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleTurnItOnClick$lambda-8, reason: not valid java name */
    public static final void m159handleTurnItOnClick$lambda8(Throwable th) {
    }

    public final NewFeatureDialogView getView() {
        return this.view;
    }

    @Override // cm.aptoide.pt.presenter.Presenter
    public void present() {
        handleDialogShown();
        handleDismissClick();
        handleTurnItOnClick();
    }
}
