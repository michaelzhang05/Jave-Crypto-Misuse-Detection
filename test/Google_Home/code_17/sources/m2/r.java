package m2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import u2.C4054a;

/* loaded from: classes4.dex */
public final class r implements Parcelable {

    /* renamed from: d, reason: collision with root package name */
    private static r f35038d;

    /* renamed from: a, reason: collision with root package name */
    private final String f35039a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35040b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f35037c = new a(null);
    public static final Parcelable.Creator<r> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public static /* synthetic */ void c(a aVar, Context context, String str, String str2, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                str2 = null;
            }
            aVar.b(context, str, str2);
        }

        private final r d(Context context) {
            r a8 = new c(context).a();
            if (a8 != null) {
                r.f35038d = a8;
                return a8;
            }
            throw new IllegalStateException("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
        }

        public final r a(Context context) {
            AbstractC3255y.i(context, "context");
            r rVar = r.f35038d;
            if (rVar == null) {
                return d(context);
            }
            return rVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b(Context context, String publishableKey, String str) {
            AbstractC3255y.i(context, "context");
            AbstractC3255y.i(publishableKey, "publishableKey");
            r.f35038d = new r(publishableKey, str);
            new c(context).b(publishableKey, str);
            new C3421g(context, null, 2, 0 == true ? 1 : 0).b();
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new r(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final r[] newArray(int i8) {
            return new r[i8];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        private static final a f35041b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        private static final String f35042c = r.class.getCanonicalName();

        /* renamed from: a, reason: collision with root package name */
        private final SharedPreferences f35043a;

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        public c(Context context) {
            AbstractC3255y.i(context, "context");
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f35042c, 0);
            AbstractC3255y.h(sharedPreferences, "getSharedPreferences(...)");
            this.f35043a = sharedPreferences;
        }

        public final /* synthetic */ r a() {
            String string = this.f35043a.getString("key_publishable_key", null);
            if (string == null) {
                return null;
            }
            return new r(string, this.f35043a.getString("key_account_id", null));
        }

        public final /* synthetic */ void b(String publishableKey, String str) {
            AbstractC3255y.i(publishableKey, "publishableKey");
            this.f35043a.edit().putString("key_publishable_key", publishableKey).putString("key_account_id", str).apply();
        }
    }

    public r(String publishableKey, String str) {
        AbstractC3255y.i(publishableKey, "publishableKey");
        this.f35039a = publishableKey;
        this.f35040b = str;
        C4054a.f39939a.a().b(publishableKey);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (AbstractC3255y.d(this.f35039a, rVar.f35039a) && AbstractC3255y.d(this.f35040b, rVar.f35040b)) {
            return true;
        }
        return false;
    }

    public final String g() {
        return this.f35039a;
    }

    public final String h() {
        return this.f35040b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f35039a.hashCode() * 31;
        String str = this.f35040b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "PaymentConfiguration(publishableKey=" + this.f35039a + ", stripeAccountId=" + this.f35040b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f35039a);
        out.writeString(this.f35040b);
    }
}
