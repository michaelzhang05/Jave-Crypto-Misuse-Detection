package com.mbridge.msdk.mbbanner.common.communication;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.mraid.b;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.widget.MBAdChoice;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class BannerExpandDialog extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private final String f21468a;

    /* renamed from: b, reason: collision with root package name */
    private String f21469b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f21470c;

    /* renamed from: d, reason: collision with root package name */
    private FrameLayout f21471d;

    /* renamed from: e, reason: collision with root package name */
    private WindVaneWebView f21472e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f21473f;

    /* renamed from: g, reason: collision with root package name */
    private String f21474g;

    /* renamed from: h, reason: collision with root package name */
    private List<CampaignEx> f21475h;

    /* renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.b.a f21476i;

    /* renamed from: j, reason: collision with root package name */
    private b f21477j;

    public BannerExpandDialog(Context context, Bundle bundle, com.mbridge.msdk.mbbanner.common.b.a aVar) {
        super(context);
        this.f21468a = "BannerExpandDialog";
        this.f21477j = new b() { // from class: com.mbridge.msdk.mbbanner.common.communication.BannerExpandDialog.5
            @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
            public final void close() {
                BannerExpandDialog.this.dismiss();
            }

            @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
            public final void expand(String str, boolean z8) {
            }

            @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
            public final CampaignEx getMraidCampaign() {
                return null;
            }

            @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
            public final void open(String str) {
                try {
                    if (BannerExpandDialog.this.f21472e != null && System.currentTimeMillis() - BannerExpandDialog.this.f21472e.lastTouchTime > com.mbridge.msdk.click.b.a.f19160c && com.mbridge.msdk.click.b.a.a((CampaignEx) BannerExpandDialog.this.f21475h.get(0), BannerExpandDialog.this.f21472e.getUrl(), com.mbridge.msdk.click.b.a.f19158a)) {
                        return;
                    }
                    ad.b("BannerExpandDialog", str);
                    if (BannerExpandDialog.this.f21475h.size() > 1) {
                        c.m().c().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        str = null;
                    }
                    if (BannerExpandDialog.this.f21476i != null) {
                        BannerExpandDialog.this.f21476i.a(true, str);
                    }
                } catch (Throwable th) {
                    ad.a("BannerExpandDialog", "open", th);
                }
            }

            @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
            public final void unload() {
                close();
            }

            @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
            public final void useCustomClose(boolean z8) {
                int i8;
                try {
                    TextView textView = BannerExpandDialog.this.f21473f;
                    if (z8) {
                        i8 = 4;
                    } else {
                        i8 = 0;
                    }
                    textView.setVisibility(i8);
                } catch (Throwable th) {
                    ad.a("BannerExpandDialog", "useCustomClose", th);
                }
            }
        };
        if (bundle != null) {
            this.f21469b = bundle.getString("url");
            this.f21470c = bundle.getBoolean("shouldUseCustomClose");
        }
        this.f21476i = aVar;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        int i8;
        CampaignEx campaignEx;
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f21471d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f21472e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f21471d.addView(this.f21472e);
        TextView textView = new TextView(getContext());
        this.f21473f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f21473f.setLayoutParams(layoutParams);
        TextView textView2 = this.f21473f;
        if (this.f21470c) {
            i8 = 4;
        } else {
            i8 = 0;
        }
        textView2.setVisibility(i8);
        this.f21473f.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.mbbanner.common.communication.BannerExpandDialog.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BannerExpandDialog.this.dismiss();
            }
        });
        BitmapDrawable a8 = c.m().a(this.f21474g, 296);
        if (a8 != null) {
            ImageView imageView = new ImageView(c.m().c());
            ai.a(imageView, a8, this.f21471d.getResources().getDisplayMetrics());
            this.f21471d.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f21471d.addView(this.f21473f);
        setContentView(this.f21471d);
        a();
        this.f21472e.setWebViewListener(new com.mbridge.msdk.mbsignalcommon.b.b() { // from class: com.mbridge.msdk.mbbanner.common.communication.BannerExpandDialog.2
            @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
            public final void a(WebView webView, String str) {
                super.a(webView, str);
                webView.evaluateJavascript("javascript:" + com.mbridge.msdk.c.b.a.a().b(), new ValueCallback<String>() { // from class: com.mbridge.msdk.mbbanner.common.communication.BannerExpandDialog.2.1
                    @Override // android.webkit.ValueCallback
                    public final /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                    }
                });
                BannerExpandDialog.a(BannerExpandDialog.this);
            }
        });
        this.f21472e.setObject(this.f21477j);
        this.f21472e.loadUrl(this.f21469b);
        List<CampaignEx> list = this.f21475h;
        if (list != null && list.size() > 0 && (campaignEx = this.f21475h.get(0)) != null && campaignEx.getPrivacyButtonTemplateVisibility() != 0) {
            MBAdChoice mBAdChoice = new MBAdChoice(c.m().c());
            mBAdChoice.setCampaign(campaignEx);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(ai.a(c.m().c(), 12.0f), ai.a(c.m().c(), 12.0f));
            layoutParams2.gravity = 85;
            layoutParams2.bottomMargin = layoutParams.topMargin;
            layoutParams2.rightMargin = layoutParams.rightMargin;
            mBAdChoice.setFeedbackDialogEventListener(new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.mbbanner.common.communication.BannerExpandDialog.3
                @Override // com.mbridge.msdk.foundation.d.a
                public final void a() {
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void b() {
                    BannerExpandDialog.this.a();
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void a(String str) {
                    BannerExpandDialog.this.a();
                }
            });
            this.f21471d.addView(mBAdChoice, layoutParams2);
        }
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.mbridge.msdk.mbbanner.common.communication.BannerExpandDialog.4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                if (BannerExpandDialog.this.f21476i != null) {
                    BannerExpandDialog.this.f21476i.a(false);
                }
                BannerExpandDialog.this.f21472e.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
                BannerExpandDialog.this.f21471d.removeView(BannerExpandDialog.this.f21472e);
                BannerExpandDialog.this.f21472e.release();
                BannerExpandDialog.this.f21472e = null;
                BannerExpandDialog.this.f21476i = null;
            }
        });
    }

    public void setCampaignList(String str, List<CampaignEx> list) {
        this.f21474g = str;
        this.f21475h = list;
    }

    static /* synthetic */ void a(BannerExpandDialog bannerExpandDialog) {
        String str;
        try {
            int i8 = c.m().c().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            if (i8 == 2) {
                str = "landscape";
            } else {
                str = i8 == 1 ? "portrait" : "undefined";
            }
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
            float i9 = z.i(c.m().c());
            float g8 = z.g(c.m().c());
            HashMap h8 = z.h(c.m().c());
            int intValue = ((Integer) h8.get("width")).intValue();
            int intValue2 = ((Integer) h8.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put("placementType", "Interstitial");
            hashMap.put("state", "expanded");
            hashMap.put("viewable", "true");
            hashMap.put("currentAppOrientation", jSONObject);
            bannerExpandDialog.f21472e.getLocationInWindow(new int[2]);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(bannerExpandDialog.f21472e, r1[0], r1[1], r11.getWidth(), bannerExpandDialog.f21472e.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(bannerExpandDialog.f21472e, r1[0], r1[1], r5.getWidth(), bannerExpandDialog.f21472e.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(bannerExpandDialog.f21472e, i9, g8);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(bannerExpandDialog.f21472e, intValue, intValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(bannerExpandDialog.f21472e, hashMap);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(bannerExpandDialog.f21472e);
        } catch (Throwable th) {
            ad.a("BannerExpandDialog", "notifyMraid", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
    }
}
