package e3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: e3.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2778B implements y2.f {
    public static final Parcelable.Creator<C2778B> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final List f31276a;

    /* renamed from: e3.B$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2778B createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(com.stripe.android.model.o.CREATOR.createFromParcel(parcel));
            }
            return new C2778B(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2778B[] newArray(int i8) {
            return new C2778B[i8];
        }
    }

    public C2778B(List paymentMethods) {
        AbstractC3255y.i(paymentMethods, "paymentMethods");
        this.f31276a = paymentMethods;
    }

    public final List a() {
        return this.f31276a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2778B) && AbstractC3255y.d(this.f31276a, ((C2778B) obj).f31276a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f31276a.hashCode();
    }

    public String toString() {
        return "PaymentMethodsList(paymentMethods=" + this.f31276a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        List list = this.f31276a;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.stripe.android.model.o) it.next()).writeToParcel(out, i8);
        }
    }
}
