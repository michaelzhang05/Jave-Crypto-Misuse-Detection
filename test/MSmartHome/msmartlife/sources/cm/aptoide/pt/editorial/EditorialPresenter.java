package cm.aptoide.pt.editorial;

import cm.aptoide.aptoideviews.socialmedia.SocialMediaView;
import cm.aptoide.pt.UserFeedbackAnalytics;
import cm.aptoide.pt.actions.PermissionManager;
import cm.aptoide.pt.actions.PermissionService;
import cm.aptoide.pt.ads.MoPubAdsManager;
import cm.aptoide.pt.ads.WalletAdsOfferManager;
import cm.aptoide.pt.app.DownloadModel;
import cm.aptoide.pt.crashreports.CrashReport;
import cm.aptoide.pt.download.view.outofspace.OutOfSpaceNavigatorWrapper;
import cm.aptoide.pt.presenter.Presenter;
import cm.aptoide.pt.presenter.View;
import cm.aptoide.pt.reactions.ReactionEvent;
import cm.aptoide.pt.reactions.network.LoadReactionModel;
import cm.aptoide.pt.reactions.network.ReactionsResponse;
import cm.aptoide.pt.socialmedia.SocialMediaAnalytics;
import rx.Single;
import rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class EditorialPresenter implements Presenter {
    private final CrashReport crashReporter;
    private final EditorialAnalytics editorialAnalytics;
    private final EditorialManager editorialManager;
    private final EditorialNavigator editorialNavigator;
    private final MoPubAdsManager moPubAdsManager;
    private final PermissionManager permissionManager;
    private final PermissionService permissionService;
    private final SocialMediaAnalytics socialMediaAnalytics;
    private final UserFeedbackAnalytics userFeedbackAnalytics;
    private final EditorialView view;
    private final rx.h viewScheduler;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cm.aptoide.pt.editorial.EditorialPresenter$1, reason: invalid class name */
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
        }
    }

    public EditorialPresenter(EditorialView editorialView, EditorialManager editorialManager, rx.h hVar, CrashReport crashReport, PermissionManager permissionManager, PermissionService permissionService, EditorialAnalytics editorialAnalytics, EditorialNavigator editorialNavigator, UserFeedbackAnalytics userFeedbackAnalytics, MoPubAdsManager moPubAdsManager, SocialMediaAnalytics socialMediaAnalytics) {
        this.view = editorialView;
        this.editorialManager = editorialManager;
        this.viewScheduler = hVar;
        this.crashReporter = crashReport;
        this.permissionManager = permissionManager;
        this.permissionService = permissionService;
        this.editorialAnalytics = editorialAnalytics;
        this.editorialNavigator = editorialNavigator;
        this.userFeedbackAnalytics = userFeedbackAnalytics;
        this.moPubAdsManager = moPubAdsManager;
        this.socialMediaAnalytics = socialMediaAnalytics;
    }

    private void cancelDownload() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.editorial.y3
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.k5
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.a((View.LifecycleEvent) obj);
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.t4
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.d((EditorialViewModel) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.editorial.m0
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.lambda$cancelDownload$52((EditorialDownloadEvent) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.editorial.z2
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.lambda$cancelDownload$53((Throwable) obj);
            }
        });
    }

    private rx.b downgradeApp(final EditorialDownloadEvent editorialDownloadEvent) {
        return this.view.showDowngradeMessage().D(new rx.m.e() { // from class: cm.aptoide.pt.editorial.w0
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean bool = (Boolean) obj;
                EditorialPresenter.lambda$downgradeApp$115(bool);
                return bool;
            }
        }).H(new rx.m.e() { // from class: cm.aptoide.pt.editorial.n2
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.e(editorialDownloadEvent, (Boolean) obj);
            }
        }).X0();
    }

    private rx.b downloadApp(final EditorialDownloadEvent editorialDownloadEvent) {
        return rx.e.p(new rx.m.d() { // from class: cm.aptoide.pt.editorial.r4
            @Override // rx.m.d, java.util.concurrent.Callable
            public final Object call() {
                return EditorialPresenter.this.f(editorialDownloadEvent);
            }
        }).j0(this.viewScheduler).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.v2
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.g((EditorialDownloadEvent) obj);
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.u2
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.h((Void) obj);
            }
        }).j0(Schedulers.io()).H(new rx.m.e() { // from class: cm.aptoide.pt.editorial.l3
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.i(editorialDownloadEvent, (Void) obj);
            }
        }).X0();
    }

    private void handleInstallClick() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.editorial.r2
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.g2
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.p((View.LifecycleEvent) obj);
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.i2
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.x((EditorialViewModel) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.editorial.g4
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handleInstallClick$45((EditorialDownloadEvent) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.editorial.l2
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handleInstallClick$46((Throwable) obj);
                throw null;
            }
        });
    }

    private void handleOutOfSpaceDialogResult() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.editorial.h5
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.c2
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.G((View.LifecycleEvent) obj);
            }
        }).D(new rx.m.e() { // from class: cm.aptoide.pt.editorial.d5
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((OutOfSpaceNavigatorWrapper) obj).getClearedSuccessfully());
                return valueOf;
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.editorial.j5
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.H((OutOfSpaceNavigatorWrapper) obj);
            }
        }).H(new rx.m.e() { // from class: cm.aptoide.pt.editorial.g5
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.I((EditorialViewModel) obj);
            }
        }).s0().f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.editorial.w3
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handleOutOfSpaceDialogResult$5((EditorialViewModel) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.editorial.q2
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.this.J((Throwable) obj);
            }
        });
    }

    private void handleReactionsResponse(ReactionsResponse reactionsResponse, boolean z) {
        if (reactionsResponse.wasSuccess()) {
            if (z) {
                this.editorialAnalytics.sendDeletedEvent();
                return;
            } else {
                this.editorialAnalytics.sendReactedEvent();
                return;
            }
        }
        if (reactionsResponse.reactionsExceeded()) {
            this.view.showLoginDialog();
        } else if (reactionsResponse.wasNetworkError()) {
            this.view.showNetworkErrorToast();
        } else if (reactionsResponse.wasGeneralError()) {
            this.view.showGenericErrorToast();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleSinglePressReactionButton, reason: merged with bridge method [inline-methods] */
    public rx.e<LoadReactionModel> S(final EditorialViewModel editorialViewModel) {
        return this.editorialManager.isFirstReaction(editorialViewModel.getCardId(), editorialViewModel.getGroupId()).k(new rx.m.e() { // from class: cm.aptoide.pt.editorial.m1
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.Z(editorialViewModel, (Boolean) obj);
            }
        });
    }

    private void handleSocialMediaPromotionClick() {
        rx.e f2 = this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.editorial.u1
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.w1
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.c0((View.LifecycleEvent) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.editorial.e5
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.this.d0((SocialMediaView.SocialMediaType) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        k2 k2Var = new rx.m.b() { // from class: cm.aptoide.pt.editorial.k2
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handleSocialMediaPromotionClick$10((SocialMediaView.SocialMediaType) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        f2.H0(k2Var, new b(crashReport));
    }

    private boolean isOnlyOneMediaVisible(int i2, int i3) {
        return i2 == i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cancelDownload$48, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e a(View.LifecycleEvent lifecycleEvent) {
        return setUpViewModelOnViewReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cancelDownload$49, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void b(EditorialDownloadEvent editorialDownloadEvent) {
        this.editorialAnalytics.sendDownloadCancelEvent(editorialDownloadEvent.getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cancelDownload$50, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b c(EditorialDownloadEvent editorialDownloadEvent) {
        return this.editorialManager.cancelDownload(editorialDownloadEvent.getMd5(), editorialDownloadEvent.getPackageName(), editorialDownloadEvent.getVerCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cancelDownload$51, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e d(EditorialViewModel editorialViewModel) {
        return this.view.cancelDownload(editorialViewModel).x(new rx.m.b() { // from class: cm.aptoide.pt.editorial.m4
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.this.b((EditorialDownloadEvent) obj);
            }
        }).H(new rx.m.e() { // from class: cm.aptoide.pt.editorial.w5
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.c((EditorialDownloadEvent) obj);
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$cancelDownload$52(EditorialDownloadEvent editorialDownloadEvent) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$cancelDownload$53(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Boolean lambda$downgradeApp$115(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downgradeApp$116, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b e(EditorialDownloadEvent editorialDownloadEvent, Boolean bool) {
        return downloadApp(editorialDownloadEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ EditorialDownloadEvent lambda$downloadApp$69(EditorialDownloadEvent editorialDownloadEvent, Boolean bool) {
        return editorialDownloadEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$70, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e f(final EditorialDownloadEvent editorialDownloadEvent) {
        if (this.editorialManager.shouldShowRootInstallWarningPopup()) {
            rx.e<Boolean> showRootInstallWarningPopup = this.view.showRootInstallWarningPopup();
            final EditorialManager editorialManager = this.editorialManager;
            editorialManager.getClass();
            return showRootInstallWarningPopup.x(new rx.m.b() { // from class: cm.aptoide.pt.editorial.p6
                @Override // rx.m.b
                public final void call(Object obj) {
                    EditorialManager.this.allowRootInstall((Boolean) obj);
                }
            }).X(new rx.m.e() { // from class: cm.aptoide.pt.editorial.w4
                @Override // rx.m.e
                public final Object call(Object obj) {
                    EditorialDownloadEvent editorialDownloadEvent2 = EditorialDownloadEvent.this;
                    EditorialPresenter.lambda$downloadApp$69(editorialDownloadEvent2, (Boolean) obj);
                    return editorialDownloadEvent2;
                }
            });
        }
        return rx.e.S(editorialDownloadEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$71, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e g(EditorialDownloadEvent editorialDownloadEvent) {
        return this.permissionManager.requestDownloadAccess(this.permissionService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$72, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e h(Void r2) {
        return this.permissionManager.requestExternalStoragePermission(this.permissionService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$73, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b i(EditorialDownloadEvent editorialDownloadEvent, Void r2) {
        return this.editorialManager.downloadApp(editorialDownloadEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickActionButtonCard$31, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e j(View.LifecycleEvent lifecycleEvent) {
        return this.view.actionButtonClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickActionButtonCard$32, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void k(EditorialEvent editorialEvent) {
        this.editorialNavigator.navigateToUri(editorialEvent.getUrl());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleClickActionButtonCard$33(EditorialEvent editorialEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnAppCard$27, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e l(View.LifecycleEvent lifecycleEvent) {
        return setUpViewModelOnViewReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnAppCard$28, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m(EditorialEvent editorialEvent) {
        this.editorialNavigator.navigateToAppView(editorialEvent.getId(), editorialEvent.getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleClickOnAppCard$29(EditorialEvent editorialEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnMedia$23, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e n(View.LifecycleEvent lifecycleEvent) {
        return this.view.mediaContentClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnMedia$24, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void o(EditorialEvent editorialEvent) {
        this.editorialNavigator.navigateToUri(editorialEvent.getUrl());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleClickOnMedia$25(EditorialEvent editorialEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallClick$35, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e p(View.LifecycleEvent lifecycleEvent) {
        return setUpViewModelOnViewReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallClick$36, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void q(EditorialDownloadEvent editorialDownloadEvent, DownloadModel.Action action, EditorialViewModel editorialViewModel) {
        this.editorialAnalytics.clickOnInstallButton(editorialDownloadEvent.getPackageName(), action.toString(), editorialViewModel.hasSplits(), editorialViewModel.hasAppc(), false, editorialViewModel.getRank(), null, editorialViewModel.getStoreName(), editorialViewModel.getBottomCardObb() != null, editorialDownloadEvent.getBdsFlags());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallClick$37, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b r(final EditorialDownloadEvent editorialDownloadEvent, final DownloadModel.Action action, final EditorialViewModel editorialViewModel) {
        return downloadApp(editorialDownloadEvent).a(this.editorialManager.convertCampaign(editorialDownloadEvent)).z(this.viewScheduler).m(new rx.m.a() { // from class: cm.aptoide.pt.editorial.m5
            @Override // rx.m.a
            public final void call() {
                EditorialPresenter.this.q(editorialDownloadEvent, action, editorialViewModel);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallClick$38, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void s(EditorialDownloadEvent editorialDownloadEvent, DownloadModel.Action action, EditorialViewModel editorialViewModel) {
        this.editorialAnalytics.clickOnInstallButton(editorialDownloadEvent.getPackageName(), action.toString(), editorialViewModel.hasSplits(), editorialViewModel.hasAppc(), false, editorialViewModel.getRank(), null, editorialViewModel.getStoreName(), editorialViewModel.getBottomCardObb() != null, editorialDownloadEvent.getBdsFlags());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallClick$39, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b t(final EditorialDownloadEvent editorialDownloadEvent, final DownloadModel.Action action, final EditorialViewModel editorialViewModel) {
        return openInstalledApp(editorialDownloadEvent.getPackageName()).m(new rx.m.a() { // from class: cm.aptoide.pt.editorial.s5
            @Override // rx.m.a
            public final void call() {
                EditorialPresenter.this.s(editorialDownloadEvent, action, editorialViewModel);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallClick$40, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void u(EditorialDownloadEvent editorialDownloadEvent, DownloadModel.Action action, EditorialViewModel editorialViewModel) {
        this.editorialAnalytics.clickOnInstallButton(editorialDownloadEvent.getPackageName(), action.toString(), editorialViewModel.hasSplits(), editorialViewModel.hasAppc(), false, editorialViewModel.getRank(), null, editorialViewModel.getStoreName(), editorialViewModel.getBottomCardObb() != null, editorialDownloadEvent.getBdsFlags());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallClick$41, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b v(final EditorialDownloadEvent editorialDownloadEvent, final DownloadModel.Action action, final EditorialViewModel editorialViewModel) {
        return downgradeApp(editorialDownloadEvent).a(this.editorialManager.convertCampaign(editorialDownloadEvent)).m(new rx.m.a() { // from class: cm.aptoide.pt.editorial.g3
            @Override // rx.m.a
            public final void call() {
                EditorialPresenter.this.u(editorialDownloadEvent, action, editorialViewModel);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallClick$42, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b w(final EditorialDownloadEvent editorialDownloadEvent) {
        final DownloadModel.Action action = editorialDownloadEvent.getAction();
        int i2 = AnonymousClass1.$SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[action.ordinal()];
        if (i2 == 1 || i2 == 2) {
            return this.editorialManager.loadEditorialViewModel().j(new rx.m.e() { // from class: cm.aptoide.pt.editorial.v1
                @Override // rx.m.e
                public final Object call(Object obj) {
                    return EditorialPresenter.this.r(editorialDownloadEvent, action, (EditorialViewModel) obj);
                }
            });
        }
        if (i2 == 3) {
            return this.editorialManager.loadEditorialViewModel().p(this.viewScheduler).j(new rx.m.e() { // from class: cm.aptoide.pt.editorial.d1
                @Override // rx.m.e
                public final Object call(Object obj) {
                    return EditorialPresenter.this.t(editorialDownloadEvent, action, (EditorialViewModel) obj);
                }
            });
        }
        if (i2 != 4) {
            return null;
        }
        return this.editorialManager.loadEditorialViewModel().p(this.viewScheduler).j(new rx.m.e() { // from class: cm.aptoide.pt.editorial.q1
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.v(editorialDownloadEvent, action, (EditorialViewModel) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallClick$44, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e x(EditorialViewModel editorialViewModel) {
        return this.view.installButtonClick(editorialViewModel).H(new rx.m.e() { // from class: cm.aptoide.pt.editorial.j1
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.w((EditorialDownloadEvent) obj);
            }
        }).w(new rx.m.b() { // from class: cm.aptoide.pt.editorial.e3
            @Override // rx.m.b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleInstallClick$45(EditorialDownloadEvent editorialDownloadEvent) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleInstallClick$46(Throwable th) {
        throw new IllegalStateException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleLongPressReactionButton$132, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e y(View.LifecycleEvent lifecycleEvent) {
        return this.view.reactionsButtonLongPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleLongPressReactionButton$133, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e z(Void r1) {
        return this.editorialManager.loadEditorialViewModel().A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleLongPressReactionButton$134, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void A(EditorialViewModel editorialViewModel) {
        this.editorialAnalytics.sendReactionButtonClickEvent();
        this.view.showReactionsPopup(editorialViewModel.getCardId(), editorialViewModel.getGroupId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleLongPressReactionButton$135(EditorialViewModel editorialViewModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleMediaListDescriptionVisibility$102, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e B(View.LifecycleEvent lifecycleEvent) {
        return this.view.mediaListDescriptionChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleMediaListDescriptionVisibility$104, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void C(EditorialEvent editorialEvent) {
        if (isOnlyOneMediaVisible(editorialEvent.getFirstVisiblePosition(), editorialEvent.getLastVisibleItemPosition())) {
            this.view.manageMediaListDescriptionAnimationVisibility(editorialEvent);
        } else {
            this.view.setMediaListDescriptionsVisible(editorialEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleMediaListDescriptionVisibility$105(EditorialEvent editorialEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleMovingCollapse$107, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e D(View.LifecycleEvent lifecycleEvent) {
        return this.view.handleMovingCollapse();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleMovingCollapse$108, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void E(Boolean bool) {
        if (bool.booleanValue()) {
            this.view.removeBottomCardAnimation();
        } else {
            this.view.addBottomCardAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleMovingCollapse$109(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleMovingCollapse$110, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void F(Throwable th) {
        this.crashReporter.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOutOfSpaceDialogResult$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e G(View.LifecycleEvent lifecycleEvent) {
        return this.editorialNavigator.outOfSpaceDialogResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOutOfSpaceDialogResult$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single H(OutOfSpaceNavigatorWrapper outOfSpaceNavigatorWrapper) {
        return this.editorialManager.loadEditorialViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOutOfSpaceDialogResult$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b I(EditorialViewModel editorialViewModel) {
        return this.editorialManager.resumeDownload(editorialViewModel.getBottomCardMd5(), editorialViewModel.getBottomCardPackageName(), editorialViewModel.getBottomCardAppId(), this.view.getAction(), editorialViewModel.getBdsFlags());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleOutOfSpaceDialogResult$5(EditorialViewModel editorialViewModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOutOfSpaceDialogResult$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void J(Throwable th) {
        this.crashReporter.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePlaceHolderVisibility$91, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e K(View.LifecycleEvent lifecycleEvent) {
        return this.view.isViewReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePlaceHolderVisibility$92, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void L(Void r1) {
        this.view.managePlaceHolderVisibity();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handlePlaceHolderVisibility$93(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePlaceHolderVisibility$94, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void M(Throwable th) {
        this.crashReporter.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePlaceHolderVisibilityChange$100, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void N(Throwable th) {
        this.crashReporter.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePlaceHolderVisibilityChange$97, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e O(View.LifecycleEvent lifecycleEvent) {
        return this.view.placeHolderVisibilityChange();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePlaceHolderVisibilityChange$98, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void P(ScrollEvent scrollEvent) {
        if (scrollEvent.getItemShown().booleanValue()) {
            this.view.removeBottomCardAnimation();
        } else {
            if (scrollEvent.getItemShown().booleanValue()) {
                return;
            }
            this.view.addBottomCardAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handlePlaceHolderVisibilityChange$99(ScrollEvent scrollEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleReactionButtonClick$119, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e Q(View.LifecycleEvent lifecycleEvent) {
        return this.view.reactionsButtonClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleReactionButtonClick$120, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single R(Void r1) {
        return this.editorialManager.loadEditorialViewModel();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleReactionButtonClick$122(LoadReactionModel loadReactionModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleReactionButtonClick$123, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void T(Throwable th) {
        this.crashReporter.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRetryClick$18, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void U(Void r1) {
        this.view.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRetryClick$19, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single V(Void r1) {
        return loadEditorialViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRetryClick$20, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e W(View.LifecycleEvent lifecycleEvent) {
        return this.view.retryClicked().j0(this.viewScheduler).x(new rx.m.b() { // from class: cm.aptoide.pt.editorial.l1
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.this.U((Void) obj);
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.editorial.z4
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.V((Void) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleRetryClick$21(EditorialViewModel editorialViewModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSinglePressReactionButton$111, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void X(ReactionsResponse reactionsResponse) {
        handleReactionsResponse(reactionsResponse, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSinglePressReactionButton$112, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single Y(EditorialViewModel editorialViewModel, ReactionsResponse reactionsResponse) {
        return loadReactionModel(editorialViewModel.getCardId(), editorialViewModel.getGroupId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSinglePressReactionButton$113, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e Z(final EditorialViewModel editorialViewModel, Boolean bool) {
        if (bool.booleanValue()) {
            this.editorialAnalytics.sendReactionButtonClickEvent();
            this.view.showReactionsPopup(editorialViewModel.getCardId(), editorialViewModel.getGroupId());
            return rx.e.S(new LoadReactionModel());
        }
        return this.editorialManager.deleteReaction(editorialViewModel.getCardId(), editorialViewModel.getGroupId()).A().x(new rx.m.b() { // from class: cm.aptoide.pt.editorial.o0
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.this.X((ReactionsResponse) obj);
            }
        }).D(r6.f4861f).L(new rx.m.e() { // from class: cm.aptoide.pt.editorial.z3
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.Y(editorialViewModel, (ReactionsResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSnackLogInClick$137, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e a0(View.LifecycleEvent lifecycleEvent) {
        return this.view.snackLoginClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSnackLogInClick$138, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void b0(Void r1) {
        this.editorialNavigator.navigateToLogIn();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleSnackLogInClick$139(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleSocialMediaPromotionClick$10(SocialMediaView.SocialMediaType socialMediaType) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSocialMediaPromotionClick$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e c0(View.LifecycleEvent lifecycleEvent) {
        return this.view.socialMediaClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSocialMediaPromotionClick$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void d0(SocialMediaView.SocialMediaType socialMediaType) {
        this.editorialNavigator.navigateToSocialMedia(socialMediaType);
        this.socialMediaAnalytics.sendPromoteSocialMediaClickEvent(socialMediaType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUserReaction$125, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e e0(View.LifecycleEvent lifecycleEvent) {
        return this.view.reactionClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUserReaction$126, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void f0(ReactionEvent reactionEvent) {
        this.userFeedbackAnalytics.sendReactionEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUserReaction$127, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void g0(ReactionsResponse reactionsResponse) {
        handleReactionsResponse(reactionsResponse, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUserReaction$128, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single h0(ReactionEvent reactionEvent, ReactionsResponse reactionsResponse) {
        return loadReactionModel(reactionEvent.getCardId(), reactionEvent.getGroupId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUserReaction$129, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e i0(final ReactionEvent reactionEvent) {
        return this.editorialManager.setReaction(reactionEvent.getCardId(), reactionEvent.getGroupId(), reactionEvent.getReactionType()).A().D(new rx.m.e() { // from class: cm.aptoide.pt.editorial.m6
            @Override // rx.m.e
            public final Object call(Object obj) {
                return Boolean.valueOf(((ReactionsResponse) obj).differentReaction());
            }
        }).j0(this.viewScheduler).x(new rx.m.b() { // from class: cm.aptoide.pt.editorial.u3
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.this.g0((ReactionsResponse) obj);
            }
        }).D(r6.f4861f).L(new rx.m.e() { // from class: cm.aptoide.pt.editorial.e4
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.h0(reactionEvent, (ReactionsResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleUserReaction$130(LoadReactionModel loadReactionModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadDownloadApp$75, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e j0(View.LifecycleEvent lifecycleEvent) {
        return this.view.isViewReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadDownloadApp$76, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e k0(Void r1) {
        return this.editorialManager.loadEditorialViewModel().A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadDownloadApp$78, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e l0(EditorialContent editorialContent) {
        rx.e<EditorialDownloadModel> j0 = this.editorialManager.loadDownloadModel(editorialContent.getMd5sum(), editorialContent.getPackageName(), editorialContent.getVerCode(), editorialContent.getPosition()).j0(this.viewScheduler);
        final EditorialView editorialView = this.view;
        editorialView.getClass();
        return j0.x(new rx.m.b() { // from class: cm.aptoide.pt.editorial.q6
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialView.this.showDownloadModel((EditorialDownloadModel) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$loadDownloadApp$79(EditorialDownloadModel editorialDownloadModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadEditorialViewModel$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m0(EditorialViewModel editorialViewModel) {
        if (!editorialViewModel.isLoading()) {
            this.view.hideLoading();
        }
        if (editorialViewModel.hasError()) {
            this.view.showError(editorialViewModel.getError());
        } else {
            this.view.populateView(editorialViewModel);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ EditorialViewModel lambda$loadEditorialViewModel$16(EditorialViewModel editorialViewModel) {
        return editorialViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadReactionModel$114, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void n0(LoadReactionModel loadReactionModel) {
        this.view.showTopReactions(loadReactionModel.getMyReaction(), loadReactionModel.getTopReactionList(), loadReactionModel.getTotal());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observeDownloadErrors$81, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e o0(View.LifecycleEvent lifecycleEvent) {
        return setUpViewModelOnViewReady();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ EditorialViewModel lambda$observeDownloadErrors$82(EditorialViewModel editorialViewModel, EditorialDownloadEvent editorialDownloadEvent) {
        return editorialViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observeDownloadErrors$83, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e p0(final EditorialViewModel editorialViewModel) {
        return rx.e.a0(this.view.installButtonClick(editorialViewModel), this.view.resumeDownload(editorialViewModel)).X(new rx.m.e() { // from class: cm.aptoide.pt.editorial.r5
            @Override // rx.m.e
            public final Object call(Object obj) {
                EditorialViewModel editorialViewModel2 = EditorialViewModel.this;
                EditorialPresenter.lambda$observeDownloadErrors$82(editorialViewModel2, (EditorialDownloadEvent) obj);
                return editorialViewModel2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observeDownloadErrors$85, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void r0(EditorialContent editorialContent, EditorialDownloadModel editorialDownloadModel) {
        if (editorialDownloadModel.getDownloadState().equals(DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR)) {
            this.editorialNavigator.navigateToOutOfSpaceDialog(editorialContent.getSize(), editorialContent.getPackageName());
        } else {
            this.view.showDownloadError(editorialDownloadModel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observeDownloadErrors$86, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e s0(final EditorialContent editorialContent) {
        return this.editorialManager.loadDownloadModel(editorialContent.getMd5sum(), editorialContent.getPackageName(), editorialContent.getVerCode(), editorialContent.getPosition()).D(new rx.m.e() { // from class: cm.aptoide.pt.editorial.t6
            @Override // rx.m.e
            public final Object call(Object obj) {
                return Boolean.valueOf(((EditorialDownloadModel) obj).hasError());
            }
        }).E().G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.p0
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.q0(editorialContent, (EditorialDownloadModel) obj);
            }
        }).j0(this.viewScheduler).x(new rx.m.b() { // from class: cm.aptoide.pt.editorial.t5
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.this.r0(editorialContent, (EditorialDownloadModel) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$observeDownloadErrors$87(EditorialDownloadModel editorialDownloadModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateLoadAppOfTheWeek$12, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void t0(View.LifecycleEvent lifecycleEvent) {
        this.view.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateLoadAppOfTheWeek$13, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single u0(View.LifecycleEvent lifecycleEvent) {
        return loadEditorialViewModel();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$onCreateLoadAppOfTheWeek$14(EditorialViewModel editorialViewModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateLoadReactionModel$141, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e v0(View.LifecycleEvent lifecycleEvent) {
        return setUpViewModelOnViewReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateLoadReactionModel$142, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single w0(EditorialViewModel editorialViewModel) {
        return loadReactionModel(editorialViewModel.getCardId(), editorialViewModel.getGroupId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$onCreateLoadReactionModel$143(LoadReactionModel loadReactionModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$openInstalledApp$95, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void x0(String str) {
        this.view.openApp(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$pauseDownload$63, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e y0(View.LifecycleEvent lifecycleEvent) {
        return setUpViewModelOnViewReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$pauseDownload$64, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void z0(EditorialDownloadEvent editorialDownloadEvent) {
        this.editorialAnalytics.sendDownloadPauseEvent(editorialDownloadEvent.getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$pauseDownload$65, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b A0(EditorialDownloadEvent editorialDownloadEvent) {
        return this.editorialManager.pauseDownload(editorialDownloadEvent.getMd5());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$pauseDownload$66, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e B0(EditorialViewModel editorialViewModel) {
        return this.view.pauseDownload(editorialViewModel).x(new rx.m.b() { // from class: cm.aptoide.pt.editorial.z1
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.this.z0((EditorialDownloadEvent) obj);
            }
        }).H(new rx.m.e() { // from class: cm.aptoide.pt.editorial.e1
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.A0((EditorialDownloadEvent) obj);
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$pauseDownload$67(EditorialDownloadEvent editorialDownloadEvent) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$pauseDownload$68(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$55, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e C0(View.LifecycleEvent lifecycleEvent) {
        return setUpViewModelOnViewReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$56, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e D0(Void r2) {
        return this.permissionManager.requestExternalStoragePermission(this.permissionService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$57, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b E0(EditorialDownloadEvent editorialDownloadEvent, Void r9) {
        return this.editorialManager.resumeDownload(editorialDownloadEvent.getMd5(), editorialDownloadEvent.getPackageName(), editorialDownloadEvent.getAppId(), editorialDownloadEvent.getAction().toString(), editorialDownloadEvent.getBdsFlags());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$58, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e F0(final EditorialDownloadEvent editorialDownloadEvent) {
        return this.permissionManager.requestDownloadAccess(this.permissionService).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.g1
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.D0((Void) obj);
            }
        }).H(new rx.m.e() { // from class: cm.aptoide.pt.editorial.p4
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.E0(editorialDownloadEvent, (Void) obj);
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$59, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e G0(EditorialViewModel editorialViewModel) {
        return this.view.resumeDownload(editorialViewModel).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.h4
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.F0((EditorialDownloadEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$resumeDownload$60(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$resumeDownload$61(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setUpViewModelOnViewReady$117, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e H0(Void r1) {
        return this.editorialManager.loadEditorialViewModel().A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$verifyNotEnoughSpaceError$88, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void I0(EditorialContent editorialContent, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        this.editorialAnalytics.sendNotEnoughSpaceErrorEvent(editorialContent.getMd5sum());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ EditorialDownloadModel lambda$verifyNotEnoughSpaceError$89(EditorialDownloadModel editorialDownloadModel, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        return editorialDownloadModel;
    }

    private Single<EditorialViewModel> loadEditorialViewModel() {
        return this.editorialManager.loadEditorialViewModel().p(this.viewScheduler).g(new rx.m.b() { // from class: cm.aptoide.pt.editorial.y0
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.this.m0((EditorialViewModel) obj);
            }
        }).n(new rx.m.e() { // from class: cm.aptoide.pt.editorial.o5
            @Override // rx.m.e
            public final Object call(Object obj) {
                EditorialViewModel editorialViewModel = (EditorialViewModel) obj;
                EditorialPresenter.lambda$loadEditorialViewModel$16(editorialViewModel);
                return editorialViewModel;
            }
        });
    }

    private Single<LoadReactionModel> loadReactionModel(String str, String str2) {
        return this.editorialManager.loadReactionModel(str, str2).p(this.viewScheduler).g(new rx.m.b() { // from class: cm.aptoide.pt.editorial.k1
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.this.n0((LoadReactionModel) obj);
            }
        });
    }

    private rx.b openInstalledApp(final String str) {
        return rx.b.t(new rx.m.a() { // from class: cm.aptoide.pt.editorial.o3
            @Override // rx.m.a
            public final void call() {
                EditorialPresenter.this.x0(str);
            }
        });
    }

    private void pauseDownload() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.editorial.k3
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.b2
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.y0((View.LifecycleEvent) obj);
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.c1
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.B0((EditorialViewModel) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.editorial.a3
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.lambda$pauseDownload$67((EditorialDownloadEvent) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.editorial.p1
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.lambda$pauseDownload$68((Throwable) obj);
            }
        });
    }

    private void resumeDownload() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.editorial.m2
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.c3
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.C0((View.LifecycleEvent) obj);
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.x2
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.G0((EditorialViewModel) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.editorial.x3
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.lambda$resumeDownload$60((Void) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.editorial.o2
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.lambda$resumeDownload$61((Throwable) obj);
            }
        });
    }

    private rx.e<EditorialViewModel> setUpViewModelOnViewReady() {
        return this.view.isViewReady().G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.u5
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.H0((Void) obj);
            }
        }).j0(this.viewScheduler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: verifyNotEnoughSpaceError, reason: merged with bridge method [inline-methods] */
    public rx.e<EditorialDownloadModel> q0(final EditorialContent editorialContent, final EditorialDownloadModel editorialDownloadModel) {
        if (editorialDownloadModel.getDownloadState() == DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR) {
            return this.moPubAdsManager.getAdsVisibilityStatus().g(new rx.m.b() { // from class: cm.aptoide.pt.editorial.i5
                @Override // rx.m.b
                public final void call(Object obj) {
                    EditorialPresenter.this.I0(editorialContent, (WalletAdsOfferManager.OfferResponseStatus) obj);
                }
            }).A().X(new rx.m.e() { // from class: cm.aptoide.pt.editorial.q5
                @Override // rx.m.e
                public final Object call(Object obj) {
                    EditorialDownloadModel editorialDownloadModel2 = EditorialDownloadModel.this;
                    EditorialPresenter.lambda$verifyNotEnoughSpaceError$89(editorialDownloadModel2, (WalletAdsOfferManager.OfferResponseStatus) obj);
                    return editorialDownloadModel2;
                }
            });
        }
        return rx.e.S(editorialDownloadModel);
    }

    public void handleClickActionButtonCard() {
        rx.e f2 = this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.editorial.r1
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.r3
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.j((View.LifecycleEvent) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.editorial.c4
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.this.k((EditorialEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        b1 b1Var = new rx.m.b() { // from class: cm.aptoide.pt.editorial.b1
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handleClickActionButtonCard$33((EditorialEvent) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        f2.H0(b1Var, new b(crashReport));
    }

    public void handleClickOnAppCard() {
        rx.e<R> G = this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.editorial.s0
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.v0
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.l((View.LifecycleEvent) obj);
            }
        });
        final EditorialView editorialView = this.view;
        editorialView.getClass();
        rx.e f2 = G.G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.s6
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialView.this.appCardClicked((EditorialViewModel) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.editorial.c5
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.this.m((EditorialEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        n3 n3Var = new rx.m.b() { // from class: cm.aptoide.pt.editorial.n3
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handleClickOnAppCard$29((EditorialEvent) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        f2.H0(n3Var, new b(crashReport));
    }

    public void handleClickOnMedia() {
        rx.e f2 = this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.editorial.f5
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.l4
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.n((View.LifecycleEvent) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.editorial.m3
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.this.o((EditorialEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        x0 x0Var = new rx.m.b() { // from class: cm.aptoide.pt.editorial.x0
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handleClickOnMedia$25((EditorialEvent) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        f2.H0(x0Var, new b(crashReport));
    }

    public void handleLongPressReactionButton() {
        rx.e f2 = this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.editorial.n0
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.b5
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.y((View.LifecycleEvent) obj);
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.a5
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.z((Void) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.editorial.d2
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.this.A((EditorialViewModel) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        a1 a1Var = new rx.m.b() { // from class: cm.aptoide.pt.editorial.a1
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handleLongPressReactionButton$135((EditorialViewModel) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        f2.H0(a1Var, new b(crashReport));
    }

    public void handleMediaListDescriptionVisibility() {
        rx.e f2 = this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.editorial.n1
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.p5
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.B((View.LifecycleEvent) obj);
            }
        }).j0(this.viewScheduler).D(new rx.m.e() { // from class: cm.aptoide.pt.editorial.y5
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r0.getFirstVisiblePosition() >= 0);
                return valueOf;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.editorial.j4
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.this.C((EditorialEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        o1 o1Var = new rx.m.b() { // from class: cm.aptoide.pt.editorial.o1
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handleMediaListDescriptionVisibility$105((EditorialEvent) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        f2.H0(o1Var, new b(crashReport));
    }

    public void handleMovingCollapse() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.editorial.v5
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.i1
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.D((View.LifecycleEvent) obj);
            }
        }).j0(this.viewScheduler).x(new rx.m.b() { // from class: cm.aptoide.pt.editorial.x1
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.this.E((Boolean) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.editorial.n4
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handleMovingCollapse$109((Boolean) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.editorial.t3
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.this.F((Throwable) obj);
            }
        });
    }

    public void handlePlaceHolderVisibility() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.editorial.f4
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.x4
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.K((View.LifecycleEvent) obj);
            }
        }).j0(this.viewScheduler).x(new rx.m.b() { // from class: cm.aptoide.pt.editorial.n5
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.this.L((Void) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.editorial.f2
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handlePlaceHolderVisibility$93((Void) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.editorial.t2
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.this.M((Throwable) obj);
            }
        });
    }

    public void handlePlaceHolderVisibilityChange() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.editorial.v3
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.v4
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.O((View.LifecycleEvent) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.editorial.z0
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.this.P((ScrollEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.editorial.y1
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handlePlaceHolderVisibilityChange$99((ScrollEvent) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.editorial.a4
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.this.N((Throwable) obj);
            }
        });
    }

    public void handleReactionButtonClick() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.editorial.h3
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.u4
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.Q((View.LifecycleEvent) obj);
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.editorial.s4
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.R((Void) obj);
            }
        }).j0(this.viewScheduler).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.t0
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.S((EditorialViewModel) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.editorial.i4
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handleReactionButtonClick$122((LoadReactionModel) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.editorial.b4
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.this.T((Throwable) obj);
            }
        });
    }

    public void handleRetryClick() {
        rx.e f2 = this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.editorial.u0
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.l5
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.W((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        o4 o4Var = new rx.m.b() { // from class: cm.aptoide.pt.editorial.o4
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handleRetryClick$21((EditorialViewModel) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        f2.H0(o4Var, new b(crashReport));
    }

    public void handleSnackLogInClick() {
        rx.e f2 = this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.editorial.p2
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.i3
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.a0((View.LifecycleEvent) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.editorial.y4
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.this.b0((Void) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        h2 h2Var = new rx.m.b() { // from class: cm.aptoide.pt.editorial.h2
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handleSnackLogInClick$139((Void) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        f2.H0(h2Var, new b(crashReport));
    }

    public void handleUserReaction() {
        rx.e f2 = this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.editorial.k4
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.f3
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.e0((View.LifecycleEvent) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.editorial.j2
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.this.f0((ReactionEvent) obj);
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.d3
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.i0((ReactionEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        z5 z5Var = new rx.m.b() { // from class: cm.aptoide.pt.editorial.z5
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handleUserReaction$130((LoadReactionModel) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        f2.H0(z5Var, new b(crashReport));
    }

    public void loadDownloadApp() {
        rx.e f2 = this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.editorial.p3
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.e2
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.j0((View.LifecycleEvent) obj);
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.q0
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.k0((Void) obj);
            }
        }).J(new rx.m.e() { // from class: cm.aptoide.pt.editorial.b3
            @Override // rx.m.e
            public final Object call(Object obj) {
                Iterable placeHolderContent;
                placeHolderContent = ((EditorialViewModel) obj).getPlaceHolderContent();
                return placeHolderContent;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.t1
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.l0((EditorialContent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        s1 s1Var = new rx.m.b() { // from class: cm.aptoide.pt.editorial.s1
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.lambda$loadDownloadApp$79((EditorialDownloadModel) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        f2.H0(s1Var, new b(crashReport));
    }

    public void observeDownloadErrors() {
        rx.e f2 = this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.editorial.q3
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.x5
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.o0((View.LifecycleEvent) obj);
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.r0
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.p0((EditorialViewModel) obj);
            }
        }).J(new rx.m.e() { // from class: cm.aptoide.pt.editorial.u6
            @Override // rx.m.e
            public final Object call(Object obj) {
                return ((EditorialViewModel) obj).getPlaceHolderContent();
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.q4
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.s0((EditorialContent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        h1 h1Var = new rx.m.b() { // from class: cm.aptoide.pt.editorial.h1
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.lambda$observeDownloadErrors$87((EditorialDownloadModel) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        f2.H0(h1Var, new b(crashReport));
    }

    public void onCreateLoadAppOfTheWeek() {
        rx.e<R> L = this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.editorial.y2
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.editorial.f1
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.this.t0((View.LifecycleEvent) obj);
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.editorial.s2
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.u0((View.LifecycleEvent) obj);
            }
        });
        j3 j3Var = new rx.m.b() { // from class: cm.aptoide.pt.editorial.j3
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.lambda$onCreateLoadAppOfTheWeek$14((EditorialViewModel) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        L.H0(j3Var, new b(crashReport));
    }

    public void onCreateLoadReactionModel() {
        rx.e f2 = this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.editorial.w2
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.editorial.s3
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.v0((View.LifecycleEvent) obj);
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.editorial.a2
            @Override // rx.m.e
            public final Object call(Object obj) {
                return EditorialPresenter.this.w0((EditorialViewModel) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        d4 d4Var = new rx.m.b() { // from class: cm.aptoide.pt.editorial.d4
            @Override // rx.m.b
            public final void call(Object obj) {
                EditorialPresenter.lambda$onCreateLoadReactionModel$143((LoadReactionModel) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        f2.H0(d4Var, new b(crashReport));
    }

    @Override // cm.aptoide.pt.presenter.Presenter
    public void present() {
        onCreateLoadAppOfTheWeek();
        handleRetryClick();
        handleClickOnMedia();
        handleClickOnAppCard();
        handleInstallClick();
        observeDownloadErrors();
        pauseDownload();
        resumeDownload();
        cancelDownload();
        loadDownloadApp();
        handlePlaceHolderVisibilityChange();
        handlePlaceHolderVisibility();
        handleMediaListDescriptionVisibility();
        handleClickActionButtonCard();
        handleMovingCollapse();
        handleReactionButtonClick();
        handleUserReaction();
        handleLongPressReactionButton();
        handleSnackLogInClick();
        onCreateLoadReactionModel();
        handleSocialMediaPromotionClick();
        handleOutOfSpaceDialogResult();
    }
}
