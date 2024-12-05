package com.stripe.android.paymentsheet.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import com.stripe.android.paymentsheet.ui.e;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class SepaMandateContract extends ActivityResultContract<a, e> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f27609a = new b(null);

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f27611a;

        /* renamed from: b, reason: collision with root package name */
        public static final C0654a f27610b = new C0654a(null);
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.paymentsheet.ui.SepaMandateContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0654a {
            private C0654a() {
            }

            public final a a(Intent intent) {
                AbstractC3255y.i(intent, "intent");
                return (a) intent.getParcelableExtra("extra_activity_args");
            }

            public /* synthetic */ C0654a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
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

        public a(String merchantName) {
            AbstractC3255y.i(merchantName, "merchantName");
            this.f27611a = merchantName;
        }

        public final String a() {
            return this.f27611a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3255y.d(this.f27611a, ((a) obj).f27611a);
        }

        public int hashCode() {
            return this.f27611a.hashCode();
        }

        public String toString() {
            return "Args(merchantName=" + this.f27611a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f27611a);
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
        Intent putExtra = new Intent(context, (Class<?>) SepaMandateActivity.class).putExtra("extra_activity_args", input);
        AbstractC3255y.h(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e parseResult(int i8, Intent intent) {
        e eVar;
        if (intent != null) {
            eVar = (e) intent.getParcelableExtra("extra_activity_result");
        } else {
            eVar = null;
        }
        if (eVar == null) {
            return e.b.f27764a;
        }
        return eVar;
    }
}
