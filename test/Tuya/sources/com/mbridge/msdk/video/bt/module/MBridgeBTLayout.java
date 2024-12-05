package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.video.bt.a.d;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBridgeBTLayout extends BTBaseView {

    /* renamed from: p, reason: collision with root package name */
    private WebView f21880p;

    public MBridgeBTLayout(Context context) {
        super(context);
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.f21880p != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", BTBaseView.f21779n);
                jSONObject2.put("id", getInstanceId());
                jSONObject2.put("eventName", str);
                jSONObject2.put(DataSchemeDataSource.SCHEME_DATA, jSONObject);
                g.a().a(this.f21880p, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                d.c().a(this.f21880p, "broadcast", getInstanceId());
            }
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void init(Context context) {
    }

    public void notifyEvent(String str) {
        WebView webView = this.f21880p;
        if (webView != null) {
            BTBaseView.a(webView, str, this.f21784d);
        }
    }

    public void onBackPressed() {
        if (this.f21880p != null) {
            d.c().a(this.f21880p, "onSystemBackPressed", this.f21784d);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (this.f21880p != null) {
            try {
                CampaignEx campaignEx = this.f21782b;
                if (campaignEx != null && campaignEx.isDynamicView()) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                if (configuration.orientation == 2) {
                    jSONObject.put("orientation", "landscape");
                } else {
                    jSONObject.put("orientation", "portrait");
                }
                jSONObject.put("instanceId", this.f21784d);
                g.a().a(this.f21880p, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void onDestory() {
    }

    public void setWebView(WebView webView) {
        this.f21880p = webView;
    }

    public MBridgeBTLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
