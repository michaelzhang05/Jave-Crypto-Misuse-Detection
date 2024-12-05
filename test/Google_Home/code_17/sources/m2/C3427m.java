package m2;

import P5.AbstractC1378t;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.googlepaylauncher.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: m2.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3427m {

    /* renamed from: c, reason: collision with root package name */
    private static final b f34978c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final List f34979d = AbstractC1378t.p("PAN_ONLY", "CRYPTOGRAM_3DS");

    /* renamed from: e, reason: collision with root package name */
    private static final List f34980e = AbstractC1378t.p("AMEX", "DISCOVER", "MASTERCARD", "VISA");

    /* renamed from: a, reason: collision with root package name */
    private final C3426l f34981a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f34982b;

    /* renamed from: m2.m$b */
    /* loaded from: classes4.dex */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: m2.m$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f34992a;

        /* renamed from: m2.m$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new c(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(String str) {
            this.f34992a = str;
        }

        public final String a() {
            return this.f34992a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3255y.d(this.f34992a, ((c) obj).f34992a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f34992a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "MerchantInfo(merchantName=" + this.f34992a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f34992a);
        }
    }

    /* renamed from: m2.m$d */
    /* loaded from: classes4.dex */
    public static final class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final boolean f34993a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f34994b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f34995c;

        /* renamed from: m2.m$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                boolean z8;
                AbstractC3255y.i(parcel, "parcel");
                boolean z9 = false;
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    linkedHashSet.add(parcel.readString());
                }
                if (parcel.readInt() != 0) {
                    z9 = true;
                }
                return new d(z8, linkedHashSet, z9);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(boolean z8, Set allowedCountryCodes, boolean z9) {
            AbstractC3255y.i(allowedCountryCodes, "allowedCountryCodes");
            this.f34993a = z8;
            this.f34994b = allowedCountryCodes;
            this.f34995c = z9;
            String[] iSOCountries = Locale.getISOCountries();
            for (String str : a()) {
                AbstractC3255y.f(iSOCountries);
                for (String str2 : iSOCountries) {
                    if (AbstractC3255y.d(str, str2)) {
                        break;
                    }
                }
                throw new IllegalArgumentException(("'" + str + "' is not a valid country code").toString());
            }
        }

        public final Set a() {
            Set set = this.f34994b;
            ArrayList arrayList = new ArrayList(AbstractC1378t.x(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String upperCase = ((String) it.next()).toUpperCase(Locale.ROOT);
                AbstractC3255y.h(upperCase, "toUpperCase(...)");
                arrayList.add(upperCase);
            }
            return AbstractC1378t.b1(arrayList);
        }

        public final boolean b() {
            return this.f34995c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f34993a == dVar.f34993a && AbstractC3255y.d(this.f34994b, dVar.f34994b) && this.f34995c == dVar.f34995c) {
                return true;
            }
            return false;
        }

        public final boolean g() {
            return this.f34993a;
        }

        public int hashCode() {
            return (((androidx.compose.foundation.a.a(this.f34993a) * 31) + this.f34994b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f34995c);
        }

        public String toString() {
            return "ShippingAddressParameters(isRequired=" + this.f34993a + ", allowedCountryCodes=" + this.f34994b + ", phoneNumberRequired=" + this.f34995c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeInt(this.f34993a ? 1 : 0);
            Set set = this.f34994b;
            out.writeInt(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                out.writeString((String) it.next());
            }
            out.writeInt(this.f34995c ? 1 : 0);
        }
    }

    /* renamed from: m2.m$e */
    /* loaded from: classes4.dex */
    public static final class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        private final String f34996a;

        /* renamed from: b, reason: collision with root package name */
        private final c f34997b;

        /* renamed from: c, reason: collision with root package name */
        private final String f34998c;

        /* renamed from: d, reason: collision with root package name */
        private final String f34999d;

        /* renamed from: e, reason: collision with root package name */
        private final Long f35000e;

        /* renamed from: f, reason: collision with root package name */
        private final String f35001f;

        /* renamed from: g, reason: collision with root package name */
        private final a f35002g;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: m2.m$e$a */
        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: b, reason: collision with root package name */
            public static final a f35003b = new a("Default", 0, "DEFAULT");

            /* renamed from: c, reason: collision with root package name */
            public static final a f35004c = new a("CompleteImmediatePurchase", 1, "COMPLETE_IMMEDIATE_PURCHASE");

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ a[] f35005d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ U5.a f35006e;

            /* renamed from: a, reason: collision with root package name */
            private final String f35007a;

            static {
                a[] a8 = a();
                f35005d = a8;
                f35006e = U5.b.a(a8);
            }

            private a(String str, int i8, String str2) {
                this.f35007a = str2;
            }

            private static final /* synthetic */ a[] a() {
                return new a[]{f35003b, f35004c};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f35005d.clone();
            }

            public final String b() {
                return this.f35007a;
            }
        }

        /* renamed from: m2.m$e$b */
        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                Long valueOf;
                a valueOf2;
                AbstractC3255y.i(parcel, "parcel");
                String readString = parcel.readString();
                c valueOf3 = c.valueOf(parcel.readString());
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(parcel.readLong());
                }
                String readString4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = a.valueOf(parcel.readString());
                }
                return new e(readString, valueOf3, readString2, readString3, valueOf, readString4, valueOf2);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: m2.m$e$c */
        /* loaded from: classes4.dex */
        public static final class c {

            /* renamed from: b, reason: collision with root package name */
            public static final c f35008b = new c("NotCurrentlyKnown", 0, "NOT_CURRENTLY_KNOWN");

            /* renamed from: c, reason: collision with root package name */
            public static final c f35009c = new c("Estimated", 1, "ESTIMATED");

            /* renamed from: d, reason: collision with root package name */
            public static final c f35010d = new c("Final", 2, "FINAL");

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ c[] f35011e;

            /* renamed from: f, reason: collision with root package name */
            private static final /* synthetic */ U5.a f35012f;

            /* renamed from: a, reason: collision with root package name */
            private final String f35013a;

            static {
                c[] a8 = a();
                f35011e = a8;
                f35012f = U5.b.a(a8);
            }

            private c(String str, int i8, String str2) {
                this.f35013a = str2;
            }

            private static final /* synthetic */ c[] a() {
                return new c[]{f35008b, f35009c, f35010d};
            }

            public static c valueOf(String str) {
                return (c) Enum.valueOf(c.class, str);
            }

            public static c[] values() {
                return (c[]) f35011e.clone();
            }

            public final String b() {
                return this.f35013a;
            }
        }

        public e(String currencyCode, c totalPriceStatus, String str, String str2, Long l8, String str3, a aVar) {
            AbstractC3255y.i(currencyCode, "currencyCode");
            AbstractC3255y.i(totalPriceStatus, "totalPriceStatus");
            this.f34996a = currencyCode;
            this.f34997b = totalPriceStatus;
            this.f34998c = str;
            this.f34999d = str2;
            this.f35000e = l8;
            this.f35001f = str3;
            this.f35002g = aVar;
        }

        public final a a() {
            return this.f35002g;
        }

        public final String b() {
            return this.f34998c;
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
            if (AbstractC3255y.d(this.f34996a, eVar.f34996a) && this.f34997b == eVar.f34997b && AbstractC3255y.d(this.f34998c, eVar.f34998c) && AbstractC3255y.d(this.f34999d, eVar.f34999d) && AbstractC3255y.d(this.f35000e, eVar.f35000e) && AbstractC3255y.d(this.f35001f, eVar.f35001f) && this.f35002g == eVar.f35002g) {
                return true;
            }
            return false;
        }

        public final String g() {
            return this.f34996a;
        }

        public final Long h() {
            return this.f35000e;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5 = ((this.f34996a.hashCode() * 31) + this.f34997b.hashCode()) * 31;
            String str = this.f34998c;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = (hashCode5 + hashCode) * 31;
            String str2 = this.f34999d;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            Long l8 = this.f35000e;
            if (l8 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = l8.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            String str3 = this.f35001f;
            if (str3 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str3.hashCode();
            }
            int i12 = (i11 + hashCode4) * 31;
            a aVar = this.f35002g;
            if (aVar != null) {
                i8 = aVar.hashCode();
            }
            return i12 + i8;
        }

        public final String i() {
            return this.f35001f;
        }

        public final c l() {
            return this.f34997b;
        }

        public final String p() {
            return this.f34999d;
        }

        public String toString() {
            return "TransactionInfo(currencyCode=" + this.f34996a + ", totalPriceStatus=" + this.f34997b + ", countryCode=" + this.f34998c + ", transactionId=" + this.f34999d + ", totalPrice=" + this.f35000e + ", totalPriceLabel=" + this.f35001f + ", checkoutOption=" + this.f35002g + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f34996a);
            out.writeString(this.f34997b.name());
            out.writeString(this.f34998c);
            out.writeString(this.f34999d);
            Long l8 = this.f35000e;
            if (l8 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeLong(l8.longValue());
            }
            out.writeString(this.f35001f);
            a aVar = this.f35002g;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(aVar.name());
            }
        }
    }

    public C3427m(C3426l googlePayConfig, boolean z8) {
        AbstractC3255y.i(googlePayConfig, "googlePayConfig");
        this.f34981a = googlePayConfig;
        this.f34982b = z8;
    }

    private final JSONObject a() {
        JSONObject put = new JSONObject().put("allowedAuthMethods", new JSONArray((Collection) f34979d));
        List list = f34980e;
        List e8 = AbstractC1378t.e("JCB");
        if (!this.f34982b) {
            e8 = null;
        }
        if (e8 == null) {
            e8 = AbstractC1378t.m();
        }
        JSONObject put2 = put.put("allowedCardNetworks", new JSONArray((Collection) AbstractC1378t.G0(list, e8)));
        AbstractC3255y.h(put2, "put(...)");
        return put2;
    }

    public static /* synthetic */ JSONObject e(C3427m c3427m, e eVar, a aVar, d dVar, boolean z8, c cVar, Boolean bool, int i8, Object obj) {
        a aVar2;
        d dVar2;
        boolean z9;
        c cVar2;
        Boolean bool2 = null;
        if ((i8 & 2) != 0) {
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        if ((i8 & 4) != 0) {
            dVar2 = null;
        } else {
            dVar2 = dVar;
        }
        if ((i8 & 8) != 0) {
            z9 = false;
        } else {
            z9 = z8;
        }
        if ((i8 & 16) != 0) {
            cVar2 = null;
        } else {
            cVar2 = cVar;
        }
        if ((i8 & 32) == 0) {
            bool2 = bool;
        }
        return c3427m.d(eVar, aVar2, dVar2, z9, cVar2, bool2);
    }

    private final JSONObject f(d dVar) {
        JSONObject put = new JSONObject().put("allowedCountryCodes", new JSONArray((Collection) dVar.a())).put("phoneNumberRequired", dVar.b());
        AbstractC3255y.h(put, "put(...)");
        return put;
    }

    private final JSONObject g(e eVar) {
        JSONObject jSONObject = new JSONObject();
        String g8 = eVar.g();
        Locale locale = Locale.ROOT;
        String upperCase = g8.toUpperCase(locale);
        AbstractC3255y.h(upperCase, "toUpperCase(...)");
        JSONObject put = jSONObject.put("currencyCode", upperCase).put("totalPriceStatus", eVar.l().b());
        String b8 = eVar.b();
        if (b8 != null) {
            String upperCase2 = b8.toUpperCase(locale);
            AbstractC3255y.h(upperCase2, "toUpperCase(...)");
            put.put("countryCode", upperCase2);
        }
        String p8 = eVar.p();
        if (p8 != null) {
            put.put("transactionId", p8);
        }
        Long h8 = eVar.h();
        if (h8 != null) {
            long longValue = h8.longValue();
            String upperCase3 = eVar.g().toUpperCase(locale);
            AbstractC3255y.h(upperCase3, "toUpperCase(...)");
            Currency currency = Currency.getInstance(upperCase3);
            AbstractC3255y.h(currency, "getInstance(...)");
            put.put("totalPrice", o.a(longValue, currency));
        }
        String i8 = eVar.i();
        if (i8 != null) {
            put.put("totalPriceLabel", i8);
        }
        e.a a8 = eVar.a();
        if (a8 != null) {
            put.put("checkoutOption", a8.b());
        }
        AbstractC3255y.h(put, "apply(...)");
        return put;
    }

    public final JSONObject b(a aVar, Boolean bool) {
        JSONObject a8 = a();
        if (aVar != null && aVar.g()) {
            a8.put("billingAddressRequired", true);
            a8.put("billingAddressParameters", new JSONObject().put("phoneNumberRequired", aVar.b()).put("format", aVar.a().b()));
        }
        if (bool != null) {
            a8.put("allowCreditCards", bool.booleanValue());
        }
        JSONObject put = new JSONObject().put("type", "CARD").put("parameters", a8).put("tokenizationSpecification", this.f34981a.b());
        AbstractC3255y.h(put, "put(...)");
        return put;
    }

    public final JSONObject c(a aVar, Boolean bool, Boolean bool2) {
        JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0).put("allowedPaymentMethods", new JSONArray().put(b(aVar, bool2)));
        if (bool != null) {
            put.put("existingPaymentMethodRequired", bool.booleanValue());
        }
        AbstractC3255y.h(put, "apply(...)");
        return put;
    }

    public final JSONObject d(e transactionInfo, a aVar, d dVar, boolean z8, c cVar, Boolean bool) {
        String a8;
        AbstractC3255y.i(transactionInfo, "transactionInfo");
        JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0).put("allowedPaymentMethods", new JSONArray().put(b(aVar, bool))).put("transactionInfo", g(transactionInfo)).put("emailRequired", z8);
        if (dVar != null && dVar.g()) {
            put.put("shippingAddressRequired", true);
            put.put("shippingAddressParameters", f(dVar));
        }
        if (cVar != null && (a8 = cVar.a()) != null && a8.length() != 0) {
            put.put("merchantInfo", new JSONObject().put("merchantName", cVar.a()));
        }
        AbstractC3255y.h(put, "apply(...)");
        return put;
    }

    /* renamed from: m2.m$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0795a();

        /* renamed from: d, reason: collision with root package name */
        public static final int f34983d = 0;

        /* renamed from: a, reason: collision with root package name */
        private final boolean f34984a;

        /* renamed from: b, reason: collision with root package name */
        private final b f34985b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f34986c;

        /* renamed from: m2.m$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0795a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                boolean z8;
                AbstractC3255y.i(parcel, "parcel");
                boolean z9 = false;
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                b valueOf = b.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    z9 = true;
                }
                return new a(z8, valueOf, z9);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: m2.m$a$b */
        /* loaded from: classes4.dex */
        public static final class b {

            /* renamed from: b, reason: collision with root package name */
            public static final b f34987b = new b("Min", 0, "MIN");

            /* renamed from: c, reason: collision with root package name */
            public static final b f34988c = new b("Full", 1, "FULL");

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ b[] f34989d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ U5.a f34990e;

            /* renamed from: a, reason: collision with root package name */
            private final String f34991a;

            static {
                b[] a8 = a();
                f34989d = a8;
                f34990e = U5.b.a(a8);
            }

            private b(String str, int i8, String str2) {
                this.f34991a = str2;
            }

            private static final /* synthetic */ b[] a() {
                return new b[]{f34987b, f34988c};
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) f34989d.clone();
            }

            public final String b() {
                return this.f34991a;
            }
        }

        public a(boolean z8, b format, boolean z9) {
            AbstractC3255y.i(format, "format");
            this.f34984a = z8;
            this.f34985b = format;
            this.f34986c = z9;
        }

        public final b a() {
            return this.f34985b;
        }

        public final boolean b() {
            return this.f34986c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f34984a == aVar.f34984a && this.f34985b == aVar.f34985b && this.f34986c == aVar.f34986c) {
                return true;
            }
            return false;
        }

        public final boolean g() {
            return this.f34984a;
        }

        public int hashCode() {
            return (((androidx.compose.foundation.a.a(this.f34984a) * 31) + this.f34985b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f34986c);
        }

        public String toString() {
            return "BillingAddressParameters(isRequired=" + this.f34984a + ", format=" + this.f34985b + ", isPhoneNumberRequired=" + this.f34986c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeInt(this.f34984a ? 1 : 0);
            out.writeString(this.f34985b.name());
            out.writeInt(this.f34986c ? 1 : 0);
        }

        public /* synthetic */ a(boolean z8, b bVar, boolean z9, int i8, AbstractC3247p abstractC3247p) {
            this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? b.f34987b : bVar, (i8 & 4) != 0 ? false : z9);
        }
    }

    public /* synthetic */ C3427m(Context context, boolean z8, int i8, AbstractC3247p abstractC3247p) {
        this(context, (i8 & 2) != 0 ? false : z8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3427m(Context context, boolean z8) {
        this(new C3426l(context), z8);
        AbstractC3255y.i(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3427m(Function0 publishableKeyProvider, Function0 stripeAccountIdProvider, h.d googlePayConfig) {
        this(new C3426l((String) publishableKeyProvider.invoke(), (String) stripeAccountIdProvider.invoke()), googlePayConfig.s());
        AbstractC3255y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3255y.i(stripeAccountIdProvider, "stripeAccountIdProvider");
        AbstractC3255y.i(googlePayConfig, "googlePayConfig");
    }
}
