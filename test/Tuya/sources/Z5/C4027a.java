package z5;

import C6.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3159y;
import y5.t;

/* renamed from: z5.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4027a implements Parcelable {
    public static final C0930a CREATOR = new C0930a();

    /* renamed from: a, reason: collision with root package name */
    public final String f40429a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40430b;

    /* renamed from: c, reason: collision with root package name */
    public final String f40431c;

    /* renamed from: d, reason: collision with root package name */
    public final String f40432d;

    /* renamed from: e, reason: collision with root package name */
    public final String f40433e;

    /* renamed from: f, reason: collision with root package name */
    public final String f40434f;

    /* renamed from: g, reason: collision with root package name */
    public final String f40435g;

    /* renamed from: h, reason: collision with root package name */
    public final String f40436h;

    /* renamed from: i, reason: collision with root package name */
    public final String f40437i;

    /* renamed from: j, reason: collision with root package name */
    public final String f40438j;

    /* renamed from: k, reason: collision with root package name */
    public final String f40439k;

    /* renamed from: l, reason: collision with root package name */
    public final String f40440l;

    /* renamed from: m, reason: collision with root package name */
    public final int f40441m;

    /* renamed from: n, reason: collision with root package name */
    public final R7.e f40442n;

    /* renamed from: o, reason: collision with root package name */
    public final String f40443o;

    /* renamed from: p, reason: collision with root package name */
    public final String f40444p;

    /* renamed from: z5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0930a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            String str14;
            AbstractC3159y.i(parcel, "parcel");
            AbstractC3159y.i(parcel, "parcel");
            String readString = parcel.readString();
            if (readString == null) {
                str = "";
            } else {
                str = readString;
            }
            String readString2 = parcel.readString();
            if (readString2 == null) {
                str2 = "";
            } else {
                str2 = readString2;
            }
            String readString3 = parcel.readString();
            if (readString3 == null) {
                str3 = "";
            } else {
                str3 = readString3;
            }
            String readString4 = parcel.readString();
            if (readString4 == null) {
                str4 = "";
            } else {
                str4 = readString4;
            }
            String readString5 = parcel.readString();
            if (readString5 == null) {
                str5 = "";
            } else {
                str5 = readString5;
            }
            String readString6 = parcel.readString();
            if (readString6 == null) {
                str6 = "";
            } else {
                str6 = readString6;
            }
            String readString7 = parcel.readString();
            if (readString7 == null) {
                str7 = "";
            } else {
                str7 = readString7;
            }
            String readString8 = parcel.readString();
            if (readString8 == null) {
                str8 = "";
            } else {
                str8 = readString8;
            }
            String readString9 = parcel.readString();
            if (readString9 == null) {
                str9 = "";
            } else {
                str9 = readString9;
            }
            String readString10 = parcel.readString();
            if (readString10 == null) {
                str10 = "";
            } else {
                str10 = readString10;
            }
            String readString11 = parcel.readString();
            if (readString11 == null) {
                str11 = "";
            } else {
                str11 = readString11;
            }
            String readString12 = parcel.readString();
            if (readString12 == null) {
                str12 = "";
            } else {
                str12 = readString12;
            }
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            R7.e eVar = R7.e.IAB_VENDOR;
            if (readInt2 != 1) {
                R7.e eVar2 = R7.e.NON_IAB_VENDOR;
                if (readInt2 != 2) {
                    eVar2 = R7.e.GOOGLE_VENDOR;
                    if (readInt2 != 3) {
                        eVar2 = R7.e.PUBLISHER_VENDOR;
                        if (readInt2 != 4) {
                            eVar2 = R7.e.PURPOSE;
                            if (readInt2 != 5) {
                                eVar2 = R7.e.SPECIAL_PURPOSE;
                                if (readInt2 != 6) {
                                    eVar2 = R7.e.FEATURES;
                                    if (readInt2 != 7) {
                                        eVar2 = R7.e.SPECIAL_FEATURE;
                                        if (readInt2 != 8) {
                                            eVar2 = R7.e.GOOGLE_BASIC_CONSENT_PURPOSE;
                                            if (readInt2 != 9) {
                                                R7.e eVar3 = R7.e.PURPOSE_PARTNER;
                                                if (readInt2 == 10) {
                                                    eVar = eVar3;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                eVar = eVar2;
            }
            String readString13 = parcel.readString();
            if (readString13 == null) {
                str13 = "";
            } else {
                str13 = readString13;
            }
            String readString14 = parcel.readString();
            if (readString14 == null) {
                str14 = "";
            } else {
                str14 = readString14;
            }
            return new C4027a(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, readInt, eVar, str13, str14);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i8) {
            return new C4027a[i8];
        }
    }

    public C4027a(String name, String str, String purposes, String legitimateInterests, String specialPurposes, String features, String specialFeatures, String dataDeclarations, String privacyPolicy, String cookieMaxAge, String usesNonCookieAccess, String dataRetention, int i8, R7.e switchItemType, String disclosuresUrl, String disclosuresErrorLabel) {
        AbstractC3159y.i(name, "name");
        AbstractC3159y.i(purposes, "purposes");
        AbstractC3159y.i(legitimateInterests, "legitimateInterests");
        AbstractC3159y.i(specialPurposes, "specialPurposes");
        AbstractC3159y.i(features, "features");
        AbstractC3159y.i(specialFeatures, "specialFeatures");
        AbstractC3159y.i(dataDeclarations, "dataDeclarations");
        AbstractC3159y.i(privacyPolicy, "privacyPolicy");
        AbstractC3159y.i(cookieMaxAge, "cookieMaxAge");
        AbstractC3159y.i(usesNonCookieAccess, "usesNonCookieAccess");
        AbstractC3159y.i(dataRetention, "dataRetention");
        AbstractC3159y.i(switchItemType, "switchItemType");
        AbstractC3159y.i(disclosuresUrl, "disclosuresUrl");
        AbstractC3159y.i(disclosuresErrorLabel, "disclosuresErrorLabel");
        this.f40429a = name;
        this.f40430b = str;
        this.f40431c = purposes;
        this.f40432d = legitimateInterests;
        this.f40433e = specialPurposes;
        this.f40434f = features;
        this.f40435g = specialFeatures;
        this.f40436h = dataDeclarations;
        this.f40437i = privacyPolicy;
        this.f40438j = cookieMaxAge;
        this.f40439k = usesNonCookieAccess;
        this.f40440l = dataRetention;
        this.f40441m = i8;
        this.f40442n = switchItemType;
        this.f40443o = disclosuresUrl;
        this.f40444p = disclosuresErrorLabel;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4027a)) {
            return false;
        }
        C4027a c4027a = (C4027a) obj;
        if (AbstractC3159y.d(this.f40429a, c4027a.f40429a) && AbstractC3159y.d(this.f40430b, c4027a.f40430b) && AbstractC3159y.d(this.f40431c, c4027a.f40431c) && AbstractC3159y.d(this.f40432d, c4027a.f40432d) && AbstractC3159y.d(this.f40433e, c4027a.f40433e) && AbstractC3159y.d(this.f40434f, c4027a.f40434f) && AbstractC3159y.d(this.f40435g, c4027a.f40435g) && AbstractC3159y.d(this.f40436h, c4027a.f40436h) && AbstractC3159y.d(this.f40437i, c4027a.f40437i) && AbstractC3159y.d(this.f40438j, c4027a.f40438j) && AbstractC3159y.d(this.f40439k, c4027a.f40439k) && AbstractC3159y.d(this.f40440l, c4027a.f40440l) && this.f40441m == c4027a.f40441m && this.f40442n == c4027a.f40442n && AbstractC3159y.d(this.f40443o, c4027a.f40443o) && AbstractC3159y.d(this.f40444p, c4027a.f40444p)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f40429a.hashCode() * 31;
        String str = this.f40430b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f40444p.hashCode() + t.a(this.f40443o, (this.f40442n.hashCode() + k.a(this.f40441m, t.a(this.f40440l, t.a(this.f40439k, t.a(this.f40438j, t.a(this.f40437i, t.a(this.f40436h, t.a(this.f40435g, t.a(this.f40434f, t.a(this.f40433e, t.a(this.f40432d, t.a(this.f40431c, (hashCode2 + hashCode) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31, 31);
    }

    public String toString() {
        return "PartnersDetailDialogArgs(name=" + this.f40429a + ", description=" + ((Object) this.f40430b) + ", purposes=" + this.f40431c + ", legitimateInterests=" + this.f40432d + ", specialPurposes=" + this.f40433e + ", features=" + this.f40434f + ", specialFeatures=" + this.f40435g + ", dataDeclarations=" + this.f40436h + ", privacyPolicy=" + this.f40437i + ", cookieMaxAge=" + this.f40438j + ", usesNonCookieAccess=" + this.f40439k + ", dataRetention=" + this.f40440l + ", vendorId=" + this.f40441m + ", switchItemType=" + this.f40442n + ", disclosuresUrl=" + this.f40443o + ", disclosuresErrorLabel=" + this.f40444p + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3159y.i(parcel, "parcel");
        parcel.writeString(this.f40429a);
        parcel.writeString(this.f40430b);
        parcel.writeString(this.f40431c);
        parcel.writeString(this.f40432d);
        parcel.writeString(this.f40433e);
        parcel.writeString(this.f40434f);
        parcel.writeString(this.f40435g);
        parcel.writeString(this.f40436h);
        parcel.writeString(this.f40437i);
        parcel.writeString(this.f40438j);
        parcel.writeString(this.f40439k);
        parcel.writeString(this.f40440l);
        parcel.writeInt(this.f40441m);
        parcel.writeInt(this.f40442n.f8933a);
        parcel.writeString(this.f40443o);
        parcel.writeString(this.f40444p);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C4027a(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, int r31, R7.e r32, java.lang.String r33, java.lang.String r34, int r35) {
        /*
            Method dump skipped, instructions count: 176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.C4027a.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, R7.e, java.lang.String, java.lang.String, int):void");
    }
}
