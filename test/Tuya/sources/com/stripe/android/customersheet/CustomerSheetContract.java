package com.stripe.android.customersheet;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import com.stripe.android.customersheet.i;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class CustomerSheetContract extends ActivityResultContract<a, i> {

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final B2.a f23545a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f23546b;

        /* renamed from: c, reason: collision with root package name */
        public static final C0457a f23543c = new C0457a(null);

        /* renamed from: d, reason: collision with root package name */
        public static final int f23544d = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.customersheet.CustomerSheetContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0457a {
            private C0457a() {
            }

            public final a a(Intent intent) {
                AbstractC3159y.i(intent, "intent");
                return (a) intent.getParcelableExtra("args");
            }

            public /* synthetic */ C0457a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a(B2.a.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(B2.a configuration, Integer num) {
            AbstractC3159y.i(configuration, "configuration");
            this.f23545a = configuration;
            this.f23546b = num;
        }

        public final B2.a b() {
            return this.f23545a;
        }

        public final Integer c() {
            return this.f23546b;
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
            return AbstractC3159y.d(this.f23545a, aVar.f23545a) && AbstractC3159y.d(this.f23546b, aVar.f23546b);
        }

        public int hashCode() {
            int hashCode = this.f23545a.hashCode() * 31;
            Integer num = this.f23546b;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "Args(configuration=" + this.f23545a + ", statusBarColor=" + this.f23546b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            int intValue;
            AbstractC3159y.i(out, "out");
            this.f23545a.writeToParcel(out, i8);
            Integer num = this.f23546b;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(input, "input");
        Intent putExtra = new Intent(context, (Class<?>) CustomerSheetActivity.class).putExtra("args", input);
        AbstractC3159y.h(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i parseResult(int i8, Intent intent) {
        i a8 = i.f23759a.a(intent);
        if (a8 == null) {
            return new i.c(new IllegalArgumentException("Failed to retrieve a CustomerSheetResult"));
        }
        return a8;
    }
}
