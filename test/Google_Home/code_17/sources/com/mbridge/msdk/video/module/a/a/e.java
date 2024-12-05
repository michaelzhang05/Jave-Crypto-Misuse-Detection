package com.mbridge.msdk.video.module.a.a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.q;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes4.dex */
public class e implements com.mbridge.msdk.foundation.same.c.c {

    /* renamed from: a, reason: collision with root package name */
    private CampaignEx f23588a;

    /* renamed from: b, reason: collision with root package name */
    protected ImageView f23589b;

    /* renamed from: c, reason: collision with root package name */
    private String f23590c;

    public e(ImageView imageView) {
        this.f23589b = imageView;
    }

    @Override // com.mbridge.msdk.foundation.same.c.c
    public void onFailedLoad(final String str, String str2) {
        Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.e.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    q a8 = q.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                    if (e.this.f23588a == null) {
                        ad.a("ImageLoaderListener", "campaign is null");
                        return;
                    }
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                    nVar.a("2000044");
                    nVar.a(z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
                    nVar.e(e.this.f23588a.getId());
                    nVar.p(e.this.f23588a.getImageUrl());
                    nVar.f(e.this.f23588a.getRequestId());
                    nVar.g(e.this.f23588a.getRequestIdNotice());
                    nVar.c(e.this.f23590c);
                    nVar.h(str);
                    a8.a(nVar);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
        };
        com.mbridge.msdk.foundation.controller.d.a();
        com.mbridge.msdk.foundation.same.f.b.b().execute(runnable);
        ad.b("ImageLoaderListener", "desc:" + str);
    }

    @Override // com.mbridge.msdk.foundation.same.c.c
    public void onSuccessLoad(Bitmap bitmap, String str) {
        try {
            if (bitmap == null) {
                ad.b("ImageLoaderListener", "bitmap=null");
            } else if (this.f23589b != null && !bitmap.isRecycled()) {
                this.f23589b.setImageBitmap(bitmap);
                this.f23589b.setVisibility(0);
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }

    public e(ImageView imageView, CampaignEx campaignEx, String str) {
        this.f23589b = imageView;
        this.f23588a = campaignEx;
        this.f23590c = str;
    }
}
