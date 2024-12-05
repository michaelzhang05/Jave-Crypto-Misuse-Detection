package b3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: b3.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1857B implements v2.f {
    public static final Parcelable.Creator<C1857B> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final List f14270a;

    /* renamed from: b3.B$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1857B createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(com.stripe.android.model.o.CREATOR.createFromParcel(parcel));
            }
            return new C1857B(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1857B[] newArray(int i8) {
            return new C1857B[i8];
        }
    }

    public C1857B(List paymentMethods) {
        AbstractC3159y.i(paymentMethods, "paymentMethods");
        this.f14270a = paymentMethods;
    }

    public final List b() {
        return this.f14270a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1857B) && AbstractC3159y.d(this.f14270a, ((C1857B) obj).f14270a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f14270a.hashCode();
    }

    public String toString() {
        return "PaymentMethodsList(paymentMethods=" + this.f14270a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        List list = this.f14270a;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.stripe.android.model.o) it.next()).writeToParcel(out, i8);
        }
    }
}
