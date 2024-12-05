package cm.aptoide.pt.downloadmanager;

import cm.aptoide.pt.downloadmanager.AppDownloadStatus;

/* loaded from: classes.dex */
public interface FileDownloadCallback {
    FileDownloadProgressResult getDownloadProgress();

    AppDownloadStatus.AppDownloadState getDownloadState();

    Throwable getError();

    String getMd5();

    boolean hasError();
}
