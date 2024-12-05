package L3;

import O5.p;
import P5.AbstractC1378t;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.j;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class a implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f5915a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5916b;

    /* renamed from: c, reason: collision with root package name */
    private final List f5917c;

    /* renamed from: d, reason: collision with root package name */
    private final c f5918d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0101a f5913e = new C0101a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f5914f = 8;
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: L3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0101a {
        private C0101a() {
        }

        public final a a(j.c customer, List supportedSavedPaymentMethodTypes) {
            boolean z8;
            AbstractC3255y.i(customer, "customer");
            AbstractC3255y.i(supportedSavedPaymentMethodTypes, "supportedSavedPaymentMethodTypes");
            j.c.a.InterfaceC0504c a8 = customer.b().b().a();
            if (a8 instanceof j.c.a.InterfaceC0504c.b) {
                z8 = ((j.c.a.InterfaceC0504c.b) a8).b();
            } else if (a8 instanceof j.c.a.InterfaceC0504c.C0505a) {
                z8 = false;
            } else {
                throw new p();
            }
            String g8 = customer.b().g();
            String a9 = customer.b().a();
            List a10 = customer.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : a10) {
                if (AbstractC1378t.d0(supportedSavedPaymentMethodTypes, ((o) obj).f25467e)) {
                    arrayList.add(obj);
                }
            }
            return new a(g8, a9, arrayList, new c(z8, true));
        }

        public final a b(String customerId, u.h.b accessType, List paymentMethods) {
            AbstractC3255y.i(customerId, "customerId");
            AbstractC3255y.i(accessType, "accessType");
            AbstractC3255y.i(paymentMethods, "paymentMethods");
            return new a(customerId, accessType.a(), paymentMethods, new c(true, false));
        }

        public /* synthetic */ C0101a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(parcel.readParcelable(a.class.getClassLoader()));
            }
            return new a(readString, readString2, arrayList, c.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i8) {
            return new a[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new C0102a();

        /* renamed from: a, reason: collision with root package name */
        private final boolean f5919a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f5920b;

        /* renamed from: L3.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0102a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                boolean z8;
                AbstractC3255y.i(parcel, "parcel");
                boolean z9 = false;
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (parcel.readInt() != 0) {
                    z9 = true;
                }
                return new c(z8, z9);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(boolean z8, boolean z9) {
            this.f5919a = z8;
            this.f5920b = z9;
        }

        public final boolean a() {
            return this.f5920b;
        }

        public final boolean b() {
            return this.f5919a;
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
            if (this.f5919a == cVar.f5919a && this.f5920b == cVar.f5920b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (androidx.compose.foundation.a.a(this.f5919a) * 31) + androidx.compose.foundation.a.a(this.f5920b);
        }

        public String toString() {
            return "Permissions(canRemovePaymentMethods=" + this.f5919a + ", canRemoveDuplicates=" + this.f5920b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeInt(this.f5919a ? 1 : 0);
            out.writeInt(this.f5920b ? 1 : 0);
        }
    }

    public a(String id, String ephemeralKeySecret, List paymentMethods, c permissions) {
        AbstractC3255y.i(id, "id");
        AbstractC3255y.i(ephemeralKeySecret, "ephemeralKeySecret");
        AbstractC3255y.i(paymentMethods, "paymentMethods");
        AbstractC3255y.i(permissions, "permissions");
        this.f5915a = id;
        this.f5916b = ephemeralKeySecret;
        this.f5917c = paymentMethods;
        this.f5918d = permissions;
    }

    public static /* synthetic */ a b(a aVar, String str, String str2, List list, c cVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = aVar.f5915a;
        }
        if ((i8 & 2) != 0) {
            str2 = aVar.f5916b;
        }
        if ((i8 & 4) != 0) {
            list = aVar.f5917c;
        }
        if ((i8 & 8) != 0) {
            cVar = aVar.f5918d;
        }
        return aVar.a(str, str2, list, cVar);
    }

    public final a a(String id, String ephemeralKeySecret, List paymentMethods, c permissions) {
        AbstractC3255y.i(id, "id");
        AbstractC3255y.i(ephemeralKeySecret, "ephemeralKeySecret");
        AbstractC3255y.i(paymentMethods, "paymentMethods");
        AbstractC3255y.i(permissions, "permissions");
        return new a(id, ephemeralKeySecret, paymentMethods, permissions);
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
        if (AbstractC3255y.d(this.f5915a, aVar.f5915a) && AbstractC3255y.d(this.f5916b, aVar.f5916b) && AbstractC3255y.d(this.f5917c, aVar.f5917c) && AbstractC3255y.d(this.f5918d, aVar.f5918d)) {
            return true;
        }
        return false;
    }

    public final String g() {
        return this.f5916b;
    }

    public final String getId() {
        return this.f5915a;
    }

    public final List h() {
        return this.f5917c;
    }

    public int hashCode() {
        return (((((this.f5915a.hashCode() * 31) + this.f5916b.hashCode()) * 31) + this.f5917c.hashCode()) * 31) + this.f5918d.hashCode();
    }

    public final c i() {
        return this.f5918d;
    }

    public String toString() {
        return "CustomerState(id=" + this.f5915a + ", ephemeralKeySecret=" + this.f5916b + ", paymentMethods=" + this.f5917c + ", permissions=" + this.f5918d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f5915a);
        out.writeString(this.f5916b);
        List list = this.f5917c;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeParcelable((Parcelable) it.next(), i8);
        }
        this.f5918d.writeToParcel(out, i8);
    }
}
