package Q7;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;
import y5.t;

/* loaded from: classes5.dex */
public final class e implements Parcelable {
    public static final a CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f8390a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8391b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8392c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8393d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8394e;

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
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
            return new e(str, str2, str3, str4, str5);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i8) {
            return new e[i8];
        }
    }

    public e(String name, String type, String maxAge, String domain, String purposes) {
        AbstractC3159y.i(name, "name");
        AbstractC3159y.i(type, "type");
        AbstractC3159y.i(maxAge, "maxAge");
        AbstractC3159y.i(domain, "domain");
        AbstractC3159y.i(purposes, "purposes");
        this.f8390a = name;
        this.f8391b = type;
        this.f8392c = maxAge;
        this.f8393d = domain;
        this.f8394e = purposes;
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
        if (AbstractC3159y.d(this.f8390a, eVar.f8390a) && AbstractC3159y.d(this.f8391b, eVar.f8391b) && AbstractC3159y.d(this.f8392c, eVar.f8392c) && AbstractC3159y.d(this.f8393d, eVar.f8393d) && AbstractC3159y.d(this.f8394e, eVar.f8394e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f8394e.hashCode() + t.a(this.f8393d, t.a(this.f8392c, t.a(this.f8391b, this.f8390a.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("DisclosureInfo(name=");
        a8.append(this.f8390a);
        a8.append(", type=");
        a8.append(this.f8391b);
        a8.append(", maxAge=");
        a8.append(this.f8392c);
        a8.append(", domain=");
        a8.append(this.f8393d);
        a8.append(", purposes=");
        a8.append(this.f8394e);
        a8.append(')');
        return a8.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3159y.i(parcel, "parcel");
        parcel.writeString(this.f8390a);
        parcel.writeString(this.f8391b);
        parcel.writeString(this.f8392c);
        parcel.writeString(this.f8393d);
        parcel.writeString(this.f8394e);
    }
}
