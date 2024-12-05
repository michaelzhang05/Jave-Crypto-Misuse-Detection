package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.db.p;
import com.mbridge.msdk.foundation.db.q;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.DownloadStatus;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.OnProgressStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.download.utils.Utils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.m;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import java.io.File;
import java.io.Serializable;
import java.net.URL;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class a implements Serializable {

    /* renamed from: A, reason: collision with root package name */
    private int f24103A;

    /* renamed from: B, reason: collision with root package name */
    private File f24104B;

    /* renamed from: D, reason: collision with root package name */
    private int f24106D;

    /* renamed from: E, reason: collision with root package name */
    private int f24107E;

    /* renamed from: F, reason: collision with root package name */
    private int f24108F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f24109G;

    /* renamed from: H, reason: collision with root package name */
    private k f24110H;

    /* renamed from: I, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.d.c f24111I;

    /* renamed from: J, reason: collision with root package name */
    private k f24112J;

    /* renamed from: b, reason: collision with root package name */
    private int f24123b;

    /* renamed from: c, reason: collision with root package name */
    private int f24124c;

    /* renamed from: e, reason: collision with root package name */
    private volatile int f24126e;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f24128g;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f24129h;

    /* renamed from: i, reason: collision with root package name */
    private CampaignEx f24130i;

    /* renamed from: j, reason: collision with root package name */
    private String f24131j;

    /* renamed from: k, reason: collision with root package name */
    private Context f24132k;

    /* renamed from: l, reason: collision with root package name */
    private long f24133l;

    /* renamed from: m, reason: collision with root package name */
    private String f24134m;

    /* renamed from: n, reason: collision with root package name */
    private String f24135n;

    /* renamed from: o, reason: collision with root package name */
    private long f24136o;

    /* renamed from: p, reason: collision with root package name */
    private String f24137p;

    /* renamed from: r, reason: collision with root package name */
    private long f24139r;

    /* renamed from: u, reason: collision with root package name */
    private p f24142u;

    /* renamed from: w, reason: collision with root package name */
    private String f24144w;

    /* renamed from: x, reason: collision with root package name */
    private DownloadRequest f24145x;

    /* renamed from: y, reason: collision with root package name */
    private int f24146y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f24147z;

    /* renamed from: a, reason: collision with root package name */
    private boolean f24122a = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f24125d = false;

    /* renamed from: f, reason: collision with root package name */
    private CopyOnWriteArrayList<c> f24127f = new CopyOnWriteArrayList<>();

    /* renamed from: q, reason: collision with root package name */
    private boolean f24138q = false;

    /* renamed from: s, reason: collision with root package name */
    private int f24140s = 100;

    /* renamed from: t, reason: collision with root package name */
    private boolean f24141t = false;

    /* renamed from: v, reason: collision with root package name */
    private boolean f24143v = false;

    /* renamed from: C, reason: collision with root package name */
    private int f24105C = 1;

    /* renamed from: K, reason: collision with root package name */
    private boolean f24113K = false;

    /* renamed from: L, reason: collision with root package name */
    private boolean f24114L = false;

    /* renamed from: M, reason: collision with root package name */
    private boolean f24115M = false;

    /* renamed from: N, reason: collision with root package name */
    private boolean f24116N = false;

    /* renamed from: O, reason: collision with root package name */
    private boolean f24117O = false;

    /* renamed from: P, reason: collision with root package name */
    private boolean f24118P = false;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f24119Q = false;

    /* renamed from: R, reason: collision with root package name */
    private OnDownloadStateListener f24120R = new OnDownloadStateListener() { // from class: com.mbridge.msdk.videocommon.download.a.1
        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onCancelDownload(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onDownloadComplete(DownloadMessage downloadMessage) {
            String str;
            try {
                ad.b("CampaignDownLoadTask", "onDownloadComplete callback : " + a.this.f24136o + "    " + a.this.f24133l);
                if (a.this.f24142u == null) {
                    a.this.f24142u = p.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                }
                a.this.f24142u.a(a.this.f24134m, a.this.f24136o, 5);
                if (downloadMessage != null) {
                    try {
                        str = (String) downloadMessage.getExtra("responseHeaders");
                    } catch (Throwable th) {
                        ad.b("CampaignDownLoadTask", th.getMessage());
                    }
                    a aVar = a.this;
                    aVar.a(aVar.f24136o, true, str);
                    a.this.f24142u.a(a.this.f24134m, a.this.f24136o, 5);
                    a aVar2 = a.this;
                    aVar2.a(aVar2.f24136o, true, "");
                    a.a(a.this, 1, true);
                }
                str = "";
                a aVar3 = a.this;
                aVar3.a(aVar3.f24136o, true, str);
                a.this.f24142u.a(a.this.f24134m, a.this.f24136o, 5);
                a aVar22 = a.this;
                aVar22.a(aVar22.f24136o, true, "");
                a.a(a.this, 1, true);
            } catch (Exception e8) {
                ad.b("CampaignDownLoadTask", e8.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
            String str;
            if (a.this.f24145x != null && a.this.f24145x.getStatus() != DownloadStatus.CANCELLED) {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("cache", a.this.f24145x.get("cache", "2"));
                a aVar = a.this;
                aVar.a(aVar.f24130i, dVar);
                if (downloadError != null && downloadError.getException() != null) {
                    str = downloadError.getException().getMessage();
                } else {
                    str = "Video Download Error";
                }
                a.this.v();
                a.this.a(3, str, "");
                a.this.a(str);
                a aVar2 = a.this;
                a.a(aVar2, 3, aVar2.f24147z);
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onDownloadStart(DownloadMessage downloadMessage) {
            a.this.f24126e = 1;
            if (a.this.f24142u == null) {
                a.this.f24142u = p.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
            }
            a.this.f24142u.a(a.this.f24130i, a.this.f24133l, a.this.f24137p, a.this.f24126e);
        }
    };

    /* renamed from: S, reason: collision with root package name */
    private OnProgressStateListener f24121S = new OnProgressStateListener() { // from class: com.mbridge.msdk.videocommon.download.a.2
        @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
        public final void onProgress(DownloadMessage downloadMessage, DownloadProgress downloadProgress) {
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("cache", a.this.f24145x.get("cache", "2"));
                a aVar = a.this;
                aVar.a(aVar.f24130i, dVar);
                a.this.f24136o = downloadProgress.getCurrent();
                a.this.f24133l = downloadProgress.getTotal();
                a.this.f24146y = downloadProgress.getCurrentDownloadRate();
                if (a.this.f24140s != 100 && downloadProgress.getCurrentDownloadRate() >= a.this.f24140s) {
                    ad.b("CampaignDownLoadTask", "Rate : " + downloadProgress.getCurrentDownloadRate() + " ReadyRate & cdRate = " + a.this.f24140s + " " + a.this.f24124c);
                    if (!a.this.f24125d) {
                        a.this.f24125d = true;
                        if (!a.this.f24147z) {
                            a.a(a.this, 1, true);
                            a.this.a(downloadProgress.getCurrent(), false, "");
                        }
                        if (a.this.f24145x != null && a.this.f24105C == 2 && !a.this.f24147z) {
                            a.this.f24145x.cancel(downloadMessage);
                        }
                    }
                }
            } catch (Exception e8) {
                ad.b("CampaignDownLoadTask", e8.getMessage());
            }
        }
    };

    public a(Context context, CampaignEx campaignEx, String str, int i8) {
        File file;
        File file2;
        this.f24123b = 1;
        this.f24126e = 0;
        this.f24136o = 0L;
        int i9 = 100;
        this.f24109G = false;
        if (context == null && campaignEx == null) {
            return;
        }
        com.mbridge.msdk.c.g a8 = com.mbridge.msdk.c.h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
        if (a8 != null) {
            this.f24109G = a8.aF();
        }
        this.f24106D = com.mbridge.msdk.foundation.same.a.f20488u;
        this.f24107E = com.mbridge.msdk.foundation.same.a.f20489v;
        this.f24108F = com.mbridge.msdk.foundation.same.a.f20487t;
        this.f24139r = System.currentTimeMillis();
        this.f24132k = com.mbridge.msdk.foundation.controller.c.m().c();
        this.f24130i = campaignEx;
        this.f24131j = str;
        this.f24123b = i8;
        if (campaignEx != null) {
            this.f24134m = campaignEx.getVideoUrlEncode();
        }
        this.f24144w = ab.c(this.f24134m);
        this.f24135n = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_VC) + File.separator;
        this.f24137p = this.f24135n + this.f24144w;
        ad.c("CampaignDownLoadTask", this.f24130i.getAppName() + " videoLocalPath:" + this.f24137p + " videoUrl: " + this.f24130i.getVideoUrlEncode() + " " + this.f24140s);
        try {
            if (!TextUtils.isEmpty(this.f24134m)) {
                if (!TextUtils.isEmpty(this.f24135n)) {
                    file = new File(this.f24135n);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                } else {
                    file = null;
                }
                if (file != null && file.exists() && ((file2 = this.f24104B) == null || !file2.exists())) {
                    File file3 = new File(file + "/.nomedia");
                    this.f24104B = file3;
                    if (!file3.exists()) {
                        this.f24104B.createNewFile();
                    }
                }
                p a9 = p.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                m a10 = a9.a(this.f24134m, "");
                if (a10 != null) {
                    this.f24136o = a10.c();
                    if (this.f24126e != 2) {
                        this.f24126e = a10.b();
                    }
                    if (this.f24126e == 1) {
                        this.f24126e = 2;
                    }
                    this.f24133l = a10.d();
                    if (a10.a() > 0) {
                        this.f24139r = a10.a();
                    }
                    if (this.f24126e == 5) {
                        if (Objects.exists(new File(this.f24135n + this.f24144w), this.f24135n, this.f24144w)) {
                            this.f24137p = this.f24135n + this.f24144w;
                        } else {
                            u();
                        }
                    } else if (this.f24126e != 0) {
                        this.f24137p = this.f24135n + this.f24144w;
                    }
                } else {
                    a9.a(this.f24134m, this.f24139r);
                }
                try {
                    long j8 = this.f24133l;
                    if (j8 > 0) {
                        if (this.f24136o * 100 >= j8 * b(this.f24130i)) {
                            if (b(this.f24130i) != 100) {
                                if (this.f24126e == 5) {
                                }
                            }
                            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                            dVar.a("cache", 1);
                            a(this.f24130i, dVar);
                        }
                    }
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        e8.printStackTrace();
                    }
                }
                String str2 = this.f24134m;
                if (TextUtils.isEmpty(str2)) {
                    this.f24129h.a("VideoUrl is NULL, Please check it.", "");
                    return;
                }
                if (this.f24126e == 1) {
                    ad.a("CampaignDownLoadTask", "Run : Task is RUNNING, Will return.");
                    return;
                }
                if (this.f24126e == 5 && Utils.getDownloadRate(this.f24133l, this.f24136o) >= this.f24140s) {
                    ad.a("CampaignDownLoadTask", "Run : Video Done, Will callback.");
                    com.mbridge.msdk.videocommon.listener.a aVar = this.f24128g;
                    if (aVar != null) {
                        aVar.a(this.f24134m);
                    }
                    com.mbridge.msdk.videocommon.listener.a aVar2 = this.f24129h;
                    if (aVar2 != null) {
                        aVar2.a(this.f24134m);
                    }
                    try {
                        File file4 = new File(this.f24137p);
                        if (Objects.exists(file4, this.f24135n, this.f24144w) && file4.isFile()) {
                            file4.setLastModified(System.currentTimeMillis());
                        }
                    } catch (Exception e9) {
                        ad.b("CampaignDownLoadTask", e9.getMessage());
                    }
                    com.mbridge.msdk.foundation.same.report.d.d dVar2 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar2.a("cache", 1);
                    a(this.f24130i, dVar2);
                    return;
                }
                if (this.f24123b == 3) {
                    ad.a("CampaignDownLoadTask", "Run : Dlnet is 3, Will callback.");
                    a(0L, false, "");
                    com.mbridge.msdk.foundation.same.report.d.d dVar3 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar3.a("cache", 1);
                    a(this.f24130i, dVar3);
                    return;
                }
                try {
                    i9 = b(this.f24130i);
                } catch (Exception unused) {
                }
                c(i9);
                if (i9 == 0) {
                    com.mbridge.msdk.videocommon.listener.a aVar3 = this.f24128g;
                    if (aVar3 != null) {
                        aVar3.a(this.f24134m);
                    }
                    com.mbridge.msdk.videocommon.listener.a aVar4 = this.f24129h;
                    if (aVar4 != null) {
                        aVar4.a(this.f24134m);
                    }
                }
                DownloadMessage downloadMessage = new DownloadMessage(this.f24130i, str2, this.f24144w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
                downloadMessage.setUseCronetDownload(e(this.f24130i));
                downloadMessage.addExtra("resource_type", 4);
                this.f24145x = a(downloadMessage, this.f24120R, this.f24121S, "1");
            }
        } catch (Exception e10) {
            ad.c("CampaignDownLoadTask", e10.getMessage());
        }
    }

    private void u() {
        if (this.f24142u == null) {
            this.f24142u = p.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
        }
        try {
            try {
                this.f24142u.b(this.f24134m);
                if (!af.a().a("r_d_v_b_l", true)) {
                    File file = new File(this.f24137p);
                    if (file.exists() && file.isFile()) {
                        file.delete();
                    }
                }
            } catch (Throwable unused) {
                ad.b("CampaignDownLoadTask", "del DB or file failed");
            }
        } finally {
            this.f24126e = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        try {
            String str = com.mbridge.msdk.reward.b.a.f22602b;
            com.mbridge.msdk.reward.b.a.class.getMethod("insertExcludeId", String.class, CampaignEx.class).invoke(com.mbridge.msdk.reward.b.a.class.newInstance(), this.f24131j, this.f24130i);
            Class<?> cls = Class.forName("com.mbridge.msdk.mbnative.controller.NativeController");
            cls.getMethod("insertExcludeId", String.class, CampaignEx.class).invoke(cls.newInstance(), this.f24131j, this.f24130i);
        } catch (Exception e8) {
            ad.b("CampaignDownLoadTask", e8.getMessage());
        }
    }

    public final void o() {
        ad.b("CampaignDownLoadTask", "start()");
        try {
            if (TextUtils.isEmpty(this.f24134m)) {
                return;
            }
            if (this.f24134m != null) {
                ad.b("CampaignDownLoadTask", new URL(this.f24134m).getPath());
            }
            if (this.f24140s == 0 && this.f24105C == 2) {
                ad.b("CampaignDownLoadTask", "Can not start download because readyRate is 0 and videoCtnType is 2");
                return;
            }
            DownloadRequest downloadRequest = this.f24145x;
            if (downloadRequest != null) {
                downloadRequest.start();
            }
        } catch (Throwable unused) {
            com.mbridge.msdk.videocommon.listener.a aVar = this.f24128g;
            if (aVar != null) {
                aVar.a("VideoUrl is not illegal, Please check it.", "");
            }
            com.mbridge.msdk.videocommon.listener.a aVar2 = this.f24129h;
            if (aVar2 != null) {
                aVar2.a("VideoUrl is not illegal, Please check it.", "");
            }
        }
    }

    public final void p() {
        if (this.f24119Q) {
            return;
        }
        try {
            this.f24147z = true;
            if (this.f24105C == 1) {
                ad.b("CampaignDownLoadTask", "Can not call resume(), because videoCtnType = " + this.f24105C);
                return;
            }
            if (this.f24123b == 3) {
                ad.b("CampaignDownLoadTask", "Can not call resume(), because dlnet = " + this.f24123b);
                return;
            }
            ad.b("CampaignDownLoadTask", "resume()");
            this.f24117O = false;
            this.f24118P = false;
            DownloadMessage downloadMessage = new DownloadMessage(new Object(), this.f24134m, this.f24144w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
            downloadMessage.setUseCronetDownload(e(this.f24130i));
            DownloadRequest<?> a8 = a(downloadMessage, this.f24120R, this.f24121S, "2");
            this.f24145x = a8;
            a8.start();
        } catch (Exception e8) {
            ad.b("CampaignDownLoadTask", e8.getMessage());
        }
    }

    public final String q() {
        String str = "";
        if (this.f24123b == 3) {
            return "";
        }
        String str2 = this.f24135n + this.f24144w;
        File file = new File(str2);
        try {
            if (Objects.exists(file, this.f24135n, this.f24144w)) {
                if (file.isFile()) {
                    if (file.canRead()) {
                        if (file.length() > 0) {
                            this.f24137p = str2;
                        } else {
                            str = "file length is 0 ";
                        }
                    } else {
                        str = "file can not read ";
                    }
                } else {
                    str = "file is not file ";
                }
            } else {
                str = "file is not exist ";
            }
        } catch (Throwable th) {
            ad.b("CampaignDownLoadTask", th.getMessage());
            str = th.getMessage();
        }
        if (this.f24126e == 5 && !TextUtils.isEmpty(str)) {
            u();
        }
        return str;
    }

    public final void r() {
        if (this.f24127f != null) {
            this.f24127f = null;
        }
    }

    public final void s() {
        CampaignEx campaignEx;
        try {
            try {
                u();
                campaignEx = this.f24130i;
            } catch (Exception unused) {
                ad.b("CampaignDownLoadTask", "del file is failed");
            }
            if (campaignEx != null && campaignEx.getPlayable_ads_without_video() == 2) {
                return;
            }
            com.mbridge.msdk.videocommon.a.a a8 = com.mbridge.msdk.videocommon.a.a.a();
            if (a8 != null) {
                a8.a(this.f24130i);
            }
        } finally {
            this.f24126e = 0;
        }
    }

    public final String t() {
        if (this.f24119Q) {
            try {
                File file = new File(this.f24137p);
                if (file.exists() && file.isFile()) {
                    return this.f24137p;
                }
                return this.f24134m;
            } catch (Exception e8) {
                ad.b("CampaignDownLoadTask", e8.getMessage());
                return this.f24134m;
            }
        }
        try {
            File file2 = new File(this.f24137p);
            if (Objects.exists(file2, this.f24135n, this.f24144w) && file2.isFile()) {
                return this.f24137p;
            }
        } catch (Exception e9) {
            ad.b("CampaignDownLoadTask", e9.getMessage());
        }
        return this.f24134m;
    }

    public final void c(boolean z8) {
        this.f24115M = z8;
    }

    public final void d(boolean z8) {
        this.f24116N = z8;
    }

    public final String e() {
        return this.f24134m;
    }

    public final boolean f() {
        return this.f24143v;
    }

    public final long g() {
        return this.f24139r;
    }

    public final String h() {
        return this.f24137p;
    }

    public final boolean i() {
        return this.f24119Q;
    }

    public final long j() {
        return this.f24133l;
    }

    public final int k() {
        return this.f24126e;
    }

    public final CampaignEx l() {
        return this.f24130i;
    }

    public final long m() {
        return this.f24136o;
    }

    public final void n() {
        ad.b("CampaignDownLoadTask", "startForLoadRefactor()");
        try {
            if (TextUtils.isEmpty(this.f24134m)) {
                com.mbridge.msdk.videocommon.listener.a aVar = this.f24128g;
                if (aVar != null) {
                    aVar.a(this.f24134m);
                    return;
                }
                return;
            }
            if (this.f24134m != null) {
                ad.b("CampaignDownLoadTask", new URL(this.f24134m).getPath());
            }
            if (this.f24123b == 3) {
                ad.b("CampaignDownLoadTask", "startForLoadRefactor: Dlnet is 3, Will callback.");
                com.mbridge.msdk.videocommon.listener.a aVar2 = this.f24128g;
                if (aVar2 != null) {
                    aVar2.a(this.f24134m);
                    return;
                }
                return;
            }
            if (this.f24140s == 0 && this.f24105C == 2) {
                ad.b("CampaignDownLoadTask", "Can not start download because readyRate is 0 and videoCtnType is 2");
                com.mbridge.msdk.videocommon.listener.a aVar3 = this.f24128g;
                if (aVar3 != null) {
                    aVar3.a(this.f24134m);
                    return;
                }
                return;
            }
            try {
                if (this.f24126e == 5 && Utils.getDownloadRate(this.f24133l, this.f24136o) >= this.f24140s) {
                    if (Objects.exists(new File(this.f24135n + this.f24144w), this.f24135n, this.f24144w)) {
                        this.f24137p = this.f24135n + this.f24144w;
                        com.mbridge.msdk.videocommon.listener.a aVar4 = this.f24128g;
                        if (aVar4 != null) {
                            aVar4.a(this.f24134m);
                            return;
                        }
                        return;
                    }
                }
            } catch (Exception e8) {
                ad.b("CampaignDownLoadTask", "startForLoadRefactor: " + e8.getMessage());
            }
            DownloadRequest downloadRequest = this.f24145x;
            if (downloadRequest != null) {
                downloadRequest.start();
            }
        } catch (Throwable unused) {
            com.mbridge.msdk.videocommon.listener.a aVar5 = this.f24128g;
            if (aVar5 != null) {
                aVar5.a("VideoUrl is not illegal, Please check it.", "");
            }
        }
    }

    public final boolean c() {
        return this.f24115M;
    }

    public final boolean d() {
        return this.f24116N;
    }

    public final void e(boolean z8) {
        this.f24143v = z8;
    }

    public final void f(boolean z8) {
        this.f24138q = z8;
    }

    public final void b(boolean z8) {
        this.f24114L = z8;
    }

    public final void c(int i8) {
        ad.a("CampaignDownLoadTask", "set ready rate: " + i8);
        this.f24140s = i8;
    }

    public final void d(int i8) {
        this.f24103A = i8;
    }

    public final void e(int i8) {
        this.f24105C = i8;
    }

    private int d(CampaignEx campaignEx) {
        try {
            k kVar = this.f24112J;
            if (kVar != null) {
                return kVar.p();
            }
            return 100;
        } catch (Exception e8) {
            if (!MBridgeConstans.DEBUG) {
                return 100;
            }
            ad.b("CampaignDownLoadTask", e8.getMessage());
            return 100;
        }
    }

    private int e(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 0;
        }
        try {
            if (campaignEx.getAabEntity() != null) {
                return campaignEx.getAabEntity().h3c;
            }
            return 0;
        } catch (Throwable th) {
            ad.b("CampaignDownLoadTask", th.getMessage());
            return 0;
        }
    }

    public final boolean b() {
        return this.f24114L;
    }

    private int c(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 100;
        }
        try {
            if (campaignEx.getAdType() == 298) {
                if (this.f24110H == null) {
                    this.f24110H = com.mbridge.msdk.c.h.a().c(com.mbridge.msdk.foundation.controller.c.m().k(), this.f24131j);
                }
                return this.f24110H.p();
            }
            if (campaignEx.getAdType() == 42) {
                if (this.f24112J == null) {
                    this.f24112J = com.mbridge.msdk.c.h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), this.f24131j);
                }
                return d((CampaignEx) null);
            }
            if (this.f24111I == null) {
                this.f24111I = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f24131j, false);
            }
            return this.f24111I.r();
        } catch (Throwable th) {
            ad.a("CampaignDownLoadTask", th.getMessage(), th);
            return 100;
        }
    }

    public final void b(int i8) {
        this.f24124c = i8;
    }

    private int b(CampaignEx campaignEx) {
        int c8;
        if (campaignEx == null) {
            return 100;
        }
        if (campaignEx.getReady_rate() != -1) {
            c8 = campaignEx.getReady_rate();
            ad.a("CampaignDownLoadTask", "ready_rate(campaign): " + c8);
        } else {
            c8 = c(campaignEx);
            ad.a("CampaignDownLoadTask", "ready_rate(reward_unit_setting): " + c8);
        }
        try {
            return Math.max(c8, 0);
        } catch (Exception unused) {
            return 100;
        }
    }

    public final void a(boolean z8) {
        this.f24113K = z8;
    }

    public final boolean a() {
        return this.f24113K;
    }

    public final void d(String str) {
        this.f24134m = str;
    }

    public final void a(int i8) {
        this.f24123b = i8;
    }

    public final void a(int i8, int i9) {
        this.f24126e = i8;
        if (this.f24142u == null) {
            this.f24142u = p.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
        }
        this.f24142u.a(this.f24134m, i9, i8);
    }

    public final void b(String str) {
        v();
        a(2, str, "");
        this.f24126e = 4;
    }

    public final void a(CampaignEx campaignEx) {
        this.f24130i = campaignEx;
    }

    private DownloadRequest<?> a(DownloadMessage downloadMessage, OnDownloadStateListener onDownloadStateListener, OnProgressStateListener onProgressStateListener, String str) {
        return MBDownloadManager.getInstance().download(downloadMessage).withReadTimeout(this.f24106D).withConnectTimeout(this.f24108F).withWriteTimeout(this.f24107E).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(1).withDirectoryPathInternal(this.f24135n).withDownloadStateListener(onDownloadStateListener).withProgressStateListener(onProgressStateListener).with("do_us_fi_re", Boolean.toString(this.f24109G)).with(CampaignEx.JSON_KEY_READY_RATE, String.valueOf(this.f24140s)).with("scenes", str).build();
    }

    public final void b(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.f24129h = aVar;
    }

    public final void a(long j8, boolean z8, String str) {
        p pVar;
        ad.b("CampaignDownLoadTask", "setStateToDone 下载完成  ： mProgressSize" + this.f24136o + "  progressSize " + j8 + "  " + this.f24146y + "%   FileSize : " + this.f24133l + "  " + this.f24130i.getAppName());
        if (this.f24140s == 100 && this.f24123b != 3 && j8 != this.f24133l && !z8) {
            File file = new File(this.f24137p);
            ad.b("CampaignDownLoadTask", "progressSize = " + j8 + " fileSize = " + this.f24133l + " " + z8 + " absFileSize = " + (Objects.exists(file, this.f24135n, this.f24144w) ? file.length() : 0L));
            a("File size is not match witch download size.");
            return;
        }
        this.f24126e = 5;
        if (j8 == this.f24133l) {
            a(1, "", str);
        }
        long j9 = this.f24133l;
        if (j9 != 0 && (pVar = this.f24142u) != null) {
            pVar.b(this.f24134m, j9);
        }
        this.f24122a = false;
        a(j8, this.f24126e);
    }

    public final void c(String str) {
        this.f24137p = str;
    }

    public final void a(String str) {
        com.mbridge.msdk.videocommon.listener.a aVar = this.f24128g;
        if (aVar != null) {
            aVar.a(str, this.f24134m);
        }
        com.mbridge.msdk.videocommon.listener.a aVar2 = this.f24129h;
        if (aVar2 != null) {
            aVar2.a(str, this.f24134m);
        }
        ad.b("CampaignDownLoadTask", "Video download stop : " + str);
        if (this.f24126e == 4 || this.f24126e == 2 || this.f24126e == 5) {
            return;
        }
        this.f24126e = 4;
        CampaignEx campaignEx = this.f24130i;
        if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && this.f24130i.getRsIgnoreCheckRule().size() > 0 && this.f24130i.getRsIgnoreCheckRule().contains(0)) {
            ad.c("CampaignDownLoadTask", "Is not check video download status");
        } else {
            a(this.f24136o, this.f24126e);
        }
    }

    public final void a(c cVar) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f24127f;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(cVar);
        }
    }

    public final void a(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.f24128g = aVar;
    }

    private void a(long j8, int i8) {
        this.f24136o = j8;
        int i9 = this.f24140s;
        if (100 * j8 >= i9 * this.f24133l && !this.f24141t && i8 != 4) {
            if (i9 == 100 && i8 != 5) {
                this.f24126e = 5;
                return;
            }
            this.f24141t = true;
            ad.b("CampaignDownLoadTask", "UpdateListener : state: " + i8 + " progress : " + j8);
            String q8 = q();
            if (TextUtils.isEmpty(q8)) {
                com.mbridge.msdk.videocommon.listener.a aVar = this.f24128g;
                if (aVar != null) {
                    aVar.a(this.f24134m);
                }
                com.mbridge.msdk.videocommon.listener.a aVar2 = this.f24129h;
                if (aVar2 != null) {
                    aVar2.a(this.f24134m);
                }
            } else {
                com.mbridge.msdk.videocommon.listener.a aVar3 = this.f24128g;
                if (aVar3 != null) {
                    aVar3.a("file is not effective " + q8, this.f24134m);
                }
                com.mbridge.msdk.videocommon.listener.a aVar4 = this.f24129h;
                if (aVar4 != null) {
                    aVar4.a("file is not effective " + q8, this.f24134m);
                }
            }
        }
        if (!this.f24122a && j8 > 0) {
            this.f24122a = true;
            if (this.f24142u == null) {
                this.f24142u = p.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
            }
            this.f24142u.a(this.f24134m, j8, this.f24126e);
        }
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f24127f;
        if (copyOnWriteArrayList != null) {
            Iterator<c> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next != null) {
                    next.a(j8, i8);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i8, String str, String str2) {
        n nVar = new n(this.f24132k, this.f24130i, i8, Long.toString(this.f24139r != 0 ? System.currentTimeMillis() - this.f24139r : 0L), this.f24133l, this.f24103A);
        nVar.e(this.f24130i.getId());
        nVar.m(this.f24130i.getVideoUrlEncode());
        nVar.h(str);
        nVar.f(this.f24130i.getRequestId());
        nVar.s(this.f24130i.getCurrentLocalRid());
        nVar.g(this.f24130i.getRequestIdNotice());
        nVar.c(this.f24131j);
        nVar.t(str2);
        nVar.a(CampaignEx.JSON_KEY_READY_RATE, String.valueOf(this.f24140s));
        nVar.a("url", this.f24130i.getVideoUrlEncode());
        nVar.e(4);
        DownloadRequest downloadRequest = this.f24145x;
        if (downloadRequest != null) {
            nVar.a("scenes", downloadRequest.get("scenes", ""));
            nVar.a("resumed_breakpoint", this.f24145x.get("resumed_breakpoint", ""));
        }
        int i9 = this.f24103A;
        if (i9 == 94 || i9 == 287) {
            return;
        }
        q.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.d.d dVar) {
        if (this.f24117O || campaignEx == null || dVar == null) {
            return;
        }
        this.f24117O = true;
        try {
            dVar.a("resource_type", 4);
            DownloadRequest downloadRequest = this.f24145x;
            if (downloadRequest != null) {
                dVar.a("scenes", downloadRequest.get("scenes", "1"));
                dVar.a("resumed_breakpoint", this.f24145x.get("resumed_breakpoint", "2"));
            } else {
                dVar.a("scenes", "1");
                dVar.a("resumed_breakpoint", "1");
            }
            dVar.a("url", campaignEx.getVideoUrlEncode());
            dVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(this.f24140s));
            com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_start", campaignEx, dVar);
        } catch (Exception e8) {
            ad.b("CampaignDownLoadTask", e8.getMessage());
        }
    }

    static /* synthetic */ void a(a aVar, int i8, boolean z8) {
        if (aVar.f24118P) {
            return;
        }
        try {
            aVar.f24118P = true;
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            DownloadRequest downloadRequest = aVar.f24145x;
            if (downloadRequest != null) {
                dVar.a("scenes", downloadRequest.get("scenes", ""));
                dVar.a("url", aVar.f24134m);
                dVar.a("resumed_breakpoint", aVar.f24145x.get("resumed_breakpoint", ""));
                dVar.a("h3c", "");
            }
            dVar.a("resource_type", 4);
            dVar.a("file_size", Long.valueOf(aVar.f24133l));
            dVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(aVar.f24140s));
            dVar.a("result", Integer.valueOf(i8));
            com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_end", aVar.f24130i, dVar);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }
}
