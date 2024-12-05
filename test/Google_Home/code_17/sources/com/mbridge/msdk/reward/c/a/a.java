package com.mbridge.msdk.reward.c.a;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.d.b;
import com.mbridge.msdk.videocommon.d.c;
import java.util.List;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f22723a;

    private a() {
    }

    public static a a() {
        if (f22723a == null) {
            synchronized (a.class) {
                try {
                    if (f22723a == null) {
                        f22723a = new a();
                    }
                } finally {
                }
            }
        }
        return f22723a;
    }

    public final void a(String str, b bVar) {
        b bVar2;
        List<CampaignEx> h8;
        try {
            if (bVar == null) {
                try {
                    bVar2 = new b();
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        e8.printStackTrace();
                    }
                }
            } else {
                bVar2 = bVar;
            }
            com.mbridge.msdk.videocommon.d.a b8 = com.mbridge.msdk.videocommon.d.b.a().b();
            if (b8 != null) {
                bVar2.h(b8.b());
                bVar2.f(b8.c());
            }
            if (bVar != null) {
                try {
                    int j8 = bVar.j();
                    String i8 = bVar.i();
                    if (TextUtils.isEmpty(i8) && (h8 = bVar.h()) != null && h8.size() > 0 && h8.get(0) != null) {
                        i8 = h8.get(0).getCampaignUnitId();
                        j8 = h8.get(0).getAdType();
                        bVar.b(j8);
                        bVar.d(i8);
                    }
                    c a8 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), i8, j8 == 287);
                    if (a8 != null) {
                        bVar.g(a8.l());
                        bVar.n(a8.k());
                    }
                } catch (Exception e9) {
                    if (MBridgeConstans.DEBUG) {
                        e9.printStackTrace();
                    }
                }
            }
            com.mbridge.msdk.foundation.same.report.d.c.a().a(bVar);
            com.mbridge.msdk.foundation.same.report.d.c.a().a(str, bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }
}
