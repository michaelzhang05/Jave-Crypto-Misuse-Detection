package n2;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: n2.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3468e extends Parcelable {

    /* renamed from: n2.e$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3468e {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35371a = new a();
        public static final Parcelable.Creator<a> CREATOR = new C0803a();

        /* renamed from: n2.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0803a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                parcel.readInt();
                return a.f35371a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        private a() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 642243785;
        }

        public String toString() {
            return "Observer";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* renamed from: n2.e$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC3468e {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f35372a;

        /* renamed from: n2.e$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new b(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(String id) {
            AbstractC3255y.i(id, "id");
            this.f35372a = id;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && AbstractC3255y.d(this.f35372a, ((b) obj).f35372a)) {
                return true;
            }
            return false;
        }

        public final String getId() {
            return this.f35372a;
        }

        public int hashCode() {
            return this.f35372a.hashCode();
        }

        public String toString() {
            return "Owner(id=" + this.f35372a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f35372a);
        }
    }
}
