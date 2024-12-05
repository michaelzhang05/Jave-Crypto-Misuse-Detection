package S2;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class b implements Parcelable {

    /* loaded from: classes4.dex */
    public static final class a extends b {
        public static final Parcelable.Creator<a> CREATOR = new C0184a();

        /* renamed from: a, reason: collision with root package name */
        private final int f8978a;

        /* renamed from: S2.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0184a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
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
            this.f8978a = i8;
        }

        @Override // S2.b
        public String b(Resources resources) {
            AbstractC3159y.i(resources, "resources");
            String string = resources.getString(this.f8978a);
            AbstractC3159y.h(string, "getString(...)");
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
            if ((obj instanceof a) && this.f8978a == ((a) obj).f8978a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f8978a;
        }

        public String toString() {
            return "FromResources(stringResId=" + this.f8978a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeInt(this.f8978a);
        }
    }

    /* renamed from: S2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0185b extends b {
        public static final Parcelable.Creator<C0185b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f8979a;

        /* renamed from: S2.b$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0185b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new C0185b(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0185b[] newArray(int i8) {
                return new C0185b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0185b(String errorMessage) {
            super(null);
            AbstractC3159y.i(errorMessage, "errorMessage");
            this.f8979a = errorMessage;
        }

        @Override // S2.b
        public String b(Resources resources) {
            AbstractC3159y.i(resources, "resources");
            return this.f8979a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0185b) && AbstractC3159y.d(this.f8979a, ((C0185b) obj).f8979a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f8979a.hashCode();
        }

        public String toString() {
            return "Raw(errorMessage=" + this.f8979a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f8979a);
        }
    }

    private b() {
    }

    public abstract String b(Resources resources);

    public /* synthetic */ b(AbstractC3151p abstractC3151p) {
        this();
    }
}
