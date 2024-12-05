package com.mbridge.msdk.video.signal.factory;

import android.app.Activity;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.a;
import com.mbridge.msdk.video.signal.a.i;
import com.mbridge.msdk.video.signal.a.j;
import com.mbridge.msdk.video.signal.a.k;
import com.mbridge.msdk.video.signal.a.m;
import com.mbridge.msdk.video.signal.a.n;
import com.mbridge.msdk.video.signal.a.o;
import com.mbridge.msdk.video.signal.a.q;
import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.g;
import java.util.List;

/* loaded from: classes4.dex */
public final class b extends a {

    /* renamed from: h, reason: collision with root package name */
    private Activity f22939h;

    /* renamed from: i, reason: collision with root package name */
    private WebView f22940i;

    /* renamed from: j, reason: collision with root package name */
    private MBridgeVideoView f22941j;

    /* renamed from: k, reason: collision with root package name */
    private MBridgeContainerView f22942k;

    /* renamed from: l, reason: collision with root package name */
    private CampaignEx f22943l;

    /* renamed from: m, reason: collision with root package name */
    private MBridgeBTContainer f22944m;

    /* renamed from: n, reason: collision with root package name */
    private a.InterfaceC0437a f22945n;

    /* renamed from: o, reason: collision with root package name */
    private String f22946o;

    /* renamed from: p, reason: collision with root package name */
    private List<CampaignEx> f22947p;

    public b(Activity activity) {
        this.f22939h = activity;
    }

    public final void a(k kVar) {
        this.f22933b = kVar;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final com.mbridge.msdk.video.signal.b getActivityProxy() {
        WebView webView = this.f22940i;
        if (webView == null) {
            return super.getActivityProxy();
        }
        if (this.f22932a == null) {
            this.f22932a = new i(webView);
        }
        return this.f22932a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final com.mbridge.msdk.video.signal.i getIJSRewardVideoV1() {
        Activity activity;
        MBridgeContainerView mBridgeContainerView = this.f22942k;
        if (mBridgeContainerView != null && (activity = this.f22939h) != null) {
            if (this.f22937f == null) {
                this.f22937f = new o(activity, mBridgeContainerView);
            }
            return this.f22937f;
        }
        return super.getIJSRewardVideoV1();
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final c getJSBTModule() {
        if (this.f22939h != null && this.f22944m != null) {
            if (this.f22938g == null) {
                this.f22938g = new j(this.f22939h, this.f22944m);
            }
            return this.f22938g;
        }
        return super.getJSBTModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final d getJSCommon() {
        CampaignEx campaignEx;
        List<CampaignEx> list;
        Activity activity = this.f22939h;
        if (activity != null && (campaignEx = this.f22943l) != null) {
            if (this.f22933b == null) {
                this.f22933b = new k(activity, campaignEx);
            }
            if (this.f22943l.getDynamicTempCode() == 5 && (list = this.f22947p) != null) {
                d dVar = this.f22933b;
                if (dVar instanceof k) {
                    ((k) dVar).a(list);
                }
            }
            this.f22933b.a(this.f22939h);
            this.f22933b.a(this.f22946o);
            this.f22933b.a(this.f22945n);
            return this.f22933b;
        }
        return super.getJSCommon();
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final f getJSContainerModule() {
        MBridgeContainerView mBridgeContainerView = this.f22942k;
        if (mBridgeContainerView == null) {
            return super.getJSContainerModule();
        }
        if (this.f22936e == null) {
            this.f22936e = new m(mBridgeContainerView);
        }
        return this.f22936e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final g getJSNotifyProxy() {
        WebView webView = this.f22940i;
        if (webView == null) {
            return super.getJSNotifyProxy();
        }
        if (this.f22935d == null) {
            this.f22935d = new n(webView);
        }
        return this.f22935d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final com.mbridge.msdk.video.signal.j getJSVideoModule() {
        MBridgeVideoView mBridgeVideoView = this.f22941j;
        if (mBridgeVideoView == null) {
            return super.getJSVideoModule();
        }
        if (this.f22934c == null) {
            this.f22934c = new q(mBridgeVideoView);
        }
        return this.f22934c;
    }

    public final void a(List<CampaignEx> list) {
        this.f22947p = list;
    }

    public b(Activity activity, MBridgeBTContainer mBridgeBTContainer, WebView webView) {
        this.f22939h = activity;
        this.f22944m = mBridgeBTContainer;
        this.f22940i = webView;
    }

    public b(Activity activity, WebView webView, MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, a.InterfaceC0437a interfaceC0437a) {
        this.f22939h = activity;
        this.f22940i = webView;
        this.f22941j = mBridgeVideoView;
        this.f22942k = mBridgeContainerView;
        this.f22943l = campaignEx;
        this.f22945n = interfaceC0437a;
        this.f22946o = mBridgeVideoView.getUnitId();
    }
}
