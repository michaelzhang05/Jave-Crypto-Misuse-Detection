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
    private ViewGroup f22267n;

    /* renamed from: o, reason: collision with root package name */
    private ImageView f22268o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f22269p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f22270q;

    /* renamed from: r, reason: collision with root package name */
    private String f22271r;

    /* renamed from: s, reason: collision with root package name */
    private float f22272s;

    /* renamed from: t, reason: collision with root package name */
    private float f22273t;

    /* renamed from: u, reason: collision with root package name */
    private int f22274u;

    /* renamed from: v, reason: collision with root package name */
    private ObjectAnimator f22275v;

    public MBridgeClickCTAView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        this.f22267n = (ViewGroup) findViewById(findID("mbridge_viewgroup_ctaroot"));
        this.f22268o = (ImageView) findViewById(findID("mbridge_iv_appicon"));
        this.f22269p = (TextView) findViewById(findID("mbridge_tv_title"));
        TextView textView = (TextView) findViewById(findID("mbridge_tv_install"));
        this.ctaTv = textView;
        return isNotNULL(this.f22267n, this.f22268o, this.f22269p, textView);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeClickCTAViewDiff, com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ObjectAnimator objectAnimator = this.f22275v;
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
        ObjectAnimator objectAnimator = this.f22275v;
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
        this.f22272s = motionEvent.getRawX();
        this.f22273t = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f22274u = configuration.orientation;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeClickCTAViewDiff
    public void preLoadData(b bVar) {
        CampaignEx campaignEx = this.f22255b;
        if (campaignEx != null) {
            if (campaignEx.isDynamicView()) {
                com.mbridge.msdk.video.dynview.b.a().a(new c().b(this, this.f22255b), new g() { // from class: com.mbridge.msdk.video.module.MBridgeClickCTAView.1
                    @Override // com.mbridge.msdk.video.dynview.e.g
                    public final void a(a aVar) {
                        if (aVar != null) {
                            this.addView(aVar.a());
                            MBridgeClickCTAView mBridgeClickCTAView = MBridgeClickCTAView.this;
                            mBridgeClickCTAView.f22259f = mBridgeClickCTAView.b();
                            MBridgeClickCTAView mBridgeClickCTAView2 = MBridgeClickCTAView.this;
                            mBridgeClickCTAView2.f22270q = (TextView) mBridgeClickCTAView2.findViewById(mBridgeClickCTAView2.findID("mbridge_tv_desc"));
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
                    this.f22256c.inflate(findLayout, this);
                    this.f22259f = b();
                    c();
                    setWrapContent();
                }
            }
            if (this.f22259f) {
                if (com.mbridge.msdk.f.b.a()) {
                    setChinaCTAData();
                }
                this.ctaTv.setText(this.f22255b.getAdCall());
                if (!TextUtils.isEmpty(this.f22255b.getIconUrl())) {
                    com.mbridge.msdk.foundation.same.c.b.a(this.f22254a.getApplicationContext()).a(this.f22255b.getIconUrl(), new e(this.f22268o, this.f22255b, this.f22271r) { // from class: com.mbridge.msdk.video.module.MBridgeClickCTAView.5
                        @Override // com.mbridge.msdk.video.module.a.a.e, com.mbridge.msdk.foundation.same.c.c
                        public final void onFailedLoad(String str, String str2) {
                            super.onFailedLoad(str, str2);
                            MBridgeClickCTAView.this.a();
                        }
                    });
                } else {
                    a();
                }
                if (this.f22269p != null && !TextUtils.isEmpty(this.f22255b.getAppName())) {
                    this.f22269p.setText(this.f22255b.getAppName());
                }
                if (this.f22270q != null && !TextUtils.isEmpty(this.f22255b.getAppDesc())) {
                    this.f22270q.setText(this.f22255b.getAppDesc());
                }
            }
        }
    }

    public void setObjectAnimator(ObjectAnimator objectAnimator) {
        this.f22275v = objectAnimator;
    }

    public void setUnitId(String str) {
        this.f22271r = str;
    }

    public MBridgeClickCTAView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public final void c() {
        super.c();
        if (this.f22259f) {
            CampaignEx campaignEx = this.f22255b;
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
            ImageView imageView = this.f22268o;
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
        ImageView imageView = this.f22268o;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    static /* synthetic */ void b(MBridgeClickCTAView mBridgeClickCTAView) {
        JSONObject jSONObject;
        JSONException e8;
        CampaignEx campaignEx = mBridgeClickCTAView.f22255b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            try {
                CampaignEx.c rewardTemplateMode = mBridgeClickCTAView.f22255b.getRewardTemplateMode();
                String str = "";
                if (rewardTemplateMode != null) {
                    str = rewardTemplateMode.f() + "";
                }
                k.a(com.mbridge.msdk.foundation.controller.c.m().c(), "cta_click", mBridgeClickCTAView.f22255b.getCampaignUnitId(), mBridgeClickCTAView.f22255b.isBidCampaign(), mBridgeClickCTAView.f22255b.getRequestId(), mBridgeClickCTAView.f22255b.getRequestIdNotice(), mBridgeClickCTAView.f22255b.getId(), str);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(com.mbridge.msdk.foundation.same.a.f19422j, mBridgeClickCTAView.a(0));
            } catch (JSONException e10) {
                e8 = e10;
                e8.printStackTrace();
                mBridgeClickCTAView.f22255b.setTriggerClickSource(1);
                mBridgeClickCTAView.f22255b.setClickTempSource(1);
                mBridgeClickCTAView.f22258e.a(105, jSONObject);
            }
        } catch (JSONException e11) {
            jSONObject = null;
            e8 = e11;
        }
        mBridgeClickCTAView.f22255b.setTriggerClickSource(1);
        mBridgeClickCTAView.f22255b.setClickTempSource(1);
        mBridgeClickCTAView.f22258e.a(105, jSONObject);
    }
}
