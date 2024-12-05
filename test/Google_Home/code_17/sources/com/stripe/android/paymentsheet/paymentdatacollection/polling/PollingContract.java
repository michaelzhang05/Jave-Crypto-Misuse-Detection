package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import O5.x;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import i3.C2980c;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class PollingContract extends ActivityResultContract<a, C2980c> {

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f27344a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f27345b;

        /* renamed from: c, reason: collision with root package name */
        private final int f27346c;

        /* renamed from: d, reason: collision with root package name */
        private final int f27347d;

        /* renamed from: e, reason: collision with root package name */
        private final int f27348e;

        /* renamed from: f, reason: collision with root package name */
        private final int f27349f;

        /* renamed from: g, reason: collision with root package name */
        public static final C0639a f27343g = new C0639a(null);
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0639a {
            private C0639a() {
            }

            public final a a(Intent intent) {
                AbstractC3255y.i(intent, "intent");
                return (a) intent.getParcelableExtra("extra_args");
            }

            public /* synthetic */ C0639a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new a(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String clientSecret, Integer num, int i8, int i9, int i10, int i11) {
            AbstractC3255y.i(clientSecret, "clientSecret");
            this.f27344a = clientSecret;
            this.f27345b = num;
            this.f27346c = i8;
            this.f27347d = i9;
            this.f27348e = i10;
            this.f27349f = i11;
        }

        public final int a() {
            return this.f27349f;
        }

        public final int b() {
            return this.f27347d;
        }

        public final String d() {
            return this.f27344a;
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
            return AbstractC3255y.d(this.f27344a, aVar.f27344a) && AbstractC3255y.d(this.f27345b, aVar.f27345b) && this.f27346c == aVar.f27346c && this.f27347d == aVar.f27347d && this.f27348e == aVar.f27348e && this.f27349f == aVar.f27349f;
        }

        public final int g() {
            return this.f27348e;
        }

        public final int h() {
            return this.f27346c;
        }

        public int hashCode() {
            int hashCode = this.f27344a.hashCode() * 31;
            Integer num = this.f27345b;
            return ((((((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f27346c) * 31) + this.f27347d) * 31) + this.f27348e) * 31) + this.f27349f;
        }

        public String toString() {
            return "Args(clientSecret=" + this.f27344a + ", statusBarColor=" + this.f27345b + ", timeLimitInSeconds=" + this.f27346c + ", initialDelayInSeconds=" + this.f27347d + ", maxAttempts=" + this.f27348e + ", ctaText=" + this.f27349f + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            int intValue;
            AbstractC3255y.i(out, "out");
            out.writeString(this.f27344a);
            Integer num = this.f27345b;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
            out.writeInt(this.f27346c);
            out.writeInt(this.f27347d);
            out.writeInt(this.f27348e);
            out.writeInt(this.f27349f);
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(input, "input");
        Intent putExtras = new Intent(context, (Class<?>) PollingActivity.class).putExtras(BundleKt.bundleOf(x.a("extra_args", input)));
        AbstractC3255y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2980c parseResult(int i8, Intent intent) {
        return C2980c.f32875h.b(intent);
    }
}
