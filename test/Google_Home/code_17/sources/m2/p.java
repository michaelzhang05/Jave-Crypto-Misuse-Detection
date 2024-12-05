package m2;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    private static p f35020d;

    /* renamed from: a, reason: collision with root package name */
    private final c f35022a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f35018b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f35019c = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final p f35021e = new a().b(new c.a().a()).a();

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private c f35023a;

        public final p a() {
            c cVar = this.f35023a;
            if (cVar != null) {
                return new p(cVar, null);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public final a b(c stripe3ds2Config) {
            AbstractC3255y.i(stripe3ds2Config, "stripe3ds2Config");
            this.f35023a = stripe3ds2Config;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final p a() {
            p pVar = p.f35020d;
            if (pVar == null) {
                return p.f35021e;
            }
            return pVar;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final int f35026a;

        /* renamed from: b, reason: collision with root package name */
        private final d f35027b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f35024c = new b(null);

        /* renamed from: d, reason: collision with root package name */
        public static final int f35025d = 8;
        public static final Parcelable.Creator<c> CREATOR = new C0796c();

        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private int f35028a = 5;

            /* renamed from: b, reason: collision with root package name */
            private d f35029b = new d.a().a();

            public final c a() {
                return new c(this.f35028a, this.f35029b);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* renamed from: m2.p$c$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0796c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new c(parcel.readInt(), d.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(int i8, d uiCustomization) {
            AbstractC3255y.i(uiCustomization, "uiCustomization");
            this.f35026a = i8;
            this.f35027b = uiCustomization;
            a(i8);
        }

        private final void a(int i8) {
            if (i8 >= 5 && i8 <= 99) {
            } else {
                throw new IllegalArgumentException("Timeout value must be between 5 and 99, inclusive".toString());
            }
        }

        public final int b() {
            return this.f35026a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f35026a == cVar.f35026a && AbstractC3255y.d(this.f35027b, cVar.f35027b)) {
                return true;
            }
            return false;
        }

        public final d g() {
            return this.f35027b;
        }

        public int hashCode() {
            return (this.f35026a * 31) + this.f35027b.hashCode();
        }

        public String toString() {
            return "Stripe3ds2Config(timeout=" + this.f35026a + ", uiCustomization=" + this.f35027b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeInt(this.f35026a);
            this.f35027b.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        private final W3.m f35030a;

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new d((W3.m) parcel.readParcelable(d.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(W3.m uiCustomization) {
            AbstractC3255y.i(uiCustomization, "uiCustomization");
            this.f35030a = uiCustomization;
        }

        public final W3.m a() {
            return this.f35030a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && AbstractC3255y.d(this.f35030a, ((d) obj).f35030a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f35030a.hashCode();
        }

        public String toString() {
            return "Stripe3ds2UiCustomization(uiCustomization=" + this.f35030a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeParcelable(this.f35030a, i8);
        }

        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: b, reason: collision with root package name */
            public static final C0797a f35031b = new C0797a(null);

            /* renamed from: c, reason: collision with root package name */
            public static final int f35032c = 8;

            /* renamed from: a, reason: collision with root package name */
            private final W3.m f35033a;

            /* renamed from: m2.p$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0797a {
                private C0797a() {
                }

                public /* synthetic */ C0797a(AbstractC3247p abstractC3247p) {
                    this();
                }
            }

            private a(W3.m mVar) {
                this.f35033a = mVar;
            }

            public final d a() {
                return new d(this.f35033a);
            }

            public a() {
                this(new W3.m());
            }
        }
    }

    public /* synthetic */ p(c cVar, AbstractC3247p abstractC3247p) {
        this(cVar);
    }

    public final c c() {
        return this.f35022a;
    }

    private p(c cVar) {
        this.f35022a = cVar;
    }
}
