package com.mbridge.msdk.reward.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import androidx.compose.runtime.ComposerKt;
import androidx.core.os.EnvironmentCompat;
import androidx.exifinterface.media.ExifInterface;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.q;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.download.download.ResDownloadCheckManager;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.n;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.videocommon.a;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: b */
    private static ConcurrentHashMap<String, a> f22328b;

    /* renamed from: a */
    private final h f22329a;

    /* renamed from: c */
    private boolean f22330c;

    /* renamed from: d */
    private final String f22331d;

    /* renamed from: e */
    private final String f22332e;

    /* renamed from: f */
    private final String f22333f;

    /* renamed from: g */
    private volatile List<WindVaneWebView> f22334g;

    /* renamed from: com.mbridge.msdk.reward.adapter.b$1 */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CopyOnWriteArrayList f22335a;

        /* renamed from: b */
        final /* synthetic */ Context f22336b;

        /* renamed from: c */
        final /* synthetic */ String f22337c;

        /* renamed from: d */
        final /* synthetic */ int f22338d;

        /* renamed from: e */
        final /* synthetic */ String f22339e;

        /* renamed from: f */
        final /* synthetic */ String f22340f;

        /* renamed from: g */
        final /* synthetic */ i f22341g;

        AnonymousClass1(CopyOnWriteArrayList copyOnWriteArrayList, Context context, String str, int i8, String str2, String str3, i iVar) {
            r2 = copyOnWriteArrayList;
            r3 = context;
            r4 = str;
            r5 = i8;
            r6 = str2;
            r7 = str3;
            r8 = iVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:130:0x0291 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:137:0x025d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:175:0x0168  */
        /* JADX WARN: Removed duplicated region for block: B:177:0x0172  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x01cf  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x023b  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x02bd  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0377  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 981
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.AnonymousClass1.run():void");
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.b$3 */
    /* loaded from: classes4.dex */
    public final class AnonymousClass3 implements H5DownLoadManager.ZipDownloadListener {

        /* renamed from: a */
        final /* synthetic */ String f22346a;

        /* renamed from: b */
        final /* synthetic */ String f22347b;

        /* renamed from: c */
        final /* synthetic */ String f22348c;

        /* renamed from: d */
        final /* synthetic */ i f22349d;

        /* renamed from: e */
        final /* synthetic */ Context f22350e;

        /* renamed from: f */
        final /* synthetic */ CampaignEx f22351f;

        AnonymousClass3(String str, String str2, String str3, i iVar, Context context, CampaignEx campaignEx) {
            r2 = str;
            r3 = str2;
            r4 = str3;
            r5 = iVar;
            r6 = context;
            r7 = campaignEx;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00de A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onFailed(java.lang.String r21, java.lang.String r22) {
            /*
                Method dump skipped, instructions count: 269
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.AnonymousClass3.onFailed(java.lang.String, java.lang.String):void");
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onSuccess(String str, String str2, boolean z8) {
            try {
                ad.a("RewardCampaignsResourceManager", "zip btl template download success");
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
                Message obtain = Message.obtain();
                obtain.what = 105;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, r2);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, r3);
                bundle.putString("request_id", r4);
                bundle.putString("url", str);
                obtain.setData(bundle);
                b.this.f22329a.sendMessage(obtain);
                i iVar = r5;
                if (iVar != null) {
                    iVar.a(r3, r2, r4, str);
                }
                if (!z8) {
                    b.a(b.this, r6, 1, r7, str, "", r2, str2);
                }
            } catch (Exception e8) {
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str, false);
                Message obtain2 = Message.obtain();
                obtain2.what = 205;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, r2);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, r3);
                bundle2.putString("request_id", r4);
                bundle2.putString("url", str);
                obtain2.setData(bundle2);
                b.this.f22329a.sendMessage(obtain2);
                if (r5 != null) {
                    try {
                        r5.a(str, r4, b.b(880005, new MBridgeIds(r3, r2, r4), "", e8, null));
                    } catch (Exception e9) {
                        ad.b("RewardCampaignsResourceManager", e9.getMessage());
                    }
                }
                b.a(b.this, r6, 3, r7, str, e8.getLocalizedMessage(), r2, str2);
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardCampaignsResourceManager", e8.getLocalizedMessage());
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.b$4 */
    /* loaded from: classes4.dex */
    public final class AnonymousClass4 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CampaignEx f22353a;

        /* renamed from: b */
        final /* synthetic */ Context f22354b;

        /* renamed from: c */
        final /* synthetic */ int f22355c;

        /* renamed from: d */
        final /* synthetic */ String f22356d;

        /* renamed from: e */
        final /* synthetic */ String f22357e;

        /* renamed from: f */
        final /* synthetic */ String f22358f;

        /* renamed from: g */
        final /* synthetic */ String f22359g;

        AnonymousClass4(CampaignEx campaignEx, Context context, int i8, String str, String str2, String str3, String str4) {
            r2 = campaignEx;
            r3 = context;
            r4 = i8;
            r5 = str;
            r6 = str2;
            r7 = str3;
            r8 = str4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (r2 != null && r3 != null) {
                try {
                    n nVar = new n();
                    nVar.a("m_download_end");
                    Context context = r3;
                    if (context != null) {
                        nVar.a(z.l(context.getApplicationContext()));
                    }
                    nVar.b(r4);
                    CampaignEx campaignEx = r2;
                    if (campaignEx != null) {
                        nVar.e(campaignEx.getId());
                        nVar.f(r2.getRequestId());
                        nVar.s(r2.getCurrentLocalRid());
                        nVar.g(r2.getRequestIdNotice());
                    }
                    nVar.q(r5);
                    nVar.h(r6);
                    nVar.c(r7);
                    if (!TextUtils.isEmpty(r8)) {
                        nVar.t(r8);
                    }
                    nVar.e(1);
                    nVar.a("scenes", "1");
                    com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar.a(), r2);
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardCampaignsResourceManager", e8.getLocalizedMessage());
                    }
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.b$5 */
    /* loaded from: classes4.dex */
    final class AnonymousClass5 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f22361a;

        /* renamed from: b */
        final /* synthetic */ WindVaneWebView f22362b;

        /* renamed from: c */
        final /* synthetic */ CampaignEx f22363c;

        /* renamed from: d */
        final /* synthetic */ CopyOnWriteArrayList f22364d;

        /* renamed from: e */
        final /* synthetic */ String f22365e;

        /* renamed from: f */
        final /* synthetic */ com.mbridge.msdk.videocommon.d.c f22366f;

        /* renamed from: g */
        final /* synthetic */ String f22367g;

        AnonymousClass5(boolean z8, WindVaneWebView windVaneWebView, CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, String str, com.mbridge.msdk.videocommon.d.c cVar, String str2) {
            r2 = z8;
            r3 = windVaneWebView;
            r4 = campaignEx;
            r5 = copyOnWriteArrayList;
            r6 = str;
            r7 = cVar;
            r8 = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.mbridge.msdk.video.signal.a.k kVar;
            boolean z8 = r2;
            WindVaneWebView windVaneWebView = r3;
            String e8 = r4.getRewardTemplateMode().e();
            CampaignEx campaignEx = r4;
            CopyOnWriteArrayList copyOnWriteArrayList = r5;
            String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(r4.getRewardTemplateMode().e());
            String str = r6;
            com.mbridge.msdk.videocommon.d.c cVar = r7;
            String str2 = r8;
            boolean z9 = b.this.f22330c;
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("type", 2);
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000154", campaignEx, dVar);
                a.C0435a c0435a = new a.C0435a();
                WindVaneWebView windVaneWebView2 = new WindVaneWebView(com.mbridge.msdk.foundation.controller.c.m().c());
                if (campaignEx != null) {
                    windVaneWebView2.setLocalRequestId(campaignEx.getCurrentLocalRid());
                }
                windVaneWebView2.setTempTypeForMetrics(2);
                c0435a.a(windVaneWebView2);
                String str3 = "";
                if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                    CopyOnWriteArrayList<CampaignEx> a8 = com.mbridge.msdk.videocommon.download.b.getInstance().a(str);
                    if (a8 != null && a8.size() > 0) {
                        for (int i8 = 0; i8 < copyOnWriteArrayList.size(); i8++) {
                            CampaignEx campaignEx2 = (CampaignEx) copyOnWriteArrayList.get(i8);
                            for (CampaignEx campaignEx3 : a8) {
                                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = a8;
                                if (campaignEx3.getId().equals(campaignEx2.getId()) && campaignEx3.getRequestId().equals(campaignEx2.getRequestId())) {
                                    campaignEx2.setReady(true);
                                    copyOnWriteArrayList.set(i8, campaignEx2);
                                }
                                a8 = copyOnWriteArrayList2;
                            }
                        }
                    }
                    kVar = new com.mbridge.msdk.video.signal.a.k(null, campaignEx, copyOnWriteArrayList);
                    str3 = ((CampaignEx) copyOnWriteArrayList.get(0)).getRequestId();
                } else {
                    kVar = new com.mbridge.msdk.video.signal.a.k(null, campaignEx);
                    if (campaignEx != null) {
                        str3 = campaignEx.getRequestId();
                    }
                }
                String str4 = str3;
                kVar.a(0);
                kVar.a(str);
                kVar.c(str2);
                kVar.a(cVar);
                kVar.d(z8);
                windVaneWebView2.setWebViewListener(new l(str2, false, windVaneWebView, e8, str, c0435a, campaignEx, z9, str4));
                windVaneWebView2.setObject(kVar);
                windVaneWebView2.loadUrl(h5ResAddress);
                windVaneWebView2.setRid(str4);
            } catch (Exception e9) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardCampaignsResourceManager", e9.getLocalizedMessage());
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a */
        boolean f22369a;

        /* renamed from: b */
        boolean f22370b;

        /* renamed from: c */
        int f22371c;

        /* renamed from: d */
        int f22372d;

        /* renamed from: e */
        String f22373e;

        /* renamed from: f */
        String f22374f;

        /* renamed from: g */
        int f22375g;

        /* renamed from: h */
        CopyOnWriteArrayList<CampaignEx> f22376h;

        /* renamed from: i */
        CopyOnWriteArrayList<CampaignEx> f22377i;

        public a(boolean z8, boolean z9, int i8, int i9, String str, String str2, int i10, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f22369a = z8;
            this.f22370b = z9;
            this.f22371c = i8;
            this.f22372d = i9;
            this.f22373e = str;
            this.f22374f = str2;
            this.f22375g = i10;
            this.f22376h = copyOnWriteArrayList;
            this.f22377i = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        }
    }

    /* loaded from: classes4.dex */
    public interface c {
        void a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList);

        void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.c.b bVar);
    }

    /* loaded from: classes4.dex */
    public static final class d implements H5DownLoadManager.IH5SourceDownloadListener {

        /* renamed from: b */
        private int f22399b;

        /* renamed from: c */
        private final String f22400c;

        /* renamed from: d */
        private final String f22401d;

        /* renamed from: e */
        private final String f22402e;

        /* renamed from: f */
        private CampaignEx f22403f;

        /* renamed from: g */
        private i f22404g;

        /* renamed from: h */
        private Handler f22405h;

        /* renamed from: i */
        private CopyOnWriteArrayList<CampaignEx> f22406i;

        /* renamed from: a */
        private boolean f22398a = false;

        /* renamed from: j */
        private final long f22407j = System.currentTimeMillis();

        /* renamed from: com.mbridge.msdk.reward.adapter.b$d$1 */
        /* loaded from: classes4.dex */
        public final class AnonymousClass1 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f22408a;

            /* renamed from: b */
            final /* synthetic */ long f22409b;

            /* renamed from: c */
            final /* synthetic */ String f22410c;

            /* renamed from: d */
            final /* synthetic */ String f22411d;

            /* renamed from: e */
            final /* synthetic */ String f22412e;

            AnonymousClass1(int i8, long j8, String str, String str2, String str3) {
                r2 = i8;
                r3 = j8;
                r5 = str;
                r6 = str2;
                r7 = str3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (d.this.f22403f == null) {
                    return;
                }
                try {
                    n nVar = new n("m_download_end", r2, r3 + "", r5, d.this.f22403f.getId(), d.this.f22401d, r6, "2");
                    nVar.f(d.this.f22403f.getRequestId());
                    nVar.s(d.this.f22403f.getCurrentLocalRid());
                    nVar.g(d.this.f22403f.getRequestIdNotice());
                    nVar.e(d.this.f22403f.getId());
                    nVar.c(d.this.f22403f.getAdSpaceT());
                    nVar.a("scenes", "1");
                    nVar.a("url", r5);
                    if (d.this.f22403f.getAdType() == 287) {
                        nVar.d(ExifInterface.GPS_MEASUREMENT_3D);
                    } else if (d.this.f22403f.getAdType() == 94) {
                        nVar.d("1");
                    }
                    if (!TextUtils.isEmpty(r7)) {
                        nVar.t(r7);
                    }
                    b.a(nVar, d.this.f22403f);
                    com.mbridge.msdk.foundation.same.report.h.a(nVar, d.this.f22401d, d.this.f22403f);
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardCampaignsResourceManager", e8.getLocalizedMessage());
                    }
                }
            }
        }

        public d(int i8, String str, String str2, String str3, CampaignEx campaignEx, i iVar, Handler handler, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f22399b = i8;
            this.f22400c = str;
            this.f22401d = str2;
            this.f22402e = str3;
            this.f22403f = campaignEx;
            this.f22404g = iVar;
            this.f22405h = handler;
            this.f22406i = copyOnWriteArrayList;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, false);
            int i8 = this.f22399b;
            if (i8 != 313) {
                if (i8 != 497) {
                    if (i8 == 859) {
                        Message obtain = Message.obtain();
                        obtain.what = 205;
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22401d);
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f22400c);
                        bundle.putString("request_id", this.f22402e);
                        bundle.putString("message", str2);
                        obtain.setData(bundle);
                        this.f22405h.sendMessage(obtain);
                        if (this.f22404g != null) {
                            try {
                                this.f22404g.a(str, this.f22402e, b.b(880006, new MBridgeIds(this.f22400c, this.f22401d, this.f22402e), str2, null, null));
                                return;
                            } catch (Exception e8) {
                                ad.b("RewardCampaignsResourceManager", e8.getMessage());
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                Message obtain2 = Message.obtain();
                obtain2.what = ComposerKt.providerKey;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22401d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f22400c);
                bundle2.putString("request_id", this.f22402e);
                bundle2.putString("url", str);
                bundle2.putString("message", str2);
                obtain2.setData(bundle2);
                this.f22405h.sendMessage(obtain2);
                if (this.f22398a) {
                    a(3, System.currentTimeMillis() - this.f22407j, str, "url download failed", "");
                    return;
                }
                return;
            }
            Message obtain3 = Message.obtain();
            obtain3.what = ComposerKt.providerKey;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22401d);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f22400c);
            bundle3.putString("request_id", this.f22402e);
            bundle3.putString("url", str);
            bundle3.putString("message", str2);
            obtain3.setData(bundle3);
            this.f22405h.sendMessage(obtain3);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onSuccess(String str, String str2, boolean z8) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            int i8 = this.f22399b;
            if (i8 != 313) {
                if (i8 != 497) {
                    if (i8 == 859) {
                        Message obtain = Message.obtain();
                        obtain.what = 105;
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22401d);
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f22400c);
                        bundle.putString("request_id", this.f22402e);
                        obtain.setData(bundle);
                        this.f22405h.sendMessage(obtain);
                        i iVar = this.f22404g;
                        if (iVar != null) {
                            iVar.a(this.f22400c, this.f22401d, this.f22402e, str);
                            return;
                        }
                        return;
                    }
                    return;
                }
                Message obtain2 = Message.obtain();
                obtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22401d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f22400c);
                bundle2.putString("request_id", this.f22402e);
                bundle2.putString("url", str);
                obtain2.setData(bundle2);
                this.f22405h.sendMessage(obtain2);
                if (this.f22398a) {
                    a(1, System.currentTimeMillis() - this.f22407j, str, "", str2);
                    return;
                }
                return;
            }
            Message obtain3 = Message.obtain();
            obtain3.what = 101;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22401d);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f22400c);
            bundle3.putString("request_id", this.f22402e);
            bundle3.putString("url", str);
            obtain3.setData(bundle3);
            this.f22405h.sendMessage(obtain3);
        }

        public final void a(boolean z8) {
            this.f22398a = z8;
        }

        private void a(int i8, long j8, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.d.1

                /* renamed from: a */
                final /* synthetic */ int f22408a;

                /* renamed from: b */
                final /* synthetic */ long f22409b;

                /* renamed from: c */
                final /* synthetic */ String f22410c;

                /* renamed from: d */
                final /* synthetic */ String f22411d;

                /* renamed from: e */
                final /* synthetic */ String f22412e;

                AnonymousClass1(int i82, long j82, String str4, String str22, String str32) {
                    r2 = i82;
                    r3 = j82;
                    r5 = str4;
                    r6 = str22;
                    r7 = str32;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (d.this.f22403f == null) {
                        return;
                    }
                    try {
                        n nVar = new n("m_download_end", r2, r3 + "", r5, d.this.f22403f.getId(), d.this.f22401d, r6, "2");
                        nVar.f(d.this.f22403f.getRequestId());
                        nVar.s(d.this.f22403f.getCurrentLocalRid());
                        nVar.g(d.this.f22403f.getRequestIdNotice());
                        nVar.e(d.this.f22403f.getId());
                        nVar.c(d.this.f22403f.getAdSpaceT());
                        nVar.a("scenes", "1");
                        nVar.a("url", r5);
                        if (d.this.f22403f.getAdType() == 287) {
                            nVar.d(ExifInterface.GPS_MEASUREMENT_3D);
                        } else if (d.this.f22403f.getAdType() == 94) {
                            nVar.d("1");
                        }
                        if (!TextUtils.isEmpty(r7)) {
                            nVar.t(r7);
                        }
                        b.a(nVar, d.this.f22403f);
                        com.mbridge.msdk.foundation.same.report.h.a(nVar, d.this.f22401d, d.this.f22403f);
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardCampaignsResourceManager", e8.getLocalizedMessage());
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class e implements com.mbridge.msdk.foundation.same.c.c {

        /* renamed from: a */
        private Handler f22414a;

        /* renamed from: b */
        private int f22415b;

        /* renamed from: c */
        private String f22416c;

        /* renamed from: d */
        private String f22417d;

        /* renamed from: e */
        private String f22418e;

        /* renamed from: f */
        private CampaignEx f22419f;

        /* renamed from: com.mbridge.msdk.reward.adapter.b$e$1 */
        /* loaded from: classes4.dex */
        final class AnonymousClass1 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f22420a;

            AnonymousClass1(String str) {
                r2 = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (e.this.f22419f != null) {
                    try {
                        q a8 = q.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                        ad.a("RewardCampaignsResourceManager", "campaign is null");
                        n nVar = new n();
                        nVar.a("2000044");
                        nVar.a(z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
                        nVar.e(e.this.f22419f.getId());
                        nVar.p(e.this.f22419f.getImageUrl());
                        nVar.f(e.this.f22419f.getRequestId());
                        nVar.s(e.this.f22419f.getCurrentLocalRid());
                        nVar.g(e.this.f22419f.getRequestIdNotice());
                        nVar.c(e.this.f22416c);
                        nVar.h(r2);
                        nVar.a("scenes", "1");
                        a8.a(nVar);
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardCampaignsResourceManager", e8.getLocalizedMessage());
                        }
                    }
                }
            }
        }

        public e(Handler handler, int i8, String str, String str2, String str3, CampaignEx campaignEx) {
            this.f22414a = handler;
            this.f22415b = i8;
            this.f22417d = str;
            this.f22416c = str2;
            this.f22418e = str3;
            this.f22419f = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onFailedLoad(String str, String str2) {
            int i8;
            Message obtain = Message.obtain();
            if (this.f22415b == 0) {
                i8 = ComposerKt.compositionLocalMapKey;
            } else {
                i8 = ComposerKt.providerMapsKey;
            }
            obtain.what = i8;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22416c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f22417d);
            bundle.putString("request_id", this.f22418e);
            obtain.setData(bundle);
            this.f22414a.sendMessage(obtain);
            AnonymousClass1 anonymousClass1 = new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.e.1

                /* renamed from: a */
                final /* synthetic */ String f22420a;

                AnonymousClass1(String str3) {
                    r2 = str3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (e.this.f22419f != null) {
                        try {
                            q a8 = q.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                            ad.a("RewardCampaignsResourceManager", "campaign is null");
                            n nVar = new n();
                            nVar.a("2000044");
                            nVar.a(z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
                            nVar.e(e.this.f22419f.getId());
                            nVar.p(e.this.f22419f.getImageUrl());
                            nVar.f(e.this.f22419f.getRequestId());
                            nVar.s(e.this.f22419f.getCurrentLocalRid());
                            nVar.g(e.this.f22419f.getRequestIdNotice());
                            nVar.c(e.this.f22416c);
                            nVar.h(r2);
                            nVar.a("scenes", "1");
                            a8.a(nVar);
                        } catch (Exception e8) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b("RewardCampaignsResourceManager", e8.getLocalizedMessage());
                            }
                        }
                    }
                }
            };
            com.mbridge.msdk.foundation.controller.d.a();
            com.mbridge.msdk.foundation.same.f.b.b().execute(anonymousClass1);
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onSuccessLoad(Bitmap bitmap, String str) {
            int i8;
            ResDownloadCheckManager.getInstance().setImageDownloadDone(str, true);
            Message obtain = Message.obtain();
            if (this.f22415b == 0) {
                i8 = 102;
            } else {
                i8 = 104;
            }
            obtain.what = i8;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22416c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f22417d);
            bundle.putString("request_id", this.f22418e);
            obtain.setData(bundle);
            this.f22414a.sendMessage(obtain);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements H5DownLoadManager.ZipDownloadListener {

        /* renamed from: b */
        private Context f22427b;

        /* renamed from: c */
        private String f22428c;

        /* renamed from: d */
        private String f22429d;

        /* renamed from: e */
        private String f22430e;

        /* renamed from: f */
        private CampaignEx f22431f;

        /* renamed from: g */
        private int f22432g;

        /* renamed from: h */
        private Handler f22433h;

        /* renamed from: i */
        private i f22434i;

        /* renamed from: j */
        private CopyOnWriteArrayList<CampaignEx> f22435j;

        /* renamed from: a */
        private boolean f22426a = false;

        /* renamed from: k */
        private long f22436k = System.currentTimeMillis();

        /* renamed from: com.mbridge.msdk.reward.adapter.b$g$1 */
        /* loaded from: classes4.dex */
        public final class AnonymousClass1 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f22437a;

            /* renamed from: b */
            final /* synthetic */ String f22438b;

            /* renamed from: c */
            final /* synthetic */ String f22439c;

            /* renamed from: d */
            final /* synthetic */ String f22440d;

            AnonymousClass1(int i8, String str, String str2, String str3) {
                r2 = i8;
                r3 = str;
                r4 = str2;
                r5 = str3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (g.this.f22431f != null && g.this.f22427b != null) {
                    try {
                        n nVar = new n();
                        nVar.a("m_download_end");
                        if (g.this.f22427b != null) {
                            nVar.a(z.l(g.this.f22427b.getApplicationContext()));
                        }
                        nVar.b(r2);
                        if (g.this.f22431f != null) {
                            nVar.e(g.this.f22431f.getId());
                            nVar.f(g.this.f22431f.getRequestId());
                            nVar.s(g.this.f22431f.getCurrentLocalRid());
                            nVar.g(g.this.f22431f.getRequestIdNotice());
                        }
                        nVar.q(r3);
                        nVar.h(r4);
                        nVar.c(g.this.f22428c);
                        if (!TextUtils.isEmpty(r5)) {
                            nVar.t(r5);
                        }
                        nVar.e(2);
                        nVar.a("scenes", "1");
                        nVar.a("url", r3);
                        b.a(nVar, g.this.f22431f);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, g.this.f22431f);
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardCampaignsResourceManager", e8.getLocalizedMessage());
                        }
                    }
                }
            }
        }

        /* renamed from: com.mbridge.msdk.reward.adapter.b$g$2 */
        /* loaded from: classes4.dex */
        public final class AnonymousClass2 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f22442a;

            /* renamed from: b */
            final /* synthetic */ long f22443b;

            /* renamed from: c */
            final /* synthetic */ String f22444c;

            /* renamed from: d */
            final /* synthetic */ String f22445d;

            /* renamed from: e */
            final /* synthetic */ String f22446e;

            AnonymousClass2(int i8, long j8, String str, String str2, String str3) {
                r2 = i8;
                r3 = j8;
                r5 = str;
                r6 = str2;
                r7 = str3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (g.this.f22431f == null) {
                    return;
                }
                try {
                    n nVar = new n("m_download_end", r2, r3 + "", r5, g.this.f22431f.getId(), g.this.f22428c, r6, "1");
                    nVar.f(g.this.f22431f.getRequestId());
                    nVar.s(g.this.f22431f.getCurrentLocalRid());
                    nVar.g(g.this.f22431f.getRequestIdNotice());
                    nVar.e(g.this.f22431f.getId());
                    nVar.c(g.this.f22431f.getAdSpaceT());
                    nVar.t(r7);
                    nVar.a("scenes", "1");
                    if (g.this.f22431f.getAdType() == 287) {
                        nVar.d(ExifInterface.GPS_MEASUREMENT_3D);
                    } else if (g.this.f22431f.getAdType() == 94) {
                        nVar.d("1");
                    }
                    nVar.a("url", r5);
                    nVar.e(3);
                    b.a(nVar, g.this.f22431f);
                    com.mbridge.msdk.foundation.same.report.h.a(nVar, g.this.f22428c, g.this.f22431f);
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardCampaignsResourceManager", e8.getLocalizedMessage());
                    }
                }
            }
        }

        public g(Context context, String str, String str2, String str3, CampaignEx campaignEx, int i8, Handler handler, i iVar, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f22427b = context;
            this.f22429d = str;
            this.f22428c = str2;
            this.f22430e = str3;
            this.f22431f = campaignEx;
            this.f22432g = i8;
            this.f22433h = handler;
            this.f22434i = iVar;
            this.f22435j = copyOnWriteArrayList;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, false);
            long currentTimeMillis = System.currentTimeMillis() - this.f22436k;
            int i8 = this.f22432g;
            if (i8 != 313) {
                if (i8 != 497) {
                    if (i8 == 859) {
                        Message obtain = Message.obtain();
                        obtain.what = ComposerKt.providerValuesKey;
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22428c);
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f22429d);
                        bundle.putString("request_id", this.f22430e);
                        bundle.putString("url", str2);
                        bundle.putString("message", str);
                        obtain.setData(bundle);
                        this.f22433h.sendMessage(obtain);
                        if (this.f22434i != null) {
                            try {
                                this.f22434i.a(str2, this.f22430e, b.b(880006, new MBridgeIds(this.f22429d, this.f22428c, this.f22430e), "", null, null));
                            } catch (Exception e8) {
                                ad.b("RewardCampaignsResourceManager", e8.getMessage());
                            }
                        }
                        a(3, str2, str, "");
                        return;
                    }
                    return;
                }
                Message obtain2 = Message.obtain();
                obtain2.what = ComposerKt.providerKey;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22428c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f22429d);
                bundle2.putString("request_id", this.f22430e);
                bundle2.putString("url", str2);
                bundle2.putString("message", str);
                obtain2.setData(bundle2);
                this.f22433h.sendMessage(obtain2);
                if (this.f22426a) {
                    a(3, currentTimeMillis, str2, "zip download failed", "");
                    return;
                }
                return;
            }
            Message obtain3 = Message.obtain();
            obtain3.what = 101;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22428c);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f22429d);
            bundle3.putString("request_id", this.f22430e);
            bundle3.putString("url", str2);
            bundle3.putString("message", str);
            obtain3.setData(bundle3);
            this.f22433h.sendMessage(obtain3);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onSuccess(String str, String str2, boolean z8) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            long currentTimeMillis = System.currentTimeMillis() - this.f22436k;
            int i8 = this.f22432g;
            if (i8 != 313) {
                if (i8 != 497) {
                    if (i8 == 859) {
                        Message obtain = Message.obtain();
                        obtain.what = 103;
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22428c);
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f22429d);
                        bundle.putString("request_id", this.f22430e);
                        obtain.setData(bundle);
                        this.f22433h.sendMessage(obtain);
                        i iVar = this.f22434i;
                        if (iVar != null) {
                            iVar.a(this.f22429d, this.f22428c, this.f22430e, str);
                        }
                        if (!z8) {
                            a(1, str, "", str2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                Message obtain2 = Message.obtain();
                obtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22428c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f22429d);
                bundle2.putString("request_id", this.f22430e);
                bundle2.putString("url", str);
                obtain2.setData(bundle2);
                this.f22433h.sendMessage(obtain2);
                if (this.f22426a) {
                    a(1, currentTimeMillis, str, "", str2);
                    return;
                }
                return;
            }
            Message obtain3 = Message.obtain();
            obtain3.what = 101;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22428c);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f22429d);
            bundle3.putString("request_id", this.f22430e);
            bundle3.putString("url", str);
            obtain3.setData(bundle3);
            this.f22433h.sendMessage(obtain3);
        }

        public final void a(boolean z8) {
            this.f22426a = z8;
        }

        private void a(int i8, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.g.1

                /* renamed from: a */
                final /* synthetic */ int f22437a;

                /* renamed from: b */
                final /* synthetic */ String f22438b;

                /* renamed from: c */
                final /* synthetic */ String f22439c;

                /* renamed from: d */
                final /* synthetic */ String f22440d;

                AnonymousClass1(int i82, String str4, String str22, String str32) {
                    r2 = i82;
                    r3 = str4;
                    r4 = str22;
                    r5 = str32;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (g.this.f22431f != null && g.this.f22427b != null) {
                        try {
                            n nVar = new n();
                            nVar.a("m_download_end");
                            if (g.this.f22427b != null) {
                                nVar.a(z.l(g.this.f22427b.getApplicationContext()));
                            }
                            nVar.b(r2);
                            if (g.this.f22431f != null) {
                                nVar.e(g.this.f22431f.getId());
                                nVar.f(g.this.f22431f.getRequestId());
                                nVar.s(g.this.f22431f.getCurrentLocalRid());
                                nVar.g(g.this.f22431f.getRequestIdNotice());
                            }
                            nVar.q(r3);
                            nVar.h(r4);
                            nVar.c(g.this.f22428c);
                            if (!TextUtils.isEmpty(r5)) {
                                nVar.t(r5);
                            }
                            nVar.e(2);
                            nVar.a("scenes", "1");
                            nVar.a("url", r3);
                            b.a(nVar, g.this.f22431f);
                            com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, g.this.f22431f);
                        } catch (Exception e8) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b("RewardCampaignsResourceManager", e8.getLocalizedMessage());
                            }
                        }
                    }
                }
            });
        }

        private void a(int i8, long j8, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.g.2

                /* renamed from: a */
                final /* synthetic */ int f22442a;

                /* renamed from: b */
                final /* synthetic */ long f22443b;

                /* renamed from: c */
                final /* synthetic */ String f22444c;

                /* renamed from: d */
                final /* synthetic */ String f22445d;

                /* renamed from: e */
                final /* synthetic */ String f22446e;

                AnonymousClass2(int i82, long j82, String str4, String str22, String str32) {
                    r2 = i82;
                    r3 = j82;
                    r5 = str4;
                    r6 = str22;
                    r7 = str32;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (g.this.f22431f == null) {
                        return;
                    }
                    try {
                        n nVar = new n("m_download_end", r2, r3 + "", r5, g.this.f22431f.getId(), g.this.f22428c, r6, "1");
                        nVar.f(g.this.f22431f.getRequestId());
                        nVar.s(g.this.f22431f.getCurrentLocalRid());
                        nVar.g(g.this.f22431f.getRequestIdNotice());
                        nVar.e(g.this.f22431f.getId());
                        nVar.c(g.this.f22431f.getAdSpaceT());
                        nVar.t(r7);
                        nVar.a("scenes", "1");
                        if (g.this.f22431f.getAdType() == 287) {
                            nVar.d(ExifInterface.GPS_MEASUREMENT_3D);
                        } else if (g.this.f22431f.getAdType() == 94) {
                            nVar.d("1");
                        }
                        nVar.a("url", r5);
                        nVar.e(3);
                        b.a(nVar, g.this.f22431f);
                        com.mbridge.msdk.foundation.same.report.h.a(nVar, g.this.f22428c, g.this.f22431f);
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardCampaignsResourceManager", e8.getLocalizedMessage());
                        }
                    }
                }
            });
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends Handler {

        /* renamed from: a */
        private Context f22448a;

        /* renamed from: b */
        private ConcurrentHashMap<String, c> f22449b;

        /* renamed from: c */
        private ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> f22450c;

        public h(Looper looper) {
            super(looper);
            this.f22449b = new ConcurrentHashMap<>();
            this.f22450c = new ConcurrentHashMap<>();
        }

        public final void a(String str, String str2, String str3, c cVar) {
            this.f22449b.put(str2 + "_" + str3, cVar);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(16:6|(1:8)|9|(1:(1:(1:(1:14)(1:233))(1:234))(1:235))(1:236)|15|(1:232)(1:19)|(4:20|21|22|23)|(3:68|69|(4:71|(6:(2:78|(1:(2:81|(2:83|(2:86|(1:88)(2:89|(2:93|(1:97))))(1:85))(2:98|(1:100)))(2:101|(1:103)))(2:104|(1:106)))|107|108|109|110|111)(7:115|(1:(2:118|(2:120|(1:(1:131)(2:129|130)))(1:(4:164|(4:167|(2:171|172)|173|165)|176|177)(2:162|163)))(1:(4:187|(6:190|(1:194)|195|(2:199|200)|201|188)|204|205)(2:185|186)))(5:(1:226)(2:211|(2:213|214))|215|(4:218|(2:220|221)(1:223)|222|216)|224|225)|132|133|134|135|(3:144|145|147)(2:137|(5:139|140|141|32|33)(1:143)))|66|67))|25|26|27|28|(1:30)(4:(2:41|(1:(2:44|(2:46|(1:51))(2:52|(1:54)))(2:55|(1:57)))(2:58|(1:60)))|61|62|63)|31|32|33) */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x03ce, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x03cf, code lost:
        
            r10 = r15;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:249:0x0494  */
        /* JADX WARN: Removed duplicated region for block: B:251:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r10v12 */
        /* JADX WARN: Type inference failed for: r10v19 */
        /* JADX WARN: Type inference failed for: r10v2 */
        /* JADX WARN: Type inference failed for: r10v20 */
        /* JADX WARN: Type inference failed for: r10v21 */
        /* JADX WARN: Type inference failed for: r10v22 */
        /* JADX WARN: Type inference failed for: r10v3, types: [int] */
        /* JADX WARN: Type inference failed for: r10v4, types: [int] */
        /* JADX WARN: Type inference failed for: r10v5 */
        /* JADX WARN: Type inference failed for: r10v8 */
        /* JADX WARN: Type inference failed for: r15v11, types: [boolean] */
        /* JADX WARN: Type inference failed for: r15v8 */
        /* JADX WARN: Type inference failed for: r18v0, types: [com.mbridge.msdk.videocommon.download.b] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void handleMessage(android.os.Message r31) {
            /*
                Method dump skipped, instructions count: 1230
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.h.handleMessage(android.os.Message):void");
        }

        public final void a(Context context) {
            this.f22448a = context;
        }

        public final void a(String str, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f22450c.put(str, copyOnWriteArrayList);
        }
    }

    /* loaded from: classes4.dex */
    public interface i {
        void a(String str, String str2, com.mbridge.msdk.foundation.c.b bVar);

        void a(String str, String str2, String str3, String str4);
    }

    /* loaded from: classes4.dex */
    public interface j {
        void a(String str, String str2, String str3, a.C0435a c0435a, com.mbridge.msdk.foundation.c.b bVar);

        void a(String str, String str2, String str3, String str4, String str5, a.C0435a c0435a);
    }

    /* loaded from: classes4.dex */
    public static final class m {

        /* renamed from: a */
        private static final b f22494a = new b();
    }

    /* synthetic */ b(AnonymousClass1 anonymousClass1) {
        this();
    }

    private b() {
        this.f22331d = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;
        this.f22332e = "down_type";
        this.f22333f = "h3c";
        this.f22334g = new ArrayList(6);
        HandlerThread handlerThread = new HandlerThread("mb-reward-load-thread");
        f22328b = new ConcurrentHashMap<>();
        handlerThread.start();
        this.f22329a = new h(handlerThread.getLooper());
    }

    public static synchronized String b(int i8) {
        synchronized (b.class) {
            if (i8 == 200) {
                return MimeTypes.BASE_TYPE_VIDEO;
            }
            if (i8 == 201) {
                return "zip/html";
            }
            if (i8 == 203) {
                return "temp";
            }
            if (i8 != 205) {
                return EnvironmentCompat.MEDIA_UNKNOWN;
            }
            return "tpl";
        }
    }

    public static b a() {
        return m.f22494a;
    }

    public final synchronized void a(Context context, boolean z8, int i8, boolean z9, int i9, String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, c cVar, i iVar) {
        String str4 = str2 + "_" + str3;
        f22328b.put(str4, new a(z8, z9, i8, copyOnWriteArrayList.size(), str2, str3, i9, copyOnWriteArrayList));
        this.f22329a.a(str, str2, str3, cVar);
        this.f22329a.a(context);
        this.f22329a.a(str4, copyOnWriteArrayList);
        this.f22329a.post(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.1

            /* renamed from: a */
            final /* synthetic */ CopyOnWriteArrayList f22335a;

            /* renamed from: b */
            final /* synthetic */ Context f22336b;

            /* renamed from: c */
            final /* synthetic */ String f22337c;

            /* renamed from: d */
            final /* synthetic */ int f22338d;

            /* renamed from: e */
            final /* synthetic */ String f22339e;

            /* renamed from: f */
            final /* synthetic */ String f22340f;

            /* renamed from: g */
            final /* synthetic */ i f22341g;

            AnonymousClass1(CopyOnWriteArrayList copyOnWriteArrayList2, Context context2, String str22, int i92, String str5, String str32, i iVar2) {
                r2 = copyOnWriteArrayList2;
                r3 = context2;
                r4 = str22;
                r5 = i92;
                r6 = str5;
                r7 = str32;
                r8 = iVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                    	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:819)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1117)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:884)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:80)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
                    */
                /*
                    Method dump skipped, instructions count: 981
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.AnonymousClass1.run():void");
            }
        });
    }

    public static com.mbridge.msdk.foundation.c.b b(int i8, MBridgeIds mBridgeIds, String str, Throwable th, CampaignEx campaignEx) {
        com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(i8);
        bVar.a(mBridgeIds);
        bVar.a(th);
        bVar.a(str);
        bVar.a(campaignEx);
        return bVar;
    }

    /* loaded from: classes4.dex */
    private static final class f implements com.mbridge.msdk.videocommon.listener.a {

        /* renamed from: a */
        private Handler f22422a;

        /* renamed from: b */
        private final String f22423b;

        /* renamed from: c */
        private final String f22424c;

        /* renamed from: d */
        private final String f22425d;

        public f(Handler handler, String str, String str2, String str3) {
            this.f22422a = handler;
            this.f22424c = str;
            this.f22423b = str2;
            this.f22425d = str3;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public final void a(String str) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str, true);
            Message obtain = Message.obtain();
            obtain.what = 100;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22423b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f22424c);
            bundle.putString("request_id", this.f22425d);
            bundle.putString("url", str);
            obtain.setData(bundle);
            this.f22422a.sendMessage(obtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public final void a(String str, String str2) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str2, false);
            Message obtain = Message.obtain();
            obtain.what = 200;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22423b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f22424c);
            bundle.putString("request_id", this.f22425d);
            bundle.putString("url", str2);
            bundle.putString("message", str);
            obtain.setData(bundle);
            this.f22422a.sendMessage(obtain);
        }
    }

    public void a(int i8, CampaignEx campaignEx, String str, String str2) {
        com.mbridge.msdk.foundation.tools.n.a(i8, str, str2, new n.a() { // from class: com.mbridge.msdk.reward.adapter.b.2

            /* renamed from: a */
            final /* synthetic */ int f22343a;

            /* renamed from: b */
            final /* synthetic */ CampaignEx f22344b;

            AnonymousClass2(int i82, CampaignEx campaignEx2) {
                r2 = i82;
                r3 = campaignEx2;
            }

            @Override // com.mbridge.msdk.foundation.tools.n.a
            public final void a(String str3, String str4, String str5, String str6, boolean z8) {
                if (z8) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                    int i9 = r2;
                    if (i9 == 0) {
                        nVar.e(1);
                        nVar.b(1);
                        nVar.a("m_download_end");
                    } else if (i9 == 1) {
                        nVar.e(2);
                        nVar.b(1);
                        nVar.a("m_download_end");
                    } else if (i9 == 2) {
                        nVar.e(3);
                        nVar.b(1);
                        nVar.a("m_download_end");
                        nVar.d(r3.isMraid() ? com.mbridge.msdk.foundation.entity.n.f20403a : com.mbridge.msdk.foundation.entity.n.f20404b);
                        nVar.o("1");
                    }
                    nVar.g(r3.getRequestIdNotice());
                    nVar.a("url", str3);
                    nVar.a("scenes", "1");
                    com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, r3);
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardCampaignsResourceManager", e8.getMessage());
                    }
                }
            }

            @Override // com.mbridge.msdk.foundation.tools.n.a
            public final void a(String str3, DownloadError downloadError) {
                String str4 = "";
                if (downloadError != null) {
                    try {
                        if (downloadError.getException() != null) {
                            str4 = downloadError.getException().getMessage();
                        }
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            e8.printStackTrace();
                            return;
                        }
                        return;
                    }
                }
                com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                int i9 = r2;
                if (i9 == 0) {
                    nVar.e(1);
                    nVar.b(3);
                    nVar.a("m_download_end");
                } else if (i9 == 1) {
                    nVar.e(2);
                    nVar.b(3);
                    nVar.a("m_download_end");
                } else if (i9 == 2) {
                    nVar.e(3);
                    nVar.b(3);
                    nVar.a("m_download_end");
                    nVar.d(r3.isMraid() ? com.mbridge.msdk.foundation.entity.n.f20403a : com.mbridge.msdk.foundation.entity.n.f20404b);
                    nVar.o("1");
                }
                b.a(nVar, r3);
                nVar.g(r3.getRequestIdNotice());
                nVar.h(str4);
                nVar.a("scenes", "1");
                nVar.a("url", str3);
                com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, r3);
            }
        }, campaignEx2);
    }

    public final synchronized void a(Context context, CampaignEx campaignEx, String str, String str2, String str3, i iVar) {
        try {
            this.f22329a.a(context);
            if (campaignEx != null) {
                String cMPTEntryUrl = campaignEx.getCMPTEntryUrl();
                if (campaignEx.isDynamicView()) {
                    if (ai.a(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW, cMPTEntryUrl)) {
                        a(0, campaignEx, campaignEx.getMof_tplid() + "", cMPTEntryUrl);
                    }
                    ResDownloadCheckManager.getInstance().setZipDownloadDone(cMPTEntryUrl, true);
                    Message obtain = Message.obtain();
                    obtain.what = 105;
                    Bundle bundle = new Bundle();
                    bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                    bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                    bundle.putString("request_id", str3);
                    bundle.putString("url", cMPTEntryUrl);
                    obtain.setData(bundle);
                    this.f22329a.sendMessage(obtain);
                    if (iVar != null) {
                        iVar.a(str, str2, str3, cMPTEntryUrl);
                    }
                    return;
                }
            }
            if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                try {
                    com.mbridge.msdk.foundation.same.report.d.b b8 = com.mbridge.msdk.foundation.same.report.d.c.a().b(campaignEx.getCurrentLocalRid());
                    if (b8 == null) {
                        b8 = new com.mbridge.msdk.foundation.same.report.d.b();
                    }
                    com.mbridge.msdk.foundation.same.report.d.b bVar = b8;
                    bVar.a(campaignEx);
                    bVar.a(1);
                    bVar.c(a(campaignEx));
                    H5DownLoadManager.getInstance().downloadH5Res(bVar, campaignEx.getCMPTEntryUrl(), new H5DownLoadManager.ZipDownloadListener() { // from class: com.mbridge.msdk.reward.adapter.b.3

                        /* renamed from: a */
                        final /* synthetic */ String f22346a;

                        /* renamed from: b */
                        final /* synthetic */ String f22347b;

                        /* renamed from: c */
                        final /* synthetic */ String f22348c;

                        /* renamed from: d */
                        final /* synthetic */ i f22349d;

                        /* renamed from: e */
                        final /* synthetic */ Context f22350e;

                        /* renamed from: f */
                        final /* synthetic */ CampaignEx f22351f;

                        AnonymousClass3(String str22, String str4, String str32, i iVar2, Context context2, CampaignEx campaignEx2) {
                            r2 = str22;
                            r3 = str4;
                            r4 = str32;
                            r5 = iVar2;
                            r6 = context2;
                            r7 = campaignEx2;
                        }

                        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
                        public final void onFailed(String str4, String str5) {
                            /*  JADX ERROR: Method code generation error
                                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                                	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:819)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1117)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:884)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:315)
                                	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:315)
                                	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                                	at jadx.core.ProcessClass.process(ProcessClass.java:80)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
                                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
                                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
                                */
                            /*
                                Method dump skipped, instructions count: 269
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.AnonymousClass3.onFailed(java.lang.String, java.lang.String):void");
                        }

                        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
                        public final void onSuccess(String str4, String str22, boolean z8) {
                            try {
                                ad.a("RewardCampaignsResourceManager", "zip btl template download success");
                                ResDownloadCheckManager.getInstance().setZipDownloadDone(str4, true);
                                Message obtain2 = Message.obtain();
                                obtain2.what = 105;
                                Bundle bundle2 = new Bundle();
                                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, r2);
                                bundle2.putString(MBridgeConstans.PLACEMENT_ID, r3);
                                bundle2.putString("request_id", r4);
                                bundle2.putString("url", str4);
                                obtain2.setData(bundle2);
                                b.this.f22329a.sendMessage(obtain2);
                                i iVar2 = r5;
                                if (iVar2 != null) {
                                    iVar2.a(r3, r2, r4, str4);
                                }
                                if (!z8) {
                                    b.a(b.this, r6, 1, r7, str4, "", r2, str22);
                                }
                            } catch (Exception e8) {
                                ResDownloadCheckManager.getInstance().setZipDownloadDone(str4, false);
                                Message obtain22 = Message.obtain();
                                obtain22.what = 205;
                                Bundle bundle22 = new Bundle();
                                bundle22.putString(MBridgeConstans.PROPERTIES_UNIT_ID, r2);
                                bundle22.putString(MBridgeConstans.PLACEMENT_ID, r3);
                                bundle22.putString("request_id", r4);
                                bundle22.putString("url", str4);
                                obtain22.setData(bundle22);
                                b.this.f22329a.sendMessage(obtain22);
                                if (r5 != null) {
                                    try {
                                        r5.a(str4, r4, b.b(880005, new MBridgeIds(r3, r2, r4), "", e8, null));
                                    } catch (Exception e9) {
                                        ad.b("RewardCampaignsResourceManager", e9.getMessage());
                                    }
                                }
                                b.a(b.this, r6, 3, r7, str4, e8.getLocalizedMessage(), r2, str22);
                                if (MBridgeConstans.DEBUG) {
                                    ad.b("RewardCampaignsResourceManager", e8.getLocalizedMessage());
                                }
                            }
                        }
                    });
                } catch (Exception e8) {
                    ad.b("RewardCampaignsResourceManager", e8.getLocalizedMessage());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.b$2 */
    /* loaded from: classes4.dex */
    public final class AnonymousClass2 implements n.a {

        /* renamed from: a */
        final /* synthetic */ int f22343a;

        /* renamed from: b */
        final /* synthetic */ CampaignEx f22344b;

        AnonymousClass2(int i82, CampaignEx campaignEx2) {
            r2 = i82;
            r3 = campaignEx2;
        }

        @Override // com.mbridge.msdk.foundation.tools.n.a
        public final void a(String str3, String str4, String str5, String str6, boolean z8) {
            if (z8) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                int i9 = r2;
                if (i9 == 0) {
                    nVar.e(1);
                    nVar.b(1);
                    nVar.a("m_download_end");
                } else if (i9 == 1) {
                    nVar.e(2);
                    nVar.b(1);
                    nVar.a("m_download_end");
                } else if (i9 == 2) {
                    nVar.e(3);
                    nVar.b(1);
                    nVar.a("m_download_end");
                    nVar.d(r3.isMraid() ? com.mbridge.msdk.foundation.entity.n.f20403a : com.mbridge.msdk.foundation.entity.n.f20404b);
                    nVar.o("1");
                }
                nVar.g(r3.getRequestIdNotice());
                nVar.a("url", str3);
                nVar.a("scenes", "1");
                com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, r3);
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardCampaignsResourceManager", e8.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.tools.n.a
        public final void a(String str3, DownloadError downloadError) {
            String str4 = "";
            if (downloadError != null) {
                try {
                    if (downloadError.getException() != null) {
                        str4 = downloadError.getException().getMessage();
                    }
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        e8.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
            int i9 = r2;
            if (i9 == 0) {
                nVar.e(1);
                nVar.b(3);
                nVar.a("m_download_end");
            } else if (i9 == 1) {
                nVar.e(2);
                nVar.b(3);
                nVar.a("m_download_end");
            } else if (i9 == 2) {
                nVar.e(3);
                nVar.b(3);
                nVar.a("m_download_end");
                nVar.d(r3.isMraid() ? com.mbridge.msdk.foundation.entity.n.f20403a : com.mbridge.msdk.foundation.entity.n.f20404b);
                nVar.o("1");
            }
            b.a(nVar, r3);
            nVar.g(r3.getRequestIdNotice());
            nVar.h(str4);
            nVar.a("scenes", "1");
            nVar.a("url", str3);
            com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, r3);
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.b$b */
    /* loaded from: classes4.dex */
    public static class C0416b extends com.mbridge.msdk.mbsignalcommon.b.a {

        /* renamed from: a */
        private final Handler f22378a;

        /* renamed from: b */
        private final Runnable f22379b;

        /* renamed from: c */
        private final boolean f22380c;

        /* renamed from: d */
        private final boolean f22381d;

        /* renamed from: e */
        private int f22382e;

        /* renamed from: f */
        private String f22383f;

        /* renamed from: g */
        private String f22384g;

        /* renamed from: h */
        private String f22385h;

        /* renamed from: i */
        private String f22386i;

        /* renamed from: j */
        private a.C0435a f22387j;

        /* renamed from: k */
        private CampaignEx f22388k;

        /* renamed from: l */
        private CopyOnWriteArrayList<CampaignEx> f22389l;

        /* renamed from: m */
        private com.mbridge.msdk.videocommon.d.c f22390m;

        /* renamed from: n */
        private final j f22391n;

        /* renamed from: o */
        private boolean f22392o;

        /* renamed from: p */
        private boolean f22393p;

        /* renamed from: q */
        private boolean f22394q;

        /* renamed from: r */
        private int f22395r = 0;

        /* renamed from: s */
        private boolean f22396s;

        /* renamed from: t */
        private long f22397t;

        public C0416b(boolean z8, Handler handler, Runnable runnable, boolean z9, boolean z10, int i8, String str, String str2, String str3, String str4, a.C0435a c0435a, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.videocommon.d.c cVar, j jVar, boolean z11, long j8) {
            this.f22378a = handler;
            this.f22379b = runnable;
            this.f22380c = z9;
            this.f22381d = z10;
            this.f22382e = i8;
            this.f22383f = str;
            this.f22385h = str2;
            this.f22384g = str3;
            this.f22386i = str4;
            this.f22387j = c0435a;
            this.f22388k = campaignEx;
            this.f22389l = copyOnWriteArrayList;
            this.f22390m = cVar;
            this.f22391n = jVar;
            this.f22392o = z11;
            this.f22396s = z8;
            this.f22397t = j8;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i8) {
            Runnable runnable;
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("type", 1);
                dVar.a("result", Integer.valueOf(i8));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000155", this.f22388k, dVar);
            } catch (Throwable th) {
                ad.b("RVWindVaneWebView", th.getMessage());
            }
            if (this.f22394q) {
                return;
            }
            String str = this.f22384g + "_" + this.f22383f;
            if (i8 == 1) {
                if (this.f22392o) {
                    com.mbridge.msdk.videocommon.a.e(this.f22384g + "_" + this.f22386i);
                } else {
                    com.mbridge.msdk.videocommon.a.d(this.f22384g + "_" + this.f22386i);
                }
                com.mbridge.msdk.videocommon.a.a(this.f22384g + "_" + this.f22386i + "_" + this.f22383f, this.f22387j, true, this.f22392o);
                Handler handler = this.f22378a;
                if (handler != null && (runnable = this.f22379b) != null) {
                    handler.removeCallbacks(runnable);
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f22384g + "_" + this.f22386i + "_" + this.f22383f, true);
                a.C0435a c0435a = this.f22387j;
                if (c0435a != null) {
                    c0435a.a(true);
                }
                j jVar = this.f22391n;
                if (jVar != null) {
                    jVar.a(str, this.f22385h, this.f22384g, this.f22386i, this.f22383f, this.f22387j);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f22384g + "_" + this.f22386i + "_" + this.f22383f, false);
                a.C0435a c0435a2 = this.f22387j;
                if (c0435a2 != null) {
                    c0435a2.a(false);
                }
                if (this.f22391n != null) {
                    this.f22391n.a(str, this.f22386i, this.f22383f, this.f22387j, b.b(880008, new MBridgeIds(this.f22385h, this.f22384g, this.f22386i), "readyState:" + i8, null, this.f22388k));
                }
            }
            this.f22394q = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.a
        public final void a(WebView webView, String str, String str2, int i8, int i9) {
            boolean z8 = true;
            if (i8 == 1) {
                try {
                    com.mbridge.msdk.reward.b.a aVar = new com.mbridge.msdk.reward.b.a();
                    aVar.b(false);
                    if (i9 != 2) {
                        z8 = false;
                    }
                    aVar.a(z8);
                    aVar.b(str, str2);
                    aVar.a(new com.mbridge.msdk.video.bt.module.b.a(null));
                    aVar.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, i9, str2, true, 1));
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RVWindVaneWebView", e8.getMessage());
                    }
                }
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:8|(1:10)(1:54)|11|(3:14|15|(5:20|(3:22|23|24)(2:36|(1:41)(1:40))|25|26|28))|46|47|48|25|26|28) */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0128, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x012b, code lost:
        
            if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L107;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x012d, code lost:
        
            com.mbridge.msdk.foundation.tools.ad.b("RewardCampaignsResourceManager", r0.getLocalizedMessage());
         */
        @Override // com.mbridge.msdk.mbsignalcommon.b.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(java.lang.Object r18, java.lang.String r19) {
            /*
                Method dump skipped, instructions count: 327
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.C0416b.a(java.lang.Object, java.lang.String):void");
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, String str) {
            Runnable runnable;
            super.a(webView, str);
            if (this.f22393p) {
                return;
            }
            String str2 = this.f22384g + "_" + this.f22383f;
            if (!str.contains("wfr=1")) {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f22384g + "_" + this.f22386i + "_" + this.f22383f, true);
                Handler handler = this.f22378a;
                if (handler != null && (runnable = this.f22379b) != null) {
                    handler.removeCallbacks(runnable);
                }
                a.C0435a c0435a = this.f22387j;
                if (c0435a != null) {
                    c0435a.a(true);
                }
                j jVar = this.f22391n;
                if (jVar != null) {
                    jVar.a(str2, this.f22385h, this.f22384g, this.f22386i, this.f22383f, this.f22387j);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(webView);
            this.f22393p = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i8, String str, String str2) {
            super.a(webView, i8, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f22384g + "_" + this.f22386i + "_" + this.f22383f, false);
            if (this.f22391n != null) {
                String str3 = this.f22384g + "_" + this.f22383f;
                a.C0435a c0435a = this.f22387j;
                if (c0435a != null) {
                    c0435a.a(false);
                }
                this.f22391n.a(str3, this.f22386i, this.f22383f, this.f22387j, b.b(880008, new MBridgeIds(this.f22385h, this.f22384g, this.f22386i), "onReceivedError： " + i8 + "  " + str, null, this.f22388k));
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView) {
            if (webView != null) {
                try {
                    try {
                        LinkedHashMap<String, View> b8 = com.mbridge.msdk.video.bt.a.d.c().b(this.f22384g, this.f22386i);
                        if (b8 != null && !b8.isEmpty()) {
                            for (View view : b8.values()) {
                                if (view instanceof MBridgeBTContainer) {
                                    ((MBridgeBTContainer) view).addNativeCloseButtonWhenWebViewCrash();
                                }
                            }
                        }
                    } catch (Throwable th) {
                        ad.b("OperateViews", th.getMessage());
                    }
                } catch (Throwable th2) {
                    ad.b("RVWindVaneWebView", th2.getMessage());
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class k extends com.mbridge.msdk.mbsignalcommon.b.b {

        /* renamed from: a */
        private Handler f22451a;

        /* renamed from: b */
        private Runnable f22452b;

        /* renamed from: c */
        private final boolean f22453c;

        /* renamed from: d */
        private final boolean f22454d;

        /* renamed from: e */
        private String f22455e;

        /* renamed from: f */
        private final j f22456f;

        /* renamed from: g */
        private final WindVaneWebView f22457g;

        /* renamed from: h */
        private final String f22458h;

        /* renamed from: i */
        private final String f22459i;

        /* renamed from: j */
        private final String f22460j;

        /* renamed from: k */
        private final a.C0435a f22461k;

        /* renamed from: l */
        private final CampaignEx f22462l;

        /* renamed from: m */
        private CopyOnWriteArrayList<CampaignEx> f22463m;

        /* renamed from: n */
        private long f22464n;

        /* renamed from: o */
        private boolean f22465o;

        /* renamed from: p */
        private boolean f22466p;

        /* renamed from: q */
        private final Runnable f22467q;

        /* renamed from: r */
        private final Runnable f22468r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.mbridge.msdk.reward.adapter.b$k$1 */
        /* loaded from: classes4.dex */
        public final class AnonymousClass1 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ j f22469a;

            /* renamed from: b */
            final /* synthetic */ a.C0435a f22470b;

            /* renamed from: c */
            final /* synthetic */ String f22471c;

            /* renamed from: d */
            final /* synthetic */ String f22472d;

            /* renamed from: e */
            final /* synthetic */ String f22473e;

            /* renamed from: f */
            final /* synthetic */ String f22474f;

            AnonymousClass1(j jVar, a.C0435a c0435a, String str, String str2, String str3, String str4) {
                r2 = jVar;
                r3 = c0435a;
                r4 = str;
                r5 = str2;
                r6 = str3;
                r7 = str4;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WindVaneWebView a8;
                a.C0435a c0435a;
                if (r2 != null && (c0435a = r3) != null) {
                    c0435a.a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(r4 + "_" + r5 + "_" + r6, true);
                    j jVar = r2;
                    StringBuilder sb = new StringBuilder();
                    sb.append(r4);
                    sb.append("_");
                    sb.append(r6);
                    jVar.a(sb.toString(), r7, r4, r5, r6, r3);
                }
                a.C0435a c0435a2 = r3;
                if (c0435a2 != null && (a8 = c0435a2.a()) != null) {
                    try {
                        a8.release();
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("WindVaneWebView", e8.getMessage());
                        }
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.mbridge.msdk.reward.adapter.b$k$2 */
        /* loaded from: classes4.dex */
        public final class AnonymousClass2 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ j f22476a;

            /* renamed from: b */
            final /* synthetic */ a.C0435a f22477b;

            /* renamed from: c */
            final /* synthetic */ String f22478c;

            /* renamed from: d */
            final /* synthetic */ String f22479d;

            /* renamed from: e */
            final /* synthetic */ String f22480e;

            /* renamed from: f */
            final /* synthetic */ String f22481f;

            AnonymousClass2(j jVar, a.C0435a c0435a, String str, String str2, String str3, String str4) {
                r2 = jVar;
                r3 = c0435a;
                r4 = str;
                r5 = str2;
                r6 = str3;
                r7 = str4;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WindVaneWebView a8;
                a.C0435a c0435a;
                if (r2 != null && (c0435a = r3) != null) {
                    c0435a.a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(r4 + "_" + r5 + "_" + r6, true);
                    j jVar = r2;
                    StringBuilder sb = new StringBuilder();
                    sb.append(r4);
                    sb.append("_");
                    sb.append(r6);
                    jVar.a(sb.toString(), r7, r4, r5, r6, r3);
                }
                a.C0435a c0435a2 = r3;
                if (c0435a2 != null && (a8 = c0435a2.a()) != null) {
                    try {
                        a8.release();
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("WindVaneWebView", e8.getMessage());
                        }
                    }
                }
            }
        }

        public k(Handler handler, Runnable runnable, boolean z8, boolean z9, String str, j jVar, WindVaneWebView windVaneWebView, String str2, String str3, String str4, a.C0435a c0435a, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, long j8) {
            this.f22451a = handler;
            this.f22452b = runnable;
            this.f22453c = z8;
            this.f22454d = z9;
            this.f22455e = str;
            this.f22456f = jVar;
            this.f22457g = windVaneWebView;
            this.f22458h = str2;
            this.f22459i = str4;
            this.f22460j = str3;
            this.f22461k = c0435a;
            this.f22462l = campaignEx;
            this.f22463m = copyOnWriteArrayList;
            this.f22464n = j8;
            AnonymousClass1 anonymousClass1 = new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.k.1

                /* renamed from: a */
                final /* synthetic */ j f22469a;

                /* renamed from: b */
                final /* synthetic */ a.C0435a f22470b;

                /* renamed from: c */
                final /* synthetic */ String f22471c;

                /* renamed from: d */
                final /* synthetic */ String f22472d;

                /* renamed from: e */
                final /* synthetic */ String f22473e;

                /* renamed from: f */
                final /* synthetic */ String f22474f;

                AnonymousClass1(j jVar2, a.C0435a c0435a2, String str42, String str5, String str22, String str32) {
                    r2 = jVar2;
                    r3 = c0435a2;
                    r4 = str42;
                    r5 = str5;
                    r6 = str22;
                    r7 = str32;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    WindVaneWebView a8;
                    a.C0435a c0435a2;
                    if (r2 != null && (c0435a2 = r3) != null) {
                        c0435a2.a(true);
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(r4 + "_" + r5 + "_" + r6, true);
                        j jVar2 = r2;
                        StringBuilder sb = new StringBuilder();
                        sb.append(r4);
                        sb.append("_");
                        sb.append(r6);
                        jVar2.a(sb.toString(), r7, r4, r5, r6, r3);
                    }
                    a.C0435a c0435a22 = r3;
                    if (c0435a22 != null && (a8 = c0435a22.a()) != null) {
                        try {
                            a8.release();
                        } catch (Exception e8) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b("WindVaneWebView", e8.getMessage());
                            }
                        }
                    }
                }
            };
            this.f22468r = anonymousClass1;
            this.f22467q = new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.k.2

                /* renamed from: a */
                final /* synthetic */ j f22476a;

                /* renamed from: b */
                final /* synthetic */ a.C0435a f22477b;

                /* renamed from: c */
                final /* synthetic */ String f22478c;

                /* renamed from: d */
                final /* synthetic */ String f22479d;

                /* renamed from: e */
                final /* synthetic */ String f22480e;

                /* renamed from: f */
                final /* synthetic */ String f22481f;

                AnonymousClass2(j jVar2, a.C0435a c0435a2, String str42, String str5, String str22, String str32) {
                    r2 = jVar2;
                    r3 = c0435a2;
                    r4 = str42;
                    r5 = str5;
                    r6 = str22;
                    r7 = str32;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    WindVaneWebView a8;
                    a.C0435a c0435a2;
                    if (r2 != null && (c0435a2 = r3) != null) {
                        c0435a2.a(true);
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(r4 + "_" + r5 + "_" + r6, true);
                        j jVar2 = r2;
                        StringBuilder sb = new StringBuilder();
                        sb.append(r4);
                        sb.append("_");
                        sb.append(r6);
                        jVar2.a(sb.toString(), r7, r4, r5, r6, r3);
                    }
                    a.C0435a c0435a22 = r3;
                    if (c0435a22 != null && (a8 = c0435a22.a()) != null) {
                        try {
                            a8.release();
                        } catch (Exception e8) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b("WindVaneWebView", e8.getMessage());
                            }
                        }
                    }
                }
            };
            if (handler != null) {
                handler.postDelayed(anonymousClass1, 5000L);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i8) {
            Handler handler;
            Runnable runnable;
            Runnable runnable2;
            super.a(webView, i8);
            Handler handler2 = this.f22451a;
            if (handler2 != null && (runnable2 = this.f22467q) != null) {
                handler2.removeCallbacks(runnable2);
            }
            Handler handler3 = this.f22451a;
            if (handler3 != null && (runnable = this.f22468r) != null) {
                handler3.removeCallbacks(runnable);
            }
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("type", 2);
                dVar.a("result", Integer.valueOf(i8));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000155", this.f22462l, dVar);
            } catch (Throwable th) {
                ad.b("WindVaneWebView", th.getMessage());
            }
            if (this.f22466p) {
                return;
            }
            String str = this.f22459i + "_" + this.f22458h;
            if (i8 == 1) {
                Runnable runnable3 = this.f22452b;
                if (runnable3 != null && (handler = this.f22451a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f22459i + "_" + this.f22455e + "_" + this.f22458h, true);
                a.C0435a c0435a = this.f22461k;
                if (c0435a != null) {
                    c0435a.a(true);
                }
                if (this.f22453c) {
                    if (this.f22454d) {
                        com.mbridge.msdk.videocommon.a.a(287, this.f22462l.getRequestIdNotice(), this.f22461k);
                    } else {
                        com.mbridge.msdk.videocommon.a.b(287, this.f22462l.getRequestIdNotice(), this.f22461k);
                    }
                } else if (this.f22454d) {
                    com.mbridge.msdk.videocommon.a.a(94, this.f22462l.getRequestIdNotice(), this.f22461k);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.f22462l.getRequestIdNotice(), this.f22461k);
                }
                j jVar = this.f22456f;
                if (jVar != null) {
                    jVar.a(str, this.f22460j, this.f22459i, this.f22455e, this.f22458h, this.f22461k);
                }
            } else if (this.f22456f != null) {
                this.f22456f.a(str, this.f22455e, this.f22458h, this.f22461k, b.b(880009, new MBridgeIds(this.f22460j, this.f22459i, this.f22455e), "readyState:" + i8, null, this.f22462l));
            }
            this.f22466p = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i8, String str, String str2) {
            super.a(webView, i8, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f22459i + "_" + this.f22455e + "_" + this.f22458h, false);
            Handler handler = this.f22451a;
            if (handler != null) {
                if (this.f22467q != null) {
                    handler.removeCallbacks(this.f22468r);
                }
                Runnable runnable = this.f22467q;
                if (runnable != null) {
                    this.f22451a.removeCallbacks(runnable);
                }
            }
            try {
                String str3 = this.f22459i + "_" + this.f22458h;
                a.C0435a c0435a = this.f22461k;
                if (c0435a != null) {
                    c0435a.a(false);
                }
                if (this.f22456f != null) {
                    this.f22456f.a(str3, this.f22455e, str2, this.f22461k, b.b(880009, new MBridgeIds(this.f22460j, this.f22459i, this.f22455e), i8 + "#" + str, null, this.f22462l));
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("WindVaneWebView", e8.getLocalizedMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.a(webView, sslErrorHandler, sslError);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f22459i + "_" + this.f22455e + "_" + this.f22458h, false);
            Handler handler = this.f22451a;
            if (handler != null) {
                if (this.f22467q != null) {
                    handler.removeCallbacks(this.f22468r);
                }
                Runnable runnable = this.f22467q;
                if (runnable != null) {
                    this.f22451a.removeCallbacks(runnable);
                }
            }
            try {
                String str = this.f22459i + "_" + this.f22458h;
                a.C0435a c0435a = this.f22461k;
                if (c0435a != null) {
                    c0435a.a(false);
                }
                if (this.f22456f != null) {
                    MBridgeIds mBridgeIds = new MBridgeIds(this.f22460j, this.f22459i, this.f22455e);
                    StringBuilder sb = new StringBuilder();
                    sb.append("onReceivedSslError:");
                    sb.append(sslError == null ? "" : Integer.valueOf(sslError.getPrimaryError()));
                    this.f22456f.a(str, this.f22455e, this.f22458h, this.f22461k, b.b(880009, mBridgeIds, sb.toString(), null, this.f22462l));
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("WindVaneWebView", e8.getLocalizedMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, String str) {
            Runnable runnable;
            Handler handler;
            Runnable runnable2;
            super.a(webView, str);
            Handler handler2 = this.f22451a;
            if (handler2 != null && (runnable2 = this.f22468r) != null) {
                handler2.removeCallbacks(runnable2);
            }
            if (this.f22465o) {
                return;
            }
            if (!str.contains("wfr=1")) {
                String str2 = this.f22459i + "_" + this.f22458h;
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f22459i + "_" + this.f22455e + "_" + this.f22458h, true);
                Runnable runnable3 = this.f22452b;
                if (runnable3 != null && (handler = this.f22451a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                a.C0435a c0435a = this.f22461k;
                if (c0435a != null) {
                    c0435a.a(true);
                }
                if (this.f22453c) {
                    if (this.f22462l.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(287, this.f22462l.getRequestIdNotice(), this.f22461k);
                    } else {
                        com.mbridge.msdk.videocommon.a.b(287, this.f22462l.getRequestIdNotice(), this.f22461k);
                    }
                } else if (this.f22462l.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(94, this.f22462l.getRequestIdNotice(), this.f22461k);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.f22462l.getRequestIdNotice(), this.f22461k);
                }
                j jVar = this.f22456f;
                if (jVar != null) {
                    jVar.a(str2, this.f22460j, this.f22459i, this.f22455e, this.f22458h, this.f22461k);
                }
            } else {
                Handler handler3 = this.f22451a;
                if (handler3 != null && (runnable = this.f22467q) != null) {
                    handler3.postDelayed(runnable, 5000L);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(webView);
            this.f22465o = true;
        }
    }

    /* loaded from: classes4.dex */
    private static class l extends com.mbridge.msdk.mbsignalcommon.b.b {

        /* renamed from: a */
        private String f22483a;

        /* renamed from: b */
        private final boolean f22484b;

        /* renamed from: c */
        private final WindVaneWebView f22485c;

        /* renamed from: d */
        private final String f22486d;

        /* renamed from: e */
        private final String f22487e;

        /* renamed from: f */
        private final a.C0435a f22488f;

        /* renamed from: g */
        private final CampaignEx f22489g;

        /* renamed from: h */
        private boolean f22490h;

        /* renamed from: i */
        private String f22491i;

        /* renamed from: j */
        private boolean f22492j;

        /* renamed from: k */
        private boolean f22493k;

        public l(String str, boolean z8, WindVaneWebView windVaneWebView, String str2, String str3, a.C0435a c0435a, CampaignEx campaignEx, boolean z9, String str4) {
            this.f22484b = z8;
            this.f22485c = windVaneWebView;
            this.f22486d = str2;
            this.f22487e = str3;
            this.f22488f = c0435a;
            this.f22489g = campaignEx;
            this.f22483a = str;
            this.f22490h = z9;
            this.f22491i = str4;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i8) {
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("type", 2);
                dVar.a("result", Integer.valueOf(i8));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000155", this.f22489g, dVar);
            } catch (Throwable th) {
                ad.b("WindVaneWebView", th.getMessage());
            }
            if (this.f22493k) {
                return;
            }
            if (this.f22485c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f22483a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", i8);
                    jSONObject2.put(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "");
                    jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) this.f22485c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("WindVaneWebView", e8.getLocalizedMessage());
                    }
                }
            }
            String str = this.f22487e + "_" + this.f22489g.getId() + "_" + this.f22489g.getRequestId() + "_" + this.f22486d;
            if (i8 == 1) {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f22487e + "_" + this.f22491i + "_" + this.f22486d, true);
                a.C0435a c0435a = this.f22488f;
                if (c0435a != null) {
                    c0435a.a(true);
                }
                if (this.f22484b) {
                    if (this.f22489g.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(str, this.f22488f, false, this.f22490h);
                    } else {
                        com.mbridge.msdk.videocommon.a.a(str, this.f22488f, false, this.f22490h);
                    }
                } else if (this.f22489g.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(str, this.f22488f, false, this.f22490h);
                } else {
                    com.mbridge.msdk.videocommon.a.a(str, this.f22488f, false, this.f22490h);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f22487e + "_" + this.f22491i + "_" + this.f22486d, false);
                a.C0435a c0435a2 = this.f22488f;
                if (c0435a2 != null) {
                    c0435a2.a(false);
                }
            }
            this.f22493k = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i8, String str, String str2) {
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f22487e + "_" + this.f22491i + "_" + this.f22486d, false);
            a.C0435a c0435a = this.f22488f;
            if (c0435a != null) {
                c0435a.a(false);
            }
            if (this.f22485c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f22483a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", 2);
                    jSONObject2.put(CampaignEx.JSON_NATIVE_VIDEO_ERROR, str);
                    jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) this.f22485c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("WindVaneWebView", e8.getLocalizedMessage());
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, String str) {
            if (this.f22492j) {
                return;
            }
            if (!str.contains("wfr=1")) {
                if (this.f22485c != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", this.f22483a);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "");
                        jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) this.f22485c, "componentReact", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("WindVaneWebView", e8.getLocalizedMessage());
                        }
                    }
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f22487e + "_" + this.f22491i + "_" + this.f22486d, true);
                a.C0435a c0435a = this.f22488f;
                if (c0435a != null) {
                    c0435a.a(true);
                }
                String str2 = this.f22487e + "_" + this.f22489g.getId() + "_" + this.f22489g.getRequestId() + "_" + this.f22486d;
                if (this.f22484b) {
                    if (this.f22489g.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(287, this.f22489g.getRequestIdNotice(), this.f22488f);
                    } else {
                        com.mbridge.msdk.videocommon.a.a(str2, this.f22488f, false, this.f22490h);
                    }
                } else if (this.f22489g.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(94, this.f22489g.getRequestIdNotice(), this.f22488f);
                } else {
                    com.mbridge.msdk.videocommon.a.a(str2, this.f22488f, false, this.f22490h);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(webView);
            this.f22492j = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01c4 A[Catch: all -> 0x003c, TryCatch #9 {, blocks: (B:4:0x000b, B:6:0x0023, B:9:0x002b, B:13:0x0047, B:25:0x008c, B:28:0x0092, B:30:0x0098, B:32:0x00a7, B:35:0x00dd, B:37:0x00f3, B:44:0x01c0, B:46:0x01c4, B:48:0x01cf, B:50:0x00a1, B:63:0x0118, B:66:0x0128, B:68:0x013a, B:58:0x0176), top: B:3:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01cf A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #9 {, blocks: (B:4:0x000b, B:6:0x0023, B:9:0x002b, B:13:0x0047, B:25:0x008c, B:28:0x0092, B:30:0x0098, B:32:0x00a7, B:35:0x00dd, B:37:0x00f3, B:44:0x01c0, B:46:0x01c4, B:48:0x01cf, B:50:0x00a1, B:63:0x0118, B:66:0x0128, B:68:0x013a, B:58:0x0176), top: B:3:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(boolean r24, android.os.Handler r25, boolean r26, boolean r27, com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r28, java.lang.String r29, int r30, com.mbridge.msdk.foundation.entity.CampaignEx r31, java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, com.mbridge.msdk.videocommon.d.c r38, com.mbridge.msdk.reward.adapter.b.j r39) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.a(boolean, android.os.Handler, boolean, boolean, com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView, java.lang.String, int, com.mbridge.msdk.foundation.entity.CampaignEx, java.util.concurrent.CopyOnWriteArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.mbridge.msdk.videocommon.d.c, com.mbridge.msdk.reward.adapter.b$j):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01db A[Catch: all -> 0x0046, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x000d, B:7:0x0033, B:12:0x004b, B:14:0x007e, B:15:0x008b, B:17:0x00a6, B:19:0x00ac, B:21:0x00b6, B:24:0x00bd, B:26:0x00c3, B:27:0x00cd, B:29:0x00d3, B:31:0x00e7, B:33:0x00f5, B:39:0x00fe, B:41:0x0102, B:43:0x0113, B:46:0x0161, B:49:0x0175, B:52:0x0195, B:58:0x01db, B:59:0x01fd, B:61:0x0201, B:69:0x010c), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0201 A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x000d, B:7:0x0033, B:12:0x004b, B:14:0x007e, B:15:0x008b, B:17:0x00a6, B:19:0x00ac, B:21:0x00b6, B:24:0x00bd, B:26:0x00c3, B:27:0x00cd, B:29:0x00d3, B:31:0x00e7, B:33:0x00f5, B:39:0x00fe, B:41:0x0102, B:43:0x0113, B:46:0x0161, B:49:0x0175, B:52:0x0195, B:58:0x01db, B:59:0x01fd, B:61:0x0201, B:69:0x010c), top: B:3:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(boolean r27, android.os.Handler r28, boolean r29, boolean r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, int r36, com.mbridge.msdk.foundation.entity.CampaignEx r37, java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r38, java.lang.String r39, java.lang.String r40, com.mbridge.msdk.videocommon.d.c r41, com.mbridge.msdk.reward.adapter.b.j r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.a(boolean, android.os.Handler, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, com.mbridge.msdk.foundation.entity.CampaignEx, java.util.concurrent.CopyOnWriteArrayList, java.lang.String, java.lang.String, com.mbridge.msdk.videocommon.d.c, com.mbridge.msdk.reward.adapter.b$j, boolean):void");
    }

    private int a(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 0;
        }
        try {
            if (campaignEx.getAabEntity() != null) {
                return campaignEx.getAabEntity().h3c;
            }
            return 0;
        } catch (Throwable th) {
            ad.b("RewardCampaignsResourceManager", th.getMessage());
            return 0;
        }
    }

    public com.mbridge.msdk.foundation.same.report.d.b a(CampaignEx campaignEx, int i8) {
        com.mbridge.msdk.foundation.same.report.d.b b8 = campaignEx != null ? com.mbridge.msdk.foundation.same.report.d.c.a().b(campaignEx.getCurrentLocalRid()) : null;
        if (b8 == null) {
            b8 = new com.mbridge.msdk.foundation.same.report.d.b();
        }
        b8.a(campaignEx);
        b8.c(a(campaignEx));
        b8.a(i8);
        return b8;
    }

    static /* synthetic */ void a(b bVar, Context context, String str, String str2, String str3, CampaignEx campaignEx, String str4, i iVar, CopyOnWriteArrayList copyOnWriteArrayList) {
        if (TextUtils.isEmpty(str4) || campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.foundation.same.report.d.b a8 = bVar.a(campaignEx, 3);
        if (str4.contains(".zip") && str4.contains(ResourceManager.KEY_MD5FILENAME)) {
            boolean isEmpty = TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str4));
            try {
                g gVar = new g(context, str, str2, str3, campaignEx, 497, bVar.f22329a, iVar, copyOnWriteArrayList);
                gVar.a(isEmpty);
                H5DownLoadManager.getInstance().downloadH5Res(a8, str4, gVar);
                return;
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardCampaignsResourceManager", e8.getLocalizedMessage());
                    return;
                }
                return;
            }
        }
        boolean isEmpty2 = TextUtils.isEmpty(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str4));
        try {
            d dVar = new d(497, str, str2, str3, campaignEx, iVar, bVar.f22329a, copyOnWriteArrayList);
            dVar.a(isEmpty2);
            H5DownLoadManager.getInstance().downloadH5Res(a8, str4, dVar);
        } catch (Exception e9) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardCampaignsResourceManager", e9.getLocalizedMessage());
            }
        }
    }

    static /* synthetic */ void a(com.mbridge.msdk.foundation.entity.n nVar, CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.videocommon.d.c a8 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), campaignEx.getCampaignUnitId());
            if (a8 != null) {
                nVar.v(a8.l());
            }
            com.mbridge.msdk.videocommon.d.a b8 = com.mbridge.msdk.videocommon.d.b.a().b();
            if (b8 != null) {
                nVar.u(b8.c());
            }
        } catch (Exception e8) {
            ad.b("RewardCampaignsResourceManager", e8.getMessage());
        }
    }

    static /* synthetic */ void a(b bVar, Context context, int i8, CampaignEx campaignEx, String str, String str2, String str3, String str4) {
        com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.4

            /* renamed from: a */
            final /* synthetic */ CampaignEx f22353a;

            /* renamed from: b */
            final /* synthetic */ Context f22354b;

            /* renamed from: c */
            final /* synthetic */ int f22355c;

            /* renamed from: d */
            final /* synthetic */ String f22356d;

            /* renamed from: e */
            final /* synthetic */ String f22357e;

            /* renamed from: f */
            final /* synthetic */ String f22358f;

            /* renamed from: g */
            final /* synthetic */ String f22359g;

            AnonymousClass4(CampaignEx campaignEx2, Context context2, int i82, String str5, String str22, String str32, String str42) {
                r2 = campaignEx2;
                r3 = context2;
                r4 = i82;
                r5 = str5;
                r6 = str22;
                r7 = str32;
                r8 = str42;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (r2 != null && r3 != null) {
                    try {
                        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                        nVar.a("m_download_end");
                        Context context2 = r3;
                        if (context2 != null) {
                            nVar.a(z.l(context2.getApplicationContext()));
                        }
                        nVar.b(r4);
                        CampaignEx campaignEx2 = r2;
                        if (campaignEx2 != null) {
                            nVar.e(campaignEx2.getId());
                            nVar.f(r2.getRequestId());
                            nVar.s(r2.getCurrentLocalRid());
                            nVar.g(r2.getRequestIdNotice());
                        }
                        nVar.q(r5);
                        nVar.h(r6);
                        nVar.c(r7);
                        if (!TextUtils.isEmpty(r8)) {
                            nVar.t(r8);
                        }
                        nVar.e(1);
                        nVar.a("scenes", "1");
                        com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar.a(), r2);
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardCampaignsResourceManager", e8.getLocalizedMessage());
                        }
                    }
                }
            }
        });
    }
}
