package com.stripe.android.paymentsheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.u;
import kotlin.jvm.internal.AbstractC3255y;
import u3.C4059a;

/* loaded from: classes4.dex */
public interface l extends Parcelable {

    /* loaded from: classes4.dex */
    public static final class a implements l {

        /* renamed from: a, reason: collision with root package name */
        private final u.l f27093a;

        /* renamed from: b, reason: collision with root package name */
        private final C4059a f27094b;

        /* renamed from: c, reason: collision with root package name */
        private final com.stripe.android.model.p f27095c;

        /* renamed from: d, reason: collision with root package name */
        private final com.stripe.android.model.r f27096d;

        /* renamed from: e, reason: collision with root package name */
        private final u.b f27097e;

        /* renamed from: f, reason: collision with root package name */
        public static final int f27092f = com.stripe.android.model.r.f25711b | com.stripe.android.model.p.f25637v;
        public static final Parcelable.Creator<a> CREATOR = new C0609a();

        /* renamed from: com.stripe.android.paymentsheet.l$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0609a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new a((u.l) parcel.readParcelable(a.class.getClassLoader()), parcel.readInt() == 0 ? null : C4059a.CREATOR.createFromParcel(parcel), (com.stripe.android.model.p) parcel.readParcelable(a.class.getClassLoader()), (com.stripe.android.model.r) parcel.readParcelable(a.class.getClassLoader()), u.b.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(u.l initializationMode, C4059a c4059a, com.stripe.android.model.p createParams, com.stripe.android.model.r rVar, u.b appearance) {
            AbstractC3255y.i(initializationMode, "initializationMode");
            AbstractC3255y.i(createParams, "createParams");
            AbstractC3255y.i(appearance, "appearance");
            this.f27093a = initializationMode;
            this.f27094b = c4059a;
            this.f27095c = createParams;
            this.f27096d = rVar;
            this.f27097e = appearance;
        }

        public final u.l D() {
            return this.f27093a;
        }

        public final u.b a() {
            return this.f27097e;
        }

        public final com.stripe.android.model.p b() {
            return this.f27095c;
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
            return AbstractC3255y.d(this.f27093a, aVar.f27093a) && AbstractC3255y.d(this.f27094b, aVar.f27094b) && AbstractC3255y.d(this.f27095c, aVar.f27095c) && AbstractC3255y.d(this.f27096d, aVar.f27096d) && AbstractC3255y.d(this.f27097e, aVar.f27097e);
        }

        public int hashCode() {
            int hashCode = this.f27093a.hashCode() * 31;
            C4059a c4059a = this.f27094b;
            int hashCode2 = (((hashCode + (c4059a == null ? 0 : c4059a.hashCode())) * 31) + this.f27095c.hashCode()) * 31;
            com.stripe.android.model.r rVar = this.f27096d;
            return ((hashCode2 + (rVar != null ? rVar.hashCode() : 0)) * 31) + this.f27097e.hashCode();
        }

        public final C4059a q() {
            return this.f27094b;
        }

        public String toString() {
            return "BacsPaymentMethod(initializationMode=" + this.f27093a + ", shippingDetails=" + this.f27094b + ", createParams=" + this.f27095c + ", optionsParams=" + this.f27096d + ", appearance=" + this.f27097e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeParcelable(this.f27093a, i8);
            C4059a c4059a = this.f27094b;
            if (c4059a == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                c4059a.writeToParcel(out, i8);
            }
            out.writeParcelable(this.f27095c, i8);
            out.writeParcelable(this.f27096d, i8);
            this.f27097e.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements l {

        /* renamed from: a, reason: collision with root package name */
        private final String f27099a;

        /* renamed from: b, reason: collision with root package name */
        private final o.e f27100b;

        /* renamed from: c, reason: collision with root package name */
        public static final int f27098c = o.e.f25502f;
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new b(parcel.readString(), (o.e) parcel.readParcelable(b.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(String type, o.e eVar) {
            AbstractC3255y.i(type, "type");
            this.f27099a = type;
            this.f27100b = eVar;
        }

        public final o.e a() {
            return this.f27100b;
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
            return AbstractC3255y.d(this.f27099a, bVar.f27099a) && AbstractC3255y.d(this.f27100b, bVar.f27100b);
        }

        public final String getType() {
            return this.f27099a;
        }

        public int hashCode() {
            int hashCode = this.f27099a.hashCode() * 31;
            o.e eVar = this.f27100b;
            return hashCode + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            return "ExternalPaymentMethod(type=" + this.f27099a + ", billingDetails=" + this.f27100b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f27099a);
            out.writeParcelable(this.f27100b, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements l {
        public static final Parcelable.Creator<c> CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        private final u.l f27101a;

        /* renamed from: b, reason: collision with root package name */
        private final C4059a f27102b;

        /* renamed from: c, reason: collision with root package name */
        private final a f27103c;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0610a();

            /* renamed from: a, reason: collision with root package name */
            private final u.k.c f27104a;

            /* renamed from: b, reason: collision with root package name */
            private final String f27105b;

            /* renamed from: c, reason: collision with root package name */
            private final String f27106c;

            /* renamed from: d, reason: collision with root package name */
            private final String f27107d;

            /* renamed from: e, reason: collision with root package name */
            private final Long f27108e;

            /* renamed from: f, reason: collision with root package name */
            private final String f27109f;

            /* renamed from: g, reason: collision with root package name */
            private final u.d f27110g;

            /* renamed from: com.stripe.android.paymentsheet.l$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0610a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new a(parcel.readInt() == 0 ? null : u.k.c.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), u.d.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public a(u.k.c cVar, String merchantName, String merchantCountryCode, String str, Long l8, String str2, u.d billingDetailsCollectionConfiguration) {
                AbstractC3255y.i(merchantName, "merchantName");
                AbstractC3255y.i(merchantCountryCode, "merchantCountryCode");
                AbstractC3255y.i(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
                this.f27104a = cVar;
                this.f27105b = merchantName;
                this.f27106c = merchantCountryCode;
                this.f27107d = str;
                this.f27108e = l8;
                this.f27109f = str2;
                this.f27110g = billingDetailsCollectionConfiguration;
            }

            public final u.d a() {
                return this.f27110g;
            }

            public final Long b() {
                return this.f27108e;
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
                return this.f27104a == aVar.f27104a && AbstractC3255y.d(this.f27105b, aVar.f27105b) && AbstractC3255y.d(this.f27106c, aVar.f27106c) && AbstractC3255y.d(this.f27107d, aVar.f27107d) && AbstractC3255y.d(this.f27108e, aVar.f27108e) && AbstractC3255y.d(this.f27109f, aVar.f27109f) && AbstractC3255y.d(this.f27110g, aVar.f27110g);
            }

            public final String g() {
                return this.f27109f;
            }

            public final u.k.c h() {
                return this.f27104a;
            }

            public int hashCode() {
                u.k.c cVar = this.f27104a;
                int hashCode = (((((cVar == null ? 0 : cVar.hashCode()) * 31) + this.f27105b.hashCode()) * 31) + this.f27106c.hashCode()) * 31;
                String str = this.f27107d;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Long l8 = this.f27108e;
                int hashCode3 = (hashCode2 + (l8 == null ? 0 : l8.hashCode())) * 31;
                String str2 = this.f27109f;
                return ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f27110g.hashCode();
            }

            public final String i() {
                return this.f27106c;
            }

            public final String l() {
                return this.f27107d;
            }

            public final String p() {
                return this.f27105b;
            }

            public String toString() {
                return "Config(environment=" + this.f27104a + ", merchantName=" + this.f27105b + ", merchantCountryCode=" + this.f27106c + ", merchantCurrencyCode=" + this.f27107d + ", customAmount=" + this.f27108e + ", customLabel=" + this.f27109f + ", billingDetailsCollectionConfiguration=" + this.f27110g + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                u.k.c cVar = this.f27104a;
                if (cVar == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeString(cVar.name());
                }
                out.writeString(this.f27105b);
                out.writeString(this.f27106c);
                out.writeString(this.f27107d);
                Long l8 = this.f27108e;
                if (l8 == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeLong(l8.longValue());
                }
                out.writeString(this.f27109f);
                this.f27110g.writeToParcel(out, i8);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new c((u.l) parcel.readParcelable(c.class.getClassLoader()), parcel.readInt() == 0 ? null : C4059a.CREATOR.createFromParcel(parcel), a.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(u.l initializationMode, C4059a c4059a, a config) {
            AbstractC3255y.i(initializationMode, "initializationMode");
            AbstractC3255y.i(config, "config");
            this.f27101a = initializationMode;
            this.f27102b = c4059a;
            this.f27103c = config;
        }

        public final u.l D() {
            return this.f27101a;
        }

        public final a a() {
            return this.f27103c;
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
            return AbstractC3255y.d(this.f27101a, cVar.f27101a) && AbstractC3255y.d(this.f27102b, cVar.f27102b) && AbstractC3255y.d(this.f27103c, cVar.f27103c);
        }

        public int hashCode() {
            int hashCode = this.f27101a.hashCode() * 31;
            C4059a c4059a = this.f27102b;
            return ((hashCode + (c4059a == null ? 0 : c4059a.hashCode())) * 31) + this.f27103c.hashCode();
        }

        public final C4059a q() {
            return this.f27102b;
        }

        public String toString() {
            return "GooglePay(initializationMode=" + this.f27101a + ", shippingDetails=" + this.f27102b + ", config=" + this.f27103c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeParcelable(this.f27101a, i8);
            C4059a c4059a = this.f27102b;
            if (c4059a == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                c4059a.writeToParcel(out, i8);
            }
            this.f27103c.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public interface d extends l {

        /* loaded from: classes4.dex */
        public static final class a implements d {

            /* renamed from: a, reason: collision with root package name */
            private final u.l f27112a;

            /* renamed from: b, reason: collision with root package name */
            private final C4059a f27113b;

            /* renamed from: c, reason: collision with root package name */
            private final com.stripe.android.model.p f27114c;

            /* renamed from: d, reason: collision with root package name */
            private final com.stripe.android.model.r f27115d;

            /* renamed from: e, reason: collision with root package name */
            private final boolean f27116e;

            /* renamed from: f, reason: collision with root package name */
            public static final int f27111f = com.stripe.android.model.r.f25711b | com.stripe.android.model.p.f25637v;
            public static final Parcelable.Creator<a> CREATOR = new C0611a();

            /* renamed from: com.stripe.android.paymentsheet.l$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0611a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new a((u.l) parcel.readParcelable(a.class.getClassLoader()), parcel.readInt() == 0 ? null : C4059a.CREATOR.createFromParcel(parcel), (com.stripe.android.model.p) parcel.readParcelable(a.class.getClassLoader()), (com.stripe.android.model.r) parcel.readParcelable(a.class.getClassLoader()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public a(u.l initializationMode, C4059a c4059a, com.stripe.android.model.p createParams, com.stripe.android.model.r rVar, boolean z8) {
                AbstractC3255y.i(initializationMode, "initializationMode");
                AbstractC3255y.i(createParams, "createParams");
                this.f27112a = initializationMode;
                this.f27113b = c4059a;
                this.f27114c = createParams;
                this.f27115d = rVar;
                this.f27116e = z8;
            }

            @Override // com.stripe.android.paymentsheet.l.d
            public u.l D() {
                return this.f27112a;
            }

            public final com.stripe.android.model.p a() {
                return this.f27114c;
            }

            public final com.stripe.android.model.r b() {
                return this.f27115d;
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
                return AbstractC3255y.d(this.f27112a, aVar.f27112a) && AbstractC3255y.d(this.f27113b, aVar.f27113b) && AbstractC3255y.d(this.f27114c, aVar.f27114c) && AbstractC3255y.d(this.f27115d, aVar.f27115d) && this.f27116e == aVar.f27116e;
            }

            public final boolean g() {
                return this.f27116e;
            }

            public int hashCode() {
                int hashCode = this.f27112a.hashCode() * 31;
                C4059a c4059a = this.f27113b;
                int hashCode2 = (((hashCode + (c4059a == null ? 0 : c4059a.hashCode())) * 31) + this.f27114c.hashCode()) * 31;
                com.stripe.android.model.r rVar = this.f27115d;
                return ((hashCode2 + (rVar != null ? rVar.hashCode() : 0)) * 31) + androidx.compose.foundation.a.a(this.f27116e);
            }

            @Override // com.stripe.android.paymentsheet.l.d
            public C4059a q() {
                return this.f27113b;
            }

            public String toString() {
                return "New(initializationMode=" + this.f27112a + ", shippingDetails=" + this.f27113b + ", createParams=" + this.f27114c + ", optionsParams=" + this.f27115d + ", shouldSave=" + this.f27116e + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeParcelable(this.f27112a, i8);
                C4059a c4059a = this.f27113b;
                if (c4059a == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    c4059a.writeToParcel(out, i8);
                }
                out.writeParcelable(this.f27114c, i8);
                out.writeParcelable(this.f27115d, i8);
                out.writeInt(this.f27116e ? 1 : 0);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements d {

            /* renamed from: a, reason: collision with root package name */
            private final u.l f27118a;

            /* renamed from: b, reason: collision with root package name */
            private final C4059a f27119b;

            /* renamed from: c, reason: collision with root package name */
            private final com.stripe.android.model.o f27120c;

            /* renamed from: d, reason: collision with root package name */
            private final com.stripe.android.model.r f27121d;

            /* renamed from: e, reason: collision with root package name */
            public static final int f27117e = com.stripe.android.model.r.f25711b | com.stripe.android.model.o.f25462u;
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new b((u.l) parcel.readParcelable(b.class.getClassLoader()), parcel.readInt() == 0 ? null : C4059a.CREATOR.createFromParcel(parcel), (com.stripe.android.model.o) parcel.readParcelable(b.class.getClassLoader()), (com.stripe.android.model.r) parcel.readParcelable(b.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            public b(u.l initializationMode, C4059a c4059a, com.stripe.android.model.o paymentMethod, com.stripe.android.model.r rVar) {
                AbstractC3255y.i(initializationMode, "initializationMode");
                AbstractC3255y.i(paymentMethod, "paymentMethod");
                this.f27118a = initializationMode;
                this.f27119b = c4059a;
                this.f27120c = paymentMethod;
                this.f27121d = rVar;
            }

            @Override // com.stripe.android.paymentsheet.l.d
            public u.l D() {
                return this.f27118a;
            }

            public final com.stripe.android.model.r a() {
                return this.f27121d;
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
                return AbstractC3255y.d(this.f27118a, bVar.f27118a) && AbstractC3255y.d(this.f27119b, bVar.f27119b) && AbstractC3255y.d(this.f27120c, bVar.f27120c) && AbstractC3255y.d(this.f27121d, bVar.f27121d);
            }

            public int hashCode() {
                int hashCode = this.f27118a.hashCode() * 31;
                C4059a c4059a = this.f27119b;
                int hashCode2 = (((hashCode + (c4059a == null ? 0 : c4059a.hashCode())) * 31) + this.f27120c.hashCode()) * 31;
                com.stripe.android.model.r rVar = this.f27121d;
                return hashCode2 + (rVar != null ? rVar.hashCode() : 0);
            }

            @Override // com.stripe.android.paymentsheet.l.d
            public C4059a q() {
                return this.f27119b;
            }

            public final com.stripe.android.model.o r() {
                return this.f27120c;
            }

            public String toString() {
                return "Saved(initializationMode=" + this.f27118a + ", shippingDetails=" + this.f27119b + ", paymentMethod=" + this.f27120c + ", optionsParams=" + this.f27121d + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeParcelable(this.f27118a, i8);
                C4059a c4059a = this.f27119b;
                if (c4059a == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    c4059a.writeToParcel(out, i8);
                }
                out.writeParcelable(this.f27120c, i8);
                out.writeParcelable(this.f27121d, i8);
            }
        }

        u.l D();

        C4059a q();
    }
}
