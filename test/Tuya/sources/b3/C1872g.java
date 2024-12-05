package b3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import l2.C3166a;

/* renamed from: b3.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1872g implements v2.f {
    public static final Parcelable.Creator<C1872g> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final C3166a f14469a;

    /* renamed from: b, reason: collision with root package name */
    private final List f14470b;

    /* renamed from: b3.g$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1872g createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            C3166a c3166a = (C3166a) parcel.readParcelable(C1872g.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(C1866a.CREATOR.createFromParcel(parcel));
            }
            return new C1872g(c3166a, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1872g[] newArray(int i8) {
            return new C1872g[i8];
        }
    }

    public C1872g(C3166a bin, List accountRanges) {
        AbstractC3159y.i(bin, "bin");
        AbstractC3159y.i(accountRanges, "accountRanges");
        this.f14469a = bin;
        this.f14470b = accountRanges;
    }

    public final List b() {
        return this.f14470b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1872g)) {
            return false;
        }
        C1872g c1872g = (C1872g) obj;
        if (AbstractC3159y.d(this.f14469a, c1872g.f14469a) && AbstractC3159y.d(this.f14470b, c1872g.f14470b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f14469a.hashCode() * 31) + this.f14470b.hashCode();
    }

    public String toString() {
        return "CardMetadata(bin=" + this.f14469a + ", accountRanges=" + this.f14470b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeParcelable(this.f14469a, i8);
        List list = this.f14470b;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C1866a) it.next()).writeToParcel(out, i8);
        }
    }
}
