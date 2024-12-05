package b3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: b3.G, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1862G implements v2.f {
    public static final Parcelable.Creator<C1862G> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    private final String f14312a;

    /* renamed from: b, reason: collision with root package name */
    private final a f14313b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f14314c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14315d;

    /* renamed from: e, reason: collision with root package name */
    private final String f14316e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f14317f;

    /* renamed from: g, reason: collision with root package name */
    private final d f14318g;

    /* renamed from: h, reason: collision with root package name */
    private final String f14319h;

    /* renamed from: i, reason: collision with root package name */
    private final String f14320i;

    /* renamed from: b3.G$a */
    /* loaded from: classes4.dex */
    public static final class a implements v2.f {

        /* renamed from: a, reason: collision with root package name */
        private final String f14323a;

        /* renamed from: b, reason: collision with root package name */
        private final String f14324b;

        /* renamed from: c, reason: collision with root package name */
        private final String f14325c;

        /* renamed from: d, reason: collision with root package name */
        private final String f14326d;

        /* renamed from: e, reason: collision with root package name */
        private final String f14327e;

        /* renamed from: f, reason: collision with root package name */
        private final String f14328f;

        /* renamed from: g, reason: collision with root package name */
        private final String f14329g;

        /* renamed from: h, reason: collision with root package name */
        private final List f14330h;

        /* renamed from: i, reason: collision with root package name */
        private final String f14331i;

        /* renamed from: j, reason: collision with root package name */
        private final String f14332j;

        /* renamed from: k, reason: collision with root package name */
        private final String f14333k;

        /* renamed from: l, reason: collision with root package name */
        private final String f14334l;

        /* renamed from: m, reason: collision with root package name */
        public static final C0354a f14321m = new C0354a(null);

        /* renamed from: n, reason: collision with root package name */
        public static final int f14322n = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: b3.G$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0354a {
            private C0354a() {
            }

            public /* synthetic */ C0354a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* renamed from: b3.G$a$b */
        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                AbstractC3159y.i(parcel, "parcel");
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
            this.f14323a = str;
            this.f14324b = str2;
            this.f14325c = str3;
            this.f14326d = str4;
            this.f14327e = str5;
            this.f14328f = str6;
            this.f14329g = str7;
            this.f14330h = list;
            this.f14331i = str8;
            this.f14332j = str9;
            this.f14333k = str10;
            this.f14334l = str11;
        }

        public final String b() {
            return this.f14325c;
        }

        public final String c() {
            return this.f14326d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f14323a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3159y.d(this.f14323a, aVar.f14323a) && AbstractC3159y.d(this.f14324b, aVar.f14324b) && AbstractC3159y.d(this.f14325c, aVar.f14325c) && AbstractC3159y.d(this.f14326d, aVar.f14326d) && AbstractC3159y.d(this.f14327e, aVar.f14327e) && AbstractC3159y.d(this.f14328f, aVar.f14328f) && AbstractC3159y.d(this.f14329g, aVar.f14329g) && AbstractC3159y.d(this.f14330h, aVar.f14330h) && AbstractC3159y.d(this.f14331i, aVar.f14331i) && AbstractC3159y.d(this.f14332j, aVar.f14332j) && AbstractC3159y.d(this.f14333k, aVar.f14333k) && AbstractC3159y.d(this.f14334l, aVar.f14334l)) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            return AbstractC3159y.d("C", this.f14334l);
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
            String str = this.f14323a;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = hashCode * 31;
            String str2 = this.f14324b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str3 = this.f14325c;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            String str4 = this.f14326d;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i12 = (i11 + hashCode4) * 31;
            String str5 = this.f14327e;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i13 = (i12 + hashCode5) * 31;
            String str6 = this.f14328f;
            if (str6 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str6.hashCode();
            }
            int i14 = (i13 + hashCode6) * 31;
            String str7 = this.f14329g;
            if (str7 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = str7.hashCode();
            }
            int i15 = (i14 + hashCode7) * 31;
            List list = this.f14330h;
            if (list == null) {
                hashCode8 = 0;
            } else {
                hashCode8 = list.hashCode();
            }
            int i16 = (i15 + hashCode8) * 31;
            String str8 = this.f14331i;
            if (str8 == null) {
                hashCode9 = 0;
            } else {
                hashCode9 = str8.hashCode();
            }
            int i17 = (i16 + hashCode9) * 31;
            String str9 = this.f14332j;
            if (str9 == null) {
                hashCode10 = 0;
            } else {
                hashCode10 = str9.hashCode();
            }
            int i18 = (i17 + hashCode10) * 31;
            String str10 = this.f14333k;
            if (str10 == null) {
                hashCode11 = 0;
            } else {
                hashCode11 = str10.hashCode();
            }
            int i19 = (i18 + hashCode11) * 31;
            String str11 = this.f14334l;
            if (str11 != null) {
                i8 = str11.hashCode();
            }
            return i19 + i8;
        }

        public String toString() {
            return "Ares(threeDSServerTransId=" + this.f14323a + ", acsChallengeMandated=" + this.f14324b + ", acsSignedContent=" + this.f14325c + ", acsTransId=" + this.f14326d + ", acsUrl=" + this.f14327e + ", authenticationType=" + this.f14328f + ", cardholderInfo=" + this.f14329g + ", messageExtension=" + this.f14330h + ", messageType=" + this.f14331i + ", messageVersion=" + this.f14332j + ", sdkTransId=" + this.f14333k + ", transStatus=" + this.f14334l + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f14323a);
            out.writeString(this.f14324b);
            out.writeString(this.f14325c);
            out.writeString(this.f14326d);
            out.writeString(this.f14327e);
            out.writeString(this.f14328f);
            out.writeString(this.f14329g);
            List list = this.f14330h;
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
            out.writeString(this.f14331i);
            out.writeString(this.f14332j);
            out.writeString(this.f14333k);
            out.writeString(this.f14334l);
        }
    }

    /* renamed from: b3.G$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1862G createFromParcel(Parcel parcel) {
            a createFromParcel;
            Long valueOf;
            boolean z8;
            AbstractC3159y.i(parcel, "parcel");
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
            return new C1862G(readString, aVar, valueOf, readString2, readString3, z8, dVar, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1862G[] newArray(int i8) {
            return new C1862G[i8];
        }
    }

    /* renamed from: b3.G$c */
    /* loaded from: classes4.dex */
    public static final class c implements v2.f {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f14335a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f14336b;

        /* renamed from: c, reason: collision with root package name */
        private final String f14337c;

        /* renamed from: d, reason: collision with root package name */
        private final Map f14338d;

        /* renamed from: b3.G$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                boolean z8;
                LinkedHashMap linkedHashMap;
                AbstractC3159y.i(parcel, "parcel");
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
            this.f14335a = str;
            this.f14336b = z8;
            this.f14337c = str2;
            this.f14338d = map;
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
            if (AbstractC3159y.d(this.f14335a, cVar.f14335a) && this.f14336b == cVar.f14336b && AbstractC3159y.d(this.f14337c, cVar.f14337c) && AbstractC3159y.d(this.f14338d, cVar.f14338d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            String str = this.f14335a;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int a8 = ((hashCode * 31) + androidx.compose.foundation.a.a(this.f14336b)) * 31;
            String str2 = this.f14337c;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i9 = (a8 + hashCode2) * 31;
            Map map = this.f14338d;
            if (map != null) {
                i8 = map.hashCode();
            }
            return i9 + i8;
        }

        public String toString() {
            return "MessageExtension(name=" + this.f14335a + ", criticalityIndicator=" + this.f14336b + ", id=" + this.f14337c + ", data=" + this.f14338d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f14335a);
            out.writeInt(this.f14336b ? 1 : 0);
            out.writeString(this.f14337c);
            Map map = this.f14338d;
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

    /* renamed from: b3.G$d */
    /* loaded from: classes4.dex */
    public static final class d implements v2.f {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f14339a;

        /* renamed from: b, reason: collision with root package name */
        private final String f14340b;

        /* renamed from: c, reason: collision with root package name */
        private final String f14341c;

        /* renamed from: d, reason: collision with root package name */
        private final String f14342d;

        /* renamed from: e, reason: collision with root package name */
        private final String f14343e;

        /* renamed from: f, reason: collision with root package name */
        private final String f14344f;

        /* renamed from: g, reason: collision with root package name */
        private final String f14345g;

        /* renamed from: h, reason: collision with root package name */
        private final String f14346h;

        /* renamed from: i, reason: collision with root package name */
        private final String f14347i;

        /* renamed from: j, reason: collision with root package name */
        private final String f14348j;

        /* renamed from: k, reason: collision with root package name */
        private final String f14349k;

        /* renamed from: b3.G$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new d(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.f14339a = str;
            this.f14340b = str2;
            this.f14341c = str3;
            this.f14342d = str4;
            this.f14343e = str5;
            this.f14344f = str6;
            this.f14345g = str7;
            this.f14346h = str8;
            this.f14347i = str9;
            this.f14348j = str10;
            this.f14349k = str11;
        }

        public final String b() {
            return this.f14342d;
        }

        public final String c() {
            return this.f14343e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f14344f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (AbstractC3159y.d(this.f14339a, dVar.f14339a) && AbstractC3159y.d(this.f14340b, dVar.f14340b) && AbstractC3159y.d(this.f14341c, dVar.f14341c) && AbstractC3159y.d(this.f14342d, dVar.f14342d) && AbstractC3159y.d(this.f14343e, dVar.f14343e) && AbstractC3159y.d(this.f14344f, dVar.f14344f) && AbstractC3159y.d(this.f14345g, dVar.f14345g) && AbstractC3159y.d(this.f14346h, dVar.f14346h) && AbstractC3159y.d(this.f14347i, dVar.f14347i) && AbstractC3159y.d(this.f14348j, dVar.f14348j) && AbstractC3159y.d(this.f14349k, dVar.f14349k)) {
                return true;
            }
            return false;
        }

        public final String f() {
            return this.f14345g;
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
            String str = this.f14339a;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = hashCode * 31;
            String str2 = this.f14340b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str3 = this.f14341c;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            String str4 = this.f14342d;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i12 = (i11 + hashCode4) * 31;
            String str5 = this.f14343e;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i13 = (i12 + hashCode5) * 31;
            String str6 = this.f14344f;
            if (str6 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str6.hashCode();
            }
            int i14 = (i13 + hashCode6) * 31;
            String str7 = this.f14345g;
            if (str7 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = str7.hashCode();
            }
            int i15 = (i14 + hashCode7) * 31;
            String str8 = this.f14346h;
            if (str8 == null) {
                hashCode8 = 0;
            } else {
                hashCode8 = str8.hashCode();
            }
            int i16 = (i15 + hashCode8) * 31;
            String str9 = this.f14347i;
            if (str9 == null) {
                hashCode9 = 0;
            } else {
                hashCode9 = str9.hashCode();
            }
            int i17 = (i16 + hashCode9) * 31;
            String str10 = this.f14348j;
            if (str10 == null) {
                hashCode10 = 0;
            } else {
                hashCode10 = str10.hashCode();
            }
            int i18 = (i17 + hashCode10) * 31;
            String str11 = this.f14349k;
            if (str11 != null) {
                i8 = str11.hashCode();
            }
            return i18 + i8;
        }

        public String toString() {
            return "ThreeDS2Error(threeDSServerTransId=" + this.f14339a + ", acsTransId=" + this.f14340b + ", dsTransId=" + this.f14341c + ", errorCode=" + this.f14342d + ", errorComponent=" + this.f14343e + ", errorDescription=" + this.f14344f + ", errorDetail=" + this.f14345g + ", errorMessageType=" + this.f14346h + ", messageType=" + this.f14347i + ", messageVersion=" + this.f14348j + ", sdkTransId=" + this.f14349k + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f14339a);
            out.writeString(this.f14340b);
            out.writeString(this.f14341c);
            out.writeString(this.f14342d);
            out.writeString(this.f14343e);
            out.writeString(this.f14344f);
            out.writeString(this.f14345g);
            out.writeString(this.f14346h);
            out.writeString(this.f14347i);
            out.writeString(this.f14348j);
            out.writeString(this.f14349k);
        }
    }

    public C1862G(String str, a aVar, Long l8, String str2, String str3, boolean z8, d dVar, String str4, String str5) {
        this.f14312a = str;
        this.f14313b = aVar;
        this.f14314c = l8;
        this.f14315d = str2;
        this.f14316e = str3;
        this.f14317f = z8;
        this.f14318g = dVar;
        this.f14319h = str4;
        this.f14320i = str5;
    }

    public final a b() {
        return this.f14313b;
    }

    public final d c() {
        return this.f14318g;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f14319h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1862G)) {
            return false;
        }
        C1862G c1862g = (C1862G) obj;
        if (AbstractC3159y.d(this.f14312a, c1862g.f14312a) && AbstractC3159y.d(this.f14313b, c1862g.f14313b) && AbstractC3159y.d(this.f14314c, c1862g.f14314c) && AbstractC3159y.d(this.f14315d, c1862g.f14315d) && AbstractC3159y.d(this.f14316e, c1862g.f14316e) && this.f14317f == c1862g.f14317f && AbstractC3159y.d(this.f14318g, c1862g.f14318g) && AbstractC3159y.d(this.f14319h, c1862g.f14319h) && AbstractC3159y.d(this.f14320i, c1862g.f14320i)) {
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
        String str = this.f14312a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        a aVar = this.f14313b;
        if (aVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = aVar.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        Long l8 = this.f14314c;
        if (l8 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l8.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str2 = this.f14315d;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str3 = this.f14316e;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int a8 = (((i12 + hashCode5) * 31) + androidx.compose.foundation.a.a(this.f14317f)) * 31;
        d dVar = this.f14318g;
        if (dVar == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = dVar.hashCode();
        }
        int i13 = (a8 + hashCode6) * 31;
        String str4 = this.f14319h;
        if (str4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str4.hashCode();
        }
        int i14 = (i13 + hashCode7) * 31;
        String str5 = this.f14320i;
        if (str5 != null) {
            i8 = str5.hashCode();
        }
        return i14 + i8;
    }

    public String toString() {
        return "Stripe3ds2AuthResult(id=" + this.f14312a + ", ares=" + this.f14313b + ", created=" + this.f14314c + ", source=" + this.f14315d + ", state=" + this.f14316e + ", liveMode=" + this.f14317f + ", error=" + this.f14318g + ", fallbackRedirectUrl=" + this.f14319h + ", creq=" + this.f14320i + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f14312a);
        a aVar = this.f14313b;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            aVar.writeToParcel(out, i8);
        }
        Long l8 = this.f14314c;
        if (l8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l8.longValue());
        }
        out.writeString(this.f14315d);
        out.writeString(this.f14316e);
        out.writeInt(this.f14317f ? 1 : 0);
        d dVar = this.f14318g;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
        out.writeString(this.f14319h);
        out.writeString(this.f14320i);
    }
}
