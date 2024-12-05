package C5;

import B5.t;
import F6.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class a implements Parcelable {
    public static final C0023a CREATOR = new C0023a();

    /* renamed from: a, reason: collision with root package name */
    public final String f1547a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1548b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1549c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1550d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1551e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1552f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1553g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1554h;

    /* renamed from: i, reason: collision with root package name */
    public final String f1555i;

    /* renamed from: j, reason: collision with root package name */
    public final String f1556j;

    /* renamed from: k, reason: collision with root package name */
    public final String f1557k;

    /* renamed from: l, reason: collision with root package name */
    public final String f1558l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1559m;

    /* renamed from: n, reason: collision with root package name */
    public final U7.e f1560n;

    /* renamed from: o, reason: collision with root package name */
    public final String f1561o;

    /* renamed from: p, reason: collision with root package name */
    public final String f1562p;

    /* renamed from: C5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0023a implements Parcelable.Creator {
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
            AbstractC3255y.i(parcel, "parcel");
            AbstractC3255y.i(parcel, "parcel");
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
            U7.e eVar = U7.e.IAB_VENDOR;
            if (readInt2 != 1) {
                U7.e eVar2 = U7.e.NON_IAB_VENDOR;
                if (readInt2 != 2) {
                    eVar2 = U7.e.GOOGLE_VENDOR;
                    if (readInt2 != 3) {
                        eVar2 = U7.e.PUBLISHER_VENDOR;
                        if (readInt2 != 4) {
                            eVar2 = U7.e.PURPOSE;
                            if (readInt2 != 5) {
                                eVar2 = U7.e.SPECIAL_PURPOSE;
                                if (readInt2 != 6) {
                                    eVar2 = U7.e.FEATURES;
                                    if (readInt2 != 7) {
                                        eVar2 = U7.e.SPECIAL_FEATURE;
                                        if (readInt2 != 8) {
                                            eVar2 = U7.e.GOOGLE_BASIC_CONSENT_PURPOSE;
                                            if (readInt2 != 9) {
                                                U7.e eVar3 = U7.e.PURPOSE_PARTNER;
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
            return new a(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, readInt, eVar, str13, str14);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i8) {
            return new a[i8];
        }
    }

    public a(String name, String str, String purposes, String legitimateInterests, String specialPurposes, String features, String specialFeatures, String dataDeclarations, String privacyPolicy, String cookieMaxAge, String usesNonCookieAccess, String dataRetention, int i8, U7.e switchItemType, String disclosuresUrl, String disclosuresErrorLabel) {
        AbstractC3255y.i(name, "name");
        AbstractC3255y.i(purposes, "purposes");
        AbstractC3255y.i(legitimateInterests, "legitimateInterests");
        AbstractC3255y.i(specialPurposes, "specialPurposes");
        AbstractC3255y.i(features, "features");
        AbstractC3255y.i(specialFeatures, "specialFeatures");
        AbstractC3255y.i(dataDeclarations, "dataDeclarations");
        AbstractC3255y.i(privacyPolicy, "privacyPolicy");
        AbstractC3255y.i(cookieMaxAge, "cookieMaxAge");
        AbstractC3255y.i(usesNonCookieAccess, "usesNonCookieAccess");
        AbstractC3255y.i(dataRetention, "dataRetention");
        AbstractC3255y.i(switchItemType, "switchItemType");
        AbstractC3255y.i(disclosuresUrl, "disclosuresUrl");
        AbstractC3255y.i(disclosuresErrorLabel, "disclosuresErrorLabel");
        this.f1547a = name;
        this.f1548b = str;
        this.f1549c = purposes;
        this.f1550d = legitimateInterests;
        this.f1551e = specialPurposes;
        this.f1552f = features;
        this.f1553g = specialFeatures;
        this.f1554h = dataDeclarations;
        this.f1555i = privacyPolicy;
        this.f1556j = cookieMaxAge;
        this.f1557k = usesNonCookieAccess;
        this.f1558l = dataRetention;
        this.f1559m = i8;
        this.f1560n = switchItemType;
        this.f1561o = disclosuresUrl;
        this.f1562p = disclosuresErrorLabel;
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
        if (AbstractC3255y.d(this.f1547a, aVar.f1547a) && AbstractC3255y.d(this.f1548b, aVar.f1548b) && AbstractC3255y.d(this.f1549c, aVar.f1549c) && AbstractC3255y.d(this.f1550d, aVar.f1550d) && AbstractC3255y.d(this.f1551e, aVar.f1551e) && AbstractC3255y.d(this.f1552f, aVar.f1552f) && AbstractC3255y.d(this.f1553g, aVar.f1553g) && AbstractC3255y.d(this.f1554h, aVar.f1554h) && AbstractC3255y.d(this.f1555i, aVar.f1555i) && AbstractC3255y.d(this.f1556j, aVar.f1556j) && AbstractC3255y.d(this.f1557k, aVar.f1557k) && AbstractC3255y.d(this.f1558l, aVar.f1558l) && this.f1559m == aVar.f1559m && this.f1560n == aVar.f1560n && AbstractC3255y.d(this.f1561o, aVar.f1561o) && AbstractC3255y.d(this.f1562p, aVar.f1562p)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f1547a.hashCode() * 31;
        String str = this.f1548b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f1562p.hashCode() + t.a(this.f1561o, (this.f1560n.hashCode() + k.a(this.f1559m, t.a(this.f1558l, t.a(this.f1557k, t.a(this.f1556j, t.a(this.f1555i, t.a(this.f1554h, t.a(this.f1553g, t.a(this.f1552f, t.a(this.f1551e, t.a(this.f1550d, t.a(this.f1549c, (hashCode2 + hashCode) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31, 31);
    }

    public String toString() {
        return "PartnersDetailDialogArgs(name=" + this.f1547a + ", description=" + ((Object) this.f1548b) + ", purposes=" + this.f1549c + ", legitimateInterests=" + this.f1550d + ", specialPurposes=" + this.f1551e + ", features=" + this.f1552f + ", specialFeatures=" + this.f1553g + ", dataDeclarations=" + this.f1554h + ", privacyPolicy=" + this.f1555i + ", cookieMaxAge=" + this.f1556j + ", usesNonCookieAccess=" + this.f1557k + ", dataRetention=" + this.f1558l + ", vendorId=" + this.f1559m + ", switchItemType=" + this.f1560n + ", disclosuresUrl=" + this.f1561o + ", disclosuresErrorLabel=" + this.f1562p + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3255y.i(parcel, "parcel");
        parcel.writeString(this.f1547a);
        parcel.writeString(this.f1548b);
        parcel.writeString(this.f1549c);
        parcel.writeString(this.f1550d);
        parcel.writeString(this.f1551e);
        parcel.writeString(this.f1552f);
        parcel.writeString(this.f1553g);
        parcel.writeString(this.f1554h);
        parcel.writeString(this.f1555i);
        parcel.writeString(this.f1556j);
        parcel.writeString(this.f1557k);
        parcel.writeString(this.f1558l);
        parcel.writeInt(this.f1559m);
        parcel.writeInt(this.f1560n.f10559a);
        parcel.writeString(this.f1561o);
        parcel.writeString(this.f1562p);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ a(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, int r31, U7.e r32, java.lang.String r33, java.lang.String r34, int r35) {
        /*
            Method dump skipped, instructions count: 176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C5.a.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, U7.e, java.lang.String, java.lang.String, int):void");
    }
}
