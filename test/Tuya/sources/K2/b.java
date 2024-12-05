package K2;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.o;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class b implements Parcelable {

    /* renamed from: K2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0112b extends b {

        /* renamed from: a, reason: collision with root package name */
        private final o f5888a;

        /* renamed from: b, reason: collision with root package name */
        public static final int f5887b = o.f24407u;
        public static final Parcelable.Creator<C0112b> CREATOR = new a();

        /* renamed from: K2.b$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0112b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new C0112b((o) parcel.readParcelable(C0112b.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0112b[] newArray(int i8) {
                return new C0112b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0112b(o paymentMethod) {
            super(null);
            AbstractC3159y.i(paymentMethod, "paymentMethod");
            this.f5888a = paymentMethod;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0112b) && AbstractC3159y.d(this.f5888a, ((C0112b) obj).f5888a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f5888a.hashCode();
        }

        public String toString() {
            return "Completed(paymentMethod=" + this.f5888a + ")";
        }

        public final o v() {
            return this.f5888a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f5888a, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends b {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f5889a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
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
            AbstractC3159y.i(error, "error");
            this.f5889a = error;
        }

        public final Throwable b() {
            return this.f5889a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3159y.d(this.f5889a, ((c) obj).f5889a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f5889a.hashCode();
        }

        public String toString() {
            return "Failed(error=" + this.f5889a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeSerializable(this.f5889a);
        }
    }

    public /* synthetic */ b(AbstractC3151p abstractC3151p) {
        this();
    }

    /* loaded from: classes4.dex */
    public static final class a extends b {
        public static final Parcelable.Creator<a> CREATOR = new C0110a();

        /* renamed from: a, reason: collision with root package name */
        private final EnumC0111b f5882a;

        /* renamed from: K2.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0110a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a(EnumC0111b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: K2.b$a$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class EnumC0111b {

            /* renamed from: a, reason: collision with root package name */
            public static final EnumC0111b f5883a = new EnumC0111b("BackPressed", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final EnumC0111b f5884b = new EnumC0111b("LoggedOut", 1);

            /* renamed from: c, reason: collision with root package name */
            private static final /* synthetic */ EnumC0111b[] f5885c;

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ R5.a f5886d;

            static {
                EnumC0111b[] a8 = a();
                f5885c = a8;
                f5886d = R5.b.a(a8);
            }

            private EnumC0111b(String str, int i8) {
            }

            private static final /* synthetic */ EnumC0111b[] a() {
                return new EnumC0111b[]{f5883a, f5884b};
            }

            public static EnumC0111b valueOf(String str) {
                return (EnumC0111b) Enum.valueOf(EnumC0111b.class, str);
            }

            public static EnumC0111b[] values() {
                return (EnumC0111b[]) f5885c.clone();
            }
        }

        public /* synthetic */ a(EnumC0111b enumC0111b, int i8, AbstractC3151p abstractC3151p) {
            this((i8 & 1) != 0 ? EnumC0111b.f5883a : enumC0111b);
        }

        public final EnumC0111b b() {
            return this.f5882a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f5882a == ((a) obj).f5882a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f5882a.hashCode();
        }

        public String toString() {
            return "Canceled(reason=" + this.f5882a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f5882a.name());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumC0111b reason) {
            super(null);
            AbstractC3159y.i(reason, "reason");
            this.f5882a = reason;
        }
    }

    private b() {
    }
}
