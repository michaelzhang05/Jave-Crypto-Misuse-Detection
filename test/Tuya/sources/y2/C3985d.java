package y2;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: y2.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3985d implements InterfaceC3983b {
    public static final Parcelable.Creator<C3985d> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f39749a;

    /* renamed from: b, reason: collision with root package name */
    private final List f39750b;

    /* renamed from: y2.d$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3985d createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(parcel.readValue(C3985d.class.getClassLoader()));
            }
            return new C3985d(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C3985d[] newArray(int i8) {
            return new C3985d[i8];
        }
    }

    public C3985d(String value, List args) {
        AbstractC3159y.i(value, "value");
        AbstractC3159y.i(args, "args");
        this.f39749a = value;
        this.f39750b = args;
    }

    @Override // y2.InterfaceC3983b
    public String R(Context context) {
        AbstractC3159y.i(context, "context");
        String str = this.f39749a;
        Object[] g8 = AbstractC3984c.g(context, this.f39750b);
        Object[] copyOf = Arrays.copyOf(g8, g8.length);
        String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
        AbstractC3159y.h(format, "format(...)");
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
        if (!(obj instanceof C3985d)) {
            return false;
        }
        C3985d c3985d = (C3985d) obj;
        if (AbstractC3159y.d(this.f39749a, c3985d.f39749a) && AbstractC3159y.d(this.f39750b, c3985d.f39750b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f39749a.hashCode() * 31) + this.f39750b.hashCode();
    }

    public String toString() {
        return "StaticResolvableString(value=" + this.f39749a + ", args=" + this.f39750b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f39749a);
        List list = this.f39750b;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeValue(it.next());
        }
    }
}
