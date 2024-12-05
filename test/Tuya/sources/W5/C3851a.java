package w5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;

/* renamed from: w5.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3851a implements Parcelable {
    public static final C0906a CREATOR = new C0906a();

    /* renamed from: a, reason: collision with root package name */
    public final List f39052a;

    /* renamed from: w5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0906a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            AbstractC3159y.i(parcel, "parcel");
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Q7.e.class.getClassLoader());
            return new C3851a(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i8) {
            return new C3851a[i8];
        }
    }

    public C3851a(List disclosures) {
        AbstractC3159y.i(disclosures, "disclosures");
        this.f39052a = disclosures;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3851a) && AbstractC3159y.d(this.f39052a, ((C3851a) obj).f39052a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f39052a.hashCode();
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("PartnersDisclosureArgs(disclosures=");
        a8.append(this.f39052a);
        a8.append(')');
        return a8.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3159y.i(parcel, "parcel");
        parcel.writeList(new ArrayList());
    }
}
