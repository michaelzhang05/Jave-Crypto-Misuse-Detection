package E3;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.financialconnections.model.BankAccount;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class f implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final B2.b f2479a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f2480b;

    /* loaded from: classes4.dex */
    public static final class a extends f {
        public static final Parcelable.Creator<a> CREATOR = new C0036a();

        /* renamed from: c, reason: collision with root package name */
        private final B2.b f2481c;

        /* renamed from: d, reason: collision with root package name */
        private final B2.b f2482d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f2483e;

        /* renamed from: E3.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0036a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                boolean z8;
                AbstractC3255y.i(parcel, "parcel");
                B2.b bVar = (B2.b) parcel.readParcelable(a.class.getClassLoader());
                B2.b bVar2 = (B2.b) parcel.readParcelable(a.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                return new a(bVar, bVar2, z8);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public /* synthetic */ a(B2.b bVar, B2.b bVar2, boolean z8, int i8, AbstractC3247p abstractC3247p) {
            this((i8 & 1) != 0 ? null : bVar, bVar2, z8);
        }

        public static /* synthetic */ a l(a aVar, B2.b bVar, B2.b bVar2, boolean z8, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                bVar = aVar.f2481c;
            }
            if ((i8 & 2) != 0) {
                bVar2 = aVar.f2482d;
            }
            if ((i8 & 4) != 0) {
                z8 = aVar.f2483e;
            }
            return aVar.i(bVar, bVar2, z8);
        }

        @Override // E3.f
        public B2.b a() {
            return this.f2481c;
        }

        @Override // E3.f
        public B2.b b() {
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3255y.d(this.f2481c, aVar.f2481c) && AbstractC3255y.d(this.f2482d, aVar.f2482d) && this.f2483e == aVar.f2483e) {
                return true;
            }
            return false;
        }

        @Override // E3.f
        public B2.b g() {
            return this.f2482d;
        }

        @Override // E3.f
        public boolean h() {
            return this.f2483e;
        }

        public int hashCode() {
            int hashCode;
            B2.b bVar = this.f2481c;
            if (bVar == null) {
                hashCode = 0;
            } else {
                hashCode = bVar.hashCode();
            }
            return (((hashCode * 31) + this.f2482d.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f2483e);
        }

        public final a i(B2.b bVar, B2.b primaryButtonText, boolean z8) {
            AbstractC3255y.i(primaryButtonText, "primaryButtonText");
            return new a(bVar, primaryButtonText, z8);
        }

        public String toString() {
            return "BillingDetailsCollection(error=" + this.f2481c + ", primaryButtonText=" + this.f2482d + ", isProcessing=" + this.f2483e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeParcelable(this.f2481c, i8);
            out.writeParcelable(this.f2482d, i8);
            out.writeInt(this.f2483e ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(B2.b bVar, B2.b primaryButtonText, boolean z8) {
            super(null, false, 3, 0 == true ? 1 : 0);
            AbstractC3255y.i(primaryButtonText, "primaryButtonText");
            this.f2481c = bVar;
            this.f2482d = primaryButtonText;
            this.f2483e = z8;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends f {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        private final c f2484c;

        /* renamed from: d, reason: collision with root package name */
        private final String f2485d;

        /* renamed from: e, reason: collision with root package name */
        private final String f2486e;

        /* renamed from: f, reason: collision with root package name */
        private final String f2487f;

        /* renamed from: g, reason: collision with root package name */
        private final B2.b f2488g;

        /* renamed from: h, reason: collision with root package name */
        private final B2.b f2489h;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new b((c) parcel.readParcelable(b.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), (B2.b) parcel.readParcelable(b.class.getClassLoader()), (B2.b) parcel.readParcelable(b.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(c resultIdentifier, String str, String str2, String str3, B2.b primaryButtonText, B2.b bVar) {
            super(null, false, 3, 0 == true ? 1 : 0);
            AbstractC3255y.i(resultIdentifier, "resultIdentifier");
            AbstractC3255y.i(primaryButtonText, "primaryButtonText");
            this.f2484c = resultIdentifier;
            this.f2485d = str;
            this.f2486e = str2;
            this.f2487f = str3;
            this.f2488g = primaryButtonText;
            this.f2489h = bVar;
        }

        @Override // E3.f
        public B2.b b() {
            return this.f2489h;
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
            if (AbstractC3255y.d(this.f2484c, bVar.f2484c) && AbstractC3255y.d(this.f2485d, bVar.f2485d) && AbstractC3255y.d(this.f2486e, bVar.f2486e) && AbstractC3255y.d(this.f2487f, bVar.f2487f) && AbstractC3255y.d(this.f2488g, bVar.f2488g) && AbstractC3255y.d(this.f2489h, bVar.f2489h)) {
                return true;
            }
            return false;
        }

        @Override // E3.f
        public B2.b g() {
            return this.f2488g;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4 = this.f2484c.hashCode() * 31;
            String str = this.f2485d;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = (hashCode4 + hashCode) * 31;
            String str2 = this.f2486e;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str3 = this.f2487f;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int hashCode5 = (((i10 + hashCode3) * 31) + this.f2488g.hashCode()) * 31;
            B2.b bVar = this.f2489h;
            if (bVar != null) {
                i8 = bVar.hashCode();
            }
            return hashCode5 + i8;
        }

        public final String i() {
            return this.f2485d;
        }

        public final String l() {
            return this.f2486e;
        }

        public final c p() {
            return this.f2484c;
        }

        public String toString() {
            return "MandateCollection(resultIdentifier=" + this.f2484c + ", bankName=" + this.f2485d + ", last4=" + this.f2486e + ", intentId=" + this.f2487f + ", primaryButtonText=" + this.f2488g + ", mandateText=" + this.f2489h + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeParcelable(this.f2484c, i8);
            out.writeString(this.f2485d);
            out.writeString(this.f2486e);
            out.writeString(this.f2487f);
            out.writeParcelable(this.f2488g, i8);
            out.writeParcelable(this.f2489h, i8);
        }
    }

    /* loaded from: classes4.dex */
    public interface c extends Parcelable {

        /* loaded from: classes4.dex */
        public static final class a implements c {
            public static final Parcelable.Creator<a> CREATOR = new C0037a();

            /* renamed from: a, reason: collision with root package name */
            private final String f2490a;

            /* renamed from: E3.f$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0037a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new a(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public a(String id) {
                AbstractC3255y.i(id, "id");
                this.f2490a = id;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof a) && AbstractC3255y.d(this.f2490a, ((a) obj).f2490a)) {
                    return true;
                }
                return false;
            }

            public final String getId() {
                return this.f2490a;
            }

            public int hashCode() {
                return this.f2490a.hashCode();
            }

            public String toString() {
                return "PaymentMethod(id=" + this.f2490a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeString(this.f2490a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements c {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final String f2491a;

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
                this.f2491a = id;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof b) && AbstractC3255y.d(this.f2491a, ((b) obj).f2491a)) {
                    return true;
                }
                return false;
            }

            public final String getId() {
                return this.f2491a;
            }

            public int hashCode() {
                return this.f2491a.hashCode();
            }

            public String toString() {
                return "Session(id=" + this.f2491a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeString(this.f2491a);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends f {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        private final String f2492c;

        /* renamed from: d, reason: collision with root package name */
        private final String f2493d;

        /* renamed from: e, reason: collision with root package name */
        private final String f2494e;

        /* renamed from: f, reason: collision with root package name */
        private final String f2495f;

        /* renamed from: g, reason: collision with root package name */
        private final B2.b f2496g;

        /* renamed from: h, reason: collision with root package name */
        private final B2.b f2497h;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new d(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (B2.b) parcel.readParcelable(d.class.getClassLoader()), (B2.b) parcel.readParcelable(d.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, String str2, String bankName, String str3, B2.b primaryButtonText, B2.b bVar) {
            super(null, false, 3, 0 == true ? 1 : 0);
            AbstractC3255y.i(bankName, "bankName");
            AbstractC3255y.i(primaryButtonText, "primaryButtonText");
            this.f2492c = str;
            this.f2493d = str2;
            this.f2494e = bankName;
            this.f2495f = str3;
            this.f2496g = primaryButtonText;
            this.f2497h = bVar;
        }

        @Override // E3.f
        public B2.b b() {
            return this.f2497h;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (AbstractC3255y.d(this.f2492c, dVar.f2492c) && AbstractC3255y.d(this.f2493d, dVar.f2493d) && AbstractC3255y.d(this.f2494e, dVar.f2494e) && AbstractC3255y.d(this.f2495f, dVar.f2495f) && AbstractC3255y.d(this.f2496g, dVar.f2496g) && AbstractC3255y.d(this.f2497h, dVar.f2497h)) {
                return true;
            }
            return false;
        }

        @Override // E3.f
        public B2.b g() {
            return this.f2496g;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            String str = this.f2492c;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = hashCode * 31;
            String str2 = this.f2493d;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode4 = (((i9 + hashCode2) * 31) + this.f2494e.hashCode()) * 31;
            String str3 = this.f2495f;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int hashCode5 = (((hashCode4 + hashCode3) * 31) + this.f2496g.hashCode()) * 31;
            B2.b bVar = this.f2497h;
            if (bVar != null) {
                i8 = bVar.hashCode();
            }
            return hashCode5 + i8;
        }

        public final String i() {
            return this.f2494e;
        }

        public final String l() {
            return this.f2492c;
        }

        public final String p() {
            return this.f2495f;
        }

        public String toString() {
            return "SavedAccount(financialConnectionsSessionId=" + this.f2492c + ", intentId=" + this.f2493d + ", bankName=" + this.f2494e + ", last4=" + this.f2495f + ", primaryButtonText=" + this.f2496g + ", mandateText=" + this.f2497h + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f2492c);
            out.writeString(this.f2493d);
            out.writeString(this.f2494e);
            out.writeString(this.f2495f);
            out.writeParcelable(this.f2496g, i8);
            out.writeParcelable(this.f2497h, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends f {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        private final BankAccount f2498c;

        /* renamed from: d, reason: collision with root package name */
        private final String f2499d;

        /* renamed from: e, reason: collision with root package name */
        private final String f2500e;

        /* renamed from: f, reason: collision with root package name */
        private final B2.b f2501f;

        /* renamed from: g, reason: collision with root package name */
        private final B2.b f2502g;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new e(parcel.readParcelable(e.class.getClassLoader()), parcel.readString(), parcel.readString(), (B2.b) parcel.readParcelable(e.class.getClassLoader()), (B2.b) parcel.readParcelable(e.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(BankAccount paymentAccount, String financialConnectionsSessionId, String str, B2.b primaryButtonText, B2.b bVar) {
            super(null, false, 3, 0 == true ? 1 : 0);
            AbstractC3255y.i(paymentAccount, "paymentAccount");
            AbstractC3255y.i(financialConnectionsSessionId, "financialConnectionsSessionId");
            AbstractC3255y.i(primaryButtonText, "primaryButtonText");
            this.f2498c = paymentAccount;
            this.f2499d = financialConnectionsSessionId;
            this.f2500e = str;
            this.f2501f = primaryButtonText;
            this.f2502g = bVar;
        }

        @Override // E3.f
        public B2.b b() {
            return this.f2502g;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (AbstractC3255y.d(this.f2498c, eVar.f2498c) && AbstractC3255y.d(this.f2499d, eVar.f2499d) && AbstractC3255y.d(this.f2500e, eVar.f2500e) && AbstractC3255y.d(this.f2501f, eVar.f2501f) && AbstractC3255y.d(this.f2502g, eVar.f2502g)) {
                return true;
            }
            return false;
        }

        @Override // E3.f
        public B2.b g() {
            return this.f2501f;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((this.f2498c.hashCode() * 31) + this.f2499d.hashCode()) * 31;
            String str = this.f2500e;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode3 = (((hashCode2 + hashCode) * 31) + this.f2501f.hashCode()) * 31;
            B2.b bVar = this.f2502g;
            if (bVar != null) {
                i8 = bVar.hashCode();
            }
            return hashCode3 + i8;
        }

        public final String i() {
            return this.f2499d;
        }

        public final BankAccount l() {
            return this.f2498c;
        }

        public String toString() {
            return "VerifyWithMicrodeposits(paymentAccount=" + this.f2498c + ", financialConnectionsSessionId=" + this.f2499d + ", intentId=" + this.f2500e + ", primaryButtonText=" + this.f2501f + ", mandateText=" + this.f2502g + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeParcelable((Parcelable) this.f2498c, i8);
            out.writeString(this.f2499d);
            out.writeString(this.f2500e);
            out.writeParcelable(this.f2501f, i8);
            out.writeParcelable(this.f2502g, i8);
        }
    }

    public /* synthetic */ f(B2.b bVar, boolean z8, AbstractC3247p abstractC3247p) {
        this(bVar, z8);
    }

    public B2.b a() {
        return this.f2479a;
    }

    public abstract B2.b b();

    public abstract B2.b g();

    public boolean h() {
        return this.f2480b;
    }

    private f(B2.b bVar, boolean z8) {
        this.f2479a = bVar;
        this.f2480b = z8;
    }

    public /* synthetic */ f(B2.b bVar, boolean z8, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? null : bVar, (i8 & 2) != 0 ? false : z8, null);
    }
}
