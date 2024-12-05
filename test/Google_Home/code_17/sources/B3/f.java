package B3;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.b;
import com.stripe.android.model.o;
import com.stripe.android.model.p;
import com.stripe.android.model.q;
import com.stripe.android.model.r;
import e3.C2797k;
import e3.EnumC2791e;
import e4.n;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import t3.t;

/* loaded from: classes4.dex */
public abstract class f implements Parcelable {

    /* loaded from: classes4.dex */
    public static final class a extends Enum {

        /* renamed from: b */
        public static final a f808b = new a("RequestReuse", 0, b.c.f25285c);

        /* renamed from: c */
        public static final a f809c = new a("RequestNoReuse", 1, b.c.f25286d);

        /* renamed from: d */
        public static final a f810d = new a("NoRequest", 2, null);

        /* renamed from: e */
        private static final /* synthetic */ a[] f811e;

        /* renamed from: f */
        private static final /* synthetic */ U5.a f812f;

        /* renamed from: a */
        private final b.c f813a;

        static {
            a[] a8 = a();
            f811e = a8;
            f812f = U5.b.a(a8);
        }

        private a(String str, int i8, b.c cVar) {
            super(str, i8);
            this.f813a = cVar;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f808b, f809c, f810d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f811e.clone();
        }

        public final b.c b() {
            return this.f813a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends f {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a */
        private final String f814a;

        /* renamed from: b */
        private final o.e f815b;

        /* renamed from: c */
        private final B2.b f816c;

        /* renamed from: d */
        private final int f817d;

        /* renamed from: e */
        private final String f818e;

        /* renamed from: f */
        private final String f819f;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new b(parcel.readString(), (o.e) parcel.readParcelable(b.class.getClassLoader()), (B2.b) parcel.readParcelable(b.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String type, o.e eVar, B2.b label, int i8, String str, String str2) {
            super(null);
            AbstractC3255y.i(type, "type");
            AbstractC3255y.i(label, "label");
            this.f814a = type;
            this.f815b = eVar;
            this.f816c = label;
            this.f817d = i8;
            this.f818e = str;
            this.f819f = str2;
        }

        @Override // B3.f
        public boolean a() {
            return false;
        }

        @Override // B3.f
        public B2.b b(String merchantName, boolean z8) {
            AbstractC3255y.i(merchantName, "merchantName");
            return null;
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
            if (AbstractC3255y.d(this.f814a, bVar.f814a) && AbstractC3255y.d(this.f815b, bVar.f815b) && AbstractC3255y.d(this.f816c, bVar.f816c) && this.f817d == bVar.f817d && AbstractC3255y.d(this.f818e, bVar.f818e) && AbstractC3255y.d(this.f819f, bVar.f819f)) {
                return true;
            }
            return false;
        }

        public final o.e g() {
            return this.f815b;
        }

        public final String getType() {
            return this.f814a;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3 = this.f814a.hashCode() * 31;
            o.e eVar = this.f815b;
            int i8 = 0;
            if (eVar == null) {
                hashCode = 0;
            } else {
                hashCode = eVar.hashCode();
            }
            int hashCode4 = (((((hashCode3 + hashCode) * 31) + this.f816c.hashCode()) * 31) + this.f817d) * 31;
            String str = this.f818e;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i9 = (hashCode4 + hashCode2) * 31;
            String str2 = this.f819f;
            if (str2 != null) {
                i8 = str2.hashCode();
            }
            return i9 + i8;
        }

        public String toString() {
            return "ExternalPaymentMethod(type=" + this.f814a + ", billingDetails=" + this.f815b + ", label=" + this.f816c + ", iconResource=" + this.f817d + ", lightThemeIconUrl=" + this.f818e + ", darkThemeIconUrl=" + this.f819f + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f814a);
            out.writeParcelable(this.f815b, i8);
            out.writeParcelable(this.f816c, i8);
            out.writeInt(this.f817d);
            out.writeString(this.f818e);
            out.writeString(this.f819f);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends f {

        /* renamed from: a */
        public static final c f820a = new c();
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                parcel.readInt();
                return c.f820a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        private c() {
            super(null);
        }

        @Override // B3.f
        public boolean a() {
            return false;
        }

        @Override // B3.f
        public B2.b b(String merchantName, boolean z8) {
            AbstractC3255y.i(merchantName, "merchantName");
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -61554386;
        }

        public String toString() {
            return "GooglePay";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends f {

        /* renamed from: a */
        public static final d f821a = new d();
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                parcel.readInt();
                return d.f821a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        private d() {
            super(null);
        }

        @Override // B3.f
        public boolean a() {
            return false;
        }

        @Override // B3.f
        public B2.b b(String merchantName, boolean z8) {
            AbstractC3255y.i(merchantName, "merchantName");
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -395165925;
        }

        public String toString() {
            return "Link";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class e extends f {

        /* loaded from: classes4.dex */
        public static final class a extends e {

            /* renamed from: a */
            private final p f823a;

            /* renamed from: b */
            private final EnumC2791e f824b;

            /* renamed from: c */
            private final a f825c;

            /* renamed from: d */
            private final r f826d;

            /* renamed from: e */
            private final q f827e;

            /* renamed from: f */
            private final String f828f;

            /* renamed from: g */
            public static final int f822g = (q.f25706b | r.f25711b) | p.f25637v;
            public static final Parcelable.Creator<a> CREATOR = new C0008a();

            /* renamed from: B3.f$e$a$a */
            /* loaded from: classes4.dex */
            public static final class C0008a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new a((p) parcel.readParcelable(a.class.getClassLoader()), EnumC2791e.valueOf(parcel.readString()), a.valueOf(parcel.readString()), (r) parcel.readParcelable(a.class.getClassLoader()), (q) parcel.readParcelable(a.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public /* synthetic */ a(p pVar, EnumC2791e enumC2791e, a aVar, r rVar, q qVar, int i8, AbstractC3247p abstractC3247p) {
                this(pVar, enumC2791e, aVar, (i8 & 8) != 0 ? null : rVar, (i8 & 16) != 0 ? null : qVar);
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
                if (AbstractC3255y.d(this.f823a, aVar.f823a) && this.f824b == aVar.f824b && this.f825c == aVar.f825c && AbstractC3255y.d(this.f826d, aVar.f826d) && AbstractC3255y.d(this.f827e, aVar.f827e)) {
                    return true;
                }
                return false;
            }

            @Override // B3.f.e
            public a g() {
                return this.f825c;
            }

            @Override // B3.f.e
            public p h() {
                return this.f823a;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = ((((this.f823a.hashCode() * 31) + this.f824b.hashCode()) * 31) + this.f825c.hashCode()) * 31;
                r rVar = this.f826d;
                int i8 = 0;
                if (rVar == null) {
                    hashCode = 0;
                } else {
                    hashCode = rVar.hashCode();
                }
                int i9 = (hashCode2 + hashCode) * 31;
                q qVar = this.f827e;
                if (qVar != null) {
                    i8 = qVar.hashCode();
                }
                return i9 + i8;
            }

            @Override // B3.f.e
            public q i() {
                return this.f827e;
            }

            @Override // B3.f.e
            public r l() {
                return this.f826d;
            }

            public String toString() {
                return "Card(paymentMethodCreateParams=" + this.f823a + ", brand=" + this.f824b + ", customerRequestedSave=" + this.f825c + ", paymentMethodOptionsParams=" + this.f826d + ", paymentMethodExtraParams=" + this.f827e + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeParcelable(this.f823a, i8);
                out.writeString(this.f824b.name());
                out.writeString(this.f825c.name());
                out.writeParcelable(this.f826d, i8);
                out.writeParcelable(this.f827e, i8);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p paymentMethodCreateParams, EnumC2791e brand, a customerRequestedSave, r rVar, q qVar) {
                super(null);
                AbstractC3255y.i(paymentMethodCreateParams, "paymentMethodCreateParams");
                AbstractC3255y.i(brand, "brand");
                AbstractC3255y.i(customerRequestedSave, "customerRequestedSave");
                this.f823a = paymentMethodCreateParams;
                this.f824b = brand;
                this.f825c = customerRequestedSave;
                this.f826d = rVar;
                this.f827e = qVar;
                String b8 = h().b();
                this.f828f = b8 == null ? "" : b8;
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends e {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: a */
            private final B2.b f829a;

            /* renamed from: b */
            private final int f830b;

            /* renamed from: c */
            private final String f831c;

            /* renamed from: d */
            private final String f832d;

            /* renamed from: e */
            private final p f833e;

            /* renamed from: f */
            private final a f834f;

            /* renamed from: g */
            private final r f835g;

            /* renamed from: h */
            private final q f836h;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new b((B2.b) parcel.readParcelable(b.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readString(), (p) parcel.readParcelable(b.class.getClassLoader()), a.valueOf(parcel.readString()), (r) parcel.readParcelable(b.class.getClassLoader()), (q) parcel.readParcelable(b.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(B2.b label, int i8, String str, String str2, p paymentMethodCreateParams, a customerRequestedSave, r rVar, q qVar) {
                super(null);
                AbstractC3255y.i(label, "label");
                AbstractC3255y.i(paymentMethodCreateParams, "paymentMethodCreateParams");
                AbstractC3255y.i(customerRequestedSave, "customerRequestedSave");
                this.f829a = label;
                this.f830b = i8;
                this.f831c = str;
                this.f832d = str2;
                this.f833e = paymentMethodCreateParams;
                this.f834f = customerRequestedSave;
                this.f835g = rVar;
                this.f836h = qVar;
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
                if (AbstractC3255y.d(this.f829a, bVar.f829a) && this.f830b == bVar.f830b && AbstractC3255y.d(this.f831c, bVar.f831c) && AbstractC3255y.d(this.f832d, bVar.f832d) && AbstractC3255y.d(this.f833e, bVar.f833e) && this.f834f == bVar.f834f && AbstractC3255y.d(this.f835g, bVar.f835g) && AbstractC3255y.d(this.f836h, bVar.f836h)) {
                    return true;
                }
                return false;
            }

            @Override // B3.f.e
            public a g() {
                return this.f834f;
            }

            @Override // B3.f.e
            public p h() {
                return this.f833e;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                int hashCode3;
                int hashCode4 = ((this.f829a.hashCode() * 31) + this.f830b) * 31;
                String str = this.f831c;
                int i8 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i9 = (hashCode4 + hashCode) * 31;
                String str2 = this.f832d;
                if (str2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str2.hashCode();
                }
                int hashCode5 = (((((i9 + hashCode2) * 31) + this.f833e.hashCode()) * 31) + this.f834f.hashCode()) * 31;
                r rVar = this.f835g;
                if (rVar == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = rVar.hashCode();
                }
                int i10 = (hashCode5 + hashCode3) * 31;
                q qVar = this.f836h;
                if (qVar != null) {
                    i8 = qVar.hashCode();
                }
                return i10 + i8;
            }

            @Override // B3.f.e
            public q i() {
                return this.f836h;
            }

            @Override // B3.f.e
            public r l() {
                return this.f835g;
            }

            public String toString() {
                return "GenericPaymentMethod(label=" + this.f829a + ", iconResource=" + this.f830b + ", lightThemeIconUrl=" + this.f831c + ", darkThemeIconUrl=" + this.f832d + ", paymentMethodCreateParams=" + this.f833e + ", customerRequestedSave=" + this.f834f + ", paymentMethodOptionsParams=" + this.f835g + ", paymentMethodExtraParams=" + this.f836h + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeParcelable(this.f829a, i8);
                out.writeInt(this.f830b);
                out.writeString(this.f831c);
                out.writeString(this.f832d);
                out.writeParcelable(this.f833e, i8);
                out.writeString(this.f834f.name());
                out.writeParcelable(this.f835g, i8);
                out.writeParcelable(this.f836h, i8);
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends e {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* renamed from: a */
            private final N2.f f837a;

            /* renamed from: b */
            private final a f838b;

            /* renamed from: c */
            private final C2797k.e f839c;

            /* renamed from: d */
            private final p f840d;

            /* renamed from: e */
            private final r.b f841e;

            /* renamed from: f */
            private final Void f842f;

            /* renamed from: g */
            private final int f843g;

            /* renamed from: h */
            private final String f844h;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new c((N2.f) parcel.readParcelable(c.class.getClassLoader()), a.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(N2.f linkPaymentDetails, a customerRequestedSave) {
                super(null);
                AbstractC3255y.i(linkPaymentDetails, "linkPaymentDetails");
                AbstractC3255y.i(customerRequestedSave, "customerRequestedSave");
                this.f837a = linkPaymentDetails;
                this.f838b = customerRequestedSave;
                C2797k.e a8 = linkPaymentDetails.a();
                this.f839c = a8;
                this.f840d = linkPaymentDetails.b();
                this.f841e = new r.b(null, null, g().b(), 3, null);
                this.f843g = t.f39736u;
                this.f844h = "····" + a8.a();
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
                if (AbstractC3255y.d(this.f837a, cVar.f837a) && this.f838b == cVar.f838b) {
                    return true;
                }
                return false;
            }

            @Override // B3.f.e
            public a g() {
                return this.f838b;
            }

            @Override // B3.f.e
            public p h() {
                return this.f840d;
            }

            public int hashCode() {
                return (this.f837a.hashCode() * 31) + this.f838b.hashCode();
            }

            @Override // B3.f.e
            public /* bridge */ /* synthetic */ q i() {
                return (q) p();
            }

            public Void p() {
                return this.f842f;
            }

            @Override // B3.f.e
            /* renamed from: s */
            public r.b l() {
                return this.f841e;
            }

            public String toString() {
                return "LinkInline(linkPaymentDetails=" + this.f837a + ", customerRequestedSave=" + this.f838b + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeParcelable(this.f837a, i8);
                out.writeString(this.f838b.name());
            }
        }

        /* loaded from: classes4.dex */
        public static final class d extends e {
            public static final Parcelable.Creator<d> CREATOR = new a();

            /* renamed from: a */
            private final String f845a;

            /* renamed from: b */
            private final int f846b;

            /* renamed from: c */
            private final b f847c;

            /* renamed from: d */
            private final E3.f f848d;

            /* renamed from: e */
            private final c f849e;

            /* renamed from: f */
            private final p f850f;

            /* renamed from: g */
            private final a f851g;

            /* renamed from: h */
            private final r f852h;

            /* renamed from: i */
            private final q f853i;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public final d createFromParcel(Parcel parcel) {
                    c createFromParcel;
                    AbstractC3255y.i(parcel, "parcel");
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    b createFromParcel2 = b.CREATOR.createFromParcel(parcel);
                    E3.f fVar = (E3.f) parcel.readParcelable(d.class.getClassLoader());
                    if (parcel.readInt() == 0) {
                        createFromParcel = null;
                    } else {
                        createFromParcel = c.CREATOR.createFromParcel(parcel);
                    }
                    return new d(readString, readInt, createFromParcel2, fVar, createFromParcel, (p) parcel.readParcelable(d.class.getClassLoader()), a.valueOf(parcel.readString()), (r) parcel.readParcelable(d.class.getClassLoader()), (q) parcel.readParcelable(d.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public final d[] newArray(int i8) {
                    return new d[i8];
                }
            }

            /* loaded from: classes4.dex */
            public static final class b implements Parcelable {

                /* renamed from: a */
                private final String f855a;

                /* renamed from: b */
                private final String f856b;

                /* renamed from: c */
                private final String f857c;

                /* renamed from: d */
                private final com.stripe.android.model.a f858d;

                /* renamed from: e */
                private final boolean f859e;

                /* renamed from: f */
                public static final int f854f = com.stripe.android.model.a.f25255h;
                public static final Parcelable.Creator<b> CREATOR = new a();

                /* loaded from: classes4.dex */
                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a */
                    public final b createFromParcel(Parcel parcel) {
                        boolean z8;
                        AbstractC3255y.i(parcel, "parcel");
                        String readString = parcel.readString();
                        String readString2 = parcel.readString();
                        String readString3 = parcel.readString();
                        com.stripe.android.model.a aVar = (com.stripe.android.model.a) parcel.readParcelable(b.class.getClassLoader());
                        if (parcel.readInt() != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        return new b(readString, readString2, readString3, aVar, z8);
                    }

                    @Override // android.os.Parcelable.Creator
                    /* renamed from: b */
                    public final b[] newArray(int i8) {
                        return new b[i8];
                    }
                }

                public b(String name, String str, String str2, com.stripe.android.model.a aVar, boolean z8) {
                    AbstractC3255y.i(name, "name");
                    this.f855a = name;
                    this.f856b = str;
                    this.f857c = str2;
                    this.f858d = aVar;
                    this.f859e = z8;
                }

                public final com.stripe.android.model.a a() {
                    return this.f858d;
                }

                public final String b() {
                    return this.f856b;
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
                    if (AbstractC3255y.d(this.f855a, bVar.f855a) && AbstractC3255y.d(this.f856b, bVar.f856b) && AbstractC3255y.d(this.f857c, bVar.f857c) && AbstractC3255y.d(this.f858d, bVar.f858d) && this.f859e == bVar.f859e) {
                        return true;
                    }
                    return false;
                }

                public final String g() {
                    return this.f855a;
                }

                public final String h() {
                    return this.f857c;
                }

                public int hashCode() {
                    int hashCode;
                    int hashCode2;
                    int hashCode3 = this.f855a.hashCode() * 31;
                    String str = this.f856b;
                    int i8 = 0;
                    if (str == null) {
                        hashCode = 0;
                    } else {
                        hashCode = str.hashCode();
                    }
                    int i9 = (hashCode3 + hashCode) * 31;
                    String str2 = this.f857c;
                    if (str2 == null) {
                        hashCode2 = 0;
                    } else {
                        hashCode2 = str2.hashCode();
                    }
                    int i10 = (i9 + hashCode2) * 31;
                    com.stripe.android.model.a aVar = this.f858d;
                    if (aVar != null) {
                        i8 = aVar.hashCode();
                    }
                    return ((i10 + i8) * 31) + androidx.compose.foundation.a.a(this.f859e);
                }

                public final boolean i() {
                    return this.f859e;
                }

                public String toString() {
                    return "Input(name=" + this.f855a + ", email=" + this.f856b + ", phone=" + this.f857c + ", address=" + this.f858d + ", saveForFutureUse=" + this.f859e + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i8) {
                    AbstractC3255y.i(out, "out");
                    out.writeString(this.f855a);
                    out.writeString(this.f856b);
                    out.writeString(this.f857c);
                    out.writeParcelable(this.f858d, i8);
                    out.writeInt(this.f859e ? 1 : 0);
                }
            }

            /* loaded from: classes4.dex */
            public static final class c implements Parcelable {
                public static final Parcelable.Creator<c> CREATOR = new a();

                /* renamed from: a */
                private final String f860a;

                /* loaded from: classes4.dex */
                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a */
                    public final c createFromParcel(Parcel parcel) {
                        AbstractC3255y.i(parcel, "parcel");
                        return new c(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    /* renamed from: b */
                    public final c[] newArray(int i8) {
                        return new c[i8];
                    }
                }

                public c(String paymentMethodId) {
                    AbstractC3255y.i(paymentMethodId, "paymentMethodId");
                    this.f860a = paymentMethodId;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if ((obj instanceof c) && AbstractC3255y.d(this.f860a, ((c) obj).f860a)) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    return this.f860a.hashCode();
                }

                public String toString() {
                    return "InstantDebitsInfo(paymentMethodId=" + this.f860a + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i8) {
                    AbstractC3255y.i(out, "out");
                    out.writeString(this.f860a);
                }
            }

            public /* synthetic */ d(String str, int i8, b bVar, E3.f fVar, c cVar, p pVar, a aVar, r rVar, q qVar, int i9, AbstractC3247p abstractC3247p) {
                this(str, i8, bVar, fVar, cVar, pVar, aVar, (i9 & 128) != 0 ? null : rVar, (i9 & 256) != 0 ? null : qVar);
            }

            @Override // B3.f.e, B3.f
            public B2.b b(String merchantName, boolean z8) {
                AbstractC3255y.i(merchantName, "merchantName");
                return this.f848d.b();
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
                if (AbstractC3255y.d(this.f845a, dVar.f845a) && this.f846b == dVar.f846b && AbstractC3255y.d(this.f847c, dVar.f847c) && AbstractC3255y.d(this.f848d, dVar.f848d) && AbstractC3255y.d(this.f849e, dVar.f849e) && AbstractC3255y.d(this.f850f, dVar.f850f) && this.f851g == dVar.f851g && AbstractC3255y.d(this.f852h, dVar.f852h) && AbstractC3255y.d(this.f853i, dVar.f853i)) {
                    return true;
                }
                return false;
            }

            @Override // B3.f.e
            public a g() {
                return this.f851g;
            }

            @Override // B3.f.e
            public p h() {
                return this.f850f;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                int hashCode3 = ((((((this.f845a.hashCode() * 31) + this.f846b) * 31) + this.f847c.hashCode()) * 31) + this.f848d.hashCode()) * 31;
                c cVar = this.f849e;
                int i8 = 0;
                if (cVar == null) {
                    hashCode = 0;
                } else {
                    hashCode = cVar.hashCode();
                }
                int hashCode4 = (((((hashCode3 + hashCode) * 31) + this.f850f.hashCode()) * 31) + this.f851g.hashCode()) * 31;
                r rVar = this.f852h;
                if (rVar == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = rVar.hashCode();
                }
                int i9 = (hashCode4 + hashCode2) * 31;
                q qVar = this.f853i;
                if (qVar != null) {
                    i8 = qVar.hashCode();
                }
                return i9 + i8;
            }

            @Override // B3.f.e
            public q i() {
                return this.f853i;
            }

            @Override // B3.f.e
            public r l() {
                return this.f852h;
            }

            public final b p() {
                return this.f847c;
            }

            public final c s() {
                return this.f849e;
            }

            public String toString() {
                return "USBankAccount(labelResource=" + this.f845a + ", iconResource=" + this.f846b + ", input=" + this.f847c + ", screenState=" + this.f848d + ", instantDebits=" + this.f849e + ", paymentMethodCreateParams=" + this.f850f + ", customerRequestedSave=" + this.f851g + ", paymentMethodOptionsParams=" + this.f852h + ", paymentMethodExtraParams=" + this.f853i + ")";
            }

            public final E3.f u() {
                return this.f848d;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeString(this.f845a);
                out.writeInt(this.f846b);
                this.f847c.writeToParcel(out, i8);
                out.writeParcelable(this.f848d, i8);
                c cVar = this.f849e;
                if (cVar == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    cVar.writeToParcel(out, i8);
                }
                out.writeParcelable(this.f850f, i8);
                out.writeString(this.f851g.name());
                out.writeParcelable(this.f852h, i8);
                out.writeParcelable(this.f853i, i8);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String labelResource, int i8, b input, E3.f screenState, c cVar, p paymentMethodCreateParams, a customerRequestedSave, r rVar, q qVar) {
                super(null);
                AbstractC3255y.i(labelResource, "labelResource");
                AbstractC3255y.i(input, "input");
                AbstractC3255y.i(screenState, "screenState");
                AbstractC3255y.i(paymentMethodCreateParams, "paymentMethodCreateParams");
                AbstractC3255y.i(customerRequestedSave, "customerRequestedSave");
                this.f845a = labelResource;
                this.f846b = i8;
                this.f847c = input;
                this.f848d = screenState;
                this.f849e = cVar;
                this.f850f = paymentMethodCreateParams;
                this.f851g = customerRequestedSave;
                this.f852h = rVar;
                this.f853i = qVar;
            }
        }

        public /* synthetic */ e(AbstractC3247p abstractC3247p) {
            this();
        }

        @Override // B3.f
        public boolean a() {
            return false;
        }

        @Override // B3.f
        public B2.b b(String merchantName, boolean z8) {
            AbstractC3255y.i(merchantName, "merchantName");
            return null;
        }

        public abstract a g();

        public abstract p h();

        public abstract q i();

        public abstract r l();

        private e() {
            super(null);
        }
    }

    /* renamed from: B3.f$f */
    /* loaded from: classes4.dex */
    public static final class C0009f extends f {

        /* renamed from: a */
        private final o f862a;

        /* renamed from: b */
        private final b f863b;

        /* renamed from: c */
        private final r f864c;

        /* renamed from: d */
        public static final int f861d = r.f25711b | o.f25462u;
        public static final Parcelable.Creator<C0009f> CREATOR = new a();

        /* renamed from: B3.f$f$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final C0009f createFromParcel(Parcel parcel) {
                b valueOf;
                AbstractC3255y.i(parcel, "parcel");
                o oVar = (o) parcel.readParcelable(C0009f.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = b.valueOf(parcel.readString());
                }
                return new C0009f(oVar, valueOf, (r) parcel.readParcelable(C0009f.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final C0009f[] newArray(int i8) {
                return new C0009f[i8];
            }
        }

        /* renamed from: B3.f$f$b */
        /* loaded from: classes4.dex */
        public static final class b extends Enum {

            /* renamed from: b */
            public static final b f865b = new b("GooglePay", 0, c.f820a);

            /* renamed from: c */
            public static final b f866c = new b("Link", 1, d.f821a);

            /* renamed from: d */
            private static final /* synthetic */ b[] f867d;

            /* renamed from: e */
            private static final /* synthetic */ U5.a f868e;

            /* renamed from: a */
            private final f f869a;

            static {
                b[] a8 = a();
                f867d = a8;
                f868e = U5.b.a(a8);
            }

            private b(String str, int i8, f fVar) {
                super(str, i8);
                this.f869a = fVar;
            }

            private static final /* synthetic */ b[] a() {
                return new b[]{f865b, f866c};
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) f867d.clone();
            }

            public final f b() {
                return this.f869a;
            }
        }

        /* renamed from: B3.f$f$c */
        /* loaded from: classes4.dex */
        public /* synthetic */ class c {

            /* renamed from: a */
            public static final /* synthetic */ int[] f870a;

            static {
                int[] iArr = new int[o.p.values().length];
                try {
                    iArr[o.p.f25577O.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[o.p.f25591m.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f870a = iArr;
            }
        }

        public /* synthetic */ C0009f(o oVar, b bVar, r rVar, int i8, AbstractC3247p abstractC3247p) {
            this(oVar, (i8 & 2) != 0 ? null : bVar, (i8 & 4) != 0 ? null : rVar);
        }

        public static /* synthetic */ C0009f h(C0009f c0009f, o oVar, b bVar, r rVar, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                oVar = c0009f.f862a;
            }
            if ((i8 & 2) != 0) {
                bVar = c0009f.f863b;
            }
            if ((i8 & 4) != 0) {
                rVar = c0009f.f864c;
            }
            return c0009f.g(oVar, bVar, rVar);
        }

        @Override // B3.f
        public boolean a() {
            o.p pVar = this.f862a.f25467e;
            if (pVar != o.p.f25577O && pVar != o.p.f25591m) {
                return false;
            }
            return true;
        }

        @Override // B3.f
        public B2.b b(String merchantName, boolean z8) {
            int i8;
            AbstractC3255y.i(merchantName, "merchantName");
            o.p pVar = this.f862a.f25467e;
            if (pVar == null) {
                i8 = -1;
            } else {
                i8 = c.f870a[pVar.ordinal()];
            }
            if (i8 != 1) {
                if (i8 != 2) {
                    return null;
                }
                return B2.c.f(n.f31693B0, new Object[]{merchantName}, null, 4, null);
            }
            return E3.i.f2566a.a(merchantName, false, false, z8);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0009f)) {
                return false;
            }
            C0009f c0009f = (C0009f) obj;
            if (AbstractC3255y.d(this.f862a, c0009f.f862a) && this.f863b == c0009f.f863b && AbstractC3255y.d(this.f864c, c0009f.f864c)) {
                return true;
            }
            return false;
        }

        public final C0009f g(o paymentMethod, b bVar, r rVar) {
            AbstractC3255y.i(paymentMethod, "paymentMethod");
            return new C0009f(paymentMethod, bVar, rVar);
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f862a.hashCode() * 31;
            b bVar = this.f863b;
            int i8 = 0;
            if (bVar == null) {
                hashCode = 0;
            } else {
                hashCode = bVar.hashCode();
            }
            int i9 = (hashCode2 + hashCode) * 31;
            r rVar = this.f864c;
            if (rVar != null) {
                i8 = rVar.hashCode();
            }
            return i9 + i8;
        }

        public final r i() {
            return this.f864c;
        }

        public final boolean l() {
            if (this.f862a.f25467e == o.p.f25591m) {
                return true;
            }
            return false;
        }

        public final b p() {
            return this.f863b;
        }

        public final o r() {
            return this.f862a;
        }

        public String toString() {
            return "Saved(paymentMethod=" + this.f862a + ", walletType=" + this.f863b + ", paymentMethodOptionsParams=" + this.f864c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeParcelable(this.f862a, i8);
            b bVar = this.f863b;
            if (bVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(bVar.name());
            }
            out.writeParcelable(this.f864c, i8);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0009f(o paymentMethod, b bVar, r rVar) {
            super(null);
            AbstractC3255y.i(paymentMethod, "paymentMethod");
            this.f862a = paymentMethod;
            this.f863b = bVar;
            this.f864c = rVar;
        }
    }

    private f() {
    }

    public abstract boolean a();

    public abstract B2.b b(String str, boolean z8);

    public /* synthetic */ f(AbstractC3247p abstractC3247p) {
        this();
    }
}
