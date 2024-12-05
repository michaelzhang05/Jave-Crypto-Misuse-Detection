package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import cm.aptoide.pt.root.execution.Command;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbxx implements zzbzb {
    private final Context a;

    /* renamed from: b */
    private final zzbzc f13649b;

    /* renamed from: c */
    private final JSONObject f13650c;

    /* renamed from: d */
    private final zzccj f13651d;

    /* renamed from: e */
    private final zzbyt f13652e;

    /* renamed from: f */
    private final zzdh f13653f;

    /* renamed from: g */
    private final zzbrt f13654g;

    /* renamed from: h */
    private final zzbri f13655h;

    /* renamed from: i */
    private final zzcxm f13656i;

    /* renamed from: j */
    private final zzbai f13657j;

    /* renamed from: k */
    private final zzcxv f13658k;
    private final zzbmn l;
    private final zzbzq m;
    private final Clock n;
    private final zzbva o;
    private final zzdae p;
    private boolean r;
    private zzaag y;
    private boolean q = false;
    private boolean s = false;
    private boolean t = false;
    private Point u = new Point();
    private Point v = new Point();
    private long w = 0;
    private long x = 0;

    public zzbxx(Context context, zzbzc zzbzcVar, JSONObject jSONObject, zzccj zzccjVar, zzbyt zzbytVar, zzdh zzdhVar, zzbrt zzbrtVar, zzbri zzbriVar, zzcxm zzcxmVar, zzbai zzbaiVar, zzcxv zzcxvVar, zzbmn zzbmnVar, zzbzq zzbzqVar, Clock clock, zzbva zzbvaVar, zzdae zzdaeVar) {
        this.a = context;
        this.f13649b = zzbzcVar;
        this.f13650c = jSONObject;
        this.f13651d = zzccjVar;
        this.f13652e = zzbytVar;
        this.f13653f = zzdhVar;
        this.f13654g = zzbrtVar;
        this.f13655h = zzbriVar;
        this.f13656i = zzcxmVar;
        this.f13657j = zzbaiVar;
        this.f13658k = zzcxvVar;
        this.l = zzbmnVar;
        this.m = zzbzqVar;
        this.n = clock;
        this.o = zzbvaVar;
        this.p = zzdaeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fc A[Catch: JSONException -> 0x0100, TRY_LEAVE, TryCatch #4 {JSONException -> 0x0100, blocks: (B:18:0x00cb, B:26:0x00f3, B:27:0x00f7, B:28:0x00fc, B:29:0x00da, B:32:0x00e4), top: B:17:0x00cb }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4 A[Catch: JSONException -> 0x0100, TRY_LEAVE, TryCatch #4 {JSONException -> 0x0100, blocks: (B:18:0x00cb, B:26:0x00f3, B:27:0x00f7, B:28:0x00fc, B:29:0x00da, B:32:0x00e4), top: B:17:0x00cb }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final org.json.JSONObject A(android.view.View r14) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbxx.A(android.view.View):org.json.JSONObject");
    }

    private static JSONObject B(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            zzk.zzlg();
            jSONObject.put("contained_in_scroll_view", zzaxi.e0(view) != -1);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private final JSONObject C(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            zzk.zzlg();
            jSONObject.put("can_show_on_lock_screen", zzaxi.d0(view));
            zzk.zzlg();
            jSONObject.put("is_keyguard_locked", zzaxi.D(this.a));
        } catch (JSONException unused) {
            zzbad.i("Unable to get lock screen information");
        }
        return jSONObject;
    }

    private final String D(View view) {
        try {
            JSONObject optJSONObject = this.f13650c.optJSONObject("tracking_urls_and_actions");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            return this.f13653f.f().zza(this.a, optJSONObject.optString("click_string"), view);
        } catch (Exception e2) {
            zzbad.c("Exception obtaining click signals", e2);
            return null;
        }
    }

    private static int[] E(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    private final JSONObject p(Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View view) {
        String str;
        String str2;
        JSONObject jSONObject;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int[] E = E(view);
            Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, WeakReference<View>> next = it.next();
                View view2 = next.getValue().get();
                if (view2 != null) {
                    int[] E2 = E(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    Iterator<Map.Entry<String, WeakReference<View>>> it2 = it;
                    try {
                        jSONObject4.put("width", x(view2.getMeasuredWidth()));
                        jSONObject4.put("height", x(view2.getMeasuredHeight()));
                        jSONObject4.put("x", x(E2[0] - E[0]));
                        jSONObject4.put("y", x(E2[1] - E[1]));
                        jSONObject4.put(str4, str3);
                        jSONObject3.put("frame", jSONObject4);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject = w(rect);
                        } else {
                            jSONObject = new JSONObject();
                            jSONObject.put("width", 0);
                            jSONObject.put("height", 0);
                            jSONObject.put("x", x(E2[0] - E[0]));
                            jSONObject.put("y", x(E2[1] - E[1]));
                            jSONObject.put(str4, str3);
                        }
                        jSONObject3.put("visible_bounds", jSONObject);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject3.put("text_color", textView.getCurrentTextColor());
                            str = str3;
                            str2 = str4;
                            try {
                                jSONObject3.put("font_size", textView.getTextSize());
                                jSONObject3.put(Command.CommandHandler.TEXT, textView.getText());
                            } catch (JSONException unused) {
                                zzbad.i("Unable to get asset views information");
                                it = it2;
                                str3 = str;
                                str4 = str2;
                            }
                        } else {
                            str = str3;
                            str2 = str4;
                        }
                        jSONObject3.put("is_clickable", map2 != null && map2.containsKey(next.getKey()) && view2.isClickable());
                        jSONObject2.put(next.getKey(), jSONObject3);
                    } catch (JSONException unused2) {
                        str = str3;
                        str2 = str4;
                    }
                    it = it2;
                    str3 = str;
                    str4 = str2;
                }
            }
        }
        return jSONObject2;
    }

    private final void q(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        Preconditions.f("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f13650c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.f13649b.i(this.f13652e.e()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f13652e.w());
            jSONObject8.put("view_aware_api_used", z);
            zzady zzadyVar = this.f13658k.f14578i;
            jSONObject8.put("custom_mute_requested", zzadyVar != null && zzadyVar.l);
            jSONObject8.put("custom_mute_enabled", (this.f13652e.i().isEmpty() || this.f13652e.y() == null) ? false : true);
            if (this.m.c() != null && this.f13650c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.n.a());
            if (this.t && s()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.f13649b.i(this.f13652e.e()) != null);
            jSONObject8.put("click_signals", D(view));
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long a = this.n.a();
            jSONObject9.put("time_from_last_touch_down", a - this.w);
            jSONObject9.put("time_from_last_touch", a - this.x);
            jSONObject7.put("touch_signal", jSONObject9);
            zzbao.a(this.f13651d.i("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e2) {
            zzbad.c("Unable to create click JSON.", e2);
        }
    }

    private final boolean r(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        Preconditions.f("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f13650c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            this.f13651d.d("/logScionEvent", new qf(this));
            this.f13651d.d("/nativeImpression", new sf(this));
            zzbao.a(this.f13651d.i("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            boolean z = this.q;
            if (z || this.f13656i.z == null) {
                return true;
            }
            this.q = z | zzk.zzlq().c(this.a, this.f13657j.f13150f, this.f13656i.z.toString(), this.f13658k.f14575f);
            return true;
        } catch (JSONException e2) {
            zzbad.c("Unable to create impression JSON.", e2);
            return false;
        }
    }

    private final boolean s() {
        return this.f13650c.optBoolean("allow_custom_click_gesture", false);
    }

    private final JSONObject t() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", x(this.u.x));
            jSONObject.put("y", x(this.u.y));
            jSONObject.put("start_x", x(this.v.x));
            jSONObject.put("start_y", x(this.v.y));
            return jSONObject;
        } catch (JSONException e2) {
            zzbad.c("Error occurred while putting signals into JSON object.", e2);
            return null;
        }
    }

    private final String v(View view, Map<String, WeakReference<View>> map) {
        if (map != null && view != null) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                if (view.equals(entry.getValue().get())) {
                    return entry.getKey();
                }
            }
        }
        int w = this.f13652e.w();
        if (w == 1) {
            return "1099";
        }
        if (w == 2) {
            return "2099";
        }
        if (w != 6) {
            return null;
        }
        return "3099";
    }

    private final JSONObject w(Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", x(rect.right - rect.left));
        jSONObject.put("height", x(rect.bottom - rect.top));
        jSONObject.put("x", x(rect.left));
        jSONObject.put("y", x(rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    private final int x(int i2) {
        return zzyt.a().j(this.a, i2);
    }

    private final boolean y(String str) {
        JSONObject optJSONObject = this.f13650c.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    private final JSONObject z(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e2) {
            e = e2;
        }
        try {
            jSONObject.put("click_point", t());
            jSONObject.put("asset_id", str);
            return jSONObject;
        } catch (Exception e3) {
            e = e3;
            jSONObject2 = jSONObject;
            zzbad.c("Error occurred while grabbing click signals.", e);
            return jSONObject2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void I() {
        if (this.f13650c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.m.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void N(zzagd zzagdVar) {
        if (!this.f13650c.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzbad.i("setUnconfirmedClickListener: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
        } else {
            this.m.b(zzagdVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void O(zzaak zzaakVar) {
        try {
            if (this.s) {
                return;
            }
            if (zzaakVar == null && this.f13652e.y() != null) {
                this.s = true;
                this.p.e(this.f13652e.y().Q1());
                n();
            } else {
                this.s = true;
                this.p.e(zzaakVar.Q1());
                n();
            }
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void Q() {
        this.t = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.u = new Point();
        this.v = new Point();
        if (!this.r) {
            this.o.Y(view);
            this.r = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.l.E(this);
        if (map != null) {
            Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = it.next().getValue().get();
                if (view2 != null) {
                    view2.setOnTouchListener(onTouchListener);
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator<Map.Entry<String, WeakReference<View>>> it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = it2.next().getValue().get();
                if (view3 != null) {
                    view3.setOnTouchListener(onTouchListener);
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void b(Bundle bundle) {
        if (bundle == null) {
            zzbad.e("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!y("touch_reporting")) {
            zzbad.g("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
            return;
        }
        this.f13653f.f().zza((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void c(View view) {
        if (!this.f13650c.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzbad.i("setClickConfirmingView: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzbzq zzbzqVar = this.m;
        if (view != null) {
            view.setOnClickListener(zzbzqVar);
            view.setClickable(true);
            zzbzqVar.l = new WeakReference<>(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void d() {
        Preconditions.f("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f13650c);
            zzbao.a(this.f13651d.i("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void destroy() {
        this.f13651d.a();
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void e(View view, Map<String, WeakReference<View>> map) {
        this.u = new Point();
        this.v = new Point();
        this.o.f0(view);
        this.r = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void f(Bundle bundle) {
        if (bundle == null) {
            zzbad.e("Click data is null. No click is reported.");
        } else if (!y("click_reporting")) {
            zzbad.g("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            q(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, zzk.zzlg().h(bundle, null), false, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void g(View view, MotionEvent motionEvent, View view2) {
        int[] E = E(view2);
        this.u = new Point(((int) motionEvent.getRawX()) - E[0], ((int) motionEvent.getRawY()) - E[1]);
        long a = this.n.a();
        this.x = a;
        if (motionEvent.getAction() == 0) {
            this.w = a;
            this.v = this.u;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.u;
        obtain.setLocation(point.x, point.y);
        this.f13653f.c(obtain);
        obtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void h(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        JSONObject p = p(map, map2, view2);
        JSONObject A = A(view2);
        JSONObject B = B(view2);
        JSONObject C = C(view2);
        String v = v(view, map);
        q(view, A, p, B, C, v, z(v), null, z, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void i(String str) {
        q(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void j(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        r(A(view), p(map, map2, view), B(view), C(view), null);
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void k(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.t) {
            zzbad.e("Custom click reporting failed. enableCustomClickGesture is not set.");
            return;
        }
        if (!s()) {
            zzbad.e("Custom click reporting failed. Ad unit id not whitelisted.");
            return;
        }
        JSONObject p = p(map, map2, view);
        JSONObject A = A(view);
        JSONObject B = B(view);
        JSONObject C = C(view);
        String v = v(null, map);
        q(view, A, p, B, C, v, z(v), null, z, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void k0(zzaag zzaagVar) {
        this.y = zzaagVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void l() {
        r(null, null, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final boolean m(Bundle bundle) {
        if (!y("impression_reporting")) {
            zzbad.g("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
            return false;
        }
        return r(null, null, null, null, zzk.zzlg().h(bundle, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void n() {
        try {
            zzaag zzaagVar = this.y;
            if (zzaagVar != null) {
                zzaagVar.onAdMuted();
            }
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }
}
