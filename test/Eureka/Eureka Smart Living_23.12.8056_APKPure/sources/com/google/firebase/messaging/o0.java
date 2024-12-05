package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.e;
import java.util.Map;

/* loaded from: classes.dex */
public final class o0 extends w1.a {
    public static final Parcelable.Creator<o0> CREATOR = new p0();

    /* renamed from: a, reason: collision with root package name */
    Bundle f5943a;

    /* renamed from: b, reason: collision with root package name */
    private Map f5944b;

    /* renamed from: c, reason: collision with root package name */
    private b f5945c;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f5946a;

        /* renamed from: b, reason: collision with root package name */
        private final String f5947b;

        /* renamed from: c, reason: collision with root package name */
        private final String[] f5948c;

        /* renamed from: d, reason: collision with root package name */
        private final String f5949d;

        /* renamed from: e, reason: collision with root package name */
        private final String f5950e;

        /* renamed from: f, reason: collision with root package name */
        private final String[] f5951f;

        /* renamed from: g, reason: collision with root package name */
        private final String f5952g;

        /* renamed from: h, reason: collision with root package name */
        private final String f5953h;

        /* renamed from: i, reason: collision with root package name */
        private final String f5954i;

        /* renamed from: j, reason: collision with root package name */
        private final String f5955j;

        /* renamed from: k, reason: collision with root package name */
        private final String f5956k;

        /* renamed from: l, reason: collision with root package name */
        private final String f5957l;

        /* renamed from: m, reason: collision with root package name */
        private final String f5958m;

        /* renamed from: n, reason: collision with root package name */
        private final Uri f5959n;

        /* renamed from: o, reason: collision with root package name */
        private final String f5960o;

        /* renamed from: p, reason: collision with root package name */
        private final Integer f5961p;

        /* renamed from: q, reason: collision with root package name */
        private final Integer f5962q;

        /* renamed from: r, reason: collision with root package name */
        private final Integer f5963r;

        /* renamed from: s, reason: collision with root package name */
        private final int[] f5964s;

        /* renamed from: t, reason: collision with root package name */
        private final Long f5965t;

        /* renamed from: u, reason: collision with root package name */
        private final boolean f5966u;

        /* renamed from: v, reason: collision with root package name */
        private final boolean f5967v;

        /* renamed from: w, reason: collision with root package name */
        private final boolean f5968w;

        /* renamed from: x, reason: collision with root package name */
        private final boolean f5969x;

        /* renamed from: y, reason: collision with root package name */
        private final boolean f5970y;

        /* renamed from: z, reason: collision with root package name */
        private final long[] f5971z;

        private b(h0 h0Var) {
            this.f5946a = h0Var.p("gcm.n.title");
            this.f5947b = h0Var.h("gcm.n.title");
            this.f5948c = d(h0Var, "gcm.n.title");
            this.f5949d = h0Var.p("gcm.n.body");
            this.f5950e = h0Var.h("gcm.n.body");
            this.f5951f = d(h0Var, "gcm.n.body");
            this.f5952g = h0Var.p("gcm.n.icon");
            this.f5954i = h0Var.o();
            this.f5955j = h0Var.p("gcm.n.tag");
            this.f5956k = h0Var.p("gcm.n.color");
            this.f5957l = h0Var.p("gcm.n.click_action");
            this.f5958m = h0Var.p("gcm.n.android_channel_id");
            this.f5959n = h0Var.f();
            this.f5953h = h0Var.p("gcm.n.image");
            this.f5960o = h0Var.p("gcm.n.ticker");
            this.f5961p = h0Var.b("gcm.n.notification_priority");
            this.f5962q = h0Var.b("gcm.n.visibility");
            this.f5963r = h0Var.b("gcm.n.notification_count");
            this.f5966u = h0Var.a("gcm.n.sticky");
            this.f5967v = h0Var.a("gcm.n.local_only");
            this.f5968w = h0Var.a("gcm.n.default_sound");
            this.f5969x = h0Var.a("gcm.n.default_vibrate_timings");
            this.f5970y = h0Var.a("gcm.n.default_light_settings");
            this.f5965t = h0Var.j("gcm.n.event_time");
            this.f5964s = h0Var.e();
            this.f5971z = h0Var.q();
        }

        private static String[] d(h0 h0Var, String str) {
            Object[] g6 = h0Var.g(str);
            if (g6 == null) {
                return null;
            }
            String[] strArr = new String[g6.length];
            for (int i6 = 0; i6 < g6.length; i6++) {
                strArr[i6] = String.valueOf(g6[i6]);
            }
            return strArr;
        }

        public String a() {
            return this.f5949d;
        }

        public String b() {
            return this.f5957l;
        }

        public Uri c() {
            return this.f5959n;
        }

        public String e() {
            return this.f5946a;
        }
    }

    public o0(Bundle bundle) {
        this.f5943a = bundle;
    }

    public Map a() {
        if (this.f5944b == null) {
            this.f5944b = e.a.a(this.f5943a);
        }
        return this.f5944b;
    }

    public String b() {
        String string = this.f5943a.getString("google.message_id");
        return string == null ? this.f5943a.getString("message_id") : string;
    }

    public b c() {
        if (this.f5945c == null && h0.t(this.f5943a)) {
            this.f5945c = new b(new h0(this.f5943a));
        }
        return this.f5945c;
    }

    public Intent d() {
        Intent intent = new Intent();
        intent.putExtras(this.f5943a);
        return intent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        p0.c(this, parcel, i6);
    }
}
