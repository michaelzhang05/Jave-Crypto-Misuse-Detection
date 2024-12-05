package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;

/* loaded from: classes4.dex */
public class WindVaneWebView extends BaseWebView {

    /* renamed from: b, reason: collision with root package name */
    protected k f20577b;

    /* renamed from: c, reason: collision with root package name */
    protected c f20578c;

    /* renamed from: d, reason: collision with root package name */
    protected f f20579d;

    /* renamed from: e, reason: collision with root package name */
    private Object f20580e;

    /* renamed from: f, reason: collision with root package name */
    private Object f20581f;

    /* renamed from: g, reason: collision with root package name */
    private String f20582g;

    /* renamed from: h, reason: collision with root package name */
    private d f20583h;

    /* renamed from: i, reason: collision with root package name */
    private String f20584i;

    /* renamed from: j, reason: collision with root package name */
    private String f20585j;

    /* renamed from: k, reason: collision with root package name */
    private CampaignEx f20586k;

    /* renamed from: l, reason: collision with root package name */
    private int f20587l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f20588m;

    /* renamed from: n, reason: collision with root package name */
    private float f20589n;

    /* renamed from: o, reason: collision with root package name */
    private float f20590o;

    public WindVaneWebView(Context context) {
        super(context);
        this.f20588m = false;
        this.f20589n = 0.0f;
        this.f20590o = 0.0f;
    }

    public void clearWebView() {
        if (!this.f20588m) {
            loadUrl("about:blank");
        }
    }

    public CampaignEx getCampaignEx() {
        return this.f20586k;
    }

    public String getCampaignId() {
        return this.f20582g;
    }

    public Object getJsObject(String str) {
        f fVar = this.f20579d;
        if (fVar == null) {
            return null;
        }
        return fVar.a(str);
    }

    public String getLocalRequestId() {
        return this.f20585j;
    }

    public Object getMraidObject() {
        return this.f20581f;
    }

    public Object getObject() {
        return this.f20580e;
    }

    public String getRid() {
        return this.f20584i;
    }

    public c getSignalCommunication() {
        return this.f20578c;
    }

    public d getWebViewListener() {
        return this.f20583h;
    }

    public boolean isDestoryed() {
        return this.f20588m;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.mbridge.msdk.mbsignalcommon.base.b bVar = this.mWebViewClient;
        if (bVar != null && (bVar.b() instanceof IntentFilter)) {
            String url = getUrl();
            if (!TextUtils.isEmpty(url) && url.contains("https://play.google.com")) {
                if (motionEvent.getAction() == 0) {
                    this.f20589n = motionEvent.getRawX();
                    this.f20590o = motionEvent.getRawY();
                } else {
                    float rawX = motionEvent.getRawX() - this.f20589n;
                    float y8 = motionEvent.getY() - this.f20590o;
                    if ((rawX >= 0.0f || rawX * (-1.0f) <= 48) && ((rawX <= 0.0f || rawX <= 48) && ((y8 >= 0.0f || (-1.0f) * y8 <= 48) && (y8 <= 0.0f || y8 <= 48)))) {
                        setClickable(false);
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void registerWindVanePlugin(Class cls) {
        f fVar = this.f20579d;
        if (fVar == null) {
            return;
        }
        fVar.a(cls.getSimpleName(), cls);
    }

    public void release() {
        try {
            if (!this.f20588m) {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("type", Integer.valueOf(this.f20587l));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000135", this.f20586k, dVar);
            }
        } catch (Exception unused) {
        }
        try {
            setVisibility(8);
            removeAllViews();
            setDownloadListener(null);
            this.f20580e = null;
            if (ai.b(getContext()) == 0) {
                this.f20588m = true;
                destroy();
            } else {
                new Handler().postDelayed(new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        WindVaneWebView.this.f20588m = true;
                        WindVaneWebView.this.destroy();
                    }
                }, r0 * 1000);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setApiManagerContext(Context context) {
        f fVar = this.f20579d;
        if (fVar != null) {
            fVar.a(context);
        }
    }

    public void setApiManagerJSFactory(Object obj) {
        f fVar = this.f20579d;
        if (fVar != null) {
            fVar.a(obj);
        }
    }

    public void setCampaignEx(CampaignEx campaignEx) {
        this.f20586k = campaignEx;
    }

    public void setCampaignId(String str) {
        this.f20582g = str;
    }

    public void setLocalRequestId(String str) {
        this.f20585j = str;
    }

    public void setMraidObject(Object obj) {
        this.f20581f = obj;
    }

    public void setObject(Object obj) {
        this.f20580e = obj;
    }

    public void setRid(String str) {
        this.f20584i = str;
    }

    public void setSignalCommunication(c cVar) {
        this.f20578c = cVar;
        cVar.a(this);
    }

    public void setTempTypeForMetrics(int i8) {
        this.f20587l = i8;
    }

    public void setWebViewChromeClient(k kVar) {
        this.f20577b = kVar;
        setWebChromeClient(kVar);
    }

    public void setWebViewListener(d dVar) {
        this.f20583h = dVar;
        k kVar = this.f20577b;
        if (kVar != null) {
            kVar.a(dVar);
        }
        com.mbridge.msdk.mbsignalcommon.base.b bVar = this.mWebViewClient;
        if (bVar != null) {
            bVar.a(dVar);
        }
    }

    public void setWebViewTransparent() {
        super.setTransparent();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.BaseWebView
    protected final void a() {
        super.a();
        getSettings().setSavePassword(false);
        getSettings().setUserAgentString(getSettings().getUserAgentString() + " WindVane/3.0.2");
        if (this.f20577b == null) {
            this.f20577b = new k(this);
        }
        setWebViewChromeClient(this.f20577b);
        l lVar = new l();
        this.mWebViewClient = lVar;
        setWebViewClient(lVar);
        if (this.f20578c == null) {
            c iVar = new i(this.f20475a);
            this.f20578c = iVar;
            setSignalCommunication(iVar);
        }
        this.f20579d = new f(this.f20475a, this);
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20588m = false;
        this.f20589n = 0.0f;
        this.f20590o = 0.0f;
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f20588m = false;
        this.f20589n = 0.0f;
        this.f20590o = 0.0f;
    }
}
