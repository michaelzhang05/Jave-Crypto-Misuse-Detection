package u2;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class f implements y2.f, Serializable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f39964a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39965b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39966c;

    /* renamed from: d, reason: collision with root package name */
    private final String f39967d;

    /* renamed from: e, reason: collision with root package name */
    private final String f39968e;

    /* renamed from: f, reason: collision with root package name */
    private final String f39969f;

    /* renamed from: g, reason: collision with root package name */
    private final String f39970g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f39971h;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            AbstractC3255y.i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap2;
            }
            return new f(readString, readString2, readString3, readString4, readString5, readString6, readString7, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f[] newArray(int i8) {
            return new f[i8];
        }
    }

    public f(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map) {
        this.f39964a = str;
        this.f39965b = str2;
        this.f39966c = str3;
        this.f39967d = str4;
        this.f39968e = str5;
        this.f39969f = str6;
        this.f39970g = str7;
        this.f39971h = map;
    }

    public static /* synthetic */ f b(f fVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, int i8, Object obj) {
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        Map map2;
        if ((i8 & 1) != 0) {
            str8 = fVar.f39964a;
        } else {
            str8 = str;
        }
        if ((i8 & 2) != 0) {
            str9 = fVar.f39965b;
        } else {
            str9 = str2;
        }
        if ((i8 & 4) != 0) {
            str10 = fVar.f39966c;
        } else {
            str10 = str3;
        }
        if ((i8 & 8) != 0) {
            str11 = fVar.f39967d;
        } else {
            str11 = str4;
        }
        if ((i8 & 16) != 0) {
            str12 = fVar.f39968e;
        } else {
            str12 = str5;
        }
        if ((i8 & 32) != 0) {
            str13 = fVar.f39969f;
        } else {
            str13 = str6;
        }
        if ((i8 & 64) != 0) {
            str14 = fVar.f39970g;
        } else {
            str14 = str7;
        }
        if ((i8 & 128) != 0) {
            map2 = fVar.f39971h;
        } else {
            map2 = map;
        }
        return fVar.a(str8, str9, str10, str11, str12, str13, str14, map2);
    }

    public final f a(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map) {
        return new f(str, str2, str3, str4, str5, str6, str7, map);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3255y.d(this.f39964a, fVar.f39964a) && AbstractC3255y.d(this.f39965b, fVar.f39965b) && AbstractC3255y.d(this.f39966c, fVar.f39966c) && AbstractC3255y.d(this.f39967d, fVar.f39967d) && AbstractC3255y.d(this.f39968e, fVar.f39968e) && AbstractC3255y.d(this.f39969f, fVar.f39969f) && AbstractC3255y.d(this.f39970g, fVar.f39970g) && AbstractC3255y.d(this.f39971h, fVar.f39971h)) {
            return true;
        }
        return false;
    }

    public final String g() {
        return this.f39969f;
    }

    public final String getType() {
        return this.f39964a;
    }

    public final String h() {
        return this.f39968e;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        String str = this.f39964a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f39965b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str3 = this.f39966c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str4 = this.f39967d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str5 = this.f39968e;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str6 = this.f39969f;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        String str7 = this.f39970g;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        Map map = this.f39971h;
        if (map != null) {
            i8 = map.hashCode();
        }
        return i15 + i8;
    }

    public final String i() {
        return this.f39965b;
    }

    public final String o() {
        return this.f39966c;
    }

    public final String s() {
        return this.f39967d;
    }

    public String toString() {
        return "StripeError(type=" + this.f39964a + ", message=" + this.f39965b + ", code=" + this.f39966c + ", param=" + this.f39967d + ", declineCode=" + this.f39968e + ", charge=" + this.f39969f + ", docUrl=" + this.f39970g + ", extraFields=" + this.f39971h + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f39964a);
        out.writeString(this.f39965b);
        out.writeString(this.f39966c);
        out.writeString(this.f39967d);
        out.writeString(this.f39968e);
        out.writeString(this.f39969f);
        out.writeString(this.f39970g);
        Map map = this.f39971h;
        if (map == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            out.writeString((String) entry.getKey());
            out.writeString((String) entry.getValue());
        }
    }

    public /* synthetic */ f(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? null : str5, (i8 & 32) != 0 ? null : str6, (i8 & 64) != 0 ? null : str7, (i8 & 128) == 0 ? map : null);
    }
}
