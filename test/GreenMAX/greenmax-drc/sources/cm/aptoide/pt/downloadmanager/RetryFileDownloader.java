package cm.aptoide.pt.downloadmanager;

/* loaded from: classes.dex */
public interface RetryFileDownloader {
    rx.e<FileDownloadCallback> observeFileDownloadProgress();

    rx.b pauseDownload();

    rx.b removeDownloadFile();

    void startFileDownload();

    void stop();

    void stopFailedDownload();
}
