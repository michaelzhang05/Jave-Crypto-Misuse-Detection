package p3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: p3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3601c implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public static final b f37022a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f37023b = 0;

    /* renamed from: p3.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3601c {

        /* renamed from: c, reason: collision with root package name */
        public static final a f37024c = new a();
        public static final Parcelable.Creator<a> CREATOR = new C0845a();

        /* renamed from: p3.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0845a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                parcel.readInt();
                return a.f37024c;
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
            AbstractC3159y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* renamed from: p3.c$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: p3.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0846c extends AbstractC3601c {

        /* renamed from: c, reason: collision with root package name */
        public static final C0846c f37025c = new C0846c();
        public static final Parcelable.Creator<C0846c> CREATOR = new a();

        /* renamed from: p3.c$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0846c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                parcel.readInt();
                return C0846c.f37025c;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0846c[] newArray(int i8) {
                return new C0846c[i8];
            }
        }

        private C0846c() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof C0846c)) {
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
            AbstractC3159y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* renamed from: p3.c$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3601c {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        private final Throwable f37026c;

        /* renamed from: p3.c$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
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
            AbstractC3159y.i(throwable, "throwable");
            this.f37026c = throwable;
        }

        public final Throwable b() {
            return this.f37026c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeSerializable(this.f37026c);
        }
    }

    private AbstractC3601c() {
    }

    public /* synthetic */ AbstractC3601c(AbstractC3151p abstractC3151p) {
        this();
    }
}
