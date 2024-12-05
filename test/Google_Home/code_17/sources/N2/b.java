package N2;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.o;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class b implements Parcelable {

    /* renamed from: N2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0137b extends b {

        /* renamed from: a, reason: collision with root package name */
        private final o f7667a;

        /* renamed from: b, reason: collision with root package name */
        public static final int f7666b = o.f25462u;
        public static final Parcelable.Creator<C0137b> CREATOR = new a();

        /* renamed from: N2.b$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0137b createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new C0137b((o) parcel.readParcelable(C0137b.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0137b[] newArray(int i8) {
                return new C0137b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0137b(o paymentMethod) {
            super(null);
            AbstractC3255y.i(paymentMethod, "paymentMethod");
            this.f7667a = paymentMethod;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0137b) && AbstractC3255y.d(this.f7667a, ((C0137b) obj).f7667a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f7667a.hashCode();
        }

        public final o r() {
            return this.f7667a;
        }

        public String toString() {
            return "Completed(paymentMethod=" + this.f7667a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeParcelable(this.f7667a, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends b {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f7668a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new c((Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Throwable error) {
            super(null);
            AbstractC3255y.i(error, "error");
            this.f7668a = error;
        }

        public final Throwable a() {
            return this.f7668a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3255y.d(this.f7668a, ((c) obj).f7668a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f7668a.hashCode();
        }

        public String toString() {
            return "Failed(error=" + this.f7668a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeSerializable(this.f7668a);
        }
    }

    public /* synthetic */ b(AbstractC3247p abstractC3247p) {
        this();
    }

    /* loaded from: classes4.dex */
    public static final class a extends b {
        public static final Parcelable.Creator<a> CREATOR = new C0135a();

        /* renamed from: a, reason: collision with root package name */
        private final EnumC0136b f7661a;

        /* renamed from: N2.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0135a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new a(EnumC0136b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: N2.b$a$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class EnumC0136b {

            /* renamed from: a, reason: collision with root package name */
            public static final EnumC0136b f7662a = new EnumC0136b("BackPressed", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final EnumC0136b f7663b = new EnumC0136b("LoggedOut", 1);

            /* renamed from: c, reason: collision with root package name */
            private static final /* synthetic */ EnumC0136b[] f7664c;

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ U5.a f7665d;

            static {
                EnumC0136b[] a8 = a();
                f7664c = a8;
                f7665d = U5.b.a(a8);
            }

            private EnumC0136b(String str, int i8) {
            }

            private static final /* synthetic */ EnumC0136b[] a() {
                return new EnumC0136b[]{f7662a, f7663b};
            }

            public static EnumC0136b valueOf(String str) {
                return (EnumC0136b) Enum.valueOf(EnumC0136b.class, str);
            }

            public static EnumC0136b[] values() {
                return (EnumC0136b[]) f7664c.clone();
            }
        }

        public /* synthetic */ a(EnumC0136b enumC0136b, int i8, AbstractC3247p abstractC3247p) {
            this((i8 & 1) != 0 ? EnumC0136b.f7662a : enumC0136b);
        }

        public final EnumC0136b a() {
            return this.f7661a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f7661a == ((a) obj).f7661a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f7661a.hashCode();
        }

        public String toString() {
            return "Canceled(reason=" + this.f7661a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f7661a.name());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumC0136b reason) {
            super(null);
            AbstractC3255y.i(reason, "reason");
            this.f7661a = reason;
        }
    }

    private b() {
    }
}
