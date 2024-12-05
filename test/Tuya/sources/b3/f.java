package B3;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.financialconnections.model.BankAccount;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public abstract class f implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3983b f884a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f885b;

    /* loaded from: classes4.dex */
    public static final class a extends f {
        public static final Parcelable.Creator<a> CREATOR = new C0011a();

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC3983b f886c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC3983b f887d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f888e;

        /* renamed from: B3.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0011a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                boolean z8;
                AbstractC3159y.i(parcel, "parcel");
                InterfaceC3983b interfaceC3983b = (InterfaceC3983b) parcel.readParcelable(a.class.getClassLoader());
                InterfaceC3983b interfaceC3983b2 = (InterfaceC3983b) parcel.readParcelable(a.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                return new a(interfaceC3983b, interfaceC3983b2, z8);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public /* synthetic */ a(InterfaceC3983b interfaceC3983b, InterfaceC3983b interfaceC3983b2, boolean z8, int i8, AbstractC3151p abstractC3151p) {
            this((i8 & 1) != 0 ? null : interfaceC3983b, interfaceC3983b2, z8);
        }

        public static /* synthetic */ a j(a aVar, InterfaceC3983b interfaceC3983b, InterfaceC3983b interfaceC3983b2, boolean z8, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                interfaceC3983b = aVar.f886c;
            }
            if ((i8 & 2) != 0) {
                interfaceC3983b2 = aVar.f887d;
            }
            if ((i8 & 4) != 0) {
                z8 = aVar.f888e;
            }
            return aVar.i(interfaceC3983b, interfaceC3983b2, z8);
        }

        @Override // B3.f
        public InterfaceC3983b b() {
            return this.f886c;
        }

        @Override // B3.f
        public InterfaceC3983b c() {
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // B3.f
        public InterfaceC3983b e() {
            return this.f887d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3159y.d(this.f886c, aVar.f886c) && AbstractC3159y.d(this.f887d, aVar.f887d) && this.f888e == aVar.f888e) {
                return true;
            }
            return false;
        }

        @Override // B3.f
        public boolean f() {
            return this.f888e;
        }

        public int hashCode() {
            int hashCode;
            InterfaceC3983b interfaceC3983b = this.f886c;
            if (interfaceC3983b == null) {
                hashCode = 0;
            } else {
                hashCode = interfaceC3983b.hashCode();
            }
            return (((hashCode * 31) + this.f887d.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f888e);
        }

        public final a i(InterfaceC3983b interfaceC3983b, InterfaceC3983b primaryButtonText, boolean z8) {
            AbstractC3159y.i(primaryButtonText, "primaryButtonText");
            return new a(interfaceC3983b, primaryButtonText, z8);
        }

        public String toString() {
            return "BillingDetailsCollection(error=" + this.f886c + ", primaryButtonText=" + this.f887d + ", isProcessing=" + this.f888e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f886c, i8);
            out.writeParcelable(this.f887d, i8);
            out.writeInt(this.f888e ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC3983b interfaceC3983b, InterfaceC3983b primaryButtonText, boolean z8) {
            super(null, false, 3, 0 == true ? 1 : 0);
            AbstractC3159y.i(primaryButtonText, "primaryButtonText");
            this.f886c = interfaceC3983b;
            this.f887d = primaryButtonText;
            this.f888e = z8;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends f {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        private final c f889c;

        /* renamed from: d, reason: collision with root package name */
        private final String f890d;

        /* renamed from: e, reason: collision with root package name */
        private final String f891e;

        /* renamed from: f, reason: collision with root package name */
        private final String f892f;

        /* renamed from: g, reason: collision with root package name */
        private final InterfaceC3983b f893g;

        /* renamed from: h, reason: collision with root package name */
        private final InterfaceC3983b f894h;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new b((c) parcel.readParcelable(b.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), (InterfaceC3983b) parcel.readParcelable(b.class.getClassLoader()), (InterfaceC3983b) parcel.readParcelable(b.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(c resultIdentifier, String str, String str2, String str3, InterfaceC3983b primaryButtonText, InterfaceC3983b interfaceC3983b) {
            super(null, false, 3, 0 == true ? 1 : 0);
            AbstractC3159y.i(resultIdentifier, "resultIdentifier");
            AbstractC3159y.i(primaryButtonText, "primaryButtonText");
            this.f889c = resultIdentifier;
            this.f890d = str;
            this.f891e = str2;
            this.f892f = str3;
            this.f893g = primaryButtonText;
            this.f894h = interfaceC3983b;
        }

        @Override // B3.f
        public InterfaceC3983b c() {
            return this.f894h;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // B3.f
        public InterfaceC3983b e() {
            return this.f893g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (AbstractC3159y.d(this.f889c, bVar.f889c) && AbstractC3159y.d(this.f890d, bVar.f890d) && AbstractC3159y.d(this.f891e, bVar.f891e) && AbstractC3159y.d(this.f892f, bVar.f892f) && AbstractC3159y.d(this.f893g, bVar.f893g) && AbstractC3159y.d(this.f894h, bVar.f894h)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4 = this.f889c.hashCode() * 31;
            String str = this.f890d;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = (hashCode4 + hashCode) * 31;
            String str2 = this.f891e;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str3 = this.f892f;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int hashCode5 = (((i10 + hashCode3) * 31) + this.f893g.hashCode()) * 31;
            InterfaceC3983b interfaceC3983b = this.f894h;
            if (interfaceC3983b != null) {
                i8 = interfaceC3983b.hashCode();
            }
            return hashCode5 + i8;
        }

        public final String i() {
            return this.f890d;
        }

        public final String j() {
            return this.f891e;
        }

        public final c k() {
            return this.f889c;
        }

        public String toString() {
            return "MandateCollection(resultIdentifier=" + this.f889c + ", bankName=" + this.f890d + ", last4=" + this.f891e + ", intentId=" + this.f892f + ", primaryButtonText=" + this.f893g + ", mandateText=" + this.f894h + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f889c, i8);
            out.writeString(this.f890d);
            out.writeString(this.f891e);
            out.writeString(this.f892f);
            out.writeParcelable(this.f893g, i8);
            out.writeParcelable(this.f894h, i8);
        }
    }

    /* loaded from: classes4.dex */
    public interface c extends Parcelable {

        /* loaded from: classes4.dex */
        public static final class a implements c {
            public static final Parcelable.Creator<a> CREATOR = new C0012a();

            /* renamed from: a, reason: collision with root package name */
            private final String f895a;

            /* renamed from: B3.f$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0012a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new a(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public a(String id) {
                AbstractC3159y.i(id, "id");
                this.f895a = id;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof a) && AbstractC3159y.d(this.f895a, ((a) obj).f895a)) {
                    return true;
                }
                return false;
            }

            public final String getId() {
                return this.f895a;
            }

            public int hashCode() {
                return this.f895a.hashCode();
            }

            public String toString() {
                return "PaymentMethod(id=" + this.f895a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f895a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements c {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final String f896a;

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
                this.f896a = id;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof b) && AbstractC3159y.d(this.f896a, ((b) obj).f896a)) {
                    return true;
                }
                return false;
            }

            public final String getId() {
                return this.f896a;
            }

            public int hashCode() {
                return this.f896a.hashCode();
            }

            public String toString() {
                return "Session(id=" + this.f896a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f896a);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends f {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        private final String f897c;

        /* renamed from: d, reason: collision with root package name */
        private final String f898d;

        /* renamed from: e, reason: collision with root package name */
        private final String f899e;

        /* renamed from: f, reason: collision with root package name */
        private final String f900f;

        /* renamed from: g, reason: collision with root package name */
        private final InterfaceC3983b f901g;

        /* renamed from: h, reason: collision with root package name */
        private final InterfaceC3983b f902h;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new d(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (InterfaceC3983b) parcel.readParcelable(d.class.getClassLoader()), (InterfaceC3983b) parcel.readParcelable(d.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, String str2, String bankName, String str3, InterfaceC3983b primaryButtonText, InterfaceC3983b interfaceC3983b) {
            super(null, false, 3, 0 == true ? 1 : 0);
            AbstractC3159y.i(bankName, "bankName");
            AbstractC3159y.i(primaryButtonText, "primaryButtonText");
            this.f897c = str;
            this.f898d = str2;
            this.f899e = bankName;
            this.f900f = str3;
            this.f901g = primaryButtonText;
            this.f902h = interfaceC3983b;
        }

        @Override // B3.f
        public InterfaceC3983b c() {
            return this.f902h;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // B3.f
        public InterfaceC3983b e() {
            return this.f901g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (AbstractC3159y.d(this.f897c, dVar.f897c) && AbstractC3159y.d(this.f898d, dVar.f898d) && AbstractC3159y.d(this.f899e, dVar.f899e) && AbstractC3159y.d(this.f900f, dVar.f900f) && AbstractC3159y.d(this.f901g, dVar.f901g) && AbstractC3159y.d(this.f902h, dVar.f902h)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            String str = this.f897c;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = hashCode * 31;
            String str2 = this.f898d;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode4 = (((i9 + hashCode2) * 31) + this.f899e.hashCode()) * 31;
            String str3 = this.f900f;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int hashCode5 = (((hashCode4 + hashCode3) * 31) + this.f901g.hashCode()) * 31;
            InterfaceC3983b interfaceC3983b = this.f902h;
            if (interfaceC3983b != null) {
                i8 = interfaceC3983b.hashCode();
            }
            return hashCode5 + i8;
        }

        public final String i() {
            return this.f899e;
        }

        public final String j() {
            return this.f897c;
        }

        public final String k() {
            return this.f900f;
        }

        public String toString() {
            return "SavedAccount(financialConnectionsSessionId=" + this.f897c + ", intentId=" + this.f898d + ", bankName=" + this.f899e + ", last4=" + this.f900f + ", primaryButtonText=" + this.f901g + ", mandateText=" + this.f902h + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f897c);
            out.writeString(this.f898d);
            out.writeString(this.f899e);
            out.writeString(this.f900f);
            out.writeParcelable(this.f901g, i8);
            out.writeParcelable(this.f902h, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends f {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        private final BankAccount f903c;

        /* renamed from: d, reason: collision with root package name */
        private final String f904d;

        /* renamed from: e, reason: collision with root package name */
        private final String f905e;

        /* renamed from: f, reason: collision with root package name */
        private final InterfaceC3983b f906f;

        /* renamed from: g, reason: collision with root package name */
        private final InterfaceC3983b f907g;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new e(parcel.readParcelable(e.class.getClassLoader()), parcel.readString(), parcel.readString(), (InterfaceC3983b) parcel.readParcelable(e.class.getClassLoader()), (InterfaceC3983b) parcel.readParcelable(e.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(BankAccount paymentAccount, String financialConnectionsSessionId, String str, InterfaceC3983b primaryButtonText, InterfaceC3983b interfaceC3983b) {
            super(null, false, 3, 0 == true ? 1 : 0);
            AbstractC3159y.i(paymentAccount, "paymentAccount");
            AbstractC3159y.i(financialConnectionsSessionId, "financialConnectionsSessionId");
            AbstractC3159y.i(primaryButtonText, "primaryButtonText");
            this.f903c = paymentAccount;
            this.f904d = financialConnectionsSessionId;
            this.f905e = str;
            this.f906f = primaryButtonText;
            this.f907g = interfaceC3983b;
        }

        @Override // B3.f
        public InterfaceC3983b c() {
            return this.f907g;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // B3.f
        public InterfaceC3983b e() {
            return this.f906f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (AbstractC3159y.d(this.f903c, eVar.f903c) && AbstractC3159y.d(this.f904d, eVar.f904d) && AbstractC3159y.d(this.f905e, eVar.f905e) && AbstractC3159y.d(this.f906f, eVar.f906f) && AbstractC3159y.d(this.f907g, eVar.f907g)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((this.f903c.hashCode() * 31) + this.f904d.hashCode()) * 31;
            String str = this.f905e;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode3 = (((hashCode2 + hashCode) * 31) + this.f906f.hashCode()) * 31;
            InterfaceC3983b interfaceC3983b = this.f907g;
            if (interfaceC3983b != null) {
                i8 = interfaceC3983b.hashCode();
            }
            return hashCode3 + i8;
        }

        public final String i() {
            return this.f904d;
        }

        public final BankAccount j() {
            return this.f903c;
        }

        public String toString() {
            return "VerifyWithMicrodeposits(paymentAccount=" + this.f903c + ", financialConnectionsSessionId=" + this.f904d + ", intentId=" + this.f905e + ", primaryButtonText=" + this.f906f + ", mandateText=" + this.f907g + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable((Parcelable) this.f903c, i8);
            out.writeString(this.f904d);
            out.writeString(this.f905e);
            out.writeParcelable(this.f906f, i8);
            out.writeParcelable(this.f907g, i8);
        }
    }

    public /* synthetic */ f(InterfaceC3983b interfaceC3983b, boolean z8, AbstractC3151p abstractC3151p) {
        this(interfaceC3983b, z8);
    }

    public InterfaceC3983b b() {
        return this.f884a;
    }

    public abstract InterfaceC3983b c();

    public abstract InterfaceC3983b e();

    public boolean f() {
        return this.f885b;
    }

    private f(InterfaceC3983b interfaceC3983b, boolean z8) {
        this.f884a = interfaceC3983b;
        this.f885b = z8;
    }

    public /* synthetic */ f(InterfaceC3983b interfaceC3983b, boolean z8, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? null : interfaceC3983b, (i8 & 2) != 0 ? false : z8, null);
    }
}
