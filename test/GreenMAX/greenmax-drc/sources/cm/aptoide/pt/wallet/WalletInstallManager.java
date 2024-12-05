package cm.aptoide.pt.wallet;

import android.content.pm.PackageManager;
import cm.aptoide.pt.AptoideApplication;
import cm.aptoide.pt.aab.DynamicSplitsManager;
import cm.aptoide.pt.aab.DynamicSplitsModel;
import cm.aptoide.pt.ads.MoPubAdsManager;
import cm.aptoide.pt.app.DownloadModel;
import cm.aptoide.pt.app.DownloadStateParser;
import cm.aptoide.pt.database.room.RoomDownload;
import cm.aptoide.pt.download.DownloadAnalytics;
import cm.aptoide.pt.download.DownloadFactory;
import cm.aptoide.pt.install.AppInstallerStatusReceiver;
import cm.aptoide.pt.install.AptoideInstalledAppsRepository;
import cm.aptoide.pt.install.Install;
import cm.aptoide.pt.install.InstallManager;
import cm.aptoide.pt.packageinstaller.InstallStatus;
import cm.aptoide.pt.promotions.WalletApp;
import cm.aptoide.pt.utils.AptoideUtils;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: WalletInstallManager.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u000e\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202J\u000e\u00103\u001a\u0002002\u0006\u00104\u001a\u000202J\u0016\u00105\u001a\b\u0012\u0004\u0012\u000207062\b\u00108\u001a\u0004\u0018\u000107J\f\u00109\u001a\b\u0012\u0004\u0012\u00020206J\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020;062\u0006\u00104\u001a\u000202J\f\u0010<\u001a\b\u0012\u0004\u0012\u00020.06J\f\u0010=\u001a\b\u0012\u0004\u0012\u00020.06J\u000e\u0010>\u001a\u0002002\u0006\u00101\u001a\u000202J\u0010\u0010?\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u000202J\u000e\u0010@\u001a\u0002002\u0006\u00101\u001a\u000202J\u0006\u0010A\u001a\u00020,J2\u0010B\u001a\u00020,2\u0006\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010G\u001a\u00020H2\u0006\u00108\u001a\u0002072\u0006\u0010I\u001a\u000207H\u0002J\u0006\u0010J\u001a\u00020.R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006K"}, d2 = {"Lcm/aptoide/pt/wallet/WalletInstallManager;", HttpUrl.FRAGMENT_ENCODE_SET, "packageManager", "Landroid/content/pm/PackageManager;", "installManager", "Lcm/aptoide/pt/install/InstallManager;", "downloadFactory", "Lcm/aptoide/pt/download/DownloadFactory;", "downloadStateParser", "Lcm/aptoide/pt/app/DownloadStateParser;", "moPubAdsManager", "Lcm/aptoide/pt/ads/MoPubAdsManager;", "walletInstallAnalytics", "Lcm/aptoide/pt/wallet/WalletInstallAnalytics;", "aptoideInstalledAppsRepository", "Lcm/aptoide/pt/install/AptoideInstalledAppsRepository;", "walletAppProvider", "Lcm/aptoide/pt/wallet/WalletAppProvider;", "appInstallerStatusReceiver", "Lcm/aptoide/pt/install/AppInstallerStatusReceiver;", "dynamicSplitsManager", "Lcm/aptoide/pt/aab/DynamicSplitsManager;", "(Landroid/content/pm/PackageManager;Lcm/aptoide/pt/install/InstallManager;Lcm/aptoide/pt/download/DownloadFactory;Lcm/aptoide/pt/app/DownloadStateParser;Lcm/aptoide/pt/ads/MoPubAdsManager;Lcm/aptoide/pt/wallet/WalletInstallAnalytics;Lcm/aptoide/pt/install/AptoideInstalledAppsRepository;Lcm/aptoide/pt/wallet/WalletAppProvider;Lcm/aptoide/pt/install/AppInstallerStatusReceiver;Lcm/aptoide/pt/aab/DynamicSplitsManager;)V", "getAppInstallerStatusReceiver", "()Lcm/aptoide/pt/install/AppInstallerStatusReceiver;", "getAptoideInstalledAppsRepository", "()Lcm/aptoide/pt/install/AptoideInstalledAppsRepository;", "getDownloadFactory", "()Lcm/aptoide/pt/download/DownloadFactory;", "getDownloadStateParser", "()Lcm/aptoide/pt/app/DownloadStateParser;", "getDynamicSplitsManager", "()Lcm/aptoide/pt/aab/DynamicSplitsManager;", "getInstallManager", "()Lcm/aptoide/pt/install/InstallManager;", "getMoPubAdsManager", "()Lcm/aptoide/pt/ads/MoPubAdsManager;", "getPackageManager", "()Landroid/content/pm/PackageManager;", "getWalletAppProvider", "()Lcm/aptoide/pt/wallet/WalletAppProvider;", "getWalletInstallAnalytics", "()Lcm/aptoide/pt/wallet/WalletInstallAnalytics;", "allowRootInstall", HttpUrl.FRAGMENT_ENCODE_SET, "answer", HttpUrl.FRAGMENT_ENCODE_SET, "cancelDownload", "Lrx/Completable;", "app", "Lcm/aptoide/pt/promotions/WalletApp;", "downloadApp", "walletApp", "getAppIcon", "Lrx/Observable;", HttpUrl.FRAGMENT_ENCODE_SET, "packageName", "getWallet", "loadDownloadModel", "Lcm/aptoide/pt/app/DownloadModel;", "onWalletInstallationCanceled", "onWalletInstalled", "pauseDownload", "removeDownload", "resumeDownload", "setupAnalyticsHistoryTracker", "setupDownloadEvents", DownloadAnalytics.RAKAM_DOWNLOAD_EVENT, "Lcm/aptoide/pt/database/room/RoomDownload;", "downloadAction", "Lcm/aptoide/pt/app/DownloadModel$Action;", "appId", HttpUrl.FRAGMENT_ENCODE_SET, "developer", "shouldShowRootInstallWarningPopup", "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WalletInstallManager {
    private final AppInstallerStatusReceiver appInstallerStatusReceiver;
    private final AptoideInstalledAppsRepository aptoideInstalledAppsRepository;
    private final DownloadFactory downloadFactory;
    private final DownloadStateParser downloadStateParser;
    private final DynamicSplitsManager dynamicSplitsManager;
    private final InstallManager installManager;
    private final MoPubAdsManager moPubAdsManager;
    private final PackageManager packageManager;
    private final WalletAppProvider walletAppProvider;
    private final WalletInstallAnalytics walletInstallAnalytics;

    public WalletInstallManager(PackageManager packageManager, InstallManager installManager, DownloadFactory downloadFactory, DownloadStateParser downloadStateParser, MoPubAdsManager moPubAdsManager, WalletInstallAnalytics walletInstallAnalytics, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, WalletAppProvider walletAppProvider, AppInstallerStatusReceiver appInstallerStatusReceiver, DynamicSplitsManager dynamicSplitsManager) {
        kotlin.jvm.internal.l.f(packageManager, "packageManager");
        kotlin.jvm.internal.l.f(installManager, "installManager");
        kotlin.jvm.internal.l.f(downloadFactory, "downloadFactory");
        kotlin.jvm.internal.l.f(downloadStateParser, "downloadStateParser");
        kotlin.jvm.internal.l.f(moPubAdsManager, "moPubAdsManager");
        kotlin.jvm.internal.l.f(walletInstallAnalytics, "walletInstallAnalytics");
        kotlin.jvm.internal.l.f(aptoideInstalledAppsRepository, "aptoideInstalledAppsRepository");
        kotlin.jvm.internal.l.f(walletAppProvider, "walletAppProvider");
        kotlin.jvm.internal.l.f(appInstallerStatusReceiver, "appInstallerStatusReceiver");
        kotlin.jvm.internal.l.f(dynamicSplitsManager, "dynamicSplitsManager");
        this.packageManager = packageManager;
        this.installManager = installManager;
        this.downloadFactory = downloadFactory;
        this.downloadStateParser = downloadStateParser;
        this.moPubAdsManager = moPubAdsManager;
        this.walletInstallAnalytics = walletInstallAnalytics;
        this.aptoideInstalledAppsRepository = aptoideInstalledAppsRepository;
        this.walletAppProvider = walletAppProvider;
        this.appInstallerStatusReceiver = appInstallerStatusReceiver;
        this.dynamicSplitsManager = dynamicSplitsManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cancelDownload$lambda-6, reason: not valid java name */
    public static final void m316cancelDownload$lambda6(WalletInstallManager walletInstallManager, WalletApp walletApp) {
        kotlin.jvm.internal.l.f(walletInstallManager, "this$0");
        kotlin.jvm.internal.l.f(walletApp, "$app");
        walletInstallManager.removeDownload(walletApp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: downloadApp$lambda-2, reason: not valid java name */
    public static final rx.e m317downloadApp$lambda2(WalletInstallManager walletInstallManager, WalletApp walletApp, DynamicSplitsModel dynamicSplitsModel) {
        kotlin.jvm.internal.l.f(walletInstallManager, "this$0");
        kotlin.jvm.internal.l.f(walletApp, "$walletApp");
        return rx.e.S(walletInstallManager.downloadFactory.create(walletInstallManager.downloadStateParser.parseDownloadAction(DownloadModel.Action.INSTALL), walletApp.getAppName(), walletApp.getPackageName(), walletApp.getMd5sum(), walletApp.getIcon(), walletApp.getVersionName(), walletApp.getVersionCode(), walletApp.getPath(), walletApp.getPathAlt(), walletApp.getObb(), false, walletApp.getSize(), walletApp.getSplits(), walletApp.getRequiredSplits(), walletApp.getTrustedBadge(), walletApp.getStoreName(), dynamicSplitsModel.getDynamicSplitsList()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: downloadApp$lambda-3, reason: not valid java name */
    public static final void m318downloadApp$lambda3(WalletInstallManager walletInstallManager, WalletApp walletApp, RoomDownload roomDownload) {
        kotlin.jvm.internal.l.f(walletInstallManager, "this$0");
        kotlin.jvm.internal.l.f(walletApp, "$walletApp");
        kotlin.jvm.internal.l.e(roomDownload, DownloadAnalytics.RAKAM_DOWNLOAD_EVENT);
        walletInstallManager.setupDownloadEvents(roomDownload, DownloadModel.Action.INSTALL, walletApp.getId(), walletApp.getPackageName(), walletApp.getDeveloper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: downloadApp$lambda-4, reason: not valid java name */
    public static final rx.b m319downloadApp$lambda4(WalletInstallManager walletInstallManager, RoomDownload roomDownload) {
        kotlin.jvm.internal.l.f(walletInstallManager, "this$0");
        return walletInstallManager.installManager.splitInstall(roomDownload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAppIcon$lambda-0, reason: not valid java name */
    public static final String m320getAppIcon$lambda0(WalletInstallManager walletInstallManager, String str) {
        kotlin.jvm.internal.l.f(walletInstallManager, "this$0");
        PackageManager packageManager = walletInstallManager.packageManager;
        kotlin.jvm.internal.l.c(str);
        return AptoideUtils.SystemU.getApkIconPath(packageManager.getPackageInfo(str, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAppIcon$lambda-1, reason: not valid java name */
    public static final String m321getAppIcon$lambda1(Throwable th) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDownloadModel$lambda-7, reason: not valid java name */
    public static final DownloadModel m322loadDownloadModel$lambda7(WalletInstallManager walletInstallManager, Install install) {
        kotlin.jvm.internal.l.f(walletInstallManager, "this$0");
        return new DownloadModel(walletInstallManager.downloadStateParser.parseDownloadType(install.getType(), false), install.getProgress(), walletInstallManager.downloadStateParser.parseDownloadState(install.getState(), install.isIndeterminate()), install.getAppSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onWalletInstallationCanceled$lambda-10, reason: not valid java name */
    public static final Boolean m323onWalletInstallationCanceled$lambda10(InstallStatus installStatus) {
        return Boolean.valueOf(InstallStatus.Status.CANCELED.equals(installStatus.getStatus()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onWalletInstallationCanceled$lambda-11, reason: not valid java name */
    public static final Boolean m324onWalletInstallationCanceled$lambda11(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onWalletInstalled$lambda-5, reason: not valid java name */
    public static final Boolean m325onWalletInstalled$lambda5(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: resumeDownload$lambda-8, reason: not valid java name */
    public static final void m326resumeDownload$lambda8(WalletInstallManager walletInstallManager, WalletApp walletApp, RoomDownload roomDownload) {
        kotlin.jvm.internal.l.f(walletInstallManager, "this$0");
        kotlin.jvm.internal.l.f(walletApp, "$app");
        kotlin.jvm.internal.l.e(roomDownload, DownloadAnalytics.RAKAM_DOWNLOAD_EVENT);
        walletInstallManager.setupDownloadEvents(roomDownload, DownloadModel.Action.INSTALL, walletApp.getId(), walletApp.getPackageName(), walletApp.getDeveloper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: resumeDownload$lambda-9, reason: not valid java name */
    public static final rx.b m327resumeDownload$lambda9(WalletInstallManager walletInstallManager, RoomDownload roomDownload) {
        kotlin.jvm.internal.l.f(walletInstallManager, "this$0");
        return walletInstallManager.installManager.splitInstall(roomDownload);
    }

    private final void setupDownloadEvents(RoomDownload download, DownloadModel.Action downloadAction, long appId, String packageName, String developer) {
        this.walletInstallAnalytics.setupDownloadEvents(download, downloadAction, appId);
        this.walletInstallAnalytics.sendClickOnInstallButtonEvent(packageName, developer, download.hasSplits());
    }

    public final void allowRootInstall(boolean answer) {
        this.installManager.rootInstallAllowed(answer);
    }

    public final rx.b cancelDownload(final WalletApp walletApp) {
        kotlin.jvm.internal.l.f(walletApp, "app");
        rx.b t = rx.b.t(new rx.m.a() { // from class: cm.aptoide.pt.wallet.k
            @Override // rx.m.a
            public final void call() {
                WalletInstallManager.m316cancelDownload$lambda6(WalletInstallManager.this, walletApp);
            }
        });
        kotlin.jvm.internal.l.e(t, "fromAction { removeDownload(app) }");
        return t;
    }

    public final rx.b downloadApp(final WalletApp walletApp) {
        kotlin.jvm.internal.l.f(walletApp, "walletApp");
        DynamicSplitsManager dynamicSplitsManager = this.dynamicSplitsManager;
        String md5sum = walletApp.getMd5sum();
        kotlin.jvm.internal.l.c(md5sum);
        rx.b X0 = g.a.a.a.d.d(dynamicSplitsManager.getAppSplitsByMd5(md5sum)).k(new rx.m.e() { // from class: cm.aptoide.pt.wallet.o
            @Override // rx.m.e
            public final Object call(Object obj) {
                rx.e m317downloadApp$lambda2;
                m317downloadApp$lambda2 = WalletInstallManager.m317downloadApp$lambda2(WalletInstallManager.this, walletApp, (DynamicSplitsModel) obj);
                return m317downloadApp$lambda2;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.wallet.p
            @Override // rx.m.b
            public final void call(Object obj) {
                WalletInstallManager.m318downloadApp$lambda3(WalletInstallManager.this, walletApp, (RoomDownload) obj);
            }
        }).H(new rx.m.e() { // from class: cm.aptoide.pt.wallet.j
            @Override // rx.m.e
            public final Object call(Object obj) {
                rx.b m319downloadApp$lambda4;
                m319downloadApp$lambda4 = WalletInstallManager.m319downloadApp$lambda4(WalletInstallManager.this, (RoomDownload) obj);
                return m319downloadApp$lambda4;
            }
        }).X0();
        kotlin.jvm.internal.l.e(X0, "toV1Single<DynamicSplits… }\n      .toCompletable()");
        return X0;
    }

    public final rx.e<String> getAppIcon(final String str) {
        rx.e<String> p0 = rx.e.P(new Callable() { // from class: cm.aptoide.pt.wallet.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String m320getAppIcon$lambda0;
                m320getAppIcon$lambda0 = WalletInstallManager.m320getAppIcon$lambda0(WalletInstallManager.this, str);
                return m320getAppIcon$lambda0;
            }
        }).p0(new rx.m.e() { // from class: cm.aptoide.pt.wallet.l
            @Override // rx.m.e
            public final Object call(Object obj) {
                String m321getAppIcon$lambda1;
                m321getAppIcon$lambda1 = WalletInstallManager.m321getAppIcon$lambda1((Throwable) obj);
                return m321getAppIcon$lambda1;
            }
        });
        kotlin.jvm.internal.l.e(p0, "fromCallable {\n      Apt… }.onErrorReturn { null }");
        return p0;
    }

    public final AppInstallerStatusReceiver getAppInstallerStatusReceiver() {
        return this.appInstallerStatusReceiver;
    }

    public final AptoideInstalledAppsRepository getAptoideInstalledAppsRepository() {
        return this.aptoideInstalledAppsRepository;
    }

    public final DownloadFactory getDownloadFactory() {
        return this.downloadFactory;
    }

    public final DownloadStateParser getDownloadStateParser() {
        return this.downloadStateParser;
    }

    public final DynamicSplitsManager getDynamicSplitsManager() {
        return this.dynamicSplitsManager;
    }

    public final InstallManager getInstallManager() {
        return this.installManager;
    }

    public final MoPubAdsManager getMoPubAdsManager() {
        return this.moPubAdsManager;
    }

    public final PackageManager getPackageManager() {
        return this.packageManager;
    }

    public final rx.e<WalletApp> getWallet() {
        return this.walletAppProvider.getWalletApp();
    }

    public final WalletAppProvider getWalletAppProvider() {
        return this.walletAppProvider;
    }

    public final WalletInstallAnalytics getWalletInstallAnalytics() {
        return this.walletInstallAnalytics;
    }

    public final rx.e<DownloadModel> loadDownloadModel(WalletApp walletApp) {
        kotlin.jvm.internal.l.f(walletApp, "walletApp");
        rx.e X = this.installManager.getInstall(walletApp.getMd5sum(), walletApp.getPackageName(), walletApp.getVersionCode()).X(new rx.m.e() { // from class: cm.aptoide.pt.wallet.f
            @Override // rx.m.e
            public final Object call(Object obj) {
                DownloadModel m322loadDownloadModel$lambda7;
                m322loadDownloadModel$lambda7 = WalletInstallManager.m322loadDownloadModel$lambda7(WalletInstallManager.this, (Install) obj);
                return m322loadDownloadModel$lambda7;
            }
        });
        kotlin.jvm.internal.l.e(X, "installManager.getInstal…appSize\n        )\n      }");
        return X;
    }

    public final rx.e<Boolean> onWalletInstallationCanceled() {
        rx.e<Boolean> D = this.appInstallerStatusReceiver.getInstallerInstallStatus().X(new rx.m.e() { // from class: cm.aptoide.pt.wallet.h
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean m323onWalletInstallationCanceled$lambda10;
                m323onWalletInstallationCanceled$lambda10 = WalletInstallManager.m323onWalletInstallationCanceled$lambda10((InstallStatus) obj);
                return m323onWalletInstallationCanceled$lambda10;
            }
        }).D(new rx.m.e() { // from class: cm.aptoide.pt.wallet.n
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean m324onWalletInstallationCanceled$lambda11;
                m324onWalletInstallationCanceled$lambda11 = WalletInstallManager.m324onWalletInstallationCanceled$lambda11((Boolean) obj);
                return m324onWalletInstallationCanceled$lambda11;
            }
        });
        kotlin.jvm.internal.l.e(D, "appInstallerStatusReceiv…sCanceled -> isCanceled }");
        return D;
    }

    public final rx.e<Boolean> onWalletInstalled() {
        rx.e<Boolean> D = this.aptoideInstalledAppsRepository.isInstalled(AptoideApplication.APPCOINS_WALLET_PACKAGE_NAME).D(new rx.m.e() { // from class: cm.aptoide.pt.wallet.i
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean m325onWalletInstalled$lambda5;
                m325onWalletInstalled$lambda5 = WalletInstallManager.m325onWalletInstalled$lambda5((Boolean) obj);
                return m325onWalletInstalled$lambda5;
            }
        });
        kotlin.jvm.internal.l.e(D, "aptoideInstalledAppsRepo…      isInstalled\n      }");
        return D;
    }

    public final rx.b pauseDownload(WalletApp walletApp) {
        kotlin.jvm.internal.l.f(walletApp, "app");
        rx.b pauseInstall = this.installManager.pauseInstall(walletApp.getMd5sum());
        kotlin.jvm.internal.l.e(pauseInstall, "installManager.pauseInstall(app.md5sum)");
        return pauseInstall;
    }

    public final rx.b removeDownload(WalletApp walletApp) {
        kotlin.jvm.internal.l.f(walletApp, "app");
        return this.installManager.cancelInstall(walletApp.getMd5sum(), walletApp.getPackageName(), walletApp.getVersionCode());
    }

    public final rx.b resumeDownload(final WalletApp walletApp) {
        kotlin.jvm.internal.l.f(walletApp, "app");
        rx.b j2 = this.installManager.getDownload(walletApp.getMd5sum()).g(new rx.m.b() { // from class: cm.aptoide.pt.wallet.g
            @Override // rx.m.b
            public final void call(Object obj) {
                WalletInstallManager.m326resumeDownload$lambda8(WalletInstallManager.this, walletApp, (RoomDownload) obj);
            }
        }).j(new rx.m.e() { // from class: cm.aptoide.pt.wallet.m
            @Override // rx.m.e
            public final Object call(Object obj) {
                rx.b m327resumeDownload$lambda9;
                m327resumeDownload$lambda9 = WalletInstallManager.m327resumeDownload$lambda9(WalletInstallManager.this, (RoomDownload) obj);
                return m327resumeDownload$lambda9;
            }
        });
        kotlin.jvm.internal.l.e(j2, "installManager.getDownlo…Install(download)\n      }");
        return j2;
    }

    public final void setupAnalyticsHistoryTracker() {
        this.walletInstallAnalytics.setupHistoryTracker();
    }

    public final boolean shouldShowRootInstallWarningPopup() {
        return this.installManager.showWarning();
    }
}
