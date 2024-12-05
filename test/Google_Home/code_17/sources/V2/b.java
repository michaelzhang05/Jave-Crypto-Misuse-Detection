package V2;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class b implements Parcelable {

    /* loaded from: classes4.dex */
    public static final class a extends b {
        public static final Parcelable.Creator<a> CREATOR = new C0209a();

        /* renamed from: a, reason: collision with root package name */
        private final int f10621a;

        /* renamed from: V2.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0209a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new a(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(int i8) {
            super(null);
            this.f10621a = i8;
        }

        @Override // V2.b
        public String a(Resources resources) {
            AbstractC3255y.i(resources, "resources");
            String string = resources.getString(this.f10621a);
            AbstractC3255y.h(string, "getString(...)");
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
            if ((obj instanceof a) && this.f10621a == ((a) obj).f10621a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f10621a;
        }

        public String toString() {
            return "FromResources(stringResId=" + this.f10621a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeInt(this.f10621a);
        }
    }

    /* renamed from: V2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0210b extends b {
        public static final Parcelable.Creator<C0210b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f10622a;

        /* renamed from: V2.b$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0210b createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new C0210b(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0210b[] newArray(int i8) {
                return new C0210b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0210b(String errorMessage) {
            super(null);
            AbstractC3255y.i(errorMessage, "errorMessage");
            this.f10622a = errorMessage;
        }

        @Override // V2.b
        public String a(Resources resources) {
            AbstractC3255y.i(resources, "resources");
            return this.f10622a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0210b) && AbstractC3255y.d(this.f10622a, ((C0210b) obj).f10622a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f10622a.hashCode();
        }

        public String toString() {
            return "Raw(errorMessage=" + this.f10622a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f10622a);
        }
    }

    private b() {
    }

    public abstract String a(Resources resources);

    public /* synthetic */ b(AbstractC3247p abstractC3247p) {
        this();
    }
}
