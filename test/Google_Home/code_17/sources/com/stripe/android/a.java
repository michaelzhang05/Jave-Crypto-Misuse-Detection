package com.stripe.android;

import O5.p;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResultLauncher;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.stripe.android.model.Source;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.model.u;
import com.stripe.android.view.InterfaceC2656o;
import com.stripe.android.view.InterfaceC2658p;
import com.stripe.android.view.PaymentRelayActivity;
import i3.C2980c;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import w2.AbstractC4144k;

/* loaded from: classes4.dex */
public interface a extends InterfaceC2656o {

    /* renamed from: com.stripe.android.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC0440a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        public static final C0441a f24491a = new C0441a(null);

        /* renamed from: com.stripe.android.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0441a {
            private C0441a() {
            }

            public final AbstractC0440a a(StripeIntent stripeIntent, String str) {
                AbstractC3255y.i(stripeIntent, "stripeIntent");
                if (stripeIntent instanceof n) {
                    return new c((n) stripeIntent, str);
                }
                if (stripeIntent instanceof u) {
                    return new d((u) stripeIntent, str);
                }
                throw new p();
            }

            public /* synthetic */ C0441a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* renamed from: com.stripe.android.a$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC0440a {

            /* renamed from: b, reason: collision with root package name */
            private final AbstractC4144k f24494b;

            /* renamed from: c, reason: collision with root package name */
            private final int f24495c;

            /* renamed from: d, reason: collision with root package name */
            public static final C0442a f24492d = new C0442a(null);

            /* renamed from: e, reason: collision with root package name */
            public static final int f24493e = 8;
            public static final Parcelable.Creator<b> CREATOR = new C0443b();

            /* renamed from: com.stripe.android.a$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0442a {
                private C0442a() {
                }

                public b a(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    Serializable readSerializable = parcel.readSerializable();
                    AbstractC3255y.g(readSerializable, "null cannot be cast to non-null type com.stripe.android.core.exception.StripeException");
                    return new b((AbstractC4144k) readSerializable, parcel.readInt());
                }

                public void b(b bVar, Parcel parcel, int i8) {
                    AbstractC3255y.i(bVar, "<this>");
                    AbstractC3255y.i(parcel, "parcel");
                    parcel.writeSerializable(bVar.g());
                    parcel.writeInt(bVar.a());
                }

                public /* synthetic */ C0442a(AbstractC3247p abstractC3247p) {
                    this();
                }
            }

            /* renamed from: com.stripe.android.a$a$b$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0443b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return b.f24492d.a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AbstractC4144k exception, int i8) {
                super(null);
                AbstractC3255y.i(exception, "exception");
                this.f24494b = exception;
                this.f24495c = i8;
            }

            @Override // com.stripe.android.a.AbstractC0440a
            public int a() {
                return this.f24495c;
            }

            @Override // com.stripe.android.a.AbstractC0440a
            public C2980c b() {
                return new C2980c(null, 0, this.f24494b, false, null, null, null, 123, null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return AbstractC3255y.d(this.f24494b, bVar.f24494b) && this.f24495c == bVar.f24495c;
            }

            public final AbstractC4144k g() {
                return this.f24494b;
            }

            public int hashCode() {
                return (this.f24494b.hashCode() * 31) + this.f24495c;
            }

            public String toString() {
                return "ErrorArgs(exception=" + this.f24494b + ", requestCode=" + this.f24495c + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                f24492d.b(this, out, i8);
            }
        }

        /* renamed from: com.stripe.android.a$a$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC0440a {
            public static final Parcelable.Creator<c> CREATOR = new C0444a();

            /* renamed from: b, reason: collision with root package name */
            private final n f24496b;

            /* renamed from: c, reason: collision with root package name */
            private final String f24497c;

            /* renamed from: com.stripe.android.a$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0444a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new c(n.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(n paymentIntent, String str) {
                super(null);
                AbstractC3255y.i(paymentIntent, "paymentIntent");
                this.f24496b = paymentIntent;
                this.f24497c = str;
            }

            @Override // com.stripe.android.a.AbstractC0440a
            public int a() {
                return DefaultLoadControl.DEFAULT_MAX_BUFFER_MS;
            }

            @Override // com.stripe.android.a.AbstractC0440a
            public C2980c b() {
                return new C2980c(this.f24496b.d(), 0, null, false, null, null, this.f24497c, 62, null);
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
                return AbstractC3255y.d(this.f24496b, cVar.f24496b) && AbstractC3255y.d(this.f24497c, cVar.f24497c);
            }

            public int hashCode() {
                int hashCode = this.f24496b.hashCode() * 31;
                String str = this.f24497c;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "PaymentIntentArgs(paymentIntent=" + this.f24496b + ", stripeAccountId=" + this.f24497c + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                this.f24496b.writeToParcel(out, i8);
                out.writeString(this.f24497c);
            }
        }

        /* renamed from: com.stripe.android.a$a$d */
        /* loaded from: classes4.dex */
        public static final class d extends AbstractC0440a {
            public static final Parcelable.Creator<d> CREATOR = new C0445a();

            /* renamed from: b, reason: collision with root package name */
            private final u f24498b;

            /* renamed from: c, reason: collision with root package name */
            private final String f24499c;

            /* renamed from: com.stripe.android.a$a$d$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0445a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new d(u.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final d[] newArray(int i8) {
                    return new d[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(u setupIntent, String str) {
                super(null);
                AbstractC3255y.i(setupIntent, "setupIntent");
                this.f24498b = setupIntent;
                this.f24499c = str;
            }

            @Override // com.stripe.android.a.AbstractC0440a
            public int a() {
                return 50001;
            }

            @Override // com.stripe.android.a.AbstractC0440a
            public C2980c b() {
                return new C2980c(this.f24498b.d(), 0, null, false, null, null, this.f24499c, 62, null);
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
                return AbstractC3255y.d(this.f24498b, dVar.f24498b) && AbstractC3255y.d(this.f24499c, dVar.f24499c);
            }

            public int hashCode() {
                int hashCode = this.f24498b.hashCode() * 31;
                String str = this.f24499c;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "SetupIntentArgs(setupIntent=" + this.f24498b + ", stripeAccountId=" + this.f24499c + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                this.f24498b.writeToParcel(out, i8);
                out.writeString(this.f24499c);
            }
        }

        /* renamed from: com.stripe.android.a$a$e */
        /* loaded from: classes4.dex */
        public static final class e extends AbstractC0440a {
            public static final Parcelable.Creator<e> CREATOR = new C0446a();

            /* renamed from: b, reason: collision with root package name */
            private final Source f24500b;

            /* renamed from: c, reason: collision with root package name */
            private final String f24501c;

            /* renamed from: com.stripe.android.a$a$e$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0446a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new e(Source.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final e[] newArray(int i8) {
                    return new e[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Source source, String str) {
                super(null);
                AbstractC3255y.i(source, "source");
                this.f24500b = source;
                this.f24501c = str;
            }

            @Override // com.stripe.android.a.AbstractC0440a
            public int a() {
                return 50002;
            }

            @Override // com.stripe.android.a.AbstractC0440a
            public C2980c b() {
                return new C2980c(null, 0, null, false, null, this.f24500b, this.f24501c, 31, null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return AbstractC3255y.d(this.f24500b, eVar.f24500b) && AbstractC3255y.d(this.f24501c, eVar.f24501c);
            }

            public int hashCode() {
                int hashCode = this.f24500b.hashCode() * 31;
                String str = this.f24501c;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "SourceArgs(source=" + this.f24500b + ", stripeAccountId=" + this.f24501c + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                this.f24500b.writeToParcel(out, i8);
                out.writeString(this.f24501c);
            }
        }

        private AbstractC0440a() {
        }

        public abstract int a();

        public abstract C2980c b();

        public /* synthetic */ AbstractC0440a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC2658p f24502a;

        public b(InterfaceC2658p host) {
            AbstractC3255y.i(host, "host");
            this.f24502a = host;
        }

        @Override // com.stripe.android.view.InterfaceC2656o
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC0440a args) {
            AbstractC3255y.i(args, "args");
            this.f24502a.b(PaymentRelayActivity.class, args.b().u(), args.a());
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        private final ActivityResultLauncher f24503a;

        public c(ActivityResultLauncher launcher) {
            AbstractC3255y.i(launcher, "launcher");
            this.f24503a = launcher;
        }

        @Override // com.stripe.android.view.InterfaceC2656o
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC0440a args) {
            AbstractC3255y.i(args, "args");
            this.f24503a.launch(args);
        }
    }
}
