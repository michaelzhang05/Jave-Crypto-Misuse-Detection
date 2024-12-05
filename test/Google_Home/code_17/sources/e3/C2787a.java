package e3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: e3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2787a implements y2.f {
    public static final Parcelable.Creator<C2787a> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    private final C2789c f31401a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31402b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC0723a f31403c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31404d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: e3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class EnumC0723a {

        /* renamed from: c, reason: collision with root package name */
        public static final EnumC0723a f31405c = new EnumC0723a("Visa", 0, "VISA", EnumC2791e.f31444o);

        /* renamed from: d, reason: collision with root package name */
        public static final EnumC0723a f31406d = new EnumC0723a("Mastercard", 1, "MASTERCARD", EnumC2791e.f31445p);

        /* renamed from: e, reason: collision with root package name */
        public static final EnumC0723a f31407e = new EnumC0723a("AmericanExpress", 2, "AMERICAN_EXPRESS", EnumC2791e.f31446q);

        /* renamed from: f, reason: collision with root package name */
        public static final EnumC0723a f31408f = new EnumC0723a("JCB", 3, "JCB", EnumC2791e.f31448s);

        /* renamed from: g, reason: collision with root package name */
        public static final EnumC0723a f31409g = new EnumC0723a("DinersClub", 4, "DINERS_CLUB", EnumC2791e.f31449t);

        /* renamed from: h, reason: collision with root package name */
        public static final EnumC0723a f31410h = new EnumC0723a("Discover", 5, "DISCOVER", EnumC2791e.f31447r);

        /* renamed from: i, reason: collision with root package name */
        public static final EnumC0723a f31411i = new EnumC0723a("UnionPay", 6, "UNIONPAY", EnumC2791e.f31450u);

        /* renamed from: j, reason: collision with root package name */
        public static final EnumC0723a f31412j = new EnumC0723a("CartesBancaires", 7, "CARTES_BANCAIRES", EnumC2791e.f31451v);

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ EnumC0723a[] f31413k;

        /* renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ U5.a f31414l;

        /* renamed from: a, reason: collision with root package name */
        private final String f31415a;

        /* renamed from: b, reason: collision with root package name */
        private final EnumC2791e f31416b;

        static {
            EnumC0723a[] a8 = a();
            f31413k = a8;
            f31414l = U5.b.a(a8);
        }

        private EnumC0723a(String str, int i8, String str2, EnumC2791e enumC2791e) {
            this.f31415a = str2;
            this.f31416b = enumC2791e;
        }

        private static final /* synthetic */ EnumC0723a[] a() {
            return new EnumC0723a[]{f31405c, f31406d, f31407e, f31408f, f31409g, f31410h, f31411i, f31412j};
        }

        public static U5.a d() {
            return f31414l;
        }

        public static EnumC0723a valueOf(String str) {
            return (EnumC0723a) Enum.valueOf(EnumC0723a.class, str);
        }

        public static EnumC0723a[] values() {
            return (EnumC0723a[]) f31413k.clone();
        }

        public final EnumC2791e b() {
            return this.f31416b;
        }

        public final String c() {
            return this.f31415a;
        }
    }

    /* renamed from: e3.a$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2787a createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new C2787a(C2789c.CREATOR.createFromParcel(parcel), parcel.readInt(), EnumC0723a.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2787a[] newArray(int i8) {
            return new C2787a[i8];
        }
    }

    public C2787a(C2789c binRange, int i8, EnumC0723a brandInfo, String str) {
        AbstractC3255y.i(binRange, "binRange");
        AbstractC3255y.i(brandInfo, "brandInfo");
        this.f31401a = binRange;
        this.f31402b = i8;
        this.f31403c = brandInfo;
        this.f31404d = str;
    }

    public final C2789c a() {
        return this.f31401a;
    }

    public final EnumC2791e b() {
        return this.f31403c.b();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2787a)) {
            return false;
        }
        C2787a c2787a = (C2787a) obj;
        if (AbstractC3255y.d(this.f31401a, c2787a.f31401a) && this.f31402b == c2787a.f31402b && this.f31403c == c2787a.f31403c && AbstractC3255y.d(this.f31404d, c2787a.f31404d)) {
            return true;
        }
        return false;
    }

    public final int g() {
        return this.f31402b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.f31401a.hashCode() * 31) + this.f31402b) * 31) + this.f31403c.hashCode()) * 31;
        String str = this.f31404d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "AccountRange(binRange=" + this.f31401a + ", panLength=" + this.f31402b + ", brandInfo=" + this.f31403c + ", country=" + this.f31404d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        this.f31401a.writeToParcel(out, i8);
        out.writeInt(this.f31402b);
        out.writeString(this.f31403c.name());
        out.writeString(this.f31404d);
    }

    public /* synthetic */ C2787a(C2789c c2789c, int i8, EnumC0723a enumC0723a, String str, int i9, AbstractC3247p abstractC3247p) {
        this(c2789c, i8, enumC0723a, (i9 & 8) != 0 ? null : str);
    }
}
