package cm.aptoide.pt.downloadmanager;

import cm.aptoide.pt.database.room.RoomDownload;

/* loaded from: classes.dex */
public interface DownloadAnalytics {
    void onDownloadComplete(String str, String str2, int i2);

    void onError(String str, int i2, String str2, Throwable th);

    void startProgress(RoomDownload roomDownload);
}
