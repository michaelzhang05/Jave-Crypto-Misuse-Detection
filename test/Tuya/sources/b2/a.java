package B2;

import android.os.Parcel;
import android.os.Parcelable;
import b3.EnumC1870e;
import com.stripe.android.paymentsheet.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class a implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final u.b f695a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f696b;

    /* renamed from: c, reason: collision with root package name */
    private final String f697c;

    /* renamed from: d, reason: collision with root package name */
    private final u.c f698d;

    /* renamed from: e, reason: collision with root package name */
    private final u.d f699e;

    /* renamed from: f, reason: collision with root package name */
    private final String f700f;

    /* renamed from: g, reason: collision with root package name */
    private final List f701g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f702h;

    /* renamed from: i, reason: collision with root package name */
    private final List f703i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0001a f693j = new C0001a(null);

    /* renamed from: k, reason: collision with root package name */
    public static final int f694k = 8;
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: B2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0001a {
        private C0001a() {
        }

        public /* synthetic */ C0001a(AbstractC3151p abstractC3151p) {
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
            AbstractC3159y.i(parcel, "parcel");
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
                arrayList.add(EnumC1870e.valueOf(parcel.readString()));
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
        AbstractC3159y.i(appearance, "appearance");
        AbstractC3159y.i(defaultBillingDetails, "defaultBillingDetails");
        AbstractC3159y.i(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        AbstractC3159y.i(merchantDisplayName, "merchantDisplayName");
        AbstractC3159y.i(preferredNetworks, "preferredNetworks");
        AbstractC3159y.i(paymentMethodOrder, "paymentMethodOrder");
        this.f695a = appearance;
        this.f696b = z8;
        this.f697c = str;
        this.f698d = defaultBillingDetails;
        this.f699e = billingDetailsCollectionConfiguration;
        this.f700f = merchantDisplayName;
        this.f701g = preferredNetworks;
        this.f702h = z9;
        this.f703i = paymentMethodOrder;
    }

    public final boolean b() {
        return this.f702h;
    }

    public final u.b c() {
        return this.f695a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final u.d e() {
        return this.f699e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3159y.d(this.f695a, aVar.f695a) && this.f696b == aVar.f696b && AbstractC3159y.d(this.f697c, aVar.f697c) && AbstractC3159y.d(this.f698d, aVar.f698d) && AbstractC3159y.d(this.f699e, aVar.f699e) && AbstractC3159y.d(this.f700f, aVar.f700f) && AbstractC3159y.d(this.f701g, aVar.f701g) && this.f702h == aVar.f702h && AbstractC3159y.d(this.f703i, aVar.f703i)) {
            return true;
        }
        return false;
    }

    public final u.c f() {
        return this.f698d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f695a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f696b)) * 31;
        String str = this.f697c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((((((((((hashCode2 + hashCode) * 31) + this.f698d.hashCode()) * 31) + this.f699e.hashCode()) * 31) + this.f700f.hashCode()) * 31) + this.f701g.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f702h)) * 31) + this.f703i.hashCode();
    }

    public final boolean i() {
        return this.f696b;
    }

    public final String j() {
        return this.f697c;
    }

    public final String k() {
        return this.f700f;
    }

    public final List n() {
        return this.f703i;
    }

    public final List o() {
        return this.f701g;
    }

    public String toString() {
        return "Configuration(appearance=" + this.f695a + ", googlePayEnabled=" + this.f696b + ", headerTextForSelectionScreen=" + this.f697c + ", defaultBillingDetails=" + this.f698d + ", billingDetailsCollectionConfiguration=" + this.f699e + ", merchantDisplayName=" + this.f700f + ", preferredNetworks=" + this.f701g + ", allowsRemovalOfLastSavedPaymentMethod=" + this.f702h + ", paymentMethodOrder=" + this.f703i + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        this.f695a.writeToParcel(out, i8);
        out.writeInt(this.f696b ? 1 : 0);
        out.writeString(this.f697c);
        this.f698d.writeToParcel(out, i8);
        this.f699e.writeToParcel(out, i8);
        out.writeString(this.f700f);
        List list = this.f701g;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeString(((EnumC1870e) it.next()).name());
        }
        out.writeInt(this.f702h ? 1 : 0);
        out.writeStringList(this.f703i);
    }
}
