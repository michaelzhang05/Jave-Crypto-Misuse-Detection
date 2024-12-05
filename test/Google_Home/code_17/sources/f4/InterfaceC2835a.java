package f4;

import O5.p;
import android.os.Parcel;
import android.os.Parcelable;
import e3.EnumC2791e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: f4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC2835a extends Parcelable {

    /* renamed from: l0, reason: collision with root package name */
    public static final C0739a f31955l0 = C0739a.f31956a;

    /* renamed from: f4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0739a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0739a f31956a = new C0739a();

        private C0739a() {
        }

        public final InterfaceC2835a a(boolean z8, List preferredNetworks) {
            AbstractC3255y.i(preferredNetworks, "preferredNetworks");
            if (z8) {
                return new b(preferredNetworks);
            }
            if (!z8) {
                return c.f31958a;
            }
            throw new p();
        }
    }

    /* renamed from: f4.a$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC2835a {
        public static final Parcelable.Creator<b> CREATOR = new C0740a();

        /* renamed from: a, reason: collision with root package name */
        private final List f31957a;

        /* renamed from: f4.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0740a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    arrayList.add(EnumC2791e.valueOf(parcel.readString()));
                }
                return new b(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(List preferredNetworks) {
            AbstractC3255y.i(preferredNetworks, "preferredNetworks");
            this.f31957a = preferredNetworks;
        }

        public final List a() {
            return this.f31957a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && AbstractC3255y.d(this.f31957a, ((b) obj).f31957a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f31957a.hashCode();
        }

        public String toString() {
            return "Eligible(preferredNetworks=" + this.f31957a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            List list = this.f31957a;
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                out.writeString(((EnumC2791e) it.next()).name());
            }
        }
    }

    /* renamed from: f4.a$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC2835a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f31958a = new c();
        public static final Parcelable.Creator<c> CREATOR = new C0741a();

        /* renamed from: f4.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0741a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                parcel.readInt();
                return c.f31958a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        private c() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeInt(1);
        }
    }
}
