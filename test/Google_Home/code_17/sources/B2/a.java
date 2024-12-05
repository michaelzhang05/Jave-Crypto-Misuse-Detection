package B2;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class a implements b {
    public static final Parcelable.Creator<a> CREATOR = new C0007a();

    /* renamed from: a, reason: collision with root package name */
    private final int f790a;

    /* renamed from: b, reason: collision with root package name */
    private final List f791b;

    /* renamed from: c, reason: collision with root package name */
    private final List f792c;

    /* renamed from: B2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0007a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i8 = 0; i8 != readInt2; i8++) {
                arrayList.add(parcel.readParcelable(a.class.getClassLoader()));
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            for (int i9 = 0; i9 != readInt3; i9++) {
                arrayList2.add(parcel.readValue(a.class.getClassLoader()));
            }
            return new a(readInt, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i8) {
            return new a[i8];
        }
    }

    public a(int i8, List transformations, List args) {
        AbstractC3255y.i(transformations, "transformations");
        AbstractC3255y.i(args, "args");
        this.f790a = i8;
        this.f791b = transformations;
        this.f792c = args;
    }

    @Override // B2.b
    public String R(Context context) {
        AbstractC3255y.i(context, "context");
        List list = this.f791b;
        int i8 = this.f790a;
        Object[] g8 = c.g(context, this.f792c);
        String string = context.getString(i8, Arrays.copyOf(g8, g8.length));
        AbstractC3255y.h(string, "getString(...)");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            string = ((C2.b) it.next()).P(string);
        }
        return string;
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
        if (this.f790a == aVar.f790a && AbstractC3255y.d(this.f791b, aVar.f791b) && AbstractC3255y.d(this.f792c, aVar.f792c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f790a * 31) + this.f791b.hashCode()) * 31) + this.f792c.hashCode();
    }

    public String toString() {
        return "IdentifierResolvableString(id=" + this.f790a + ", transformations=" + this.f791b + ", args=" + this.f792c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeInt(this.f790a);
        List list = this.f791b;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeParcelable((Parcelable) it.next(), i8);
        }
        List list2 = this.f792c;
        out.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            out.writeValue(it2.next());
        }
    }
}
