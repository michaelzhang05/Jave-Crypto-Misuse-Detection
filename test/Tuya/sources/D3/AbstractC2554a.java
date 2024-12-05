package d3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: d3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2554a implements v2.f {

    /* renamed from: a, reason: collision with root package name */
    private final g f30149a;

    /* renamed from: d3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0717a extends AbstractC2554a {
        public static final Parcelable.Creator<C0717a> CREATOR = new C0718a();

        /* renamed from: b, reason: collision with root package name */
        private final String f30150b;

        /* renamed from: d3.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0718a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0717a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new C0717a(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0717a[] newArray(int i8) {
                return new C0717a[i8];
            }
        }

        public C0717a(String str) {
            super(g.f30160c, null);
            this.f30150b = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0717a) && AbstractC3159y.d(this.f30150b, ((C0717a) obj).f30150b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f30150b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "AmexExpressCheckoutWallet(dynamicLast4=" + this.f30150b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f30150b);
        }
    }

    /* renamed from: d3.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC2554a {
        public static final Parcelable.Creator<b> CREATOR = new C0719a();

        /* renamed from: b, reason: collision with root package name */
        private final String f30151b;

        /* renamed from: d3.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0719a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new b(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(String str) {
            super(g.f30161d, null);
            this.f30151b = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && AbstractC3159y.d(this.f30151b, ((b) obj).f30151b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f30151b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "ApplePayWallet(dynamicLast4=" + this.f30151b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f30151b);
        }
    }

    /* renamed from: d3.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC2554a implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new C0720a();

        /* renamed from: b, reason: collision with root package name */
        private final String f30152b;

        /* renamed from: d3.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0720a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new c(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(String str) {
            super(g.f30162e, null);
            this.f30152b = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3159y.d(this.f30152b, ((c) obj).f30152b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f30152b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "GooglePayWallet(dynamicLast4=" + this.f30152b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f30152b);
        }
    }

    /* renamed from: d3.a$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC2554a {
        public static final Parcelable.Creator<d> CREATOR = new C0721a();

        /* renamed from: b, reason: collision with root package name */
        private final String f30153b;

        /* renamed from: d3.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0721a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new d(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(String str) {
            super(g.f30166i, null);
            this.f30153b = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && AbstractC3159y.d(this.f30153b, ((d) obj).f30153b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f30153b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "LinkWallet(dynamicLast4=" + this.f30153b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f30153b);
        }
    }

    /* renamed from: d3.a$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC2554a {
        public static final Parcelable.Creator<e> CREATOR = new C0722a();

        /* renamed from: b, reason: collision with root package name */
        private final com.stripe.android.model.a f30154b;

        /* renamed from: c, reason: collision with root package name */
        private final String f30155c;

        /* renamed from: d, reason: collision with root package name */
        private final String f30156d;

        /* renamed from: e, reason: collision with root package name */
        private final com.stripe.android.model.a f30157e;

        /* renamed from: d3.a$e$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0722a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                com.stripe.android.model.a createFromParcel;
                AbstractC3159y.i(parcel, "parcel");
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
            super(g.f30163f, null);
            this.f30154b = aVar;
            this.f30155c = str;
            this.f30156d = str2;
            this.f30157e = aVar2;
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
            if (AbstractC3159y.d(this.f30154b, eVar.f30154b) && AbstractC3159y.d(this.f30155c, eVar.f30155c) && AbstractC3159y.d(this.f30156d, eVar.f30156d) && AbstractC3159y.d(this.f30157e, eVar.f30157e)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            com.stripe.android.model.a aVar = this.f30154b;
            int i8 = 0;
            if (aVar == null) {
                hashCode = 0;
            } else {
                hashCode = aVar.hashCode();
            }
            int i9 = hashCode * 31;
            String str = this.f30155c;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str2 = this.f30156d;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            com.stripe.android.model.a aVar2 = this.f30157e;
            if (aVar2 != null) {
                i8 = aVar2.hashCode();
            }
            return i11 + i8;
        }

        public String toString() {
            return "MasterpassWallet(billingAddress=" + this.f30154b + ", email=" + this.f30155c + ", name=" + this.f30156d + ", shippingAddress=" + this.f30157e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            com.stripe.android.model.a aVar = this.f30154b;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i8);
            }
            out.writeString(this.f30155c);
            out.writeString(this.f30156d);
            com.stripe.android.model.a aVar2 = this.f30157e;
            if (aVar2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar2.writeToParcel(out, i8);
            }
        }
    }

    /* renamed from: d3.a$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC2554a {
        public static final Parcelable.Creator<f> CREATOR = new C0723a();

        /* renamed from: b, reason: collision with root package name */
        private final String f30158b;

        /* renamed from: d3.a$f$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0723a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new f(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final f[] newArray(int i8) {
                return new f[i8];
            }
        }

        public f(String str) {
            super(g.f30164g, null);
            this.f30158b = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof f) && AbstractC3159y.d(this.f30158b, ((f) obj).f30158b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f30158b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "SamsungPayWallet(dynamicLast4=" + this.f30158b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f30158b);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: d3.a$g */
    /* loaded from: classes4.dex */
    public static final class g {

        /* renamed from: b, reason: collision with root package name */
        public static final C0724a f30159b;

        /* renamed from: c, reason: collision with root package name */
        public static final g f30160c = new g("AmexExpressCheckout", 0, "amex_express_checkout");

        /* renamed from: d, reason: collision with root package name */
        public static final g f30161d = new g("ApplePay", 1, "apple_pay");

        /* renamed from: e, reason: collision with root package name */
        public static final g f30162e = new g("GooglePay", 2, "google_pay");

        /* renamed from: f, reason: collision with root package name */
        public static final g f30163f = new g("Masterpass", 3, "master_pass");

        /* renamed from: g, reason: collision with root package name */
        public static final g f30164g = new g("SamsungPay", 4, "samsung_pay");

        /* renamed from: h, reason: collision with root package name */
        public static final g f30165h = new g("VisaCheckout", 5, "visa_checkout");

        /* renamed from: i, reason: collision with root package name */
        public static final g f30166i = new g("Link", 6, "link");

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ g[] f30167j;

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ R5.a f30168k;

        /* renamed from: a, reason: collision with root package name */
        private final String f30169a;

        /* renamed from: d3.a$g$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0724a {
            private C0724a() {
            }

            public final g a(String str) {
                Object obj;
                Iterator<E> it = g.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3159y.d(((g) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (g) obj;
            }

            public /* synthetic */ C0724a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        static {
            g[] a8 = a();
            f30167j = a8;
            f30168k = R5.b.a(a8);
            f30159b = new C0724a(null);
        }

        private g(String str, int i8, String str2) {
            this.f30169a = str2;
        }

        private static final /* synthetic */ g[] a() {
            return new g[]{f30160c, f30161d, f30162e, f30163f, f30164g, f30165h, f30166i};
        }

        public static R5.a c() {
            return f30168k;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) f30167j.clone();
        }

        public final String b() {
            return this.f30169a;
        }
    }

    /* renamed from: d3.a$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC2554a {
        public static final Parcelable.Creator<h> CREATOR = new C0725a();

        /* renamed from: b, reason: collision with root package name */
        private final com.stripe.android.model.a f30170b;

        /* renamed from: c, reason: collision with root package name */
        private final String f30171c;

        /* renamed from: d, reason: collision with root package name */
        private final String f30172d;

        /* renamed from: e, reason: collision with root package name */
        private final com.stripe.android.model.a f30173e;

        /* renamed from: f, reason: collision with root package name */
        private final String f30174f;

        /* renamed from: d3.a$h$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0725a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h createFromParcel(Parcel parcel) {
                com.stripe.android.model.a createFromParcel;
                AbstractC3159y.i(parcel, "parcel");
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
            super(g.f30165h, null);
            this.f30170b = aVar;
            this.f30171c = str;
            this.f30172d = str2;
            this.f30173e = aVar2;
            this.f30174f = str3;
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
            if (AbstractC3159y.d(this.f30170b, hVar.f30170b) && AbstractC3159y.d(this.f30171c, hVar.f30171c) && AbstractC3159y.d(this.f30172d, hVar.f30172d) && AbstractC3159y.d(this.f30173e, hVar.f30173e) && AbstractC3159y.d(this.f30174f, hVar.f30174f)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            com.stripe.android.model.a aVar = this.f30170b;
            int i8 = 0;
            if (aVar == null) {
                hashCode = 0;
            } else {
                hashCode = aVar.hashCode();
            }
            int i9 = hashCode * 31;
            String str = this.f30171c;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str2 = this.f30172d;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            com.stripe.android.model.a aVar2 = this.f30173e;
            if (aVar2 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = aVar2.hashCode();
            }
            int i12 = (i11 + hashCode4) * 31;
            String str3 = this.f30174f;
            if (str3 != null) {
                i8 = str3.hashCode();
            }
            return i12 + i8;
        }

        public String toString() {
            return "VisaCheckoutWallet(billingAddress=" + this.f30170b + ", email=" + this.f30171c + ", name=" + this.f30172d + ", shippingAddress=" + this.f30173e + ", dynamicLast4=" + this.f30174f + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            com.stripe.android.model.a aVar = this.f30170b;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i8);
            }
            out.writeString(this.f30171c);
            out.writeString(this.f30172d);
            com.stripe.android.model.a aVar2 = this.f30173e;
            if (aVar2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar2.writeToParcel(out, i8);
            }
            out.writeString(this.f30174f);
        }
    }

    public /* synthetic */ AbstractC2554a(g gVar, AbstractC3151p abstractC3151p) {
        this(gVar);
    }

    public final g b() {
        return this.f30149a;
    }

    private AbstractC2554a(g gVar) {
        this.f30149a = gVar;
    }
}
