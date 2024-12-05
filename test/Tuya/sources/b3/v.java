package b3;

import M5.AbstractC1246t;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public interface v extends Parcelable {
    List A();

    String F();

    String P();

    String S();

    String d();

    String getType();

    List q();

    /* loaded from: classes4.dex */
    public static final class a implements v {
        public static final Parcelable.Creator<a> CREATOR = new C0359a();

        /* renamed from: a, reason: collision with root package name */
        private final String f14570a;

        /* renamed from: b, reason: collision with root package name */
        private final com.stripe.android.model.i f14571b;

        /* renamed from: c, reason: collision with root package name */
        private final List f14572c;

        /* renamed from: d, reason: collision with root package name */
        private final String f14573d;

        /* renamed from: e, reason: collision with root package name */
        private final String f14574e;

        /* renamed from: b3.v$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0359a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a(parcel.readString(), com.stripe.android.model.i.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String str, com.stripe.android.model.i deferredIntentParams, List externalPaymentMethods, String str2, String str3) {
            AbstractC3159y.i(deferredIntentParams, "deferredIntentParams");
            AbstractC3159y.i(externalPaymentMethods, "externalPaymentMethods");
            this.f14570a = str;
            this.f14571b = deferredIntentParams;
            this.f14572c = externalPaymentMethods;
            this.f14573d = str2;
            this.f14574e = str3;
        }

        @Override // b3.v
        public List A() {
            return AbstractC1246t.m();
        }

        @Override // b3.v
        public String F() {
            return this.f14574e;
        }

        @Override // b3.v
        public String P() {
            return this.f14573d;
        }

        @Override // b3.v
        public String S() {
            return this.f14570a;
        }

        public final com.stripe.android.model.i b() {
            return this.f14571b;
        }

        @Override // b3.v
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
            if (AbstractC3159y.d(this.f14570a, aVar.f14570a) && AbstractC3159y.d(this.f14571b, aVar.f14571b) && AbstractC3159y.d(this.f14572c, aVar.f14572c) && AbstractC3159y.d(this.f14573d, aVar.f14573d) && AbstractC3159y.d(this.f14574e, aVar.f14574e)) {
                return true;
            }
            return false;
        }

        @Override // b3.v
        public String getType() {
            return "deferred_intent";
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            String str = this.f14570a;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode3 = ((((hashCode * 31) + this.f14571b.hashCode()) * 31) + this.f14572c.hashCode()) * 31;
            String str2 = this.f14573d;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i9 = (hashCode3 + hashCode2) * 31;
            String str3 = this.f14574e;
            if (str3 != null) {
                i8 = str3.hashCode();
            }
            return i9 + i8;
        }

        @Override // b3.v
        public List q() {
            return this.f14572c;
        }

        public String toString() {
            return "DeferredIntentType(locale=" + this.f14570a + ", deferredIntentParams=" + this.f14571b + ", externalPaymentMethods=" + this.f14572c + ", defaultPaymentMethodId=" + this.f14573d + ", customerSessionClientSecret=" + this.f14574e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f14570a);
            this.f14571b.writeToParcel(out, i8);
            out.writeStringList(this.f14572c);
            out.writeString(this.f14573d);
            out.writeString(this.f14574e);
        }

        public /* synthetic */ a(String str, com.stripe.android.model.i iVar, List list, String str2, String str3, int i8, AbstractC3151p abstractC3151p) {
            this((i8 & 1) != 0 ? Locale.getDefault().toLanguageTag() : str, iVar, list, (i8 & 8) != 0 ? null : str2, (i8 & 16) != 0 ? null : str3);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements v {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f14575a;

        /* renamed from: b, reason: collision with root package name */
        private final String f14576b;

        /* renamed from: c, reason: collision with root package name */
        private final String f14577c;

        /* renamed from: d, reason: collision with root package name */
        private final String f14578d;

        /* renamed from: e, reason: collision with root package name */
        private final List f14579e;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(String clientSecret, String str, String str2, String str3, List externalPaymentMethods) {
            AbstractC3159y.i(clientSecret, "clientSecret");
            AbstractC3159y.i(externalPaymentMethods, "externalPaymentMethods");
            this.f14575a = clientSecret;
            this.f14576b = str;
            this.f14577c = str2;
            this.f14578d = str3;
            this.f14579e = externalPaymentMethods;
        }

        @Override // b3.v
        public List A() {
            return AbstractC1246t.e("payment_method_preference." + getType() + ".payment_method");
        }

        @Override // b3.v
        public String F() {
            return this.f14577c;
        }

        @Override // b3.v
        public String P() {
            return this.f14578d;
        }

        @Override // b3.v
        public String S() {
            return this.f14576b;
        }

        @Override // b3.v
        public String d() {
            return this.f14575a;
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
            if (AbstractC3159y.d(this.f14575a, bVar.f14575a) && AbstractC3159y.d(this.f14576b, bVar.f14576b) && AbstractC3159y.d(this.f14577c, bVar.f14577c) && AbstractC3159y.d(this.f14578d, bVar.f14578d) && AbstractC3159y.d(this.f14579e, bVar.f14579e)) {
                return true;
            }
            return false;
        }

        @Override // b3.v
        public String getType() {
            return "payment_intent";
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3 = this.f14575a.hashCode() * 31;
            String str = this.f14576b;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = (hashCode3 + hashCode) * 31;
            String str2 = this.f14577c;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str3 = this.f14578d;
            if (str3 != null) {
                i8 = str3.hashCode();
            }
            return ((i10 + i8) * 31) + this.f14579e.hashCode();
        }

        @Override // b3.v
        public List q() {
            return this.f14579e;
        }

        public String toString() {
            return "PaymentIntentType(clientSecret=" + this.f14575a + ", locale=" + this.f14576b + ", customerSessionClientSecret=" + this.f14577c + ", defaultPaymentMethodId=" + this.f14578d + ", externalPaymentMethods=" + this.f14579e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f14575a);
            out.writeString(this.f14576b);
            out.writeString(this.f14577c);
            out.writeString(this.f14578d);
            out.writeStringList(this.f14579e);
        }

        public /* synthetic */ b(String str, String str2, String str3, String str4, List list, int i8, AbstractC3151p abstractC3151p) {
            this(str, (i8 & 2) != 0 ? Locale.getDefault().toLanguageTag() : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, list);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements v {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f14580a;

        /* renamed from: b, reason: collision with root package name */
        private final String f14581b;

        /* renamed from: c, reason: collision with root package name */
        private final String f14582c;

        /* renamed from: d, reason: collision with root package name */
        private final String f14583d;

        /* renamed from: e, reason: collision with root package name */
        private final List f14584e;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new c(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(String clientSecret, String str, String str2, String str3, List externalPaymentMethods) {
            AbstractC3159y.i(clientSecret, "clientSecret");
            AbstractC3159y.i(externalPaymentMethods, "externalPaymentMethods");
            this.f14580a = clientSecret;
            this.f14581b = str;
            this.f14582c = str2;
            this.f14583d = str3;
            this.f14584e = externalPaymentMethods;
        }

        @Override // b3.v
        public List A() {
            return AbstractC1246t.e("payment_method_preference." + getType() + ".payment_method");
        }

        @Override // b3.v
        public String F() {
            return this.f14582c;
        }

        @Override // b3.v
        public String P() {
            return this.f14583d;
        }

        @Override // b3.v
        public String S() {
            return this.f14581b;
        }

        @Override // b3.v
        public String d() {
            return this.f14580a;
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
            if (AbstractC3159y.d(this.f14580a, cVar.f14580a) && AbstractC3159y.d(this.f14581b, cVar.f14581b) && AbstractC3159y.d(this.f14582c, cVar.f14582c) && AbstractC3159y.d(this.f14583d, cVar.f14583d) && AbstractC3159y.d(this.f14584e, cVar.f14584e)) {
                return true;
            }
            return false;
        }

        @Override // b3.v
        public String getType() {
            return "setup_intent";
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3 = this.f14580a.hashCode() * 31;
            String str = this.f14581b;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = (hashCode3 + hashCode) * 31;
            String str2 = this.f14582c;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str3 = this.f14583d;
            if (str3 != null) {
                i8 = str3.hashCode();
            }
            return ((i10 + i8) * 31) + this.f14584e.hashCode();
        }

        @Override // b3.v
        public List q() {
            return this.f14584e;
        }

        public String toString() {
            return "SetupIntentType(clientSecret=" + this.f14580a + ", locale=" + this.f14581b + ", customerSessionClientSecret=" + this.f14582c + ", defaultPaymentMethodId=" + this.f14583d + ", externalPaymentMethods=" + this.f14584e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f14580a);
            out.writeString(this.f14581b);
            out.writeString(this.f14582c);
            out.writeString(this.f14583d);
            out.writeStringList(this.f14584e);
        }

        public /* synthetic */ c(String str, String str2, String str3, String str4, List list, int i8, AbstractC3151p abstractC3151p) {
            this(str, (i8 & 2) != 0 ? Locale.getDefault().toLanguageTag() : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, list);
        }
    }
}
