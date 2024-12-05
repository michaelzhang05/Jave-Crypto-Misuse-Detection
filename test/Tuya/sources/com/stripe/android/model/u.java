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
public final class u implements StripeIntent {

    /* renamed from: a, reason: collision with root package name */
    private final String f24690a;

    /* renamed from: b, reason: collision with root package name */
    private final a f24691b;

    /* renamed from: c, reason: collision with root package name */
    private final long f24692c;

    /* renamed from: d, reason: collision with root package name */
    private final String f24693d;

    /* renamed from: e, reason: collision with root package name */
    private final String f24694e;

    /* renamed from: f, reason: collision with root package name */
    private final String f24695f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f24696g;

    /* renamed from: h, reason: collision with root package name */
    private final o f24697h;

    /* renamed from: i, reason: collision with root package name */
    private final String f24698i;

    /* renamed from: j, reason: collision with root package name */
    private final List f24699j;

    /* renamed from: k, reason: collision with root package name */
    private final StripeIntent.Status f24700k;

    /* renamed from: l, reason: collision with root package name */
    private final StripeIntent.Usage f24701l;

    /* renamed from: m, reason: collision with root package name */
    private final e f24702m;

    /* renamed from: n, reason: collision with root package name */
    private final List f24703n;

    /* renamed from: o, reason: collision with root package name */
    private final List f24704o;

    /* renamed from: p, reason: collision with root package name */
    private final StripeIntent.a f24705p;

    /* renamed from: q, reason: collision with root package name */
    private final String f24706q;

    /* renamed from: r, reason: collision with root package name */
    public static final c f24688r = new c(null);

    /* renamed from: s, reason: collision with root package name */
    public static final int f24689s = 8;
    public static final Parcelable.Creator<u> CREATOR = new d();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0529a f24707b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f24708c = new a("Duplicate", 0, "duplicate");

        /* renamed from: d, reason: collision with root package name */
        public static final a f24709d = new a("RequestedByCustomer", 1, "requested_by_customer");

        /* renamed from: e, reason: collision with root package name */
        public static final a f24710e = new a("Abandoned", 2, "abandoned");

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ a[] f24711f;

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ R5.a f24712g;

        /* renamed from: a, reason: collision with root package name */
        private final String f24713a;

        /* renamed from: com.stripe.android.model.u$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0529a {
            private C0529a() {
            }

            public final a a(String str) {
                Object obj;
                Iterator<E> it = a.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3159y.d(((a) obj).f24713a, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (a) obj;
            }

            public /* synthetic */ C0529a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        static {
            a[] a8 = a();
            f24711f = a8;
            f24712g = R5.b.a(a8);
            f24707b = new C0529a(null);
        }

        private a(String str, int i8, String str2) {
            this.f24713a = str2;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f24708c, f24709d, f24710e};
        }

        public static R5.a c() {
            return f24712g;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f24711f.clone();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final a f24714c = new a(null);

        /* renamed from: d, reason: collision with root package name */
        private static final Pattern f24715d = Pattern.compile("^seti_[^_]+_secret_[^_]+$");

        /* renamed from: a, reason: collision with root package name */
        private final String f24716a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24717b;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final boolean a(String value) {
                AbstractC3159y.i(value, "value");
                return b.f24715d.matcher(value).matches();
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        public b(String value) {
            List m8;
            AbstractC3159y.i(value, "value");
            this.f24716a = value;
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
            this.f24717b = ((String[]) m8.toArray(new String[0]))[0];
            if (f24714c.a(this.f24716a)) {
                return;
            }
            throw new IllegalArgumentException(("Invalid Setup Intent client secret: " + this.f24716a).toString());
        }

        public final String b() {
            return this.f24717b;
        }

        public final String c() {
            return this.f24716a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC3159y.d(this.f24716a, ((b) obj).f24716a);
        }

        public int hashCode() {
            return this.f24716a.hashCode();
        }

        public String toString() {
            return "ClientSecret(value=" + this.f24716a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new u(parcel.readString(), parcel.readInt() == 0 ? null : a.valueOf(parcel.readString()), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : o.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : StripeIntent.Status.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : StripeIntent.Usage.valueOf(parcel.readString()), parcel.readInt() != 0 ? e.CREATOR.createFromParcel(parcel) : null, parcel.createStringArrayList(), parcel.createStringArrayList(), (StripeIntent.a) parcel.readParcelable(u.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final u[] newArray(int i8) {
            return new u[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements v2.f {

        /* renamed from: a, reason: collision with root package name */
        private final String f24720a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24721b;

        /* renamed from: c, reason: collision with root package name */
        private final String f24722c;

        /* renamed from: d, reason: collision with root package name */
        private final String f24723d;

        /* renamed from: e, reason: collision with root package name */
        private final String f24724e;

        /* renamed from: f, reason: collision with root package name */
        private final o f24725f;

        /* renamed from: g, reason: collision with root package name */
        private final c f24726g;

        /* renamed from: h, reason: collision with root package name */
        public static final a f24718h = new a(null);

        /* renamed from: i, reason: collision with root package name */
        public static final int f24719i = 8;
        public static final Parcelable.Creator<e> CREATOR = new b();

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
            public final e createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new e(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : o.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class c {

            /* renamed from: b, reason: collision with root package name */
            public static final a f24727b;

            /* renamed from: c, reason: collision with root package name */
            public static final c f24728c = new c("ApiConnectionError", 0, "api_connection_error");

            /* renamed from: d, reason: collision with root package name */
            public static final c f24729d = new c("ApiError", 1, "api_error");

            /* renamed from: e, reason: collision with root package name */
            public static final c f24730e = new c("AuthenticationError", 2, "authentication_error");

            /* renamed from: f, reason: collision with root package name */
            public static final c f24731f = new c("CardError", 3, "card_error");

            /* renamed from: g, reason: collision with root package name */
            public static final c f24732g = new c("IdempotencyError", 4, "idempotency_error");

            /* renamed from: h, reason: collision with root package name */
            public static final c f24733h = new c("InvalidRequestError", 5, "invalid_request_error");

            /* renamed from: i, reason: collision with root package name */
            public static final c f24734i = new c("RateLimitError", 6, "rate_limit_error");

            /* renamed from: j, reason: collision with root package name */
            private static final /* synthetic */ c[] f24735j;

            /* renamed from: k, reason: collision with root package name */
            private static final /* synthetic */ R5.a f24736k;

            /* renamed from: a, reason: collision with root package name */
            private final String f24737a;

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
                f24735j = a8;
                f24736k = R5.b.a(a8);
                f24727b = new a(null);
            }

            private c(String str, int i8, String str2) {
                this.f24737a = str2;
            }

            private static final /* synthetic */ c[] a() {
                return new c[]{f24728c, f24729d, f24730e, f24731f, f24732g, f24733h, f24734i};
            }

            public static R5.a c() {
                return f24736k;
            }

            public static c valueOf(String str) {
                return (c) Enum.valueOf(c.class, str);
            }

            public static c[] values() {
                return (c[]) f24735j.clone();
            }

            public final String b() {
                return this.f24737a;
            }
        }

        public e(String str, String str2, String str3, String str4, String str5, o oVar, c cVar) {
            this.f24720a = str;
            this.f24721b = str2;
            this.f24722c = str3;
            this.f24723d = str4;
            this.f24724e = str5;
            this.f24725f = oVar;
            this.f24726g = cVar;
        }

        public static /* synthetic */ e c(e eVar, String str, String str2, String str3, String str4, String str5, o oVar, c cVar, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = eVar.f24720a;
            }
            if ((i8 & 2) != 0) {
                str2 = eVar.f24721b;
            }
            String str6 = str2;
            if ((i8 & 4) != 0) {
                str3 = eVar.f24722c;
            }
            String str7 = str3;
            if ((i8 & 8) != 0) {
                str4 = eVar.f24723d;
            }
            String str8 = str4;
            if ((i8 & 16) != 0) {
                str5 = eVar.f24724e;
            }
            String str9 = str5;
            if ((i8 & 32) != 0) {
                oVar = eVar.f24725f;
            }
            o oVar2 = oVar;
            if ((i8 & 64) != 0) {
                cVar = eVar.f24726g;
            }
            return eVar.b(str, str6, str7, str8, str9, oVar2, cVar);
        }

        public final e b(String str, String str2, String str3, String str4, String str5, o oVar, c cVar) {
            return new e(str, str2, str3, str4, str5, oVar, cVar);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f24723d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC3159y.d(this.f24720a, eVar.f24720a) && AbstractC3159y.d(this.f24721b, eVar.f24721b) && AbstractC3159y.d(this.f24722c, eVar.f24722c) && AbstractC3159y.d(this.f24723d, eVar.f24723d) && AbstractC3159y.d(this.f24724e, eVar.f24724e) && AbstractC3159y.d(this.f24725f, eVar.f24725f) && this.f24726g == eVar.f24726g;
        }

        public final c f() {
            return this.f24726g;
        }

        public int hashCode() {
            String str = this.f24720a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f24721b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24722c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f24723d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f24724e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            o oVar = this.f24725f;
            int hashCode6 = (hashCode5 + (oVar == null ? 0 : oVar.hashCode())) * 31;
            c cVar = this.f24726g;
            return hashCode6 + (cVar != null ? cVar.hashCode() : 0);
        }

        public final String r() {
            return this.f24720a;
        }

        public String toString() {
            return "Error(code=" + this.f24720a + ", declineCode=" + this.f24721b + ", docUrl=" + this.f24722c + ", message=" + this.f24723d + ", param=" + this.f24724e + ", paymentMethod=" + this.f24725f + ", type=" + this.f24726g + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24720a);
            out.writeString(this.f24721b);
            out.writeString(this.f24722c);
            out.writeString(this.f24723d);
            out.writeString(this.f24724e);
            o oVar = this.f24725f;
            if (oVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                oVar.writeToParcel(out, i8);
            }
            c cVar = this.f24726g;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(cVar.name());
            }
        }
    }

    public u(String str, a aVar, long j8, String str2, String str3, String str4, boolean z8, o oVar, String str5, List paymentMethodTypes, StripeIntent.Status status, StripeIntent.Usage usage, e eVar, List unactivatedPaymentMethods, List linkFundingSources, StripeIntent.a aVar2, String str6) {
        AbstractC3159y.i(paymentMethodTypes, "paymentMethodTypes");
        AbstractC3159y.i(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        AbstractC3159y.i(linkFundingSources, "linkFundingSources");
        this.f24690a = str;
        this.f24691b = aVar;
        this.f24692c = j8;
        this.f24693d = str2;
        this.f24694e = str3;
        this.f24695f = str4;
        this.f24696g = z8;
        this.f24697h = oVar;
        this.f24698i = str5;
        this.f24699j = paymentMethodTypes;
        this.f24700k = status;
        this.f24701l = usage;
        this.f24702m = eVar;
        this.f24703n = unactivatedPaymentMethods;
        this.f24704o = linkFundingSources;
        this.f24705p = aVar2;
        this.f24706q = str6;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List D() {
        return this.f24703n;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List H() {
        return this.f24704o;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean J() {
        return AbstractC1246t.d0(a0.i(StripeIntent.Status.f24150d, StripeIntent.Status.f24154h), getStatus());
    }

    @Override // com.stripe.android.model.StripeIntent
    public Map N() {
        Map b8;
        String str = this.f24706q;
        if (str == null || (b8 = v2.e.f38789a.b(new JSONObject(str))) == null) {
            return Q.h();
        }
        return b8;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean a() {
        return this.f24696g;
    }

    public final u b(String str, a aVar, long j8, String str2, String str3, String str4, boolean z8, o oVar, String str5, List paymentMethodTypes, StripeIntent.Status status, StripeIntent.Usage usage, e eVar, List unactivatedPaymentMethods, List linkFundingSources, StripeIntent.a aVar2, String str6) {
        AbstractC3159y.i(paymentMethodTypes, "paymentMethodTypes");
        AbstractC3159y.i(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        AbstractC3159y.i(linkFundingSources, "linkFundingSources");
        return new u(str, aVar, j8, str2, str3, str4, z8, oVar, str5, paymentMethodTypes, status, usage, eVar, unactivatedPaymentMethods, linkFundingSources, aVar2, str6);
    }

    @Override // com.stripe.android.model.StripeIntent
    public String d() {
        return this.f24694e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final e e() {
        return this.f24702m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return AbstractC3159y.d(this.f24690a, uVar.f24690a) && this.f24691b == uVar.f24691b && this.f24692c == uVar.f24692c && AbstractC3159y.d(this.f24693d, uVar.f24693d) && AbstractC3159y.d(this.f24694e, uVar.f24694e) && AbstractC3159y.d(this.f24695f, uVar.f24695f) && this.f24696g == uVar.f24696g && AbstractC3159y.d(this.f24697h, uVar.f24697h) && AbstractC3159y.d(this.f24698i, uVar.f24698i) && AbstractC3159y.d(this.f24699j, uVar.f24699j) && this.f24700k == uVar.f24700k && this.f24701l == uVar.f24701l && AbstractC3159y.d(this.f24702m, uVar.f24702m) && AbstractC3159y.d(this.f24703n, uVar.f24703n) && AbstractC3159y.d(this.f24704o, uVar.f24704o) && AbstractC3159y.d(this.f24705p, uVar.f24705p) && AbstractC3159y.d(this.f24706q, uVar.f24706q);
    }

    @Override // com.stripe.android.model.StripeIntent
    public List g() {
        return this.f24699j;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getId() {
        return this.f24690a;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.Status getStatus() {
        return this.f24700k;
    }

    public int hashCode() {
        String str = this.f24690a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        a aVar = this.f24691b;
        int hashCode2 = (((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + androidx.collection.a.a(this.f24692c)) * 31;
        String str2 = this.f24693d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f24694e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f24695f;
        int hashCode5 = (((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f24696g)) * 31;
        o oVar = this.f24697h;
        int hashCode6 = (hashCode5 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        String str5 = this.f24698i;
        int hashCode7 = (((hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f24699j.hashCode()) * 31;
        StripeIntent.Status status = this.f24700k;
        int hashCode8 = (hashCode7 + (status == null ? 0 : status.hashCode())) * 31;
        StripeIntent.Usage usage = this.f24701l;
        int hashCode9 = (hashCode8 + (usage == null ? 0 : usage.hashCode())) * 31;
        e eVar = this.f24702m;
        int hashCode10 = (((((hashCode9 + (eVar == null ? 0 : eVar.hashCode())) * 31) + this.f24703n.hashCode()) * 31) + this.f24704o.hashCode()) * 31;
        StripeIntent.a aVar2 = this.f24705p;
        int hashCode11 = (hashCode10 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str6 = this.f24706q;
        return hashCode11 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.a l() {
        return this.f24705p;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.NextActionType m() {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
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
        if (l8 instanceof StripeIntent.a.c) {
            return StripeIntent.NextActionType.f24140k;
        }
        boolean z12 = true;
        if (l8 instanceof StripeIntent.a.C0480a) {
            z8 = true;
        } else {
            z8 = l8 instanceof StripeIntent.a.b;
        }
        if (z8) {
            z9 = true;
        } else {
            z9 = l8 instanceof StripeIntent.a.n;
        }
        if (z9) {
            z10 = true;
        } else {
            z10 = l8 instanceof StripeIntent.a.l;
        }
        if (z10) {
            z11 = true;
        } else {
            z11 = l8 instanceof StripeIntent.a.k;
        }
        if (!z11 && l8 != null) {
            z12 = false;
        }
        if (z12) {
            return null;
        }
        throw new L5.p();
    }

    @Override // com.stripe.android.model.StripeIntent
    public String p() {
        return this.f24693d;
    }

    public String toString() {
        return "SetupIntent(id=" + this.f24690a + ", cancellationReason=" + this.f24691b + ", created=" + this.f24692c + ", countryCode=" + this.f24693d + ", clientSecret=" + this.f24694e + ", description=" + this.f24695f + ", isLiveMode=" + this.f24696g + ", paymentMethod=" + this.f24697h + ", paymentMethodId=" + this.f24698i + ", paymentMethodTypes=" + this.f24699j + ", status=" + this.f24700k + ", usage=" + this.f24701l + ", lastSetupError=" + this.f24702m + ", unactivatedPaymentMethods=" + this.f24703n + ", linkFundingSources=" + this.f24704o + ", nextActionData=" + this.f24705p + ", paymentMethodOptionsJsonString=" + this.f24706q + ")";
    }

    @Override // com.stripe.android.model.StripeIntent
    public o v() {
        return this.f24697h;
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
        out.writeString(this.f24690a);
        a aVar = this.f24691b;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(aVar.name());
        }
        out.writeLong(this.f24692c);
        out.writeString(this.f24693d);
        out.writeString(this.f24694e);
        out.writeString(this.f24695f);
        out.writeInt(this.f24696g ? 1 : 0);
        o oVar = this.f24697h;
        if (oVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            oVar.writeToParcel(out, i8);
        }
        out.writeString(this.f24698i);
        out.writeStringList(this.f24699j);
        StripeIntent.Status status = this.f24700k;
        if (status == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(status.name());
        }
        StripeIntent.Usage usage = this.f24701l;
        if (usage == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(usage.name());
        }
        e eVar = this.f24702m;
        if (eVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            eVar.writeToParcel(out, i8);
        }
        out.writeStringList(this.f24703n);
        out.writeStringList(this.f24704o);
        out.writeParcelable(this.f24705p, i8);
        out.writeString(this.f24706q);
    }

    public /* synthetic */ u(String str, a aVar, long j8, String str2, String str3, String str4, boolean z8, o oVar, String str5, List list, StripeIntent.Status status, StripeIntent.Usage usage, e eVar, List list2, List list3, StripeIntent.a aVar2, String str6, int i8, AbstractC3151p abstractC3151p) {
        this(str, aVar, j8, str2, str3, str4, z8, (i8 & 128) != 0 ? null : oVar, str5, list, status, usage, (i8 & 4096) != 0 ? null : eVar, list2, list3, aVar2, (i8 & 65536) != 0 ? null : str6);
    }
}
