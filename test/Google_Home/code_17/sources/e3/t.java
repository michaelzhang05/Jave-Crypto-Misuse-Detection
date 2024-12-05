package e3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class t implements y2.f {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f31565a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31566b;

    /* renamed from: c, reason: collision with root package name */
    private final C2779C f31567c;

    /* renamed from: d, reason: collision with root package name */
    private final List f31568d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f31569e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f31570f;

    /* renamed from: g, reason: collision with root package name */
    private final String f31571g;

    /* renamed from: h, reason: collision with root package name */
    private final String f31572h;

    /* renamed from: i, reason: collision with root package name */
    private final String f31573i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f31574j;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t createFromParcel(Parcel parcel) {
            C2779C createFromParcel;
            boolean z8;
            boolean z9;
            AbstractC3255y.i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer num = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = C2779C.CREATOR.createFromParcel(parcel);
            }
            C2779C c2779c = createFromParcel;
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
            return new t(readString, readString2, c2779c, arrayList, z8, num2, readString3, readString4, readString5, z9);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t[] newArray(int i8) {
            return new t[i8];
        }
    }

    public t(String str, String str2, C2779C c2779c, List sources, boolean z8, Integer num, String str3, String str4, String str5, boolean z9) {
        AbstractC3255y.i(sources, "sources");
        this.f31565a = str;
        this.f31566b = str2;
        this.f31567c = c2779c;
        this.f31568d = sources;
        this.f31569e = z8;
        this.f31570f = num;
        this.f31571g = str3;
        this.f31572h = str4;
        this.f31573i = str5;
        this.f31574j = z9;
    }

    public final String a() {
        return this.f31573i;
    }

    public final C2779C b() {
        return this.f31567c;
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
        if (AbstractC3255y.d(this.f31565a, tVar.f31565a) && AbstractC3255y.d(this.f31566b, tVar.f31566b) && AbstractC3255y.d(this.f31567c, tVar.f31567c) && AbstractC3255y.d(this.f31568d, tVar.f31568d) && this.f31569e == tVar.f31569e && AbstractC3255y.d(this.f31570f, tVar.f31570f) && AbstractC3255y.d(this.f31571g, tVar.f31571g) && AbstractC3255y.d(this.f31572h, tVar.f31572h) && AbstractC3255y.d(this.f31573i, tVar.f31573i) && this.f31574j == tVar.f31574j) {
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
        String str = this.f31565a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f31566b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        C2779C c2779c = this.f31567c;
        if (c2779c == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2779c.hashCode();
        }
        int hashCode7 = (((((i10 + hashCode3) * 31) + this.f31568d.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f31569e)) * 31;
        Integer num = this.f31570f;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int i11 = (hashCode7 + hashCode4) * 31;
        String str3 = this.f31571g;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i12 = (i11 + hashCode5) * 31;
        String str4 = this.f31572h;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i13 = (i12 + hashCode6) * 31;
        String str5 = this.f31573i;
        if (str5 != null) {
            i8 = str5.hashCode();
        }
        return ((i13 + i8) * 31) + androidx.compose.foundation.a.a(this.f31574j);
    }

    public String toString() {
        return "Customer(id=" + this.f31565a + ", defaultSource=" + this.f31566b + ", shippingInformation=" + this.f31567c + ", sources=" + this.f31568d + ", hasMore=" + this.f31569e + ", totalCount=" + this.f31570f + ", url=" + this.f31571g + ", description=" + this.f31572h + ", email=" + this.f31573i + ", liveMode=" + this.f31574j + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f31565a);
        out.writeString(this.f31566b);
        C2779C c2779c = this.f31567c;
        if (c2779c == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c2779c.writeToParcel(out, i8);
        }
        List list = this.f31568d;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeParcelable((Parcelable) it.next(), i8);
        }
        out.writeInt(this.f31569e ? 1 : 0);
        Integer num = this.f31570f;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.f31571g);
        out.writeString(this.f31572h);
        out.writeString(this.f31573i);
        out.writeInt(this.f31574j ? 1 : 0);
    }
}
