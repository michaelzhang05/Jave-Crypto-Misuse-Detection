package com.stripe.android.paymentsheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.u;
import kotlin.jvm.internal.AbstractC3159y;
import r3.C3686a;

/* loaded from: classes4.dex */
public interface l extends Parcelable {

    /* loaded from: classes4.dex */
    public static final class a implements l {

        /* renamed from: a, reason: collision with root package name */
        private final u.l f26038a;

        /* renamed from: b, reason: collision with root package name */
        private final C3686a f26039b;

        /* renamed from: c, reason: collision with root package name */
        private final com.stripe.android.model.p f26040c;

        /* renamed from: d, reason: collision with root package name */
        private final com.stripe.android.model.r f26041d;

        /* renamed from: e, reason: collision with root package name */
        private final u.b f26042e;

        /* renamed from: f, reason: collision with root package name */
        public static final int f26037f = com.stripe.android.model.r.f24656b | com.stripe.android.model.p.f24582v;
        public static final Parcelable.Creator<a> CREATOR = new C0613a();

        /* renamed from: com.stripe.android.paymentsheet.l$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0613a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a((u.l) parcel.readParcelable(a.class.getClassLoader()), parcel.readInt() == 0 ? null : C3686a.CREATOR.createFromParcel(parcel), (com.stripe.android.model.p) parcel.readParcelable(a.class.getClassLoader()), (com.stripe.android.model.r) parcel.readParcelable(a.class.getClassLoader()), u.b.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(u.l initializationMode, C3686a c3686a, com.stripe.android.model.p createParams, com.stripe.android.model.r rVar, u.b appearance) {
            AbstractC3159y.i(initializationMode, "initializationMode");
            AbstractC3159y.i(createParams, "createParams");
            AbstractC3159y.i(appearance, "appearance");
            this.f26038a = initializationMode;
            this.f26039b = c3686a;
            this.f26040c = createParams;
            this.f26041d = rVar;
            this.f26042e = appearance;
        }

        public final u.l B() {
            return this.f26038a;
        }

        public final u.b b() {
            return this.f26042e;
        }

        public final com.stripe.android.model.p c() {
            return this.f26040c;
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
            return AbstractC3159y.d(this.f26038a, aVar.f26038a) && AbstractC3159y.d(this.f26039b, aVar.f26039b) && AbstractC3159y.d(this.f26040c, aVar.f26040c) && AbstractC3159y.d(this.f26041d, aVar.f26041d) && AbstractC3159y.d(this.f26042e, aVar.f26042e);
        }

        public int hashCode() {
            int hashCode = this.f26038a.hashCode() * 31;
            C3686a c3686a = this.f26039b;
            int hashCode2 = (((hashCode + (c3686a == null ? 0 : c3686a.hashCode())) * 31) + this.f26040c.hashCode()) * 31;
            com.stripe.android.model.r rVar = this.f26041d;
            return ((hashCode2 + (rVar != null ? rVar.hashCode() : 0)) * 31) + this.f26042e.hashCode();
        }

        public final C3686a t() {
            return this.f26039b;
        }

        public String toString() {
            return "BacsPaymentMethod(initializationMode=" + this.f26038a + ", shippingDetails=" + this.f26039b + ", createParams=" + this.f26040c + ", optionsParams=" + this.f26041d + ", appearance=" + this.f26042e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f26038a, i8);
            C3686a c3686a = this.f26039b;
            if (c3686a == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                c3686a.writeToParcel(out, i8);
            }
            out.writeParcelable(this.f26040c, i8);
            out.writeParcelable(this.f26041d, i8);
            this.f26042e.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements l {

        /* renamed from: a, reason: collision with root package name */
        private final String f26044a;

        /* renamed from: b, reason: collision with root package name */
        private final o.e f26045b;

        /* renamed from: c, reason: collision with root package name */
        public static final int f26043c = o.e.f24447f;
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new b(parcel.readString(), (o.e) parcel.readParcelable(b.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(String type, o.e eVar) {
            AbstractC3159y.i(type, "type");
            this.f26044a = type;
            this.f26045b = eVar;
        }

        public final o.e b() {
            return this.f26045b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3159y.d(this.f26044a, bVar.f26044a) && AbstractC3159y.d(this.f26045b, bVar.f26045b);
        }

        public final String getType() {
            return this.f26044a;
        }

        public int hashCode() {
            int hashCode = this.f26044a.hashCode() * 31;
            o.e eVar = this.f26045b;
            return hashCode + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            return "ExternalPaymentMethod(type=" + this.f26044a + ", billingDetails=" + this.f26045b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f26044a);
            out.writeParcelable(this.f26045b, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements l {
        public static final Parcelable.Creator<c> CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        private final u.l f26046a;

        /* renamed from: b, reason: collision with root package name */
        private final C3686a f26047b;

        /* renamed from: c, reason: collision with root package name */
        private final a f26048c;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0614a();

            /* renamed from: a, reason: collision with root package name */
            private final u.k.c f26049a;

            /* renamed from: b, reason: collision with root package name */
            private final String f26050b;

            /* renamed from: c, reason: collision with root package name */
            private final String f26051c;

            /* renamed from: d, reason: collision with root package name */
            private final String f26052d;

            /* renamed from: e, reason: collision with root package name */
            private final Long f26053e;

            /* renamed from: f, reason: collision with root package name */
            private final String f26054f;

            /* renamed from: g, reason: collision with root package name */
            private final u.d f26055g;

            /* renamed from: com.stripe.android.paymentsheet.l$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0614a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new a(parcel.readInt() == 0 ? null : u.k.c.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), u.d.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public a(u.k.c cVar, String merchantName, String merchantCountryCode, String str, Long l8, String str2, u.d billingDetailsCollectionConfiguration) {
                AbstractC3159y.i(merchantName, "merchantName");
                AbstractC3159y.i(merchantCountryCode, "merchantCountryCode");
                AbstractC3159y.i(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
                this.f26049a = cVar;
                this.f26050b = merchantName;
                this.f26051c = merchantCountryCode;
                this.f26052d = str;
                this.f26053e = l8;
                this.f26054f = str2;
                this.f26055g = billingDetailsCollectionConfiguration;
            }

            public final u.d b() {
                return this.f26055g;
            }

            public final Long c() {
                return this.f26053e;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String e() {
                return this.f26054f;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f26049a == aVar.f26049a && AbstractC3159y.d(this.f26050b, aVar.f26050b) && AbstractC3159y.d(this.f26051c, aVar.f26051c) && AbstractC3159y.d(this.f26052d, aVar.f26052d) && AbstractC3159y.d(this.f26053e, aVar.f26053e) && AbstractC3159y.d(this.f26054f, aVar.f26054f) && AbstractC3159y.d(this.f26055g, aVar.f26055g);
            }

            public final u.k.c f() {
                return this.f26049a;
            }

            public int hashCode() {
                u.k.c cVar = this.f26049a;
                int hashCode = (((((cVar == null ? 0 : cVar.hashCode()) * 31) + this.f26050b.hashCode()) * 31) + this.f26051c.hashCode()) * 31;
                String str = this.f26052d;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Long l8 = this.f26053e;
                int hashCode3 = (hashCode2 + (l8 == null ? 0 : l8.hashCode())) * 31;
                String str2 = this.f26054f;
                return ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f26055g.hashCode();
            }

            public final String i() {
                return this.f26051c;
            }

            public final String j() {
                return this.f26052d;
            }

            public final String k() {
                return this.f26050b;
            }

            public String toString() {
                return "Config(environment=" + this.f26049a + ", merchantName=" + this.f26050b + ", merchantCountryCode=" + this.f26051c + ", merchantCurrencyCode=" + this.f26052d + ", customAmount=" + this.f26053e + ", customLabel=" + this.f26054f + ", billingDetailsCollectionConfiguration=" + this.f26055g + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                u.k.c cVar = this.f26049a;
                if (cVar == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeString(cVar.name());
                }
                out.writeString(this.f26050b);
                out.writeString(this.f26051c);
                out.writeString(this.f26052d);
                Long l8 = this.f26053e;
                if (l8 == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeLong(l8.longValue());
                }
                out.writeString(this.f26054f);
                this.f26055g.writeToParcel(out, i8);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new c((u.l) parcel.readParcelable(c.class.getClassLoader()), parcel.readInt() == 0 ? null : C3686a.CREATOR.createFromParcel(parcel), a.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(u.l initializationMode, C3686a c3686a, a config) {
            AbstractC3159y.i(initializationMode, "initializationMode");
            AbstractC3159y.i(config, "config");
            this.f26046a = initializationMode;
            this.f26047b = c3686a;
            this.f26048c = config;
        }

        public final u.l B() {
            return this.f26046a;
        }

        public final a b() {
            return this.f26048c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC3159y.d(this.f26046a, cVar.f26046a) && AbstractC3159y.d(this.f26047b, cVar.f26047b) && AbstractC3159y.d(this.f26048c, cVar.f26048c);
        }

        public int hashCode() {
            int hashCode = this.f26046a.hashCode() * 31;
            C3686a c3686a = this.f26047b;
            return ((hashCode + (c3686a == null ? 0 : c3686a.hashCode())) * 31) + this.f26048c.hashCode();
        }

        public final C3686a t() {
            return this.f26047b;
        }

        public String toString() {
            return "GooglePay(initializationMode=" + this.f26046a + ", shippingDetails=" + this.f26047b + ", config=" + this.f26048c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f26046a, i8);
            C3686a c3686a = this.f26047b;
            if (c3686a == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                c3686a.writeToParcel(out, i8);
            }
            this.f26048c.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public interface d extends l {

        /* loaded from: classes4.dex */
        public static final class a implements d {

            /* renamed from: a, reason: collision with root package name */
            private final u.l f26057a;

            /* renamed from: b, reason: collision with root package name */
            private final C3686a f26058b;

            /* renamed from: c, reason: collision with root package name */
            private final com.stripe.android.model.p f26059c;

            /* renamed from: d, reason: collision with root package name */
            private final com.stripe.android.model.r f26060d;

            /* renamed from: e, reason: collision with root package name */
            private final boolean f26061e;

            /* renamed from: f, reason: collision with root package name */
            public static final int f26056f = com.stripe.android.model.r.f24656b | com.stripe.android.model.p.f24582v;
            public static final Parcelable.Creator<a> CREATOR = new C0615a();

            /* renamed from: com.stripe.android.paymentsheet.l$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0615a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new a((u.l) parcel.readParcelable(a.class.getClassLoader()), parcel.readInt() == 0 ? null : C3686a.CREATOR.createFromParcel(parcel), (com.stripe.android.model.p) parcel.readParcelable(a.class.getClassLoader()), (com.stripe.android.model.r) parcel.readParcelable(a.class.getClassLoader()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public a(u.l initializationMode, C3686a c3686a, com.stripe.android.model.p createParams, com.stripe.android.model.r rVar, boolean z8) {
                AbstractC3159y.i(initializationMode, "initializationMode");
                AbstractC3159y.i(createParams, "createParams");
                this.f26057a = initializationMode;
                this.f26058b = c3686a;
                this.f26059c = createParams;
                this.f26060d = rVar;
                this.f26061e = z8;
            }

            @Override // com.stripe.android.paymentsheet.l.d
            public u.l B() {
                return this.f26057a;
            }

            public final com.stripe.android.model.p b() {
                return this.f26059c;
            }

            public final com.stripe.android.model.r c() {
                return this.f26060d;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final boolean e() {
                return this.f26061e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return AbstractC3159y.d(this.f26057a, aVar.f26057a) && AbstractC3159y.d(this.f26058b, aVar.f26058b) && AbstractC3159y.d(this.f26059c, aVar.f26059c) && AbstractC3159y.d(this.f26060d, aVar.f26060d) && this.f26061e == aVar.f26061e;
            }

            public int hashCode() {
                int hashCode = this.f26057a.hashCode() * 31;
                C3686a c3686a = this.f26058b;
                int hashCode2 = (((hashCode + (c3686a == null ? 0 : c3686a.hashCode())) * 31) + this.f26059c.hashCode()) * 31;
                com.stripe.android.model.r rVar = this.f26060d;
                return ((hashCode2 + (rVar != null ? rVar.hashCode() : 0)) * 31) + androidx.compose.foundation.a.a(this.f26061e);
            }

            @Override // com.stripe.android.paymentsheet.l.d
            public C3686a t() {
                return this.f26058b;
            }

            public String toString() {
                return "New(initializationMode=" + this.f26057a + ", shippingDetails=" + this.f26058b + ", createParams=" + this.f26059c + ", optionsParams=" + this.f26060d + ", shouldSave=" + this.f26061e + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeParcelable(this.f26057a, i8);
                C3686a c3686a = this.f26058b;
                if (c3686a == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    c3686a.writeToParcel(out, i8);
                }
                out.writeParcelable(this.f26059c, i8);
                out.writeParcelable(this.f26060d, i8);
                out.writeInt(this.f26061e ? 1 : 0);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements d {

            /* renamed from: a, reason: collision with root package name */
            private final u.l f26063a;

            /* renamed from: b, reason: collision with root package name */
            private final C3686a f26064b;

            /* renamed from: c, reason: collision with root package name */
            private final com.stripe.android.model.o f26065c;

            /* renamed from: d, reason: collision with root package name */
            private final com.stripe.android.model.r f26066d;

            /* renamed from: e, reason: collision with root package name */
            public static final int f26062e = com.stripe.android.model.r.f24656b | com.stripe.android.model.o.f24407u;
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new b((u.l) parcel.readParcelable(b.class.getClassLoader()), parcel.readInt() == 0 ? null : C3686a.CREATOR.createFromParcel(parcel), (com.stripe.android.model.o) parcel.readParcelable(b.class.getClassLoader()), (com.stripe.android.model.r) parcel.readParcelable(b.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            public b(u.l initializationMode, C3686a c3686a, com.stripe.android.model.o paymentMethod, com.stripe.android.model.r rVar) {
                AbstractC3159y.i(initializationMode, "initializationMode");
                AbstractC3159y.i(paymentMethod, "paymentMethod");
                this.f26063a = initializationMode;
                this.f26064b = c3686a;
                this.f26065c = paymentMethod;
                this.f26066d = rVar;
            }

            @Override // com.stripe.android.paymentsheet.l.d
            public u.l B() {
                return this.f26063a;
            }

            public final com.stripe.android.model.r b() {
                return this.f26066d;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return AbstractC3159y.d(this.f26063a, bVar.f26063a) && AbstractC3159y.d(this.f26064b, bVar.f26064b) && AbstractC3159y.d(this.f26065c, bVar.f26065c) && AbstractC3159y.d(this.f26066d, bVar.f26066d);
            }

            public int hashCode() {
                int hashCode = this.f26063a.hashCode() * 31;
                C3686a c3686a = this.f26064b;
                int hashCode2 = (((hashCode + (c3686a == null ? 0 : c3686a.hashCode())) * 31) + this.f26065c.hashCode()) * 31;
                com.stripe.android.model.r rVar = this.f26066d;
                return hashCode2 + (rVar != null ? rVar.hashCode() : 0);
            }

            @Override // com.stripe.android.paymentsheet.l.d
            public C3686a t() {
                return this.f26064b;
            }

            public String toString() {
                return "Saved(initializationMode=" + this.f26063a + ", shippingDetails=" + this.f26064b + ", paymentMethod=" + this.f26065c + ", optionsParams=" + this.f26066d + ")";
            }

            public final com.stripe.android.model.o v() {
                return this.f26065c;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeParcelable(this.f26063a, i8);
                C3686a c3686a = this.f26064b;
                if (c3686a == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    c3686a.writeToParcel(out, i8);
                }
                out.writeParcelable(this.f26065c, i8);
                out.writeParcelable(this.f26066d, i8);
            }
        }

        u.l B();

        C3686a t();
    }
}
