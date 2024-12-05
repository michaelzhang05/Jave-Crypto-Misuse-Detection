package b3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: b3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1866a implements v2.f {
    public static final Parcelable.Creator<C1866a> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    private final C1868c f14395a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14396b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC0355a f14397c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14398d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: b3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class EnumC0355a {

        /* renamed from: c, reason: collision with root package name */
        public static final EnumC0355a f14399c = new EnumC0355a("Visa", 0, "VISA", EnumC1870e.f14438o);

        /* renamed from: d, reason: collision with root package name */
        public static final EnumC0355a f14400d = new EnumC0355a("Mastercard", 1, "MASTERCARD", EnumC1870e.f14439p);

        /* renamed from: e, reason: collision with root package name */
        public static final EnumC0355a f14401e = new EnumC0355a("AmericanExpress", 2, "AMERICAN_EXPRESS", EnumC1870e.f14440q);

        /* renamed from: f, reason: collision with root package name */
        public static final EnumC0355a f14402f = new EnumC0355a("JCB", 3, "JCB", EnumC1870e.f14442s);

        /* renamed from: g, reason: collision with root package name */
        public static final EnumC0355a f14403g = new EnumC0355a("DinersClub", 4, "DINERS_CLUB", EnumC1870e.f14443t);

        /* renamed from: h, reason: collision with root package name */
        public static final EnumC0355a f14404h = new EnumC0355a("Discover", 5, "DISCOVER", EnumC1870e.f14441r);

        /* renamed from: i, reason: collision with root package name */
        public static final EnumC0355a f14405i = new EnumC0355a("UnionPay", 6, "UNIONPAY", EnumC1870e.f14444u);

        /* renamed from: j, reason: collision with root package name */
        public static final EnumC0355a f14406j = new EnumC0355a("CartesBancaires", 7, "CARTES_BANCAIRES", EnumC1870e.f14445v);

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ EnumC0355a[] f14407k;

        /* renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ R5.a f14408l;

        /* renamed from: a, reason: collision with root package name */
        private final String f14409a;

        /* renamed from: b, reason: collision with root package name */
        private final EnumC1870e f14410b;

        static {
            EnumC0355a[] a8 = a();
            f14407k = a8;
            f14408l = R5.b.a(a8);
        }

        private EnumC0355a(String str, int i8, String str2, EnumC1870e enumC1870e) {
            this.f14409a = str2;
            this.f14410b = enumC1870e;
        }

        private static final /* synthetic */ EnumC0355a[] a() {
            return new EnumC0355a[]{f14399c, f14400d, f14401e, f14402f, f14403g, f14404h, f14405i, f14406j};
        }

        public static R5.a d() {
            return f14408l;
        }

        public static EnumC0355a valueOf(String str) {
            return (EnumC0355a) Enum.valueOf(EnumC0355a.class, str);
        }

        public static EnumC0355a[] values() {
            return (EnumC0355a[]) f14407k.clone();
        }

        public final EnumC1870e b() {
            return this.f14410b;
        }

        public final String c() {
            return this.f14409a;
        }
    }

    /* renamed from: b3.a$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1866a createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new C1866a(C1868c.CREATOR.createFromParcel(parcel), parcel.readInt(), EnumC0355a.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1866a[] newArray(int i8) {
            return new C1866a[i8];
        }
    }

    public C1866a(C1868c binRange, int i8, EnumC0355a brandInfo, String str) {
        AbstractC3159y.i(binRange, "binRange");
        AbstractC3159y.i(brandInfo, "brandInfo");
        this.f14395a = binRange;
        this.f14396b = i8;
        this.f14397c = brandInfo;
        this.f14398d = str;
    }

    public final C1868c b() {
        return this.f14395a;
    }

    public final EnumC1870e c() {
        return this.f14397c.b();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f14396b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1866a)) {
            return false;
        }
        C1866a c1866a = (C1866a) obj;
        if (AbstractC3159y.d(this.f14395a, c1866a.f14395a) && this.f14396b == c1866a.f14396b && this.f14397c == c1866a.f14397c && AbstractC3159y.d(this.f14398d, c1866a.f14398d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.f14395a.hashCode() * 31) + this.f14396b) * 31) + this.f14397c.hashCode()) * 31;
        String str = this.f14398d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "AccountRange(binRange=" + this.f14395a + ", panLength=" + this.f14396b + ", brandInfo=" + this.f14397c + ", country=" + this.f14398d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        this.f14395a.writeToParcel(out, i8);
        out.writeInt(this.f14396b);
        out.writeString(this.f14397c.name());
        out.writeString(this.f14398d);
    }

    public /* synthetic */ C1866a(C1868c c1868c, int i8, EnumC0355a enumC0355a, String str, int i9, AbstractC3151p abstractC3151p) {
        this(c1868c, i8, enumC0355a, (i9 & 8) != 0 ? null : str);
    }
}
