package com.mbridge.msdk.mbsignalcommon.mraid;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.mraid.a;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MraidSignalCommunication extends BaseMraidSignalCommunication {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f20555g = 0;

    /* renamed from: a, reason: collision with root package name */
    private b f20556a;

    public void close(Object obj, String str) {
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.C0411a.f20557a.a(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f20593b, CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
        }
        try {
            ad.b("MraidSignalCommunication", "MRAID close");
            b bVar = this.f20556a;
            if (bVar != null) {
                bVar.close();
            }
        } catch (Throwable th) {
            ad.a("MraidSignalCommunication", "MRAID close", th);
        }
    }

    public void expand(Object obj, String str) {
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.C0411a.f20557a.a(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f20593b, "expand");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("url");
            String optString2 = jSONObject.optString("shouldUseCustomClose");
            ad.b("MraidSignalCommunication", "MRAID expand " + optString + " " + optString2);
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && this.f20556a != null) {
                this.f20556a.expand(optString, optString2.toLowerCase().equals("true"));
            }
        } catch (Throwable th) {
            ad.a("MraidSignalCommunication", "MRAID expand", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mbridge.msdk.mbsignalcommon.windvane.h
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof b) {
                this.f20556a = (b) context;
                return;
            }
            if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof b)) {
                this.f20556a = (b) windVaneWebView.getObject();
            }
            if (windVaneWebView.getMraidObject() != null && (windVaneWebView.getMraidObject() instanceof b)) {
                this.f20556a = (b) windVaneWebView.getMraidObject();
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public void open(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
            windVaneWebView = aVar.f20593b;
            a.C0411a.f20557a.a(aVar.f20593b, "open");
        } else {
            windVaneWebView = null;
        }
        try {
            String optString = new JSONObject(str).optString("url");
            ad.b("MraidSignalCommunication", "MRAID Open " + optString);
            if (this.f20556a != null && !TextUtils.isEmpty(optString)) {
                if (windVaneWebView != null && System.currentTimeMillis() - windVaneWebView.lastTouchTime > com.mbridge.msdk.click.b.a.f18105c && com.mbridge.msdk.click.b.a.a(this.f20556a.getMraidCampaign(), windVaneWebView.getUrl(), com.mbridge.msdk.click.b.a.f18103a)) {
                    return;
                }
                this.f20556a.open(optString);
            }
        } catch (Throwable th) {
            ad.a("MraidSignalCommunication", "MRAID Open", th);
        }
    }

    public void setOrientationProperties(Object obj, String str) {
        String str2;
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.C0411a.f20557a.a(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f20593b, "setOrientationProperties");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("allowOrientationChange");
            String optString2 = jSONObject.optString("forceOrientation");
            ad.b("MraidSignalCommunication", "MRAID setOrientationProperties");
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && this.f20556a != null) {
                optString.toLowerCase().equals("true");
                String lowerCase = optString2.toLowerCase();
                int hashCode = lowerCase.hashCode();
                if (hashCode != 729267099) {
                    if (hashCode == 1430647483) {
                        str2 = "landscape";
                    } else {
                        return;
                    }
                } else {
                    str2 = "portrait";
                }
                lowerCase.equals(str2);
            }
        } catch (Throwable th) {
            ad.a("MraidSignalCommunication", "MRAID setOrientationProperties", th);
        }
    }

    public void unload(Object obj, String str) {
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.C0411a.f20557a.a(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f20593b, "unload");
        }
        try {
            ad.b("MraidSignalCommunication", "MRAID unload");
            b bVar = this.f20556a;
            if (bVar != null) {
                bVar.unload();
            }
        } catch (Throwable th) {
            ad.a("MraidSignalCommunication", "MRAID unload", th);
        }
    }

    public void useCustomClose(Object obj, String str) {
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.C0411a.f20557a.a(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f20593b, "useCustomClose");
        }
        try {
            String optString = new JSONObject(str).optString("shouldUseCustomClose");
            ad.b("MraidSignalCommunication", "MRAID useCustomClose " + optString);
            if (!TextUtils.isEmpty(optString) && this.f20556a != null) {
                this.f20556a.useCustomClose(optString.toLowerCase().equals("true"));
            }
        } catch (Throwable th) {
            ad.a("MraidSignalCommunication", "MRAID useCustomClose", th);
        }
    }
}
