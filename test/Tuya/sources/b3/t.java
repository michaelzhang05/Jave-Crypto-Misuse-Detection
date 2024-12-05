package b3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class t implements v2.f {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f14559a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14560b;

    /* renamed from: c, reason: collision with root package name */
    private final C1858C f14561c;

    /* renamed from: d, reason: collision with root package name */
    private final List f14562d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f14563e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f14564f;

    /* renamed from: g, reason: collision with root package name */
    private final String f14565g;

    /* renamed from: h, reason: collision with root package name */
    private final String f14566h;

    /* renamed from: i, reason: collision with root package name */
    private final String f14567i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f14568j;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t createFromParcel(Parcel parcel) {
            C1858C createFromParcel;
            boolean z8;
            boolean z9;
            AbstractC3159y.i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer num = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = C1858C.CREATOR.createFromParcel(parcel);
            }
            C1858C c1858c = createFromParcel;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(parcel.readParcelable(t.class.getClassLoader()));
            }
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            Integer num2 = num;
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            return new t(readString, readString2, c1858c, arrayList, z8, num2, readString3, readString4, readString5, z9);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t[] newArray(int i8) {
            return new t[i8];
        }
    }

    public t(String str, String str2, C1858C c1858c, List sources, boolean z8, Integer num, String str3, String str4, String str5, boolean z9) {
        AbstractC3159y.i(sources, "sources");
        this.f14559a = str;
        this.f14560b = str2;
        this.f14561c = c1858c;
        this.f14562d = sources;
        this.f14563e = z8;
        this.f14564f = num;
        this.f14565g = str3;
        this.f14566h = str4;
        this.f14567i = str5;
        this.f14568j = z9;
    }

    public final String b() {
        return this.f14567i;
    }

    public final C1858C c() {
        return this.f14561c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (AbstractC3159y.d(this.f14559a, tVar.f14559a) && AbstractC3159y.d(this.f14560b, tVar.f14560b) && AbstractC3159y.d(this.f14561c, tVar.f14561c) && AbstractC3159y.d(this.f14562d, tVar.f14562d) && this.f14563e == tVar.f14563e && AbstractC3159y.d(this.f14564f, tVar.f14564f) && AbstractC3159y.d(this.f14565g, tVar.f14565g) && AbstractC3159y.d(this.f14566h, tVar.f14566h) && AbstractC3159y.d(this.f14567i, tVar.f14567i) && this.f14568j == tVar.f14568j) {
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
        String str = this.f14559a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f14560b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        C1858C c1858c = this.f14561c;
        if (c1858c == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c1858c.hashCode();
        }
        int hashCode7 = (((((i10 + hashCode3) * 31) + this.f14562d.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f14563e)) * 31;
        Integer num = this.f14564f;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int i11 = (hashCode7 + hashCode4) * 31;
        String str3 = this.f14565g;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i12 = (i11 + hashCode5) * 31;
        String str4 = this.f14566h;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i13 = (i12 + hashCode6) * 31;
        String str5 = this.f14567i;
        if (str5 != null) {
            i8 = str5.hashCode();
        }
        return ((i13 + i8) * 31) + androidx.compose.foundation.a.a(this.f14568j);
    }

    public String toString() {
        return "Customer(id=" + this.f14559a + ", defaultSource=" + this.f14560b + ", shippingInformation=" + this.f14561c + ", sources=" + this.f14562d + ", hasMore=" + this.f14563e + ", totalCount=" + this.f14564f + ", url=" + this.f14565g + ", description=" + this.f14566h + ", email=" + this.f14567i + ", liveMode=" + this.f14568j + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f14559a);
        out.writeString(this.f14560b);
        C1858C c1858c = this.f14561c;
        if (c1858c == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c1858c.writeToParcel(out, i8);
        }
        List list = this.f14562d;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeParcelable((Parcelable) it.next(), i8);
        }
        out.writeInt(this.f14563e ? 1 : 0);
        Integer num = this.f14564f;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.f14565g);
        out.writeString(this.f14566h);
        out.writeString(this.f14567i);
        out.writeInt(this.f14568j ? 1 : 0);
    }
}
