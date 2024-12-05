package j3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: j3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3189a extends Parcelable {

    /* renamed from: j3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0772a implements Parcelable, InterfaceC3189a {
        public static final Parcelable.Creator<C0772a> CREATOR = new C0773a();

        /* renamed from: a, reason: collision with root package name */
        private final String f33925a;

        /* renamed from: j3.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0773a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0772a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new C0772a(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0772a[] newArray(int i8) {
                return new C0772a[i8];
            }
        }

        public C0772a(String str) {
            this.f33925a = str;
        }

        public final String a() {
            return this.f33925a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0772a) && AbstractC3255y.d(this.f33925a, ((C0772a) obj).f33925a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f33925a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "InstantDebits(email=" + this.f33925a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f33925a);
        }
    }

    /* renamed from: j3.a$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable, InterfaceC3189a {
        public static final Parcelable.Creator<b> CREATOR = new C0774a();

        /* renamed from: a, reason: collision with root package name */
        private final String f33926a;

        /* renamed from: b, reason: collision with root package name */
        private final String f33927b;

        /* renamed from: j3.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0774a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(String name, String str) {
            AbstractC3255y.i(name, "name");
            this.f33926a = name;
            this.f33927b = str;
        }

        public final String a() {
            return this.f33927b;
        }

        public final String b() {
            return this.f33926a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (AbstractC3255y.d(this.f33926a, bVar.f33926a) && AbstractC3255y.d(this.f33927b, bVar.f33927b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f33926a.hashCode() * 31;
            String str = this.f33927b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "USBankAccount(name=" + this.f33926a + ", email=" + this.f33927b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f33926a);
            out.writeString(this.f33927b);
        }
    }
}
