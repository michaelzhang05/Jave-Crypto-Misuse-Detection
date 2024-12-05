package m2;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.o;
import com.stripe.android.view.EnumC2666u;
import com.stripe.android.view.ShippingInfoWidget;
import e3.C2779C;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class u implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final List f35050a;

    /* renamed from: b, reason: collision with root package name */
    private final List f35051b;

    /* renamed from: c, reason: collision with root package name */
    private final C2779C f35052c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f35053d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f35054e;

    /* renamed from: f, reason: collision with root package name */
    private final int f35055f;

    /* renamed from: g, reason: collision with root package name */
    private final int f35056g;

    /* renamed from: h, reason: collision with root package name */
    private final List f35057h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f35058i;

    /* renamed from: j, reason: collision with root package name */
    private final Set f35059j;

    /* renamed from: k, reason: collision with root package name */
    private final EnumC2666u f35060k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f35061l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f35062m;

    /* renamed from: n, reason: collision with root package name */
    private final Integer f35063n;

    /* renamed from: o, reason: collision with root package name */
    private static final a f35047o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    public static final int f35048p = 8;
    public static final Parcelable.Creator<u> CREATOR = new b();

    /* renamed from: q, reason: collision with root package name */
    private static final EnumC2666u f35049q = EnumC2666u.f29024b;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u createFromParcel(Parcel parcel) {
            C2779C createFromParcel;
            boolean z8;
            boolean z9;
            boolean z10;
            String readString;
            boolean z11;
            boolean z12;
            Integer valueOf;
            AbstractC3255y.i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(ShippingInfoWidget.a.valueOf(parcel.readString()));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i9 = 0; i9 != readInt2; i9++) {
                arrayList2.add(ShippingInfoWidget.a.valueOf(parcel.readString()));
            }
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = C2779C.CREATOR.createFromParcel(parcel);
            }
            C2779C c2779c = createFromParcel;
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt5);
            for (int i10 = 0; i10 != readInt5; i10++) {
                arrayList3.add(o.p.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int readInt6 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt6);
            int i11 = 0;
            while (true) {
                readString = parcel.readString();
                if (i11 == readInt6) {
                    break;
                }
                linkedHashSet.add(readString);
                i11++;
            }
            EnumC2666u valueOf2 = EnumC2666u.valueOf(readString);
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (parcel.readInt() != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            android.support.v4.media.a.a(parcel.readSerializable());
            android.support.v4.media.a.a(parcel.readSerializable());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
            }
            return new u(arrayList, arrayList2, c2779c, z8, z9, readInt3, readInt4, arrayList3, z10, linkedHashSet, valueOf2, z11, z12, null, null, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final u[] newArray(int i8) {
            return new u[i8];
        }
    }

    /* loaded from: classes4.dex */
    public interface c extends Serializable {
    }

    /* loaded from: classes4.dex */
    public interface d extends Serializable {
    }

    public u(List hiddenShippingInfoFields, List optionalShippingInfoFields, C2779C c2779c, boolean z8, boolean z9, int i8, int i9, List paymentMethodTypes, boolean z10, Set allowedShippingCountryCodes, EnumC2666u billingAddressFields, boolean z11, boolean z12, c shippingInformationValidator, d dVar, Integer num) {
        AbstractC3255y.i(hiddenShippingInfoFields, "hiddenShippingInfoFields");
        AbstractC3255y.i(optionalShippingInfoFields, "optionalShippingInfoFields");
        AbstractC3255y.i(paymentMethodTypes, "paymentMethodTypes");
        AbstractC3255y.i(allowedShippingCountryCodes, "allowedShippingCountryCodes");
        AbstractC3255y.i(billingAddressFields, "billingAddressFields");
        AbstractC3255y.i(shippingInformationValidator, "shippingInformationValidator");
        this.f35050a = hiddenShippingInfoFields;
        this.f35051b = optionalShippingInfoFields;
        this.f35052c = c2779c;
        this.f35053d = z8;
        this.f35054e = z9;
        this.f35055f = i8;
        this.f35056g = i9;
        this.f35057h = paymentMethodTypes;
        this.f35058i = z10;
        this.f35059j = allowedShippingCountryCodes;
        this.f35060k = billingAddressFields;
        this.f35061l = z11;
        this.f35062m = z12;
        this.f35063n = num;
        String[] iSOCountries = Locale.getISOCountries();
        Iterator it = allowedShippingCountryCodes.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC3255y.f(iSOCountries);
            for (String str2 : iSOCountries) {
                if (j6.n.s(str, str2, true)) {
                    break;
                }
            }
            throw new IllegalArgumentException(("'" + str + "' is not a valid country code").toString());
        }
        if (this.f35054e) {
            throw new IllegalArgumentException("If isShippingMethodRequired is true a ShippingMethodsFactory must also be provided.".toString());
        }
    }

    public final Set a() {
        return this.f35059j;
    }

    public final List b() {
        return this.f35050a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (AbstractC3255y.d(this.f35050a, uVar.f35050a) && AbstractC3255y.d(this.f35051b, uVar.f35051b) && AbstractC3255y.d(this.f35052c, uVar.f35052c) && this.f35053d == uVar.f35053d && this.f35054e == uVar.f35054e && this.f35055f == uVar.f35055f && this.f35056g == uVar.f35056g && AbstractC3255y.d(this.f35057h, uVar.f35057h) && this.f35058i == uVar.f35058i && AbstractC3255y.d(this.f35059j, uVar.f35059j) && this.f35060k == uVar.f35060k && this.f35061l == uVar.f35061l && this.f35062m == uVar.f35062m && AbstractC3255y.d(null, null) && AbstractC3255y.d(null, null) && AbstractC3255y.d(this.f35063n, uVar.f35063n)) {
            return true;
        }
        return false;
    }

    public final List g() {
        return this.f35051b;
    }

    public final C2779C h() {
        return this.f35052c;
    }

    public int hashCode() {
        this.f35050a.hashCode();
        this.f35051b.hashCode();
        C2779C c2779c = this.f35052c;
        if (c2779c != null) {
            c2779c.hashCode();
        }
        androidx.compose.foundation.a.a(this.f35053d);
        androidx.compose.foundation.a.a(this.f35054e);
        this.f35057h.hashCode();
        androidx.compose.foundation.a.a(this.f35058i);
        this.f35059j.hashCode();
        this.f35060k.hashCode();
        androidx.compose.foundation.a.a(this.f35061l);
        androidx.compose.foundation.a.a(this.f35062m);
        throw null;
    }

    public final c i() {
        return null;
    }

    public final d l() {
        return null;
    }

    public final boolean p() {
        return this.f35053d;
    }

    public final boolean s() {
        return this.f35054e;
    }

    public String toString() {
        return "PaymentSessionConfig(hiddenShippingInfoFields=" + this.f35050a + ", optionalShippingInfoFields=" + this.f35051b + ", prepopulatedShippingInfo=" + this.f35052c + ", isShippingInfoRequired=" + this.f35053d + ", isShippingMethodRequired=" + this.f35054e + ", paymentMethodsFooterLayoutId=" + this.f35055f + ", addPaymentMethodFooterLayoutId=" + this.f35056g + ", paymentMethodTypes=" + this.f35057h + ", shouldShowGooglePay=" + this.f35058i + ", allowedShippingCountryCodes=" + this.f35059j + ", billingAddressFields=" + this.f35060k + ", canDeletePaymentMethods=" + this.f35061l + ", shouldPrefetchCustomer=" + this.f35062m + ", shippingInformationValidator=" + ((Object) null) + ", shippingMethodsFactory=" + ((Object) null) + ", windowFlags=" + this.f35063n + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        List list = this.f35050a;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeString(((ShippingInfoWidget.a) it.next()).name());
        }
        List list2 = this.f35051b;
        out.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            out.writeString(((ShippingInfoWidget.a) it2.next()).name());
        }
        C2779C c2779c = this.f35052c;
        if (c2779c == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c2779c.writeToParcel(out, i8);
        }
        out.writeInt(this.f35053d ? 1 : 0);
        out.writeInt(this.f35054e ? 1 : 0);
        out.writeInt(this.f35055f);
        out.writeInt(this.f35056g);
        List list3 = this.f35057h;
        out.writeInt(list3.size());
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            ((o.p) it3.next()).writeToParcel(out, i8);
        }
        out.writeInt(this.f35058i ? 1 : 0);
        Set set = this.f35059j;
        out.writeInt(set.size());
        Iterator it4 = set.iterator();
        while (it4.hasNext()) {
            out.writeString((String) it4.next());
        }
        out.writeString(this.f35060k.name());
        out.writeInt(this.f35061l ? 1 : 0);
        out.writeInt(this.f35062m ? 1 : 0);
        out.writeSerializable(null);
        out.writeSerializable(null);
        Integer num = this.f35063n;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
    }
}
