package com.stripe.android.googlepaylauncher;

import O5.x;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import com.stripe.android.googlepaylauncher.f;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class GooglePayLauncherContract extends ActivityResultContract<a, f> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f24837a = new b(null);

    /* loaded from: classes4.dex */
    public static abstract class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        public static final C0464a f24838a = new C0464a(null);

        /* renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncherContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0464a {
            private C0464a() {
            }

            public final a a(Intent intent) {
                AbstractC3255y.i(intent, "intent");
                return (a) intent.getParcelableExtra("extra_args");
            }

            public /* synthetic */ C0464a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        private a() {
        }

        public abstract String a();

        public abstract e b();

        public final Bundle g() {
            return BundleKt.bundleOf(x.a("extra_args", this));
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
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
    public static final class c extends a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final String f24839b;

        /* renamed from: c, reason: collision with root package name */
        private final e f24840c;

        /* renamed from: d, reason: collision with root package name */
        private final String f24841d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new c(parcel.readString(), e.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String clientSecret, e config, String str) {
            super(null);
            AbstractC3255y.i(clientSecret, "clientSecret");
            AbstractC3255y.i(config, "config");
            this.f24839b = clientSecret;
            this.f24840c = config;
            this.f24841d = str;
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncherContract.a
        public String a() {
            return this.f24839b;
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncherContract.a
        public e b() {
            return this.f24840c;
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
            return AbstractC3255y.d(this.f24839b, cVar.f24839b) && AbstractC3255y.d(this.f24840c, cVar.f24840c) && AbstractC3255y.d(this.f24841d, cVar.f24841d);
        }

        public final String h() {
            return this.f24841d;
        }

        public int hashCode() {
            int hashCode = ((this.f24839b.hashCode() * 31) + this.f24840c.hashCode()) * 31;
            String str = this.f24841d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "PaymentIntentArgs(clientSecret=" + this.f24839b + ", config=" + this.f24840c + ", label=" + this.f24841d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f24839b);
            this.f24840c.writeToParcel(out, i8);
            out.writeString(this.f24841d);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final String f24842b;

        /* renamed from: c, reason: collision with root package name */
        private final e f24843c;

        /* renamed from: d, reason: collision with root package name */
        private final String f24844d;

        /* renamed from: e, reason: collision with root package name */
        private final Long f24845e;

        /* renamed from: f, reason: collision with root package name */
        private final String f24846f;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new d(parcel.readString(), e.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String clientSecret, e config, String currencyCode, Long l8, String str) {
            super(null);
            AbstractC3255y.i(clientSecret, "clientSecret");
            AbstractC3255y.i(config, "config");
            AbstractC3255y.i(currencyCode, "currencyCode");
            this.f24842b = clientSecret;
            this.f24843c = config;
            this.f24844d = currencyCode;
            this.f24845e = l8;
            this.f24846f = str;
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncherContract.a
        public String a() {
            return this.f24842b;
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncherContract.a
        public e b() {
            return this.f24843c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC3255y.d(this.f24842b, dVar.f24842b) && AbstractC3255y.d(this.f24843c, dVar.f24843c) && AbstractC3255y.d(this.f24844d, dVar.f24844d) && AbstractC3255y.d(this.f24845e, dVar.f24845e) && AbstractC3255y.d(this.f24846f, dVar.f24846f);
        }

        public final Long h() {
            return this.f24845e;
        }

        public int hashCode() {
            int hashCode = ((((this.f24842b.hashCode() * 31) + this.f24843c.hashCode()) * 31) + this.f24844d.hashCode()) * 31;
            Long l8 = this.f24845e;
            int hashCode2 = (hashCode + (l8 == null ? 0 : l8.hashCode())) * 31;
            String str = this.f24846f;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String i() {
            return this.f24844d;
        }

        public final String l() {
            return this.f24846f;
        }

        public String toString() {
            return "SetupIntentArgs(clientSecret=" + this.f24842b + ", config=" + this.f24843c + ", currencyCode=" + this.f24844d + ", amount=" + this.f24845e + ", label=" + this.f24846f + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f24842b);
            this.f24843c.writeToParcel(out, i8);
            out.writeString(this.f24844d);
            Long l8 = this.f24845e;
            if (l8 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeLong(l8.longValue());
            }
            out.writeString(this.f24846f);
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(input, "input");
        Intent putExtras = new Intent(context, (Class<?>) GooglePayLauncherActivity.class).putExtras(input.g());
        AbstractC3255y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f parseResult(int i8, Intent intent) {
        f fVar;
        if (intent != null) {
            fVar = (f) intent.getParcelableExtra("extra_result");
        } else {
            fVar = null;
        }
        if (fVar == null) {
            return new f.c(new IllegalStateException("Error while processing result from Google Pay."));
        }
        return fVar;
    }
}
