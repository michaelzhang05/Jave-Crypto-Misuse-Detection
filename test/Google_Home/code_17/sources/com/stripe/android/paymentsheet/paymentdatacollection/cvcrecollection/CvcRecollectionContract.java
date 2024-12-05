package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import com.stripe.android.paymentsheet.u;
import e3.EnumC2791e;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class CvcRecollectionContract extends ActivityResultContract<a, com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f27260a = new b(null);

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f27262a;

        /* renamed from: b, reason: collision with root package name */
        private final EnumC2791e f27263b;

        /* renamed from: c, reason: collision with root package name */
        private final u.b f27264c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f27265d;

        /* renamed from: e, reason: collision with root package name */
        public static final C0629a f27261e = new C0629a(null);
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0629a {
            private C0629a() {
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

            public /* synthetic */ C0629a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new a(parcel.readString(), EnumC2791e.valueOf(parcel.readString()), u.b.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String lastFour, EnumC2791e cardBrand, u.b appearance, boolean z8) {
            AbstractC3255y.i(lastFour, "lastFour");
            AbstractC3255y.i(cardBrand, "cardBrand");
            AbstractC3255y.i(appearance, "appearance");
            this.f27262a = lastFour;
            this.f27263b = cardBrand;
            this.f27264c = appearance;
            this.f27265d = z8;
        }

        public final u.b a() {
            return this.f27264c;
        }

        public final EnumC2791e b() {
            return this.f27263b;
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
            return AbstractC3255y.d(this.f27262a, aVar.f27262a) && this.f27263b == aVar.f27263b && AbstractC3255y.d(this.f27264c, aVar.f27264c) && this.f27265d == aVar.f27265d;
        }

        public final String g() {
            return this.f27262a;
        }

        public final boolean h() {
            return this.f27265d;
        }

        public int hashCode() {
            return (((((this.f27262a.hashCode() * 31) + this.f27263b.hashCode()) * 31) + this.f27264c.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f27265d);
        }

        public String toString() {
            return "Args(lastFour=" + this.f27262a + ", cardBrand=" + this.f27263b + ", appearance=" + this.f27264c + ", isTestMode=" + this.f27265d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f27262a);
            out.writeString(this.f27263b.name());
            this.f27264c.writeToParcel(out, i8);
            out.writeInt(this.f27265d ? 1 : 0);
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
        Intent putExtra = new Intent(context, (Class<?>) CvcRecollectionActivity.class).putExtra("extra_activity_args", input);
        AbstractC3255y.h(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a parseResult(int i8, Intent intent) {
        return com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a.f27266k0.a(intent);
    }
}
