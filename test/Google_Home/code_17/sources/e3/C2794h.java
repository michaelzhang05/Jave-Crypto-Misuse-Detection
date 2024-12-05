package e3;

import P5.a0;
import android.os.Parcel;
import android.os.Parcelable;
import e3.C2785I;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: e3.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2794h extends AbstractC2786J {

    /* renamed from: c, reason: collision with root package name */
    private final EnumC2791e f31479c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f31480d;

    /* renamed from: e, reason: collision with root package name */
    private final String f31481e;

    /* renamed from: f, reason: collision with root package name */
    private final int f31482f;

    /* renamed from: g, reason: collision with root package name */
    private final int f31483g;

    /* renamed from: h, reason: collision with root package name */
    private final String f31484h;

    /* renamed from: i, reason: collision with root package name */
    private String f31485i;

    /* renamed from: j, reason: collision with root package name */
    private com.stripe.android.model.a f31486j;

    /* renamed from: k, reason: collision with root package name */
    private String f31487k;

    /* renamed from: l, reason: collision with root package name */
    private Map f31488l;

    /* renamed from: m, reason: collision with root package name */
    private static final a f31477m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    public static final int f31478n = 8;
    public static final Parcelable.Creator<C2794h> CREATOR = new b();

    /* renamed from: e3.h$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: e3.h$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2794h createFromParcel(Parcel parcel) {
            com.stripe.android.model.a createFromParcel;
            LinkedHashMap linkedHashMap;
            AbstractC3255y.i(parcel, "parcel");
            EnumC2791e valueOf = EnumC2791e.valueOf(parcel.readString());
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
            return new C2794h(valueOf, linkedHashSet, readString, readInt2, readInt3, readString2, readString3, aVar, readString4, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2794h[] newArray(int i8) {
            return new C2794h[i8];
        }
    }

    public /* synthetic */ C2794h(EnumC2791e enumC2791e, Set set, String str, int i8, int i9, String str2, String str3, com.stripe.android.model.a aVar, String str4, Map map, int i10, AbstractC3247p abstractC3247p) {
        this(enumC2791e, (i10 & 2) != 0 ? a0.f() : set, str, i8, i9, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? null : str3, (i10 & 128) != 0 ? null : aVar, (i10 & 256) != 0 ? null : str4, (i10 & 512) != 0 ? null : map);
    }

    public final String b() {
        return this.f31484h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2794h)) {
            return false;
        }
        C2794h c2794h = (C2794h) obj;
        if (this.f31479c == c2794h.f31479c && AbstractC3255y.d(this.f31480d, c2794h.f31480d) && AbstractC3255y.d(this.f31481e, c2794h.f31481e) && this.f31482f == c2794h.f31482f && this.f31483g == c2794h.f31483g && AbstractC3255y.d(this.f31484h, c2794h.f31484h) && AbstractC3255y.d(this.f31485i, c2794h.f31485i) && AbstractC3255y.d(this.f31486j, c2794h.f31486j) && AbstractC3255y.d(this.f31487k, c2794h.f31487k) && AbstractC3255y.d(this.f31488l, c2794h.f31488l)) {
            return true;
        }
        return false;
    }

    public final int g() {
        return this.f31482f;
    }

    public final int h() {
        return this.f31483g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = ((((((((this.f31479c.hashCode() * 31) + this.f31480d.hashCode()) * 31) + this.f31481e.hashCode()) * 31) + this.f31482f) * 31) + this.f31483g) * 31;
        String str = this.f31484h;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode5 + hashCode) * 31;
        String str2 = this.f31485i;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        com.stripe.android.model.a aVar = this.f31486j;
        if (aVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = aVar.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str3 = this.f31487k;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        Map map = this.f31488l;
        if (map != null) {
            i8 = map.hashCode();
        }
        return i12 + i8;
    }

    public final String i() {
        return this.f31481e;
    }

    public String toString() {
        return "CardParams(brand=" + this.f31479c + ", loggingTokens=" + this.f31480d + ", number=" + this.f31481e + ", expMonth=" + this.f31482f + ", expYear=" + this.f31483g + ", cvc=" + this.f31484h + ", name=" + this.f31485i + ", address=" + this.f31486j + ", currency=" + this.f31487k + ", metadata=" + this.f31488l + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f31479c.name());
        Set set = this.f31480d;
        out.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            out.writeString((String) it.next());
        }
        out.writeString(this.f31481e);
        out.writeInt(this.f31482f);
        out.writeInt(this.f31483g);
        out.writeString(this.f31484h);
        out.writeString(this.f31485i);
        com.stripe.android.model.a aVar = this.f31486j;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            aVar.writeToParcel(out, i8);
        }
        out.writeString(this.f31487k);
        Map map = this.f31488l;
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
    public C2794h(EnumC2791e brand, Set loggingTokens, String number, int i8, int i9, String str, String str2, com.stripe.android.model.a aVar, String str3, Map map) {
        super(C2785I.c.f31365c, loggingTokens);
        AbstractC3255y.i(brand, "brand");
        AbstractC3255y.i(loggingTokens, "loggingTokens");
        AbstractC3255y.i(number, "number");
        this.f31479c = brand;
        this.f31480d = loggingTokens;
        this.f31481e = number;
        this.f31482f = i8;
        this.f31483g = i9;
        this.f31484h = str;
        this.f31485i = str2;
        this.f31486j = aVar;
        this.f31487k = str3;
        this.f31488l = map;
    }
}
