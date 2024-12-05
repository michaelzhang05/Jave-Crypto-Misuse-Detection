package com.mbridge.msdk.foundation.d.a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import com.mbridge.msdk.c.b;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.d.b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.FeedbackRadioGroup;
import com.mbridge.msdk.widget.dialog.MBFeedBackDialog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static int f20181a = -1;

    /* renamed from: b, reason: collision with root package name */
    private static String f20182b;

    /* renamed from: d, reason: collision with root package name */
    private String f20186d;

    /* renamed from: e, reason: collision with root package name */
    private CampaignEx f20187e;

    /* renamed from: g, reason: collision with root package name */
    private FeedBackButton f20189g;

    /* renamed from: h, reason: collision with root package name */
    private String f20190h;

    /* renamed from: k, reason: collision with root package name */
    private String f20193k;

    /* renamed from: l, reason: collision with root package name */
    private MBFeedBackDialog f20194l;

    /* renamed from: m, reason: collision with root package name */
    private Dialog f20195m;

    /* renamed from: n, reason: collision with root package name */
    private JSONArray f20196n;

    /* renamed from: s, reason: collision with root package name */
    private int f20201s;

    /* renamed from: t, reason: collision with root package name */
    private List<C0393a> f20202t;

    /* renamed from: w, reason: collision with root package name */
    private int f20205w;

    /* renamed from: c, reason: collision with root package name */
    private float f20185c = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    private String f20188f = "";

    /* renamed from: i, reason: collision with root package name */
    private float f20191i = -1.0f;

    /* renamed from: j, reason: collision with root package name */
    private int f20192j = -1;

    /* renamed from: o, reason: collision with root package name */
    private int f20197o = -1;

    /* renamed from: p, reason: collision with root package name */
    private int f20198p = -1;

    /* renamed from: q, reason: collision with root package name */
    private int f20199q = -1;

    /* renamed from: r, reason: collision with root package name */
    private int f20200r = -1;

    /* renamed from: u, reason: collision with root package name */
    private int f20203u = ai.a(c.m().c(), 20.0f);

    /* renamed from: v, reason: collision with root package name */
    private String f20204v = "";

    /* renamed from: x, reason: collision with root package name */
    private com.mbridge.msdk.widget.dialog.a f20206x = new com.mbridge.msdk.widget.dialog.a() { // from class: com.mbridge.msdk.foundation.d.a.a.1
        @Override // com.mbridge.msdk.widget.dialog.a
        public final void a() {
            a.a(a.this);
        }

        @Override // com.mbridge.msdk.widget.dialog.a
        public final void b() {
            a.b(a.this);
        }

        @Override // com.mbridge.msdk.widget.dialog.a
        public final void c() {
            a.c(a.this);
        }
    };

    /* renamed from: y, reason: collision with root package name */
    private int f20207y = f20181a;

    /* renamed from: z, reason: collision with root package name */
    private int f20208z = -1;

    /* renamed from: A, reason: collision with root package name */
    private int f20183A = -1;

    /* renamed from: B, reason: collision with root package name */
    private int f20184B = -1;

    public a(String str) {
        this.f20202t = new ArrayList();
        this.f20193k = str;
        if (this.f20202t == null) {
            this.f20202t = new ArrayList();
        }
        k();
        i();
        j();
    }

    private void i() {
        Context c8 = c.m().c();
        if (c8 != null) {
            try {
                FeedBackButton feedBackButton = new FeedBackButton(c8);
                this.f20189g = feedBackButton;
                int i8 = 8;
                if (this.f20207y != 8) {
                    i8 = 0;
                }
                feedBackButton.setVisibility(i8);
                this.f20189g.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.foundation.d.a.a.2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        a.this.e();
                    }
                });
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    private void j() {
        try {
            if (b.a().a(c.m().c()) != null) {
                g b8 = h.a().b(c.m().k());
                if (b8 == null) {
                    h.a();
                    b8 = i.a();
                }
                b.C0384b D8 = b8.D();
                if (D8 == null) {
                    ad.c("", "feedback fbk is null");
                    return;
                }
                k();
                this.f20194l = new MBFeedBackDialog(com.mbridge.msdk.foundation.d.b.a().a(c.m().c()), this.f20206x);
                FeedbackRadioGroup a8 = a(D8);
                this.f20194l.setCancelText(D8.d());
                this.f20194l.setConfirmText(D8.a());
                this.f20194l.setPrivacyText(D8.c());
                this.f20204v = D8.e();
                this.f20194l.setTitle(D8.f());
                this.f20194l.setContent(a8);
                this.f20194l.setCancelButtonClickable(!TextUtils.isEmpty(f20182b));
                a(a8, D8);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    private void k() {
        if (this.f20206x == null) {
            this.f20206x = new com.mbridge.msdk.widget.dialog.a() { // from class: com.mbridge.msdk.foundation.d.a.a.3
                @Override // com.mbridge.msdk.widget.dialog.a
                public final void a() {
                    a.a(a.this);
                }

                @Override // com.mbridge.msdk.widget.dialog.a
                public final void b() {
                    a.b(a.this);
                }

                @Override // com.mbridge.msdk.widget.dialog.a
                public final void c() {
                    a.c(a.this);
                }
            };
        }
    }

    private void l() {
        boolean z8;
        FeedBackButton feedBackButton = this.f20189g;
        if (feedBackButton != null) {
            int i8 = this.f20183A;
            if (i8 > -1) {
                feedBackButton.setX(i8);
            }
            int i9 = this.f20184B;
            if (i9 > -1) {
                this.f20189g.setY(i9);
            }
            float f8 = this.f20185c;
            if (f8 >= 0.0f) {
                this.f20189g.setAlpha(f8);
                FeedBackButton feedBackButton2 = this.f20189g;
                if (this.f20185c != 0.0f) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                feedBackButton2.setEnabled(z8);
            }
            ViewGroup.LayoutParams layoutParams = this.f20189g.getLayoutParams();
            int i10 = this.f20208z;
            if (i10 > 0) {
                this.f20189g.setWidth(i10);
                if (layoutParams != null) {
                    layoutParams.width = this.f20208z;
                }
            }
            int i11 = this.f20192j;
            if (i11 > 0) {
                this.f20189g.setHeight(i11);
                if (layoutParams != null) {
                    layoutParams.height = this.f20192j;
                }
            }
            if (layoutParams != null) {
                this.f20189g.setLayoutParams(layoutParams);
            }
            try {
                if (!TextUtils.isEmpty(this.f20190h)) {
                    this.f20189g.setTextColor(Color.parseColor(this.f20190h));
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            float f9 = this.f20191i;
            if (f9 > 0.0f) {
                this.f20189g.setTextSize(f9);
            }
            JSONArray jSONArray = this.f20196n;
            if (jSONArray != null && jSONArray.length() == 4) {
                Context c8 = c.m().c();
                this.f20189g.setPadding(ai.a(c8, (float) this.f20196n.optDouble(0)), ai.a(c8, (float) this.f20196n.optDouble(1)), ai.a(c8, (float) this.f20196n.optDouble(2)), ai.a(c8, (float) this.f20196n.optDouble(3)));
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            int i12 = this.f20203u;
            if (i12 > 0) {
                gradientDrawable.setCornerRadius(i12);
            }
            if (!TextUtils.isEmpty(this.f20186d)) {
                gradientDrawable.setColor(Color.parseColor(this.f20186d));
            } else {
                gradientDrawable.setColor(Color.parseColor(FeedBackButton.FEEDBACK_BTN_BACKGROUND_COLOR_STR));
            }
            this.f20189g.setBackground(gradientDrawable);
        }
    }

    public final void a(C0393a c0393a) {
        if (this.f20202t == null) {
            this.f20202t = new ArrayList();
        }
        this.f20202t.add(c0393a);
    }

    public final CampaignEx c() {
        return this.f20187e;
    }

    public final int f() {
        return this.f20201s;
    }

    public final int g() {
        return this.f20205w;
    }

    public final void b() {
        MBFeedBackDialog mBFeedBackDialog = this.f20194l;
        if (mBFeedBackDialog == null || !mBFeedBackDialog.isShowing()) {
            return;
        }
        this.f20194l.cancel();
    }

    public final void c(int i8) {
        this.f20207y = i8;
        FeedBackButton feedBackButton = this.f20189g;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(i8);
        }
    }

    public final FeedBackButton d() {
        if (this.f20189g == null) {
            i();
        }
        return this.f20189g;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:2:0x0000, B:4:0x0023, B:7:0x002f, B:9:0x003b, B:10:0x003f, B:14:0x0053, B:15:0x0072, B:17:0x0076, B:18:0x007a, B:20:0x0080, B:23:0x0088, B:29:0x008e, B:34:0x0063, B:36:0x002c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:2:0x0000, B:4:0x0023, B:7:0x002f, B:9:0x003b, B:10:0x003f, B:14:0x0053, B:15:0x0072, B:17:0x0076, B:18:0x007a, B:20:0x0080, B:23:0x0088, B:29:0x008e, B:34:0x0063, B:36:0x002c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e A[Catch: Exception -> 0x002a, TRY_LEAVE, TryCatch #0 {Exception -> 0x002a, blocks: (B:2:0x0000, B:4:0x0023, B:7:0x002f, B:9:0x003b, B:10:0x003f, B:14:0x0053, B:15:0x0072, B:17:0x0076, B:18:0x007a, B:20:0x0080, B:23:0x0088, B:29:0x008e, B:34:0x0063, B:36:0x002c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063 A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:2:0x0000, B:4:0x0023, B:7:0x002f, B:9:0x003b, B:10:0x003f, B:14:0x0053, B:15:0x0072, B:17:0x0076, B:18:0x007a, B:20:0x0080, B:23:0x0088, B:29:0x008e, B:34:0x0063, B:36:0x002c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:2:0x0000, B:4:0x0023, B:7:0x002f, B:9:0x003b, B:10:0x003f, B:14:0x0053, B:15:0x0072, B:17:0x0076, B:18:0x007a, B:20:0x0080, B:23:0x0088, B:29:0x008e, B:34:0x0063, B:36:0x002c), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r10 = this;
            com.mbridge.msdk.foundation.d.b r0 = com.mbridge.msdk.foundation.d.b.a()     // Catch: java.lang.Exception -> L2a
            java.lang.String r1 = r10.f20193k     // Catch: java.lang.Exception -> L2a
            java.lang.String r4 = com.mbridge.msdk.foundation.d.a.a.f20182b     // Catch: java.lang.Exception -> L2a
            java.lang.String r5 = r10.f20188f     // Catch: java.lang.Exception -> L2a
            r2 = 0
            r3 = 1
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L2a
            com.mbridge.msdk.foundation.d.b r0 = com.mbridge.msdk.foundation.d.b.a()     // Catch: java.lang.Exception -> L2a
            com.mbridge.msdk.foundation.controller.c r1 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Exception -> L2a
            android.content.Context r1 = r1.c()     // Catch: java.lang.Exception -> L2a
            android.app.Activity r0 = r0.a(r1)     // Catch: java.lang.Exception -> L2a
            com.mbridge.msdk.widget.dialog.MBFeedBackDialog r1 = r10.f20194l     // Catch: java.lang.Exception -> L2a
            if (r1 == 0) goto L2c
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Exception -> L2a
            if (r1 == r0) goto L2f
            goto L2c
        L2a:
            r0 = move-exception
            goto L92
        L2c:
            r10.j()     // Catch: java.lang.Exception -> L2a
        L2f:
            com.mbridge.msdk.foundation.controller.c r0 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Exception -> L2a
            android.content.Context r0 = r0.c()     // Catch: java.lang.Exception -> L2a
            com.mbridge.msdk.widget.FeedBackButton r1 = r10.f20189g     // Catch: java.lang.Exception -> L2a
            if (r1 == 0) goto L3f
            android.content.Context r0 = r1.getContext()     // Catch: java.lang.Exception -> L2a
        L3f:
            com.mbridge.msdk.foundation.d.b r1 = com.mbridge.msdk.foundation.d.b.a()     // Catch: java.lang.Exception -> L2a
            java.lang.String r2 = r10.f20193k     // Catch: java.lang.Exception -> L2a
            com.mbridge.msdk.widget.dialog.MBFeedBackDialog r3 = r10.f20194l     // Catch: java.lang.Exception -> L2a
            boolean r1 = r1.a(r2, r0, r3)     // Catch: java.lang.Exception -> L2a
            r2 = 2
            if (r1 == 0) goto L50
            r3 = 2
            goto L51
        L50:
            r3 = 3
        L51:
            if (r3 != r2) goto L63
            com.mbridge.msdk.foundation.d.b r4 = com.mbridge.msdk.foundation.d.b.a()     // Catch: java.lang.Exception -> L2a
            java.lang.String r5 = r10.f20193k     // Catch: java.lang.Exception -> L2a
            java.lang.String r8 = com.mbridge.msdk.foundation.d.a.a.f20182b     // Catch: java.lang.Exception -> L2a
            java.lang.String r9 = r10.f20188f     // Catch: java.lang.Exception -> L2a
            r6 = 0
            r7 = 2
            r4.a(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L2a
            goto L72
        L63:
            com.mbridge.msdk.foundation.d.b r4 = com.mbridge.msdk.foundation.d.b.a()     // Catch: java.lang.Exception -> L2a
            java.lang.String r5 = r10.f20193k     // Catch: java.lang.Exception -> L2a
            java.lang.String r8 = com.mbridge.msdk.foundation.d.a.a.f20182b     // Catch: java.lang.Exception -> L2a
            java.lang.String r9 = r10.f20188f     // Catch: java.lang.Exception -> L2a
            r6 = 0
            r7 = 3
            r4.a(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L2a
        L72:
            java.util.List<com.mbridge.msdk.foundation.d.a.a$a> r2 = r10.f20202t     // Catch: java.lang.Exception -> L2a
            if (r2 == 0) goto L8c
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L2a
        L7a:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Exception -> L2a
            if (r4 == 0) goto L8c
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Exception -> L2a
            com.mbridge.msdk.foundation.d.a.a$a r4 = (com.mbridge.msdk.foundation.d.a.a.C0393a) r4     // Catch: java.lang.Exception -> L2a
            if (r4 == 0) goto L7a
            r4.a(r3)     // Catch: java.lang.Exception -> L2a
            goto L7a
        L8c:
            if (r1 != 0) goto L95
            r10.a(r0)     // Catch: java.lang.Exception -> L2a
            goto L95
        L92:
            r0.printStackTrace()
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.d.a.a.e():void");
    }

    /* renamed from: com.mbridge.msdk.foundation.d.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0393a implements com.mbridge.msdk.widget.dialog.a {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.foundation.d.a f20215a;

        /* renamed from: b, reason: collision with root package name */
        private String f20216b;

        public C0393a(String str, com.mbridge.msdk.foundation.d.a aVar) {
            this.f20215a = aVar;
            this.f20216b = str;
        }

        @Override // com.mbridge.msdk.widget.dialog.a
        public final void a() {
            com.mbridge.msdk.foundation.d.b.f20219c = false;
            com.mbridge.msdk.foundation.d.a aVar = this.f20215a;
            if (aVar != null) {
                aVar.a(a.f20182b);
            }
        }

        @Override // com.mbridge.msdk.widget.dialog.a
        public final void b() {
            com.mbridge.msdk.foundation.d.b.f20219c = false;
            com.mbridge.msdk.foundation.d.a aVar = this.f20215a;
            if (aVar != null) {
                aVar.b();
            }
        }

        @Override // com.mbridge.msdk.widget.dialog.a
        public final void c() {
            com.mbridge.msdk.foundation.d.a aVar = this.f20215a;
            if (aVar != null) {
                aVar.b();
            }
        }

        public final void a(int i8) {
            com.mbridge.msdk.foundation.d.b.f20219c = true;
            com.mbridge.msdk.foundation.d.a aVar = this.f20215a;
            if (aVar == null || i8 != 2) {
                return;
            }
            aVar.a();
        }
    }

    public final void a() {
        FeedBackButton feedBackButton = this.f20189g;
        if (feedBackButton != null) {
            feedBackButton.setOnClickListener(null);
            this.f20189g.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) this.f20189g.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f20189g);
            }
        }
        MBFeedBackDialog mBFeedBackDialog = this.f20194l;
        if (mBFeedBackDialog != null) {
            mBFeedBackDialog.cancel();
            this.f20194l.setListener(null);
        }
        this.f20194l = null;
        this.f20202t = null;
        this.f20189g = null;
        this.f20206x = null;
    }

    public final void b(int i8) {
        this.f20205w = i8;
    }

    static /* synthetic */ void b(a aVar) {
        com.mbridge.msdk.foundation.d.b.a().a(aVar.f20193k, 0, 4, f20182b, aVar.f20188f);
        List<C0393a> list = aVar.f20202t;
        if (list != null) {
            for (C0393a c0393a : list) {
                if (c0393a != null) {
                    c0393a.b();
                }
            }
        }
        f20182b = "";
    }

    static /* synthetic */ void c(a aVar) {
        com.mbridge.msdk.foundation.d.b.a().a(aVar.f20193k, 0, 4, f20182b, aVar.f20188f);
        Context e8 = c.m().e();
        if (e8 == null) {
            e8 = c.m().c();
        }
        List<C0393a> list = aVar.f20202t;
        if (list != null) {
            for (C0393a c0393a : list) {
                if (c0393a != null) {
                    c0393a.b();
                }
            }
        }
        aVar.a(e8);
        f20182b = "";
    }

    public final void a(CampaignEx campaignEx) {
        this.f20187e = campaignEx;
    }

    public final void a(String str) {
        this.f20188f = str;
    }

    private void a(Context context) {
        if (context != null) {
            try {
                com.mbridge.msdk.click.c.e(context, ai.a(this.f20187e));
            } catch (Exception unused) {
                com.mbridge.msdk.click.c.c(context, ai.a(this.f20187e));
            }
        }
    }

    private FeedbackRadioGroup a(b.C0384b c0384b) {
        JSONArray b8 = c0384b.b();
        Context c8 = c.m().c();
        if (b8 == null || b8.length() <= 0 || c8 == null) {
            return null;
        }
        FeedbackRadioGroup feedbackRadioGroup = new FeedbackRadioGroup(c8);
        feedbackRadioGroup.setOrientation(0);
        return feedbackRadioGroup;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.mbridge.msdk.widget.FeedbackRadioGroup r11, com.mbridge.msdk.c.b.C0384b r12) {
        /*
            r10 = this;
            org.json.JSONArray r12 = r12.b()
            com.mbridge.msdk.foundation.controller.c r0 = com.mbridge.msdk.foundation.controller.c.m()
            android.content.Context r0 = r0.c()
            if (r12 == 0) goto L7e
            int r1 = r12.length()
            if (r1 <= 0) goto L7e
            if (r0 == 0) goto L7e
            java.lang.String r1 = "mbridge_cm_feedback_choice_btn_bg"
            java.lang.String r2 = "drawable"
            com.mbridge.msdk.foundation.tools.v.a(r0, r1, r2)
            android.content.res.Resources r1 = com.mbridge.msdk.foundation.tools.v.a(r0)
            java.lang.String r2 = "mbridge_cm_feedback_rb_text_color_color_list"
            java.lang.String r3 = "color"
            int r2 = com.mbridge.msdk.foundation.tools.v.a(r0, r2, r3)
            if (r1 == 0) goto L34
            android.content.res.ColorStateList r1 = r1.getColorStateList(r2)     // Catch: java.lang.Exception -> L30
            goto L35
        L30:
            r1 = move-exception
            r1.printStackTrace()
        L34:
            r1 = 0
        L35:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = com.mbridge.msdk.foundation.tools.ai.a(r0, r2)
            int r4 = com.mbridge.msdk.foundation.tools.ai.a(r0, r2)
            int r2 = com.mbridge.msdk.foundation.tools.ai.a(r0, r2)
            r5 = 0
        L44:
            int r6 = r12.length()
            if (r5 >= r6) goto L7e
            java.lang.String r6 = r12.optString(r5)
            android.widget.RadioButton r7 = new android.widget.RadioButton
            r7.<init>(r0)
            r7.setButtonTintList(r1)
            r7.setText(r6)
            if (r1 == 0) goto L5e
            r7.setTextColor(r1)
        L5e:
            r7.setCompoundDrawablePadding(r3)
            r7.setPadding(r3, r4, r3, r4)
            android.text.TextUtils$TruncateAt r6 = android.text.TextUtils.TruncateAt.END
            r7.setEllipsize(r6)
            android.widget.RadioGroup$LayoutParams r6 = new android.widget.RadioGroup$LayoutParams
            r8 = -1
            r9 = -2
            r6.<init>(r8, r9)
            int r8 = r2 / 4
            r6.setMargins(r2, r8, r2, r8)
            r10.a(r7)
            r11.addView(r7, r6)
            int r5 = r5 + 1
            goto L44
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.d.a.a.a(com.mbridge.msdk.widget.FeedbackRadioGroup, com.mbridge.msdk.c.b$b):void");
    }

    private void a(RadioButton radioButton) {
        if (radioButton != null) {
            radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.mbridge.msdk.foundation.d.a.a.4
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                    if (z8) {
                        String unused = a.f20182b = (String) compoundButton.getText();
                    }
                    if (a.this.f20194l != null) {
                        a.this.f20194l.setCancelButtonClickable(!TextUtils.isEmpty(a.f20182b));
                    }
                }
            });
        }
    }

    public final void a(FeedBackButton feedBackButton) {
        FeedBackButton feedBackButton2 = this.f20189g;
        if (feedBackButton2 != null) {
            feedBackButton2.setVisibility(8);
        }
        if (feedBackButton != null) {
            feedBackButton.setAlpha(this.f20185c);
            feedBackButton.setEnabled(this.f20185c != 0.0f);
            feedBackButton.setVisibility(this.f20207y != 8 ? 0 : 8);
            this.f20189g = feedBackButton;
            CampaignEx campaignEx = this.f20187e;
            if (campaignEx != null && !campaignEx.isDynamicView()) {
                l();
            }
            feedBackButton.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.foundation.d.a.a.6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.this.e();
                }
            });
        }
    }

    public final void a(int i8) {
        this.f20201s = i8;
    }

    public final void a(int i8, int i9, int i10, int i11, int i12, float f8, String str, String str2, float f9, JSONArray jSONArray) {
        if (i8 > -1) {
            this.f20183A = i8;
        }
        if (i9 > -1) {
            this.f20184B = i9;
        }
        if (i10 > -1) {
            this.f20208z = i10;
        }
        if (i11 > -1) {
            this.f20192j = i11;
        }
        if (f9 > -1.0f) {
            this.f20191i = f9;
        }
        if (jSONArray != null) {
            this.f20196n = jSONArray;
        }
        this.f20190h = str;
        this.f20186d = str2;
        this.f20185c = f8;
        this.f20203u = i12;
        l();
    }

    static /* synthetic */ void a(a aVar) {
        com.mbridge.msdk.foundation.d.b.a().a(aVar.f20193k, 1, 4, f20182b, aVar.f20188f);
        List<C0393a> list = aVar.f20202t;
        if (list != null) {
            for (C0393a c0393a : list) {
                if (c0393a != null) {
                    c0393a.a();
                }
            }
        }
        if (!TextUtils.isEmpty(aVar.f20204v)) {
            try {
                Activity a8 = com.mbridge.msdk.foundation.d.b.a().a(c.m().c());
                if (a8 != null) {
                    View inflate = LayoutInflater.from(a8).inflate(v.a(a8, "mbridge_cm_feedback_notice_layout", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
                    Dialog dialog = new Dialog(a8, 3);
                    aVar.f20195m = dialog;
                    dialog.requestWindowFeature(1);
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                    Window window = aVar.f20195m.getWindow();
                    layoutParams.copyFrom(window.getAttributes());
                    layoutParams.width = -2;
                    layoutParams.height = -2;
                    aVar.f20195m.setContentView(inflate);
                    aVar.f20195m.show();
                    window.setAttributes(layoutParams);
                    inflate.postDelayed(new Runnable() { // from class: com.mbridge.msdk.foundation.d.a.a.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                if (a.this.f20195m != null && a.this.f20195m.isShowing()) {
                                    a.this.f20195m.dismiss();
                                }
                            } catch (Exception e8) {
                                e8.printStackTrace();
                            }
                        }
                    }, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        f20182b = "";
    }
}
