package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public final class d extends e {

    /* renamed from: d, reason: collision with root package name */
    private int f19169d;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.e.b f19172g;

    /* renamed from: h, reason: collision with root package name */
    private n f19173h;

    /* renamed from: a, reason: collision with root package name */
    JumpLoaderResult f19166a = null;

    /* renamed from: b, reason: collision with root package name */
    private int f19167b = 0;

    /* renamed from: c, reason: collision with root package name */
    private String f19168c = null;

    /* renamed from: e, reason: collision with root package name */
    private f f19170e = null;

    /* renamed from: f, reason: collision with root package name */
    private boolean f19171f = true;

    /* renamed from: i, reason: collision with root package name */
    private Handler f19174i = new Handler(Looper.getMainLooper());

    public d(Context context) {
        this.f19172g = new com.mbridge.msdk.foundation.same.e.b(context);
        this.f19173h = new n(context);
    }

    public final void a(String str, CampaignEx campaignEx, f fVar, String str2, boolean z8, boolean z9, int i8) {
        String str3;
        boolean z10;
        this.f19168c = str2;
        this.f19170e = fVar;
        this.f19166a = null;
        this.f19169d = i8;
        if (campaignEx != null) {
            boolean z11 = CampaignEx.CLICKMODE_ON.equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode());
            str3 = campaignEx.getId();
            z10 = z11;
        } else {
            str3 = "";
            z10 = false;
        }
        this.f19173h.a(str2, fVar, z10, str3, str, campaignEx, z8, z9, i8);
    }

    public final void a(String str, CampaignEx campaignEx, f fVar) {
        this.f19168c = new String(campaignEx.getClickURL());
        this.f19170e = fVar;
        this.f19166a = null;
        this.f19173h.a(campaignEx.getClickURL(), fVar, CampaignEx.CLICKMODE_ON.equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode()), campaignEx.getId(), str, campaignEx, true, false, com.mbridge.msdk.click.a.a.f19130j);
    }

    @Override // com.mbridge.msdk.click.e
    public final void a() {
        this.f19171f = false;
    }
}
