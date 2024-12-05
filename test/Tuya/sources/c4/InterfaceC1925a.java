package c4;

import L5.p;
import android.os.Parcel;
import android.os.Parcelable;
import b3.EnumC1870e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: c4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC1925a extends Parcelable {

    /* renamed from: b0, reason: collision with root package name */
    public static final C0373a f14980b0 = C0373a.f14981a;

    /* renamed from: c4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0373a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0373a f14981a = new C0373a();

        private C0373a() {
        }

        public final InterfaceC1925a a(boolean z8, List preferredNetworks) {
            AbstractC3159y.i(preferredNetworks, "preferredNetworks");
            if (z8) {
                return new b(preferredNetworks);
            }
            if (!z8) {
                return c.f14983a;
            }
            throw new p();
        }
    }

    /* renamed from: c4.a$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC1925a {
        public static final Parcelable.Creator<b> CREATOR = new C0374a();

        /* renamed from: a, reason: collision with root package name */
        private final List f14982a;

        /* renamed from: c4.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0374a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    arrayList.add(EnumC1870e.valueOf(parcel.readString()));
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
            AbstractC3159y.i(preferredNetworks, "preferredNetworks");
            this.f14982a = preferredNetworks;
        }

        public final List b() {
            return this.f14982a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && AbstractC3159y.d(this.f14982a, ((b) obj).f14982a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f14982a.hashCode();
        }

        public String toString() {
            return "Eligible(preferredNetworks=" + this.f14982a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            List list = this.f14982a;
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                out.writeString(((EnumC1870e) it.next()).name());
            }
        }
    }

    /* renamed from: c4.a$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC1925a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f14983a = new c();
        public static final Parcelable.Creator<c> CREATOR = new C0375a();

        /* renamed from: c4.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0375a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                parcel.readInt();
                return c.f14983a;
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
            AbstractC3159y.i(out, "out");
            out.writeInt(1);
        }
    }
}
