package s3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: s3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3995c implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public static final b f39221a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f39222b = 0;

    /* renamed from: s3.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3995c {

        /* renamed from: c, reason: collision with root package name */
        public static final a f39223c = new a();
        public static final Parcelable.Creator<a> CREATOR = new C0876a();

        /* renamed from: s3.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0876a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                parcel.readInt();
                return a.f39223c;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        private a() {
            super(null);
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
            return -953289798;
        }

        public String toString() {
            return "Canceled";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* renamed from: s3.c$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: s3.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0877c extends AbstractC3995c {

        /* renamed from: c, reason: collision with root package name */
        public static final C0877c f39224c = new C0877c();
        public static final Parcelable.Creator<C0877c> CREATOR = new a();

        /* renamed from: s3.c$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0877c createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                parcel.readInt();
                return C0877c.f39224c;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0877c[] newArray(int i8) {
                return new C0877c[i8];
            }
        }

        private C0877c() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof C0877c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1366725814;
        }

        public String toString() {
            return "Completed";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* renamed from: s3.c$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3995c {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        private final Throwable f39225c;

        /* renamed from: s3.c$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new d((Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Throwable throwable) {
            super(null);
            AbstractC3255y.i(throwable, "throwable");
            this.f39225c = throwable;
        }

        public final Throwable a() {
            return this.f39225c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeSerializable(this.f39225c);
        }
    }

    private AbstractC3995c() {
    }

    public /* synthetic */ AbstractC3995c(AbstractC3247p abstractC3247p) {
        this();
    }
}
