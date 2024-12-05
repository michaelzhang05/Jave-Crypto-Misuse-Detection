package com.mbridge.msdk.video.module.a.a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private Activity f23583a;

    /* renamed from: b, reason: collision with root package name */
    private CampaignEx f23584b;

    public a(Activity activity, CampaignEx campaignEx) {
        this.f23583a = activity;
        this.f23584b = campaignEx;
    }

    @Override // com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public void a(int i8, Object obj) {
        super.a(i8, obj);
        if (i8 == 106 && this.f23583a != null && this.f23584b != null) {
            try {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                String a8 = com.mbridge.msdk.click.c.a(this.f23584b.getClickURL(), "-999", "-999");
                if (!TextUtils.isEmpty(a8)) {
                    intent.setData(Uri.parse(a8));
                    this.f23583a.startActivity(intent);
                }
            } catch (Throwable th) {
                ad.a("NotifyListener", th.getMessage(), th);
            }
            this.f23583a.finish();
        }
    }
}
