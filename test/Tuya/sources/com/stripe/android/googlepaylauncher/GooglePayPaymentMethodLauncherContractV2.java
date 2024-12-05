package com.stripe.android.googlepaylauncher;

import L5.x;
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
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 1)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class GooglePayPaymentMethodLauncherContractV2 extends ActivityResultContract<a, h.f> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f23826a = new b(null);

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(input, "input");
        Intent putExtras = new Intent(context, (Class<?>) GooglePayPaymentMethodLauncherActivity.class).putExtras(input.j());
        AbstractC3159y.h(putExtras, "putExtras(...)");
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
        private final h.d f23829a;

        /* renamed from: b, reason: collision with root package name */
        private final String f23830b;

        /* renamed from: c, reason: collision with root package name */
        private final long f23831c;

        /* renamed from: d, reason: collision with root package name */
        private final String f23832d;

        /* renamed from: e, reason: collision with root package name */
        private final String f23833e;

        /* renamed from: f, reason: collision with root package name */
        public static final C0471a f23827f = new C0471a(null);

        /* renamed from: g, reason: collision with root package name */
        public static final int f23828g = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0471a {
            private C0471a() {
            }

            public final a a(Intent intent) {
                AbstractC3159y.i(intent, "intent");
                return (a) intent.getParcelableExtra("extra_args");
            }

            public /* synthetic */ C0471a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a(h.d.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(h.d config, String currencyCode, long j8, String str, String str2) {
            AbstractC3159y.i(config, "config");
            AbstractC3159y.i(currencyCode, "currencyCode");
            this.f23829a = config;
            this.f23830b = currencyCode;
            this.f23831c = j8;
            this.f23832d = str;
            this.f23833e = str2;
        }

        public final long b() {
            return this.f23831c;
        }

        public final h.d c() {
            return this.f23829a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f23830b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3159y.d(this.f23829a, aVar.f23829a) && AbstractC3159y.d(this.f23830b, aVar.f23830b) && this.f23831c == aVar.f23831c && AbstractC3159y.d(this.f23832d, aVar.f23832d) && AbstractC3159y.d(this.f23833e, aVar.f23833e);
        }

        public final String f() {
            return this.f23832d;
        }

        public int hashCode() {
            int hashCode = ((((this.f23829a.hashCode() * 31) + this.f23830b.hashCode()) * 31) + androidx.collection.a.a(this.f23831c)) * 31;
            String str = this.f23832d;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f23833e;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String i() {
            return this.f23833e;
        }

        public final Bundle j() {
            return BundleKt.bundleOf(x.a("extra_args", this));
        }

        public String toString() {
            return "Args(config=" + this.f23829a + ", currencyCode=" + this.f23830b + ", amount=" + this.f23831c + ", label=" + this.f23832d + ", transactionId=" + this.f23833e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            this.f23829a.writeToParcel(out, i8);
            out.writeString(this.f23830b);
            out.writeLong(this.f23831c);
            out.writeString(this.f23832d);
            out.writeString(this.f23833e);
        }

        public /* synthetic */ a(h.d dVar, String str, long j8, String str2, String str3, int i8, AbstractC3151p abstractC3151p) {
            this(dVar, str, j8, (i8 & 8) != 0 ? null : str2, (i8 & 16) != 0 ? null : str3);
        }
    }
}
