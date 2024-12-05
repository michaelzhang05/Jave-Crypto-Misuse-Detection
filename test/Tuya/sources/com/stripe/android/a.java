package com.stripe.android;

import L5.p;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResultLauncher;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.stripe.android.model.Source;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.model.u;
import com.stripe.android.view.InterfaceC2462o;
import com.stripe.android.view.InterfaceC2464p;
import com.stripe.android.view.PaymentRelayActivity;
import f3.C2662c;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import t2.AbstractC3790k;

/* loaded from: classes4.dex */
public interface a extends InterfaceC2462o {

    /* renamed from: com.stripe.android.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC0444a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        public static final C0445a f23436a = new C0445a(null);

        /* renamed from: com.stripe.android.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0445a {
            private C0445a() {
            }

            public final AbstractC0444a a(StripeIntent stripeIntent, String str) {
                AbstractC3159y.i(stripeIntent, "stripeIntent");
                if (stripeIntent instanceof n) {
                    return new c((n) stripeIntent, str);
                }
                if (stripeIntent instanceof u) {
                    return new d((u) stripeIntent, str);
                }
                throw new p();
            }

            public /* synthetic */ C0445a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* renamed from: com.stripe.android.a$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC0444a {

            /* renamed from: b, reason: collision with root package name */
            private final AbstractC3790k f23439b;

            /* renamed from: c, reason: collision with root package name */
            private final int f23440c;

            /* renamed from: d, reason: collision with root package name */
            public static final C0446a f23437d = new C0446a(null);

            /* renamed from: e, reason: collision with root package name */
            public static final int f23438e = 8;
            public static final Parcelable.Creator<b> CREATOR = new C0447b();

            /* renamed from: com.stripe.android.a$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0446a {
                private C0446a() {
                }

                public b a(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    Serializable readSerializable = parcel.readSerializable();
                    AbstractC3159y.g(readSerializable, "null cannot be cast to non-null type com.stripe.android.core.exception.StripeException");
                    return new b((AbstractC3790k) readSerializable, parcel.readInt());
                }

                public void b(b bVar, Parcel parcel, int i8) {
                    AbstractC3159y.i(bVar, "<this>");
                    AbstractC3159y.i(parcel, "parcel");
                    parcel.writeSerializable(bVar.e());
                    parcel.writeInt(bVar.b());
                }

                public /* synthetic */ C0446a(AbstractC3151p abstractC3151p) {
                    this();
                }
            }

            /* renamed from: com.stripe.android.a$a$b$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0447b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return b.f23437d.a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AbstractC3790k exception, int i8) {
                super(null);
                AbstractC3159y.i(exception, "exception");
                this.f23439b = exception;
                this.f23440c = i8;
            }

            @Override // com.stripe.android.a.AbstractC0444a
            public int b() {
                return this.f23440c;
            }

            @Override // com.stripe.android.a.AbstractC0444a
            public C2662c c() {
                return new C2662c(null, 0, this.f23439b, false, null, null, null, 123, null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final AbstractC3790k e() {
                return this.f23439b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return AbstractC3159y.d(this.f23439b, bVar.f23439b) && this.f23440c == bVar.f23440c;
            }

            public int hashCode() {
                return (this.f23439b.hashCode() * 31) + this.f23440c;
            }

            public String toString() {
                return "ErrorArgs(exception=" + this.f23439b + ", requestCode=" + this.f23440c + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                f23437d.b(this, out, i8);
            }
        }

        /* renamed from: com.stripe.android.a$a$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC0444a {
            public static final Parcelable.Creator<c> CREATOR = new C0448a();

            /* renamed from: b, reason: collision with root package name */
            private final n f23441b;

            /* renamed from: c, reason: collision with root package name */
            private final String f23442c;

            /* renamed from: com.stripe.android.a$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0448a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
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
                AbstractC3159y.i(paymentIntent, "paymentIntent");
                this.f23441b = paymentIntent;
                this.f23442c = str;
            }

            @Override // com.stripe.android.a.AbstractC0444a
            public int b() {
                return DefaultLoadControl.DEFAULT_MAX_BUFFER_MS;
            }

            @Override // com.stripe.android.a.AbstractC0444a
            public C2662c c() {
                return new C2662c(this.f23441b.d(), 0, null, false, null, null, this.f23442c, 62, null);
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
                return AbstractC3159y.d(this.f23441b, cVar.f23441b) && AbstractC3159y.d(this.f23442c, cVar.f23442c);
            }

            public int hashCode() {
                int hashCode = this.f23441b.hashCode() * 31;
                String str = this.f23442c;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "PaymentIntentArgs(paymentIntent=" + this.f23441b + ", stripeAccountId=" + this.f23442c + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                this.f23441b.writeToParcel(out, i8);
                out.writeString(this.f23442c);
            }
        }

        /* renamed from: com.stripe.android.a$a$d */
        /* loaded from: classes4.dex */
        public static final class d extends AbstractC0444a {
            public static final Parcelable.Creator<d> CREATOR = new C0449a();

            /* renamed from: b, reason: collision with root package name */
            private final u f23443b;

            /* renamed from: c, reason: collision with root package name */
            private final String f23444c;

            /* renamed from: com.stripe.android.a$a$d$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0449a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
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
                AbstractC3159y.i(setupIntent, "setupIntent");
                this.f23443b = setupIntent;
                this.f23444c = str;
            }

            @Override // com.stripe.android.a.AbstractC0444a
            public int b() {
                return 50001;
            }

            @Override // com.stripe.android.a.AbstractC0444a
            public C2662c c() {
                return new C2662c(this.f23443b.d(), 0, null, false, null, null, this.f23444c, 62, null);
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
                return AbstractC3159y.d(this.f23443b, dVar.f23443b) && AbstractC3159y.d(this.f23444c, dVar.f23444c);
            }

            public int hashCode() {
                int hashCode = this.f23443b.hashCode() * 31;
                String str = this.f23444c;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "SetupIntentArgs(setupIntent=" + this.f23443b + ", stripeAccountId=" + this.f23444c + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                this.f23443b.writeToParcel(out, i8);
                out.writeString(this.f23444c);
            }
        }

        /* renamed from: com.stripe.android.a$a$e */
        /* loaded from: classes4.dex */
        public static final class e extends AbstractC0444a {
            public static final Parcelable.Creator<e> CREATOR = new C0450a();

            /* renamed from: b, reason: collision with root package name */
            private final Source f23445b;

            /* renamed from: c, reason: collision with root package name */
            private final String f23446c;

            /* renamed from: com.stripe.android.a$a$e$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0450a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
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
                AbstractC3159y.i(source, "source");
                this.f23445b = source;
                this.f23446c = str;
            }

            @Override // com.stripe.android.a.AbstractC0444a
            public int b() {
                return 50002;
            }

            @Override // com.stripe.android.a.AbstractC0444a
            public C2662c c() {
                return new C2662c(null, 0, null, false, null, this.f23445b, this.f23446c, 31, null);
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
                return AbstractC3159y.d(this.f23445b, eVar.f23445b) && AbstractC3159y.d(this.f23446c, eVar.f23446c);
            }

            public int hashCode() {
                int hashCode = this.f23445b.hashCode() * 31;
                String str = this.f23446c;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "SourceArgs(source=" + this.f23445b + ", stripeAccountId=" + this.f23446c + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                this.f23445b.writeToParcel(out, i8);
                out.writeString(this.f23446c);
            }
        }

        private AbstractC0444a() {
        }

        public abstract int b();

        public abstract C2662c c();

        public /* synthetic */ AbstractC0444a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC2464p f23447a;

        public b(InterfaceC2464p host) {
            AbstractC3159y.i(host, "host");
            this.f23447a = host;
        }

        @Override // com.stripe.android.view.InterfaceC2462o
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC0444a args) {
            AbstractC3159y.i(args, "args");
            this.f23447a.a(PaymentRelayActivity.class, args.c().o(), args.b());
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        private final ActivityResultLauncher f23448a;

        public c(ActivityResultLauncher launcher) {
            AbstractC3159y.i(launcher, "launcher");
            this.f23448a = launcher;
        }

        @Override // com.stripe.android.view.InterfaceC2462o
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC0444a args) {
            AbstractC3159y.i(args, "args");
            this.f23448a.launch(args);
        }
    }
}
