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
    private Activity f23994h;

    /* renamed from: i, reason: collision with root package name */
    private WebView f23995i;

    /* renamed from: j, reason: collision with root package name */
    private MBridgeVideoView f23996j;

    /* renamed from: k, reason: collision with root package name */
    private MBridgeContainerView f23997k;

    /* renamed from: l, reason: collision with root package name */
    private CampaignEx f23998l;

    /* renamed from: m, reason: collision with root package name */
    private MBridgeBTContainer f23999m;

    /* renamed from: n, reason: collision with root package name */
    private a.InterfaceC0433a f24000n;

    /* renamed from: o, reason: collision with root package name */
    private String f24001o;

    /* renamed from: p, reason: collision with root package name */
    private List<CampaignEx> f24002p;

    public b(Activity activity) {
        this.f23994h = activity;
    }

    public final void a(k kVar) {
        this.f23988b = kVar;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final com.mbridge.msdk.video.signal.b getActivityProxy() {
        WebView webView = this.f23995i;
        if (webView == null) {
            return super.getActivityProxy();
        }
        if (this.f23987a == null) {
            this.f23987a = new i(webView);
        }
        return this.f23987a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final com.mbridge.msdk.video.signal.i getIJSRewardVideoV1() {
        Activity activity;
        MBridgeContainerView mBridgeContainerView = this.f23997k;
        if (mBridgeContainerView != null && (activity = this.f23994h) != null) {
            if (this.f23992f == null) {
                this.f23992f = new o(activity, mBridgeContainerView);
            }
            return this.f23992f;
        }
        return super.getIJSRewardVideoV1();
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final c getJSBTModule() {
        if (this.f23994h != null && this.f23999m != null) {
            if (this.f23993g == null) {
                this.f23993g = new j(this.f23994h, this.f23999m);
            }
            return this.f23993g;
        }
        return super.getJSBTModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final d getJSCommon() {
        CampaignEx campaignEx;
        List<CampaignEx> list;
        Activity activity = this.f23994h;
        if (activity != null && (campaignEx = this.f23998l) != null) {
            if (this.f23988b == null) {
                this.f23988b = new k(activity, campaignEx);
            }
            if (this.f23998l.getDynamicTempCode() == 5 && (list = this.f24002p) != null) {
                d dVar = this.f23988b;
                if (dVar instanceof k) {
                    ((k) dVar).a(list);
                }
            }
            this.f23988b.a(this.f23994h);
            this.f23988b.a(this.f24001o);
            this.f23988b.a(this.f24000n);
            return this.f23988b;
        }
        return super.getJSCommon();
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final f getJSContainerModule() {
        MBridgeContainerView mBridgeContainerView = this.f23997k;
        if (mBridgeContainerView == null) {
            return super.getJSContainerModule();
        }
        if (this.f23991e == null) {
            this.f23991e = new m(mBridgeContainerView);
        }
        return this.f23991e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final g getJSNotifyProxy() {
        WebView webView = this.f23995i;
        if (webView == null) {
            return super.getJSNotifyProxy();
        }
        if (this.f23990d == null) {
            this.f23990d = new n(webView);
        }
        return this.f23990d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final com.mbridge.msdk.video.signal.j getJSVideoModule() {
        MBridgeVideoView mBridgeVideoView = this.f23996j;
        if (mBridgeVideoView == null) {
            return super.getJSVideoModule();
        }
        if (this.f23989c == null) {
            this.f23989c = new q(mBridgeVideoView);
        }
        return this.f23989c;
    }

    public final void a(List<CampaignEx> list) {
        this.f24002p = list;
    }

    public b(Activity activity, MBridgeBTContainer mBridgeBTContainer, WebView webView) {
        this.f23994h = activity;
        this.f23999m = mBridgeBTContainer;
        this.f23995i = webView;
    }

    public b(Activity activity, WebView webView, MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, a.InterfaceC0433a interfaceC0433a) {
        this.f23994h = activity;
        this.f23995i = webView;
        this.f23996j = mBridgeVideoView;
        this.f23997k = mBridgeContainerView;
        this.f23998l = campaignEx;
        this.f24000n = interfaceC0433a;
        this.f24001o = mBridgeVideoView.getUnitId();
    }
}
