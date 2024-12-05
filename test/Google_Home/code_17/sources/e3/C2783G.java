package e3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: e3.G, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2783G implements y2.f {
    public static final Parcelable.Creator<C2783G> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    private final String f31318a;

    /* renamed from: b, reason: collision with root package name */
    private final a f31319b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f31320c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31321d;

    /* renamed from: e, reason: collision with root package name */
    private final String f31322e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f31323f;

    /* renamed from: g, reason: collision with root package name */
    private final d f31324g;

    /* renamed from: h, reason: collision with root package name */
    private final String f31325h;

    /* renamed from: i, reason: collision with root package name */
    private final String f31326i;

    /* renamed from: e3.G$a */
    /* loaded from: classes4.dex */
    public static final class a implements y2.f {

        /* renamed from: a, reason: collision with root package name */
        private final String f31329a;

        /* renamed from: b, reason: collision with root package name */
        private final String f31330b;

        /* renamed from: c, reason: collision with root package name */
        private final String f31331c;

        /* renamed from: d, reason: collision with root package name */
        private final String f31332d;

        /* renamed from: e, reason: collision with root package name */
        private final String f31333e;

        /* renamed from: f, reason: collision with root package name */
        private final String f31334f;

        /* renamed from: g, reason: collision with root package name */
        private final String f31335g;

        /* renamed from: h, reason: collision with root package name */
        private final List f31336h;

        /* renamed from: i, reason: collision with root package name */
        private final String f31337i;

        /* renamed from: j, reason: collision with root package name */
        private final String f31338j;

        /* renamed from: k, reason: collision with root package name */
        private final String f31339k;

        /* renamed from: l, reason: collision with root package name */
        private final String f31340l;

        /* renamed from: m, reason: collision with root package name */
        public static final C0722a f31327m = new C0722a(null);

        /* renamed from: n, reason: collision with root package name */
        public static final int f31328n = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: e3.G$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0722a {
            private C0722a() {
            }

            public /* synthetic */ C0722a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* renamed from: e3.G$a$b */
        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                AbstractC3255y.i(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        arrayList2.add(c.CREATOR.createFromParcel(parcel));
                    }
                    arrayList = arrayList2;
                }
                return new a(readString, readString2, readString3, readString4, readString5, readString6, readString7, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, String str9, String str10, String str11) {
            this.f31329a = str;
            this.f31330b = str2;
            this.f31331c = str3;
            this.f31332d = str4;
            this.f31333e = str5;
            this.f31334f = str6;
            this.f31335g = str7;
            this.f31336h = list;
            this.f31337i = str8;
            this.f31338j = str9;
            this.f31339k = str10;
            this.f31340l = str11;
        }

        public final String a() {
            return this.f31331c;
        }

        public final String b() {
            return this.f31332d;
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
            if (AbstractC3255y.d(this.f31329a, aVar.f31329a) && AbstractC3255y.d(this.f31330b, aVar.f31330b) && AbstractC3255y.d(this.f31331c, aVar.f31331c) && AbstractC3255y.d(this.f31332d, aVar.f31332d) && AbstractC3255y.d(this.f31333e, aVar.f31333e) && AbstractC3255y.d(this.f31334f, aVar.f31334f) && AbstractC3255y.d(this.f31335g, aVar.f31335g) && AbstractC3255y.d(this.f31336h, aVar.f31336h) && AbstractC3255y.d(this.f31337i, aVar.f31337i) && AbstractC3255y.d(this.f31338j, aVar.f31338j) && AbstractC3255y.d(this.f31339k, aVar.f31339k) && AbstractC3255y.d(this.f31340l, aVar.f31340l)) {
                return true;
            }
            return false;
        }

        public final String g() {
            return this.f31329a;
        }

        public final boolean h() {
            return AbstractC3255y.d("C", this.f31340l);
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
            String str = this.f31329a;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = hashCode * 31;
            String str2 = this.f31330b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str3 = this.f31331c;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            String str4 = this.f31332d;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i12 = (i11 + hashCode4) * 31;
            String str5 = this.f31333e;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i13 = (i12 + hashCode5) * 31;
            String str6 = this.f31334f;
            if (str6 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str6.hashCode();
            }
            int i14 = (i13 + hashCode6) * 31;
            String str7 = this.f31335g;
            if (str7 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = str7.hashCode();
            }
            int i15 = (i14 + hashCode7) * 31;
            List list = this.f31336h;
            if (list == null) {
                hashCode8 = 0;
            } else {
                hashCode8 = list.hashCode();
            }
            int i16 = (i15 + hashCode8) * 31;
            String str8 = this.f31337i;
            if (str8 == null) {
                hashCode9 = 0;
            } else {
                hashCode9 = str8.hashCode();
            }
            int i17 = (i16 + hashCode9) * 31;
            String str9 = this.f31338j;
            if (str9 == null) {
                hashCode10 = 0;
            } else {
                hashCode10 = str9.hashCode();
            }
            int i18 = (i17 + hashCode10) * 31;
            String str10 = this.f31339k;
            if (str10 == null) {
                hashCode11 = 0;
            } else {
                hashCode11 = str10.hashCode();
            }
            int i19 = (i18 + hashCode11) * 31;
            String str11 = this.f31340l;
            if (str11 != null) {
                i8 = str11.hashCode();
            }
            return i19 + i8;
        }

        public String toString() {
            return "Ares(threeDSServerTransId=" + this.f31329a + ", acsChallengeMandated=" + this.f31330b + ", acsSignedContent=" + this.f31331c + ", acsTransId=" + this.f31332d + ", acsUrl=" + this.f31333e + ", authenticationType=" + this.f31334f + ", cardholderInfo=" + this.f31335g + ", messageExtension=" + this.f31336h + ", messageType=" + this.f31337i + ", messageVersion=" + this.f31338j + ", sdkTransId=" + this.f31339k + ", transStatus=" + this.f31340l + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f31329a);
            out.writeString(this.f31330b);
            out.writeString(this.f31331c);
            out.writeString(this.f31332d);
            out.writeString(this.f31333e);
            out.writeString(this.f31334f);
            out.writeString(this.f31335g);
            List list = this.f31336h;
            if (list == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).writeToParcel(out, i8);
                }
            }
            out.writeString(this.f31337i);
            out.writeString(this.f31338j);
            out.writeString(this.f31339k);
            out.writeString(this.f31340l);
        }
    }

    /* renamed from: e3.G$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2783G createFromParcel(Parcel parcel) {
            a createFromParcel;
            Long valueOf;
            boolean z8;
            AbstractC3255y.i(parcel, "parcel");
            String readString = parcel.readString();
            d dVar = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = a.CREATOR.createFromParcel(parcel);
            }
            a aVar = createFromParcel;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(parcel.readLong());
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (parcel.readInt() != 0) {
                dVar = d.CREATOR.createFromParcel(parcel);
            }
            return new C2783G(readString, aVar, valueOf, readString2, readString3, z8, dVar, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2783G[] newArray(int i8) {
            return new C2783G[i8];
        }
    }

    /* renamed from: e3.G$c */
    /* loaded from: classes4.dex */
    public static final class c implements y2.f {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f31341a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f31342b;

        /* renamed from: c, reason: collision with root package name */
        private final String f31343c;

        /* renamed from: d, reason: collision with root package name */
        private final Map f31344d;

        /* renamed from: e3.G$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                boolean z8;
                LinkedHashMap linkedHashMap;
                AbstractC3255y.i(parcel, "parcel");
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                String readString2 = parcel.readString();
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
                return new c(readString, z8, readString2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(String str, boolean z8, String str2, Map map) {
            this.f31341a = str;
            this.f31342b = z8;
            this.f31343c = str2;
            this.f31344d = map;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (AbstractC3255y.d(this.f31341a, cVar.f31341a) && this.f31342b == cVar.f31342b && AbstractC3255y.d(this.f31343c, cVar.f31343c) && AbstractC3255y.d(this.f31344d, cVar.f31344d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            String str = this.f31341a;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int a8 = ((hashCode * 31) + androidx.compose.foundation.a.a(this.f31342b)) * 31;
            String str2 = this.f31343c;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i9 = (a8 + hashCode2) * 31;
            Map map = this.f31344d;
            if (map != null) {
                i8 = map.hashCode();
            }
            return i9 + i8;
        }

        public String toString() {
            return "MessageExtension(name=" + this.f31341a + ", criticalityIndicator=" + this.f31342b + ", id=" + this.f31343c + ", data=" + this.f31344d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f31341a);
            out.writeInt(this.f31342b ? 1 : 0);
            out.writeString(this.f31343c);
            Map map = this.f31344d;
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
    }

    /* renamed from: e3.G$d */
    /* loaded from: classes4.dex */
    public static final class d implements y2.f {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f31345a;

        /* renamed from: b, reason: collision with root package name */
        private final String f31346b;

        /* renamed from: c, reason: collision with root package name */
        private final String f31347c;

        /* renamed from: d, reason: collision with root package name */
        private final String f31348d;

        /* renamed from: e, reason: collision with root package name */
        private final String f31349e;

        /* renamed from: f, reason: collision with root package name */
        private final String f31350f;

        /* renamed from: g, reason: collision with root package name */
        private final String f31351g;

        /* renamed from: h, reason: collision with root package name */
        private final String f31352h;

        /* renamed from: i, reason: collision with root package name */
        private final String f31353i;

        /* renamed from: j, reason: collision with root package name */
        private final String f31354j;

        /* renamed from: k, reason: collision with root package name */
        private final String f31355k;

        /* renamed from: e3.G$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new d(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.f31345a = str;
            this.f31346b = str2;
            this.f31347c = str3;
            this.f31348d = str4;
            this.f31349e = str5;
            this.f31350f = str6;
            this.f31351g = str7;
            this.f31352h = str8;
            this.f31353i = str9;
            this.f31354j = str10;
            this.f31355k = str11;
        }

        public final String a() {
            return this.f31348d;
        }

        public final String b() {
            return this.f31349e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (AbstractC3255y.d(this.f31345a, dVar.f31345a) && AbstractC3255y.d(this.f31346b, dVar.f31346b) && AbstractC3255y.d(this.f31347c, dVar.f31347c) && AbstractC3255y.d(this.f31348d, dVar.f31348d) && AbstractC3255y.d(this.f31349e, dVar.f31349e) && AbstractC3255y.d(this.f31350f, dVar.f31350f) && AbstractC3255y.d(this.f31351g, dVar.f31351g) && AbstractC3255y.d(this.f31352h, dVar.f31352h) && AbstractC3255y.d(this.f31353i, dVar.f31353i) && AbstractC3255y.d(this.f31354j, dVar.f31354j) && AbstractC3255y.d(this.f31355k, dVar.f31355k)) {
                return true;
            }
            return false;
        }

        public final String g() {
            return this.f31350f;
        }

        public final String h() {
            return this.f31351g;
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
            String str = this.f31345a;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = hashCode * 31;
            String str2 = this.f31346b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str3 = this.f31347c;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            String str4 = this.f31348d;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i12 = (i11 + hashCode4) * 31;
            String str5 = this.f31349e;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i13 = (i12 + hashCode5) * 31;
            String str6 = this.f31350f;
            if (str6 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str6.hashCode();
            }
            int i14 = (i13 + hashCode6) * 31;
            String str7 = this.f31351g;
            if (str7 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = str7.hashCode();
            }
            int i15 = (i14 + hashCode7) * 31;
            String str8 = this.f31352h;
            if (str8 == null) {
                hashCode8 = 0;
            } else {
                hashCode8 = str8.hashCode();
            }
            int i16 = (i15 + hashCode8) * 31;
            String str9 = this.f31353i;
            if (str9 == null) {
                hashCode9 = 0;
            } else {
                hashCode9 = str9.hashCode();
            }
            int i17 = (i16 + hashCode9) * 31;
            String str10 = this.f31354j;
            if (str10 == null) {
                hashCode10 = 0;
            } else {
                hashCode10 = str10.hashCode();
            }
            int i18 = (i17 + hashCode10) * 31;
            String str11 = this.f31355k;
            if (str11 != null) {
                i8 = str11.hashCode();
            }
            return i18 + i8;
        }

        public String toString() {
            return "ThreeDS2Error(threeDSServerTransId=" + this.f31345a + ", acsTransId=" + this.f31346b + ", dsTransId=" + this.f31347c + ", errorCode=" + this.f31348d + ", errorComponent=" + this.f31349e + ", errorDescription=" + this.f31350f + ", errorDetail=" + this.f31351g + ", errorMessageType=" + this.f31352h + ", messageType=" + this.f31353i + ", messageVersion=" + this.f31354j + ", sdkTransId=" + this.f31355k + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f31345a);
            out.writeString(this.f31346b);
            out.writeString(this.f31347c);
            out.writeString(this.f31348d);
            out.writeString(this.f31349e);
            out.writeString(this.f31350f);
            out.writeString(this.f31351g);
            out.writeString(this.f31352h);
            out.writeString(this.f31353i);
            out.writeString(this.f31354j);
            out.writeString(this.f31355k);
        }
    }

    public C2783G(String str, a aVar, Long l8, String str2, String str3, boolean z8, d dVar, String str4, String str5) {
        this.f31318a = str;
        this.f31319b = aVar;
        this.f31320c = l8;
        this.f31321d = str2;
        this.f31322e = str3;
        this.f31323f = z8;
        this.f31324g = dVar;
        this.f31325h = str4;
        this.f31326i = str5;
    }

    public final a a() {
        return this.f31319b;
    }

    public final d b() {
        return this.f31324g;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2783G)) {
            return false;
        }
        C2783G c2783g = (C2783G) obj;
        if (AbstractC3255y.d(this.f31318a, c2783g.f31318a) && AbstractC3255y.d(this.f31319b, c2783g.f31319b) && AbstractC3255y.d(this.f31320c, c2783g.f31320c) && AbstractC3255y.d(this.f31321d, c2783g.f31321d) && AbstractC3255y.d(this.f31322e, c2783g.f31322e) && this.f31323f == c2783g.f31323f && AbstractC3255y.d(this.f31324g, c2783g.f31324g) && AbstractC3255y.d(this.f31325h, c2783g.f31325h) && AbstractC3255y.d(this.f31326i, c2783g.f31326i)) {
            return true;
        }
        return false;
    }

    public final String g() {
        return this.f31325h;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        String str = this.f31318a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        a aVar = this.f31319b;
        if (aVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = aVar.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        Long l8 = this.f31320c;
        if (l8 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l8.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str2 = this.f31321d;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str3 = this.f31322e;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int a8 = (((i12 + hashCode5) * 31) + androidx.compose.foundation.a.a(this.f31323f)) * 31;
        d dVar = this.f31324g;
        if (dVar == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = dVar.hashCode();
        }
        int i13 = (a8 + hashCode6) * 31;
        String str4 = this.f31325h;
        if (str4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str4.hashCode();
        }
        int i14 = (i13 + hashCode7) * 31;
        String str5 = this.f31326i;
        if (str5 != null) {
            i8 = str5.hashCode();
        }
        return i14 + i8;
    }

    public String toString() {
        return "Stripe3ds2AuthResult(id=" + this.f31318a + ", ares=" + this.f31319b + ", created=" + this.f31320c + ", source=" + this.f31321d + ", state=" + this.f31322e + ", liveMode=" + this.f31323f + ", error=" + this.f31324g + ", fallbackRedirectUrl=" + this.f31325h + ", creq=" + this.f31326i + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f31318a);
        a aVar = this.f31319b;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            aVar.writeToParcel(out, i8);
        }
        Long l8 = this.f31320c;
        if (l8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l8.longValue());
        }
        out.writeString(this.f31321d);
        out.writeString(this.f31322e);
        out.writeInt(this.f31323f ? 1 : 0);
        d dVar = this.f31324g;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
        out.writeString(this.f31325h);
        out.writeString(this.f31326i);
    }
}
