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
public final class u implements StripeIntent {

    /* renamed from: a, reason: collision with root package name */
    private final String f25745a;

    /* renamed from: b, reason: collision with root package name */
    private final a f25746b;

    /* renamed from: c, reason: collision with root package name */
    private final long f25747c;

    /* renamed from: d, reason: collision with root package name */
    private final String f25748d;

    /* renamed from: e, reason: collision with root package name */
    private final String f25749e;

    /* renamed from: f, reason: collision with root package name */
    private final String f25750f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f25751g;

    /* renamed from: h, reason: collision with root package name */
    private final o f25752h;

    /* renamed from: i, reason: collision with root package name */
    private final String f25753i;

    /* renamed from: j, reason: collision with root package name */
    private final List f25754j;

    /* renamed from: k, reason: collision with root package name */
    private final StripeIntent.Status f25755k;

    /* renamed from: l, reason: collision with root package name */
    private final StripeIntent.Usage f25756l;

    /* renamed from: m, reason: collision with root package name */
    private final e f25757m;

    /* renamed from: n, reason: collision with root package name */
    private final List f25758n;

    /* renamed from: o, reason: collision with root package name */
    private final List f25759o;

    /* renamed from: p, reason: collision with root package name */
    private final StripeIntent.a f25760p;

    /* renamed from: q, reason: collision with root package name */
    private final String f25761q;

    /* renamed from: r, reason: collision with root package name */
    public static final c f25743r = new c(null);

    /* renamed from: s, reason: collision with root package name */
    public static final int f25744s = 8;
    public static final Parcelable.Creator<u> CREATOR = new d();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0525a f25762b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f25763c = new a("Duplicate", 0, "duplicate");

        /* renamed from: d, reason: collision with root package name */
        public static final a f25764d = new a("RequestedByCustomer", 1, "requested_by_customer");

        /* renamed from: e, reason: collision with root package name */
        public static final a f25765e = new a("Abandoned", 2, "abandoned");

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ a[] f25766f;

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ U5.a f25767g;

        /* renamed from: a, reason: collision with root package name */
        private final String f25768a;

        /* renamed from: com.stripe.android.model.u$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0525a {
            private C0525a() {
            }

            public final a a(String str) {
                Object obj;
                Iterator<E> it = a.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3255y.d(((a) obj).f25768a, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (a) obj;
            }

            public /* synthetic */ C0525a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        static {
            a[] a8 = a();
            f25766f = a8;
            f25767g = U5.b.a(a8);
            f25762b = new C0525a(null);
        }

        private a(String str, int i8, String str2) {
            this.f25768a = str2;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f25763c, f25764d, f25765e};
        }

        public static U5.a c() {
            return f25767g;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f25766f.clone();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final a f25769c = new a(null);

        /* renamed from: d, reason: collision with root package name */
        private static final Pattern f25770d = Pattern.compile("^seti_[^_]+_secret_[^_]+$");

        /* renamed from: a, reason: collision with root package name */
        private final String f25771a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25772b;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final boolean a(String value) {
                AbstractC3255y.i(value, "value");
                return b.f25770d.matcher(value).matches();
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        public b(String value) {
            List m8;
            AbstractC3255y.i(value, "value");
            this.f25771a = value;
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
            this.f25772b = ((String[]) m8.toArray(new String[0]))[0];
            if (f25769c.a(this.f25771a)) {
                return;
            }
            throw new IllegalArgumentException(("Invalid Setup Intent client secret: " + this.f25771a).toString());
        }

        public final String b() {
            return this.f25772b;
        }

        public final String c() {
            return this.f25771a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC3255y.d(this.f25771a, ((b) obj).f25771a);
        }

        public int hashCode() {
            return this.f25771a.hashCode();
        }

        public String toString() {
            return "ClientSecret(value=" + this.f25771a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new u(parcel.readString(), parcel.readInt() == 0 ? null : a.valueOf(parcel.readString()), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : o.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : StripeIntent.Status.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : StripeIntent.Usage.valueOf(parcel.readString()), parcel.readInt() != 0 ? e.CREATOR.createFromParcel(parcel) : null, parcel.createStringArrayList(), parcel.createStringArrayList(), (StripeIntent.a) parcel.readParcelable(u.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final u[] newArray(int i8) {
            return new u[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements y2.f {

        /* renamed from: a, reason: collision with root package name */
        private final String f25775a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25776b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25777c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25778d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25779e;

        /* renamed from: f, reason: collision with root package name */
        private final o f25780f;

        /* renamed from: g, reason: collision with root package name */
        private final c f25781g;

        /* renamed from: h, reason: collision with root package name */
        public static final a f25773h = new a(null);

        /* renamed from: i, reason: collision with root package name */
        public static final int f25774i = 8;
        public static final Parcelable.Creator<e> CREATOR = new b();

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
            public final e createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
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
            public static final a f25782b;

            /* renamed from: c, reason: collision with root package name */
            public static final c f25783c = new c("ApiConnectionError", 0, "api_connection_error");

            /* renamed from: d, reason: collision with root package name */
            public static final c f25784d = new c("ApiError", 1, "api_error");

            /* renamed from: e, reason: collision with root package name */
            public static final c f25785e = new c("AuthenticationError", 2, "authentication_error");

            /* renamed from: f, reason: collision with root package name */
            public static final c f25786f = new c("CardError", 3, "card_error");

            /* renamed from: g, reason: collision with root package name */
            public static final c f25787g = new c("IdempotencyError", 4, "idempotency_error");

            /* renamed from: h, reason: collision with root package name */
            public static final c f25788h = new c("InvalidRequestError", 5, "invalid_request_error");

            /* renamed from: i, reason: collision with root package name */
            public static final c f25789i = new c("RateLimitError", 6, "rate_limit_error");

            /* renamed from: j, reason: collision with root package name */
            private static final /* synthetic */ c[] f25790j;

            /* renamed from: k, reason: collision with root package name */
            private static final /* synthetic */ U5.a f25791k;

            /* renamed from: a, reason: collision with root package name */
            private final String f25792a;

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
                f25790j = a8;
                f25791k = U5.b.a(a8);
                f25782b = new a(null);
            }

            private c(String str, int i8, String str2) {
                this.f25792a = str2;
            }

            private static final /* synthetic */ c[] a() {
                return new c[]{f25783c, f25784d, f25785e, f25786f, f25787g, f25788h, f25789i};
            }

            public static U5.a c() {
                return f25791k;
            }

            public static c valueOf(String str) {
                return (c) Enum.valueOf(c.class, str);
            }

            public static c[] values() {
                return (c[]) f25790j.clone();
            }

            public final String b() {
                return this.f25792a;
            }
        }

        public e(String str, String str2, String str3, String str4, String str5, o oVar, c cVar) {
            this.f25775a = str;
            this.f25776b = str2;
            this.f25777c = str3;
            this.f25778d = str4;
            this.f25779e = str5;
            this.f25780f = oVar;
            this.f25781g = cVar;
        }

        public static /* synthetic */ e b(e eVar, String str, String str2, String str3, String str4, String str5, o oVar, c cVar, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = eVar.f25775a;
            }
            if ((i8 & 2) != 0) {
                str2 = eVar.f25776b;
            }
            String str6 = str2;
            if ((i8 & 4) != 0) {
                str3 = eVar.f25777c;
            }
            String str7 = str3;
            if ((i8 & 8) != 0) {
                str4 = eVar.f25778d;
            }
            String str8 = str4;
            if ((i8 & 16) != 0) {
                str5 = eVar.f25779e;
            }
            String str9 = str5;
            if ((i8 & 32) != 0) {
                oVar = eVar.f25780f;
            }
            o oVar2 = oVar;
            if ((i8 & 64) != 0) {
                cVar = eVar.f25781g;
            }
            return eVar.a(str, str6, str7, str8, str9, oVar2, cVar);
        }

        public final e a(String str, String str2, String str3, String str4, String str5, o oVar, c cVar) {
            return new e(str, str2, str3, str4, str5, oVar, cVar);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC3255y.d(this.f25775a, eVar.f25775a) && AbstractC3255y.d(this.f25776b, eVar.f25776b) && AbstractC3255y.d(this.f25777c, eVar.f25777c) && AbstractC3255y.d(this.f25778d, eVar.f25778d) && AbstractC3255y.d(this.f25779e, eVar.f25779e) && AbstractC3255y.d(this.f25780f, eVar.f25780f) && this.f25781g == eVar.f25781g;
        }

        public final String g() {
            return this.f25778d;
        }

        public final c h() {
            return this.f25781g;
        }

        public int hashCode() {
            String str = this.f25775a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f25776b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25777c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f25778d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f25779e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            o oVar = this.f25780f;
            int hashCode6 = (hashCode5 + (oVar == null ? 0 : oVar.hashCode())) * 31;
            c cVar = this.f25781g;
            return hashCode6 + (cVar != null ? cVar.hashCode() : 0);
        }

        public final String o() {
            return this.f25775a;
        }

        public String toString() {
            return "Error(code=" + this.f25775a + ", declineCode=" + this.f25776b + ", docUrl=" + this.f25777c + ", message=" + this.f25778d + ", param=" + this.f25779e + ", paymentMethod=" + this.f25780f + ", type=" + this.f25781g + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25775a);
            out.writeString(this.f25776b);
            out.writeString(this.f25777c);
            out.writeString(this.f25778d);
            out.writeString(this.f25779e);
            o oVar = this.f25780f;
            if (oVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                oVar.writeToParcel(out, i8);
            }
            c cVar = this.f25781g;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(cVar.name());
            }
        }
    }

    public u(String str, a aVar, long j8, String str2, String str3, String str4, boolean z8, o oVar, String str5, List paymentMethodTypes, StripeIntent.Status status, StripeIntent.Usage usage, e eVar, List unactivatedPaymentMethods, List linkFundingSources, StripeIntent.a aVar2, String str6) {
        AbstractC3255y.i(paymentMethodTypes, "paymentMethodTypes");
        AbstractC3255y.i(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        AbstractC3255y.i(linkFundingSources, "linkFundingSources");
        this.f25745a = str;
        this.f25746b = aVar;
        this.f25747c = j8;
        this.f25748d = str2;
        this.f25749e = str3;
        this.f25750f = str4;
        this.f25751g = z8;
        this.f25752h = oVar;
        this.f25753i = str5;
        this.f25754j = paymentMethodTypes;
        this.f25755k = status;
        this.f25756l = usage;
        this.f25757m = eVar;
        this.f25758n = unactivatedPaymentMethods;
        this.f25759o = linkFundingSources;
        this.f25760p = aVar2;
        this.f25761q = str6;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List F() {
        return this.f25758n;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List K() {
        return this.f25759o;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean L() {
        return AbstractC1378t.d0(a0.i(StripeIntent.Status.f25205d, StripeIntent.Status.f25209h), getStatus());
    }

    @Override // com.stripe.android.model.StripeIntent
    public Map O() {
        Map b8;
        String str = this.f25761q;
        if (str == null || (b8 = y2.e.f40920a.b(new JSONObject(str))) == null) {
            return Q.h();
        }
        return b8;
    }

    public final u a(String str, a aVar, long j8, String str2, String str3, String str4, boolean z8, o oVar, String str5, List paymentMethodTypes, StripeIntent.Status status, StripeIntent.Usage usage, e eVar, List unactivatedPaymentMethods, List linkFundingSources, StripeIntent.a aVar2, String str6) {
        AbstractC3255y.i(paymentMethodTypes, "paymentMethodTypes");
        AbstractC3255y.i(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        AbstractC3255y.i(linkFundingSources, "linkFundingSources");
        return new u(str, aVar, j8, str2, str3, str4, z8, oVar, str5, paymentMethodTypes, status, usage, eVar, unactivatedPaymentMethods, linkFundingSources, aVar2, str6);
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean c() {
        return this.f25751g;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String d() {
        return this.f25749e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List e() {
        return this.f25754j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return AbstractC3255y.d(this.f25745a, uVar.f25745a) && this.f25746b == uVar.f25746b && this.f25747c == uVar.f25747c && AbstractC3255y.d(this.f25748d, uVar.f25748d) && AbstractC3255y.d(this.f25749e, uVar.f25749e) && AbstractC3255y.d(this.f25750f, uVar.f25750f) && this.f25751g == uVar.f25751g && AbstractC3255y.d(this.f25752h, uVar.f25752h) && AbstractC3255y.d(this.f25753i, uVar.f25753i) && AbstractC3255y.d(this.f25754j, uVar.f25754j) && this.f25755k == uVar.f25755k && this.f25756l == uVar.f25756l && AbstractC3255y.d(this.f25757m, uVar.f25757m) && AbstractC3255y.d(this.f25758n, uVar.f25758n) && AbstractC3255y.d(this.f25759o, uVar.f25759o) && AbstractC3255y.d(this.f25760p, uVar.f25760p) && AbstractC3255y.d(this.f25761q, uVar.f25761q);
    }

    public final e g() {
        return this.f25757m;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getId() {
        return this.f25745a;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.Status getStatus() {
        return this.f25755k;
    }

    public int hashCode() {
        String str = this.f25745a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        a aVar = this.f25746b;
        int hashCode2 = (((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + androidx.collection.a.a(this.f25747c)) * 31;
        String str2 = this.f25748d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f25749e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f25750f;
        int hashCode5 = (((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f25751g)) * 31;
        o oVar = this.f25752h;
        int hashCode6 = (hashCode5 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        String str5 = this.f25753i;
        int hashCode7 = (((hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f25754j.hashCode()) * 31;
        StripeIntent.Status status = this.f25755k;
        int hashCode8 = (hashCode7 + (status == null ? 0 : status.hashCode())) * 31;
        StripeIntent.Usage usage = this.f25756l;
        int hashCode9 = (hashCode8 + (usage == null ? 0 : usage.hashCode())) * 31;
        e eVar = this.f25757m;
        int hashCode10 = (((((hashCode9 + (eVar == null ? 0 : eVar.hashCode())) * 31) + this.f25758n.hashCode()) * 31) + this.f25759o.hashCode()) * 31;
        StripeIntent.a aVar2 = this.f25760p;
        int hashCode11 = (hashCode10 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str6 = this.f25761q;
        return hashCode11 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.a j() {
        return this.f25760p;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.NextActionType k() {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
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
        if (j8 instanceof StripeIntent.a.c) {
            return StripeIntent.NextActionType.f25195k;
        }
        boolean z12 = true;
        if (j8 instanceof StripeIntent.a.C0476a) {
            z8 = true;
        } else {
            z8 = j8 instanceof StripeIntent.a.b;
        }
        if (z8) {
            z9 = true;
        } else {
            z9 = j8 instanceof StripeIntent.a.n;
        }
        if (z9) {
            z10 = true;
        } else {
            z10 = j8 instanceof StripeIntent.a.l;
        }
        if (z10) {
            z11 = true;
        } else {
            z11 = j8 instanceof StripeIntent.a.k;
        }
        if (!z11 && j8 != null) {
            z12 = false;
        }
        if (z12) {
            return null;
        }
        throw new O5.p();
    }

    @Override // com.stripe.android.model.StripeIntent
    public String m() {
        return this.f25748d;
    }

    @Override // com.stripe.android.model.StripeIntent
    public o r() {
        return this.f25752h;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean t() {
        if (getStatus() == StripeIntent.Status.f25206e) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "SetupIntent(id=" + this.f25745a + ", cancellationReason=" + this.f25746b + ", created=" + this.f25747c + ", countryCode=" + this.f25748d + ", clientSecret=" + this.f25749e + ", description=" + this.f25750f + ", isLiveMode=" + this.f25751g + ", paymentMethod=" + this.f25752h + ", paymentMethodId=" + this.f25753i + ", paymentMethodTypes=" + this.f25754j + ", status=" + this.f25755k + ", usage=" + this.f25756l + ", lastSetupError=" + this.f25757m + ", unactivatedPaymentMethods=" + this.f25758n + ", linkFundingSources=" + this.f25759o + ", nextActionData=" + this.f25760p + ", paymentMethodOptionsJsonString=" + this.f25761q + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f25745a);
        a aVar = this.f25746b;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(aVar.name());
        }
        out.writeLong(this.f25747c);
        out.writeString(this.f25748d);
        out.writeString(this.f25749e);
        out.writeString(this.f25750f);
        out.writeInt(this.f25751g ? 1 : 0);
        o oVar = this.f25752h;
        if (oVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            oVar.writeToParcel(out, i8);
        }
        out.writeString(this.f25753i);
        out.writeStringList(this.f25754j);
        StripeIntent.Status status = this.f25755k;
        if (status == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(status.name());
        }
        StripeIntent.Usage usage = this.f25756l;
        if (usage == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(usage.name());
        }
        e eVar = this.f25757m;
        if (eVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            eVar.writeToParcel(out, i8);
        }
        out.writeStringList(this.f25758n);
        out.writeStringList(this.f25759o);
        out.writeParcelable(this.f25760p, i8);
        out.writeString(this.f25761q);
    }

    public /* synthetic */ u(String str, a aVar, long j8, String str2, String str3, String str4, boolean z8, o oVar, String str5, List list, StripeIntent.Status status, StripeIntent.Usage usage, e eVar, List list2, List list3, StripeIntent.a aVar2, String str6, int i8, AbstractC3247p abstractC3247p) {
        this(str, aVar, j8, str2, str3, str4, z8, (i8 & 128) != 0 ? null : oVar, str5, list, status, usage, (i8 & 4096) != 0 ? null : eVar, list2, list3, aVar2, (i8 & 65536) != 0 ? null : str6);
    }
}
