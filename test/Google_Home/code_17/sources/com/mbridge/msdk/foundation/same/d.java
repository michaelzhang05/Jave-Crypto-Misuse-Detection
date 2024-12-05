package com.mbridge.msdk.foundation.same;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;

/* loaded from: classes4.dex */
public final class d {
    public static int a(CampaignEx campaignEx, String str) {
        int b8;
        if (campaignEx == null) {
            return -1;
        }
        try {
            if (!TextUtils.isEmpty(campaignEx.getMof_template_url())) {
                b8 = ai.b(campaignEx.getMof_template_url());
            } else {
                b8 = ai.b(str);
            }
            return b8;
        } catch (Exception e8) {
            ad.b("SameTools", e8.getMessage());
            return -1;
        }
    }
}
