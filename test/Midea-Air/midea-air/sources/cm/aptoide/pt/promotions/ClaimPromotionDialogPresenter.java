package cm.aptoide.pt.promotions;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import cm.aptoide.pt.install.installer.RootCommandOnSubscribe;
import cm.aptoide.pt.navigator.Result;
import cm.aptoide.pt.presenter.Presenter;
import cm.aptoide.pt.presenter.View;
import cm.aptoide.pt.promotions.ClaimStatusWrapper;
import java.util.List;
import rx.Single;

/* loaded from: classes.dex */
public class ClaimPromotionDialogPresenter implements Presenter {
    private static final String WALLET_ADDRESS = "WALLET_ADDRESS";
    private static final int WALLET_VERIFICATION_RESULT_CANCELED = 1;
    private static final int WALLET_VERIFICATION_RESULT_FAILED = 2;
    private static final int WALLET_VERIFICATION_RESULT_OK = 0;
    private ClaimPromotionsManager claimPromotionsManager;
    private ClaimPromotionsNavigator navigator;
    private PromotionsAnalytics promotionsAnalytics;
    private boolean shouldSendIntent = true;
    private rx.t.b subscriptions;
    private ClaimPromotionDialogView view;
    private rx.h viewScheduler;

    public ClaimPromotionDialogPresenter(ClaimPromotionDialogView claimPromotionDialogView, rx.t.b bVar, rx.h hVar, ClaimPromotionsManager claimPromotionsManager, PromotionsAnalytics promotionsAnalytics, ClaimPromotionsNavigator claimPromotionsNavigator) {
        this.view = claimPromotionDialogView;
        this.subscriptions = bVar;
        this.viewScheduler = hVar;
        this.claimPromotionsManager = claimPromotionsManager;
        this.promotionsAnalytics = promotionsAnalytics;
        this.navigator = claimPromotionsNavigator;
    }

    private Single<String> claimPromotion() {
        return this.claimPromotionsManager.claimPromotion().p(this.viewScheduler).i(new rx.m.e() { // from class: cm.aptoide.pt.promotions.r0
            @Override // rx.m.e
            public final Object call(Object obj) {
                return ClaimPromotionDialogPresenter.this.b((ClaimStatusWrapper) obj);
            }
        });
    }

    private void handleContinueClick() {
        this.subscriptions.a(this.view.continueWalletClick().x(new rx.m.b() { // from class: cm.aptoide.pt.promotions.i0
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.this.c((ClaimPromotionsClickWrapper) obj);
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.promotions.s0
            @Override // rx.m.e
            public final Object call(Object obj) {
                return ClaimPromotionDialogPresenter.this.d((ClaimPromotionsClickWrapper) obj);
            }
        }).H0(new rx.m.b() { // from class: cm.aptoide.pt.promotions.d0
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.lambda$handleContinueClick$31((String) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.promotions.y
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.lambda$handleContinueClick$32((Throwable) obj);
            }
        }));
    }

    private void handleDismissGenericError() {
        this.subscriptions.a(this.view.dismissGenericErrorClick().x(new rx.m.b() { // from class: cm.aptoide.pt.promotions.j0
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.this.e((Void) obj);
            }
        }).H0(new rx.m.b() { // from class: cm.aptoide.pt.promotions.t
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.lambda$handleDismissGenericError$38((Void) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.promotions.u
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.this.f((Throwable) obj);
            }
        }));
    }

    private void handleDismissGenericMessage() {
        this.subscriptions.a(this.view.dismissGenericMessage().x(new rx.m.b() { // from class: cm.aptoide.pt.promotions.n
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.this.g((ClaimDialogResultWrapper) obj);
            }
        }).H0(new rx.m.b() { // from class: cm.aptoide.pt.promotions.a0
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.lambda$handleDismissGenericMessage$44((ClaimDialogResultWrapper) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.promotions.b0
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.this.h((Throwable) obj);
            }
        }));
    }

    private String handleErrors(List<ClaimStatusWrapper.Error> list) {
        if (list.contains(ClaimStatusWrapper.Error.PROMOTION_CLAIMED)) {
            this.view.showPromotionAlreadyClaimed();
            return "error";
        }
        if (list.contains(ClaimStatusWrapper.Error.WRONG_ADDRESS)) {
            this.view.showInvalidWalletAddress();
            return "error";
        }
        if (list.contains(ClaimStatusWrapper.Error.WALLET_NOT_VERIFIED)) {
            this.view.verifyWallet();
            return "error";
        }
        this.view.showGenericError();
        return "error";
    }

    private void handleFindAddressClick() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.promotions.x0
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).j0(this.viewScheduler).G(new rx.m.e() { // from class: cm.aptoide.pt.promotions.w0
            @Override // rx.m.e
            public final Object call(Object obj) {
                return ClaimPromotionDialogPresenter.this.k((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.promotions.g
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.lambda$handleFindAddressClick$27((String) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.promotions.p
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.lambda$handleFindAddressClick$28((Throwable) obj);
            }
        });
    }

    private void handleOnEditTextChanged() {
        this.subscriptions.a(this.view.editTextChanges().x(new rx.m.b() { // from class: cm.aptoide.pt.promotions.e0
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.this.l((e.g.a.d.b) obj);
            }
        }).H0(new rx.m.b() { // from class: cm.aptoide.pt.promotions.k
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.lambda$handleOnEditTextChanged$35((e.g.a.d.b) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.promotions.m0
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.this.m((Throwable) obj);
            }
        }));
    }

    private void handleOnResumeEvent() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.promotions.o
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.RESUME);
                return valueOf;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.promotions.s
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.this.n((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.promotions.q0
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.lambda$handleOnResumeEvent$17((View.LifecycleEvent) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.promotions.j
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.lambda$handleOnResumeEvent$18((Throwable) obj);
            }
        });
    }

    private void handleUpdateWallet() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.promotions.h0
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).j0(this.viewScheduler).G(new rx.m.e() { // from class: cm.aptoide.pt.promotions.w
            @Override // rx.m.e
            public final Object call(Object obj) {
                return ClaimPromotionDialogPresenter.this.o((View.LifecycleEvent) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.promotions.e
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.this.p((Void) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.promotions.n0
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.this.q((Void) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.promotions.k0
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.lambda$handleUpdateWallet$4((Void) obj);
            }
        }, v6.f6600f);
    }

    private void handleUpdateWalletCancelClick() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.promotions.h
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).j0(this.viewScheduler).G(new rx.m.e() { // from class: cm.aptoide.pt.promotions.y0
            @Override // rx.m.e
            public final Object call(Object obj) {
                return ClaimPromotionDialogPresenter.this.r((View.LifecycleEvent) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.promotions.c0
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.this.s((Void) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.promotions.v0
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.lambda$handleUpdateWalletCancelClick$8((Void) obj);
            }
        }, v6.f6600f);
    }

    private void handleWalletCancelClick() {
        this.subscriptions.a(this.view.walletCancelClick().x(new rx.m.b() { // from class: cm.aptoide.pt.promotions.o0
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.this.t((String) obj);
            }
        }).H0(new rx.m.b() { // from class: cm.aptoide.pt.promotions.x
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.lambda$handleWalletCancelClick$41((String) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.promotions.u0
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.this.u((Throwable) obj);
            }
        }));
    }

    private void handleWalletPermissionsResult() {
        this.view.getActivityResults().D(new rx.m.e() { // from class: cm.aptoide.pt.promotions.l
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1.getRequestCode() == 123);
                return valueOf;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.promotions.l0
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.this.v((Result) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.promotions.t0
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.lambda$handleWalletPermissionsResult$21((Result) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.promotions.v
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.this.w((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleWalletVerificationErrors(Integer num) {
        if (num.intValue() == 1) {
            this.view.showCanceledVerificationError();
        } else if (num.equals(2)) {
            this.view.showGenericError();
        }
    }

    private void handleWalletVerificationResult() {
        this.view.getActivityResults().D(new rx.m.e() { // from class: cm.aptoide.pt.promotions.i
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1.getRequestCode() == 124);
                return valueOf;
            }
        }).X(new rx.m.e() { // from class: cm.aptoide.pt.promotions.w6
            @Override // rx.m.e
            public final Object call(Object obj) {
                return Integer.valueOf(((Result) obj).getResultCode());
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.promotions.z
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.this.handleWalletVerificationErrors((Integer) obj);
            }
        }).D(new rx.m.e() { // from class: cm.aptoide.pt.promotions.f0
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r0.intValue() == 0);
                return valueOf;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.promotions.f
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.this.x((Integer) obj);
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.promotions.m
            @Override // rx.m.e
            public final Object call(Object obj) {
                return ClaimPromotionDialogPresenter.this.y((Integer) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.promotions.q
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.lambda$handleWalletVerificationResult$13((String) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.promotions.g0
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.this.z((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$claimPromotion$33, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single b(ClaimStatusWrapper claimStatusWrapper) {
        if (claimStatusWrapper.getStatus().equals(ClaimStatusWrapper.Status.OK)) {
            this.view.showClaimSuccess();
            return Single.m(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION);
        }
        return Single.m(handleErrors(claimStatusWrapper.getErrors()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleContinueClick$29, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void c(ClaimPromotionsClickWrapper claimPromotionsClickWrapper) {
        this.promotionsAnalytics.sendClickOnWalletDialogNext(claimPromotionsClickWrapper.getPackageName());
        this.claimPromotionsManager.saveWalletAddress(claimPromotionsClickWrapper.getWalletAddress());
        this.view.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleContinueClick$30, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single d(ClaimPromotionsClickWrapper claimPromotionsClickWrapper) {
        return claimPromotion();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleContinueClick$31(String str) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleContinueClick$32(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDismissGenericError$37, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void e(Void r1) {
        this.view.dismissDialog();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleDismissGenericError$38(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDismissGenericError$39, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void f(Throwable th) {
        this.view.showGenericError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDismissGenericMessage$43, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void g(ClaimDialogResultWrapper claimDialogResultWrapper) {
        this.navigator.popDialogWithResult(claimDialogResultWrapper.getPackageName(), claimDialogResultWrapper.isOk() ? -1 : 0);
        this.view.dismissDialog();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleDismissGenericMessage$44(ClaimDialogResultWrapper claimDialogResultWrapper) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDismissGenericMessage$45, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void h(Throwable th) {
        this.view.showGenericError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFindAddressClick$24, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void i(String str) {
        this.promotionsAnalytics.sendClickOnWalletDialogFindWallet(str);
        this.view.fetchWalletAddressByIntent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFindAddressClick$25, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void j(Throwable th) {
        this.shouldSendIntent = false;
        this.view.sendWalletIntent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFindAddressClick$26, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e k(View.LifecycleEvent lifecycleEvent) {
        return this.view.getWalletClick().x(new rx.m.b() { // from class: cm.aptoide.pt.promotions.p0
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.this.i((String) obj);
            }
        }).w(new rx.m.b() { // from class: cm.aptoide.pt.promotions.r
            @Override // rx.m.b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.this.j((Throwable) obj);
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleFindAddressClick$27(String str) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleFindAddressClick$28(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOnEditTextChanged$34, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void l(e.g.a.d.b bVar) {
        this.view.handleEmptyEditText(bVar.c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleOnEditTextChanged$35(e.g.a.d.b bVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOnEditTextChanged$36, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m(Throwable th) {
        this.view.showGenericError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOnResumeEvent$16, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void n(View.LifecycleEvent lifecycleEvent) {
        if (this.shouldSendIntent) {
            return;
        }
        this.view.fetchWalletAddressByClipboard();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleOnResumeEvent$17(View.LifecycleEvent lifecycleEvent) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleOnResumeEvent$18(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUpdateWallet$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e o(View.LifecycleEvent lifecycleEvent) {
        return this.view.onUpdateWalletClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUpdateWallet$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void p(Void r1) {
        this.navigator.navigateToWalletAppView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUpdateWallet$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void q(Void r1) {
        this.view.dismissDialog();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleUpdateWallet$4(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUpdateWalletCancelClick$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e r(View.LifecycleEvent lifecycleEvent) {
        return this.view.onCancelWalletUpdate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUpdateWalletCancelClick$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void s(Void r1) {
        this.view.dismissDialog();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleUpdateWalletCancelClick$8(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleWalletCancelClick$40, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void t(String str) {
        this.promotionsAnalytics.sendClickOnWalletDialogCancel(str);
        this.navigator.popDialogWithResult(str, 0);
        this.view.dismissDialog();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleWalletCancelClick$41(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleWalletCancelClick$42, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void u(Throwable th) {
        this.view.showGenericError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleWalletPermissionsResult$20, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void v(Result result) {
        if (result.getResultCode() == -1) {
            Intent data = result.getData();
            if (data != null && data.getExtras() != null) {
                this.view.updateWalletText(data.getExtras().getString(WALLET_ADDRESS));
                return;
            } else {
                this.shouldSendIntent = false;
                this.view.sendWalletIntent();
                return;
            }
        }
        if (result.getResultCode() != 0) {
            this.shouldSendIntent = false;
            this.view.sendWalletIntent();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleWalletPermissionsResult$21(Result result) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleWalletPermissionsResult$22, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void w(Throwable th) {
        this.shouldSendIntent = false;
        this.view.sendWalletIntent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleWalletVerificationResult$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void x(Integer num) {
        this.view.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleWalletVerificationResult$12, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single y(Integer num) {
        return claimPromotion();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleWalletVerificationResult$13(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleWalletVerificationResult$14, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void z(Throwable th) {
        if (th instanceof ActivityNotFoundException) {
            this.view.showUpdateWalletDialog();
        }
        th.printStackTrace();
    }

    public void dispose() {
        this.subscriptions.b();
    }

    @Override // cm.aptoide.pt.presenter.Presenter
    public void present() {
        handleOnResumeEvent();
        handleWalletPermissionsResult();
        handleFindAddressClick();
        handleContinueClick();
        handleOnEditTextChanged();
        handleDismissGenericError();
        handleWalletCancelClick();
        handleDismissGenericMessage();
        handleWalletVerificationResult();
        handleUpdateWalletCancelClick();
        handleUpdateWallet();
    }
}
