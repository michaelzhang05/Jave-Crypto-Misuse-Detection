package e3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import o2.C3514a;

/* renamed from: e3.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2793g implements y2.f {
    public static final Parcelable.Creator<C2793g> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final C3514a f31475a;

    /* renamed from: b, reason: collision with root package name */
    private final List f31476b;

    /* renamed from: e3.g$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2793g createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            C3514a c3514a = (C3514a) parcel.readParcelable(C2793g.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(C2787a.CREATOR.createFromParcel(parcel));
            }
            return new C2793g(c3514a, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2793g[] newArray(int i8) {
            return new C2793g[i8];
        }
    }

    public C2793g(C3514a bin, List accountRanges) {
        AbstractC3255y.i(bin, "bin");
        AbstractC3255y.i(accountRanges, "accountRanges");
        this.f31475a = bin;
        this.f31476b = accountRanges;
    }

    public final List a() {
        return this.f31476b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2793g)) {
            return false;
        }
        C2793g c2793g = (C2793g) obj;
        if (AbstractC3255y.d(this.f31475a, c2793g.f31475a) && AbstractC3255y.d(this.f31476b, c2793g.f31476b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f31475a.hashCode() * 31) + this.f31476b.hashCode();
    }

    public String toString() {
        return "CardMetadata(bin=" + this.f31475a + ", accountRanges=" + this.f31476b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeParcelable(this.f31475a, i8);
        List list = this.f31476b;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C2787a) it.next()).writeToParcel(out, i8);
        }
    }
}
