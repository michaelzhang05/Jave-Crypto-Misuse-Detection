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
    private b f22078a;

    /* renamed from: b, reason: collision with root package name */
    private CampaignEx f22079b;

    /* renamed from: c, reason: collision with root package name */
    private String f22080c;

    /* renamed from: d, reason: collision with root package name */
    private String f22081d;

    /* renamed from: e, reason: collision with root package name */
    private String f22082e;

    /* renamed from: f, reason: collision with root package name */
    private d<?> f22083f;

    /* renamed from: g, reason: collision with root package name */
    private n f22084g;

    /* renamed from: h, reason: collision with root package name */
    private d<?> f22085h;

    /* renamed from: i, reason: collision with root package name */
    private l f22086i;

    /* renamed from: j, reason: collision with root package name */
    private h f22087j;

    /* renamed from: k, reason: collision with root package name */
    private m f22088k;

    public a(b bVar) {
        this.f22078a = bVar;
    }

    public final m a() {
        CampaignEx.c rewardTemplateMode;
        m mVar = this.f22088k;
        if (mVar != null) {
            return mVar;
        }
        CampaignEx campaignEx = this.f22079b;
        if (campaignEx == null || (rewardTemplateMode = campaignEx.getRewardTemplateMode()) == null) {
            return null;
        }
        String c8 = rewardTemplateMode.c();
        if (TextUtils.isEmpty(c8)) {
            return null;
        }
        if (this.f22088k == null) {
            this.f22088k = new m(this.f22078a, this, c8);
        }
        return this.f22088k;
    }

    public final h b() {
        h hVar = this.f22087j;
        if (hVar != null) {
            return hVar;
        }
        CampaignEx campaignEx = this.f22079b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getEndScreenUrl())) {
            return null;
        }
        if (this.f22087j == null) {
            this.f22087j = new h(this.f22078a, this);
        }
        return this.f22087j;
    }

    public final d<?> c() {
        d<?> dVar = this.f22083f;
        if (dVar != null) {
            return dVar;
        }
        CampaignEx campaignEx = this.f22079b;
        if (campaignEx == null || campaignEx.getRewardTemplateMode() == null) {
            return null;
        }
        String e8 = campaignEx.getRewardTemplateMode().e();
        if (TextUtils.isEmpty(e8)) {
            return null;
        }
        if (this.f22083f == null) {
            if (com.mbridge.msdk.newreward.function.h.a.b(e8)) {
                this.f22083f = new g(this.f22078a, this);
            } else {
                this.f22083f = new k(this.f22078a, this);
            }
        }
        return this.f22083f;
    }

    public final n d() {
        n nVar = this.f22084g;
        if (nVar != null) {
            return nVar;
        }
        CampaignEx campaignEx = this.f22079b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            return null;
        }
        if (this.f22084g == null) {
            this.f22084g = new n(this.f22078a, this);
        }
        return this.f22084g;
    }

    public final l e() {
        l lVar = this.f22086i;
        if (lVar != null) {
            return lVar;
        }
        CampaignEx campaignEx = this.f22079b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getMraid())) {
            return null;
        }
        if (this.f22086i == null) {
            this.f22086i = new l(this.f22078a, this);
        }
        return this.f22086i;
    }

    public final d<?> f() {
        d<?> dVar = this.f22085h;
        if (dVar != null) {
            return dVar;
        }
        CampaignEx campaignEx = this.f22079b;
        if (campaignEx == null) {
            return null;
        }
        String str = campaignEx.getendcard_url();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f22085h == null) {
            if (com.mbridge.msdk.newreward.function.h.a.b(str)) {
                if (ai.l(str)) {
                    this.f22085h = new j(this.f22078a, this);
                } else {
                    this.f22085h = new f(this.f22078a, this);
                }
            } else {
                this.f22085h = new j(this.f22078a, this);
            }
        }
        return this.f22085h;
    }

    public final CampaignEx g() {
        return this.f22079b;
    }

    public final b h() {
        return this.f22078a;
    }

    public final boolean i() {
        CampaignEx campaignEx = this.f22079b;
        if (campaignEx != null) {
            return campaignEx.isMraid();
        }
        return false;
    }

    public final void b(String str) {
        this.f22081d = str;
    }

    public final void a(String str) {
        this.f22080c = str;
    }

    public final void a(CampaignEx campaignEx) {
        this.f22079b = campaignEx;
    }

    public final void c(String str) {
        this.f22082e = str;
    }
}
