package com.mbridge.msdk.foundation.d;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.d.a.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.dialog.MBFeedBackDialog;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f19162a = -2;

    /* renamed from: b, reason: collision with root package name */
    public static int f19163b = -2;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f19164c = false;

    /* renamed from: d, reason: collision with root package name */
    private final RelativeLayout.LayoutParams f19165d;

    /* renamed from: e, reason: collision with root package name */
    private final ConcurrentHashMap<String, com.mbridge.msdk.foundation.d.a.a> f19166e;

    /* renamed from: f, reason: collision with root package name */
    private g f19167f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final b f19168a = new b();
    }

    public static b a() {
        return a.f19168a;
    }

    private com.mbridge.msdk.foundation.d.a.a d(String str) {
        if (TextUtils.isEmpty(str)) {
            str = c.m().k();
        }
        if (this.f19166e.containsKey(str)) {
            return this.f19166e.get(str);
        }
        return null;
    }

    public final boolean b() {
        g b8 = h.a().b(c.m().k());
        this.f19167f = b8;
        if (b8 != null) {
            return false;
        }
        h.a();
        this.f19167f = i.a();
        return false;
    }

    public final void c(String str) {
        try {
            com.mbridge.msdk.foundation.d.a.a d8 = d(str);
            if (d8 != null) {
                d8.a();
            }
            this.f19166e.remove(str);
            f19164c = false;
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    private b() {
        this.f19165d = new RelativeLayout.LayoutParams(f19163b, f19162a);
        this.f19166e = new ConcurrentHashMap<>();
    }

    public final void a(String str, Context context, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams, com.mbridge.msdk.foundation.d.a aVar) {
        if (b()) {
            com.mbridge.msdk.foundation.d.a.a a8 = a(str);
            if (aVar != null) {
                a8.a(new a.C0397a(str, aVar));
            }
            FeedBackButton d8 = a8.d();
            if (d8 != null) {
                if (layoutParams == null) {
                    int a9 = ai.a(c.m().c(), 10.0f);
                    this.f19165d.setMargins(a9, a9, a9, a9);
                    layoutParams = this.f19165d;
                }
                ViewGroup viewGroup2 = (ViewGroup) d8.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(d8);
                }
                Activity a10 = a(context);
                if (a10 != null && viewGroup == null) {
                    viewGroup = (ViewGroup) a10.findViewById(R.id.content);
                }
                if (viewGroup != null) {
                    viewGroup.removeView(d8);
                    viewGroup.addView(d8, layoutParams);
                }
            }
        }
    }

    public final FeedBackButton b(String str) {
        return a(str).d();
    }

    public final void b(String str, int i8) {
        a(str).b(i8);
    }

    public final com.mbridge.msdk.foundation.d.a.a a(String str) {
        com.mbridge.msdk.foundation.d.a.a aVar;
        if (TextUtils.isEmpty(str)) {
            str = c.m().k();
        }
        if (!this.f19166e.containsKey(str)) {
            aVar = new com.mbridge.msdk.foundation.d.a.a(str);
            this.f19166e.put(str, aVar);
        } else {
            aVar = this.f19166e.get(str);
        }
        if (aVar != null) {
            return aVar;
        }
        com.mbridge.msdk.foundation.d.a.a aVar2 = new com.mbridge.msdk.foundation.d.a.a(str);
        this.f19166e.put(str, aVar2);
        return aVar2;
    }

    public final Activity a(Context context) {
        Activity activity;
        Activity activity2;
        Context e8 = c.m().e();
        Activity activity3 = null;
        try {
            activity = e8 instanceof Activity ? (Activity) e8 : null;
        } catch (Exception e9) {
            e = e9;
        }
        try {
            if ((context instanceof Activity) && !((Activity) context).isDestroyed()) {
                activity = (Activity) context;
            }
            WeakReference<Activity> a8 = c.m().a();
            if (a8 != null && (activity2 = a8.get()) != null && !activity2.isFinishing() && !activity2.isDestroyed()) {
                activity = activity2;
            }
            if (activity == null || activity.isFinishing()) {
                return null;
            }
            if (activity.isDestroyed()) {
                return null;
            }
            return activity;
        } catch (Exception e10) {
            e = e10;
            activity3 = activity;
            e.printStackTrace();
            return activity3;
        }
    }

    public final void a(String str, int i8, ViewGroup viewGroup) {
        com.mbridge.msdk.foundation.d.a.a a8 = a(str);
        if (a8.d() != null) {
            a8.c(i8);
            if (i8 == 0) {
                a(str, c.m().c(), viewGroup, (ViewGroup.LayoutParams) null, (com.mbridge.msdk.foundation.d.a) null);
            }
        }
    }

    public final void a(String str, int i8, int i9, int i10, float f8, float f9, float f10, String str2, String str3, float f11, JSONArray jSONArray) {
        com.mbridge.msdk.foundation.d.a.a a8 = a(str);
        Context c8 = c.m().c();
        a8.a(ai.a(c8, f8), ai.a(c8, f9), ai.a(c8, i8), ai.a(c8, i9), ai.a(c8, i10), f10, str2, str3, f11, jSONArray);
    }

    public final void a(String str, int i8, com.mbridge.msdk.foundation.d.a aVar) {
        com.mbridge.msdk.foundation.d.a.a a8 = a(str);
        a8.a(new a.C0397a(str, aVar));
        if (i8 == 1) {
            a8.b();
        } else {
            a8.e();
        }
    }

    public final void a(String str, int i8, int i9, String str2, String str3) {
        com.mbridge.msdk.foundation.d.a.a d8 = d(str + "_1");
        if (d8 == null) {
            d8 = d(str + "_2");
            if (d8 == null) {
                d8 = d(str + "_3");
                if (d8 == null) {
                    d8 = d(str + "_4");
                    if (d8 == null) {
                        d8 = a(str);
                    }
                }
            }
            d8.b(0);
        }
        if (d8 != null) {
            CampaignEx c8 = d8.c();
            k.a(c8, c8 != null ? c8.getCampaignUnitId() : "", d8.g(), d8.f(), !TextUtils.isEmpty(str2) ? str2 : "", i8, c8 != null ? c8.getAdType() : 0, i9, str3);
        }
    }

    public final void a(String str, CampaignEx campaignEx) {
        a(str).a(campaignEx);
    }

    public final void a(String str, String str2) {
        a(str).a(str2);
    }

    public final void a(String str, FeedBackButton feedBackButton) {
        a(str).a(feedBackButton);
    }

    public final void a(String str, com.mbridge.msdk.foundation.d.a aVar) {
        com.mbridge.msdk.foundation.d.a.a a8 = a(str);
        if (aVar != null) {
            a8.a(new a.C0397a(str, aVar));
        }
    }

    public final void a(String str, int i8) {
        a(str).a(i8);
    }

    public final boolean a(String str, Context context, MBFeedBackDialog mBFeedBackDialog) {
        if (mBFeedBackDialog == null) {
            ad.c("", "mbAlertDialog  is null");
            return false;
        }
        return a(context, mBFeedBackDialog);
    }

    private boolean a(Context context, MBFeedBackDialog mBFeedBackDialog) {
        Activity a8 = a(context);
        if (a8 == null || mBFeedBackDialog == null || a8.isDestroyed()) {
            return false;
        }
        try {
            if (mBFeedBackDialog.isShowing() || a8.isFinishing()) {
                return false;
            }
            mBFeedBackDialog.show();
            return true;
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }
}
