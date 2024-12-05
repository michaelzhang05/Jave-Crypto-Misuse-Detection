package com.stripe.android.auth;

import O5.p;
import O5.x;
import W3.k;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import com.stripe.android.payments.StripeBrowserLauncherActivity;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import i3.C2978a;
import i3.C2980c;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class PaymentBrowserAuthContract extends ActivityResultContract<a, C2980c> {

    /* renamed from: a */
    public static final b f24504a = new b(null);

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final a a(Intent intent) {
            AbstractC3255y.i(intent, "intent");
            return (a) intent.getParcelableExtra("extra_args");
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a */
    public Intent createIntent(Context context, a input) {
        boolean z8;
        Class cls;
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(input, "input");
        C2978a a8 = C2978a.f32872b.a(context);
        if (!input.h() && (input.z(a8) || input.H())) {
            z8 = true;
        } else {
            z8 = false;
        }
        Bundle J8 = input.J();
        if (z8) {
            cls = StripeBrowserLauncherActivity.class;
        } else if (!z8) {
            cls = PaymentAuthWebViewActivity.class;
        } else {
            throw new p();
        }
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.putExtras(J8);
        return intent;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b */
    public C2980c parseResult(int i8, Intent intent) {
        C2980c c2980c;
        if (intent != null) {
            c2980c = (C2980c) intent.getParcelableExtra("extra_args");
        } else {
            c2980c = null;
        }
        if (c2980c == null) {
            return new C2980c(null, 0, null, false, null, null, null, 127, null);
        }
        return c2980c;
    }

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {
        public static final C0447a CREATOR = new C0447a(null);

        /* renamed from: p */
        public static final int f24505p = 8;

        /* renamed from: a */
        private final String f24506a;

        /* renamed from: b */
        private final int f24507b;

        /* renamed from: c */
        private final String f24508c;

        /* renamed from: d */
        private final String f24509d;

        /* renamed from: e */
        private final String f24510e;

        /* renamed from: f */
        private final boolean f24511f;

        /* renamed from: g */
        private final k f24512g;

        /* renamed from: h */
        private final String f24513h;

        /* renamed from: i */
        private final boolean f24514i;

        /* renamed from: j */
        private final boolean f24515j;

        /* renamed from: k */
        private final Integer f24516k;

        /* renamed from: l */
        private final String f24517l;

        /* renamed from: m */
        private final boolean f24518m;

        /* renamed from: n */
        private final String f24519n;

        /* renamed from: o */
        private final boolean f24520o;

        /* renamed from: com.stripe.android.auth.PaymentBrowserAuthContract$a$a */
        /* loaded from: classes4.dex */
        public static final class C0447a implements Parcelable.Creator {
            private C0447a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public a[] newArray(int i8) {
                return new a[i8];
            }

            public /* synthetic */ C0447a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        public a(String objectId, int i8, String clientSecret, String url, String str, boolean z8, k kVar, String str2, boolean z9, boolean z10, Integer num, String publishableKey, boolean z11, String str3, boolean z12) {
            AbstractC3255y.i(objectId, "objectId");
            AbstractC3255y.i(clientSecret, "clientSecret");
            AbstractC3255y.i(url, "url");
            AbstractC3255y.i(publishableKey, "publishableKey");
            this.f24506a = objectId;
            this.f24507b = i8;
            this.f24508c = clientSecret;
            this.f24509d = url;
            this.f24510e = str;
            this.f24511f = z8;
            this.f24512g = kVar;
            this.f24513h = str2;
            this.f24514i = z9;
            this.f24515j = z10;
            this.f24516k = num;
            this.f24517l = publishableKey;
            this.f24518m = z11;
            this.f24519n = str3;
            this.f24520o = z12;
        }

        public static /* synthetic */ a b(a aVar, String str, int i8, String str2, String str3, String str4, boolean z8, k kVar, String str5, boolean z9, boolean z10, Integer num, String str6, boolean z11, String str7, boolean z12, int i9, Object obj) {
            return aVar.a((i9 & 1) != 0 ? aVar.f24506a : str, (i9 & 2) != 0 ? aVar.f24507b : i8, (i9 & 4) != 0 ? aVar.f24508c : str2, (i9 & 8) != 0 ? aVar.f24509d : str3, (i9 & 16) != 0 ? aVar.f24510e : str4, (i9 & 32) != 0 ? aVar.f24511f : z8, (i9 & 64) != 0 ? aVar.f24512g : kVar, (i9 & 128) != 0 ? aVar.f24513h : str5, (i9 & 256) != 0 ? aVar.f24514i : z9, (i9 & 512) != 0 ? aVar.f24515j : z10, (i9 & 1024) != 0 ? aVar.f24516k : num, (i9 & 2048) != 0 ? aVar.f24517l : str6, (i9 & 4096) != 0 ? aVar.f24518m : z11, (i9 & 8192) != 0 ? aVar.f24519n : str7, (i9 & 16384) != 0 ? aVar.f24520o : z12);
        }

        public final String A() {
            return this.f24510e;
        }

        public final boolean H() {
            return this.f24518m;
        }

        public final Bundle J() {
            return BundleKt.bundleOf(x.a("extra_args", this));
        }

        public final a a(String objectId, int i8, String clientSecret, String url, String str, boolean z8, k kVar, String str2, boolean z9, boolean z10, Integer num, String publishableKey, boolean z11, String str3, boolean z12) {
            AbstractC3255y.i(objectId, "objectId");
            AbstractC3255y.i(clientSecret, "clientSecret");
            AbstractC3255y.i(url, "url");
            AbstractC3255y.i(publishableKey, "publishableKey");
            return new a(objectId, i8, clientSecret, url, str, z8, kVar, str2, z9, z10, num, publishableKey, z11, str3, z12);
        }

        public final String d() {
            return this.f24508c;
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
            return AbstractC3255y.d(this.f24506a, aVar.f24506a) && this.f24507b == aVar.f24507b && AbstractC3255y.d(this.f24508c, aVar.f24508c) && AbstractC3255y.d(this.f24509d, aVar.f24509d) && AbstractC3255y.d(this.f24510e, aVar.f24510e) && this.f24511f == aVar.f24511f && AbstractC3255y.d(this.f24512g, aVar.f24512g) && AbstractC3255y.d(this.f24513h, aVar.f24513h) && this.f24514i == aVar.f24514i && this.f24515j == aVar.f24515j && AbstractC3255y.d(this.f24516k, aVar.f24516k) && AbstractC3255y.d(this.f24517l, aVar.f24517l) && this.f24518m == aVar.f24518m && AbstractC3255y.d(this.f24519n, aVar.f24519n) && this.f24520o == aVar.f24520o;
        }

        public final boolean g() {
            return this.f24511f;
        }

        public final boolean h() {
            return this.f24520o;
        }

        public int hashCode() {
            int hashCode = ((((((this.f24506a.hashCode() * 31) + this.f24507b) * 31) + this.f24508c.hashCode()) * 31) + this.f24509d.hashCode()) * 31;
            String str = this.f24510e;
            int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f24511f)) * 31;
            k kVar = this.f24512g;
            int hashCode3 = (hashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
            String str2 = this.f24513h;
            int hashCode4 = (((((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f24514i)) * 31) + androidx.compose.foundation.a.a(this.f24515j)) * 31;
            Integer num = this.f24516k;
            int hashCode5 = (((((hashCode4 + (num == null ? 0 : num.hashCode())) * 31) + this.f24517l.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f24518m)) * 31;
            String str3 = this.f24519n;
            return ((hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31) + androidx.compose.foundation.a.a(this.f24520o);
        }

        public final String i() {
            return this.f24517l;
        }

        public final String l() {
            return this.f24519n;
        }

        public final int p() {
            return this.f24507b;
        }

        public final boolean s() {
            return this.f24515j;
        }

        public String toString() {
            return "Args(objectId=" + this.f24506a + ", requestCode=" + this.f24507b + ", clientSecret=" + this.f24508c + ", url=" + this.f24509d + ", returnUrl=" + this.f24510e + ", enableLogging=" + this.f24511f + ", toolbarCustomization=" + this.f24512g + ", stripeAccountId=" + this.f24513h + ", shouldCancelSource=" + this.f24514i + ", shouldCancelIntentOnUserNavigation=" + this.f24515j + ", statusBarColor=" + this.f24516k + ", publishableKey=" + this.f24517l + ", isInstantApp=" + this.f24518m + ", referrer=" + this.f24519n + ", forceInAppWebView=" + this.f24520o + ")";
        }

        public final boolean u() {
            return this.f24514i;
        }

        public final Integer v() {
            return this.f24516k;
        }

        public final String w() {
            return this.f24513h;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            AbstractC3255y.i(parcel, "parcel");
            parcel.writeString(this.f24506a);
            parcel.writeInt(this.f24507b);
            parcel.writeString(this.f24508c);
            parcel.writeString(this.f24509d);
            parcel.writeString(this.f24510e);
            parcel.writeByte(this.f24511f ? (byte) 1 : (byte) 0);
            parcel.writeParcelable(this.f24512g, i8);
            parcel.writeString(this.f24513h);
            parcel.writeByte(this.f24514i ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f24515j ? (byte) 1 : (byte) 0);
            parcel.writeValue(this.f24516k);
            parcel.writeString(this.f24517l);
            parcel.writeByte(this.f24518m ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f24519n);
            parcel.writeByte(this.f24520o ? (byte) 1 : (byte) 0);
        }

        public final k x() {
            return this.f24512g;
        }

        public final String y() {
            return this.f24509d;
        }

        public final boolean z(C2978a defaultReturnUrl) {
            AbstractC3255y.i(defaultReturnUrl, "defaultReturnUrl");
            return AbstractC3255y.d(this.f24510e, defaultReturnUrl.a());
        }

        public /* synthetic */ a(String str, int i8, String str2, String str3, String str4, boolean z8, k kVar, String str5, boolean z9, boolean z10, Integer num, String str6, boolean z11, String str7, boolean z12, int i9, AbstractC3247p abstractC3247p) {
            this(str, i8, str2, str3, (i9 & 16) != 0 ? null : str4, (i9 & 32) != 0 ? false : z8, (i9 & 64) != 0 ? null : kVar, (i9 & 128) != 0 ? null : str5, (i9 & 256) != 0 ? false : z9, (i9 & 512) != 0 ? true : z10, num, str6, z11, (i9 & 8192) != 0 ? null : str7, (i9 & 16384) != 0 ? false : z12);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(android.os.Parcel r20) {
            /*
                r19 = this;
                r0 = r20
                java.lang.String r1 = "parcel"
                kotlin.jvm.internal.AbstractC3255y.i(r0, r1)
                java.lang.String r1 = r20.readString()
                java.lang.String r2 = ""
                if (r1 != 0) goto L11
                r4 = r2
                goto L12
            L11:
                r4 = r1
            L12:
                int r5 = r20.readInt()
                java.lang.String r1 = r20.readString()
                if (r1 != 0) goto L1e
                r6 = r2
                goto L1f
            L1e:
                r6 = r1
            L1f:
                java.lang.String r1 = r20.readString()
                if (r1 != 0) goto L27
                r7 = r2
                goto L28
            L27:
                r7 = r1
            L28:
                java.lang.String r8 = r20.readString()
                byte r1 = r20.readByte()
                r3 = 0
                r9 = 1
                if (r1 == 0) goto L36
                r1 = 1
                goto L37
            L36:
                r1 = 0
            L37:
                java.lang.Class<W3.k> r10 = W3.k.class
                java.lang.ClassLoader r10 = r10.getClassLoader()
                android.os.Parcelable r10 = r0.readParcelable(r10)
                W3.k r10 = (W3.k) r10
                java.lang.String r11 = r20.readString()
                byte r12 = r20.readByte()
                if (r12 == 0) goto L4f
                r12 = 1
                goto L50
            L4f:
                r12 = 0
            L50:
                byte r13 = r20.readByte()
                if (r13 == 0) goto L58
                r13 = 1
                goto L59
            L58:
                r13 = 0
            L59:
                java.lang.Class r14 = java.lang.Integer.TYPE
                java.lang.ClassLoader r14 = r14.getClassLoader()
                java.lang.Object r14 = r0.readValue(r14)
                boolean r15 = r14 instanceof java.lang.Integer
                if (r15 == 0) goto L6a
                java.lang.Integer r14 = (java.lang.Integer) r14
                goto L6b
            L6a:
                r14 = 0
            L6b:
                java.lang.String r15 = r20.readString()
                if (r15 != 0) goto L72
                r15 = r2
            L72:
                byte r2 = r20.readByte()
                if (r2 == 0) goto L7b
                r16 = 1
                goto L7d
            L7b:
                r16 = 0
            L7d:
                java.lang.String r17 = r20.readString()
                byte r0 = r20.readByte()
                if (r0 == 0) goto L8a
                r18 = 1
                goto L8c
            L8a:
                r18 = 0
            L8c:
                r3 = r19
                r9 = r1
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.auth.PaymentBrowserAuthContract.a.<init>(android.os.Parcel):void");
        }
    }
}
