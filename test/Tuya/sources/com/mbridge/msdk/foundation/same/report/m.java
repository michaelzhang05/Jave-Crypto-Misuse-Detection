package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f19930a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19931b;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, String> f19932a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final String f19933b;

        public a(String str) {
            this.f19933b = str;
        }

        public final m a() {
            return new m(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class b extends com.mbridge.msdk.foundation.same.report.e.b {
        @Override // com.mbridge.msdk.foundation.same.report.e.b
        public final void onFailed(String str) {
            if (MBridgeConstans.DEBUG) {
                ad.a("SameCommonReporter", "report failed for： " + str);
            }
        }

        @Override // com.mbridge.msdk.foundation.same.report.e.b
        public final void onSuccess(String str) {
            if (MBridgeConstans.DEBUG) {
                ad.a("SameCommonReporter", "report success for： " + str);
            }
        }
    }

    public final void a(String str) {
        String str2;
        if (TextUtils.isEmpty(this.f19931b)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("key=");
        sb.append(this.f19931b);
        com.mbridge.msdk.foundation.same.net.h.e eVar = null;
        try {
            str2 = a(this.f19930a);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("SameCommonReporter", e8.getMessage());
            }
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
        }
        if (e.a().b()) {
            e.a().a(sb.toString());
            return;
        }
        try {
            eVar = k.a(sb.toString(), com.mbridge.msdk.foundation.controller.c.m().c(), str);
        } catch (Exception e9) {
            if (MBridgeConstans.DEBUG) {
                ad.b("SameCommonReporter", e9.getMessage());
            }
        }
        if (eVar != null) {
            try {
                new com.mbridge.msdk.foundation.same.report.e.a(com.mbridge.msdk.foundation.controller.c.m().c()).post(0, com.mbridge.msdk.foundation.same.net.g.d.f().f19696c, eVar, new b());
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("SameCommonReporter", e10.getMessage());
                }
            }
        }
    }

    private m(a aVar) {
        this.f19931b = aVar.f19933b;
        this.f19930a = aVar.f19932a;
    }

    private String a(Map<String, String> map) {
        if (map != null && map.size() != 0) {
            StringBuilder sb = new StringBuilder();
            try {
                for (String str : map.keySet()) {
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = map.get(str);
                        if (!TextUtils.isEmpty(str2)) {
                            try {
                                str2 = URLEncoder.encode(str2, "utf-8");
                            } catch (Exception e8) {
                                if (MBridgeConstans.DEBUG) {
                                    ad.b("SameCommonReporter", e8.getMessage());
                                }
                            }
                            sb.append("&");
                            sb.append(str);
                            sb.append("=");
                            sb.append(str2);
                        }
                    }
                }
            } catch (Exception e9) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("SameCommonReporter", e9.getMessage());
                }
                sb = null;
            }
            if (sb != null && sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }
}
