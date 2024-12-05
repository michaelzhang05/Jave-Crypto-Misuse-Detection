package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f23120a;

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> f23121b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f23122c;

    /* renamed from: d, reason: collision with root package name */
    private final String f23123d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.d.c f23124e;

    /* renamed from: f, reason: collision with root package name */
    private final int f23125f;

    /* renamed from: g, reason: collision with root package name */
    private final CopyOnWriteArrayList<CampaignEx> f23126g;

    /* renamed from: h, reason: collision with root package name */
    private final ConcurrentHashMap<String, com.mbridge.msdk.videocommon.download.a> f23127h;

    public i(List<CampaignEx> list, String str, int i8) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f23126g = copyOnWriteArrayList;
        this.f23127h = new ConcurrentHashMap<>();
        this.f23122c = com.mbridge.msdk.foundation.controller.c.m().c();
        this.f23123d = str;
        this.f23125f = i8;
        if (list != null) {
            copyOnWriteArrayList.addAll(list);
        }
    }

    private String b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return "";
        }
        try {
            CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
            if (rewardTemplateMode != null) {
                return rewardTemplateMode.e();
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.a("RewardVideoRefactorManager", this.f23123d + " getVideoTemplateUrl error", e8);
            }
        }
        return "";
    }

    private com.mbridge.msdk.videocommon.download.a c(CampaignEx campaignEx) {
        com.mbridge.msdk.videocommon.download.a aVar;
        com.mbridge.msdk.videocommon.download.a aVar2 = null;
        try {
            aVar = new com.mbridge.msdk.videocommon.download.a(this.f23122c, campaignEx, this.f23123d, f());
        } catch (Exception e8) {
            e = e8;
        }
        try {
            aVar.a(campaignEx);
            aVar.d(this.f23125f);
            aVar.c(f(campaignEx));
            aVar.b(e());
            aVar.e(d(campaignEx));
            aVar.a((c) null);
            aVar.a(new a(this.f23123d, this.f23121b, this.f23120a));
            return aVar;
        } catch (Exception e9) {
            e = e9;
            aVar2 = aVar;
            if (MBridgeConstans.DEBUG) {
                ad.a("RewardVideoRefactorManager", this.f23123d + " createAndStartCampaignDownloadTask error " + e.getMessage());
            }
            return aVar2;
        }
    }

    private int d(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 1;
        }
        try {
            return campaignEx.getVideoCtnType();
        } catch (Exception e8) {
            if (!MBridgeConstans.DEBUG) {
                return 1;
            }
            ad.a("RewardVideoRefactorManager", this.f23123d + " getVideoCtnType error " + e8.getMessage());
            return 1;
        }
    }

    private boolean e(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        try {
            return campaignEx.getPlayable_ads_without_video() == 2;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            ad.a("RewardVideoRefactorManager", this.f23123d + " isPlayerAbleAds error:" + th.getMessage());
            return false;
        }
    }

    private int f(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return -1;
        }
        if (campaignEx.getReady_rate() != -1) {
            return campaignEx.getReady_rate();
        }
        return g();
    }

    private int g() {
        try {
            return c(this.f23123d).r();
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                ad.a("RewardVideoRefactorManager", this.f23123d + " getRewardReadyRate error:" + th.getMessage());
                return 100;
            }
            return 100;
        }
    }

    public final void a(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.f23120a = aVar;
    }

    public final void a(String str, com.mbridge.msdk.videocommon.listener.a aVar) {
        if (this.f23121b == null) {
            this.f23121b = new ConcurrentHashMap<>();
        }
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f23121b.put(str, aVar);
    }

    private int f() {
        if (TextUtils.isEmpty(this.f23123d)) {
            return 1;
        }
        try {
            com.mbridge.msdk.videocommon.d.c c8 = c(this.f23123d);
            if (c8 != null) {
                return c8.w();
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.a("RewardVideoRefactorManager", this.f23123d + " getDlnet error " + e8.getMessage());
            }
        }
        return 1;
    }

    private int e() {
        com.mbridge.msdk.videocommon.d.c c8 = c(this.f23123d);
        if (c8 == null) {
            return 0;
        }
        try {
            return c8.s();
        } catch (Exception e8) {
            if (!MBridgeConstans.DEBUG) {
                return 0;
            }
            ad.a("RewardVideoRefactorManager", this.f23123d + " getCDRate error " + e8.getMessage());
            return 0;
        }
    }

    public final void a(List<CampaignEx> list) {
        if (list != null) {
            try {
                this.f23126g.addAll(list);
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("RewardVideoRefactorManager", this.f23123d + " update error", e8);
                }
            }
        }
    }

    public final CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> d() {
        try {
            CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList.add(this.f23127h);
            return copyOnWriteArrayList;
        } catch (Exception e8) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            ad.b("RewardVideoRefactorManager", this.f23123d + " getCampaignDownLoadTaskList error:" + e8.getMessage());
            return null;
        }
    }

    public i(CampaignEx campaignEx, String str, int i8) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f23126g = copyOnWriteArrayList;
        this.f23127h = new ConcurrentHashMap<>();
        this.f23122c = com.mbridge.msdk.foundation.controller.c.m().c();
        this.f23123d = str;
        this.f23125f = i8;
        if (campaignEx != null) {
            copyOnWriteArrayList.add(campaignEx);
        }
    }

    public final com.mbridge.msdk.videocommon.download.a b() {
        List<com.mbridge.msdk.videocommon.download.a> list;
        if (this.f23126g.size() == 0) {
            ad.a("RewardVideoRefactorManager", this.f23123d + " isReady campaignExes is null");
            return null;
        }
        try {
            list = a((List<CampaignEx>) this.f23126g, false);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.a("RewardVideoRefactorManager", this.f23123d + " isReady error", e8);
            }
            list = null;
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class a implements com.mbridge.msdk.videocommon.listener.a {

        /* renamed from: a, reason: collision with root package name */
        private final String f23128a;

        /* renamed from: b, reason: collision with root package name */
        private final ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> f23129b;

        /* renamed from: c, reason: collision with root package name */
        private final com.mbridge.msdk.videocommon.listener.a f23130c;

        public a(String str, ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> concurrentHashMap, com.mbridge.msdk.videocommon.listener.a aVar) {
            this.f23128a = str;
            this.f23129b = concurrentHashMap;
            this.f23130c = aVar;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public final void a(String str) {
            com.mbridge.msdk.videocommon.listener.a aVar = this.f23130c;
            if (aVar != null) {
                try {
                    aVar.a(str);
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoRefactorManager", this.f23128a + " videoDownloadListener onDownLoadDone error: " + e8.getMessage());
                    }
                }
            }
            ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> concurrentHashMap = this.f23129b;
            if (concurrentHashMap != null) {
                Iterator<com.mbridge.msdk.videocommon.listener.a> it = concurrentHashMap.values().iterator();
                while (it.hasNext()) {
                    try {
                        it.next().a(str);
                    } catch (Exception e9) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardVideoRefactorManager", this.f23128a + " videoDownloadListener onDownLoadDone error: " + e9.getMessage());
                        }
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public final void a(String str, String str2) {
            com.mbridge.msdk.videocommon.listener.a aVar = this.f23130c;
            if (aVar != null) {
                try {
                    aVar.a(str, str2);
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoRefactorManager", this.f23128a + " videoDownloadListener onDownLoadFailed error: " + e8.getMessage());
                    }
                }
            }
            ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> concurrentHashMap = this.f23129b;
            if (concurrentHashMap != null) {
                Iterator<com.mbridge.msdk.videocommon.listener.a> it = concurrentHashMap.values().iterator();
                while (it.hasNext()) {
                    try {
                        it.next().a(str, str2);
                    } catch (Exception e9) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardVideoRefactorManager", this.f23128a + " videoDownloadListener onDownLoadFailed error: " + e9.getMessage());
                        }
                    }
                }
            }
        }
    }

    public final void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                this.f23126g.add(campaignEx);
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("RewardVideoRefactorManager", this.f23123d + " update error", e8);
                }
            }
        }
    }

    public final void a() {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f23126g;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() != 0) {
            Iterator<CampaignEx> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                CampaignEx next = it.next();
                if (next != null) {
                    try {
                        String str = next.getRequestId() + next.getId() + next.getVideoUrlEncode();
                        if (!this.f23127h.containsKey(str)) {
                            a(next, str, (com.mbridge.msdk.videocommon.download.a) null);
                        }
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.a("RewardVideoRefactorManager", this.f23123d + " handlerCampaignLoadEvent error", e8);
                        }
                    }
                }
            }
            return;
        }
        ad.a("RewardVideoRefactorManager", this.f23123d + " load campaignExes is null");
    }

    private com.mbridge.msdk.videocommon.d.c c(String str) {
        try {
            if (this.f23124e == null) {
                this.f23124e = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), str, this.f23125f == 287);
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.a("RewardVideoRefactorManager", this.f23123d + " getRewardUnitSetting error " + e8.getMessage());
            }
        }
        return this.f23124e;
    }

    public final void b(String str) {
        com.mbridge.msdk.videocommon.download.a remove;
        CampaignEx l8;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (!this.f23127h.containsKey(str) || (remove = this.f23127h.remove(str)) == null || (l8 = remove.l()) == null) {
                return;
            }
            this.f23126g.remove(l8);
            if (MBridgeConstans.DEBUG) {
                ad.a("RewardVideoRefactorManager", this.f23123d + " removeCampaignDownloadTask campaign name: " + l8.getAppName());
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoRefactorManager", this.f23123d + " removeCampaignDownloadTask error:" + e8.getMessage());
            }
        }
    }

    public final com.mbridge.msdk.videocommon.download.a c() {
        try {
            return b();
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            ad.b("RewardVideoRefactorManager", this.f23123d + " getCampaignDownLoadTask error:" + th.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x0126, code lost:
    
        if (com.mbridge.msdk.foundation.download.utils.Utils.getDownloadRate(r8.j(), r8.m()) >= r17) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x00ab, code lost:
    
        if (r7.getRsIgnoreCheckRule().contains(0) != false) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x001d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0155 A[Catch: Exception -> 0x014c, TryCatch #1 {Exception -> 0x014c, blocks: (B:71:0x0148, B:114:0x014f, B:116:0x0155, B:119:0x0160, B:122:0x0167, B:125:0x016e, B:127:0x0174, B:129:0x017e, B:132:0x018e, B:134:0x0194), top: B:70:0x0148 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ac A[Catch: Exception -> 0x01c3, TryCatch #4 {Exception -> 0x01c3, blocks: (B:11:0x002d, B:75:0x01a8, B:77:0x01ac, B:78:0x01c6, B:85:0x01d6, B:87:0x01db, B:88:0x01de, B:91:0x01e2, B:93:0x01e8, B:94:0x01ed, B:104:0x02fe), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01db A[Catch: Exception -> 0x01c3, TryCatch #4 {Exception -> 0x01c3, blocks: (B:11:0x002d, B:75:0x01a8, B:77:0x01ac, B:78:0x01c6, B:85:0x01d6, B:87:0x01db, B:88:0x01de, B:91:0x01e2, B:93:0x01e8, B:94:0x01ed, B:104:0x02fe), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.mbridge.msdk.videocommon.download.a> a(java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.i.a(java.util.List, boolean):java.util.List");
    }

    private com.mbridge.msdk.videocommon.download.a a(CampaignEx campaignEx, String str, com.mbridge.msdk.videocommon.download.a aVar) {
        if (aVar != null) {
            return aVar;
        }
        com.mbridge.msdk.videocommon.download.a c8 = c(campaignEx);
        c8.n();
        this.f23127h.put(str, c8);
        return c8;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(java.lang.String r6, com.mbridge.msdk.foundation.entity.CampaignEx r7, com.mbridge.msdk.videocommon.download.a r8) {
        /*
            r5 = this;
            java.lang.String r0 = "RewardVideoRefactorManager"
            r1 = 0
            if (r7 == 0) goto Lcf
            if (r8 != 0) goto L9
            goto Lcf
        L9:
            boolean r8 = r8.b()     // Catch: java.lang.Throwable -> L27
            r2 = 1
            if (r8 == 0) goto L2a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r6.<init>()     // Catch: java.lang.Throwable -> L27
            java.lang.String r7 = r5.f23123d     // Catch: java.lang.Throwable -> L27
            r6.append(r7)     // Catch: java.lang.Throwable -> L27
            java.lang.String r7 = " checkEndCardZipOrSourceDownLoad endCard download success"
            r6.append(r7)     // Catch: java.lang.Throwable -> L27
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L27
            com.mbridge.msdk.foundation.tools.ad.a(r0, r6)     // Catch: java.lang.Throwable -> L27
            return r2
        L27:
            r6 = move-exception
            goto Lae
        L2a:
            java.util.ArrayList r8 = r7.getRsIgnoreCheckRule()     // Catch: java.lang.Throwable -> L27
            r3 = 2
            if (r8 == 0) goto L4a
            java.util.ArrayList r8 = r7.getRsIgnoreCheckRule()     // Catch: java.lang.Throwable -> L27
            int r8 = r8.size()     // Catch: java.lang.Throwable -> L27
            if (r8 <= 0) goto L4a
            java.util.ArrayList r8 = r7.getRsIgnoreCheckRule()     // Catch: java.lang.Throwable -> L27
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L27
            boolean r8 = r8.contains(r4)     // Catch: java.lang.Throwable -> L27
            if (r8 == 0) goto L4a
            return r2
        L4a:
            boolean r8 = r7.isDynamicView()     // Catch: java.lang.Throwable -> L27
            if (r8 == 0) goto L57
            boolean r8 = com.mbridge.msdk.foundation.tools.ai.l(r6)     // Catch: java.lang.Throwable -> L27
            if (r8 != 0) goto L57
            return r2
        L57:
            boolean r8 = com.mbridge.msdk.foundation.tools.an.a(r6)     // Catch: java.lang.Throwable -> L27
            if (r8 == 0) goto L5e
            return r2
        L5e:
            boolean r8 = r7.isMraid()     // Catch: java.lang.Throwable -> L27
            if (r8 != 0) goto L77
            boolean r8 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L27
            if (r8 == 0) goto L6b
            goto L77
        L6b:
            int r8 = r7.getLoadTimeoutState()     // Catch: java.lang.Throwable -> L27
            if (r8 != r2) goto L79
            boolean r8 = r5.e(r7)     // Catch: java.lang.Throwable -> L27
            if (r8 != 0) goto L79
        L77:
            r6 = 1
            goto Lab
        L79:
            java.util.ArrayList r8 = r7.getRsIgnoreCheckRule()     // Catch: java.lang.Throwable -> L27
            if (r8 == 0) goto L98
            java.util.ArrayList r8 = r7.getRsIgnoreCheckRule()     // Catch: java.lang.Throwable -> L27
            int r8 = r8.size()     // Catch: java.lang.Throwable -> L27
            if (r8 <= 0) goto L98
            java.util.ArrayList r7 = r7.getRsIgnoreCheckRule()     // Catch: java.lang.Throwable -> L27
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L27
            boolean r7 = r7.contains(r8)     // Catch: java.lang.Throwable -> L27
            if (r7 == 0) goto L98
            goto L77
        L98:
            java.lang.String r7 = com.mbridge.msdk.videocommon.download.f.a(r6)     // Catch: java.lang.Throwable -> L27
            boolean r7 = com.mbridge.msdk.foundation.tools.an.b(r7)     // Catch: java.lang.Throwable -> L27
            if (r7 == 0) goto La3
            goto L77
        La3:
            java.lang.String r6 = com.mbridge.msdk.videocommon.download.f.b(r6)     // Catch: java.lang.Throwable -> L27
            boolean r6 = com.mbridge.msdk.foundation.tools.an.b(r6)     // Catch: java.lang.Throwable -> L27
        Lab:
            if (r6 == 0) goto Lcf
            return r2
        Lae:
            boolean r7 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r7 == 0) goto Lcf
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r5.f23123d
            r7.append(r8)
            java.lang.String r8 = " checkEndCardDownload error "
            r7.append(r8)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.mbridge.msdk.foundation.tools.ad.a(r0, r6)
        Lcf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.i.a(java.lang.String, com.mbridge.msdk.foundation.entity.CampaignEx, com.mbridge.msdk.videocommon.download.a):boolean");
    }

    public final com.mbridge.msdk.videocommon.download.a a(String str) {
        if (!TextUtils.isEmpty(str) && this.f23127h.containsKey(str)) {
            return this.f23127h.get(str);
        }
        return null;
    }
}
