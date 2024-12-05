package com.mbridge.msdk.reward.b;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.b.e;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Context f21660a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21661b;

    public c(Context context, String str) {
        this.f21660a = context;
        this.f21661b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CopyOnWriteArrayList<CampaignEx> a8;
        if (this.f21660a != null && !TextUtils.isEmpty(this.f21661b)) {
            try {
                com.mbridge.msdk.reward.c.a.a(this.f21660a, this.f21661b);
                ab.a();
                ab.a(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_RES));
                ab.a(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_HTML));
                com.mbridge.msdk.videocommon.d.b.a().c(this.f21661b);
                if (!af.a().a("c_d_v_w_i", false) && !TextUtils.isEmpty(this.f21661b) && (a8 = com.mbridge.msdk.videocommon.a.a.a().a(this.f21661b, 1)) != null && a8.size() > 0) {
                    com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.f21660a, this.f21661b, a8, 94, (com.mbridge.msdk.videocommon.listener.a) null);
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("RewardVideoControllerInitTask", "initRewardVideoController task ", e8);
                }
            }
        }
    }
}
