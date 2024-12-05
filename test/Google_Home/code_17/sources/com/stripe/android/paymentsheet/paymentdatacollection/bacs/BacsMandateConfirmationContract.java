package com.stripe.android.paymentsheet.paymentdatacollection.bacs;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import com.stripe.android.paymentsheet.u;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class BacsMandateConfirmationContract extends ActivityResultContract<a, c> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f27182a = new b(null);

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f27184a;

        /* renamed from: b, reason: collision with root package name */
        private final String f27185b;

        /* renamed from: c, reason: collision with root package name */
        private final String f27186c;

        /* renamed from: d, reason: collision with root package name */
        private final String f27187d;

        /* renamed from: e, reason: collision with root package name */
        private final u.b f27188e;

        /* renamed from: f, reason: collision with root package name */
        public static final C0620a f27183f = new C0620a(null);
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0620a {
            private C0620a() {
            }

            public final a a(Intent intent) {
                Object parcelableExtra;
                AbstractC3255y.i(intent, "intent");
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra = intent.getParcelableExtra("extra_activity_args", a.class);
                    return (a) parcelableExtra;
                }
                return (a) intent.getParcelableExtra("extra_activity_args");
            }

            public /* synthetic */ C0620a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), u.b.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String email, String nameOnAccount, String sortCode, String accountNumber, u.b appearance) {
            AbstractC3255y.i(email, "email");
            AbstractC3255y.i(nameOnAccount, "nameOnAccount");
            AbstractC3255y.i(sortCode, "sortCode");
            AbstractC3255y.i(accountNumber, "accountNumber");
            AbstractC3255y.i(appearance, "appearance");
            this.f27184a = email;
            this.f27185b = nameOnAccount;
            this.f27186c = sortCode;
            this.f27187d = accountNumber;
            this.f27188e = appearance;
        }

        public final String a() {
            return this.f27187d;
        }

        public final u.b b() {
            return this.f27188e;
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
            return AbstractC3255y.d(this.f27184a, aVar.f27184a) && AbstractC3255y.d(this.f27185b, aVar.f27185b) && AbstractC3255y.d(this.f27186c, aVar.f27186c) && AbstractC3255y.d(this.f27187d, aVar.f27187d) && AbstractC3255y.d(this.f27188e, aVar.f27188e);
        }

        public final String g() {
            return this.f27184a;
        }

        public final String h() {
            return this.f27185b;
        }

        public int hashCode() {
            return (((((((this.f27184a.hashCode() * 31) + this.f27185b.hashCode()) * 31) + this.f27186c.hashCode()) * 31) + this.f27187d.hashCode()) * 31) + this.f27188e.hashCode();
        }

        public final String i() {
            return this.f27186c;
        }

        public String toString() {
            return "Args(email=" + this.f27184a + ", nameOnAccount=" + this.f27185b + ", sortCode=" + this.f27186c + ", accountNumber=" + this.f27187d + ", appearance=" + this.f27188e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f27184a);
            out.writeString(this.f27185b);
            out.writeString(this.f27186c);
            out.writeString(this.f27187d);
            this.f27188e.writeToParcel(out, i8);
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

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(input, "input");
        Intent putExtra = new Intent(context, (Class<?>) BacsMandateConfirmationActivity.class).putExtra("extra_activity_args", input);
        AbstractC3255y.h(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c parseResult(int i8, Intent intent) {
        return c.f27216j0.a(intent);
    }
}
