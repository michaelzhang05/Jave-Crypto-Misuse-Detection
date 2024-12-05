package com.stripe.android.model;

import M5.AbstractC1246t;
import M5.Q;
import M5.a0;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.StripeIntent;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class n implements StripeIntent {

    /* renamed from: a, reason: collision with root package name */
    private final String f24327a;

    /* renamed from: b, reason: collision with root package name */
    private final List f24328b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f24329c;

    /* renamed from: d, reason: collision with root package name */
    private final long f24330d;

    /* renamed from: e, reason: collision with root package name */
    private final a f24331e;

    /* renamed from: f, reason: collision with root package name */
    private final b f24332f;

    /* renamed from: g, reason: collision with root package name */
    private final String f24333g;

    /* renamed from: h, reason: collision with root package name */
    private final e f24334h;

    /* renamed from: i, reason: collision with root package name */
    private final String f24335i;

    /* renamed from: j, reason: collision with root package name */
    private final long f24336j;

    /* renamed from: k, reason: collision with root package name */
    private final String f24337k;

    /* renamed from: l, reason: collision with root package name */
    private final String f24338l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f24339m;

    /* renamed from: n, reason: collision with root package name */
    private final o f24340n;

    /* renamed from: o, reason: collision with root package name */
    private final String f24341o;

    /* renamed from: p, reason: collision with root package name */
    private final String f24342p;

    /* renamed from: q, reason: collision with root package name */
    private final StripeIntent.Status f24343q;

    /* renamed from: r, reason: collision with root package name */
    private final StripeIntent.Usage f24344r;

    /* renamed from: s, reason: collision with root package name */
    private final g f24345s;

    /* renamed from: t, reason: collision with root package name */
    private final h f24346t;

    /* renamed from: u, reason: collision with root package name */
    private final List f24347u;

    /* renamed from: v, reason: collision with root package name */
    private final List f24348v;

    /* renamed from: w, reason: collision with root package name */
    private final StripeIntent.a f24349w;

    /* renamed from: x, reason: collision with root package name */
    private final String f24350x;

    /* renamed from: y, reason: collision with root package name */
    public static final d f24325y = new d(null);

    /* renamed from: z, reason: collision with root package name */
    public static final int f24326z = 8;
    public static final Parcelable.Creator<n> CREATOR = new f();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0514a f24351b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f24352c = new a("Duplicate", 0, "duplicate");

        /* renamed from: d, reason: collision with root package name */
        public static final a f24353d = new a("Fraudulent", 1, "fraudulent");

        /* renamed from: e, reason: collision with root package name */
        public static final a f24354e = new a("RequestedByCustomer", 2, "requested_by_customer");

        /* renamed from: f, reason: collision with root package name */
        public static final a f24355f = new a("Abandoned", 3, "abandoned");

        /* renamed from: g, reason: collision with root package name */
        public static final a f24356g = new a("FailedInvoice", 4, "failed_invoice");

        /* renamed from: h, reason: collision with root package name */
        public static final a f24357h = new a("VoidInvoice", 5, "void_invoice");

        /* renamed from: i, reason: collision with root package name */
        public static final a f24358i = new a("Automatic", 6, "automatic");

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ a[] f24359j;

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ R5.a f24360k;

        /* renamed from: a, reason: collision with root package name */
        private final String f24361a;

        /* renamed from: com.stripe.android.model.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0514a {
            private C0514a() {
            }

            public final a a(String str) {
                Object obj;
                Iterator<E> it = a.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3159y.d(((a) obj).f24361a, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (a) obj;
            }

            public /* synthetic */ C0514a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        static {
            a[] a8 = a();
            f24359j = a8;
            f24360k = R5.b.a(a8);
            f24351b = new C0514a(null);
        }

        private a(String str, int i8, String str2) {
            this.f24361a = str2;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f24352c, f24353d, f24354e, f24355f, f24356g, f24357h, f24358i};
        }

        public static R5.a c() {
            return f24360k;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f24359j.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final a f24362b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f24363c = new b("Automatic", 0, "automatic");

        /* renamed from: d, reason: collision with root package name */
        public static final b f24364d = new b("AutomaticAsync", 1, "automatic_async");

        /* renamed from: e, reason: collision with root package name */
        public static final b f24365e = new b("Manual", 2, "manual");

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ b[] f24366f;

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ R5.a f24367g;

        /* renamed from: a, reason: collision with root package name */
        private final String f24368a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final b a(String str) {
                Object obj;
                Iterator<E> it = b.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3159y.d(((b) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                b bVar = (b) obj;
                if (bVar == null) {
                    return b.f24363c;
                }
                return bVar;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        static {
            b[] a8 = a();
            f24366f = a8;
            f24367g = R5.b.a(a8);
            f24362b = new a(null);
        }

        private b(String str, int i8, String str2) {
            this.f24368a = str2;
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f24363c, f24364d, f24365e};
        }

        public static R5.a c() {
            return f24367g;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f24366f.clone();
        }

        public final String b() {
            return this.f24368a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final a f24369c = new a(null);

        /* renamed from: d, reason: collision with root package name */
        private static final Pattern f24370d = Pattern.compile("^pi_[^_]+_secret_[^_]+$");

        /* renamed from: a, reason: collision with root package name */
        private final String f24371a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24372b;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final boolean a(String value) {
                AbstractC3159y.i(value, "value");
                return c.f24370d.matcher(value).matches();
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        public c(String value) {
            List m8;
            AbstractC3159y.i(value, "value");
            this.f24371a = value;
            List j8 = new g6.j("_secret").j(value, 0);
            if (!j8.isEmpty()) {
                ListIterator listIterator = j8.listIterator(j8.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        m8 = AbstractC1246t.Q0(j8, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            m8 = AbstractC1246t.m();
            this.f24372b = ((String[]) m8.toArray(new String[0]))[0];
            if (f24369c.a(this.f24371a)) {
                return;
            }
            throw new IllegalArgumentException(("Invalid Payment Intent client secret: " + this.f24371a).toString());
        }

        public final String b() {
            return this.f24372b;
        }

        public final String c() {
            return this.f24371a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3159y.d(this.f24371a, ((c) obj).f24371a);
        }

        public int hashCode() {
            return this.f24371a.hashCode();
        }

        public String toString() {
            return "ClientSecret(value=" + this.f24371a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class e {

        /* renamed from: b, reason: collision with root package name */
        public static final a f24373b;

        /* renamed from: c, reason: collision with root package name */
        public static final e f24374c = new e("Automatic", 0, "automatic");

        /* renamed from: d, reason: collision with root package name */
        public static final e f24375d = new e("Manual", 1, "manual");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ e[] f24376e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ R5.a f24377f;

        /* renamed from: a, reason: collision with root package name */
        private final String f24378a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final e a(String str) {
                Object obj;
                Iterator<E> it = e.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3159y.d(((e) obj).f24378a, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                e eVar = (e) obj;
                if (eVar == null) {
                    return e.f24374c;
                }
                return eVar;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        static {
            e[] a8 = a();
            f24376e = a8;
            f24377f = R5.b.a(a8);
            f24373b = new a(null);
        }

        private e(String str, int i8, String str2) {
            this.f24378a = str2;
        }

        private static final /* synthetic */ e[] a() {
            return new e[]{f24374c, f24375d};
        }

        public static R5.a c() {
            return f24377f;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f24376e.clone();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new n(parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong(), parcel.readInt() == 0 ? null : a.valueOf(parcel.readString()), b.valueOf(parcel.readString()), parcel.readString(), e.valueOf(parcel.readString()), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : o.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : StripeIntent.Status.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : StripeIntent.Usage.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : g.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? h.CREATOR.createFromParcel(parcel) : null, parcel.createStringArrayList(), parcel.createStringArrayList(), (StripeIntent.a) parcel.readParcelable(n.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n[] newArray(int i8) {
            return new n[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements v2.f {

        /* renamed from: a, reason: collision with root package name */
        private final String f24381a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24382b;

        /* renamed from: c, reason: collision with root package name */
        private final String f24383c;

        /* renamed from: d, reason: collision with root package name */
        private final String f24384d;

        /* renamed from: e, reason: collision with root package name */
        private final String f24385e;

        /* renamed from: f, reason: collision with root package name */
        private final String f24386f;

        /* renamed from: g, reason: collision with root package name */
        private final o f24387g;

        /* renamed from: h, reason: collision with root package name */
        private final c f24388h;

        /* renamed from: i, reason: collision with root package name */
        public static final a f24379i = new a(null);

        /* renamed from: j, reason: collision with root package name */
        public static final int f24380j = 8;
        public static final Parcelable.Creator<g> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new g(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : o.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g[] newArray(int i8) {
                return new g[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class c {

            /* renamed from: b, reason: collision with root package name */
            public static final a f24389b;

            /* renamed from: c, reason: collision with root package name */
            public static final c f24390c = new c("ApiConnectionError", 0, "api_connection_error");

            /* renamed from: d, reason: collision with root package name */
            public static final c f24391d = new c("ApiError", 1, "api_error");

            /* renamed from: e, reason: collision with root package name */
            public static final c f24392e = new c("AuthenticationError", 2, "authentication_error");

            /* renamed from: f, reason: collision with root package name */
            public static final c f24393f = new c("CardError", 3, "card_error");

            /* renamed from: g, reason: collision with root package name */
            public static final c f24394g = new c("IdempotencyError", 4, "idempotency_error");

            /* renamed from: h, reason: collision with root package name */
            public static final c f24395h = new c("InvalidRequestError", 5, "invalid_request_error");

            /* renamed from: i, reason: collision with root package name */
            public static final c f24396i = new c("RateLimitError", 6, "rate_limit_error");

            /* renamed from: j, reason: collision with root package name */
            private static final /* synthetic */ c[] f24397j;

            /* renamed from: k, reason: collision with root package name */
            private static final /* synthetic */ R5.a f24398k;

            /* renamed from: a, reason: collision with root package name */
            private final String f24399a;

            /* loaded from: classes4.dex */
            public static final class a {
                private a() {
                }

                public final c a(String str) {
                    Object obj;
                    Iterator<E> it = c.c().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (AbstractC3159y.d(((c) obj).b(), str)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    return (c) obj;
                }

                public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                    this();
                }
            }

            static {
                c[] a8 = a();
                f24397j = a8;
                f24398k = R5.b.a(a8);
                f24389b = new a(null);
            }

            private c(String str, int i8, String str2) {
                this.f24399a = str2;
            }

            private static final /* synthetic */ c[] a() {
                return new c[]{f24390c, f24391d, f24392e, f24393f, f24394g, f24395h, f24396i};
            }

            public static R5.a c() {
                return f24398k;
            }

            public static c valueOf(String str) {
                return (c) Enum.valueOf(c.class, str);
            }

            public static c[] values() {
                return (c[]) f24397j.clone();
            }

            public final String b() {
                return this.f24399a;
            }
        }

        public g(String str, String str2, String str3, String str4, String str5, String str6, o oVar, c cVar) {
            this.f24381a = str;
            this.f24382b = str2;
            this.f24383c = str3;
            this.f24384d = str4;
            this.f24385e = str5;
            this.f24386f = str6;
            this.f24387g = oVar;
            this.f24388h = cVar;
        }

        public final g b(String str, String str2, String str3, String str4, String str5, String str6, o oVar, c cVar) {
            return new g(str, str2, str3, str4, str5, str6, oVar, cVar);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f24385e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return AbstractC3159y.d(this.f24381a, gVar.f24381a) && AbstractC3159y.d(this.f24382b, gVar.f24382b) && AbstractC3159y.d(this.f24383c, gVar.f24383c) && AbstractC3159y.d(this.f24384d, gVar.f24384d) && AbstractC3159y.d(this.f24385e, gVar.f24385e) && AbstractC3159y.d(this.f24386f, gVar.f24386f) && AbstractC3159y.d(this.f24387g, gVar.f24387g) && this.f24388h == gVar.f24388h;
        }

        public final c f() {
            return this.f24388h;
        }

        public int hashCode() {
            String str = this.f24381a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f24382b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24383c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f24384d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f24385e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f24386f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            o oVar = this.f24387g;
            int hashCode7 = (hashCode6 + (oVar == null ? 0 : oVar.hashCode())) * 31;
            c cVar = this.f24388h;
            return hashCode7 + (cVar != null ? cVar.hashCode() : 0);
        }

        public final String r() {
            return this.f24382b;
        }

        public String toString() {
            return "Error(charge=" + this.f24381a + ", code=" + this.f24382b + ", declineCode=" + this.f24383c + ", docUrl=" + this.f24384d + ", message=" + this.f24385e + ", param=" + this.f24386f + ", paymentMethod=" + this.f24387g + ", type=" + this.f24388h + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24381a);
            out.writeString(this.f24382b);
            out.writeString(this.f24383c);
            out.writeString(this.f24384d);
            out.writeString(this.f24385e);
            out.writeString(this.f24386f);
            o oVar = this.f24387g;
            if (oVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                oVar.writeToParcel(out, i8);
            }
            c cVar = this.f24388h;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(cVar.name());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements v2.f {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final com.stripe.android.model.a f24400a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24401b;

        /* renamed from: c, reason: collision with root package name */
        private final String f24402c;

        /* renamed from: d, reason: collision with root package name */
        private final String f24403d;

        /* renamed from: e, reason: collision with root package name */
        private final String f24404e;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new h(com.stripe.android.model.a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final h[] newArray(int i8) {
                return new h[i8];
            }
        }

        public h(com.stripe.android.model.a address, String str, String str2, String str3, String str4) {
            AbstractC3159y.i(address, "address");
            this.f24400a = address;
            this.f24401b = str;
            this.f24402c = str2;
            this.f24403d = str3;
            this.f24404e = str4;
        }

        public final com.stripe.android.model.a b() {
            return this.f24400a;
        }

        public final String c() {
            return this.f24402c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return AbstractC3159y.d(this.f24400a, hVar.f24400a) && AbstractC3159y.d(this.f24401b, hVar.f24401b) && AbstractC3159y.d(this.f24402c, hVar.f24402c) && AbstractC3159y.d(this.f24403d, hVar.f24403d) && AbstractC3159y.d(this.f24404e, hVar.f24404e);
        }

        public int hashCode() {
            int hashCode = this.f24400a.hashCode() * 31;
            String str = this.f24401b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f24402c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24403d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f24404e;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "Shipping(address=" + this.f24400a + ", carrier=" + this.f24401b + ", name=" + this.f24402c + ", phone=" + this.f24403d + ", trackingNumber=" + this.f24404e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            this.f24400a.writeToParcel(out, i8);
            out.writeString(this.f24401b);
            out.writeString(this.f24402c);
            out.writeString(this.f24403d);
            out.writeString(this.f24404e);
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class i {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24405a;

        static {
            int[] iArr = new int[StripeIntent.Usage.values().length];
            try {
                iArr[StripeIntent.Usage.f24160c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StripeIntent.Usage.f24161d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StripeIntent.Usage.f24162e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f24405a = iArr;
        }
    }

    public n(String str, List paymentMethodTypes, Long l8, long j8, a aVar, b captureMethod, String str2, e confirmationMethod, String str3, long j9, String str4, String str5, boolean z8, o oVar, String str6, String str7, StripeIntent.Status status, StripeIntent.Usage usage, g gVar, h hVar, List unactivatedPaymentMethods, List linkFundingSources, StripeIntent.a aVar2, String str8) {
        AbstractC3159y.i(paymentMethodTypes, "paymentMethodTypes");
        AbstractC3159y.i(captureMethod, "captureMethod");
        AbstractC3159y.i(confirmationMethod, "confirmationMethod");
        AbstractC3159y.i(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        AbstractC3159y.i(linkFundingSources, "linkFundingSources");
        this.f24327a = str;
        this.f24328b = paymentMethodTypes;
        this.f24329c = l8;
        this.f24330d = j8;
        this.f24331e = aVar;
        this.f24332f = captureMethod;
        this.f24333g = str2;
        this.f24334h = confirmationMethod;
        this.f24335i = str3;
        this.f24336j = j9;
        this.f24337k = str4;
        this.f24338l = str5;
        this.f24339m = z8;
        this.f24340n = oVar;
        this.f24341o = str6;
        this.f24342p = str7;
        this.f24343q = status;
        this.f24344r = usage;
        this.f24345s = gVar;
        this.f24346t = hVar;
        this.f24347u = unactivatedPaymentMethods;
        this.f24348v = linkFundingSources;
        this.f24349w = aVar2;
        this.f24350x = str8;
    }

    private final boolean n(String str) {
        JSONObject optJSONObject;
        String str2 = this.f24350x;
        if (str2 == null || (optJSONObject = new JSONObject(str2).optJSONObject(str)) == null) {
            return false;
        }
        return optJSONObject.has("setup_future_usage");
    }

    private final boolean s() {
        int i8;
        StripeIntent.Usage usage = this.f24344r;
        if (usage == null) {
            i8 = -1;
        } else {
            i8 = i.f24405a[usage.ordinal()];
        }
        if (i8 == -1) {
            return false;
        }
        if (i8 != 1 && i8 != 2) {
            if (i8 == 3) {
                return false;
            }
            throw new L5.p();
        }
        return true;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List D() {
        return this.f24347u;
    }

    public final StripeIntent.Usage E() {
        return this.f24344r;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List H() {
        return this.f24348v;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean J() {
        return AbstractC1246t.d0(a0.i(StripeIntent.Status.f24150d, StripeIntent.Status.f24155i, StripeIntent.Status.f24154h), getStatus());
    }

    public final String K() {
        return this.f24337k;
    }

    @Override // com.stripe.android.model.StripeIntent
    public Map N() {
        Map b8;
        String str = this.f24350x;
        if (str == null || (b8 = v2.e.f38789a.b(new JSONObject(str))) == null) {
            return Q.h();
        }
        return b8;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean a() {
        return this.f24339m;
    }

    public final n b(String str, List paymentMethodTypes, Long l8, long j8, a aVar, b captureMethod, String str2, e confirmationMethod, String str3, long j9, String str4, String str5, boolean z8, o oVar, String str6, String str7, StripeIntent.Status status, StripeIntent.Usage usage, g gVar, h hVar, List unactivatedPaymentMethods, List linkFundingSources, StripeIntent.a aVar2, String str8) {
        AbstractC3159y.i(paymentMethodTypes, "paymentMethodTypes");
        AbstractC3159y.i(captureMethod, "captureMethod");
        AbstractC3159y.i(confirmationMethod, "confirmationMethod");
        AbstractC3159y.i(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        AbstractC3159y.i(linkFundingSources, "linkFundingSources");
        return new n(str, paymentMethodTypes, l8, j8, aVar, captureMethod, str2, confirmationMethod, str3, j9, str4, str5, z8, oVar, str6, str7, status, usage, gVar, hVar, unactivatedPaymentMethods, linkFundingSources, aVar2, str8);
    }

    @Override // com.stripe.android.model.StripeIntent
    public String d() {
        return this.f24333g;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Long e() {
        return this.f24329c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return AbstractC3159y.d(this.f24327a, nVar.f24327a) && AbstractC3159y.d(this.f24328b, nVar.f24328b) && AbstractC3159y.d(this.f24329c, nVar.f24329c) && this.f24330d == nVar.f24330d && this.f24331e == nVar.f24331e && this.f24332f == nVar.f24332f && AbstractC3159y.d(this.f24333g, nVar.f24333g) && this.f24334h == nVar.f24334h && AbstractC3159y.d(this.f24335i, nVar.f24335i) && this.f24336j == nVar.f24336j && AbstractC3159y.d(this.f24337k, nVar.f24337k) && AbstractC3159y.d(this.f24338l, nVar.f24338l) && this.f24339m == nVar.f24339m && AbstractC3159y.d(this.f24340n, nVar.f24340n) && AbstractC3159y.d(this.f24341o, nVar.f24341o) && AbstractC3159y.d(this.f24342p, nVar.f24342p) && this.f24343q == nVar.f24343q && this.f24344r == nVar.f24344r && AbstractC3159y.d(this.f24345s, nVar.f24345s) && AbstractC3159y.d(this.f24346t, nVar.f24346t) && AbstractC3159y.d(this.f24347u, nVar.f24347u) && AbstractC3159y.d(this.f24348v, nVar.f24348v) && AbstractC3159y.d(this.f24349w, nVar.f24349w) && AbstractC3159y.d(this.f24350x, nVar.f24350x);
    }

    public final e f() {
        return this.f24334h;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List g() {
        return this.f24328b;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getId() {
        return this.f24327a;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.Status getStatus() {
        return this.f24343q;
    }

    public int hashCode() {
        String str = this.f24327a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f24328b.hashCode()) * 31;
        Long l8 = this.f24329c;
        int hashCode2 = (((hashCode + (l8 == null ? 0 : l8.hashCode())) * 31) + androidx.collection.a.a(this.f24330d)) * 31;
        a aVar = this.f24331e;
        int hashCode3 = (((hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f24332f.hashCode()) * 31;
        String str2 = this.f24333g;
        int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f24334h.hashCode()) * 31;
        String str3 = this.f24335i;
        int hashCode5 = (((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + androidx.collection.a.a(this.f24336j)) * 31;
        String str4 = this.f24337k;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f24338l;
        int hashCode7 = (((hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f24339m)) * 31;
        o oVar = this.f24340n;
        int hashCode8 = (hashCode7 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        String str6 = this.f24341o;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f24342p;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        StripeIntent.Status status = this.f24343q;
        int hashCode11 = (hashCode10 + (status == null ? 0 : status.hashCode())) * 31;
        StripeIntent.Usage usage = this.f24344r;
        int hashCode12 = (hashCode11 + (usage == null ? 0 : usage.hashCode())) * 31;
        g gVar = this.f24345s;
        int hashCode13 = (hashCode12 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        h hVar = this.f24346t;
        int hashCode14 = (((((hashCode13 + (hVar == null ? 0 : hVar.hashCode())) * 31) + this.f24347u.hashCode()) * 31) + this.f24348v.hashCode()) * 31;
        StripeIntent.a aVar2 = this.f24349w;
        int hashCode15 = (hashCode14 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str8 = this.f24350x;
        return hashCode15 + (str8 != null ? str8.hashCode() : 0);
    }

    public final g i() {
        return this.f24345s;
    }

    public final boolean j() {
        JSONObject optJSONObject;
        String str = this.f24350x;
        if (str == null || (optJSONObject = new JSONObject(str).optJSONObject("card")) == null) {
            return false;
        }
        return optJSONObject.optBoolean("require_cvc_recollection");
    }

    public final h k() {
        return this.f24346t;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.a l() {
        return this.f24349w;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.NextActionType m() {
        boolean z8;
        StripeIntent.a l8 = l();
        if (l8 instanceof StripeIntent.a.j) {
            return StripeIntent.NextActionType.f24133d;
        }
        if (l8 instanceof StripeIntent.a.i) {
            return StripeIntent.NextActionType.f24132c;
        }
        if (l8 instanceof StripeIntent.a.g) {
            return StripeIntent.NextActionType.f24134e;
        }
        if (l8 instanceof StripeIntent.a.d) {
            return StripeIntent.NextActionType.f24141l;
        }
        if (l8 instanceof StripeIntent.a.e) {
            return StripeIntent.NextActionType.f24142m;
        }
        if (l8 instanceof StripeIntent.a.f) {
            return StripeIntent.NextActionType.f24143n;
        }
        if (l8 instanceof StripeIntent.a.m) {
            return StripeIntent.NextActionType.f24138i;
        }
        if (l8 instanceof StripeIntent.a.l) {
            return StripeIntent.NextActionType.f24139j;
        }
        if (l8 instanceof StripeIntent.a.c) {
            return StripeIntent.NextActionType.f24140k;
        }
        if (l8 instanceof StripeIntent.a.b) {
            return StripeIntent.NextActionType.f24136g;
        }
        if (l8 instanceof StripeIntent.a.k) {
            return StripeIntent.NextActionType.f24144o;
        }
        boolean z9 = true;
        if (l8 instanceof StripeIntent.a.C0480a) {
            z8 = true;
        } else {
            z8 = l8 instanceof StripeIntent.a.n;
        }
        if (!z8 && l8 != null) {
            z9 = false;
        }
        if (z9) {
            return null;
        }
        throw new L5.p();
    }

    public final boolean o(String code) {
        AbstractC3159y.i(code, "code");
        if (!s() && !n(code)) {
            return false;
        }
        return true;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String p() {
        return this.f24335i;
    }

    public String toString() {
        return "PaymentIntent(id=" + this.f24327a + ", paymentMethodTypes=" + this.f24328b + ", amount=" + this.f24329c + ", canceledAt=" + this.f24330d + ", cancellationReason=" + this.f24331e + ", captureMethod=" + this.f24332f + ", clientSecret=" + this.f24333g + ", confirmationMethod=" + this.f24334h + ", countryCode=" + this.f24335i + ", created=" + this.f24336j + ", currency=" + this.f24337k + ", description=" + this.f24338l + ", isLiveMode=" + this.f24339m + ", paymentMethod=" + this.f24340n + ", paymentMethodId=" + this.f24341o + ", receiptEmail=" + this.f24342p + ", status=" + this.f24343q + ", setupFutureUsage=" + this.f24344r + ", lastPaymentError=" + this.f24345s + ", shipping=" + this.f24346t + ", unactivatedPaymentMethods=" + this.f24347u + ", linkFundingSources=" + this.f24348v + ", nextActionData=" + this.f24349w + ", paymentMethodOptionsJsonString=" + this.f24350x + ")";
    }

    @Override // com.stripe.android.model.StripeIntent
    public o v() {
        return this.f24340n;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean w() {
        if (getStatus() == StripeIntent.Status.f24151e) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f24327a);
        out.writeStringList(this.f24328b);
        Long l8 = this.f24329c;
        if (l8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l8.longValue());
        }
        out.writeLong(this.f24330d);
        a aVar = this.f24331e;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(aVar.name());
        }
        out.writeString(this.f24332f.name());
        out.writeString(this.f24333g);
        out.writeString(this.f24334h.name());
        out.writeString(this.f24335i);
        out.writeLong(this.f24336j);
        out.writeString(this.f24337k);
        out.writeString(this.f24338l);
        out.writeInt(this.f24339m ? 1 : 0);
        o oVar = this.f24340n;
        if (oVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            oVar.writeToParcel(out, i8);
        }
        out.writeString(this.f24341o);
        out.writeString(this.f24342p);
        StripeIntent.Status status = this.f24343q;
        if (status == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(status.name());
        }
        StripeIntent.Usage usage = this.f24344r;
        if (usage == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(usage.name());
        }
        g gVar = this.f24345s;
        if (gVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            gVar.writeToParcel(out, i8);
        }
        h hVar = this.f24346t;
        if (hVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            hVar.writeToParcel(out, i8);
        }
        out.writeStringList(this.f24347u);
        out.writeStringList(this.f24348v);
        out.writeParcelable(this.f24349w, i8);
        out.writeString(this.f24350x);
    }

    public /* synthetic */ n(String str, List list, Long l8, long j8, a aVar, b bVar, String str2, e eVar, String str3, long j9, String str4, String str5, boolean z8, o oVar, String str6, String str7, StripeIntent.Status status, StripeIntent.Usage usage, g gVar, h hVar, List list2, List list3, StripeIntent.a aVar2, String str8, int i8, AbstractC3151p abstractC3151p) {
        this(str, list, l8, (i8 & 8) != 0 ? 0L : j8, (i8 & 16) != 0 ? null : aVar, (i8 & 32) != 0 ? b.f24363c : bVar, str2, (i8 & 128) != 0 ? e.f24374c : eVar, str3, j9, str4, (i8 & 2048) != 0 ? null : str5, z8, (i8 & 8192) != 0 ? null : oVar, (i8 & 16384) != 0 ? null : str6, (32768 & i8) != 0 ? null : str7, (65536 & i8) != 0 ? null : status, (131072 & i8) != 0 ? null : usage, (262144 & i8) != 0 ? null : gVar, (524288 & i8) != 0 ? null : hVar, list2, (2097152 & i8) != 0 ? AbstractC1246t.m() : list3, (4194304 & i8) != 0 ? null : aVar2, (i8 & 8388608) != 0 ? null : str8);
    }
}
