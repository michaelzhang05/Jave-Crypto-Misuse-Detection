package com.mbridge.msdk.video.module;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.video.dynview.a;
import com.mbridge.msdk.video.dynview.e.g;
import com.mbridge.msdk.video.dynview.j.c;
import com.mbridge.msdk.video.module.a.a.e;
import com.mbridge.msdk.video.signal.factory.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBridgeClickCTAView extends MBridgeClickCTAViewDiff {

    /* renamed from: n, reason: collision with root package name */
    private ViewGroup f23322n;

    /* renamed from: o, reason: collision with root package name */
    private ImageView f23323o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f23324p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f23325q;

    /* renamed from: r, reason: collision with root package name */
    private String f23326r;

    /* renamed from: s, reason: collision with root package name */
    private float f23327s;

    /* renamed from: t, reason: collision with root package name */
    private float f23328t;

    /* renamed from: u, reason: collision with root package name */
    private int f23329u;

    /* renamed from: v, reason: collision with root package name */
    private ObjectAnimator f23330v;

    public MBridgeClickCTAView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        this.f23322n = (ViewGroup) findViewById(findID("mbridge_viewgroup_ctaroot"));
        this.f23323o = (ImageView) findViewById(findID("mbridge_iv_appicon"));
        this.f23324p = (TextView) findViewById(findID("mbridge_tv_title"));
        TextView textView = (TextView) findViewById(findID("mbridge_tv_install"));
        this.ctaTv = textView;
        return isNotNULL(this.f23322n, this.f23323o, this.f23324p, textView);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeClickCTAViewDiff, com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ObjectAnimator objectAnimator = this.f23330v;
        if (objectAnimator != null) {
            try {
                objectAnimator.start();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f23330v;
        if (objectAnimator != null) {
            try {
                objectAnimator.cancel();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f23327s = motionEvent.getRawX();
        this.f23328t = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f23329u = configuration.orientation;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeClickCTAViewDiff
    public void preLoadData(b bVar) {
        CampaignEx campaignEx = this.f23310b;
        if (campaignEx != null) {
            if (campaignEx.isDynamicView()) {
                com.mbridge.msdk.video.dynview.b.a().a(new c().b(this, this.f23310b), new g() { // from class: com.mbridge.msdk.video.module.MBridgeClickCTAView.1
                    @Override // com.mbridge.msdk.video.dynview.e.g
                    public final void a(a aVar) {
                        if (aVar != null) {
                            this.addView(aVar.a());
                            MBridgeClickCTAView mBridgeClickCTAView = MBridgeClickCTAView.this;
                            mBridgeClickCTAView.f23314f = mBridgeClickCTAView.b();
                            MBridgeClickCTAView mBridgeClickCTAView2 = MBridgeClickCTAView.this;
                            mBridgeClickCTAView2.f23325q = (TextView) mBridgeClickCTAView2.findViewById(mBridgeClickCTAView2.findID("mbridge_tv_desc"));
                            MBridgeClickCTAView.this.c();
                        }
                    }

                    @Override // com.mbridge.msdk.video.dynview.e.g
                    public final void a(com.mbridge.msdk.video.dynview.c.a aVar) {
                        ad.b(MBridgeBaseView.TAG, "errorMsg:" + aVar.b());
                    }
                });
            } else {
                int findLayout = findLayout("mbridge_reward_clickable_cta");
                if (findLayout >= 0) {
                    this.f23311c.inflate(findLayout, this);
                    this.f23314f = b();
                    c();
                    setWrapContent();
                }
            }
            if (this.f23314f) {
                if (com.mbridge.msdk.f.b.a()) {
                    setChinaCTAData();
                }
                this.ctaTv.setText(this.f23310b.getAdCall());
                if (!TextUtils.isEmpty(this.f23310b.getIconUrl())) {
                    com.mbridge.msdk.foundation.same.c.b.a(this.f23309a.getApplicationContext()).a(this.f23310b.getIconUrl(), new e(this.f23323o, this.f23310b, this.f23326r) { // from class: com.mbridge.msdk.video.module.MBridgeClickCTAView.5
                        @Override // com.mbridge.msdk.video.module.a.a.e, com.mbridge.msdk.foundation.same.c.c
                        public final void onFailedLoad(String str, String str2) {
                            super.onFailedLoad(str, str2);
                            MBridgeClickCTAView.this.a();
                        }
                    });
                } else {
                    a();
                }
                if (this.f23324p != null && !TextUtils.isEmpty(this.f23310b.getAppName())) {
                    this.f23324p.setText(this.f23310b.getAppName());
                }
                if (this.f23325q != null && !TextUtils.isEmpty(this.f23310b.getAppDesc())) {
                    this.f23325q.setText(this.f23310b.getAppDesc());
                }
            }
        }
    }

    public void setObjectAnimator(ObjectAnimator objectAnimator) {
        this.f23330v = objectAnimator;
    }

    public void setUnitId(String str) {
        this.f23326r = str;
    }

    public MBridgeClickCTAView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public final void c() {
        super.c();
        if (this.f23314f) {
            CampaignEx campaignEx = this.f23310b;
            if (campaignEx != null && campaignEx.isDynamicView()) {
                setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.video.module.MBridgeClickCTAView.2
                    @Override // com.mbridge.msdk.widget.a
                    protected final void a(View view) {
                        MBridgeClickCTAView.b(MBridgeClickCTAView.this);
                    }
                });
            }
            this.ctaTv.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.video.module.MBridgeClickCTAView.3
                @Override // com.mbridge.msdk.widget.a
                protected final void a(View view) {
                    MBridgeClickCTAView.b(MBridgeClickCTAView.this);
                }
            });
            ImageView imageView = this.f23323o;
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeClickCTAView.4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ImageView imageView = this.f23323o;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    static /* synthetic */ void b(MBridgeClickCTAView mBridgeClickCTAView) {
        JSONObject jSONObject;
        JSONException e8;
        CampaignEx campaignEx = mBridgeClickCTAView.f23310b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            try {
                CampaignEx.c rewardTemplateMode = mBridgeClickCTAView.f23310b.getRewardTemplateMode();
                String str = "";
                if (rewardTemplateMode != null) {
                    str = rewardTemplateMode.f() + "";
                }
                k.a(com.mbridge.msdk.foundation.controller.c.m().c(), "cta_click", mBridgeClickCTAView.f23310b.getCampaignUnitId(), mBridgeClickCTAView.f23310b.isBidCampaign(), mBridgeClickCTAView.f23310b.getRequestId(), mBridgeClickCTAView.f23310b.getRequestIdNotice(), mBridgeClickCTAView.f23310b.getId(), str);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(com.mbridge.msdk.foundation.same.a.f20477j, mBridgeClickCTAView.a(0));
            } catch (JSONException e10) {
                e8 = e10;
                e8.printStackTrace();
                mBridgeClickCTAView.f23310b.setTriggerClickSource(1);
                mBridgeClickCTAView.f23310b.setClickTempSource(1);
                mBridgeClickCTAView.f23313e.a(105, jSONObject);
            }
        } catch (JSONException e11) {
            jSONObject = null;
            e8 = e11;
        }
        mBridgeClickCTAView.f23310b.setTriggerClickSource(1);
        mBridgeClickCTAView.f23310b.setClickTempSource(1);
        mBridgeClickCTAView.f23313e.a(105, jSONObject);
    }
}
