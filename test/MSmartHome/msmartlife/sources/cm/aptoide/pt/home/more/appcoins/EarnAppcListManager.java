package cm.aptoide.pt.home.more.appcoins;

import cm.aptoide.pt.app.DownloadModel;
import cm.aptoide.pt.promotions.WalletApp;
import cm.aptoide.pt.wallet.WalletAppProvider;
import cm.aptoide.pt.wallet.WalletInstallManager;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: EarnAppcListManager.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0011J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0011J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0011J\u0006\u0010\u0016\u001a\u00020\u000eJ\u0006\u0010\u0017\u001a\u00020\u000eJ\u0006\u0010\u0018\u001a\u00020\fR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcm/aptoide/pt/home/more/appcoins/EarnAppcListManager;", HttpUrl.FRAGMENT_ENCODE_SET, "walletAppProvider", "Lcm/aptoide/pt/wallet/WalletAppProvider;", "walletInstallManager", "Lcm/aptoide/pt/wallet/WalletInstallManager;", "(Lcm/aptoide/pt/wallet/WalletAppProvider;Lcm/aptoide/pt/wallet/WalletInstallManager;)V", "cachedWalletApp", "Lcm/aptoide/pt/promotions/WalletApp;", "allowRootInstall", HttpUrl.FRAGMENT_ENCODE_SET, "answer", HttpUrl.FRAGMENT_ENCODE_SET, "cancelWalletDownload", "Lrx/Completable;", "downloadApp", "getWalletApp", "Lrx/Observable;", "loadWalletDownloadModel", "Lcm/aptoide/pt/app/DownloadModel;", "observeWalletApp", "onWalletInstalled", "pauseWalletDownload", "resumeWalletDownload", "shouldShowRootInstallWarningPopup", "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EarnAppcListManager {
    private WalletApp cachedWalletApp;
    private final WalletAppProvider walletAppProvider;
    private final WalletInstallManager walletInstallManager;

    public EarnAppcListManager(WalletAppProvider walletAppProvider, WalletInstallManager walletInstallManager) {
        kotlin.jvm.internal.l.f(walletAppProvider, "walletAppProvider");
        kotlin.jvm.internal.l.f(walletInstallManager, "walletInstallManager");
        this.walletAppProvider = walletAppProvider;
        this.walletInstallManager = walletInstallManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cancelWalletDownload$lambda-4, reason: not valid java name */
    public static final rx.b m181cancelWalletDownload$lambda4(EarnAppcListManager earnAppcListManager, WalletApp walletApp) {
        kotlin.jvm.internal.l.f(earnAppcListManager, "this$0");
        WalletInstallManager walletInstallManager = earnAppcListManager.walletInstallManager;
        kotlin.jvm.internal.l.e(walletApp, "app");
        return walletInstallManager.cancelDownload(walletApp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: downloadApp$lambda-1, reason: not valid java name */
    public static final rx.b m182downloadApp$lambda1(EarnAppcListManager earnAppcListManager, WalletApp walletApp) {
        kotlin.jvm.internal.l.f(earnAppcListManager, "this$0");
        WalletInstallManager walletInstallManager = earnAppcListManager.walletInstallManager;
        kotlin.jvm.internal.l.e(walletApp, "app");
        return walletInstallManager.downloadApp(walletApp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getWalletApp$lambda-0, reason: not valid java name */
    public static final void m183getWalletApp$lambda0(EarnAppcListManager earnAppcListManager, WalletApp walletApp) {
        kotlin.jvm.internal.l.f(earnAppcListManager, "this$0");
        earnAppcListManager.cachedWalletApp = walletApp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadWalletDownloadModel$lambda-2, reason: not valid java name */
    public static final rx.e m184loadWalletDownloadModel$lambda2(EarnAppcListManager earnAppcListManager, WalletApp walletApp) {
        kotlin.jvm.internal.l.f(earnAppcListManager, "this$0");
        WalletInstallManager walletInstallManager = earnAppcListManager.walletInstallManager;
        kotlin.jvm.internal.l.e(walletApp, "app");
        return walletInstallManager.loadDownloadModel(walletApp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pauseWalletDownload$lambda-3, reason: not valid java name */
    public static final rx.b m185pauseWalletDownload$lambda3(EarnAppcListManager earnAppcListManager, WalletApp walletApp) {
        kotlin.jvm.internal.l.f(earnAppcListManager, "this$0");
        WalletInstallManager walletInstallManager = earnAppcListManager.walletInstallManager;
        kotlin.jvm.internal.l.e(walletApp, "app");
        return walletInstallManager.pauseDownload(walletApp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: resumeWalletDownload$lambda-5, reason: not valid java name */
    public static final rx.b m186resumeWalletDownload$lambda5(EarnAppcListManager earnAppcListManager, WalletApp walletApp) {
        kotlin.jvm.internal.l.f(earnAppcListManager, "this$0");
        WalletInstallManager walletInstallManager = earnAppcListManager.walletInstallManager;
        kotlin.jvm.internal.l.e(walletApp, "app");
        return walletInstallManager.resumeDownload(walletApp);
    }

    public final void allowRootInstall(boolean answer) {
        this.walletInstallManager.allowRootInstall(answer);
    }

    public final rx.b cancelWalletDownload() {
        rx.b X0 = getWalletApp().H(new rx.m.e() { // from class: cm.aptoide.pt.home.more.appcoins.e
            @Override // rx.m.e
            public final Object call(Object obj) {
                rx.b m181cancelWalletDownload$lambda4;
                m181cancelWalletDownload$lambda4 = EarnAppcListManager.m181cancelWalletDownload$lambda4(EarnAppcListManager.this, (WalletApp) obj);
                return m181cancelWalletDownload$lambda4;
            }
        }).X0();
        kotlin.jvm.internal.l.e(X0, "getWalletApp()\n        .…\n        .toCompletable()");
        return X0;
    }

    public final rx.b downloadApp() {
        rx.b X0 = getWalletApp().H(new rx.m.e() { // from class: cm.aptoide.pt.home.more.appcoins.h
            @Override // rx.m.e
            public final Object call(Object obj) {
                rx.b m182downloadApp$lambda1;
                m182downloadApp$lambda1 = EarnAppcListManager.m182downloadApp$lambda1(EarnAppcListManager.this, (WalletApp) obj);
                return m182downloadApp$lambda1;
            }
        }).X0();
        kotlin.jvm.internal.l.e(X0, "getWalletApp()\n        .…\n        .toCompletable()");
        return X0;
    }

    public final rx.e<WalletApp> getWalletApp() {
        WalletApp walletApp = this.cachedWalletApp;
        if (walletApp != null) {
            rx.e<WalletApp> S = rx.e.S(walletApp);
            kotlin.jvm.internal.l.e(S, "just(cachedWalletApp)");
            return S;
        }
        rx.e<WalletApp> x = this.walletAppProvider.getWalletApp().x(new rx.m.b() { // from class: cm.aptoide.pt.home.more.appcoins.g
            @Override // rx.m.b
            public final void call(Object obj) {
                EarnAppcListManager.m183getWalletApp$lambda0(EarnAppcListManager.this, (WalletApp) obj);
            }
        });
        kotlin.jvm.internal.l.e(x, "walletAppProvider.getWal…edWalletApp = walletApp }");
        return x;
    }

    public final rx.e<DownloadModel> loadWalletDownloadModel() {
        rx.e G = getWalletApp().G(new rx.m.e() { // from class: cm.aptoide.pt.home.more.appcoins.f
            @Override // rx.m.e
            public final Object call(Object obj) {
                rx.e m184loadWalletDownloadModel$lambda2;
                m184loadWalletDownloadModel$lambda2 = EarnAppcListManager.m184loadWalletDownloadModel$lambda2(EarnAppcListManager.this, (WalletApp) obj);
                return m184loadWalletDownloadModel$lambda2;
            }
        });
        kotlin.jvm.internal.l.e(G, "getWalletApp()\n        .….loadDownloadModel(app) }");
        return G;
    }

    public final rx.e<WalletApp> observeWalletApp() {
        return this.walletAppProvider.getWalletApp();
    }

    public final rx.e<Boolean> onWalletInstalled() {
        return this.walletInstallManager.onWalletInstalled();
    }

    public final rx.b pauseWalletDownload() {
        rx.b X0 = getWalletApp().H(new rx.m.e() { // from class: cm.aptoide.pt.home.more.appcoins.d
            @Override // rx.m.e
            public final Object call(Object obj) {
                rx.b m185pauseWalletDownload$lambda3;
                m185pauseWalletDownload$lambda3 = EarnAppcListManager.m185pauseWalletDownload$lambda3(EarnAppcListManager.this, (WalletApp) obj);
                return m185pauseWalletDownload$lambda3;
            }
        }).X0();
        kotlin.jvm.internal.l.e(X0, "getWalletApp()\n        .…\n        .toCompletable()");
        return X0;
    }

    public final rx.b resumeWalletDownload() {
        rx.b X0 = getWalletApp().H(new rx.m.e() { // from class: cm.aptoide.pt.home.more.appcoins.i
            @Override // rx.m.e
            public final Object call(Object obj) {
                rx.b m186resumeWalletDownload$lambda5;
                m186resumeWalletDownload$lambda5 = EarnAppcListManager.m186resumeWalletDownload$lambda5(EarnAppcListManager.this, (WalletApp) obj);
                return m186resumeWalletDownload$lambda5;
            }
        }).X0();
        kotlin.jvm.internal.l.e(X0, "getWalletApp()\n        .…\n        .toCompletable()");
        return X0;
    }

    public final boolean shouldShowRootInstallWarningPopup() {
        return this.walletInstallManager.shouldShowRootInstallWarningPopup();
    }
}
