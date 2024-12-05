package com.mbridge.msdk.videocommon;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0435a> f24003a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0435a> f24004b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0435a> f24005c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0435a> f24006d = new ConcurrentHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0435a> f24007e = new ConcurrentHashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0435a> f24008f = new ConcurrentHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0435a> f24009g = new ConcurrentHashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0435a> f24010h = new ConcurrentHashMap<>();

    /* renamed from: i, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0435a> f24011i = new ConcurrentHashMap<>();

    /* renamed from: j, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0435a> f24012j = new ConcurrentHashMap<>();

    /* renamed from: com.mbridge.msdk.videocommon.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0435a {

        /* renamed from: a, reason: collision with root package name */
        private WindVaneWebView f24013a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f24014b;

        public final WindVaneWebView a() {
            return this.f24013a;
        }

        public final String b() {
            WindVaneWebView windVaneWebView = this.f24013a;
            if (windVaneWebView != null) {
                return (String) windVaneWebView.getTag();
            }
            return "";
        }

        public final boolean c() {
            return this.f24014b;
        }

        public final void a(WindVaneWebView windVaneWebView) {
            this.f24013a = windVaneWebView;
        }

        public final void a(String str) {
            WindVaneWebView windVaneWebView = this.f24013a;
            if (windVaneWebView != null) {
                windVaneWebView.setTag(str);
            }
        }

        public final void a(boolean z8) {
            this.f24014b = z8;
        }
    }

    public static C0435a a(String str) {
        if (f24009g.containsKey(str)) {
            return f24009g.get(str);
        }
        if (f24010h.containsKey(str)) {
            return f24010h.get(str);
        }
        if (f24011i.containsKey(str)) {
            return f24011i.get(str);
        }
        if (f24012j.containsKey(str)) {
            return f24012j.get(str);
        }
        return null;
    }

    public static void b(String str) {
        if (f24009g.containsKey(str)) {
            f24009g.remove(str);
        }
        if (f24011i.containsKey(str)) {
            f24011i.remove(str);
        }
        if (f24010h.containsKey(str)) {
            f24010h.remove(str);
        }
        if (f24012j.containsKey(str)) {
            f24012j.remove(str);
        }
    }

    public static void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : f24009g.keySet()) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                    f24009g.remove(str2);
                }
            }
        } else {
            f24009g.clear();
        }
        f24010h.clear();
    }

    public static void d(String str) {
        for (Map.Entry<String, C0435a> entry : f24009g.entrySet()) {
            if (entry.getKey().contains(str)) {
                f24009g.remove(entry.getKey());
            }
        }
    }

    public static void e(String str) {
        for (Map.Entry<String, C0435a> entry : f24010h.entrySet()) {
            if (entry.getKey().contains(str)) {
                f24010h.remove(entry.getKey());
            }
        }
    }

    public static void a(String str, C0435a c0435a, boolean z8, boolean z9) {
        if (z8) {
            if (z9) {
                f24010h.put(str, c0435a);
                return;
            } else {
                f24009g.put(str, c0435a);
                return;
            }
        }
        if (z9) {
            f24012j.put(str, c0435a);
        } else {
            f24011i.put(str, c0435a);
        }
    }

    public static void b(int i8, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i8 == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i8 == 94) {
                if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C0435a> concurrentHashMap = f24004b;
                    if (concurrentHashMap != null) {
                        concurrentHashMap.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0435a> concurrentHashMap2 = f24007e;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (i8 != 287) {
                if (i8 != 288) {
                    ConcurrentHashMap<String, C0435a> concurrentHashMap3 = f24003a;
                    if (concurrentHashMap3 != null) {
                        concurrentHashMap3.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0435a> concurrentHashMap4 = f24006d;
                if (concurrentHashMap4 != null) {
                    concurrentHashMap4.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0435a> concurrentHashMap5 = f24005c;
                if (concurrentHashMap5 != null) {
                    concurrentHashMap5.remove(requestIdNotice);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C0435a> concurrentHashMap6 = f24008f;
            if (concurrentHashMap6 != null) {
                concurrentHashMap6.remove(requestIdNotice);
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public static void a() {
        f24011i.clear();
        f24012j.clear();
    }

    public static C0435a a(int i8, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i8 == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i8 != 94) {
                if (i8 != 287) {
                    if (i8 != 288) {
                        ConcurrentHashMap<String, C0435a> concurrentHashMap = f24003a;
                        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                            return f24003a.get(requestIdNotice);
                        }
                    } else {
                        ConcurrentHashMap<String, C0435a> concurrentHashMap2 = f24006d;
                        if (concurrentHashMap2 != null && concurrentHashMap2.size() > 0) {
                            return f24006d.get(requestIdNotice);
                        }
                    }
                } else if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C0435a> concurrentHashMap3 = f24005c;
                    if (concurrentHashMap3 != null && concurrentHashMap3.size() > 0) {
                        return f24005c.get(requestIdNotice);
                    }
                } else {
                    ConcurrentHashMap<String, C0435a> concurrentHashMap4 = f24008f;
                    if (concurrentHashMap4 != null && concurrentHashMap4.size() > 0) {
                        return f24008f.get(requestIdNotice);
                    }
                }
            } else if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0435a> concurrentHashMap5 = f24004b;
                if (concurrentHashMap5 != null && concurrentHashMap5.size() > 0) {
                    return f24004b.get(requestIdNotice);
                }
            } else {
                ConcurrentHashMap<String, C0435a> concurrentHashMap6 = f24007e;
                if (concurrentHashMap6 != null && concurrentHashMap6.size() > 0) {
                    return f24007e.get(requestIdNotice);
                }
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
        return null;
    }

    public static void b(int i8, String str, C0435a c0435a) {
        try {
            if (i8 == 94) {
                if (f24007e == null) {
                    f24007e = new ConcurrentHashMap<>();
                }
                f24007e.put(str, c0435a);
            } else if (i8 == 287) {
                if (f24008f == null) {
                    f24008f = new ConcurrentHashMap<>();
                }
                f24008f.put(str, c0435a);
            } else if (i8 != 288) {
                if (f24003a == null) {
                    f24003a = new ConcurrentHashMap<>();
                }
                f24003a.put(str, c0435a);
            } else {
                if (f24006d == null) {
                    f24006d = new ConcurrentHashMap<>();
                }
                f24006d.put(str, c0435a);
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public static void a(int i8, String str, C0435a c0435a) {
        try {
            if (i8 == 94) {
                if (f24004b == null) {
                    f24004b = new ConcurrentHashMap<>();
                }
                f24004b.put(str, c0435a);
            } else {
                if (i8 != 287) {
                    return;
                }
                if (f24005c == null) {
                    f24005c = new ConcurrentHashMap<>();
                }
                f24005c.put(str, c0435a);
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }
}
