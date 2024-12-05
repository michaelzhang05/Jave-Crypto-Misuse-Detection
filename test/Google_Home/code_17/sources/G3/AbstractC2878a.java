package g3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: g3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2878a implements y2.f {

    /* renamed from: a, reason: collision with root package name */
    private final g f32029a;

    /* renamed from: g3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0742a extends AbstractC2878a {
        public static final Parcelable.Creator<C0742a> CREATOR = new C0743a();

        /* renamed from: b, reason: collision with root package name */
        private final String f32030b;

        /* renamed from: g3.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0743a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0742a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new C0742a(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0742a[] newArray(int i8) {
                return new C0742a[i8];
            }
        }

        public C0742a(String str) {
            super(g.f32040c, null);
            this.f32030b = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0742a) && AbstractC3255y.d(this.f32030b, ((C0742a) obj).f32030b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f32030b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "AmexExpressCheckoutWallet(dynamicLast4=" + this.f32030b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f32030b);
        }
    }

    /* renamed from: g3.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC2878a {
        public static final Parcelable.Creator<b> CREATOR = new C0744a();

        /* renamed from: b, reason: collision with root package name */
        private final String f32031b;

        /* renamed from: g3.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0744a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new b(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(String str) {
            super(g.f32041d, null);
            this.f32031b = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && AbstractC3255y.d(this.f32031b, ((b) obj).f32031b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f32031b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "ApplePayWallet(dynamicLast4=" + this.f32031b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f32031b);
        }
    }

    /* renamed from: g3.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC2878a implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new C0745a();

        /* renamed from: b, reason: collision with root package name */
        private final String f32032b;

        /* renamed from: g3.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0745a implements Parcelable.Creator {
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
            super(g.f32042e, null);
            this.f32032b = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3255y.d(this.f32032b, ((c) obj).f32032b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f32032b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "GooglePayWallet(dynamicLast4=" + this.f32032b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f32032b);
        }
    }

    /* renamed from: g3.a$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC2878a {
        public static final Parcelable.Creator<d> CREATOR = new C0746a();

        /* renamed from: b, reason: collision with root package name */
        private final String f32033b;

        /* renamed from: g3.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0746a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new d(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(String str) {
            super(g.f32046i, null);
            this.f32033b = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && AbstractC3255y.d(this.f32033b, ((d) obj).f32033b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f32033b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "LinkWallet(dynamicLast4=" + this.f32033b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f32033b);
        }
    }

    /* renamed from: g3.a$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC2878a {
        public static final Parcelable.Creator<e> CREATOR = new C0747a();

        /* renamed from: b, reason: collision with root package name */
        private final com.stripe.android.model.a f32034b;

        /* renamed from: c, reason: collision with root package name */
        private final String f32035c;

        /* renamed from: d, reason: collision with root package name */
        private final String f32036d;

        /* renamed from: e, reason: collision with root package name */
        private final com.stripe.android.model.a f32037e;

        /* renamed from: g3.a$e$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0747a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                com.stripe.android.model.a createFromParcel;
                AbstractC3255y.i(parcel, "parcel");
                com.stripe.android.model.a aVar = null;
                if (parcel.readInt() == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = com.stripe.android.model.a.CREATOR.createFromParcel(parcel);
                }
                com.stripe.android.model.a aVar2 = createFromParcel;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    aVar = com.stripe.android.model.a.CREATOR.createFromParcel(parcel);
                }
                return new e(aVar2, readString, readString2, aVar);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        public e(com.stripe.android.model.a aVar, String str, String str2, com.stripe.android.model.a aVar2) {
            super(g.f32043f, null);
            this.f32034b = aVar;
            this.f32035c = str;
            this.f32036d = str2;
            this.f32037e = aVar2;
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
            if (AbstractC3255y.d(this.f32034b, eVar.f32034b) && AbstractC3255y.d(this.f32035c, eVar.f32035c) && AbstractC3255y.d(this.f32036d, eVar.f32036d) && AbstractC3255y.d(this.f32037e, eVar.f32037e)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            com.stripe.android.model.a aVar = this.f32034b;
            int i8 = 0;
            if (aVar == null) {
                hashCode = 0;
            } else {
                hashCode = aVar.hashCode();
            }
            int i9 = hashCode * 31;
            String str = this.f32035c;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str2 = this.f32036d;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            com.stripe.android.model.a aVar2 = this.f32037e;
            if (aVar2 != null) {
                i8 = aVar2.hashCode();
            }
            return i11 + i8;
        }

        public String toString() {
            return "MasterpassWallet(billingAddress=" + this.f32034b + ", email=" + this.f32035c + ", name=" + this.f32036d + ", shippingAddress=" + this.f32037e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            com.stripe.android.model.a aVar = this.f32034b;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i8);
            }
            out.writeString(this.f32035c);
            out.writeString(this.f32036d);
            com.stripe.android.model.a aVar2 = this.f32037e;
            if (aVar2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar2.writeToParcel(out, i8);
            }
        }
    }

    /* renamed from: g3.a$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC2878a {
        public static final Parcelable.Creator<f> CREATOR = new C0748a();

        /* renamed from: b, reason: collision with root package name */
        private final String f32038b;

        /* renamed from: g3.a$f$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0748a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new f(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final f[] newArray(int i8) {
                return new f[i8];
            }
        }

        public f(String str) {
            super(g.f32044g, null);
            this.f32038b = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof f) && AbstractC3255y.d(this.f32038b, ((f) obj).f32038b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f32038b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "SamsungPayWallet(dynamicLast4=" + this.f32038b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f32038b);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: g3.a$g */
    /* loaded from: classes4.dex */
    public static final class g {

        /* renamed from: b, reason: collision with root package name */
        public static final C0749a f32039b;

        /* renamed from: c, reason: collision with root package name */
        public static final g f32040c = new g("AmexExpressCheckout", 0, "amex_express_checkout");

        /* renamed from: d, reason: collision with root package name */
        public static final g f32041d = new g("ApplePay", 1, "apple_pay");

        /* renamed from: e, reason: collision with root package name */
        public static final g f32042e = new g("GooglePay", 2, "google_pay");

        /* renamed from: f, reason: collision with root package name */
        public static final g f32043f = new g("Masterpass", 3, "master_pass");

        /* renamed from: g, reason: collision with root package name */
        public static final g f32044g = new g("SamsungPay", 4, "samsung_pay");

        /* renamed from: h, reason: collision with root package name */
        public static final g f32045h = new g("VisaCheckout", 5, "visa_checkout");

        /* renamed from: i, reason: collision with root package name */
        public static final g f32046i = new g("Link", 6, "link");

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ g[] f32047j;

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ U5.a f32048k;

        /* renamed from: a, reason: collision with root package name */
        private final String f32049a;

        /* renamed from: g3.a$g$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0749a {
            private C0749a() {
            }

            public final g a(String str) {
                Object obj;
                Iterator<E> it = g.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3255y.d(((g) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (g) obj;
            }

            public /* synthetic */ C0749a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        static {
            g[] a8 = a();
            f32047j = a8;
            f32048k = U5.b.a(a8);
            f32039b = new C0749a(null);
        }

        private g(String str, int i8, String str2) {
            this.f32049a = str2;
        }

        private static final /* synthetic */ g[] a() {
            return new g[]{f32040c, f32041d, f32042e, f32043f, f32044g, f32045h, f32046i};
        }

        public static U5.a c() {
            return f32048k;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) f32047j.clone();
        }

        public final String b() {
            return this.f32049a;
        }
    }

    /* renamed from: g3.a$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC2878a {
        public static final Parcelable.Creator<h> CREATOR = new C0750a();

        /* renamed from: b, reason: collision with root package name */
        private final com.stripe.android.model.a f32050b;

        /* renamed from: c, reason: collision with root package name */
        private final String f32051c;

        /* renamed from: d, reason: collision with root package name */
        private final String f32052d;

        /* renamed from: e, reason: collision with root package name */
        private final com.stripe.android.model.a f32053e;

        /* renamed from: f, reason: collision with root package name */
        private final String f32054f;

        /* renamed from: g3.a$h$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0750a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h createFromParcel(Parcel parcel) {
                com.stripe.android.model.a createFromParcel;
                AbstractC3255y.i(parcel, "parcel");
                com.stripe.android.model.a aVar = null;
                if (parcel.readInt() == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = com.stripe.android.model.a.CREATOR.createFromParcel(parcel);
                }
                com.stripe.android.model.a aVar2 = createFromParcel;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    aVar = com.stripe.android.model.a.CREATOR.createFromParcel(parcel);
                }
                return new h(aVar2, readString, readString2, aVar, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final h[] newArray(int i8) {
                return new h[i8];
            }
        }

        public h(com.stripe.android.model.a aVar, String str, String str2, com.stripe.android.model.a aVar2, String str3) {
            super(g.f32045h, null);
            this.f32050b = aVar;
            this.f32051c = str;
            this.f32052d = str2;
            this.f32053e = aVar2;
            this.f32054f = str3;
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
            if (AbstractC3255y.d(this.f32050b, hVar.f32050b) && AbstractC3255y.d(this.f32051c, hVar.f32051c) && AbstractC3255y.d(this.f32052d, hVar.f32052d) && AbstractC3255y.d(this.f32053e, hVar.f32053e) && AbstractC3255y.d(this.f32054f, hVar.f32054f)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            com.stripe.android.model.a aVar = this.f32050b;
            int i8 = 0;
            if (aVar == null) {
                hashCode = 0;
            } else {
                hashCode = aVar.hashCode();
            }
            int i9 = hashCode * 31;
            String str = this.f32051c;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str2 = this.f32052d;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            com.stripe.android.model.a aVar2 = this.f32053e;
            if (aVar2 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = aVar2.hashCode();
            }
            int i12 = (i11 + hashCode4) * 31;
            String str3 = this.f32054f;
            if (str3 != null) {
                i8 = str3.hashCode();
            }
            return i12 + i8;
        }

        public String toString() {
            return "VisaCheckoutWallet(billingAddress=" + this.f32050b + ", email=" + this.f32051c + ", name=" + this.f32052d + ", shippingAddress=" + this.f32053e + ", dynamicLast4=" + this.f32054f + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            com.stripe.android.model.a aVar = this.f32050b;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i8);
            }
            out.writeString(this.f32051c);
            out.writeString(this.f32052d);
            com.stripe.android.model.a aVar2 = this.f32053e;
            if (aVar2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar2.writeToParcel(out, i8);
            }
            out.writeString(this.f32054f);
        }
    }

    public /* synthetic */ AbstractC2878a(g gVar, AbstractC3247p abstractC3247p) {
        this(gVar);
    }

    public final g a() {
        return this.f32029a;
    }

    private AbstractC2878a(g gVar) {
        this.f32029a = gVar;
    }
}
