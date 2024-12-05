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
    private final NativeListener.NativeTrackingListener f19193a;

    /* renamed from: b, reason: collision with root package name */
    private final CampaignEx f19194b;

    /* renamed from: c, reason: collision with root package name */
    private final AppletsModel f19195c;

    /* renamed from: d, reason: collision with root package name */
    private final a f19196d;

    public g(NativeListener.NativeTrackingListener nativeTrackingListener, CampaignEx campaignEx, AppletsModel appletsModel, a aVar) {
        this.f19193a = nativeTrackingListener;
        this.f19194b = campaignEx;
        this.f19195c = appletsModel;
        this.f19196d = aVar;
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    protected final void onRequestFailed(int i8, String str, String str2) {
        CampaignEx campaignEx = this.f19194b;
        if (campaignEx != null && this.f19195c != null) {
            try {
                NativeListener.NativeTrackingListener nativeTrackingListener = this.f19193a;
                if (nativeTrackingListener != null) {
                    try {
                        nativeTrackingListener.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("DefaultAppletSchemeCallBack", e8.getMessage());
                        }
                    }
                }
                this.f19195c.setUserClick(false);
                this.f19195c.setRequestingFinish();
                this.f19194b.setClickURL(str2);
                a aVar = this.f19196d;
                if (aVar != null) {
                    try {
                        aVar.a(this.f19194b);
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
        CampaignEx campaignEx = this.f19194b;
        if (campaignEx != null && this.f19195c != null) {
            try {
                NativeListener.NativeTrackingListener nativeTrackingListener = this.f19193a;
                if (nativeTrackingListener != null) {
                    try {
                        nativeTrackingListener.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("DefaultAppletSchemeCallBack", e8.getMessage());
                        }
                    }
                }
                this.f19195c.setUserClick(false);
                this.f19195c.setRequestingFinish();
                this.f19194b.setDeepLinkUrl(str);
                a aVar = this.f19196d;
                if (aVar != null) {
                    try {
                        aVar.a(this.f19194b);
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
