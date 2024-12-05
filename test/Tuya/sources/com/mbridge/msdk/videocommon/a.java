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
    private static ConcurrentHashMap<String, C0439a> f22948a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0439a> f22949b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0439a> f22950c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0439a> f22951d = new ConcurrentHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0439a> f22952e = new ConcurrentHashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0439a> f22953f = new ConcurrentHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0439a> f22954g = new ConcurrentHashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0439a> f22955h = new ConcurrentHashMap<>();

    /* renamed from: i, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0439a> f22956i = new ConcurrentHashMap<>();

    /* renamed from: j, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0439a> f22957j = new ConcurrentHashMap<>();

    /* renamed from: com.mbridge.msdk.videocommon.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0439a {

        /* renamed from: a, reason: collision with root package name */
        private WindVaneWebView f22958a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f22959b;

        public final WindVaneWebView a() {
            return this.f22958a;
        }

        public final String b() {
            WindVaneWebView windVaneWebView = this.f22958a;
            if (windVaneWebView != null) {
                return (String) windVaneWebView.getTag();
            }
            return "";
        }

        public final boolean c() {
            return this.f22959b;
        }

        public final void a(WindVaneWebView windVaneWebView) {
            this.f22958a = windVaneWebView;
        }

        public final void a(String str) {
            WindVaneWebView windVaneWebView = this.f22958a;
            if (windVaneWebView != null) {
                windVaneWebView.setTag(str);
            }
        }

        public final void a(boolean z8) {
            this.f22959b = z8;
        }
    }

    public static C0439a a(String str) {
        if (f22954g.containsKey(str)) {
            return f22954g.get(str);
        }
        if (f22955h.containsKey(str)) {
            return f22955h.get(str);
        }
        if (f22956i.containsKey(str)) {
            return f22956i.get(str);
        }
        if (f22957j.containsKey(str)) {
            return f22957j.get(str);
        }
        return null;
    }

    public static void b(String str) {
        if (f22954g.containsKey(str)) {
            f22954g.remove(str);
        }
        if (f22956i.containsKey(str)) {
            f22956i.remove(str);
        }
        if (f22955h.containsKey(str)) {
            f22955h.remove(str);
        }
        if (f22957j.containsKey(str)) {
            f22957j.remove(str);
        }
    }

    public static void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : f22954g.keySet()) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                    f22954g.remove(str2);
                }
            }
        } else {
            f22954g.clear();
        }
        f22955h.clear();
    }

    public static void d(String str) {
        for (Map.Entry<String, C0439a> entry : f22954g.entrySet()) {
            if (entry.getKey().contains(str)) {
                f22954g.remove(entry.getKey());
            }
        }
    }

    public static void e(String str) {
        for (Map.Entry<String, C0439a> entry : f22955h.entrySet()) {
            if (entry.getKey().contains(str)) {
                f22955h.remove(entry.getKey());
            }
        }
    }

    public static void a(String str, C0439a c0439a, boolean z8, boolean z9) {
        if (z8) {
            if (z9) {
                f22955h.put(str, c0439a);
                return;
            } else {
                f22954g.put(str, c0439a);
                return;
            }
        }
        if (z9) {
            f22957j.put(str, c0439a);
        } else {
            f22956i.put(str, c0439a);
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
                    ConcurrentHashMap<String, C0439a> concurrentHashMap = f22949b;
                    if (concurrentHashMap != null) {
                        concurrentHashMap.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0439a> concurrentHashMap2 = f22952e;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (i8 != 287) {
                if (i8 != 288) {
                    ConcurrentHashMap<String, C0439a> concurrentHashMap3 = f22948a;
                    if (concurrentHashMap3 != null) {
                        concurrentHashMap3.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0439a> concurrentHashMap4 = f22951d;
                if (concurrentHashMap4 != null) {
                    concurrentHashMap4.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0439a> concurrentHashMap5 = f22950c;
                if (concurrentHashMap5 != null) {
                    concurrentHashMap5.remove(requestIdNotice);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C0439a> concurrentHashMap6 = f22953f;
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
        f22956i.clear();
        f22957j.clear();
    }

    public static C0439a a(int i8, CampaignEx campaignEx) {
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
                        ConcurrentHashMap<String, C0439a> concurrentHashMap = f22948a;
                        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                            return f22948a.get(requestIdNotice);
                        }
                    } else {
                        ConcurrentHashMap<String, C0439a> concurrentHashMap2 = f22951d;
                        if (concurrentHashMap2 != null && concurrentHashMap2.size() > 0) {
                            return f22951d.get(requestIdNotice);
                        }
                    }
                } else if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C0439a> concurrentHashMap3 = f22950c;
                    if (concurrentHashMap3 != null && concurrentHashMap3.size() > 0) {
                        return f22950c.get(requestIdNotice);
                    }
                } else {
                    ConcurrentHashMap<String, C0439a> concurrentHashMap4 = f22953f;
                    if (concurrentHashMap4 != null && concurrentHashMap4.size() > 0) {
                        return f22953f.get(requestIdNotice);
                    }
                }
            } else if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0439a> concurrentHashMap5 = f22949b;
                if (concurrentHashMap5 != null && concurrentHashMap5.size() > 0) {
                    return f22949b.get(requestIdNotice);
                }
            } else {
                ConcurrentHashMap<String, C0439a> concurrentHashMap6 = f22952e;
                if (concurrentHashMap6 != null && concurrentHashMap6.size() > 0) {
                    return f22952e.get(requestIdNotice);
                }
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
        return null;
    }

    public static void b(int i8, String str, C0439a c0439a) {
        try {
            if (i8 == 94) {
                if (f22952e == null) {
                    f22952e = new ConcurrentHashMap<>();
                }
                f22952e.put(str, c0439a);
            } else if (i8 == 287) {
                if (f22953f == null) {
                    f22953f = new ConcurrentHashMap<>();
                }
                f22953f.put(str, c0439a);
            } else if (i8 != 288) {
                if (f22948a == null) {
                    f22948a = new ConcurrentHashMap<>();
                }
                f22948a.put(str, c0439a);
            } else {
                if (f22951d == null) {
                    f22951d = new ConcurrentHashMap<>();
                }
                f22951d.put(str, c0439a);
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public static void a(int i8, String str, C0439a c0439a) {
        try {
            if (i8 == 94) {
                if (f22949b == null) {
                    f22949b = new ConcurrentHashMap<>();
                }
                f22949b.put(str, c0439a);
            } else {
                if (i8 != 287) {
                    return;
                }
                if (f22950c == null) {
                    f22950c = new ConcurrentHashMap<>();
                }
                f22950c.put(str, c0439a);
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }
}
