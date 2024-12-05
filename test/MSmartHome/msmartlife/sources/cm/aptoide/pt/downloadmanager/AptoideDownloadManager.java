package cm.aptoide.pt.downloadmanager;

import cm.aptoide.pt.database.room.RoomDownload;
import cm.aptoide.pt.database.room.RoomFileToDownload;
import cm.aptoide.pt.downloadmanager.AppDownloadStatus;
import cm.aptoide.pt.logger.Logger;
import cm.aptoide.pt.utils.FileUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import rx.Single;

/* loaded from: classes.dex */
public class AptoideDownloadManager implements DownloadManager {
    private static final String TAG = "AptoideDownloadManager";
    private HashMap<String, AppDownloader> appDownloaderMap = new HashMap<>();
    private AppDownloaderProvider appDownloaderProvider;
    private rx.k dispatchDownloadsSubscription;
    private DownloadAnalytics downloadAnalytics;
    private final DownloadAppMapper downloadAppMapper;
    private DownloadStatusMapper downloadStatusMapper;
    private DownloadsRepository downloadsRepository;

    public AptoideDownloadManager(DownloadsRepository downloadsRepository, DownloadStatusMapper downloadStatusMapper, DownloadAppMapper downloadAppMapper, AppDownloaderProvider appDownloaderProvider, DownloadAnalytics downloadAnalytics) {
        this.downloadsRepository = downloadsRepository;
        this.downloadStatusMapper = downloadStatusMapper;
        this.downloadAppMapper = downloadAppMapper;
        this.appDownloaderProvider = appDownloaderProvider;
        this.downloadAnalytics = downloadAnalytics;
    }

    private AppDownloader createAppDownloadManager(RoomDownload roomDownload) {
        return this.appDownloaderProvider.getAppDownloader(this.downloadAppMapper.mapDownload(roomDownload));
    }

    private void dispatchDownloads() {
        this.dispatchDownloadsSubscription = this.downloadsRepository.getInProgressDownloadsList().w(new rx.m.b() { // from class: cm.aptoide.pt.downloadmanager.q0
            @Override // rx.m.b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }).s0().R0(750L, TimeUnit.MILLISECONDS).x(new rx.m.b() { // from class: cm.aptoide.pt.downloadmanager.g0
            @Override // rx.m.b
            public final void call(Object obj) {
                Logger.getInstance().d(AptoideDownloadManager.TAG, "Downloads in Progress " + ((List) obj).size());
            }
        }).D(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.b
            @Override // rx.m.e
            public final Object call(Object obj) {
                return Boolean.valueOf(((List) obj).isEmpty());
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.v0
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AptoideDownloadManager.this.b((List) obj);
            }
        }).t().w(new rx.m.b() { // from class: cm.aptoide.pt.downloadmanager.z0
            @Override // rx.m.b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }).s0().x(new rx.m.b() { // from class: cm.aptoide.pt.downloadmanager.i0
            @Override // rx.m.b
            public final void call(Object obj) {
                Logger.getInstance().d(AptoideDownloadManager.TAG, "Queued downloads " + ((List) obj).size());
            }
        }).D(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.t0
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                List list = (List) obj;
                valueOf = Boolean.valueOf(!list.isEmpty());
                return valueOf;
            }
        }).X(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.u0
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AptoideDownloadManager.lambda$dispatchDownloads$32((List) obj);
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.r0
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AptoideDownloadManager.this.d((RoomDownload) obj);
            }
        }).s0().w(new rx.m.b() { // from class: cm.aptoide.pt.downloadmanager.j0
            @Override // rx.m.b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }).H0(new rx.m.b() { // from class: cm.aptoide.pt.downloadmanager.a1
            @Override // rx.m.b
            public final void call(Object obj) {
                AptoideDownloadManager.lambda$dispatchDownloads$36((RoomDownload) obj);
            }
        }, t1.f4655f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAppDownloader, reason: merged with bridge method [inline-methods] */
    public rx.e<AppDownloader> s(final RoomDownload roomDownload) {
        return rx.e.S(this.appDownloaderMap.get(roomDownload.getMd5())).X(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.b0
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AptoideDownloadManager.this.e(roomDownload, (AppDownloader) obj);
            }
        });
    }

    private int getStateIfFileExists(RoomDownload roomDownload) {
        if (roomDownload.getOverallDownloadStatus() == 5) {
            return 5;
        }
        for (RoomFileToDownload roomFileToDownload : roomDownload.getFilesToDownload()) {
            if (!FileUtils.fileExists(roomFileToDownload.getFilePath())) {
                Logger.getInstance().d(TAG, "File is missing: " + roomFileToDownload.getFileName() + " file path: " + roomFileToDownload.getFilePath());
                return 10;
            }
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public rx.e<RoomDownload> handleDownloadProgress(AppDownloader appDownloader) {
        return appDownloader.observeDownloadProgress().G(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.e0
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AptoideDownloadManager.this.k((AppDownloadStatus) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.downloadmanager.v
            @Override // rx.m.b
            public final void call(Object obj) {
                AptoideDownloadManager.this.l((RoomDownload) obj);
            }
        }).D(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.m1
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1.getOverallDownloadStatus() == 1);
                return valueOf;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.downloadmanager.o0
            @Override // rx.m.b
            public final void call(Object obj) {
                AptoideDownloadManager.this.m((RoomDownload) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.downloadmanager.k1
            @Override // rx.m.b
            public final void call(Object obj) {
                AptoideDownloadManager.this.n((RoomDownload) obj);
            }
        }).Q0(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.s0
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1.getOverallDownloadStatus() == 1);
                return valueOf;
            }
        });
    }

    private boolean isFileMissingFromCompletedDownload(RoomDownload roomDownload) {
        return roomDownload.getOverallDownloadStatus() == 1 && getStateIfFileExists(roomDownload) == 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$dispatchDownloads$28, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e b(List list) {
        return this.downloadsRepository.getInQueueDownloads().E();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ RoomDownload lambda$dispatchDownloads$32(List list) {
        return (RoomDownload) list.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$dispatchDownloads$33, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void c(RoomDownload roomDownload, Throwable th) {
        lambda$removeDownload$22(roomDownload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$dispatchDownloads$34, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e d(final RoomDownload roomDownload) {
        return lambda$pauseDownload$18(roomDownload).w(new rx.m.b() { // from class: cm.aptoide.pt.downloadmanager.b1
            @Override // rx.m.b
            public final void call(Object obj) {
                AptoideDownloadManager.this.c(roomDownload, (Throwable) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.downloadmanager.a
            @Override // rx.m.b
            public final void call(Object obj) {
                ((AppDownloader) obj).startAppDownload();
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.w
            @Override // rx.m.e
            public final Object call(Object obj) {
                rx.e handleDownloadProgress;
                handleDownloadProgress = AptoideDownloadManager.this.handleDownloadProgress((AppDownloader) obj);
                return handleDownloadProgress;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$dispatchDownloads$36(RoomDownload roomDownload) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getAppDownloader$44, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ AppDownloader e(RoomDownload roomDownload, AppDownloader appDownloader) {
        return appDownloader == null ? createAppDownloadManager(roomDownload) : appDownloader;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Iterable lambda$getCurrentInProgressDownload$9(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getDownloadAsObservable$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e f(RoomDownload roomDownload) {
        if (roomDownload != null && !isFileMissingFromCompletedDownload(roomDownload)) {
            return rx.e.S(roomDownload);
        }
        return rx.e.C(new DownloadNotFoundException());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getDownloadAsSingle$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single g(RoomDownload roomDownload) {
        if (roomDownload != null && !isFileMissingFromCompletedDownload(roomDownload)) {
            return Single.m(roomDownload);
        }
        return Single.h(new DownloadNotFoundException());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getDownloadsByMd5$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean h(RoomDownload roomDownload) {
        return Boolean.valueOf((roomDownload == null || isFileMissingFromCompletedDownload(roomDownload)) ? false : true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getDownloadsByMd5$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e i(List list) {
        return rx.e.N(list).D(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.c0
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AptoideDownloadManager.this.h((RoomDownload) obj);
            }
        }).Y0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ RoomDownload lambda$getDownloadsByMd5$7(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return (RoomDownload) list.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDownloadProgress$37, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e j(AppDownloadStatus appDownloadStatus, RoomDownload roomDownload) {
        return updateDownload(roomDownload, appDownloadStatus).b(rx.e.S(roomDownload));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDownloadProgress$38, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e k(final AppDownloadStatus appDownloadStatus) {
        return this.downloadsRepository.getDownloadAsObservable(appDownloadStatus.getMd5()).E().G(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.x0
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AptoideDownloadManager.this.j(appDownloadStatus, (RoomDownload) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDownloadProgress$39, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void l(RoomDownload roomDownload) {
        if (roomDownload.getOverallDownloadStatus() == 5) {
            this.downloadAnalytics.startProgress(roomDownload);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDownloadProgress$41, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m(RoomDownload roomDownload) {
        this.downloadAnalytics.onDownloadComplete(roomDownload.getMd5(), roomDownload.getPackageName(), roomDownload.getVersionCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDownloadProgress$42, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void n(RoomDownload roomDownload) {
        removeAppDownloader(roomDownload.getMd5());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Iterable lambda$invalidateDatabase$23(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$invalidateDatabase$24, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean o(RoomDownload roomDownload) {
        return Boolean.valueOf(getStateIfFileExists(roomDownload) == 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$invalidateDatabase$25, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b p(RoomDownload roomDownload) {
        return this.downloadsRepository.remove(roomDownload.getMd5());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Iterable lambda$pauseAllDownloads$12(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ RoomDownload lambda$pauseAllDownloads$14(RoomDownload roomDownload, AppDownloader appDownloader) {
        return roomDownload;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$pauseAllDownloads$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e q(final RoomDownload roomDownload) {
        return lambda$pauseDownload$18(roomDownload).H(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.n0
            @Override // rx.m.e
            public final Object call(Object obj) {
                rx.b pauseAppDownload;
                pauseAppDownload = ((AppDownloader) obj).pauseAppDownload();
                return pauseAppDownload;
            }
        }).X(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.g1
            @Override // rx.m.e
            public final Object call(Object obj) {
                RoomDownload roomDownload2 = RoomDownload.this;
                AptoideDownloadManager.lambda$pauseAllDownloads$14(roomDownload2, (AppDownloader) obj);
                return roomDownload2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$pauseDownload$17, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e r(RoomDownload roomDownload) {
        roomDownload.setOverallDownloadStatus(6);
        return this.downloadsRepository.save(roomDownload).b(rx.e.S(roomDownload));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$removeDownload$20, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e t(String str, RoomDownload roomDownload, AppDownloader appDownloader) {
        return appDownloader.removeAppDownload().a(this.downloadsRepository.remove(str)).b(rx.e.S(roomDownload));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$removeDownload$21, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e u(final String str, final RoomDownload roomDownload) {
        return lambda$pauseDownload$18(roomDownload).G(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.y
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AptoideDownloadManager.this.t(str, roomDownload, (AppDownloader) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$startDownload$0(RoomDownload roomDownload) {
        roomDownload.setOverallDownloadStatus(13);
        roomDownload.setTimeStamp(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$startDownload$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void w(RoomDownload roomDownload) {
        this.appDownloaderMap.put(roomDownload.getMd5(), createAppDownloadManager(roomDownload));
    }

    private void removeAppDownloader(String str) {
        AppDownloader appDownloader = this.appDownloaderMap.get(str);
        Logger.getInstance().d(TAG, "removing download manager from app : " + str);
        if (appDownloader != null) {
            appDownloader.stop();
            Logger.getInstance().d(TAG, "removed download manager from app " + str);
            this.appDownloaderMap.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: removeDownloadFiles, reason: merged with bridge method [inline-methods] */
    public void v(RoomDownload roomDownload) {
        Iterator<RoomFileToDownload> it = roomDownload.getFilesToDownload().iterator();
        while (it.hasNext()) {
            FileUtils.removeFile(it.next().getFilePath());
        }
    }

    private rx.b updateDownload(RoomDownload roomDownload, AppDownloadStatus appDownloadStatus) {
        roomDownload.setOverallProgress(appDownloadStatus.getOverallProgress());
        roomDownload.setOverallDownloadStatus(this.downloadStatusMapper.mapAppDownloadStatus(appDownloadStatus.getDownloadStatus()));
        roomDownload.setDownloadError(this.downloadStatusMapper.mapDownloadError(appDownloadStatus.getDownloadStatus()));
        for (RoomFileToDownload roomFileToDownload : roomDownload.getFilesToDownload()) {
            roomFileToDownload.setStatus(this.downloadStatusMapper.mapAppDownloadStatus(appDownloadStatus.getFileDownloadStatus(roomFileToDownload.getMd5())));
            roomFileToDownload.setProgress(appDownloadStatus.getFileDownloadProgress(roomFileToDownload.getMd5()));
        }
        if (appDownloadStatus.getDownloadStatus().equals(AppDownloadStatus.AppDownloadState.ERROR_MD5_DOES_NOT_MATCH)) {
            lambda$removeDownload$22(roomDownload);
        }
        return this.downloadsRepository.save(roomDownload);
    }

    @Override // cm.aptoide.pt.downloadmanager.DownloadManager
    public rx.e<List<RoomDownload>> getCurrentActiveDownloads() {
        return this.downloadsRepository.getCurrentActiveDownloads();
    }

    @Override // cm.aptoide.pt.downloadmanager.DownloadManager
    public rx.e<RoomDownload> getCurrentInProgressDownload() {
        return getDownloadsList().J(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.z
            @Override // rx.m.e
            public final Object call(Object obj) {
                List list = (List) obj;
                AptoideDownloadManager.lambda$getCurrentInProgressDownload$9(list);
                return list;
            }
        }).D(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.p0
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1.getOverallDownloadStatus() == 5);
                return valueOf;
            }
        });
    }

    @Override // cm.aptoide.pt.downloadmanager.DownloadManager
    public rx.e<RoomDownload> getDownloadAsObservable(String str) {
        return this.downloadsRepository.getDownloadAsObservable(str).G(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.j1
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AptoideDownloadManager.this.f((RoomDownload) obj);
            }
        }).Q0(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.t
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1.getOverallDownloadStatus() == 1);
                return valueOf;
            }
        });
    }

    @Override // cm.aptoide.pt.downloadmanager.DownloadManager
    public Single<RoomDownload> getDownloadAsSingle(String str) {
        return this.downloadsRepository.getDownloadAsSingle(str).i(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.d0
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AptoideDownloadManager.this.g((RoomDownload) obj);
            }
        });
    }

    @Override // cm.aptoide.pt.downloadmanager.DownloadManager
    public rx.e<RoomDownload> getDownloadsByMd5(String str) {
        return this.downloadsRepository.getDownloadListByMd5(str).G(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.m0
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AptoideDownloadManager.this.i((List) obj);
            }
        }).X(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.l0
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AptoideDownloadManager.lambda$getDownloadsByMd5$7((List) obj);
            }
        }).t().x(new rx.m.b() { // from class: cm.aptoide.pt.downloadmanager.d1
            @Override // rx.m.b
            public final void call(Object obj) {
                Logger.getInstance().d(AptoideDownloadManager.TAG, "passing a download : ");
            }
        });
    }

    @Override // cm.aptoide.pt.downloadmanager.DownloadManager
    public rx.e<List<RoomDownload>> getDownloadsList() {
        return this.downloadsRepository.getAllDownloads();
    }

    @Override // cm.aptoide.pt.downloadmanager.DownloadManager
    public rx.b invalidateDatabase() {
        return getDownloadsList().E().J(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.e1
            @Override // rx.m.e
            public final Object call(Object obj) {
                List list = (List) obj;
                AptoideDownloadManager.lambda$invalidateDatabase$23(list);
                return list;
            }
        }).D(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.f0
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AptoideDownloadManager.this.o((RoomDownload) obj);
            }
        }).H(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.l1
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AptoideDownloadManager.this.p((RoomDownload) obj);
            }
        }).Y0().X0();
    }

    @Override // cm.aptoide.pt.downloadmanager.DownloadManager
    public rx.b pauseAllDownloads() {
        return this.downloadsRepository.getDownloadsInProgress().D(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.w0
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                List list = (List) obj;
                valueOf = Boolean.valueOf(!list.isEmpty());
                return valueOf;
            }
        }).J(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.a0
            @Override // rx.m.e
            public final Object call(Object obj) {
                List list = (List) obj;
                AptoideDownloadManager.lambda$pauseAllDownloads$12(list);
                return list;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.k0
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AptoideDownloadManager.this.q((RoomDownload) obj);
            }
        }).X0();
    }

    @Override // cm.aptoide.pt.downloadmanager.DownloadManager
    public rx.b pauseDownload(String str) {
        return this.downloadsRepository.getDownloadAsObservable(str).E().w(new rx.m.b() { // from class: cm.aptoide.pt.downloadmanager.f1
            @Override // rx.m.b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.c1
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AptoideDownloadManager.this.r((RoomDownload) obj);
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.u
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AptoideDownloadManager.this.s((RoomDownload) obj);
            }
        }).H(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.h1
            @Override // rx.m.e
            public final Object call(Object obj) {
                rx.b pauseAppDownload;
                pauseAppDownload = ((AppDownloader) obj).pauseAppDownload();
                return pauseAppDownload;
            }
        }).X0();
    }

    @Override // cm.aptoide.pt.downloadmanager.DownloadManager
    public rx.b removeDownload(final String str) {
        return this.downloadsRepository.getDownloadAsObservable(str).E().G(new rx.m.e() { // from class: cm.aptoide.pt.downloadmanager.x
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AptoideDownloadManager.this.u(str, (RoomDownload) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.downloadmanager.i1
            @Override // rx.m.b
            public final void call(Object obj) {
                AptoideDownloadManager.this.v((RoomDownload) obj);
            }
        }).X0();
    }

    @Override // cm.aptoide.pt.downloadmanager.DownloadManager
    public synchronized void start() {
        dispatchDownloads();
    }

    @Override // cm.aptoide.pt.downloadmanager.DownloadManager
    public rx.b startDownload(final RoomDownload roomDownload) {
        return rx.b.t(new rx.m.a() { // from class: cm.aptoide.pt.downloadmanager.y0
            @Override // rx.m.a
            public final void call() {
                AptoideDownloadManager.lambda$startDownload$0(RoomDownload.this);
            }
        }).a(this.downloadsRepository.save(roomDownload)).m(new rx.m.a() { // from class: cm.aptoide.pt.downloadmanager.h0
            @Override // rx.m.a
            public final void call() {
                AptoideDownloadManager.this.w(roomDownload);
            }
        });
    }

    @Override // cm.aptoide.pt.downloadmanager.DownloadManager
    public void stop() {
        if (this.dispatchDownloadsSubscription.isUnsubscribed()) {
            return;
        }
        this.dispatchDownloadsSubscription.unsubscribe();
    }
}
