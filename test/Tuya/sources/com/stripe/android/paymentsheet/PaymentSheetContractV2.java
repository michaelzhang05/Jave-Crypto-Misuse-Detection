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
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class PaymentSheetContractV2 extends ActivityResultContract<a, x> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f25507a = new b(null);

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final u.l f25510a;

        /* renamed from: b, reason: collision with root package name */
        private final u.g f25511b;

        /* renamed from: c, reason: collision with root package name */
        private final Integer f25512c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25513d;

        /* renamed from: e, reason: collision with root package name */
        public static final C0576a f25508e = new C0576a(null);

        /* renamed from: f, reason: collision with root package name */
        public static final int f25509f = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.paymentsheet.PaymentSheetContractV2$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0576a {
            private C0576a() {
            }

            public final a a(Intent intent) {
                AbstractC3159y.i(intent, "intent");
                return (a) intent.getParcelableExtra("com.stripe.android.paymentsheet.PaymentSheetContract.extra_args");
            }

            public /* synthetic */ C0576a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a((u.l) parcel.readParcelable(a.class.getClassLoader()), u.g.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(u.l initializationMode, u.g config, Integer num, boolean z8) {
            AbstractC3159y.i(initializationMode, "initializationMode");
            AbstractC3159y.i(config, "config");
            this.f25510a = initializationMode;
            this.f25511b = config;
            this.f25512c = num;
            this.f25513d = z8;
        }

        public final u.g b() {
            return this.f25511b;
        }

        public final u.k c() {
            return this.f25511b.o();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final u.l e() {
            return this.f25510a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3159y.d(this.f25510a, aVar.f25510a) && AbstractC3159y.d(this.f25511b, aVar.f25511b) && AbstractC3159y.d(this.f25512c, aVar.f25512c) && this.f25513d == aVar.f25513d;
        }

        public final boolean f() {
            return this.f25513d;
        }

        public int hashCode() {
            int hashCode = ((this.f25510a.hashCode() * 31) + this.f25511b.hashCode()) * 31;
            Integer num = this.f25512c;
            return ((hashCode + (num == null ? 0 : num.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f25513d);
        }

        public final Integer i() {
            return this.f25512c;
        }

        public String toString() {
            return "Args(initializationMode=" + this.f25510a + ", config=" + this.f25511b + ", statusBarColor=" + this.f25512c + ", initializedViaCompose=" + this.f25513d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            int intValue;
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f25510a, i8);
            this.f25511b.writeToParcel(out, i8);
            Integer num = this.f25512c;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
            out.writeInt(this.f25513d ? 1 : 0);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final x f25514a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new c((x) parcel.readParcelable(c.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(x paymentSheetResult) {
            AbstractC3159y.i(paymentSheetResult, "paymentSheetResult");
            this.f25514a = paymentSheetResult;
        }

        public final x b() {
            return this.f25514a;
        }

        public Bundle c() {
            return BundleKt.bundleOf(L5.x.a("com.stripe.android.paymentsheet.PaymentSheetContract.extra_result", this));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3159y.d(this.f25514a, ((c) obj).f25514a);
        }

        public int hashCode() {
            return this.f25514a.hashCode();
        }

        public String toString() {
            return "Result(paymentSheetResult=" + this.f25514a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f25514a, i8);
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(input, "input");
        Intent putExtra = new Intent(context, (Class<?>) PaymentSheetActivity.class).putExtra("com.stripe.android.paymentsheet.PaymentSheetContract.extra_args", input);
        AbstractC3159y.h(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x parseResult(int i8, Intent intent) {
        x xVar;
        c cVar;
        if (intent != null && (cVar = (c) intent.getParcelableExtra("com.stripe.android.paymentsheet.PaymentSheetContract.extra_result")) != null) {
            xVar = cVar.b();
        } else {
            xVar = null;
        }
        if (xVar == null) {
            return new x.c(new IllegalArgumentException("Failed to retrieve a PaymentSheetResult."));
        }
        return xVar;
    }
}
