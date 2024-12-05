package T7;

import B5.t;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class e implements Parcelable {
    public static final a CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f10187a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10188b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10189c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10190d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10191e;

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
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
            return new e(str, str2, str3, str4, str5);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i8) {
            return new e[i8];
        }
    }

    public e(String name, String type, String maxAge, String domain, String purposes) {
        AbstractC3255y.i(name, "name");
        AbstractC3255y.i(type, "type");
        AbstractC3255y.i(maxAge, "maxAge");
        AbstractC3255y.i(domain, "domain");
        AbstractC3255y.i(purposes, "purposes");
        this.f10187a = name;
        this.f10188b = type;
        this.f10189c = maxAge;
        this.f10190d = domain;
        this.f10191e = purposes;
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
        if (AbstractC3255y.d(this.f10187a, eVar.f10187a) && AbstractC3255y.d(this.f10188b, eVar.f10188b) && AbstractC3255y.d(this.f10189c, eVar.f10189c) && AbstractC3255y.d(this.f10190d, eVar.f10190d) && AbstractC3255y.d(this.f10191e, eVar.f10191e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f10191e.hashCode() + t.a(this.f10190d, t.a(this.f10189c, t.a(this.f10188b, this.f10187a.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("DisclosureInfo(name=");
        a8.append(this.f10187a);
        a8.append(", type=");
        a8.append(this.f10188b);
        a8.append(", maxAge=");
        a8.append(this.f10189c);
        a8.append(", domain=");
        a8.append(this.f10190d);
        a8.append(", purposes=");
        a8.append(this.f10191e);
        a8.append(')');
        return a8.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3255y.i(parcel, "parcel");
        parcel.writeString(this.f10187a);
        parcel.writeString(this.f10188b);
        parcel.writeString(this.f10189c);
        parcel.writeString(this.f10190d);
        parcel.writeString(this.f10191e);
    }
}
