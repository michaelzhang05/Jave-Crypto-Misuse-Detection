package k2;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: k2.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3113e extends Parcelable {

    /* renamed from: k2.e$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3113e {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33379a = new a();
        public static final Parcelable.Creator<a> CREATOR = new C0773a();

        /* renamed from: k2.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0773a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                parcel.readInt();
                return a.f33379a;
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
            AbstractC3159y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* renamed from: k2.e$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC3113e {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f33380a;

        /* renamed from: k2.e$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new b(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(String id) {
            AbstractC3159y.i(id, "id");
            this.f33380a = id;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && AbstractC3159y.d(this.f33380a, ((b) obj).f33380a)) {
                return true;
            }
            return false;
        }

        public final String getId() {
            return this.f33380a;
        }

        public int hashCode() {
            return this.f33380a.hashCode();
        }

        public String toString() {
            return "Owner(id=" + this.f33380a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f33380a);
        }
    }
}
