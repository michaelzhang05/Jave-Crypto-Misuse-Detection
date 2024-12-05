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
public final class d implements b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f793a;

    /* renamed from: b, reason: collision with root package name */
    private final List f794b;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(parcel.readValue(d.class.getClassLoader()));
            }
            return new d(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final d[] newArray(int i8) {
            return new d[i8];
        }
    }

    public d(String value, List args) {
        AbstractC3255y.i(value, "value");
        AbstractC3255y.i(args, "args");
        this.f793a = value;
        this.f794b = args;
    }

    @Override // B2.b
    public String R(Context context) {
        AbstractC3255y.i(context, "context");
        String str = this.f793a;
        Object[] g8 = c.g(context, this.f794b);
        Object[] copyOf = Arrays.copyOf(g8, g8.length);
        String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
        AbstractC3255y.h(format, "format(...)");
        return format;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3255y.d(this.f793a, dVar.f793a) && AbstractC3255y.d(this.f794b, dVar.f794b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f793a.hashCode() * 31) + this.f794b.hashCode();
    }

    public String toString() {
        return "StaticResolvableString(value=" + this.f793a + ", args=" + this.f794b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f793a);
        List list = this.f794b;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeValue(it.next());
        }
    }
}
