package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.AbstractC2380e;
import java.util.Map;

/* loaded from: classes3.dex */
public final class O extends S.a {
    public static final Parcelable.Creator<O> CREATOR = new P();

    /* renamed from: a, reason: collision with root package name */
    Bundle f17342a;

    /* renamed from: b, reason: collision with root package name */
    private Map f17343b;

    /* renamed from: c, reason: collision with root package name */
    private b f17344c;

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f17345a;

        /* renamed from: b, reason: collision with root package name */
        private final String f17346b;

        /* renamed from: c, reason: collision with root package name */
        private final String[] f17347c;

        /* renamed from: d, reason: collision with root package name */
        private final String f17348d;

        /* renamed from: e, reason: collision with root package name */
        private final String f17349e;

        /* renamed from: f, reason: collision with root package name */
        private final String[] f17350f;

        /* renamed from: g, reason: collision with root package name */
        private final String f17351g;

        /* renamed from: h, reason: collision with root package name */
        private final String f17352h;

        /* renamed from: i, reason: collision with root package name */
        private final String f17353i;

        /* renamed from: j, reason: collision with root package name */
        private final String f17354j;

        /* renamed from: k, reason: collision with root package name */
        private final String f17355k;

        /* renamed from: l, reason: collision with root package name */
        private final String f17356l;

        /* renamed from: m, reason: collision with root package name */
        private final String f17357m;

        /* renamed from: n, reason: collision with root package name */
        private final Uri f17358n;

        /* renamed from: o, reason: collision with root package name */
        private final String f17359o;

        /* renamed from: p, reason: collision with root package name */
        private final Integer f17360p;

        /* renamed from: q, reason: collision with root package name */
        private final Integer f17361q;

        /* renamed from: r, reason: collision with root package name */
        private final Integer f17362r;

        /* renamed from: s, reason: collision with root package name */
        private final int[] f17363s;

        /* renamed from: t, reason: collision with root package name */
        private final Long f17364t;

        /* renamed from: u, reason: collision with root package name */
        private final boolean f17365u;

        /* renamed from: v, reason: collision with root package name */
        private final boolean f17366v;

        /* renamed from: w, reason: collision with root package name */
        private final boolean f17367w;

        /* renamed from: x, reason: collision with root package name */
        private final boolean f17368x;

        /* renamed from: y, reason: collision with root package name */
        private final boolean f17369y;

        /* renamed from: z, reason: collision with root package name */
        private final long[] f17370z;

        private static String[] b(H h8, String str) {
            Object[] g8 = h8.g(str);
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
            return this.f17348d;
        }

        public String c() {
            return this.f17345a;
        }

        private b(H h8) {
            this.f17345a = h8.p("gcm.n.title");
            this.f17346b = h8.h("gcm.n.title");
            this.f17347c = b(h8, "gcm.n.title");
            this.f17348d = h8.p("gcm.n.body");
            this.f17349e = h8.h("gcm.n.body");
            this.f17350f = b(h8, "gcm.n.body");
            this.f17351g = h8.p("gcm.n.icon");
            this.f17353i = h8.o();
            this.f17354j = h8.p("gcm.n.tag");
            this.f17355k = h8.p("gcm.n.color");
            this.f17356l = h8.p("gcm.n.click_action");
            this.f17357m = h8.p("gcm.n.android_channel_id");
            this.f17358n = h8.f();
            this.f17352h = h8.p("gcm.n.image");
            this.f17359o = h8.p("gcm.n.ticker");
            this.f17360p = h8.b("gcm.n.notification_priority");
            this.f17361q = h8.b("gcm.n.visibility");
            this.f17362r = h8.b("gcm.n.notification_count");
            this.f17365u = h8.a("gcm.n.sticky");
            this.f17366v = h8.a("gcm.n.local_only");
            this.f17367w = h8.a("gcm.n.default_sound");
            this.f17368x = h8.a("gcm.n.default_vibrate_timings");
            this.f17369y = h8.a("gcm.n.default_light_settings");
            this.f17364t = h8.j("gcm.n.event_time");
            this.f17363s = h8.e();
            this.f17370z = h8.q();
        }
    }

    public O(Bundle bundle) {
        this.f17342a = bundle;
    }

    public Map s() {
        if (this.f17343b == null) {
            this.f17343b = AbstractC2380e.a.a(this.f17342a);
        }
        return this.f17343b;
    }

    public b u() {
        if (this.f17344c == null && H.t(this.f17342a)) {
            this.f17344c = new b(new H(this.f17342a));
        }
        return this.f17344c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        P.c(this, parcel, i8);
    }
}
