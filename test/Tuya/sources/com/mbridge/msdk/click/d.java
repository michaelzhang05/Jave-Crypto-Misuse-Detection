package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public final class d extends e {

    /* renamed from: d, reason: collision with root package name */
    private int f18114d;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.e.b f18117g;

    /* renamed from: h, reason: collision with root package name */
    private n f18118h;

    /* renamed from: a, reason: collision with root package name */
    JumpLoaderResult f18111a = null;

    /* renamed from: b, reason: collision with root package name */
    private int f18112b = 0;

    /* renamed from: c, reason: collision with root package name */
    private String f18113c = null;

    /* renamed from: e, reason: collision with root package name */
    private f f18115e = null;

    /* renamed from: f, reason: collision with root package name */
    private boolean f18116f = true;

    /* renamed from: i, reason: collision with root package name */
    private Handler f18119i = new Handler(Looper.getMainLooper());

    public d(Context context) {
        this.f18117g = new com.mbridge.msdk.foundation.same.e.b(context);
        this.f18118h = new n(context);
    }

    public final void a(String str, CampaignEx campaignEx, f fVar, String str2, boolean z8, boolean z9, int i8) {
        String str3;
        boolean z10;
        this.f18113c = str2;
        this.f18115e = fVar;
        this.f18111a = null;
        this.f18114d = i8;
        if (campaignEx != null) {
            boolean z11 = CampaignEx.CLICKMODE_ON.equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode());
            str3 = campaignEx.getId();
            z10 = z11;
        } else {
            str3 = "";
            z10 = false;
        }
        this.f18118h.a(str2, fVar, z10, str3, str, campaignEx, z8, z9, i8);
    }

    public final void a(String str, CampaignEx campaignEx, f fVar) {
        this.f18113c = new String(campaignEx.getClickURL());
        this.f18115e = fVar;
        this.f18111a = null;
        this.f18118h.a(campaignEx.getClickURL(), fVar, CampaignEx.CLICKMODE_ON.equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode()), campaignEx.getId(), str, campaignEx, true, false, com.mbridge.msdk.click.a.a.f18075j);
    }

    @Override // com.mbridge.msdk.click.e
    public final void a() {
        this.f18116f = false;
    }
}
