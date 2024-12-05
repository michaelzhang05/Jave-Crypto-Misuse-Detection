package com.mbridge.msdk.d;

import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.d.a;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public class b {

    /* loaded from: classes4.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        static b f18235a = new b();
    }

    public static b getInstance() {
        return a.f18235a;
    }

    public void addInterstitialList(String str, String str2) {
        try {
            a.C0390a.f18234a.b(str, str2);
        } catch (Exception e8) {
            ad.b("TimerController", "addInterstitialList error:" + e8.getMessage());
        }
    }

    public void addRewardList(String str, String str2) {
        try {
            a.C0390a.f18234a.a(str, str2);
        } catch (Exception e8) {
            ad.b("TimerController", "addRewardList error:" + e8.getMessage());
        }
    }

    public void start() {
        g b8 = h.a().b(c.m().k());
        if (b8 == null) {
            h.a();
            b8 = i.a();
        }
        if (b8.l() > 0) {
            a.C0390a.f18234a.a(r0 * 1000);
        }
    }

    private b() {
    }
}
