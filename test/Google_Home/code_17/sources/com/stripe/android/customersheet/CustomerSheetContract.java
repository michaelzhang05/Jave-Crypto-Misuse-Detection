package com.stripe.android.customersheet;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import com.stripe.android.customersheet.i;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class CustomerSheetContract extends ActivityResultContract<a, i> {

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final E2.a f24600a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f24601b;

        /* renamed from: c, reason: collision with root package name */
        public static final C0453a f24598c = new C0453a(null);

        /* renamed from: d, reason: collision with root package name */
        public static final int f24599d = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.customersheet.CustomerSheetContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0453a {
            private C0453a() {
            }

            public final a a(Intent intent) {
                AbstractC3255y.i(intent, "intent");
                return (a) intent.getParcelableExtra("args");
            }

            public /* synthetic */ C0453a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new a(E2.a.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(E2.a configuration, Integer num) {
            AbstractC3255y.i(configuration, "configuration");
            this.f24600a = configuration;
            this.f24601b = num;
        }

        public final E2.a a() {
            return this.f24600a;
        }

        public final Integer b() {
            return this.f24601b;
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
            return AbstractC3255y.d(this.f24600a, aVar.f24600a) && AbstractC3255y.d(this.f24601b, aVar.f24601b);
        }

        public int hashCode() {
            int hashCode = this.f24600a.hashCode() * 31;
            Integer num = this.f24601b;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "Args(configuration=" + this.f24600a + ", statusBarColor=" + this.f24601b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            int intValue;
            AbstractC3255y.i(out, "out");
            this.f24600a.writeToParcel(out, i8);
            Integer num = this.f24601b;
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
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(input, "input");
        Intent putExtra = new Intent(context, (Class<?>) CustomerSheetActivity.class).putExtra("args", input);
        AbstractC3255y.h(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i parseResult(int i8, Intent intent) {
        i a8 = i.f24814a.a(intent);
        if (a8 == null) {
            return new i.c(new IllegalArgumentException("Failed to retrieve a CustomerSheetResult"));
        }
        return a8;
    }
}
