package e3;

import P5.AbstractC1378t;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public interface v extends Parcelable {
    List C();

    String I();

    String Q();

    String S();

    String d();

    String getType();

    List n();

    /* loaded from: classes4.dex */
    public static final class a implements v {
        public static final Parcelable.Creator<a> CREATOR = new C0727a();

        /* renamed from: a, reason: collision with root package name */
        private final String f31576a;

        /* renamed from: b, reason: collision with root package name */
        private final com.stripe.android.model.i f31577b;

        /* renamed from: c, reason: collision with root package name */
        private final List f31578c;

        /* renamed from: d, reason: collision with root package name */
        private final String f31579d;

        /* renamed from: e, reason: collision with root package name */
        private final String f31580e;

        /* renamed from: e3.v$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0727a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new a(parcel.readString(), com.stripe.android.model.i.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String str, com.stripe.android.model.i deferredIntentParams, List externalPaymentMethods, String str2, String str3) {
            AbstractC3255y.i(deferredIntentParams, "deferredIntentParams");
            AbstractC3255y.i(externalPaymentMethods, "externalPaymentMethods");
            this.f31576a = str;
            this.f31577b = deferredIntentParams;
            this.f31578c = externalPaymentMethods;
            this.f31579d = str2;
            this.f31580e = str3;
        }

        @Override // e3.v
        public List C() {
            return AbstractC1378t.m();
        }

        @Override // e3.v
        public String I() {
            return this.f31580e;
        }

        @Override // e3.v
        public String Q() {
            return this.f31579d;
        }

        @Override // e3.v
        public String S() {
            return this.f31576a;
        }

        public final com.stripe.android.model.i a() {
            return this.f31577b;
        }

        @Override // e3.v
        public String d() {
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
            if (AbstractC3255y.d(this.f31576a, aVar.f31576a) && AbstractC3255y.d(this.f31577b, aVar.f31577b) && AbstractC3255y.d(this.f31578c, aVar.f31578c) && AbstractC3255y.d(this.f31579d, aVar.f31579d) && AbstractC3255y.d(this.f31580e, aVar.f31580e)) {
                return true;
            }
            return false;
        }

        @Override // e3.v
        public String getType() {
            return "deferred_intent";
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            String str = this.f31576a;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode3 = ((((hashCode * 31) + this.f31577b.hashCode()) * 31) + this.f31578c.hashCode()) * 31;
            String str2 = this.f31579d;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i9 = (hashCode3 + hashCode2) * 31;
            String str3 = this.f31580e;
            if (str3 != null) {
                i8 = str3.hashCode();
            }
            return i9 + i8;
        }

        @Override // e3.v
        public List n() {
            return this.f31578c;
        }

        public String toString() {
            return "DeferredIntentType(locale=" + this.f31576a + ", deferredIntentParams=" + this.f31577b + ", externalPaymentMethods=" + this.f31578c + ", defaultPaymentMethodId=" + this.f31579d + ", customerSessionClientSecret=" + this.f31580e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f31576a);
            this.f31577b.writeToParcel(out, i8);
            out.writeStringList(this.f31578c);
            out.writeString(this.f31579d);
            out.writeString(this.f31580e);
        }

        public /* synthetic */ a(String str, com.stripe.android.model.i iVar, List list, String str2, String str3, int i8, AbstractC3247p abstractC3247p) {
            this((i8 & 1) != 0 ? Locale.getDefault().toLanguageTag() : str, iVar, list, (i8 & 8) != 0 ? null : str2, (i8 & 16) != 0 ? null : str3);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements v {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f31581a;

        /* renamed from: b, reason: collision with root package name */
        private final String f31582b;

        /* renamed from: c, reason: collision with root package name */
        private final String f31583c;

        /* renamed from: d, reason: collision with root package name */
        private final String f31584d;

        /* renamed from: e, reason: collision with root package name */
        private final List f31585e;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(String clientSecret, String str, String str2, String str3, List externalPaymentMethods) {
            AbstractC3255y.i(clientSecret, "clientSecret");
            AbstractC3255y.i(externalPaymentMethods, "externalPaymentMethods");
            this.f31581a = clientSecret;
            this.f31582b = str;
            this.f31583c = str2;
            this.f31584d = str3;
            this.f31585e = externalPaymentMethods;
        }

        @Override // e3.v
        public List C() {
            return AbstractC1378t.e("payment_method_preference." + getType() + ".payment_method");
        }

        @Override // e3.v
        public String I() {
            return this.f31583c;
        }

        @Override // e3.v
        public String Q() {
            return this.f31584d;
        }

        @Override // e3.v
        public String S() {
            return this.f31582b;
        }

        @Override // e3.v
        public String d() {
            return this.f31581a;
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
            if (AbstractC3255y.d(this.f31581a, bVar.f31581a) && AbstractC3255y.d(this.f31582b, bVar.f31582b) && AbstractC3255y.d(this.f31583c, bVar.f31583c) && AbstractC3255y.d(this.f31584d, bVar.f31584d) && AbstractC3255y.d(this.f31585e, bVar.f31585e)) {
                return true;
            }
            return false;
        }

        @Override // e3.v
        public String getType() {
            return "payment_intent";
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3 = this.f31581a.hashCode() * 31;
            String str = this.f31582b;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = (hashCode3 + hashCode) * 31;
            String str2 = this.f31583c;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str3 = this.f31584d;
            if (str3 != null) {
                i8 = str3.hashCode();
            }
            return ((i10 + i8) * 31) + this.f31585e.hashCode();
        }

        @Override // e3.v
        public List n() {
            return this.f31585e;
        }

        public String toString() {
            return "PaymentIntentType(clientSecret=" + this.f31581a + ", locale=" + this.f31582b + ", customerSessionClientSecret=" + this.f31583c + ", defaultPaymentMethodId=" + this.f31584d + ", externalPaymentMethods=" + this.f31585e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f31581a);
            out.writeString(this.f31582b);
            out.writeString(this.f31583c);
            out.writeString(this.f31584d);
            out.writeStringList(this.f31585e);
        }

        public /* synthetic */ b(String str, String str2, String str3, String str4, List list, int i8, AbstractC3247p abstractC3247p) {
            this(str, (i8 & 2) != 0 ? Locale.getDefault().toLanguageTag() : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, list);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements v {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f31586a;

        /* renamed from: b, reason: collision with root package name */
        private final String f31587b;

        /* renamed from: c, reason: collision with root package name */
        private final String f31588c;

        /* renamed from: d, reason: collision with root package name */
        private final String f31589d;

        /* renamed from: e, reason: collision with root package name */
        private final List f31590e;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new c(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(String clientSecret, String str, String str2, String str3, List externalPaymentMethods) {
            AbstractC3255y.i(clientSecret, "clientSecret");
            AbstractC3255y.i(externalPaymentMethods, "externalPaymentMethods");
            this.f31586a = clientSecret;
            this.f31587b = str;
            this.f31588c = str2;
            this.f31589d = str3;
            this.f31590e = externalPaymentMethods;
        }

        @Override // e3.v
        public List C() {
            return AbstractC1378t.e("payment_method_preference." + getType() + ".payment_method");
        }

        @Override // e3.v
        public String I() {
            return this.f31588c;
        }

        @Override // e3.v
        public String Q() {
            return this.f31589d;
        }

        @Override // e3.v
        public String S() {
            return this.f31587b;
        }

        @Override // e3.v
        public String d() {
            return this.f31586a;
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
            if (AbstractC3255y.d(this.f31586a, cVar.f31586a) && AbstractC3255y.d(this.f31587b, cVar.f31587b) && AbstractC3255y.d(this.f31588c, cVar.f31588c) && AbstractC3255y.d(this.f31589d, cVar.f31589d) && AbstractC3255y.d(this.f31590e, cVar.f31590e)) {
                return true;
            }
            return false;
        }

        @Override // e3.v
        public String getType() {
            return "setup_intent";
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3 = this.f31586a.hashCode() * 31;
            String str = this.f31587b;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = (hashCode3 + hashCode) * 31;
            String str2 = this.f31588c;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str3 = this.f31589d;
            if (str3 != null) {
                i8 = str3.hashCode();
            }
            return ((i10 + i8) * 31) + this.f31590e.hashCode();
        }

        @Override // e3.v
        public List n() {
            return this.f31590e;
        }

        public String toString() {
            return "SetupIntentType(clientSecret=" + this.f31586a + ", locale=" + this.f31587b + ", customerSessionClientSecret=" + this.f31588c + ", defaultPaymentMethodId=" + this.f31589d + ", externalPaymentMethods=" + this.f31590e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f31586a);
            out.writeString(this.f31587b);
            out.writeString(this.f31588c);
            out.writeString(this.f31589d);
            out.writeStringList(this.f31590e);
        }

        public /* synthetic */ c(String str, String str2, String str3, String str4, List list, int i8, AbstractC3247p abstractC3247p) {
            this(str, (i8 & 2) != 0 ? Locale.getDefault().toLanguageTag() : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, list);
        }
    }
}
