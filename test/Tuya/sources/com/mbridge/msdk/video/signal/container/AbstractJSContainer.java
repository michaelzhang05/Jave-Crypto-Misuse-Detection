package com.mbridge.msdk.video.signal.container;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.video.signal.a.k;
import com.mbridge.msdk.video.signal.b;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.video.signal.factory.a;
import com.mbridge.msdk.video.signal.i;
import com.mbridge.msdk.video.signal.j;
import com.mbridge.msdk.videocommon.a;
import com.mbridge.msdk.videocommon.d.c;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class AbstractJSContainer extends FrameLayout implements IJSFactory {

    /* renamed from: a, reason: collision with root package name */
    private int f22915a;

    /* renamed from: b, reason: collision with root package name */
    private int f22916b;

    /* renamed from: i, reason: collision with root package name */
    protected Activity f22917i;

    /* renamed from: j, reason: collision with root package name */
    protected String f22918j;

    /* renamed from: k, reason: collision with root package name */
    protected String f22919k;

    /* renamed from: l, reason: collision with root package name */
    protected c f22920l;

    /* renamed from: m, reason: collision with root package name */
    protected String f22921m;

    /* renamed from: n, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.b.c f22922n;

    /* renamed from: o, reason: collision with root package name */
    protected String f22923o;

    /* renamed from: p, reason: collision with root package name */
    protected int f22924p;

    /* renamed from: q, reason: collision with root package name */
    protected boolean f22925q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f22926r;

    /* renamed from: s, reason: collision with root package name */
    protected int f22927s;

    /* renamed from: t, reason: collision with root package name */
    protected int f22928t;

    /* renamed from: u, reason: collision with root package name */
    protected int f22929u;

    /* renamed from: v, reason: collision with root package name */
    protected boolean f22930v;

    /* renamed from: w, reason: collision with root package name */
    protected IJSFactory f22931w;

    public AbstractJSContainer(Context context) {
        super(context);
        this.f22915a = 0;
        this.f22916b = 1;
        this.f22924p = 2;
        this.f22925q = false;
        this.f22926r = false;
        this.f22930v = false;
        this.f22931w = new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(Object obj) {
        g.a().a(obj, a(this.f22915a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final k b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        a.C0439a a8 = com.mbridge.msdk.videocommon.a.a(this.f22925q ? 287 : 94, campaignEx);
        if (a8 != null && a8.c()) {
            WindVaneWebView a9 = a8.a();
            if (a9.getObject() instanceof k) {
                return (k) a9.getObject();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int c(CampaignEx campaignEx) {
        k b8 = b(campaignEx);
        if (b8 != null) {
            return b8.l();
        }
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public b getActivityProxy() {
        return this.f22931w.getActivityProxy();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        return this.f22931w.getIJSRewardVideoV1();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.c getJSBTModule() {
        return this.f22931w.getJSBTModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        return this.f22931w.getJSCommon();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        return this.f22931w.getJSContainerModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.g getJSNotifyProxy() {
        return this.f22931w.getJSNotifyProxy();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        return this.f22931w.getJSVideoModule();
    }

    public String getPlacementId() {
        return this.f22919k;
    }

    public String getUnitId() {
        return this.f22918j;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (getJSCommon().b()) {
            getActivityProxy().a(configuration);
        }
    }

    public void onDestroy() {
        if (getJSCommon().b()) {
            getActivityProxy().c();
        }
    }

    public void onPause() {
        if (getJSCommon().b()) {
            getActivityProxy().a();
        }
        getActivityProxy().a(1);
    }

    public void onRestart() {
        if (getJSCommon().b()) {
            getActivityProxy().f();
        }
        getActivityProxy().a(4);
    }

    public void onResume() {
        if (com.mbridge.msdk.foundation.d.b.f19164c) {
            return;
        }
        if (getJSCommon().b()) {
            getActivityProxy().b();
        }
        getActivityProxy().a(0);
    }

    public void onStart() {
        if (getJSCommon().b()) {
            getActivityProxy().e();
        }
        getActivityProxy().a(2);
    }

    public void onStop() {
        if (getJSCommon().b()) {
            getActivityProxy().d();
        }
        getActivityProxy().a(3);
    }

    public void registerJsFactory(IJSFactory iJSFactory) {
        this.f22931w = iJSFactory;
    }

    public void setActivity(Activity activity) {
        this.f22917i = activity;
    }

    public void setBidCampaign(boolean z8) {
        this.f22926r = z8;
    }

    public void setBigOffer(boolean z8) {
        this.f22930v = z8;
    }

    public void setIV(boolean z8) {
        this.f22925q = z8;
    }

    public void setIVRewardEnable(int i8, int i9, int i10) {
        this.f22927s = i8;
        this.f22928t = i9;
        this.f22929u = i10;
    }

    public void setMute(int i8) {
        this.f22924p = i8;
    }

    public void setPlacementId(String str) {
        this.f22919k = str;
    }

    public void setReward(com.mbridge.msdk.videocommon.b.c cVar) {
        this.f22922n = cVar;
    }

    public void setRewardId(String str) {
        this.f22923o = str;
    }

    public void setRewardUnitSetting(c cVar) {
        this.f22920l = cVar;
    }

    public void setUnitId(String str) {
        this.f22918j = str;
    }

    public void setUserId(String str) {
        this.f22921m = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(Object obj, String str) {
        g.a().b(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    private String a(int i8) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i8);
            String jSONObject2 = jSONObject.toString();
            if (TextUtils.isEmpty(jSONObject2)) {
                return "";
            }
            return Base64.encodeToString(jSONObject2.getBytes(), 2);
        } catch (Throwable unused) {
            ad.b("AbstractJSContainer", "code to string is error");
            return "";
        }
    }

    private boolean b(int i8) {
        boolean z8 = true;
        try {
            if (i8 == 1) {
                this.f22917i.setRequestedOrientation(12);
            } else {
                if (i8 != 2) {
                    z8 = false;
                    return z8;
                }
                this.f22917i.setRequestedOrientation(11);
            }
            return z8;
        } catch (Throwable th) {
            ad.a("AbstractJSContainer", th.getMessage(), th);
            return false;
        }
    }

    public AbstractJSContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22915a = 0;
        this.f22916b = 1;
        this.f22924p = 2;
        this.f22925q = false;
        this.f22926r = false;
        this.f22930v = false;
        this.f22931w = new com.mbridge.msdk.video.signal.factory.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str) {
        ad.b("AbstractJSContainer", str);
        Activity activity = this.f22917i;
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String b() {
        c cVar;
        if (TextUtils.isEmpty(this.f22919k) && (cVar = this.f22920l) != null && !TextUtils.isEmpty(cVar.z())) {
            return this.f22920l.z();
        }
        return this.f22919k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(c cVar, CampaignEx campaignEx) {
        CampaignEx.c rewardTemplateMode;
        if (c(campaignEx) == 1) {
            return;
        }
        if (((campaignEx == null || (rewardTemplateMode = campaignEx.getRewardTemplateMode()) == null) ? false : b(rewardTemplateMode.b())) || cVar == null) {
            return;
        }
        b(this.f22920l.c());
    }
}
