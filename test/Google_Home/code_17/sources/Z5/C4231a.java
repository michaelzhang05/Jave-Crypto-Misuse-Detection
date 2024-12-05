package z5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* renamed from: z5.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4231a implements Parcelable {
    public static final C0942a CREATOR = new C0942a();

    /* renamed from: a, reason: collision with root package name */
    public final List f41175a;

    /* renamed from: z5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0942a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            AbstractC3255y.i(parcel, "parcel");
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, T7.e.class.getClassLoader());
            return new C4231a(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i8) {
            return new C4231a[i8];
        }
    }

    public C4231a(List disclosures) {
        AbstractC3255y.i(disclosures, "disclosures");
        this.f41175a = disclosures;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4231a) && AbstractC3255y.d(this.f41175a, ((C4231a) obj).f41175a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f41175a.hashCode();
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("PartnersDisclosureArgs(disclosures=");
        a8.append(this.f41175a);
        a8.append(')');
        return a8.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3255y.i(parcel, "parcel");
        parcel.writeList(new ArrayList());
    }
}
