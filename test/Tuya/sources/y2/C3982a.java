package y2;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import z2.InterfaceC4018b;

/* renamed from: y2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3982a implements InterfaceC3983b {
    public static final Parcelable.Creator<C3982a> CREATOR = new C0914a();

    /* renamed from: a, reason: collision with root package name */
    private final int f39746a;

    /* renamed from: b, reason: collision with root package name */
    private final List f39747b;

    /* renamed from: c, reason: collision with root package name */
    private final List f39748c;

    /* renamed from: y2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0914a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3982a createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i8 = 0; i8 != readInt2; i8++) {
                arrayList.add(parcel.readParcelable(C3982a.class.getClassLoader()));
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            for (int i9 = 0; i9 != readInt3; i9++) {
                arrayList2.add(parcel.readValue(C3982a.class.getClassLoader()));
            }
            return new C3982a(readInt, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C3982a[] newArray(int i8) {
            return new C3982a[i8];
        }
    }

    public C3982a(int i8, List transformations, List args) {
        AbstractC3159y.i(transformations, "transformations");
        AbstractC3159y.i(args, "args");
        this.f39746a = i8;
        this.f39747b = transformations;
        this.f39748c = args;
    }

    @Override // y2.InterfaceC3983b
    public String R(Context context) {
        AbstractC3159y.i(context, "context");
        List list = this.f39747b;
        int i8 = this.f39746a;
        Object[] g8 = AbstractC3984c.g(context, this.f39748c);
        String string = context.getString(i8, Arrays.copyOf(g8, g8.length));
        AbstractC3159y.h(string, "getString(...)");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            string = ((InterfaceC4018b) it.next()).O(string);
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
        if (!(obj instanceof C3982a)) {
            return false;
        }
        C3982a c3982a = (C3982a) obj;
        if (this.f39746a == c3982a.f39746a && AbstractC3159y.d(this.f39747b, c3982a.f39747b) && AbstractC3159y.d(this.f39748c, c3982a.f39748c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f39746a * 31) + this.f39747b.hashCode()) * 31) + this.f39748c.hashCode();
    }

    public String toString() {
        return "IdentifierResolvableString(id=" + this.f39746a + ", transformations=" + this.f39747b + ", args=" + this.f39748c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeInt(this.f39746a);
        List list = this.f39747b;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeParcelable((Parcelable) it.next(), i8);
        }
        List list2 = this.f39748c;
        out.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            out.writeValue(it2.next());
        }
    }
}
