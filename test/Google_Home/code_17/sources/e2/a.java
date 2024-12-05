package E2;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.paymentsheet.u;
import e3.EnumC2791e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class a implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final u.b f2290a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f2291b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2292c;

    /* renamed from: d, reason: collision with root package name */
    private final u.c f2293d;

    /* renamed from: e, reason: collision with root package name */
    private final u.d f2294e;

    /* renamed from: f, reason: collision with root package name */
    private final String f2295f;

    /* renamed from: g, reason: collision with root package name */
    private final List f2296g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f2297h;

    /* renamed from: i, reason: collision with root package name */
    private final List f2298i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0026a f2288j = new C0026a(null);

    /* renamed from: k, reason: collision with root package name */
    public static final int f2289k = 8;
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: E2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0026a {
        private C0026a() {
        }

        public /* synthetic */ C0026a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(Parcel parcel) {
            boolean z8;
            boolean z9;
            AbstractC3255y.i(parcel, "parcel");
            u.b createFromParcel = u.b.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            String readString = parcel.readString();
            u.c createFromParcel2 = u.c.CREATOR.createFromParcel(parcel);
            u.d createFromParcel3 = u.d.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(EnumC2791e.valueOf(parcel.readString()));
            }
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            return new a(createFromParcel, z8, readString, createFromParcel2, createFromParcel3, readString2, arrayList, z9, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i8) {
            return new a[i8];
        }
    }

    public a(u.b appearance, boolean z8, String str, u.c defaultBillingDetails, u.d billingDetailsCollectionConfiguration, String merchantDisplayName, List preferredNetworks, boolean z9, List paymentMethodOrder) {
        AbstractC3255y.i(appearance, "appearance");
        AbstractC3255y.i(defaultBillingDetails, "defaultBillingDetails");
        AbstractC3255y.i(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        AbstractC3255y.i(merchantDisplayName, "merchantDisplayName");
        AbstractC3255y.i(preferredNetworks, "preferredNetworks");
        AbstractC3255y.i(paymentMethodOrder, "paymentMethodOrder");
        this.f2290a = appearance;
        this.f2291b = z8;
        this.f2292c = str;
        this.f2293d = defaultBillingDetails;
        this.f2294e = billingDetailsCollectionConfiguration;
        this.f2295f = merchantDisplayName;
        this.f2296g = preferredNetworks;
        this.f2297h = z9;
        this.f2298i = paymentMethodOrder;
    }

    public final boolean a() {
        return this.f2297h;
    }

    public final u.b b() {
        return this.f2290a;
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
        if (AbstractC3255y.d(this.f2290a, aVar.f2290a) && this.f2291b == aVar.f2291b && AbstractC3255y.d(this.f2292c, aVar.f2292c) && AbstractC3255y.d(this.f2293d, aVar.f2293d) && AbstractC3255y.d(this.f2294e, aVar.f2294e) && AbstractC3255y.d(this.f2295f, aVar.f2295f) && AbstractC3255y.d(this.f2296g, aVar.f2296g) && this.f2297h == aVar.f2297h && AbstractC3255y.d(this.f2298i, aVar.f2298i)) {
            return true;
        }
        return false;
    }

    public final u.d g() {
        return this.f2294e;
    }

    public final u.c h() {
        return this.f2293d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f2290a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f2291b)) * 31;
        String str = this.f2292c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((((((((((hashCode2 + hashCode) * 31) + this.f2293d.hashCode()) * 31) + this.f2294e.hashCode()) * 31) + this.f2295f.hashCode()) * 31) + this.f2296g.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f2297h)) * 31) + this.f2298i.hashCode();
    }

    public final boolean i() {
        return this.f2291b;
    }

    public final String l() {
        return this.f2292c;
    }

    public final String p() {
        return this.f2295f;
    }

    public final List s() {
        return this.f2298i;
    }

    public String toString() {
        return "Configuration(appearance=" + this.f2290a + ", googlePayEnabled=" + this.f2291b + ", headerTextForSelectionScreen=" + this.f2292c + ", defaultBillingDetails=" + this.f2293d + ", billingDetailsCollectionConfiguration=" + this.f2294e + ", merchantDisplayName=" + this.f2295f + ", preferredNetworks=" + this.f2296g + ", allowsRemovalOfLastSavedPaymentMethod=" + this.f2297h + ", paymentMethodOrder=" + this.f2298i + ")";
    }

    public final List u() {
        return this.f2296g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        this.f2290a.writeToParcel(out, i8);
        out.writeInt(this.f2291b ? 1 : 0);
        out.writeString(this.f2292c);
        this.f2293d.writeToParcel(out, i8);
        this.f2294e.writeToParcel(out, i8);
        out.writeString(this.f2295f);
        List list = this.f2296g;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeString(((EnumC2791e) it.next()).name());
        }
        out.writeInt(this.f2297h ? 1 : 0);
        out.writeStringList(this.f2298i);
    }
}
