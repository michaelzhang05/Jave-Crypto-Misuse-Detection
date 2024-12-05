package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.OnProgressStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.a.c.a;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import java.io.File;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class y extends q implements OnDownloadStateListener<com.mbridge.msdk.newreward.function.d.a.b>, OnProgressStateListener<com.mbridge.msdk.newreward.function.d.a.b>, a.InterfaceC0409a {

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.b f22202a;

    /* renamed from: b, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.a f22203b;

    /* renamed from: c, reason: collision with root package name */
    private final n f22204c;

    /* renamed from: d, reason: collision with root package name */
    private final String f22205d;

    /* renamed from: e, reason: collision with root package name */
    private final String f22206e;

    /* renamed from: f, reason: collision with root package name */
    private final String f22207f;

    /* renamed from: g, reason: collision with root package name */
    private DownloadMessage f22208g;

    /* renamed from: i, reason: collision with root package name */
    private int f22210i;

    /* renamed from: j, reason: collision with root package name */
    private DownloadRequest f22211j;

    /* renamed from: k, reason: collision with root package name */
    private String f22212k;

    /* renamed from: l, reason: collision with root package name */
    private x f22213l;

    /* renamed from: m, reason: collision with root package name */
    private String f22214m;

    /* renamed from: o, reason: collision with root package name */
    private boolean f22216o;

    /* renamed from: h, reason: collision with root package name */
    private boolean f22209h = false;

    /* renamed from: n, reason: collision with root package name */
    private volatile boolean f22215n = false;

    public y(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, n nVar, int i8) {
        this.f22216o = false;
        this.f22202a = bVar;
        this.f22203b = aVar;
        this.f22204c = nVar;
        this.f22210i = i8;
        String j8 = nVar.j();
        this.f22205d = j8;
        String str = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_VC) + File.separator;
        this.f22206e = str;
        String a8 = com.mbridge.msdk.newreward.function.h.a.a(j8);
        this.f22207f = a8;
        this.f22214m = str + a8;
        nVar.a(new File(this.f22214m));
        nVar.a(true);
        File file = new File(this.f22214m);
        if (file.exists() && file.isFile()) {
            this.f22216o = true;
            nVar.a(1);
            nVar.b(true);
            nVar.a(false);
        }
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.p
    public final void a(int i8, x xVar) {
        int i9;
        this.f22213l = xVar;
        if (TextUtils.isEmpty(this.f22205d)) {
            if (this.f22204c.c()) {
                x xVar2 = this.f22213l;
                if (xVar2 != null) {
                    xVar2.a(this.f22202a, this.f22203b, this);
                    this.f22213l.b(this.f22202a, this.f22203b, this);
                    return;
                }
                return;
            }
            x xVar3 = this.f22213l;
            if (xVar3 != null) {
                xVar3.a(this.f22202a, this.f22203b, this);
                this.f22213l.a(this.f22202a, this.f22203b, this, new MBridgeError(5, MBridgeError.ERROR_MESSAGE_DOWNLOAD_RESOURCE_URL_ERROR));
                return;
            }
            return;
        }
        if (this.f22216o) {
            x xVar4 = this.f22213l;
            if (xVar4 != null) {
                xVar4.a(this.f22202a, this.f22203b, this);
                this.f22213l.b(this.f22202a, this.f22203b, this);
                return;
            }
            return;
        }
        this.f22215n = false;
        int v8 = this.f22202a.v();
        this.f22212k = UUID.randomUUID().toString();
        int videoCtnType = this.f22203b.g().getVideoCtnType();
        if (i8 == 1 || (i9 = this.f22210i) == 100) {
            this.f22209h = false;
            this.f22208g = new DownloadMessage(this.f22202a, this.f22205d, this.f22207f, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
        } else if (videoCtnType == 1) {
            this.f22209h = false;
            this.f22208g = new DownloadMessage(this.f22202a, this.f22205d, this.f22207f, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
        } else {
            this.f22209h = true;
            this.f22208g = new DownloadMessage(this.f22202a, this.f22205d, this.f22207f, i9, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f22212k, v8, this);
        DownloadRequest build = MBDownloadManager.getInstance().download(this.f22208g).withReadTimeout(WorkRequest.MIN_BACKOFF_MILLIS).withConnectTimeout(WorkRequest.MIN_BACKOFF_MILLIS).withWriteTimeout(WorkRequest.MIN_BACKOFF_MILLIS).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(5).withDirectoryPathInternal(this.f22206e).withDownloadStateListener(this).withProgressStateListener(this).with("do_us_fi_re", Boolean.toString(true)).build();
        this.f22211j = build;
        build.start();
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onCancelDownload(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onCancelDownload taskID: " + this.f22212k);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f22212k);
        if (this.f22215n) {
            x xVar = this.f22213l;
            if (xVar != null) {
                xVar.b(this.f22202a, this.f22203b, this, new MBridgeError(4, MBridgeError.ERROR_MESSAGE_DOWNLOAD_DOWNLOAD_TIMEOUT));
                return;
            }
            return;
        }
        x xVar2 = this.f22213l;
        if (xVar2 != null) {
            xVar2.a(this.f22202a, this.f22203b, this, new MBridgeError(2, MBridgeError.ERROR_MESSAGE_DOWNLOAD_NETWORK_ERROR));
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadComplete(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        int i8;
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onDownloadComplete taskID: " + this.f22212k);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f22212k);
        String str = this.f22211j.get("cache", "2");
        n nVar = this.f22204c;
        int i9 = 2;
        if (TextUtils.equals(str, "2")) {
            i8 = 2;
        } else {
            i8 = 1;
        }
        nVar.a(i8);
        this.f22204c.b(true);
        this.f22204c.a(false);
        n nVar2 = this.f22204c;
        if (!TextUtils.equals(this.f22211j.get("cache", "2"), "2")) {
            i9 = 1;
        }
        nVar2.a(i9);
        x xVar = this.f22213l;
        if (xVar != null) {
            xVar.b(this.f22202a, this.f22203b, this);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadError(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadError downloadError) {
        int i8;
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onDownloadError taskID: " + this.f22212k);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f22212k);
        String str = this.f22211j.get("cache", "2");
        n nVar = this.f22204c;
        if (TextUtils.equals(str, "2")) {
            i8 = 2;
        } else {
            i8 = 1;
        }
        nVar.a(i8);
        this.f22204c.b(false);
        this.f22204c.a(false);
        MBridgeError mBridgeError = new MBridgeError(2, MBridgeError.ERROR_MESSAGE_DOWNLOAD_VIDEO_ERROR);
        mBridgeError.setException(downloadError.getException());
        x xVar = this.f22213l;
        if (xVar != null) {
            xVar.a(this.f22202a, this.f22203b, this, mBridgeError);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadStart(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onDownloadStart taskID: " + this.f22212k);
        }
        x xVar = this.f22213l;
        if (xVar != null) {
            xVar.a(this.f22202a, this.f22203b, this);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
    public final void onProgress(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadProgress downloadProgress) {
        int i8;
        if (downloadProgress.getCurrentDownloadRate() >= this.f22210i) {
            String str = this.f22211j.get("cache", "2");
            n nVar = this.f22204c;
            if (TextUtils.equals(str, "2")) {
                i8 = 2;
            } else {
                i8 = 1;
            }
            nVar.a(i8);
            this.f22204c.b(true);
            this.f22204c.a(false);
            if (this.f22209h) {
                this.f22211j.cancel(downloadMessage);
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.a.c.a.InterfaceC0409a
    public final void a(String str, long j8) {
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onTimeout taskID: " + str);
        }
        if (this.f22211j != null) {
            this.f22215n = true;
            this.f22211j.cancel(this.f22208g);
        }
    }
}
