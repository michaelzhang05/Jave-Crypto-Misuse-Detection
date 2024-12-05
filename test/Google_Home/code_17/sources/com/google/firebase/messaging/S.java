package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.AbstractC2574e;
import java.util.Map;

/* loaded from: classes4.dex */
public final class S extends R.a {
    public static final Parcelable.Creator<S> CREATOR = new T();

    /* renamed from: a, reason: collision with root package name */
    Bundle f18379a;

    /* renamed from: b, reason: collision with root package name */
    private Map f18380b;

    /* renamed from: c, reason: collision with root package name */
    private b f18381c;

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f18382a;

        /* renamed from: b, reason: collision with root package name */
        private final String f18383b;

        /* renamed from: c, reason: collision with root package name */
        private final String[] f18384c;

        /* renamed from: d, reason: collision with root package name */
        private final String f18385d;

        /* renamed from: e, reason: collision with root package name */
        private final String f18386e;

        /* renamed from: f, reason: collision with root package name */
        private final String[] f18387f;

        /* renamed from: g, reason: collision with root package name */
        private final String f18388g;

        /* renamed from: h, reason: collision with root package name */
        private final String f18389h;

        /* renamed from: i, reason: collision with root package name */
        private final String f18390i;

        /* renamed from: j, reason: collision with root package name */
        private final String f18391j;

        /* renamed from: k, reason: collision with root package name */
        private final String f18392k;

        /* renamed from: l, reason: collision with root package name */
        private final String f18393l;

        /* renamed from: m, reason: collision with root package name */
        private final String f18394m;

        /* renamed from: n, reason: collision with root package name */
        private final Uri f18395n;

        /* renamed from: o, reason: collision with root package name */
        private final String f18396o;

        /* renamed from: p, reason: collision with root package name */
        private final Integer f18397p;

        /* renamed from: q, reason: collision with root package name */
        private final Integer f18398q;

        /* renamed from: r, reason: collision with root package name */
        private final Integer f18399r;

        /* renamed from: s, reason: collision with root package name */
        private final int[] f18400s;

        /* renamed from: t, reason: collision with root package name */
        private final Long f18401t;

        /* renamed from: u, reason: collision with root package name */
        private final boolean f18402u;

        /* renamed from: v, reason: collision with root package name */
        private final boolean f18403v;

        /* renamed from: w, reason: collision with root package name */
        private final boolean f18404w;

        /* renamed from: x, reason: collision with root package name */
        private final boolean f18405x;

        /* renamed from: y, reason: collision with root package name */
        private final boolean f18406y;

        /* renamed from: z, reason: collision with root package name */
        private final long[] f18407z;

        private static String[] b(J j8, String str) {
            Object[] g8 = j8.g(str);
            if (g8 == null) {
                return null;
            }
            String[] strArr = new String[g8.length];
            for (int i8 = 0; i8 < g8.length; i8++) {
                strArr[i8] = String.valueOf(g8[i8]);
            }
            return strArr;
        }

        public String a() {
            return this.f18385d;
        }

        public String c() {
            return this.f18382a;
        }

        private b(J j8) {
            this.f18382a = j8.p("gcm.n.title");
            this.f18383b = j8.h("gcm.n.title");
            this.f18384c = b(j8, "gcm.n.title");
            this.f18385d = j8.p("gcm.n.body");
            this.f18386e = j8.h("gcm.n.body");
            this.f18387f = b(j8, "gcm.n.body");
            this.f18388g = j8.p("gcm.n.icon");
            this.f18390i = j8.o();
            this.f18391j = j8.p("gcm.n.tag");
            this.f18392k = j8.p("gcm.n.color");
            this.f18393l = j8.p("gcm.n.click_action");
            this.f18394m = j8.p("gcm.n.android_channel_id");
            this.f18395n = j8.f();
            this.f18389h = j8.p("gcm.n.image");
            this.f18396o = j8.p("gcm.n.ticker");
            this.f18397p = j8.b("gcm.n.notification_priority");
            this.f18398q = j8.b("gcm.n.visibility");
            this.f18399r = j8.b("gcm.n.notification_count");
            this.f18402u = j8.a("gcm.n.sticky");
            this.f18403v = j8.a("gcm.n.local_only");
            this.f18404w = j8.a("gcm.n.default_sound");
            this.f18405x = j8.a("gcm.n.default_vibrate_timings");
            this.f18406y = j8.a("gcm.n.default_light_settings");
            this.f18401t = j8.j("gcm.n.event_time");
            this.f18400s = j8.e();
            this.f18407z = j8.q();
        }
    }

    public S(Bundle bundle) {
        this.f18379a = bundle;
    }

    public Map p() {
        if (this.f18380b == null) {
            this.f18380b = AbstractC2574e.a.a(this.f18379a);
        }
        return this.f18380b;
    }

    public b u() {
        if (this.f18381c == null && J.t(this.f18379a)) {
            this.f18381c = new b(new J(this.f18379a));
        }
        return this.f18381c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        T.c(this, parcel, i8);
    }
}
