package cm.aptoide.pt.downloadmanager;

import cm.aptoide.pt.logger.Logger;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class AppDownloadStatus {
    private static final int PROGRESS_MAX_VALUE = 100;
    private AppDownloadState appDownloadState;
    private long downloadSize;
    private List<FileDownloadCallback> fileDownloadCallbackList;
    private String md5;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cm.aptoide.pt.downloadmanager.AppDownloadStatus$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$downloadmanager$AppDownloadStatus$AppDownloadState;

        static {
            int[] iArr = new int[AppDownloadState.values().length];
            $SwitchMap$cm$aptoide$pt$downloadmanager$AppDownloadStatus$AppDownloadState = iArr;
            try {
                iArr[AppDownloadState.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$downloadmanager$AppDownloadStatus$AppDownloadState[AppDownloadState.ERROR_MD5_DOES_NOT_MATCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$downloadmanager$AppDownloadStatus$AppDownloadState[AppDownloadState.ERROR_FILE_NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$downloadmanager$AppDownloadStatus$AppDownloadState[AppDownloadState.ERROR_NOT_ENOUGH_SPACE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$downloadmanager$AppDownloadStatus$AppDownloadState[AppDownloadState.WARN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$downloadmanager$AppDownloadStatus$AppDownloadState[AppDownloadState.PAUSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$downloadmanager$AppDownloadStatus$AppDownloadState[AppDownloadState.INVALID_STATUS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$downloadmanager$AppDownloadStatus$AppDownloadState[AppDownloadState.VERIFYING_FILE_INTEGRITY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$downloadmanager$AppDownloadStatus$AppDownloadState[AppDownloadState.COMPLETED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$downloadmanager$AppDownloadStatus$AppDownloadState[AppDownloadState.PENDING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum AppDownloadState {
        INVALID_STATUS,
        COMPLETED,
        PENDING,
        PAUSED,
        WARN,
        ERROR,
        ERROR_FILE_NOT_FOUND,
        ERROR_NOT_ENOUGH_SPACE,
        ERROR_MD5_DOES_NOT_MATCH,
        PROGRESS,
        WAITING_TO_MOVE_FILES,
        VERIFYING_FILE_INTEGRITY
    }

    public AppDownloadStatus(String str, List<FileDownloadCallback> list, AppDownloadState appDownloadState, long j2) {
        this.md5 = str;
        this.fileDownloadCallbackList = list;
        this.appDownloadState = appDownloadState;
        this.downloadSize = j2;
    }

    private int calculateProgressByFileNumber(int i2) {
        return this.fileDownloadCallbackList.size() > 0 ? i2 / this.fileDownloadCallbackList.size() : i2;
    }

    private int calculateProgressByFileSize(long j2) {
        double d2 = j2;
        double d3 = this.downloadSize;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return (int) ((d2 / d3) * 100.0d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0025. Please report as an issue. */
    private AppDownloadState getAppDownloadState() {
        AppDownloadState appDownloadState = null;
        for (FileDownloadCallback fileDownloadCallback : this.fileDownloadCallbackList) {
            if (fileDownloadCallback.getDownloadState() != null) {
                switch (AnonymousClass1.$SwitchMap$cm$aptoide$pt$downloadmanager$AppDownloadStatus$AppDownloadState[fileDownloadCallback.getDownloadState().ordinal()]) {
                    case 1:
                        return AppDownloadState.ERROR;
                    case 2:
                        return AppDownloadState.ERROR_MD5_DOES_NOT_MATCH;
                    case 3:
                        return AppDownloadState.ERROR_FILE_NOT_FOUND;
                    case 4:
                        return AppDownloadState.ERROR_NOT_ENOUGH_SPACE;
                    case 5:
                        return AppDownloadState.WARN;
                    case 6:
                        return AppDownloadState.PAUSED;
                    case 7:
                        return AppDownloadState.INVALID_STATUS;
                    case 8:
                        if (appDownloadState != null && appDownloadState != AppDownloadState.VERIFYING_FILE_INTEGRITY && appDownloadState != AppDownloadState.COMPLETED) {
                            return AppDownloadState.PROGRESS;
                        }
                        if (this.fileDownloadCallbackList.indexOf(fileDownloadCallback) == this.fileDownloadCallbackList.size() - 1) {
                            return AppDownloadState.VERIFYING_FILE_INTEGRITY;
                        }
                        appDownloadState = fileDownloadCallback.getDownloadState();
                        break;
                    case 9:
                        if (appDownloadState != null && appDownloadState != AppDownloadState.COMPLETED) {
                            return AppDownloadState.PROGRESS;
                        }
                        if (this.fileDownloadCallbackList.indexOf(fileDownloadCallback) == this.fileDownloadCallbackList.size() - 1) {
                            Logger.getInstance().d("AppDownloadState", "emitting APPDOWNLOADSTATE completed " + this.md5);
                            return AppDownloadState.COMPLETED;
                        }
                        appDownloadState = fileDownloadCallback.getDownloadState();
                        break;
                        break;
                    case 10:
                        if (appDownloadState != null && appDownloadState != AppDownloadState.PENDING) {
                            return AppDownloadState.PROGRESS;
                        }
                        if (this.fileDownloadCallbackList.indexOf(fileDownloadCallback) == this.fileDownloadCallbackList.size() - 1) {
                            return AppDownloadState.PENDING;
                        }
                        appDownloadState = fileDownloadCallback.getDownloadState();
                        break;
                    default:
                        appDownloadState = fileDownloadCallback.getDownloadState();
                        break;
                }
            }
        }
        return AppDownloadState.PROGRESS;
    }

    private FileDownloadCallback getFileDownloadCallback(String str) {
        for (FileDownloadCallback fileDownloadCallback : this.fileDownloadCallbackList) {
            if (fileDownloadCallback.getMd5().equals(str)) {
                return fileDownloadCallback;
            }
        }
        return null;
    }

    private int getFileDownloadProgressAsPercentage(FileDownloadCallback fileDownloadCallback) {
        double downloadedBytes = fileDownloadCallback.getDownloadProgress().getDownloadedBytes();
        double totalFileBytes = fileDownloadCallback.getDownloadProgress().getTotalFileBytes();
        Double.isNaN(downloadedBytes);
        Double.isNaN(totalFileBytes);
        return (int) Math.floor((downloadedBytes / totalFileBytes) * 100.0d);
    }

    private long getOverallProgressAsBytes() {
        Iterator<FileDownloadCallback> it = this.fileDownloadCallbackList.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            j2 += it.next().getDownloadProgress().getDownloadedBytes();
        }
        return j2;
    }

    private int getOverallProgressAsPercentage() {
        Iterator<FileDownloadCallback> it = this.fileDownloadCallbackList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += getFileDownloadProgressAsPercentage(it.next());
        }
        return i2;
    }

    private void refreshAppDownloadState() {
        this.appDownloadState = getAppDownloadState();
    }

    public AppDownloadState getDownloadStatus() {
        return this.appDownloadState;
    }

    public int getFileDownloadProgress(String str) {
        FileDownloadCallback fileDownloadCallback = getFileDownloadCallback(str);
        if (fileDownloadCallback == null) {
            return 0;
        }
        return getFileDownloadProgressAsPercentage(fileDownloadCallback);
    }

    public AppDownloadState getFileDownloadStatus(String str) {
        FileDownloadCallback fileDownloadCallback = getFileDownloadCallback(str);
        if (fileDownloadCallback == null) {
            return AppDownloadState.PROGRESS;
        }
        return fileDownloadCallback.getDownloadState();
    }

    public String getMd5() {
        return this.md5;
    }

    public int getOverallProgress() {
        if (this.downloadSize == 0) {
            return calculateProgressByFileNumber(getOverallProgressAsPercentage());
        }
        return calculateProgressByFileSize(getOverallProgressAsBytes());
    }

    public void setFileDownloadCallback(FileDownloadCallback fileDownloadCallback) {
        if (!this.fileDownloadCallbackList.contains(fileDownloadCallback)) {
            this.fileDownloadCallbackList.add(fileDownloadCallback);
        } else {
            this.fileDownloadCallbackList.set(this.fileDownloadCallbackList.indexOf(fileDownloadCallback), fileDownloadCallback);
        }
        refreshAppDownloadState();
    }
}
