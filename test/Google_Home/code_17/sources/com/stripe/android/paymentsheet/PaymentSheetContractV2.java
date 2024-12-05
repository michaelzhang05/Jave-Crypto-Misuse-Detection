package com.stripe.android.paymentsheet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import com.stripe.android.paymentsheet.u;
import com.stripe.android.paymentsheet.x;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class PaymentSheetContractV2 extends ActivityResultContract<a, x> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f26562a = new b(null);

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final u.l f26565a;

        /* renamed from: b, reason: collision with root package name */
        private final u.g f26566b;

        /* renamed from: c, reason: collision with root package name */
        private final Integer f26567c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f26568d;

        /* renamed from: e, reason: collision with root package name */
        public static final C0572a f26563e = new C0572a(null);

        /* renamed from: f, reason: collision with root package name */
        public static final int f26564f = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.paymentsheet.PaymentSheetContractV2$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0572a {
            private C0572a() {
            }

            public final a a(Intent intent) {
                AbstractC3255y.i(intent, "intent");
                return (a) intent.getParcelableExtra("com.stripe.android.paymentsheet.PaymentSheetContract.extra_args");
            }

            public /* synthetic */ C0572a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new a((u.l) parcel.readParcelable(a.class.getClassLoader()), u.g.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(u.l initializationMode, u.g config, Integer num, boolean z8) {
            AbstractC3255y.i(initializationMode, "initializationMode");
            AbstractC3255y.i(config, "config");
            this.f26565a = initializationMode;
            this.f26566b = config;
            this.f26567c = num;
            this.f26568d = z8;
        }

        public final u.g a() {
            return this.f26566b;
        }

        public final u.k b() {
            return this.f26566b.u();
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
            return AbstractC3255y.d(this.f26565a, aVar.f26565a) && AbstractC3255y.d(this.f26566b, aVar.f26566b) && AbstractC3255y.d(this.f26567c, aVar.f26567c) && this.f26568d == aVar.f26568d;
        }

        public final u.l g() {
            return this.f26565a;
        }

        public final boolean h() {
            return this.f26568d;
        }

        public int hashCode() {
            int hashCode = ((this.f26565a.hashCode() * 31) + this.f26566b.hashCode()) * 31;
            Integer num = this.f26567c;
            return ((hashCode + (num == null ? 0 : num.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f26568d);
        }

        public final Integer i() {
            return this.f26567c;
        }

        public String toString() {
            return "Args(initializationMode=" + this.f26565a + ", config=" + this.f26566b + ", statusBarColor=" + this.f26567c + ", initializedViaCompose=" + this.f26568d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            int intValue;
            AbstractC3255y.i(out, "out");
            out.writeParcelable(this.f26565a, i8);
            this.f26566b.writeToParcel(out, i8);
            Integer num = this.f26567c;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
            out.writeInt(this.f26568d ? 1 : 0);
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

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final x f26569a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new c((x) parcel.readParcelable(c.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(x paymentSheetResult) {
            AbstractC3255y.i(paymentSheetResult, "paymentSheetResult");
            this.f26569a = paymentSheetResult;
        }

        public final x a() {
            return this.f26569a;
        }

        public Bundle b() {
            return BundleKt.bundleOf(O5.x.a("com.stripe.android.paymentsheet.PaymentSheetContract.extra_result", this));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3255y.d(this.f26569a, ((c) obj).f26569a);
        }

        public int hashCode() {
            return this.f26569a.hashCode();
        }

        public String toString() {
            return "Result(paymentSheetResult=" + this.f26569a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeParcelable(this.f26569a, i8);
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(input, "input");
        Intent putExtra = new Intent(context, (Class<?>) PaymentSheetActivity.class).putExtra("com.stripe.android.paymentsheet.PaymentSheetContract.extra_args", input);
        AbstractC3255y.h(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x parseResult(int i8, Intent intent) {
        x xVar;
        c cVar;
        if (intent != null && (cVar = (c) intent.getParcelableExtra("com.stripe.android.paymentsheet.PaymentSheetContract.extra_result")) != null) {
            xVar = cVar.a();
        } else {
            xVar = null;
        }
        if (xVar == null) {
            return new x.c(new IllegalArgumentException("Failed to retrieve a PaymentSheetResult."));
        }
        return xVar;
    }
}
