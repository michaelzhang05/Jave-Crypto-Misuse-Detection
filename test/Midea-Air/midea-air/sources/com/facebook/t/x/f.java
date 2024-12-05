package com.facebook.t.x;

import android.os.Bundle;
import android.view.View;
import com.facebook.GraphRequest;
import com.facebook.internal.x;
import com.facebook.t.m;
import com.facebook.t.v.c;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ViewOnClickListener.java */
/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    private static final String f9691f = f.class.getCanonicalName();

    /* renamed from: g, reason: collision with root package name */
    private static final Set<Integer> f9692g = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    private View.OnClickListener f9693h;

    /* renamed from: i, reason: collision with root package name */
    private WeakReference<View> f9694i;

    /* renamed from: j, reason: collision with root package name */
    private WeakReference<View> f9695j;

    /* renamed from: k, reason: collision with root package name */
    private String f9696k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewOnClickListener.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f9697f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f9698g;

        a(String str, String str2) {
            this.f9697f = str;
            this.f9698g = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                f.a(this.f9697f, this.f9698g, new float[0]);
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewOnClickListener.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ JSONObject f9699f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f9700g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f9701h;

        b(JSONObject jSONObject, String str, String str2) {
            this.f9699f = jSONObject;
            this.f9700g = str;
            this.f9701h = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            String[] o;
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                String lowerCase = x.r(com.facebook.f.e()).toLowerCase();
                float[] a = com.facebook.t.x.a.a(this.f9699f, lowerCase);
                String c2 = com.facebook.t.x.a.c(this.f9700g, f.b(f.this), lowerCase);
                if (a == null || (o = com.facebook.t.v.c.o(c.e.MTML_APP_EVENT_PREDICTION, new float[][]{a}, new String[]{c2})) == null) {
                    return;
                }
                String str = o[0];
                com.facebook.t.x.b.a(this.f9701h, str);
                if (str.equals("other")) {
                    return;
                }
                f.a(str, this.f9700g, a);
            } catch (Exception unused) {
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    private f(View view, View view2, String str) {
        this.f9693h = com.facebook.t.r.g.f.g(view);
        this.f9695j = new WeakReference<>(view);
        this.f9694i = new WeakReference<>(view2);
        this.f9696k = str.toLowerCase().replace("activity", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    static /* synthetic */ void a(String str, String str2, float[] fArr) {
        if (com.facebook.internal.a0.f.a.c(f.class)) {
            return;
        }
        try {
            f(str, str2, fArr);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, f.class);
        }
    }

    static /* synthetic */ String b(f fVar) {
        if (com.facebook.internal.a0.f.a.c(f.class)) {
            return null;
        }
        try {
            return fVar.f9696k;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, f.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(View view, View view2, String str) {
        if (com.facebook.internal.a0.f.a.c(f.class)) {
            return;
        }
        try {
            int hashCode = view.hashCode();
            Set<Integer> set = f9692g;
            if (set.contains(Integer.valueOf(hashCode))) {
                return;
            }
            com.facebook.t.r.g.f.r(view, new f(view, view2, str));
            set.add(Integer.valueOf(hashCode));
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, f.class);
        }
    }

    private void d(String str, String str2, JSONObject jSONObject) {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            x.m0(new b(jSONObject, str2, str));
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    private void e() {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            View view = this.f9694i.get();
            View view2 = this.f9695j.get();
            if (view != null && view2 != null) {
                try {
                    String d2 = c.d(view2);
                    String b2 = com.facebook.t.x.b.b(view2, d2);
                    if (b2 == null || g(b2, d2)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("view", c.b(view, view2));
                    jSONObject.put("screenname", this.f9696k);
                    d(b2, d2, jSONObject);
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    private static void f(String str, String str2, float[] fArr) {
        if (com.facebook.internal.a0.f.a.c(f.class)) {
            return;
        }
        try {
            if (d.d(str)) {
                new m(com.facebook.f.e()).g(str, str2);
            } else if (d.c(str)) {
                h(str, str2, fArr);
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, f.class);
        }
    }

    private static boolean g(String str, String str2) {
        if (com.facebook.internal.a0.f.a.c(f.class)) {
            return false;
        }
        try {
            String d2 = com.facebook.t.x.b.d(str);
            if (d2 == null) {
                return false;
            }
            if (d2.equals("other")) {
                return true;
            }
            x.m0(new a(d2, str2));
            return true;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, f.class);
            return false;
        }
    }

    private static void h(String str, String str2, float[] fArr) {
        if (com.facebook.internal.a0.f.a.c(f.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            try {
                bundle.putString("event_name", str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb = new StringBuilder();
                for (float f2 : fArr) {
                    sb.append(f2);
                    sb.append(",");
                }
                jSONObject.put("dense", sb.toString());
                jSONObject.put("button_text", str2);
                bundle.putString("metadata", jSONObject.toString());
                GraphRequest L = GraphRequest.L(null, String.format(Locale.US, "%s/suggested_events", com.facebook.f.f()), null, null);
                L.a0(bundle);
                L.g();
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, f.class);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            View.OnClickListener onClickListener = this.f9693h;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            e();
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }
}
