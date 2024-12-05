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
    private final String f22431n;

    /* renamed from: o, reason: collision with root package name */
    private View f22432o;

    /* renamed from: p, reason: collision with root package name */
    private ImageView f22433p;

    /* renamed from: q, reason: collision with root package name */
    private ImageView f22434q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f22435r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f22436s;

    /* renamed from: t, reason: collision with root package name */
    private TextView f22437t;

    /* renamed from: u, reason: collision with root package name */
    private b f22438u;

    public MBridgeVideoEndCoverView(Context context) {
        super(context);
        this.f22431n = "MBridgeVideoEndCoverView";
    }

    private boolean a(View view) {
        if (view == null) {
            return true;
        }
        try {
            this.f22433p = (ImageView) view.findViewById(findID("mbridge_vec_iv_icon"));
            this.f22434q = (ImageView) view.findViewById(findID("mbridge_vec_iv_close"));
            this.f22435r = (TextView) view.findViewById(findID("mbridge_vec_tv_title"));
            this.f22436s = (TextView) view.findViewById(findID("mbridge_vec_tv_desc"));
            this.f22437t = (TextView) view.findViewById(findID("mbridge_vec_btn"));
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
        this.f22434q.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoEndCoverView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MBridgeVideoEndCoverView.this.f22258e.a(104, "");
            }
        });
        this.f22433p.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoEndCoverView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MBridgeVideoEndCoverView.this.a();
            }
        });
        this.f22437t.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoEndCoverView.3
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
            View inflate = this.f22256c.inflate(findLayout, (ViewGroup) null);
            this.f22432o = inflate;
            if (inflate != null) {
                this.f22259f = a(inflate);
                addView(this.f22432o, -1, -1);
                c();
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f22260g = motionEvent.getRawX();
        this.f22261h = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f22257d = configuration.orientation;
        removeView(this.f22432o);
        View view = this.f22432o;
        if (view == null) {
            init(this.f22254a);
            preLoadData(this.f22438u);
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) this.f22432o.getParent()).removeView(this.f22432o);
        }
        addView(this.f22432o);
        a(this.f22432o);
        c();
    }

    public void preLoadData(b bVar) {
        ImageView imageView;
        this.f22438u = bVar;
        try {
            CampaignEx campaignEx = this.f22255b;
            if (campaignEx != null && this.f22259f && campaignEx != null) {
                if (!TextUtils.isEmpty(campaignEx.getIconUrl()) && (imageView = this.f22433p) != null) {
                    com.mbridge.msdk.foundation.same.c.b.a(this.f22254a.getApplicationContext()).a(this.f22255b.getIconUrl(), new j(imageView, ai.a(c.m().c(), 8.0f)));
                }
                TextView textView = this.f22435r;
                if (textView != null) {
                    textView.setText(this.f22255b.getAppName());
                }
                TextView textView2 = this.f22437t;
                if (textView2 != null) {
                    textView2.setText(this.f22255b.getAdCall());
                }
                TextView textView3 = this.f22436s;
                if (textView3 != null) {
                    textView3.setText(this.f22255b.getAppDesc());
                }
            }
        } catch (Throwable th) {
            ad.a("MBridgeVideoEndCoverView", th.getMessage());
        }
    }

    public MBridgeVideoEndCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22431n = "MBridgeVideoEndCoverView";
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
                    jSONObject2.put(a.f19420h, ai.b(c.m().c(), this.f22260g));
                    jSONObject2.put(a.f19421i, ai.b(c.m().c(), this.f22261h));
                    jSONObject2.put(a.f19425m, 0);
                    try {
                        this.f22257d = getContext().getResources().getConfiguration().orientation;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    jSONObject2.put(a.f19423k, this.f22257d);
                    jSONObject2.put(a.f19424l, ai.d(getContext()));
                } catch (JSONException e11) {
                    e9 = e11;
                    ad.b("MBridgeVideoEndCoverView", e9.getMessage());
                    jSONObject = new JSONObject();
                    jSONObject.put(a.f19422j, jSONObject2);
                    this.f22258e.a(105, jSONObject);
                }
            } catch (JSONException e12) {
                jSONObject2 = jSONObject3;
                e9 = e12;
            }
            jSONObject = new JSONObject();
            try {
                jSONObject.put(a.f19422j, jSONObject2);
            } catch (JSONException e13) {
                e8 = e13;
                e8.printStackTrace();
                this.f22258e.a(105, jSONObject);
            }
        } catch (JSONException e14) {
            jSONObject = null;
            e8 = e14;
        }
        this.f22258e.a(105, jSONObject);
    }
}
