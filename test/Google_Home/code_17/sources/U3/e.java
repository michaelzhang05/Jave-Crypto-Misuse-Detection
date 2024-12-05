package u3;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.paymentsheet.u;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final u.b f39985a;

    /* renamed from: b, reason: collision with root package name */
    private final C4059a f39986b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f39987c;

    /* renamed from: d, reason: collision with root package name */
    private final String f39988d;

    /* renamed from: e, reason: collision with root package name */
    private final d f39989e;

    /* renamed from: f, reason: collision with root package name */
    private final String f39990f;

    /* renamed from: g, reason: collision with root package name */
    private final String f39991g;

    /* renamed from: h, reason: collision with root package name */
    private final Set f39992h;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e createFromParcel(Parcel parcel) {
            C4059a createFromParcel;
            AbstractC3255y.i(parcel, "parcel");
            u.b createFromParcel2 = u.b.CREATOR.createFromParcel(parcel);
            d dVar = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = C4059a.CREATOR.createFromParcel(parcel);
            }
            C4059a c4059a = createFromParcel;
            int readInt = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                linkedHashSet.add(parcel.readString());
            }
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                dVar = d.CREATOR.createFromParcel(parcel);
            }
            d dVar2 = dVar;
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt2 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt2);
            for (int i9 = 0; i9 != readInt2; i9++) {
                linkedHashSet2.add(parcel.readString());
            }
            return new e(createFromParcel2, c4059a, linkedHashSet, readString, dVar2, readString2, readString3, linkedHashSet2);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e[] newArray(int i8) {
            return new e[i8];
        }
    }

    public e(u.b appearance, C4059a c4059a, Set allowedCountries, String str, d dVar, String str2, String str3, Set autocompleteCountries) {
        AbstractC3255y.i(appearance, "appearance");
        AbstractC3255y.i(allowedCountries, "allowedCountries");
        AbstractC3255y.i(autocompleteCountries, "autocompleteCountries");
        this.f39985a = appearance;
        this.f39986b = c4059a;
        this.f39987c = allowedCountries;
        this.f39988d = str;
        this.f39989e = dVar;
        this.f39990f = str2;
        this.f39991g = str3;
        this.f39992h = autocompleteCountries;
    }

    public final d a() {
        return this.f39989e;
    }

    public final C4059a b() {
        return this.f39986b;
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
        if (AbstractC3255y.d(this.f39985a, eVar.f39985a) && AbstractC3255y.d(this.f39986b, eVar.f39986b) && AbstractC3255y.d(this.f39987c, eVar.f39987c) && AbstractC3255y.d(this.f39988d, eVar.f39988d) && AbstractC3255y.d(this.f39989e, eVar.f39989e) && AbstractC3255y.d(this.f39990f, eVar.f39990f) && AbstractC3255y.d(this.f39991g, eVar.f39991g) && AbstractC3255y.d(this.f39992h, eVar.f39992h)) {
            return true;
        }
        return false;
    }

    public final Set g() {
        return this.f39987c;
    }

    public final u.b h() {
        return this.f39985a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.f39985a.hashCode() * 31;
        C4059a c4059a = this.f39986b;
        int i8 = 0;
        if (c4059a == null) {
            hashCode = 0;
        } else {
            hashCode = c4059a.hashCode();
        }
        int hashCode6 = (((hashCode5 + hashCode) * 31) + this.f39987c.hashCode()) * 31;
        String str = this.f39988d;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i9 = (hashCode6 + hashCode2) * 31;
        d dVar = this.f39989e;
        if (dVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = dVar.hashCode();
        }
        int i10 = (i9 + hashCode3) * 31;
        String str2 = this.f39990f;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i11 = (i10 + hashCode4) * 31;
        String str3 = this.f39991g;
        if (str3 != null) {
            i8 = str3.hashCode();
        }
        return ((i11 + i8) * 31) + this.f39992h.hashCode();
    }

    public final Set i() {
        return this.f39992h;
    }

    public final String l() {
        return this.f39988d;
    }

    public final String p() {
        return this.f39991g;
    }

    public final String s() {
        return this.f39990f;
    }

    public String toString() {
        return "Configuration(appearance=" + this.f39985a + ", address=" + this.f39986b + ", allowedCountries=" + this.f39987c + ", buttonTitle=" + this.f39988d + ", additionalFields=" + this.f39989e + ", title=" + this.f39990f + ", googlePlacesApiKey=" + this.f39991g + ", autocompleteCountries=" + this.f39992h + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        this.f39985a.writeToParcel(out, i8);
        C4059a c4059a = this.f39986b;
        if (c4059a == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c4059a.writeToParcel(out, i8);
        }
        Set set = this.f39987c;
        out.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            out.writeString((String) it.next());
        }
        out.writeString(this.f39988d);
        d dVar = this.f39989e;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
        out.writeString(this.f39990f);
        out.writeString(this.f39991g);
        Set set2 = this.f39992h;
        out.writeInt(set2.size());
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            out.writeString((String) it2.next());
        }
    }
}
