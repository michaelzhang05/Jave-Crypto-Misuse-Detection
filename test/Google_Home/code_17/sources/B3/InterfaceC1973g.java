package b3;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.o;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: b3.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC1973g extends Parcelable {

    /* renamed from: b3.g$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC1973g {
        public static final Parcelable.Creator<a> CREATOR = new C0358a();

        /* renamed from: a, reason: collision with root package name */
        private final o.b f15340a;

        /* renamed from: b3.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0358a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new a((o.b) parcel.readParcelable(a.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(o.b bVar) {
            this.f15340a = bVar;
        }

        public final o.b a() {
            return this.f15340a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f15340a == ((a) obj).f15340a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            o.b bVar = this.f15340a;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public String toString() {
            return "Disabled(overrideAllowRedisplay=" + this.f15340a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeParcelable(this.f15340a, i8);
        }
    }

    /* renamed from: b3.g$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC1973g {

        /* renamed from: a, reason: collision with root package name */
        public static final b f15341a = new b();
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: b3.g$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                parcel.readInt();
                return b.f15341a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        private b() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1481436890;
        }

        public String toString() {
            return "Enabled";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* renamed from: b3.g$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC1973g {

        /* renamed from: a, reason: collision with root package name */
        public static final c f15342a = new c();
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: b3.g$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                parcel.readInt();
                return c.f15342a;
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

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 144481604;
        }

        public String toString() {
            return "Legacy";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeInt(1);
        }
    }
}
