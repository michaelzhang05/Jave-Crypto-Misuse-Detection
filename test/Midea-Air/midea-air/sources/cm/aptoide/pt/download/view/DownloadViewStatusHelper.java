package cm.aptoide.pt.download.view;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import cm.aptoide.aptoideviews.downloadprogressview.DownloadEventListener;
import cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView;
import cm.aptoide.pt.R;
import cm.aptoide.pt.download.DownloadAnalytics;
import cm.aptoide.pt.download.view.DownloadStatusModel;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: DownloadViewStatusHelper.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J \u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J,\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J,\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001b"}, d2 = {"Lcm/aptoide/pt/download/view/DownloadViewStatusHelper;", HttpUrl.FRAGMENT_ENCODE_SET, "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setDownloadButtonText", HttpUrl.FRAGMENT_ENCODE_SET, "action", "Lcm/aptoide/pt/download/view/DownloadStatusModel$Action;", "installButton", "Landroid/widget/Button;", "setDownloadState", "downloadProgressView", "Lcm/aptoide/aptoideviews/downloadprogressview/DownloadProgressView;", "progress", HttpUrl.FRAGMENT_ENCODE_SET, "downloadState", "Lcm/aptoide/pt/download/view/DownloadStatusModel$DownloadState;", "setDownloadStatus", DownloadAnalytics.RAKAM_DOWNLOAD_EVENT, "Lcm/aptoide/pt/download/view/Download;", "downloadClickSubject", "Lrx/subjects/PublishSubject;", "Lcm/aptoide/pt/download/view/DownloadClick;", "setupListeners", "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DownloadViewStatusHelper {
    private final Context context;

    /* compiled from: DownloadViewStatusHelper.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DownloadStatusModel.Action.values().length];
            iArr[DownloadStatusModel.Action.UPDATE.ordinal()] = 1;
            iArr[DownloadStatusModel.Action.INSTALL.ordinal()] = 2;
            iArr[DownloadStatusModel.Action.OPEN.ordinal()] = 3;
            iArr[DownloadStatusModel.Action.DOWNGRADE.ordinal()] = 4;
            iArr[DownloadStatusModel.Action.MIGRATE.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DownloadStatusModel.DownloadState.values().length];
            iArr2[DownloadStatusModel.DownloadState.ACTIVE.ordinal()] = 1;
            iArr2[DownloadStatusModel.DownloadState.INSTALLING.ordinal()] = 2;
            iArr2[DownloadStatusModel.DownloadState.PAUSE.ordinal()] = 3;
            iArr2[DownloadStatusModel.DownloadState.IN_QUEUE.ordinal()] = 4;
            iArr2[DownloadStatusModel.DownloadState.STANDBY.ordinal()] = 5;
            iArr2[DownloadStatusModel.DownloadState.GENERIC_ERROR.ordinal()] = 6;
            iArr2[DownloadStatusModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR.ordinal()] = 7;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public DownloadViewStatusHelper(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.context = context;
    }

    private final void setDownloadButtonText(DownloadStatusModel.Action action, Button installButton) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
        if (i2 == 1) {
            installButton.setText(this.context.getString(R.string.appview_button_update));
            return;
        }
        if (i2 == 2) {
            installButton.setText(this.context.getString(R.string.appview_button_install));
            return;
        }
        if (i2 == 3) {
            installButton.setText(this.context.getString(R.string.appview_button_open));
        } else if (i2 == 4) {
            installButton.setText(this.context.getString(R.string.appview_button_downgrade));
        } else {
            if (i2 != 5) {
                return;
            }
            installButton.setText(this.context.getString(R.string.promo_update2appc_appview_update_button));
        }
    }

    private final void setDownloadState(DownloadProgressView downloadProgressView, int progress, DownloadStatusModel.DownloadState downloadState) {
        int i2 = WhenMappings.$EnumSwitchMapping$1[downloadState.ordinal()];
        if (i2 == 1) {
            downloadProgressView.startDownload();
        } else if (i2 == 2) {
            downloadProgressView.startInstallation();
        } else if (i2 == 3) {
            downloadProgressView.pauseDownload();
        } else if (i2 == 4 || i2 == 5) {
            downloadProgressView.reset();
        }
        downloadProgressView.setProgress(progress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupListeners$lambda-0, reason: not valid java name */
    public static final void m109setupListeners$lambda0(rx.s.b bVar, Download download, View view) {
        kotlin.jvm.internal.l.f(bVar, "$downloadClickSubject");
        kotlin.jvm.internal.l.f(download, "$download");
        bVar.onNext(new DownloadClick(download, DownloadEvent.INSTALL));
    }

    public final Context getContext() {
        return this.context;
    }

    public final void setDownloadStatus(Download download, Button button, DownloadProgressView downloadProgressView, rx.s.b<DownloadClick> bVar) {
        kotlin.jvm.internal.l.f(download, DownloadAnalytics.RAKAM_DOWNLOAD_EVENT);
        kotlin.jvm.internal.l.f(button, "installButton");
        kotlin.jvm.internal.l.f(downloadProgressView, "downloadProgressView");
        kotlin.jvm.internal.l.f(bVar, "downloadClickSubject");
        DownloadStatusModel downloadModel = download.getDownloadModel();
        if (downloadModel != null) {
            if (downloadModel.getDownloadState() == DownloadStatusModel.DownloadState.GENERIC_ERROR) {
                bVar.onNext(new DownloadClick(download, DownloadEvent.GENERIC_ERROR));
            } else if (downloadModel.getDownloadState() == DownloadStatusModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR) {
                bVar.onNext(new DownloadClick(download, DownloadEvent.OUT_OF_SPACE_ERROR));
            }
        }
        DownloadStatusModel downloadModel2 = download.getDownloadModel();
        if (downloadModel2 != null) {
            if (downloadModel2.isDownloadingOrInstalling()) {
                setDownloadState(downloadProgressView, downloadModel2.getProgress(), downloadModel2.getDownloadState());
                button.setVisibility(8);
                downloadProgressView.setVisibility(0);
            } else {
                setDownloadButtonText(downloadModel2.getAction(), button);
                downloadProgressView.setVisibility(8);
                button.setVisibility(0);
            }
        }
    }

    public final void setupListeners(final Download download, final rx.s.b<DownloadClick> bVar, Button button, DownloadProgressView downloadProgressView) {
        kotlin.jvm.internal.l.f(download, DownloadAnalytics.RAKAM_DOWNLOAD_EVENT);
        kotlin.jvm.internal.l.f(bVar, "downloadClickSubject");
        kotlin.jvm.internal.l.f(button, "installButton");
        kotlin.jvm.internal.l.f(downloadProgressView, "downloadProgressView");
        button.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.download.view.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadViewStatusHelper.m109setupListeners$lambda0(rx.s.b.this, download, view);
            }
        });
        downloadProgressView.setEventListener(new DownloadEventListener() { // from class: cm.aptoide.pt.download.view.DownloadViewStatusHelper$setupListeners$2

            /* compiled from: DownloadViewStatusHelper.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            /* loaded from: classes.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[DownloadEventListener.Action.Type.values().length];
                    iArr[DownloadEventListener.Action.Type.CANCEL.ordinal()] = 1;
                    iArr[DownloadEventListener.Action.Type.RESUME.ordinal()] = 2;
                    iArr[DownloadEventListener.Action.Type.PAUSE.ordinal()] = 3;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // cm.aptoide.aptoideviews.downloadprogressview.DownloadEventListener
            public void onActionClick(DownloadEventListener.Action action) {
                kotlin.jvm.internal.l.f(action, "action");
                int i2 = WhenMappings.$EnumSwitchMapping$0[action.getType().ordinal()];
                if (i2 == 1) {
                    bVar.onNext(new DownloadClick(download, DownloadEvent.CANCEL));
                } else if (i2 == 2) {
                    bVar.onNext(new DownloadClick(download, DownloadEvent.RESUME));
                } else {
                    if (i2 != 3) {
                        return;
                    }
                    bVar.onNext(new DownloadClick(download, DownloadEvent.PAUSE));
                }
            }
        });
    }
}
