package com.mbridge.msdk.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.c.b;
import com.mbridge.msdk.foundation.same.net.g.d;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.out.Campaign;

/* loaded from: classes4.dex */
public class MBAdChoice extends MBImageView {

    /* renamed from: a, reason: collision with root package name */
    private final Context f24215a;

    /* renamed from: b, reason: collision with root package name */
    private String f24216b;

    /* renamed from: c, reason: collision with root package name */
    private String f24217c;

    /* renamed from: d, reason: collision with root package name */
    private String f24218d;

    /* renamed from: e, reason: collision with root package name */
    private CampaignEx f24219e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.foundation.d.a f24220f;

    public MBAdChoice(Context context) {
        super(context);
        this.f24216b = "";
        this.f24217c = "";
        this.f24218d = "";
        this.f24215a = context;
        a();
    }

    private void a() {
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        setClickable(true);
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f24220f == null) {
            this.f24220f = new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.widget.MBAdChoice.1
                @Override // com.mbridge.msdk.foundation.d.a
                public final void a() {
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void b() {
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void a(String str) {
                }
            };
        }
        ai.a(this.f24219e, this.f24220f, 4, "");
        return true;
    }

    public void setCampaign(Campaign campaign) {
        boolean z8;
        if (campaign instanceof CampaignEx) {
            CampaignEx campaignEx = (CampaignEx) campaign;
            this.f24219e = campaignEx;
            g b8 = h.a().b(c.m().k());
            this.f24219e = campaignEx;
            if (campaignEx != null) {
                String privacyUrl = campaignEx.getPrivacyUrl();
                this.f24217c = privacyUrl;
                if (TextUtils.isEmpty(privacyUrl)) {
                    CampaignEx.a adchoice = campaignEx.getAdchoice();
                    if (adchoice != null) {
                        this.f24217c = adchoice.c();
                    }
                    if (TextUtils.isEmpty(this.f24217c) && b8 != null) {
                        this.f24217c = b8.g();
                    }
                    if (TextUtils.isEmpty(this.f24217c)) {
                        this.f24217c = d.f().f20754f;
                    }
                }
            } else if (b8 != null) {
                this.f24217c = b8.g();
            }
            this.f24219e = campaignEx;
            if (campaignEx != null) {
                CampaignEx.a adchoice2 = campaignEx.getAdchoice();
                if (adchoice2 != null) {
                    this.f24216b = adchoice2.b();
                }
                if (TextUtils.isEmpty(this.f24216b) && b8 != null) {
                    this.f24216b = b8.f();
                }
            } else if (b8 != null) {
                this.f24216b = b8.f();
            }
            this.f24219e = campaignEx;
            if (campaignEx != null) {
                CampaignEx.a adchoice3 = campaignEx.getAdchoice();
                if (adchoice3 != null) {
                    this.f24218d = adchoice3.d();
                }
                if (TextUtils.isEmpty(this.f24218d) && b8 != null) {
                    this.f24218d = b8.h();
                }
            } else if (b8 != null) {
                this.f24218d = b8.h();
            }
            if (!TextUtils.isEmpty(this.f24216b) && !TextUtils.isEmpty(this.f24217c) && !TextUtils.isEmpty(this.f24218d)) {
                z8 = true;
            } else {
                z8 = false;
            }
            setImageUrl(this.f24216b);
            if (z8 && this.f24215a != null) {
                b.a(c.m().c()).a(this.f24216b, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.widget.MBAdChoice.2
                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public final void onFailedLoad(String str, String str2) {
                    }

                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public final void onSuccessLoad(Bitmap bitmap, String str) {
                        MBAdChoice.this.setImageBitmap(bitmap);
                    }
                });
                return;
            }
            return;
        }
        this.f24219e = null;
    }

    public void setFeedbackDialogEventListener(com.mbridge.msdk.foundation.d.a aVar) {
        this.f24220f = aVar;
    }

    public MBAdChoice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24216b = "";
        this.f24217c = "";
        this.f24218d = "";
        this.f24215a = context;
        a();
    }

    public MBAdChoice(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f24216b = "";
        this.f24217c = "";
        this.f24218d = "";
        this.f24215a = context;
        a();
    }
}
