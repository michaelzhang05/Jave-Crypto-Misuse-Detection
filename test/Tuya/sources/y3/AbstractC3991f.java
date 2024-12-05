package y3;

import android.os.Parcel;
import android.os.Parcelable;
import b3.C1876k;
import b3.EnumC1870e;
import b4.n;
import com.stripe.android.model.b;
import com.stripe.android.model.o;
import com.stripe.android.model.p;
import com.stripe.android.model.q;
import com.stripe.android.model.r;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import q3.t;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;

/* renamed from: y3.f */
/* loaded from: classes4.dex */
public abstract class AbstractC3991f implements Parcelable {

    /* renamed from: y3.f$a */
    /* loaded from: classes4.dex */
    public static final class a extends Enum {

        /* renamed from: b */
        public static final a f39764b = new a("RequestReuse", 0, b.c.f24230c);

        /* renamed from: c */
        public static final a f39765c = new a("RequestNoReuse", 1, b.c.f24231d);

        /* renamed from: d */
        public static final a f39766d = new a("NoRequest", 2, null);

        /* renamed from: e */
        private static final /* synthetic */ a[] f39767e;

        /* renamed from: f */
        private static final /* synthetic */ R5.a f39768f;

        /* renamed from: a */
        private final b.c f39769a;

        static {
            a[] a8 = a();
            f39767e = a8;
            f39768f = R5.b.a(a8);
        }

        private a(String str, int i8, b.c cVar) {
            super(str, i8);
            this.f39769a = cVar;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f39764b, f39765c, f39766d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f39767e.clone();
        }

        public final b.c b() {
            return this.f39769a;
        }
    }

    /* renamed from: y3.f$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3991f {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a */
        private final String f39770a;

        /* renamed from: b */
        private final o.e f39771b;

        /* renamed from: c */
        private final InterfaceC3983b f39772c;

        /* renamed from: d */
        private final int f39773d;

        /* renamed from: e */
        private final String f39774e;

        /* renamed from: f */
        private final String f39775f;

        /* renamed from: y3.f$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new b(parcel.readString(), (o.e) parcel.readParcelable(b.class.getClassLoader()), (InterfaceC3983b) parcel.readParcelable(b.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String type, o.e eVar, InterfaceC3983b label, int i8, String str, String str2) {
            super(null);
            AbstractC3159y.i(type, "type");
            AbstractC3159y.i(label, "label");
            this.f39770a = type;
            this.f39771b = eVar;
            this.f39772c = label;
            this.f39773d = i8;
            this.f39774e = str;
            this.f39775f = str2;
        }

        @Override // y3.AbstractC3991f
        public boolean b() {
            return false;
        }

        @Override // y3.AbstractC3991f
        public InterfaceC3983b c(String merchantName, boolean z8) {
            AbstractC3159y.i(merchantName, "merchantName");
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final o.e e() {
            return this.f39771b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (AbstractC3159y.d(this.f39770a, bVar.f39770a) && AbstractC3159y.d(this.f39771b, bVar.f39771b) && AbstractC3159y.d(this.f39772c, bVar.f39772c) && this.f39773d == bVar.f39773d && AbstractC3159y.d(this.f39774e, bVar.f39774e) && AbstractC3159y.d(this.f39775f, bVar.f39775f)) {
                return true;
            }
            return false;
        }

        public final String getType() {
            return this.f39770a;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3 = this.f39770a.hashCode() * 31;
            o.e eVar = this.f39771b;
            int i8 = 0;
            if (eVar == null) {
                hashCode = 0;
            } else {
                hashCode = eVar.hashCode();
            }
            int hashCode4 = (((((hashCode3 + hashCode) * 31) + this.f39772c.hashCode()) * 31) + this.f39773d) * 31;
            String str = this.f39774e;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i9 = (hashCode4 + hashCode2) * 31;
            String str2 = this.f39775f;
            if (str2 != null) {
                i8 = str2.hashCode();
            }
            return i9 + i8;
        }

        public String toString() {
            return "ExternalPaymentMethod(type=" + this.f39770a + ", billingDetails=" + this.f39771b + ", label=" + this.f39772c + ", iconResource=" + this.f39773d + ", lightThemeIconUrl=" + this.f39774e + ", darkThemeIconUrl=" + this.f39775f + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f39770a);
            out.writeParcelable(this.f39771b, i8);
            out.writeParcelable(this.f39772c, i8);
            out.writeInt(this.f39773d);
            out.writeString(this.f39774e);
            out.writeString(this.f39775f);
        }
    }

    /* renamed from: y3.f$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3991f {

        /* renamed from: a */
        public static final c f39776a = new c();
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: y3.f$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                parcel.readInt();
                return c.f39776a;
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

        @Override // y3.AbstractC3991f
        public boolean b() {
            return false;
        }

        @Override // y3.AbstractC3991f
        public InterfaceC3983b c(String merchantName, boolean z8) {
            AbstractC3159y.i(merchantName, "merchantName");
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
            AbstractC3159y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* renamed from: y3.f$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3991f {

        /* renamed from: a */
        public static final d f39777a = new d();
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: y3.f$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                parcel.readInt();
                return d.f39777a;
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

        @Override // y3.AbstractC3991f
        public boolean b() {
            return false;
        }

        @Override // y3.AbstractC3991f
        public InterfaceC3983b c(String merchantName, boolean z8) {
            AbstractC3159y.i(merchantName, "merchantName");
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
            AbstractC3159y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* renamed from: y3.f$e */
    /* loaded from: classes4.dex */
    public static abstract class e extends AbstractC3991f {

        /* renamed from: y3.f$e$a */
        /* loaded from: classes4.dex */
        public static final class a extends e {

            /* renamed from: a */
            private final p f39779a;

            /* renamed from: b */
            private final EnumC1870e f39780b;

            /* renamed from: c */
            private final a f39781c;

            /* renamed from: d */
            private final r f39782d;

            /* renamed from: e */
            private final q f39783e;

            /* renamed from: f */
            private final String f39784f;

            /* renamed from: g */
            public static final int f39778g = (q.f24651b | r.f24656b) | p.f24582v;
            public static final Parcelable.Creator<a> CREATOR = new C0915a();

            /* renamed from: y3.f$e$a$a */
            /* loaded from: classes4.dex */
            public static final class C0915a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new a((p) parcel.readParcelable(a.class.getClassLoader()), EnumC1870e.valueOf(parcel.readString()), a.valueOf(parcel.readString()), (r) parcel.readParcelable(a.class.getClassLoader()), (q) parcel.readParcelable(a.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public /* synthetic */ a(p pVar, EnumC1870e enumC1870e, a aVar, r rVar, q qVar, int i8, AbstractC3151p abstractC3151p) {
                this(pVar, enumC1870e, aVar, (i8 & 8) != 0 ? null : rVar, (i8 & 16) != 0 ? null : qVar);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // y3.AbstractC3991f.e
            public a e() {
                return this.f39781c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                if (AbstractC3159y.d(this.f39779a, aVar.f39779a) && this.f39780b == aVar.f39780b && this.f39781c == aVar.f39781c && AbstractC3159y.d(this.f39782d, aVar.f39782d) && AbstractC3159y.d(this.f39783e, aVar.f39783e)) {
                    return true;
                }
                return false;
            }

            @Override // y3.AbstractC3991f.e
            public p f() {
                return this.f39779a;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = ((((this.f39779a.hashCode() * 31) + this.f39780b.hashCode()) * 31) + this.f39781c.hashCode()) * 31;
                r rVar = this.f39782d;
                int i8 = 0;
                if (rVar == null) {
                    hashCode = 0;
                } else {
                    hashCode = rVar.hashCode();
                }
                int i9 = (hashCode2 + hashCode) * 31;
                q qVar = this.f39783e;
                if (qVar != null) {
                    i8 = qVar.hashCode();
                }
                return i9 + i8;
            }

            @Override // y3.AbstractC3991f.e
            public q i() {
                return this.f39783e;
            }

            @Override // y3.AbstractC3991f.e
            public r j() {
                return this.f39782d;
            }

            public String toString() {
                return "Card(paymentMethodCreateParams=" + this.f39779a + ", brand=" + this.f39780b + ", customerRequestedSave=" + this.f39781c + ", paymentMethodOptionsParams=" + this.f39782d + ", paymentMethodExtraParams=" + this.f39783e + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeParcelable(this.f39779a, i8);
                out.writeString(this.f39780b.name());
                out.writeString(this.f39781c.name());
                out.writeParcelable(this.f39782d, i8);
                out.writeParcelable(this.f39783e, i8);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p paymentMethodCreateParams, EnumC1870e brand, a customerRequestedSave, r rVar, q qVar) {
                super(null);
                AbstractC3159y.i(paymentMethodCreateParams, "paymentMethodCreateParams");
                AbstractC3159y.i(brand, "brand");
                AbstractC3159y.i(customerRequestedSave, "customerRequestedSave");
                this.f39779a = paymentMethodCreateParams;
                this.f39780b = brand;
                this.f39781c = customerRequestedSave;
                this.f39782d = rVar;
                this.f39783e = qVar;
                String c8 = f().c();
                this.f39784f = c8 == null ? "" : c8;
            }
        }

        /* renamed from: y3.f$e$b */
        /* loaded from: classes4.dex */
        public static final class b extends e {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: a */
            private final InterfaceC3983b f39785a;

            /* renamed from: b */
            private final int f39786b;

            /* renamed from: c */
            private final String f39787c;

            /* renamed from: d */
            private final String f39788d;

            /* renamed from: e */
            private final p f39789e;

            /* renamed from: f */
            private final a f39790f;

            /* renamed from: g */
            private final r f39791g;

            /* renamed from: h */
            private final q f39792h;

            /* renamed from: y3.f$e$b$a */
            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new b((InterfaceC3983b) parcel.readParcelable(b.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readString(), (p) parcel.readParcelable(b.class.getClassLoader()), a.valueOf(parcel.readString()), (r) parcel.readParcelable(b.class.getClassLoader()), (q) parcel.readParcelable(b.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC3983b label, int i8, String str, String str2, p paymentMethodCreateParams, a customerRequestedSave, r rVar, q qVar) {
                super(null);
                AbstractC3159y.i(label, "label");
                AbstractC3159y.i(paymentMethodCreateParams, "paymentMethodCreateParams");
                AbstractC3159y.i(customerRequestedSave, "customerRequestedSave");
                this.f39785a = label;
                this.f39786b = i8;
                this.f39787c = str;
                this.f39788d = str2;
                this.f39789e = paymentMethodCreateParams;
                this.f39790f = customerRequestedSave;
                this.f39791g = rVar;
                this.f39792h = qVar;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // y3.AbstractC3991f.e
            public a e() {
                return this.f39790f;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                if (AbstractC3159y.d(this.f39785a, bVar.f39785a) && this.f39786b == bVar.f39786b && AbstractC3159y.d(this.f39787c, bVar.f39787c) && AbstractC3159y.d(this.f39788d, bVar.f39788d) && AbstractC3159y.d(this.f39789e, bVar.f39789e) && this.f39790f == bVar.f39790f && AbstractC3159y.d(this.f39791g, bVar.f39791g) && AbstractC3159y.d(this.f39792h, bVar.f39792h)) {
                    return true;
                }
                return false;
            }

            @Override // y3.AbstractC3991f.e
            public p f() {
                return this.f39789e;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                int hashCode3;
                int hashCode4 = ((this.f39785a.hashCode() * 31) + this.f39786b) * 31;
                String str = this.f39787c;
                int i8 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i9 = (hashCode4 + hashCode) * 31;
                String str2 = this.f39788d;
                if (str2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str2.hashCode();
                }
                int hashCode5 = (((((i9 + hashCode2) * 31) + this.f39789e.hashCode()) * 31) + this.f39790f.hashCode()) * 31;
                r rVar = this.f39791g;
                if (rVar == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = rVar.hashCode();
                }
                int i10 = (hashCode5 + hashCode3) * 31;
                q qVar = this.f39792h;
                if (qVar != null) {
                    i8 = qVar.hashCode();
                }
                return i10 + i8;
            }

            @Override // y3.AbstractC3991f.e
            public q i() {
                return this.f39792h;
            }

            @Override // y3.AbstractC3991f.e
            public r j() {
                return this.f39791g;
            }

            public String toString() {
                return "GenericPaymentMethod(label=" + this.f39785a + ", iconResource=" + this.f39786b + ", lightThemeIconUrl=" + this.f39787c + ", darkThemeIconUrl=" + this.f39788d + ", paymentMethodCreateParams=" + this.f39789e + ", customerRequestedSave=" + this.f39790f + ", paymentMethodOptionsParams=" + this.f39791g + ", paymentMethodExtraParams=" + this.f39792h + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeParcelable(this.f39785a, i8);
                out.writeInt(this.f39786b);
                out.writeString(this.f39787c);
                out.writeString(this.f39788d);
                out.writeParcelable(this.f39789e, i8);
                out.writeString(this.f39790f.name());
                out.writeParcelable(this.f39791g, i8);
                out.writeParcelable(this.f39792h, i8);
            }
        }

        /* renamed from: y3.f$e$c */
        /* loaded from: classes4.dex */
        public static final class c extends e {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* renamed from: a */
            private final K2.f f39793a;

            /* renamed from: b */
            private final a f39794b;

            /* renamed from: c */
            private final C1876k.e f39795c;

            /* renamed from: d */
            private final p f39796d;

            /* renamed from: e */
            private final r.b f39797e;

            /* renamed from: f */
            private final Void f39798f;

            /* renamed from: g */
            private final int f39799g;

            /* renamed from: h */
            private final String f39800h;

            /* renamed from: y3.f$e$c$a */
            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new c((K2.f) parcel.readParcelable(c.class.getClassLoader()), a.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(K2.f linkPaymentDetails, a customerRequestedSave) {
                super(null);
                AbstractC3159y.i(linkPaymentDetails, "linkPaymentDetails");
                AbstractC3159y.i(customerRequestedSave, "customerRequestedSave");
                this.f39793a = linkPaymentDetails;
                this.f39794b = customerRequestedSave;
                C1876k.e b8 = linkPaymentDetails.b();
                this.f39795c = b8;
                this.f39796d = linkPaymentDetails.c();
                this.f39797e = new r.b(null, null, e().b(), 3, null);
                this.f39799g = t.f37414u;
                this.f39800h = "····" + b8.b();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // y3.AbstractC3991f.e
            public a e() {
                return this.f39794b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                if (AbstractC3159y.d(this.f39793a, cVar.f39793a) && this.f39794b == cVar.f39794b) {
                    return true;
                }
                return false;
            }

            @Override // y3.AbstractC3991f.e
            public p f() {
                return this.f39796d;
            }

            public int hashCode() {
                return (this.f39793a.hashCode() * 31) + this.f39794b.hashCode();
            }

            @Override // y3.AbstractC3991f.e
            public /* bridge */ /* synthetic */ q i() {
                return (q) k();
            }

            public Void k() {
                return this.f39798f;
            }

            @Override // y3.AbstractC3991f.e
            /* renamed from: n */
            public r.b j() {
                return this.f39797e;
            }

            public String toString() {
                return "LinkInline(linkPaymentDetails=" + this.f39793a + ", customerRequestedSave=" + this.f39794b + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeParcelable(this.f39793a, i8);
                out.writeString(this.f39794b.name());
            }
        }

        /* renamed from: y3.f$e$d */
        /* loaded from: classes4.dex */
        public static final class d extends e {
            public static final Parcelable.Creator<d> CREATOR = new a();

            /* renamed from: a */
            private final String f39801a;

            /* renamed from: b */
            private final int f39802b;

            /* renamed from: c */
            private final b f39803c;

            /* renamed from: d */
            private final B3.f f39804d;

            /* renamed from: e */
            private final c f39805e;

            /* renamed from: f */
            private final p f39806f;

            /* renamed from: g */
            private final a f39807g;

            /* renamed from: h */
            private final r f39808h;

            /* renamed from: i */
            private final q f39809i;

            /* renamed from: y3.f$e$d$a */
            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public final d createFromParcel(Parcel parcel) {
                    c createFromParcel;
                    AbstractC3159y.i(parcel, "parcel");
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    b createFromParcel2 = b.CREATOR.createFromParcel(parcel);
                    B3.f fVar = (B3.f) parcel.readParcelable(d.class.getClassLoader());
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

            /* renamed from: y3.f$e$d$b */
            /* loaded from: classes4.dex */
            public static final class b implements Parcelable {

                /* renamed from: a */
                private final String f39811a;

                /* renamed from: b */
                private final String f39812b;

                /* renamed from: c */
                private final String f39813c;

                /* renamed from: d */
                private final com.stripe.android.model.a f39814d;

                /* renamed from: e */
                private final boolean f39815e;

                /* renamed from: f */
                public static final int f39810f = com.stripe.android.model.a.f24200h;
                public static final Parcelable.Creator<b> CREATOR = new a();

                /* renamed from: y3.f$e$d$b$a */
                /* loaded from: classes4.dex */
                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a */
                    public final b createFromParcel(Parcel parcel) {
                        boolean z8;
                        AbstractC3159y.i(parcel, "parcel");
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
                    AbstractC3159y.i(name, "name");
                    this.f39811a = name;
                    this.f39812b = str;
                    this.f39813c = str2;
                    this.f39814d = aVar;
                    this.f39815e = z8;
                }

                public final com.stripe.android.model.a b() {
                    return this.f39814d;
                }

                public final String c() {
                    return this.f39812b;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public final String e() {
                    return this.f39811a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    if (AbstractC3159y.d(this.f39811a, bVar.f39811a) && AbstractC3159y.d(this.f39812b, bVar.f39812b) && AbstractC3159y.d(this.f39813c, bVar.f39813c) && AbstractC3159y.d(this.f39814d, bVar.f39814d) && this.f39815e == bVar.f39815e) {
                        return true;
                    }
                    return false;
                }

                public final String f() {
                    return this.f39813c;
                }

                public int hashCode() {
                    int hashCode;
                    int hashCode2;
                    int hashCode3 = this.f39811a.hashCode() * 31;
                    String str = this.f39812b;
                    int i8 = 0;
                    if (str == null) {
                        hashCode = 0;
                    } else {
                        hashCode = str.hashCode();
                    }
                    int i9 = (hashCode3 + hashCode) * 31;
                    String str2 = this.f39813c;
                    if (str2 == null) {
                        hashCode2 = 0;
                    } else {
                        hashCode2 = str2.hashCode();
                    }
                    int i10 = (i9 + hashCode2) * 31;
                    com.stripe.android.model.a aVar = this.f39814d;
                    if (aVar != null) {
                        i8 = aVar.hashCode();
                    }
                    return ((i10 + i8) * 31) + androidx.compose.foundation.a.a(this.f39815e);
                }

                public final boolean i() {
                    return this.f39815e;
                }

                public String toString() {
                    return "Input(name=" + this.f39811a + ", email=" + this.f39812b + ", phone=" + this.f39813c + ", address=" + this.f39814d + ", saveForFutureUse=" + this.f39815e + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i8) {
                    AbstractC3159y.i(out, "out");
                    out.writeString(this.f39811a);
                    out.writeString(this.f39812b);
                    out.writeString(this.f39813c);
                    out.writeParcelable(this.f39814d, i8);
                    out.writeInt(this.f39815e ? 1 : 0);
                }
            }

            /* renamed from: y3.f$e$d$c */
            /* loaded from: classes4.dex */
            public static final class c implements Parcelable {
                public static final Parcelable.Creator<c> CREATOR = new a();

                /* renamed from: a */
                private final String f39816a;

                /* renamed from: y3.f$e$d$c$a */
                /* loaded from: classes4.dex */
                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a */
                    public final c createFromParcel(Parcel parcel) {
                        AbstractC3159y.i(parcel, "parcel");
                        return new c(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    /* renamed from: b */
                    public final c[] newArray(int i8) {
                        return new c[i8];
                    }
                }

                public c(String paymentMethodId) {
                    AbstractC3159y.i(paymentMethodId, "paymentMethodId");
                    this.f39816a = paymentMethodId;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if ((obj instanceof c) && AbstractC3159y.d(this.f39816a, ((c) obj).f39816a)) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    return this.f39816a.hashCode();
                }

                public String toString() {
                    return "InstantDebitsInfo(paymentMethodId=" + this.f39816a + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i8) {
                    AbstractC3159y.i(out, "out");
                    out.writeString(this.f39816a);
                }
            }

            public /* synthetic */ d(String str, int i8, b bVar, B3.f fVar, c cVar, p pVar, a aVar, r rVar, q qVar, int i9, AbstractC3151p abstractC3151p) {
                this(str, i8, bVar, fVar, cVar, pVar, aVar, (i9 & 128) != 0 ? null : rVar, (i9 & 256) != 0 ? null : qVar);
            }

            @Override // y3.AbstractC3991f.e, y3.AbstractC3991f
            public InterfaceC3983b c(String merchantName, boolean z8) {
                AbstractC3159y.i(merchantName, "merchantName");
                return this.f39804d.c();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // y3.AbstractC3991f.e
            public a e() {
                return this.f39807g;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                if (AbstractC3159y.d(this.f39801a, dVar.f39801a) && this.f39802b == dVar.f39802b && AbstractC3159y.d(this.f39803c, dVar.f39803c) && AbstractC3159y.d(this.f39804d, dVar.f39804d) && AbstractC3159y.d(this.f39805e, dVar.f39805e) && AbstractC3159y.d(this.f39806f, dVar.f39806f) && this.f39807g == dVar.f39807g && AbstractC3159y.d(this.f39808h, dVar.f39808h) && AbstractC3159y.d(this.f39809i, dVar.f39809i)) {
                    return true;
                }
                return false;
            }

            @Override // y3.AbstractC3991f.e
            public p f() {
                return this.f39806f;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                int hashCode3 = ((((((this.f39801a.hashCode() * 31) + this.f39802b) * 31) + this.f39803c.hashCode()) * 31) + this.f39804d.hashCode()) * 31;
                c cVar = this.f39805e;
                int i8 = 0;
                if (cVar == null) {
                    hashCode = 0;
                } else {
                    hashCode = cVar.hashCode();
                }
                int hashCode4 = (((((hashCode3 + hashCode) * 31) + this.f39806f.hashCode()) * 31) + this.f39807g.hashCode()) * 31;
                r rVar = this.f39808h;
                if (rVar == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = rVar.hashCode();
                }
                int i9 = (hashCode4 + hashCode2) * 31;
                q qVar = this.f39809i;
                if (qVar != null) {
                    i8 = qVar.hashCode();
                }
                return i9 + i8;
            }

            @Override // y3.AbstractC3991f.e
            public q i() {
                return this.f39809i;
            }

            @Override // y3.AbstractC3991f.e
            public r j() {
                return this.f39808h;
            }

            public final b k() {
                return this.f39803c;
            }

            public final c n() {
                return this.f39805e;
            }

            public final B3.f o() {
                return this.f39804d;
            }

            public String toString() {
                return "USBankAccount(labelResource=" + this.f39801a + ", iconResource=" + this.f39802b + ", input=" + this.f39803c + ", screenState=" + this.f39804d + ", instantDebits=" + this.f39805e + ", paymentMethodCreateParams=" + this.f39806f + ", customerRequestedSave=" + this.f39807g + ", paymentMethodOptionsParams=" + this.f39808h + ", paymentMethodExtraParams=" + this.f39809i + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f39801a);
                out.writeInt(this.f39802b);
                this.f39803c.writeToParcel(out, i8);
                out.writeParcelable(this.f39804d, i8);
                c cVar = this.f39805e;
                if (cVar == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    cVar.writeToParcel(out, i8);
                }
                out.writeParcelable(this.f39806f, i8);
                out.writeString(this.f39807g.name());
                out.writeParcelable(this.f39808h, i8);
                out.writeParcelable(this.f39809i, i8);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String labelResource, int i8, b input, B3.f screenState, c cVar, p paymentMethodCreateParams, a customerRequestedSave, r rVar, q qVar) {
                super(null);
                AbstractC3159y.i(labelResource, "labelResource");
                AbstractC3159y.i(input, "input");
                AbstractC3159y.i(screenState, "screenState");
                AbstractC3159y.i(paymentMethodCreateParams, "paymentMethodCreateParams");
                AbstractC3159y.i(customerRequestedSave, "customerRequestedSave");
                this.f39801a = labelResource;
                this.f39802b = i8;
                this.f39803c = input;
                this.f39804d = screenState;
                this.f39805e = cVar;
                this.f39806f = paymentMethodCreateParams;
                this.f39807g = customerRequestedSave;
                this.f39808h = rVar;
                this.f39809i = qVar;
            }
        }

        public /* synthetic */ e(AbstractC3151p abstractC3151p) {
            this();
        }

        @Override // y3.AbstractC3991f
        public boolean b() {
            return false;
        }

        @Override // y3.AbstractC3991f
        public InterfaceC3983b c(String merchantName, boolean z8) {
            AbstractC3159y.i(merchantName, "merchantName");
            return null;
        }

        public abstract a e();

        public abstract p f();

        public abstract q i();

        public abstract r j();

        private e() {
            super(null);
        }
    }

    /* renamed from: y3.f$f */
    /* loaded from: classes4.dex */
    public static final class C0916f extends AbstractC3991f {

        /* renamed from: a */
        private final o f39818a;

        /* renamed from: b */
        private final b f39819b;

        /* renamed from: c */
        private final r f39820c;

        /* renamed from: d */
        public static final int f39817d = r.f24656b | o.f24407u;
        public static final Parcelable.Creator<C0916f> CREATOR = new a();

        /* renamed from: y3.f$f$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final C0916f createFromParcel(Parcel parcel) {
                b valueOf;
                AbstractC3159y.i(parcel, "parcel");
                o oVar = (o) parcel.readParcelable(C0916f.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = b.valueOf(parcel.readString());
                }
                return new C0916f(oVar, valueOf, (r) parcel.readParcelable(C0916f.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final C0916f[] newArray(int i8) {
                return new C0916f[i8];
            }
        }

        /* renamed from: y3.f$f$b */
        /* loaded from: classes4.dex */
        public static final class b extends Enum {

            /* renamed from: b */
            public static final b f39821b = new b("GooglePay", 0, c.f39776a);

            /* renamed from: c */
            public static final b f39822c = new b("Link", 1, d.f39777a);

            /* renamed from: d */
            private static final /* synthetic */ b[] f39823d;

            /* renamed from: e */
            private static final /* synthetic */ R5.a f39824e;

            /* renamed from: a */
            private final AbstractC3991f f39825a;

            static {
                b[] a8 = a();
                f39823d = a8;
                f39824e = R5.b.a(a8);
            }

            private b(String str, int i8, AbstractC3991f abstractC3991f) {
                super(str, i8);
                this.f39825a = abstractC3991f;
            }

            private static final /* synthetic */ b[] a() {
                return new b[]{f39821b, f39822c};
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) f39823d.clone();
            }

            public final AbstractC3991f b() {
                return this.f39825a;
            }
        }

        /* renamed from: y3.f$f$c */
        /* loaded from: classes4.dex */
        public /* synthetic */ class c {

            /* renamed from: a */
            public static final /* synthetic */ int[] f39826a;

            static {
                int[] iArr = new int[o.p.values().length];
                try {
                    iArr[o.p.f24522O.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[o.p.f24536m.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f39826a = iArr;
            }
        }

        public /* synthetic */ C0916f(o oVar, b bVar, r rVar, int i8, AbstractC3151p abstractC3151p) {
            this(oVar, (i8 & 2) != 0 ? null : bVar, (i8 & 4) != 0 ? null : rVar);
        }

        public static /* synthetic */ C0916f f(C0916f c0916f, o oVar, b bVar, r rVar, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                oVar = c0916f.f39818a;
            }
            if ((i8 & 2) != 0) {
                bVar = c0916f.f39819b;
            }
            if ((i8 & 4) != 0) {
                rVar = c0916f.f39820c;
            }
            return c0916f.e(oVar, bVar, rVar);
        }

        @Override // y3.AbstractC3991f
        public boolean b() {
            o.p pVar = this.f39818a.f24412e;
            if (pVar != o.p.f24522O && pVar != o.p.f24536m) {
                return false;
            }
            return true;
        }

        @Override // y3.AbstractC3991f
        public InterfaceC3983b c(String merchantName, boolean z8) {
            int i8;
            AbstractC3159y.i(merchantName, "merchantName");
            o.p pVar = this.f39818a.f24412e;
            if (pVar == null) {
                i8 = -1;
            } else {
                i8 = c.f39826a[pVar.ordinal()];
            }
            if (i8 != 1) {
                if (i8 != 2) {
                    return null;
                }
                return AbstractC3984c.f(n.f14687B0, new Object[]{merchantName}, null, 4, null);
            }
            return B3.i.f971a.a(merchantName, false, false, z8);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final C0916f e(o paymentMethod, b bVar, r rVar) {
            AbstractC3159y.i(paymentMethod, "paymentMethod");
            return new C0916f(paymentMethod, bVar, rVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0916f)) {
                return false;
            }
            C0916f c0916f = (C0916f) obj;
            if (AbstractC3159y.d(this.f39818a, c0916f.f39818a) && this.f39819b == c0916f.f39819b && AbstractC3159y.d(this.f39820c, c0916f.f39820c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f39818a.hashCode() * 31;
            b bVar = this.f39819b;
            int i8 = 0;
            if (bVar == null) {
                hashCode = 0;
            } else {
                hashCode = bVar.hashCode();
            }
            int i9 = (hashCode2 + hashCode) * 31;
            r rVar = this.f39820c;
            if (rVar != null) {
                i8 = rVar.hashCode();
            }
            return i9 + i8;
        }

        public final r i() {
            return this.f39820c;
        }

        public final boolean j() {
            if (this.f39818a.f24412e == o.p.f24536m) {
                return true;
            }
            return false;
        }

        public final b k() {
            return this.f39819b;
        }

        public String toString() {
            return "Saved(paymentMethod=" + this.f39818a + ", walletType=" + this.f39819b + ", paymentMethodOptionsParams=" + this.f39820c + ")";
        }

        public final o v() {
            return this.f39818a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f39818a, i8);
            b bVar = this.f39819b;
            if (bVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(bVar.name());
            }
            out.writeParcelable(this.f39820c, i8);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0916f(o paymentMethod, b bVar, r rVar) {
            super(null);
            AbstractC3159y.i(paymentMethod, "paymentMethod");
            this.f39818a = paymentMethod;
            this.f39819b = bVar;
            this.f39820c = rVar;
        }
    }

    private AbstractC3991f() {
    }

    public abstract boolean b();

    public abstract InterfaceC3983b c(String str, boolean z8);

    public /* synthetic */ AbstractC3991f(AbstractC3151p abstractC3151p) {
        this();
    }
}
