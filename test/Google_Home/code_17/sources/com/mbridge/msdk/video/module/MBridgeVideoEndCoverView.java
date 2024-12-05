package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.a;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.video.module.a.a.j;
import com.mbridge.msdk.video.signal.factory.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBridgeVideoEndCoverView extends MBridgeBaseView {

    /* renamed from: n, reason: collision with root package name */
    private final String f23486n;

    /* renamed from: o, reason: collision with root package name */
    private View f23487o;

    /* renamed from: p, reason: collision with root package name */
    private ImageView f23488p;

    /* renamed from: q, reason: collision with root package name */
    private ImageView f23489q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f23490r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f23491s;

    /* renamed from: t, reason: collision with root package name */
    private TextView f23492t;

    /* renamed from: u, reason: collision with root package name */
    private b f23493u;

    public MBridgeVideoEndCoverView(Context context) {
        super(context);
        this.f23486n = "MBridgeVideoEndCoverView";
    }

    private boolean a(View view) {
        if (view == null) {
            return true;
        }
        try {
            this.f23488p = (ImageView) view.findViewById(findID("mbridge_vec_iv_icon"));
            this.f23489q = (ImageView) view.findViewById(findID("mbridge_vec_iv_close"));
            this.f23490r = (TextView) view.findViewById(findID("mbridge_vec_tv_title"));
            this.f23491s = (TextView) view.findViewById(findID("mbridge_vec_tv_desc"));
            this.f23492t = (TextView) view.findViewById(findID("mbridge_vec_btn"));
            return true;
        } catch (Throwable th) {
            ad.b("MBridgeVideoEndCoverView", th.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public final void c() {
        super.c();
        this.f23489q.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoEndCoverView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MBridgeVideoEndCoverView.this.f23313e.a(104, "");
            }
        });
        this.f23488p.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoEndCoverView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MBridgeVideoEndCoverView.this.a();
            }
        });
        this.f23492t.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoEndCoverView.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MBridgeVideoEndCoverView.this.a();
            }
        });
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int findLayout = findLayout("mbridge_reward_videoend_cover");
        if (findLayout >= 0) {
            View inflate = this.f23311c.inflate(findLayout, (ViewGroup) null);
            this.f23487o = inflate;
            if (inflate != null) {
                this.f23314f = a(inflate);
                addView(this.f23487o, -1, -1);
                c();
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f23315g = motionEvent.getRawX();
        this.f23316h = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f23312d = configuration.orientation;
        removeView(this.f23487o);
        View view = this.f23487o;
        if (view == null) {
            init(this.f23309a);
            preLoadData(this.f23493u);
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) this.f23487o.getParent()).removeView(this.f23487o);
        }
        addView(this.f23487o);
        a(this.f23487o);
        c();
    }

    public void preLoadData(b bVar) {
        ImageView imageView;
        this.f23493u = bVar;
        try {
            CampaignEx campaignEx = this.f23310b;
            if (campaignEx != null && this.f23314f && campaignEx != null) {
                if (!TextUtils.isEmpty(campaignEx.getIconUrl()) && (imageView = this.f23488p) != null) {
                    com.mbridge.msdk.foundation.same.c.b.a(this.f23309a.getApplicationContext()).a(this.f23310b.getIconUrl(), new j(imageView, ai.a(c.m().c(), 8.0f)));
                }
                TextView textView = this.f23490r;
                if (textView != null) {
                    textView.setText(this.f23310b.getAppName());
                }
                TextView textView2 = this.f23492t;
                if (textView2 != null) {
                    textView2.setText(this.f23310b.getAdCall());
                }
                TextView textView3 = this.f23491s;
                if (textView3 != null) {
                    textView3.setText(this.f23310b.getAppDesc());
                }
            }
        } catch (Throwable th) {
            ad.a("MBridgeVideoEndCoverView", th.getMessage());
        }
    }

    public MBridgeVideoEndCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23486n = "MBridgeVideoEndCoverView";
    }

    protected final void a() {
        JSONObject jSONObject;
        JSONException e8;
        JSONObject jSONObject2;
        JSONException e9;
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(a.f20475h, ai.b(c.m().c(), this.f23315g));
                    jSONObject2.put(a.f20476i, ai.b(c.m().c(), this.f23316h));
                    jSONObject2.put(a.f20480m, 0);
                    try {
                        this.f23312d = getContext().getResources().getConfiguration().orientation;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    jSONObject2.put(a.f20478k, this.f23312d);
                    jSONObject2.put(a.f20479l, ai.d(getContext()));
                } catch (JSONException e11) {
                    e9 = e11;
                    ad.b("MBridgeVideoEndCoverView", e9.getMessage());
                    jSONObject = new JSONObject();
                    jSONObject.put(a.f20477j, jSONObject2);
                    this.f23313e.a(105, jSONObject);
                }
            } catch (JSONException e12) {
                jSONObject2 = jSONObject3;
                e9 = e12;
            }
            jSONObject = new JSONObject();
            try {
                jSONObject.put(a.f20477j, jSONObject2);
            } catch (JSONException e13) {
                e8 = e13;
                e8.printStackTrace();
                this.f23313e.a(105, jSONObject);
            }
        } catch (JSONException e14) {
            jSONObject = null;
            e8 = e14;
        }
        this.f23313e.a(105, jSONObject);
    }
}
