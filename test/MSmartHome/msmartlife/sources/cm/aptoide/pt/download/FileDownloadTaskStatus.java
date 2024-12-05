package cm.aptoide.pt.download;

import cm.aptoide.pt.downloadmanager.AppDownloadStatus;
import cm.aptoide.pt.downloadmanager.FileDownloadCallback;
import cm.aptoide.pt.downloadmanager.FileDownloadProgressResult;

/* loaded from: classes.dex */
public class FileDownloadTaskStatus implements FileDownloadCallback {
    private AppDownloadStatus.AppDownloadState appDownloadState;
    private FileDownloadProgressResult downloadProgress;
    private Throwable error;
    private String md5;

    public FileDownloadTaskStatus(AppDownloadStatus.AppDownloadState appDownloadState, FileDownloadProgressResult fileDownloadProgressResult, String str) {
        this.appDownloadState = appDownloadState;
        this.downloadProgress = fileDownloadProgressResult;
        this.md5 = str;
        this.error = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.md5.equals(((FileDownloadTaskStatus) obj).getMd5());
    }

    @Override // cm.aptoide.pt.downloadmanager.FileDownloadCallback
    public FileDownloadProgressResult getDownloadProgress() {
        return this.downloadProgress;
    }

    @Override // cm.aptoide.pt.downloadmanager.FileDownloadCallback
    public AppDownloadStatus.AppDownloadState getDownloadState() {
        return this.appDownloadState;
    }

    @Override // cm.aptoide.pt.downloadmanager.FileDownloadCallback
    public Throwable getError() {
        return this.error;
    }

    @Override // cm.aptoide.pt.downloadmanager.FileDownloadCallback
    public String getMd5() {
        return this.md5;
    }

    @Override // cm.aptoide.pt.downloadmanager.FileDownloadCallback
    public boolean hasError() {
        return this.error != null;
    }

    public FileDownloadTaskStatus(AppDownloadStatus.AppDownloadState appDownloadState, String str, Throwable th) {
        this.appDownloadState = appDownloadState;
        this.md5 = str;
        this.error = th;
        this.downloadProgress = new FileDownloadProgressResult(0L, 0L);
    }
}
