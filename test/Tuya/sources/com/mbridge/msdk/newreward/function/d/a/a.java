package com.mbridge.msdk.newreward.function.d.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.newreward.function.d.c.d;
import com.mbridge.msdk.newreward.function.d.c.f;
import com.mbridge.msdk.newreward.function.d.c.g;
import com.mbridge.msdk.newreward.function.d.c.h;
import com.mbridge.msdk.newreward.function.d.c.j;
import com.mbridge.msdk.newreward.function.d.c.k;
import com.mbridge.msdk.newreward.function.d.c.l;
import com.mbridge.msdk.newreward.function.d.c.m;
import com.mbridge.msdk.newreward.function.d.c.n;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private b f21023a;

    /* renamed from: b, reason: collision with root package name */
    private CampaignEx f21024b;

    /* renamed from: c, reason: collision with root package name */
    private String f21025c;

    /* renamed from: d, reason: collision with root package name */
    private String f21026d;

    /* renamed from: e, reason: collision with root package name */
    private String f21027e;

    /* renamed from: f, reason: collision with root package name */
    private d<?> f21028f;

    /* renamed from: g, reason: collision with root package name */
    private n f21029g;

    /* renamed from: h, reason: collision with root package name */
    private d<?> f21030h;

    /* renamed from: i, reason: collision with root package name */
    private l f21031i;

    /* renamed from: j, reason: collision with root package name */
    private h f21032j;

    /* renamed from: k, reason: collision with root package name */
    private m f21033k;

    public a(b bVar) {
        this.f21023a = bVar;
    }

    public final m a() {
        CampaignEx.c rewardTemplateMode;
        m mVar = this.f21033k;
        if (mVar != null) {
            return mVar;
        }
        CampaignEx campaignEx = this.f21024b;
        if (campaignEx == null || (rewardTemplateMode = campaignEx.getRewardTemplateMode()) == null) {
            return null;
        }
        String c8 = rewardTemplateMode.c();
        if (TextUtils.isEmpty(c8)) {
            return null;
        }
        if (this.f21033k == null) {
            this.f21033k = new m(this.f21023a, this, c8);
        }
        return this.f21033k;
    }

    public final h b() {
        h hVar = this.f21032j;
        if (hVar != null) {
            return hVar;
        }
        CampaignEx campaignEx = this.f21024b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getEndScreenUrl())) {
            return null;
        }
        if (this.f21032j == null) {
            this.f21032j = new h(this.f21023a, this);
        }
        return this.f21032j;
    }

    public final d<?> c() {
        d<?> dVar = this.f21028f;
        if (dVar != null) {
            return dVar;
        }
        CampaignEx campaignEx = this.f21024b;
        if (campaignEx == null || campaignEx.getRewardTemplateMode() == null) {
            return null;
        }
        String e8 = campaignEx.getRewardTemplateMode().e();
        if (TextUtils.isEmpty(e8)) {
            return null;
        }
        if (this.f21028f == null) {
            if (com.mbridge.msdk.newreward.function.h.a.b(e8)) {
                this.f21028f = new g(this.f21023a, this);
            } else {
                this.f21028f = new k(this.f21023a, this);
            }
        }
        return this.f21028f;
    }

    public final n d() {
        n nVar = this.f21029g;
        if (nVar != null) {
            return nVar;
        }
        CampaignEx campaignEx = this.f21024b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            return null;
        }
        if (this.f21029g == null) {
            this.f21029g = new n(this.f21023a, this);
        }
        return this.f21029g;
    }

    public final l e() {
        l lVar = this.f21031i;
        if (lVar != null) {
            return lVar;
        }
        CampaignEx campaignEx = this.f21024b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getMraid())) {
            return null;
        }
        if (this.f21031i == null) {
            this.f21031i = new l(this.f21023a, this);
        }
        return this.f21031i;
    }

    public final d<?> f() {
        d<?> dVar = this.f21030h;
        if (dVar != null) {
            return dVar;
        }
        CampaignEx campaignEx = this.f21024b;
        if (campaignEx == null) {
            return null;
        }
        String str = campaignEx.getendcard_url();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f21030h == null) {
            if (com.mbridge.msdk.newreward.function.h.a.b(str)) {
                if (ai.l(str)) {
                    this.f21030h = new j(this.f21023a, this);
                } else {
                    this.f21030h = new f(this.f21023a, this);
                }
            } else {
                this.f21030h = new j(this.f21023a, this);
            }
        }
        return this.f21030h;
    }

    public final CampaignEx g() {
        return this.f21024b;
    }

    public final b h() {
        return this.f21023a;
    }

    public final boolean i() {
        CampaignEx campaignEx = this.f21024b;
        if (campaignEx != null) {
            return campaignEx.isMraid();
        }
        return false;
    }

    public final void b(String str) {
        this.f21026d = str;
    }

    public final void a(String str) {
        this.f21025c = str;
    }

    public final void a(CampaignEx campaignEx) {
        this.f21024b = campaignEx;
    }

    public final void c(String str) {
        this.f21027e = str;
    }
}
