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
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.a.c.a;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import java.io.File;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
abstract class r extends q implements OnDownloadStateListener<com.mbridge.msdk.newreward.function.d.a.b>, OnProgressStateListener<com.mbridge.msdk.newreward.function.d.a.b>, a.InterfaceC0413a {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.d.a.b f21119a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.d.a.a f21120b;

    /* renamed from: c, reason: collision with root package name */
    private b f21121c;

    /* renamed from: d, reason: collision with root package name */
    private String f21122d;

    /* renamed from: e, reason: collision with root package name */
    private String f21123e;

    /* renamed from: f, reason: collision with root package name */
    private DownloadMessage f21124f;

    /* renamed from: g, reason: collision with root package name */
    private DownloadRequest f21125g;

    /* renamed from: h, reason: collision with root package name */
    private String f21126h;

    /* renamed from: i, reason: collision with root package name */
    private String f21127i;

    /* renamed from: j, reason: collision with root package name */
    private x f21128j;

    /* renamed from: k, reason: collision with root package name */
    private String f21129k = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_XML) + File.separator;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21130l;

    /* JADX INFO: Access modifiers changed from: protected */
    public r(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, b bVar2) {
        this.f21130l = false;
        this.f21119a = bVar;
        this.f21120b = aVar;
        this.f21121c = bVar2;
        this.f21122d = bVar2.j();
        String a8 = com.mbridge.msdk.newreward.function.h.a.a(this.f21122d);
        this.f21123e = a8;
        this.f21127i = this.f21129k + a8.replace(".zip", "").replace(".xml", "");
        this.f21121c.a(true);
        File a9 = a(this.f21127i);
        if (a9 != null && a9.exists()) {
            this.f21130l = true;
            this.f21121c.a(1);
            this.f21121c.a(a9);
            this.f21121c.b(true);
            this.f21121c.a(false);
        }
    }

    protected abstract String a();

    @Override // com.mbridge.msdk.newreward.function.d.c.p
    public void a(int i8, x xVar) {
        this.f21128j = xVar;
        if (xVar != null) {
            xVar.a(this.f21119a, this.f21120b, this);
        }
        if (this.f21130l) {
            if (xVar != null) {
                xVar.b(this.f21119a, this.f21120b, this);
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(this.f21122d)) {
            if (this.f21121c.c()) {
                if (xVar != null) {
                    xVar.b(this.f21119a, this.f21120b, this);
                    return;
                }
                return;
            } else {
                if (xVar != null) {
                    xVar.a(this.f21119a, this.f21120b, this, new MBridgeError(5, MBridgeError.ERROR_MESSAGE_DOWNLOAD_RESOURCE_URL_ERROR));
                    return;
                }
                return;
            }
        }
        int v8 = this.f21119a.v();
        this.f21126h = UUID.randomUUID().toString();
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f21126h, v8, this);
        this.f21124f = new DownloadMessage(this.f21119a, this.f21122d, this.f21123e, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_ZIP);
        DownloadRequest build = MBDownloadManager.getInstance().download(this.f21124f).withReadTimeout(WorkRequest.MIN_BACKOFF_MILLIS).withConnectTimeout(WorkRequest.MIN_BACKOFF_MILLIS).withWriteTimeout(WorkRequest.MIN_BACKOFF_MILLIS).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(5).withDirectoryPathInternal(this.f21129k).withDownloadStateListener(this).withProgressStateListener(this).with("do_us_fi_re", Boolean.toString(true)).build();
        this.f21125g = build;
        build.start();
    }

    public com.mbridge.msdk.newreward.function.d.a.a b() {
        return this.f21120b;
    }

    public com.mbridge.msdk.newreward.function.d.a.b c() {
        return this.f21119a;
    }

    public a<?> d() {
        return this.f21121c;
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onCancelDownload(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        int i8;
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onCancelDownload:  " + d().j());
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f21126h);
        String str = this.f21125g.get("cache", "2");
        b bVar = this.f21121c;
        if (TextUtils.equals(str, "2")) {
            i8 = 2;
        } else {
            i8 = 1;
        }
        bVar.a(i8);
        this.f21121c.b(false);
        this.f21121c.a(false);
        if (this.f21121c.c()) {
            x xVar = this.f21128j;
            if (xVar != null) {
                xVar.b(this.f21119a, this.f21120b, this);
                return;
            }
            return;
        }
        x xVar2 = this.f21128j;
        if (xVar2 != null) {
            xVar2.a(this.f21119a, this.f21120b, this, new MBridgeError(4, MBridgeError.ERROR_MESSAGE_DOWNLOAD_DOWNLOAD_TIMEOUT));
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onDownloadComplete(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        x xVar;
        com.mbridge.msdk.newreward.function.d.a.b bVar;
        com.mbridge.msdk.newreward.function.d.a.a aVar;
        MBridgeError mBridgeError;
        x xVar2;
        int i8;
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onDownloadComplete:  " + d().j() + " " + downloadMessage.getSaveFilePath());
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f21126h);
        try {
            try {
                MBResourceManager.getInstance().unZip(downloadMessage.getSaveFilePath(), this.f21129k);
                String str = this.f21125g.get("cache", "2");
                b bVar2 = this.f21121c;
                if (TextUtils.equals(str, "2")) {
                    i8 = 2;
                } else {
                    i8 = 1;
                }
                bVar2.a(i8);
                this.f21121c.b(true);
                this.f21121c.a(false);
                this.f21121c.a(a(this.f21127i));
                this.f21121c.a(2);
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("MBridgeDownloader", "onDownloadComplete.unZip: " + e8.getMessage());
                }
                if (this.f21121c.c()) {
                    xVar2 = this.f21128j;
                    if (xVar2 == null) {
                        return;
                    }
                } else {
                    xVar = this.f21128j;
                    if (xVar != null) {
                        bVar = this.f21119a;
                        aVar = this.f21120b;
                        mBridgeError = new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR);
                    } else {
                        return;
                    }
                }
            }
            if (this.f21121c.c()) {
                xVar2 = this.f21128j;
                if (xVar2 == null) {
                    return;
                }
                xVar2.b(this.f21119a, this.f21120b, this);
                return;
            }
            xVar = this.f21128j;
            if (xVar != null) {
                bVar = this.f21119a;
                aVar = this.f21120b;
                mBridgeError = new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR);
                xVar.a(bVar, aVar, this, mBridgeError);
            }
        } catch (Throwable th) {
            if (this.f21121c.c()) {
                x xVar3 = this.f21128j;
                if (xVar3 != null) {
                    xVar3.b(this.f21119a, this.f21120b, this);
                }
            } else {
                x xVar4 = this.f21128j;
                if (xVar4 != null) {
                    xVar4.a(this.f21119a, this.f21120b, this, new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR));
                }
            }
            throw th;
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onDownloadError(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadError downloadError) {
        int i8;
        String str;
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f21126h);
        String str2 = this.f21125g.get("cache", "2");
        b bVar = this.f21121c;
        if (TextUtils.equals(str2, "2")) {
            i8 = 2;
        } else {
            i8 = 1;
        }
        bVar.a(i8);
        this.f21121c.b(false);
        this.f21121c.a(false);
        if (this.f21128j != null) {
            b bVar2 = this.f21121c;
            if (bVar2 != null) {
                int h8 = bVar2.h();
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
                this.f21128j.a(this.f21119a, this.f21120b, this, mBridgeError);
            }
            str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_NETWORK_ERROR;
            MBridgeError mBridgeError2 = new MBridgeError(2, str);
            mBridgeError2.setException(downloadError.getException());
            this.f21128j.a(this.f21119a, this.f21120b, this, mBridgeError2);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onDownloadStart(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
    }

    @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
    public void onProgress(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadProgress downloadProgress) {
    }

    private File b(String str) {
        JSONArray jSONArray;
        String a8 = com.mbridge.msdk.newreward.function.h.a.a(new File(str + File.separator + "template_config.json"));
        if (TextUtils.isEmpty(a8)) {
            return null;
        }
        try {
            jSONArray = new JSONArray(a8);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.a("MBridgeDownloader", "findTemplateFile: " + e8.getMessage());
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i8);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("xml_type", "");
                if (!TextUtils.isEmpty(optString) && TextUtils.equals(optString, a())) {
                    File file = new File(str + File.separator + optJSONObject.optString("name", ""));
                    if (file.exists()) {
                        return file;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.mbridge.msdk.newreward.a.c.a.InterfaceC0413a
    public void a(String str, long j8) {
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onTimeout: " + str + " " + d().j());
        }
        DownloadRequest downloadRequest = this.f21125g;
        if (downloadRequest != null) {
            downloadRequest.cancel(this.f21124f);
        }
    }

    private File a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str + ".xml");
        return (file.isFile() && file.exists()) ? file : b(str);
    }
}
