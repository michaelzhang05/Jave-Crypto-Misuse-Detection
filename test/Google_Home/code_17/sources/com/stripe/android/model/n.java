package com.stripe.android.model;

import P5.AbstractC1378t;
import P5.Q;
import P5.a0;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.StripeIntent;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class n implements StripeIntent {

    /* renamed from: a, reason: collision with root package name */
    private final String f25382a;

    /* renamed from: b, reason: collision with root package name */
    private final List f25383b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f25384c;

    /* renamed from: d, reason: collision with root package name */
    private final long f25385d;

    /* renamed from: e, reason: collision with root package name */
    private final a f25386e;

    /* renamed from: f, reason: collision with root package name */
    private final b f25387f;

    /* renamed from: g, reason: collision with root package name */
    private final String f25388g;

    /* renamed from: h, reason: collision with root package name */
    private final e f25389h;

    /* renamed from: i, reason: collision with root package name */
    private final String f25390i;

    /* renamed from: j, reason: collision with root package name */
    private final long f25391j;

    /* renamed from: k, reason: collision with root package name */
    private final String f25392k;

    /* renamed from: l, reason: collision with root package name */
    private final String f25393l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f25394m;

    /* renamed from: n, reason: collision with root package name */
    private final o f25395n;

    /* renamed from: o, reason: collision with root package name */
    private final String f25396o;

    /* renamed from: p, reason: collision with root package name */
    private final String f25397p;

    /* renamed from: q, reason: collision with root package name */
    private final StripeIntent.Status f25398q;

    /* renamed from: r, reason: collision with root package name */
    private final StripeIntent.Usage f25399r;

    /* renamed from: s, reason: collision with root package name */
    private final g f25400s;

    /* renamed from: t, reason: collision with root package name */
    private final h f25401t;

    /* renamed from: u, reason: collision with root package name */
    private final List f25402u;

    /* renamed from: v, reason: collision with root package name */
    private final List f25403v;

    /* renamed from: w, reason: collision with root package name */
    private final StripeIntent.a f25404w;

    /* renamed from: x, reason: collision with root package name */
    private final String f25405x;

    /* renamed from: y, reason: collision with root package name */
    public static final d f25380y = new d(null);

    /* renamed from: z, reason: collision with root package name */
    public static final int f25381z = 8;
    public static final Parcelable.Creator<n> CREATOR = new f();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0510a f25406b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f25407c = new a("Duplicate", 0, "duplicate");

        /* renamed from: d, reason: collision with root package name */
        public static final a f25408d = new a("Fraudulent", 1, "fraudulent");

        /* renamed from: e, reason: collision with root package name */
        public static final a f25409e = new a("RequestedByCustomer", 2, "requested_by_customer");

        /* renamed from: f, reason: collision with root package name */
        public static final a f25410f = new a("Abandoned", 3, "abandoned");

        /* renamed from: g, reason: collision with root package name */
        public static final a f25411g = new a("FailedInvoice", 4, "failed_invoice");

        /* renamed from: h, reason: collision with root package name */
        public static final a f25412h = new a("VoidInvoice", 5, "void_invoice");

        /* renamed from: i, reason: collision with root package name */
        public static final a f25413i = new a("Automatic", 6, "automatic");

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ a[] f25414j;

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ U5.a f25415k;

        /* renamed from: a, reason: collision with root package name */
        private final String f25416a;

        /* renamed from: com.stripe.android.model.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0510a {
            private C0510a() {
            }

            public final a a(String str) {
                Object obj;
                Iterator<E> it = a.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3255y.d(((a) obj).f25416a, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (a) obj;
            }

            public /* synthetic */ C0510a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        static {
            a[] a8 = a();
            f25414j = a8;
            f25415k = U5.b.a(a8);
            f25406b = new C0510a(null);
        }

        private a(String str, int i8, String str2) {
            this.f25416a = str2;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f25407c, f25408d, f25409e, f25410f, f25411g, f25412h, f25413i};
        }

        public static U5.a c() {
            return f25415k;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f25414j.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final a f25417b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f25418c = new b("Automatic", 0, "automatic");

        /* renamed from: d, reason: collision with root package name */
        public static final b f25419d = new b("AutomaticAsync", 1, "automatic_async");

        /* renamed from: e, reason: collision with root package name */
        public static final b f25420e = new b("Manual", 2, "manual");

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ b[] f25421f;

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ U5.a f25422g;

        /* renamed from: a, reason: collision with root package name */
        private final String f25423a;

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
                        if (AbstractC3255y.d(((b) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                b bVar = (b) obj;
                if (bVar == null) {
                    return b.f25418c;
                }
                return bVar;
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        static {
            b[] a8 = a();
            f25421f = a8;
            f25422g = U5.b.a(a8);
            f25417b = new a(null);
        }

        private b(String str, int i8, String str2) {
            this.f25423a = str2;
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f25418c, f25419d, f25420e};
        }

        public static U5.a c() {
            return f25422g;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f25421f.clone();
        }

        public final String b() {
            return this.f25423a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final a f25424c = new a(null);

        /* renamed from: d, reason: collision with root package name */
        private static final Pattern f25425d = Pattern.compile("^pi_[^_]+_secret_[^_]+$");

        /* renamed from: a, reason: collision with root package name */
        private final String f25426a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25427b;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final boolean a(String value) {
                AbstractC3255y.i(value, "value");
                return c.f25425d.matcher(value).matches();
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        public c(String value) {
            List m8;
            AbstractC3255y.i(value, "value");
            this.f25426a = value;
            List i8 = new j6.j("_secret").i(value, 0);
            if (!i8.isEmpty()) {
                ListIterator listIterator = i8.listIterator(i8.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        m8 = AbstractC1378t.Q0(i8, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            m8 = AbstractC1378t.m();
            this.f25427b = ((String[]) m8.toArray(new String[0]))[0];
            if (f25424c.a(this.f25426a)) {
                return;
            }
            throw new IllegalArgumentException(("Invalid Payment Intent client secret: " + this.f25426a).toString());
        }

        public final String b() {
            return this.f25427b;
        }

        public final String c() {
            return this.f25426a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3255y.d(this.f25426a, ((c) obj).f25426a);
        }

        public int hashCode() {
            return this.f25426a.hashCode();
        }

        public String toString() {
            return "ClientSecret(value=" + this.f25426a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class e {

        /* renamed from: b, reason: collision with root package name */
        public static final a f25428b;

        /* renamed from: c, reason: collision with root package name */
        public static final e f25429c = new e("Automatic", 0, "automatic");

        /* renamed from: d, reason: collision with root package name */
        public static final e f25430d = new e("Manual", 1, "manual");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ e[] f25431e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ U5.a f25432f;

        /* renamed from: a, reason: collision with root package name */
        private final String f25433a;

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
                        if (AbstractC3255y.d(((e) obj).f25433a, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                e eVar = (e) obj;
                if (eVar == null) {
                    return e.f25429c;
                }
                return eVar;
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        static {
            e[] a8 = a();
            f25431e = a8;
            f25432f = U5.b.a(a8);
            f25428b = new a(null);
        }

        private e(String str, int i8, String str2) {
            this.f25433a = str2;
        }

        private static final /* synthetic */ e[] a() {
            return new e[]{f25429c, f25430d};
        }

        public static U5.a c() {
            return f25432f;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f25431e.clone();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new n(parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong(), parcel.readInt() == 0 ? null : a.valueOf(parcel.readString()), b.valueOf(parcel.readString()), parcel.readString(), e.valueOf(parcel.readString()), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : o.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : StripeIntent.Status.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : StripeIntent.Usage.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : g.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? h.CREATOR.createFromParcel(parcel) : null, parcel.createStringArrayList(), parcel.createStringArrayList(), (StripeIntent.a) parcel.readParcelable(n.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n[] newArray(int i8) {
            return new n[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements y2.f {

        /* renamed from: a, reason: collision with root package name */
        private final String f25436a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25437b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25438c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25439d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25440e;

        /* renamed from: f, reason: collision with root package name */
        private final String f25441f;

        /* renamed from: g, reason: collision with root package name */
        private final o f25442g;

        /* renamed from: h, reason: collision with root package name */
        private final c f25443h;

        /* renamed from: i, reason: collision with root package name */
        public static final a f25434i = new a(null);

        /* renamed from: j, reason: collision with root package name */
        public static final int f25435j = 8;
        public static final Parcelable.Creator<g> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
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
            public static final a f25444b;

            /* renamed from: c, reason: collision with root package name */
            public static final c f25445c = new c("ApiConnectionError", 0, "api_connection_error");

            /* renamed from: d, reason: collision with root package name */
            public static final c f25446d = new c("ApiError", 1, "api_error");

            /* renamed from: e, reason: collision with root package name */
            public static final c f25447e = new c("AuthenticationError", 2, "authentication_error");

            /* renamed from: f, reason: collision with root package name */
            public static final c f25448f = new c("CardError", 3, "card_error");

            /* renamed from: g, reason: collision with root package name */
            public static final c f25449g = new c("IdempotencyError", 4, "idempotency_error");

            /* renamed from: h, reason: collision with root package name */
            public static final c f25450h = new c("InvalidRequestError", 5, "invalid_request_error");

            /* renamed from: i, reason: collision with root package name */
            public static final c f25451i = new c("RateLimitError", 6, "rate_limit_error");

            /* renamed from: j, reason: collision with root package name */
            private static final /* synthetic */ c[] f25452j;

            /* renamed from: k, reason: collision with root package name */
            private static final /* synthetic */ U5.a f25453k;

            /* renamed from: a, reason: collision with root package name */
            private final String f25454a;

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
                            if (AbstractC3255y.d(((c) obj).b(), str)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    return (c) obj;
                }

                public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                    this();
                }
            }

            static {
                c[] a8 = a();
                f25452j = a8;
                f25453k = U5.b.a(a8);
                f25444b = new a(null);
            }

            private c(String str, int i8, String str2) {
                this.f25454a = str2;
            }

            private static final /* synthetic */ c[] a() {
                return new c[]{f25445c, f25446d, f25447e, f25448f, f25449g, f25450h, f25451i};
            }

            public static U5.a c() {
                return f25453k;
            }

            public static c valueOf(String str) {
                return (c) Enum.valueOf(c.class, str);
            }

            public static c[] values() {
                return (c[]) f25452j.clone();
            }

            public final String b() {
                return this.f25454a;
            }
        }

        public g(String str, String str2, String str3, String str4, String str5, String str6, o oVar, c cVar) {
            this.f25436a = str;
            this.f25437b = str2;
            this.f25438c = str3;
            this.f25439d = str4;
            this.f25440e = str5;
            this.f25441f = str6;
            this.f25442g = oVar;
            this.f25443h = cVar;
        }

        public final g a(String str, String str2, String str3, String str4, String str5, String str6, o oVar, c cVar) {
            return new g(str, str2, str3, str4, str5, str6, oVar, cVar);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return AbstractC3255y.d(this.f25436a, gVar.f25436a) && AbstractC3255y.d(this.f25437b, gVar.f25437b) && AbstractC3255y.d(this.f25438c, gVar.f25438c) && AbstractC3255y.d(this.f25439d, gVar.f25439d) && AbstractC3255y.d(this.f25440e, gVar.f25440e) && AbstractC3255y.d(this.f25441f, gVar.f25441f) && AbstractC3255y.d(this.f25442g, gVar.f25442g) && this.f25443h == gVar.f25443h;
        }

        public final String g() {
            return this.f25440e;
        }

        public final c h() {
            return this.f25443h;
        }

        public int hashCode() {
            String str = this.f25436a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f25437b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25438c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f25439d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f25440e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f25441f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            o oVar = this.f25442g;
            int hashCode7 = (hashCode6 + (oVar == null ? 0 : oVar.hashCode())) * 31;
            c cVar = this.f25443h;
            return hashCode7 + (cVar != null ? cVar.hashCode() : 0);
        }

        public final String o() {
            return this.f25437b;
        }

        public String toString() {
            return "Error(charge=" + this.f25436a + ", code=" + this.f25437b + ", declineCode=" + this.f25438c + ", docUrl=" + this.f25439d + ", message=" + this.f25440e + ", param=" + this.f25441f + ", paymentMethod=" + this.f25442g + ", type=" + this.f25443h + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25436a);
            out.writeString(this.f25437b);
            out.writeString(this.f25438c);
            out.writeString(this.f25439d);
            out.writeString(this.f25440e);
            out.writeString(this.f25441f);
            o oVar = this.f25442g;
            if (oVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                oVar.writeToParcel(out, i8);
            }
            c cVar = this.f25443h;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(cVar.name());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements y2.f {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final com.stripe.android.model.a f25455a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25456b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25457c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25458d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25459e;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new h(com.stripe.android.model.a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final h[] newArray(int i8) {
                return new h[i8];
            }
        }

        public h(com.stripe.android.model.a address, String str, String str2, String str3, String str4) {
            AbstractC3255y.i(address, "address");
            this.f25455a = address;
            this.f25456b = str;
            this.f25457c = str2;
            this.f25458d = str3;
            this.f25459e = str4;
        }

        public final com.stripe.android.model.a a() {
            return this.f25455a;
        }

        public final String b() {
            return this.f25457c;
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
            return AbstractC3255y.d(this.f25455a, hVar.f25455a) && AbstractC3255y.d(this.f25456b, hVar.f25456b) && AbstractC3255y.d(this.f25457c, hVar.f25457c) && AbstractC3255y.d(this.f25458d, hVar.f25458d) && AbstractC3255y.d(this.f25459e, hVar.f25459e);
        }

        public int hashCode() {
            int hashCode = this.f25455a.hashCode() * 31;
            String str = this.f25456b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f25457c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25458d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f25459e;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "Shipping(address=" + this.f25455a + ", carrier=" + this.f25456b + ", name=" + this.f25457c + ", phone=" + this.f25458d + ", trackingNumber=" + this.f25459e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            this.f25455a.writeToParcel(out, i8);
            out.writeString(this.f25456b);
            out.writeString(this.f25457c);
            out.writeString(this.f25458d);
            out.writeString(this.f25459e);
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class i {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25460a;

        static {
            int[] iArr = new int[StripeIntent.Usage.values().length];
            try {
                iArr[StripeIntent.Usage.f25215c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StripeIntent.Usage.f25216d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StripeIntent.Usage.f25217e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25460a = iArr;
        }
    }

    public n(String str, List paymentMethodTypes, Long l8, long j8, a aVar, b captureMethod, String str2, e confirmationMethod, String str3, long j9, String str4, String str5, boolean z8, o oVar, String str6, String str7, StripeIntent.Status status, StripeIntent.Usage usage, g gVar, h hVar, List unactivatedPaymentMethods, List linkFundingSources, StripeIntent.a aVar2, String str8) {
        AbstractC3255y.i(paymentMethodTypes, "paymentMethodTypes");
        AbstractC3255y.i(captureMethod, "captureMethod");
        AbstractC3255y.i(confirmationMethod, "confirmationMethod");
        AbstractC3255y.i(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        AbstractC3255y.i(linkFundingSources, "linkFundingSources");
        this.f25382a = str;
        this.f25383b = paymentMethodTypes;
        this.f25384c = l8;
        this.f25385d = j8;
        this.f25386e = aVar;
        this.f25387f = captureMethod;
        this.f25388g = str2;
        this.f25389h = confirmationMethod;
        this.f25390i = str3;
        this.f25391j = j9;
        this.f25392k = str4;
        this.f25393l = str5;
        this.f25394m = z8;
        this.f25395n = oVar;
        this.f25396o = str6;
        this.f25397p = str7;
        this.f25398q = status;
        this.f25399r = usage;
        this.f25400s = gVar;
        this.f25401t = hVar;
        this.f25402u = unactivatedPaymentMethods;
        this.f25403v = linkFundingSources;
        this.f25404w = aVar2;
        this.f25405x = str8;
    }

    private final boolean s(String str) {
        JSONObject optJSONObject;
        String str2 = this.f25405x;
        if (str2 == null || (optJSONObject = new JSONObject(str2).optJSONObject(str)) == null) {
            return false;
        }
        return optJSONObject.has("setup_future_usage");
    }

    private final boolean v() {
        int i8;
        StripeIntent.Usage usage = this.f25399r;
        if (usage == null) {
            i8 = -1;
        } else {
            i8 = i.f25460a[usage.ordinal()];
        }
        if (i8 == -1) {
            return false;
        }
        if (i8 != 1 && i8 != 2) {
            if (i8 == 3) {
                return false;
            }
            throw new O5.p();
        }
        return true;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List F() {
        return this.f25402u;
    }

    public final StripeIntent.Usage G() {
        return this.f25399r;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List K() {
        return this.f25403v;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean L() {
        return AbstractC1378t.d0(a0.i(StripeIntent.Status.f25205d, StripeIntent.Status.f25210i, StripeIntent.Status.f25209h), getStatus());
    }

    public final String M() {
        return this.f25392k;
    }

    @Override // com.stripe.android.model.StripeIntent
    public Map O() {
        Map b8;
        String str = this.f25405x;
        if (str == null || (b8 = y2.e.f40920a.b(new JSONObject(str))) == null) {
            return Q.h();
        }
        return b8;
    }

    public final n a(String str, List paymentMethodTypes, Long l8, long j8, a aVar, b captureMethod, String str2, e confirmationMethod, String str3, long j9, String str4, String str5, boolean z8, o oVar, String str6, String str7, StripeIntent.Status status, StripeIntent.Usage usage, g gVar, h hVar, List unactivatedPaymentMethods, List linkFundingSources, StripeIntent.a aVar2, String str8) {
        AbstractC3255y.i(paymentMethodTypes, "paymentMethodTypes");
        AbstractC3255y.i(captureMethod, "captureMethod");
        AbstractC3255y.i(confirmationMethod, "confirmationMethod");
        AbstractC3255y.i(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        AbstractC3255y.i(linkFundingSources, "linkFundingSources");
        return new n(str, paymentMethodTypes, l8, j8, aVar, captureMethod, str2, confirmationMethod, str3, j9, str4, str5, z8, oVar, str6, str7, status, usage, gVar, hVar, unactivatedPaymentMethods, linkFundingSources, aVar2, str8);
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean c() {
        return this.f25394m;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String d() {
        return this.f25388g;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List e() {
        return this.f25383b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return AbstractC3255y.d(this.f25382a, nVar.f25382a) && AbstractC3255y.d(this.f25383b, nVar.f25383b) && AbstractC3255y.d(this.f25384c, nVar.f25384c) && this.f25385d == nVar.f25385d && this.f25386e == nVar.f25386e && this.f25387f == nVar.f25387f && AbstractC3255y.d(this.f25388g, nVar.f25388g) && this.f25389h == nVar.f25389h && AbstractC3255y.d(this.f25390i, nVar.f25390i) && this.f25391j == nVar.f25391j && AbstractC3255y.d(this.f25392k, nVar.f25392k) && AbstractC3255y.d(this.f25393l, nVar.f25393l) && this.f25394m == nVar.f25394m && AbstractC3255y.d(this.f25395n, nVar.f25395n) && AbstractC3255y.d(this.f25396o, nVar.f25396o) && AbstractC3255y.d(this.f25397p, nVar.f25397p) && this.f25398q == nVar.f25398q && this.f25399r == nVar.f25399r && AbstractC3255y.d(this.f25400s, nVar.f25400s) && AbstractC3255y.d(this.f25401t, nVar.f25401t) && AbstractC3255y.d(this.f25402u, nVar.f25402u) && AbstractC3255y.d(this.f25403v, nVar.f25403v) && AbstractC3255y.d(this.f25404w, nVar.f25404w) && AbstractC3255y.d(this.f25405x, nVar.f25405x);
    }

    public final Long g() {
        return this.f25384c;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getId() {
        return this.f25382a;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.Status getStatus() {
        return this.f25398q;
    }

    public final e h() {
        return this.f25389h;
    }

    public int hashCode() {
        String str = this.f25382a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f25383b.hashCode()) * 31;
        Long l8 = this.f25384c;
        int hashCode2 = (((hashCode + (l8 == null ? 0 : l8.hashCode())) * 31) + androidx.collection.a.a(this.f25385d)) * 31;
        a aVar = this.f25386e;
        int hashCode3 = (((hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f25387f.hashCode()) * 31;
        String str2 = this.f25388g;
        int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f25389h.hashCode()) * 31;
        String str3 = this.f25390i;
        int hashCode5 = (((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + androidx.collection.a.a(this.f25391j)) * 31;
        String str4 = this.f25392k;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f25393l;
        int hashCode7 = (((hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f25394m)) * 31;
        o oVar = this.f25395n;
        int hashCode8 = (hashCode7 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        String str6 = this.f25396o;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f25397p;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        StripeIntent.Status status = this.f25398q;
        int hashCode11 = (hashCode10 + (status == null ? 0 : status.hashCode())) * 31;
        StripeIntent.Usage usage = this.f25399r;
        int hashCode12 = (hashCode11 + (usage == null ? 0 : usage.hashCode())) * 31;
        g gVar = this.f25400s;
        int hashCode13 = (hashCode12 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        h hVar = this.f25401t;
        int hashCode14 = (((((hashCode13 + (hVar == null ? 0 : hVar.hashCode())) * 31) + this.f25402u.hashCode()) * 31) + this.f25403v.hashCode()) * 31;
        StripeIntent.a aVar2 = this.f25404w;
        int hashCode15 = (hashCode14 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str8 = this.f25405x;
        return hashCode15 + (str8 != null ? str8.hashCode() : 0);
    }

    public final g i() {
        return this.f25400s;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.a j() {
        return this.f25404w;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.NextActionType k() {
        boolean z8;
        StripeIntent.a j8 = j();
        if (j8 instanceof StripeIntent.a.j) {
            return StripeIntent.NextActionType.f25188d;
        }
        if (j8 instanceof StripeIntent.a.i) {
            return StripeIntent.NextActionType.f25187c;
        }
        if (j8 instanceof StripeIntent.a.g) {
            return StripeIntent.NextActionType.f25189e;
        }
        if (j8 instanceof StripeIntent.a.d) {
            return StripeIntent.NextActionType.f25196l;
        }
        if (j8 instanceof StripeIntent.a.e) {
            return StripeIntent.NextActionType.f25197m;
        }
        if (j8 instanceof StripeIntent.a.f) {
            return StripeIntent.NextActionType.f25198n;
        }
        if (j8 instanceof StripeIntent.a.m) {
            return StripeIntent.NextActionType.f25193i;
        }
        if (j8 instanceof StripeIntent.a.l) {
            return StripeIntent.NextActionType.f25194j;
        }
        if (j8 instanceof StripeIntent.a.c) {
            return StripeIntent.NextActionType.f25195k;
        }
        if (j8 instanceof StripeIntent.a.b) {
            return StripeIntent.NextActionType.f25191g;
        }
        if (j8 instanceof StripeIntent.a.k) {
            return StripeIntent.NextActionType.f25199o;
        }
        boolean z9 = true;
        if (j8 instanceof StripeIntent.a.C0476a) {
            z8 = true;
        } else {
            z8 = j8 instanceof StripeIntent.a.n;
        }
        if (!z8 && j8 != null) {
            z9 = false;
        }
        if (z9) {
            return null;
        }
        throw new O5.p();
    }

    public final boolean l() {
        JSONObject optJSONObject;
        String str = this.f25405x;
        if (str == null || (optJSONObject = new JSONObject(str).optJSONObject("card")) == null) {
            return false;
        }
        return optJSONObject.optBoolean("require_cvc_recollection");
    }

    @Override // com.stripe.android.model.StripeIntent
    public String m() {
        return this.f25390i;
    }

    public final h p() {
        return this.f25401t;
    }

    @Override // com.stripe.android.model.StripeIntent
    public o r() {
        return this.f25395n;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean t() {
        if (getStatus() == StripeIntent.Status.f25206e) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "PaymentIntent(id=" + this.f25382a + ", paymentMethodTypes=" + this.f25383b + ", amount=" + this.f25384c + ", canceledAt=" + this.f25385d + ", cancellationReason=" + this.f25386e + ", captureMethod=" + this.f25387f + ", clientSecret=" + this.f25388g + ", confirmationMethod=" + this.f25389h + ", countryCode=" + this.f25390i + ", created=" + this.f25391j + ", currency=" + this.f25392k + ", description=" + this.f25393l + ", isLiveMode=" + this.f25394m + ", paymentMethod=" + this.f25395n + ", paymentMethodId=" + this.f25396o + ", receiptEmail=" + this.f25397p + ", status=" + this.f25398q + ", setupFutureUsage=" + this.f25399r + ", lastPaymentError=" + this.f25400s + ", shipping=" + this.f25401t + ", unactivatedPaymentMethods=" + this.f25402u + ", linkFundingSources=" + this.f25403v + ", nextActionData=" + this.f25404w + ", paymentMethodOptionsJsonString=" + this.f25405x + ")";
    }

    public final boolean u(String code) {
        AbstractC3255y.i(code, "code");
        if (!v() && !s(code)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f25382a);
        out.writeStringList(this.f25383b);
        Long l8 = this.f25384c;
        if (l8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l8.longValue());
        }
        out.writeLong(this.f25385d);
        a aVar = this.f25386e;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(aVar.name());
        }
        out.writeString(this.f25387f.name());
        out.writeString(this.f25388g);
        out.writeString(this.f25389h.name());
        out.writeString(this.f25390i);
        out.writeLong(this.f25391j);
        out.writeString(this.f25392k);
        out.writeString(this.f25393l);
        out.writeInt(this.f25394m ? 1 : 0);
        o oVar = this.f25395n;
        if (oVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            oVar.writeToParcel(out, i8);
        }
        out.writeString(this.f25396o);
        out.writeString(this.f25397p);
        StripeIntent.Status status = this.f25398q;
        if (status == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(status.name());
        }
        StripeIntent.Usage usage = this.f25399r;
        if (usage == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(usage.name());
        }
        g gVar = this.f25400s;
        if (gVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            gVar.writeToParcel(out, i8);
        }
        h hVar = this.f25401t;
        if (hVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            hVar.writeToParcel(out, i8);
        }
        out.writeStringList(this.f25402u);
        out.writeStringList(this.f25403v);
        out.writeParcelable(this.f25404w, i8);
        out.writeString(this.f25405x);
    }

    public /* synthetic */ n(String str, List list, Long l8, long j8, a aVar, b bVar, String str2, e eVar, String str3, long j9, String str4, String str5, boolean z8, o oVar, String str6, String str7, StripeIntent.Status status, StripeIntent.Usage usage, g gVar, h hVar, List list2, List list3, StripeIntent.a aVar2, String str8, int i8, AbstractC3247p abstractC3247p) {
        this(str, list, l8, (i8 & 8) != 0 ? 0L : j8, (i8 & 16) != 0 ? null : aVar, (i8 & 32) != 0 ? b.f25418c : bVar, str2, (i8 & 128) != 0 ? e.f25429c : eVar, str3, j9, str4, (i8 & 2048) != 0 ? null : str5, z8, (i8 & 8192) != 0 ? null : oVar, (i8 & 16384) != 0 ? null : str6, (32768 & i8) != 0 ? null : str7, (65536 & i8) != 0 ? null : status, (131072 & i8) != 0 ? null : usage, (262144 & i8) != 0 ? null : gVar, (524288 & i8) != 0 ? null : hVar, list2, (2097152 & i8) != 0 ? AbstractC1378t.m() : list3, (4194304 & i8) != 0 ? null : aVar2, (i8 & 8388608) != 0 ? null : str8);
    }
}
