package com.stripe.android.googlepaylauncher;

import O5.x;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import com.stripe.android.googlepaylauncher.h;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@StabilityInferred(parameters = 1)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class GooglePayPaymentMethodLauncherContractV2 extends ActivityResultContract<a, h.f> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f24881a = new b(null);

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
        Intent putExtras = new Intent(context, (Class<?>) GooglePayPaymentMethodLauncherActivity.class).putExtras(input.l());
        AbstractC3255y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public h.f parseResult(int i8, Intent intent) {
        h.f fVar;
        if (intent != null) {
            fVar = (h.f) intent.getParcelableExtra("extra_result");
        } else {
            fVar = null;
        }
        if (fVar == null) {
            return new h.f.c(new IllegalArgumentException("Could not parse a valid result."), 1);
        }
        return fVar;
    }

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final h.d f24884a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24885b;

        /* renamed from: c, reason: collision with root package name */
        private final long f24886c;

        /* renamed from: d, reason: collision with root package name */
        private final String f24887d;

        /* renamed from: e, reason: collision with root package name */
        private final String f24888e;

        /* renamed from: f, reason: collision with root package name */
        public static final C0467a f24882f = new C0467a(null);

        /* renamed from: g, reason: collision with root package name */
        public static final int f24883g = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0467a {
            private C0467a() {
            }

            public final a a(Intent intent) {
                AbstractC3255y.i(intent, "intent");
                return (a) intent.getParcelableExtra("extra_args");
            }

            public /* synthetic */ C0467a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new a(h.d.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(h.d config, String currencyCode, long j8, String str, String str2) {
            AbstractC3255y.i(config, "config");
            AbstractC3255y.i(currencyCode, "currencyCode");
            this.f24884a = config;
            this.f24885b = currencyCode;
            this.f24886c = j8;
            this.f24887d = str;
            this.f24888e = str2;
        }

        public final long a() {
            return this.f24886c;
        }

        public final h.d b() {
            return this.f24884a;
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
            return AbstractC3255y.d(this.f24884a, aVar.f24884a) && AbstractC3255y.d(this.f24885b, aVar.f24885b) && this.f24886c == aVar.f24886c && AbstractC3255y.d(this.f24887d, aVar.f24887d) && AbstractC3255y.d(this.f24888e, aVar.f24888e);
        }

        public final String g() {
            return this.f24885b;
        }

        public final String h() {
            return this.f24887d;
        }

        public int hashCode() {
            int hashCode = ((((this.f24884a.hashCode() * 31) + this.f24885b.hashCode()) * 31) + androidx.collection.a.a(this.f24886c)) * 31;
            String str = this.f24887d;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f24888e;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String i() {
            return this.f24888e;
        }

        public final Bundle l() {
            return BundleKt.bundleOf(x.a("extra_args", this));
        }

        public String toString() {
            return "Args(config=" + this.f24884a + ", currencyCode=" + this.f24885b + ", amount=" + this.f24886c + ", label=" + this.f24887d + ", transactionId=" + this.f24888e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            this.f24884a.writeToParcel(out, i8);
            out.writeString(this.f24885b);
            out.writeLong(this.f24886c);
            out.writeString(this.f24887d);
            out.writeString(this.f24888e);
        }

        public /* synthetic */ a(h.d dVar, String str, long j8, String str2, String str3, int i8, AbstractC3247p abstractC3247p) {
            this(dVar, str, j8, (i8 & 8) != 0 ? null : str2, (i8 & 16) != 0 ? null : str3);
        }
    }
}
