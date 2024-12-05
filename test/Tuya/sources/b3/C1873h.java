package b3;

import M5.a0;
import android.os.Parcel;
import android.os.Parcelable;
import b3.C1864I;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: b3.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1873h extends AbstractC1865J {

    /* renamed from: c, reason: collision with root package name */
    private final EnumC1870e f14473c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f14474d;

    /* renamed from: e, reason: collision with root package name */
    private final String f14475e;

    /* renamed from: f, reason: collision with root package name */
    private final int f14476f;

    /* renamed from: g, reason: collision with root package name */
    private final int f14477g;

    /* renamed from: h, reason: collision with root package name */
    private final String f14478h;

    /* renamed from: i, reason: collision with root package name */
    private String f14479i;

    /* renamed from: j, reason: collision with root package name */
    private com.stripe.android.model.a f14480j;

    /* renamed from: k, reason: collision with root package name */
    private String f14481k;

    /* renamed from: l, reason: collision with root package name */
    private Map f14482l;

    /* renamed from: m, reason: collision with root package name */
    private static final a f14471m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    public static final int f14472n = 8;
    public static final Parcelable.Creator<C1873h> CREATOR = new b();

    /* renamed from: b3.h$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: b3.h$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1873h createFromParcel(Parcel parcel) {
            com.stripe.android.model.a createFromParcel;
            LinkedHashMap linkedHashMap;
            AbstractC3159y.i(parcel, "parcel");
            EnumC1870e valueOf = EnumC1870e.valueOf(parcel.readString());
            int readInt = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                linkedHashSet.add(parcel.readString());
            }
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = com.stripe.android.model.a.CREATOR.createFromParcel(parcel);
            }
            com.stripe.android.model.a aVar = createFromParcel;
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt4 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt4);
                for (int i9 = 0; i9 != readInt4; i9++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new C1873h(valueOf, linkedHashSet, readString, readInt2, readInt3, readString2, readString3, aVar, readString4, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1873h[] newArray(int i8) {
            return new C1873h[i8];
        }
    }

    public /* synthetic */ C1873h(EnumC1870e enumC1870e, Set set, String str, int i8, int i9, String str2, String str3, com.stripe.android.model.a aVar, String str4, Map map, int i10, AbstractC3151p abstractC3151p) {
        this(enumC1870e, (i10 & 2) != 0 ? a0.f() : set, str, i8, i9, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? null : str3, (i10 & 128) != 0 ? null : aVar, (i10 & 256) != 0 ? null : str4, (i10 & 512) != 0 ? null : map);
    }

    public final String c() {
        return this.f14478h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f14476f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1873h)) {
            return false;
        }
        C1873h c1873h = (C1873h) obj;
        if (this.f14473c == c1873h.f14473c && AbstractC3159y.d(this.f14474d, c1873h.f14474d) && AbstractC3159y.d(this.f14475e, c1873h.f14475e) && this.f14476f == c1873h.f14476f && this.f14477g == c1873h.f14477g && AbstractC3159y.d(this.f14478h, c1873h.f14478h) && AbstractC3159y.d(this.f14479i, c1873h.f14479i) && AbstractC3159y.d(this.f14480j, c1873h.f14480j) && AbstractC3159y.d(this.f14481k, c1873h.f14481k) && AbstractC3159y.d(this.f14482l, c1873h.f14482l)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f14477g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = ((((((((this.f14473c.hashCode() * 31) + this.f14474d.hashCode()) * 31) + this.f14475e.hashCode()) * 31) + this.f14476f) * 31) + this.f14477g) * 31;
        String str = this.f14478h;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode5 + hashCode) * 31;
        String str2 = this.f14479i;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        com.stripe.android.model.a aVar = this.f14480j;
        if (aVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = aVar.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str3 = this.f14481k;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        Map map = this.f14482l;
        if (map != null) {
            i8 = map.hashCode();
        }
        return i12 + i8;
    }

    public final String i() {
        return this.f14475e;
    }

    public String toString() {
        return "CardParams(brand=" + this.f14473c + ", loggingTokens=" + this.f14474d + ", number=" + this.f14475e + ", expMonth=" + this.f14476f + ", expYear=" + this.f14477g + ", cvc=" + this.f14478h + ", name=" + this.f14479i + ", address=" + this.f14480j + ", currency=" + this.f14481k + ", metadata=" + this.f14482l + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f14473c.name());
        Set set = this.f14474d;
        out.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            out.writeString((String) it.next());
        }
        out.writeString(this.f14475e);
        out.writeInt(this.f14476f);
        out.writeInt(this.f14477g);
        out.writeString(this.f14478h);
        out.writeString(this.f14479i);
        com.stripe.android.model.a aVar = this.f14480j;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            aVar.writeToParcel(out, i8);
        }
        out.writeString(this.f14481k);
        Map map = this.f14482l;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1873h(EnumC1870e brand, Set loggingTokens, String number, int i8, int i9, String str, String str2, com.stripe.android.model.a aVar, String str3, Map map) {
        super(C1864I.c.f14359c, loggingTokens);
        AbstractC3159y.i(brand, "brand");
        AbstractC3159y.i(loggingTokens, "loggingTokens");
        AbstractC3159y.i(number, "number");
        this.f14473c = brand;
        this.f14474d = loggingTokens;
        this.f14475e = number;
        this.f14476f = i8;
        this.f14477g = i9;
        this.f14478h = str;
        this.f14479i = str2;
        this.f14480j = aVar;
        this.f14481k = str3;
        this.f14482l = map;
    }
}
