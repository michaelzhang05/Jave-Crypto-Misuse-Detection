package e3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: e3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2790d implements y2.f, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f31421a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f31422b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31423c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31424d;

    /* renamed from: e, reason: collision with root package name */
    private final String f31425e;

    /* renamed from: f, reason: collision with root package name */
    private final String f31426f;

    /* renamed from: g, reason: collision with root package name */
    private final String f31427g;

    /* renamed from: h, reason: collision with root package name */
    private final String f31428h;

    /* renamed from: i, reason: collision with root package name */
    private final String f31429i;

    /* renamed from: j, reason: collision with root package name */
    private final String f31430j;

    /* renamed from: k, reason: collision with root package name */
    private final String f31431k;

    /* renamed from: l, reason: collision with root package name */
    private final String f31432l;

    /* renamed from: m, reason: collision with root package name */
    private final EnumC2791e f31433m;

    /* renamed from: n, reason: collision with root package name */
    private final EnumC2792f f31434n;

    /* renamed from: o, reason: collision with root package name */
    private final String f31435o;

    /* renamed from: p, reason: collision with root package name */
    private final String f31436p;

    /* renamed from: q, reason: collision with root package name */
    private final String f31437q;

    /* renamed from: r, reason: collision with root package name */
    private final String f31438r;

    /* renamed from: s, reason: collision with root package name */
    private final String f31439s;

    /* renamed from: t, reason: collision with root package name */
    private final String f31440t;

    /* renamed from: u, reason: collision with root package name */
    private final K f31441u;

    /* renamed from: v, reason: collision with root package name */
    public static final a f31420v = new a(null);
    public static final Parcelable.Creator<C2790d> CREATOR = new b();

    /* renamed from: e3.d$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final /* synthetic */ EnumC2791e a(String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -993787207:
                        if (str.equals("Diners Club")) {
                            return EnumC2791e.f31449t;
                        }
                        break;
                    case -298759312:
                        if (str.equals("American Express")) {
                            return EnumC2791e.f31446q;
                        }
                        break;
                    case -231891079:
                        if (str.equals("UnionPay")) {
                            return EnumC2791e.f31450u;
                        }
                        break;
                    case -46205774:
                        if (str.equals("MasterCard")) {
                            return EnumC2791e.f31445p;
                        }
                        break;
                    case 73257:
                        if (str.equals("JCB")) {
                            return EnumC2791e.f31448s;
                        }
                        break;
                    case 2666593:
                        if (str.equals("Visa")) {
                            return EnumC2791e.f31444o;
                        }
                        break;
                    case 337828873:
                        if (str.equals("Discover")) {
                            return EnumC2791e.f31447r;
                        }
                        break;
                }
            }
            return EnumC2791e.f31452w;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: e3.d$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2790d createFromParcel(Parcel parcel) {
            Integer valueOf;
            Integer valueOf2;
            EnumC2792f valueOf3;
            K valueOf4;
            AbstractC3255y.i(parcel, "parcel");
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Integer.valueOf(parcel.readInt());
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            EnumC2791e valueOf5 = EnumC2791e.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = EnumC2792f.valueOf(parcel.readString());
            }
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = K.valueOf(parcel.readString());
            }
            return new C2790d(valueOf, valueOf2, readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, valueOf5, valueOf3, readString11, readString12, readString13, readString14, readString15, readString16, valueOf4);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2790d[] newArray(int i8) {
            return new C2790d[i8];
        }
    }

    public C2790d(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, EnumC2791e brand, EnumC2792f enumC2792f, String str11, String str12, String str13, String str14, String str15, String str16, K k8) {
        AbstractC3255y.i(brand, "brand");
        this.f31421a = num;
        this.f31422b = num2;
        this.f31423c = str;
        this.f31424d = str2;
        this.f31425e = str3;
        this.f31426f = str4;
        this.f31427g = str5;
        this.f31428h = str6;
        this.f31429i = str7;
        this.f31430j = str8;
        this.f31431k = str9;
        this.f31432l = str10;
        this.f31433m = brand;
        this.f31434n = enumC2792f;
        this.f31435o = str11;
        this.f31436p = str12;
        this.f31437q = str13;
        this.f31438r = str14;
        this.f31439s = str15;
        this.f31440t = str16;
        this.f31441u = k8;
    }

    public final K a() {
        return this.f31441u;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2790d)) {
            return false;
        }
        C2790d c2790d = (C2790d) obj;
        if (AbstractC3255y.d(this.f31421a, c2790d.f31421a) && AbstractC3255y.d(this.f31422b, c2790d.f31422b) && AbstractC3255y.d(this.f31423c, c2790d.f31423c) && AbstractC3255y.d(this.f31424d, c2790d.f31424d) && AbstractC3255y.d(this.f31425e, c2790d.f31425e) && AbstractC3255y.d(this.f31426f, c2790d.f31426f) && AbstractC3255y.d(this.f31427g, c2790d.f31427g) && AbstractC3255y.d(this.f31428h, c2790d.f31428h) && AbstractC3255y.d(this.f31429i, c2790d.f31429i) && AbstractC3255y.d(this.f31430j, c2790d.f31430j) && AbstractC3255y.d(this.f31431k, c2790d.f31431k) && AbstractC3255y.d(this.f31432l, c2790d.f31432l) && this.f31433m == c2790d.f31433m && this.f31434n == c2790d.f31434n && AbstractC3255y.d(this.f31435o, c2790d.f31435o) && AbstractC3255y.d(this.f31436p, c2790d.f31436p) && AbstractC3255y.d(this.f31437q, c2790d.f31437q) && AbstractC3255y.d(this.f31438r, c2790d.f31438r) && AbstractC3255y.d(this.f31439s, c2790d.f31439s) && AbstractC3255y.d(this.f31440t, c2790d.f31440t) && this.f31441u == c2790d.f31441u) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        Integer num = this.f31421a;
        int i8 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i9 = hashCode * 31;
        Integer num2 = this.f31422b;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str = this.f31423c;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str2 = this.f31424d;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str3 = this.f31425e;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str4 = this.f31426f;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        String str5 = this.f31427g;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        String str6 = this.f31428h;
        if (str6 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str6.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        String str7 = this.f31429i;
        if (str7 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str7.hashCode();
        }
        int i17 = (i16 + hashCode9) * 31;
        String str8 = this.f31430j;
        if (str8 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str8.hashCode();
        }
        int i18 = (i17 + hashCode10) * 31;
        String str9 = this.f31431k;
        if (str9 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str9.hashCode();
        }
        int i19 = (i18 + hashCode11) * 31;
        String str10 = this.f31432l;
        if (str10 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str10.hashCode();
        }
        int hashCode20 = (((i19 + hashCode12) * 31) + this.f31433m.hashCode()) * 31;
        EnumC2792f enumC2792f = this.f31434n;
        if (enumC2792f == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = enumC2792f.hashCode();
        }
        int i20 = (hashCode20 + hashCode13) * 31;
        String str11 = this.f31435o;
        if (str11 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str11.hashCode();
        }
        int i21 = (i20 + hashCode14) * 31;
        String str12 = this.f31436p;
        if (str12 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str12.hashCode();
        }
        int i22 = (i21 + hashCode15) * 31;
        String str13 = this.f31437q;
        if (str13 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = str13.hashCode();
        }
        int i23 = (i22 + hashCode16) * 31;
        String str14 = this.f31438r;
        if (str14 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str14.hashCode();
        }
        int i24 = (i23 + hashCode17) * 31;
        String str15 = this.f31439s;
        if (str15 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = str15.hashCode();
        }
        int i25 = (i24 + hashCode18) * 31;
        String str16 = this.f31440t;
        if (str16 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = str16.hashCode();
        }
        int i26 = (i25 + hashCode19) * 31;
        K k8 = this.f31441u;
        if (k8 != null) {
            i8 = k8.hashCode();
        }
        return i26 + i8;
    }

    public String toString() {
        return "Card(expMonth=" + this.f31421a + ", expYear=" + this.f31422b + ", name=" + this.f31423c + ", addressLine1=" + this.f31424d + ", addressLine1Check=" + this.f31425e + ", addressLine2=" + this.f31426f + ", addressCity=" + this.f31427g + ", addressState=" + this.f31428h + ", addressZip=" + this.f31429i + ", addressZipCheck=" + this.f31430j + ", addressCountry=" + this.f31431k + ", last4=" + this.f31432l + ", brand=" + this.f31433m + ", funding=" + this.f31434n + ", fingerprint=" + this.f31435o + ", country=" + this.f31436p + ", currency=" + this.f31437q + ", customerId=" + this.f31438r + ", cvcCheck=" + this.f31439s + ", id=" + this.f31440t + ", tokenizationMethod=" + this.f31441u + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        Integer num = this.f31421a;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        Integer num2 = this.f31422b;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        out.writeString(this.f31423c);
        out.writeString(this.f31424d);
        out.writeString(this.f31425e);
        out.writeString(this.f31426f);
        out.writeString(this.f31427g);
        out.writeString(this.f31428h);
        out.writeString(this.f31429i);
        out.writeString(this.f31430j);
        out.writeString(this.f31431k);
        out.writeString(this.f31432l);
        out.writeString(this.f31433m.name());
        EnumC2792f enumC2792f = this.f31434n;
        if (enumC2792f == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(enumC2792f.name());
        }
        out.writeString(this.f31435o);
        out.writeString(this.f31436p);
        out.writeString(this.f31437q);
        out.writeString(this.f31438r);
        out.writeString(this.f31439s);
        out.writeString(this.f31440t);
        K k8 = this.f31441u;
        if (k8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(k8.name());
        }
    }
}
