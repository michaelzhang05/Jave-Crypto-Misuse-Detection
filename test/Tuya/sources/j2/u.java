package j2;

import android.os.Parcel;
import android.os.Parcelable;
import b3.C1858C;
import com.stripe.android.model.o;
import com.stripe.android.view.EnumC2472u;
import com.stripe.android.view.ShippingInfoWidget;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class u implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final List f33074a;

    /* renamed from: b, reason: collision with root package name */
    private final List f33075b;

    /* renamed from: c, reason: collision with root package name */
    private final C1858C f33076c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f33077d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f33078e;

    /* renamed from: f, reason: collision with root package name */
    private final int f33079f;

    /* renamed from: g, reason: collision with root package name */
    private final int f33080g;

    /* renamed from: h, reason: collision with root package name */
    private final List f33081h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f33082i;

    /* renamed from: j, reason: collision with root package name */
    private final Set f33083j;

    /* renamed from: k, reason: collision with root package name */
    private final EnumC2472u f33084k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f33085l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f33086m;

    /* renamed from: n, reason: collision with root package name */
    private final Integer f33087n;

    /* renamed from: o, reason: collision with root package name */
    private static final a f33071o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    public static final int f33072p = 8;
    public static final Parcelable.Creator<u> CREATOR = new b();

    /* renamed from: q, reason: collision with root package name */
    private static final EnumC2472u f33073q = EnumC2472u.f27969b;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u createFromParcel(Parcel parcel) {
            C1858C createFromParcel;
            boolean z8;
            boolean z9;
            boolean z10;
            String readString;
            boolean z11;
            boolean z12;
            Integer valueOf;
            AbstractC3159y.i(parcel, "parcel");
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
                createFromParcel = C1858C.CREATOR.createFromParcel(parcel);
            }
            C1858C c1858c = createFromParcel;
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
            EnumC2472u valueOf2 = EnumC2472u.valueOf(readString);
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
            return new u(arrayList, arrayList2, c1858c, z8, z9, readInt3, readInt4, arrayList3, z10, linkedHashSet, valueOf2, z11, z12, null, null, valueOf);
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

    public u(List hiddenShippingInfoFields, List optionalShippingInfoFields, C1858C c1858c, boolean z8, boolean z9, int i8, int i9, List paymentMethodTypes, boolean z10, Set allowedShippingCountryCodes, EnumC2472u billingAddressFields, boolean z11, boolean z12, c shippingInformationValidator, d dVar, Integer num) {
        AbstractC3159y.i(hiddenShippingInfoFields, "hiddenShippingInfoFields");
        AbstractC3159y.i(optionalShippingInfoFields, "optionalShippingInfoFields");
        AbstractC3159y.i(paymentMethodTypes, "paymentMethodTypes");
        AbstractC3159y.i(allowedShippingCountryCodes, "allowedShippingCountryCodes");
        AbstractC3159y.i(billingAddressFields, "billingAddressFields");
        AbstractC3159y.i(shippingInformationValidator, "shippingInformationValidator");
        this.f33074a = hiddenShippingInfoFields;
        this.f33075b = optionalShippingInfoFields;
        this.f33076c = c1858c;
        this.f33077d = z8;
        this.f33078e = z9;
        this.f33079f = i8;
        this.f33080g = i9;
        this.f33081h = paymentMethodTypes;
        this.f33082i = z10;
        this.f33083j = allowedShippingCountryCodes;
        this.f33084k = billingAddressFields;
        this.f33085l = z11;
        this.f33086m = z12;
        this.f33087n = num;
        String[] iSOCountries = Locale.getISOCountries();
        Iterator it = allowedShippingCountryCodes.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC3159y.f(iSOCountries);
            for (String str2 : iSOCountries) {
                if (g6.n.s(str, str2, true)) {
                    break;
                }
            }
            throw new IllegalArgumentException(("'" + str + "' is not a valid country code").toString());
        }
        if (this.f33078e) {
            throw new IllegalArgumentException("If isShippingMethodRequired is true a ShippingMethodsFactory must also be provided.".toString());
        }
    }

    public final Set b() {
        return this.f33083j;
    }

    public final List c() {
        return this.f33074a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List e() {
        return this.f33075b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (AbstractC3159y.d(this.f33074a, uVar.f33074a) && AbstractC3159y.d(this.f33075b, uVar.f33075b) && AbstractC3159y.d(this.f33076c, uVar.f33076c) && this.f33077d == uVar.f33077d && this.f33078e == uVar.f33078e && this.f33079f == uVar.f33079f && this.f33080g == uVar.f33080g && AbstractC3159y.d(this.f33081h, uVar.f33081h) && this.f33082i == uVar.f33082i && AbstractC3159y.d(this.f33083j, uVar.f33083j) && this.f33084k == uVar.f33084k && this.f33085l == uVar.f33085l && this.f33086m == uVar.f33086m && AbstractC3159y.d(null, null) && AbstractC3159y.d(null, null) && AbstractC3159y.d(this.f33087n, uVar.f33087n)) {
            return true;
        }
        return false;
    }

    public final C1858C f() {
        return this.f33076c;
    }

    public int hashCode() {
        this.f33074a.hashCode();
        this.f33075b.hashCode();
        C1858C c1858c = this.f33076c;
        if (c1858c != null) {
            c1858c.hashCode();
        }
        androidx.compose.foundation.a.a(this.f33077d);
        androidx.compose.foundation.a.a(this.f33078e);
        this.f33081h.hashCode();
        androidx.compose.foundation.a.a(this.f33082i);
        this.f33083j.hashCode();
        this.f33084k.hashCode();
        androidx.compose.foundation.a.a(this.f33085l);
        androidx.compose.foundation.a.a(this.f33086m);
        throw null;
    }

    public final c i() {
        return null;
    }

    public final d j() {
        return null;
    }

    public final boolean k() {
        return this.f33077d;
    }

    public final boolean n() {
        return this.f33078e;
    }

    public String toString() {
        return "PaymentSessionConfig(hiddenShippingInfoFields=" + this.f33074a + ", optionalShippingInfoFields=" + this.f33075b + ", prepopulatedShippingInfo=" + this.f33076c + ", isShippingInfoRequired=" + this.f33077d + ", isShippingMethodRequired=" + this.f33078e + ", paymentMethodsFooterLayoutId=" + this.f33079f + ", addPaymentMethodFooterLayoutId=" + this.f33080g + ", paymentMethodTypes=" + this.f33081h + ", shouldShowGooglePay=" + this.f33082i + ", allowedShippingCountryCodes=" + this.f33083j + ", billingAddressFields=" + this.f33084k + ", canDeletePaymentMethods=" + this.f33085l + ", shouldPrefetchCustomer=" + this.f33086m + ", shippingInformationValidator=" + ((Object) null) + ", shippingMethodsFactory=" + ((Object) null) + ", windowFlags=" + this.f33087n + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        List list = this.f33074a;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeString(((ShippingInfoWidget.a) it.next()).name());
        }
        List list2 = this.f33075b;
        out.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            out.writeString(((ShippingInfoWidget.a) it2.next()).name());
        }
        C1858C c1858c = this.f33076c;
        if (c1858c == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c1858c.writeToParcel(out, i8);
        }
        out.writeInt(this.f33077d ? 1 : 0);
        out.writeInt(this.f33078e ? 1 : 0);
        out.writeInt(this.f33079f);
        out.writeInt(this.f33080g);
        List list3 = this.f33081h;
        out.writeInt(list3.size());
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            ((o.p) it3.next()).writeToParcel(out, i8);
        }
        out.writeInt(this.f33082i ? 1 : 0);
        Set set = this.f33083j;
        out.writeInt(set.size());
        Iterator it4 = set.iterator();
        while (it4.hasNext()) {
            out.writeString((String) it4.next());
        }
        out.writeString(this.f33084k.name());
        out.writeInt(this.f33085l ? 1 : 0);
        out.writeInt(this.f33086m ? 1 : 0);
        out.writeSerializable(null);
        out.writeSerializable(null);
        Integer num = this.f33087n;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
    }
}
