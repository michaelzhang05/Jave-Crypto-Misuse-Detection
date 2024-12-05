package com.mbridge.msdk.click;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.scheme.applet.AppletSchemeCallBack;
import com.mbridge.msdk.scheme.applet.AppletsModel;

/* loaded from: classes4.dex */
public final class g extends AppletSchemeCallBack {

    /* renamed from: a, reason: collision with root package name */
    private final NativeListener.NativeTrackingListener f18138a;

    /* renamed from: b, reason: collision with root package name */
    private final CampaignEx f18139b;

    /* renamed from: c, reason: collision with root package name */
    private final AppletsModel f18140c;

    /* renamed from: d, reason: collision with root package name */
    private final a f18141d;

    public g(NativeListener.NativeTrackingListener nativeTrackingListener, CampaignEx campaignEx, AppletsModel appletsModel, a aVar) {
        this.f18138a = nativeTrackingListener;
        this.f18139b = campaignEx;
        this.f18140c = appletsModel;
        this.f18141d = aVar;
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    protected final void onRequestFailed(int i8, String str, String str2) {
        CampaignEx campaignEx = this.f18139b;
        if (campaignEx != null && this.f18140c != null) {
            try {
                NativeListener.NativeTrackingListener nativeTrackingListener = this.f18138a;
                if (nativeTrackingListener != null) {
                    try {
                        nativeTrackingListener.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("DefaultAppletSchemeCallBack", e8.getMessage());
                        }
                    }
                }
                this.f18140c.setUserClick(false);
                this.f18140c.setRequestingFinish();
                this.f18139b.setClickURL(str2);
                a aVar = this.f18141d;
                if (aVar != null) {
                    try {
                        aVar.a(this.f18139b);
                    } catch (Exception e9) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("DefaultAppletSchemeCallBack", e9.getMessage());
                        }
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("DefaultAppletSchemeCallBack", e10.getMessage());
                }
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    protected final void onRequestStart() {
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    protected final void onRequestSuccess(String str) {
        CampaignEx campaignEx = this.f18139b;
        if (campaignEx != null && this.f18140c != null) {
            try {
                NativeListener.NativeTrackingListener nativeTrackingListener = this.f18138a;
                if (nativeTrackingListener != null) {
                    try {
                        nativeTrackingListener.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("DefaultAppletSchemeCallBack", e8.getMessage());
                        }
                    }
                }
                this.f18140c.setUserClick(false);
                this.f18140c.setRequestingFinish();
                this.f18139b.setDeepLinkUrl(str);
                a aVar = this.f18141d;
                if (aVar != null) {
                    try {
                        aVar.a(this.f18139b);
                    } catch (Exception e9) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("DefaultAppletSchemeCallBack", e9.getMessage());
                        }
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("DefaultAppletSchemeCallBack", e10.getMessage());
                }
            }
        }
    }
}
