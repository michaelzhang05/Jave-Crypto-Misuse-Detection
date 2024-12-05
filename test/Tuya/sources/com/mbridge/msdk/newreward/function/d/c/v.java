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
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.newreward.a.c.a;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class v extends q implements OnDownloadStateListener<com.mbridge.msdk.newreward.function.d.a.b>, OnProgressStateListener<com.mbridge.msdk.newreward.function.d.a.b>, a.InterfaceC0413a {

    /* renamed from: a, reason: collision with root package name */
    private final String f21131a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21132b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21133c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.d.a.b f21134d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.d.a.a f21135e;

    /* renamed from: f, reason: collision with root package name */
    private c f21136f;

    /* renamed from: g, reason: collision with root package name */
    private String f21137g;

    /* renamed from: h, reason: collision with root package name */
    private DownloadMessage f21138h;

    /* renamed from: i, reason: collision with root package name */
    private DownloadRequest f21139i;

    /* renamed from: j, reason: collision with root package name */
    private String f21140j;

    /* renamed from: k, reason: collision with root package name */
    private x f21141k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21142l;

    /* renamed from: m, reason: collision with root package name */
    private String f21143m;

    public v(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, c cVar) {
        this.f21142l = false;
        this.f21134d = bVar;
        this.f21135e = aVar;
        this.f21136f = cVar;
        this.f21137g = cVar.j();
        String a8 = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_RES);
        String md5 = SameMD5.getMD5(ao.b(this.f21137g));
        this.f21131a = md5;
        this.f21132b = a8 + "/";
        this.f21133c = a8 + "/" + md5;
        this.f21136f.a(true);
        String resDirFromCampaign = ResourceManager.getinstance().getResDirFromCampaign(this.f21137g);
        if (!TextUtils.isEmpty(resDirFromCampaign)) {
            this.f21142l = true;
            this.f21136f.a(1);
            this.f21136f.a(resDirFromCampaign);
            this.f21136f.b(true);
            this.f21136f.a(false);
        }
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.p
    public final void a(int i8, x xVar) {
        this.f21141k = xVar;
        int v8 = this.f21134d.v();
        this.f21140j = UUID.randomUUID().toString();
        if (xVar != null) {
            xVar.a(this.f21134d, this.f21135e, this);
        }
        if (this.f21142l) {
            x xVar2 = this.f21141k;
            if (xVar2 != null) {
                xVar2.b(this.f21134d, this.f21135e, this);
                return;
            }
            return;
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f21140j, v8, this);
        String str = this.f21131a + ".zip";
        this.f21143m = this.f21132b + str;
        this.f21138h = new DownloadMessage(this.f21134d, this.f21137g, str, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_ZIP);
        DownloadRequest build = MBDownloadManager.getInstance().download(this.f21138h).withReadTimeout(WorkRequest.MIN_BACKOFF_MILLIS).withConnectTimeout(WorkRequest.MIN_BACKOFF_MILLIS).withWriteTimeout(WorkRequest.MIN_BACKOFF_MILLIS).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(5).withDirectoryPathInternal(this.f21132b).withDownloadStateListener(this).withProgressStateListener(this).with("do_us_fi_re", Boolean.toString(true)).build();
        this.f21139i = build;
        build.start();
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onCancelDownload(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        int i8;
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onCancelDownload: " + downloadMessage);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f21140j);
        String str = this.f21139i.get("cache", "2");
        c cVar = this.f21136f;
        if (TextUtils.equals(str, "2")) {
            i8 = 2;
        } else {
            i8 = 1;
        }
        cVar.a(i8);
        this.f21136f.b(false);
        this.f21136f.a(false);
        if (this.f21136f.c()) {
            x xVar = this.f21141k;
            if (xVar != null) {
                xVar.b(this.f21134d, this.f21135e, this);
                return;
            }
            return;
        }
        x xVar2 = this.f21141k;
        if (xVar2 != null) {
            xVar2.a(this.f21134d, this.f21135e, this, new MBridgeError(4, MBridgeError.ERROR_MESSAGE_DOWNLOAD_DOWNLOAD_TIMEOUT));
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadComplete(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        x xVar;
        com.mbridge.msdk.newreward.function.d.a.b bVar;
        com.mbridge.msdk.newreward.function.d.a.a aVar;
        MBridgeError mBridgeError;
        x xVar2;
        int i8;
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onDownloadComplete: " + downloadMessage);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f21140j);
        try {
            try {
                MBResourceManager.getInstance().unZip(this.f21143m, this.f21133c);
                String resDirFromCampaign = ResourceManager.getinstance().getResDirFromCampaign(this.f21137g);
                if (!TextUtils.isEmpty(resDirFromCampaign)) {
                    String str = this.f21139i.get("cache", "2");
                    c cVar = this.f21136f;
                    if (TextUtils.equals(str, "2")) {
                        i8 = 2;
                    } else {
                        i8 = 1;
                    }
                    cVar.a(i8);
                    this.f21136f.b(true);
                    this.f21136f.a(false);
                    this.f21136f.a(2);
                    this.f21136f.a(resDirFromCampaign);
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("MBridgeDownloader", "onDownloadComplete.unZip: " + e8.getMessage());
                }
                if (this.f21136f.c()) {
                    xVar2 = this.f21141k;
                    if (xVar2 == null) {
                        return;
                    }
                } else {
                    xVar = this.f21141k;
                    if (xVar != null) {
                        bVar = this.f21134d;
                        aVar = this.f21135e;
                        mBridgeError = new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR);
                    } else {
                        return;
                    }
                }
            }
            if (this.f21136f.c()) {
                xVar2 = this.f21141k;
                if (xVar2 == null) {
                    return;
                }
                xVar2.b(this.f21134d, this.f21135e, this);
                return;
            }
            xVar = this.f21141k;
            if (xVar != null) {
                bVar = this.f21134d;
                aVar = this.f21135e;
                mBridgeError = new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR);
                xVar.a(bVar, aVar, this, mBridgeError);
            }
        } catch (Throwable th) {
            if (this.f21136f.c()) {
                x xVar3 = this.f21141k;
                if (xVar3 != null) {
                    xVar3.b(this.f21134d, this.f21135e, this);
                }
            } else {
                x xVar4 = this.f21141k;
                if (xVar4 != null) {
                    xVar4.a(this.f21134d, this.f21135e, this, new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR));
                }
            }
            throw th;
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadError(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadError downloadError) {
        int i8;
        String str;
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f21140j);
        String str2 = this.f21139i.get("cache", "2");
        c cVar = this.f21136f;
        if (TextUtils.equals(str2, "2")) {
            i8 = 2;
        } else {
            i8 = 1;
        }
        cVar.a(i8);
        this.f21136f.b(false);
        this.f21136f.a(false);
        if (this.f21136f.c()) {
            x xVar = this.f21141k;
            if (xVar != null) {
                xVar.b(this.f21134d, this.f21135e, this);
                return;
            }
            return;
        }
        if (this.f21141k != null) {
            c cVar2 = this.f21136f;
            if (cVar2 != null) {
                int h8 = cVar2.h();
                if (h8 != 2) {
                    if (h8 != 3) {
                        if (h8 == 4) {
                            str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_EC_TEMPLATE_ERROR;
                        }
                    } else {
                        str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_BIG_TEMPLATE_ERROR;
                    }
                } else {
                    str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_VIDEO_TEMPLATE_ERROR;
                }
                MBridgeError mBridgeError = new MBridgeError(2, str);
                mBridgeError.setException(downloadError.getException());
                this.f21141k.a(this.f21134d, this.f21135e, this, mBridgeError);
            }
            str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_NETWORK_ERROR;
            MBridgeError mBridgeError2 = new MBridgeError(2, str);
            mBridgeError2.setException(downloadError.getException());
            this.f21141k.a(this.f21134d, this.f21135e, this, mBridgeError2);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadStart(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
    }

    @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
    public final void onProgress(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadProgress downloadProgress) {
    }

    @Override // com.mbridge.msdk.newreward.a.c.a.InterfaceC0413a
    public final void a(String str, long j8) {
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onTimeout: " + str);
        }
        DownloadRequest downloadRequest = this.f21139i;
        if (downloadRequest != null) {
            downloadRequest.cancel(this.f21138h);
        }
    }
}
