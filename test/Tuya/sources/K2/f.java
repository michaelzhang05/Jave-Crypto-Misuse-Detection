package K2;

import android.os.Parcel;
import android.os.Parcelable;
import b3.C1876k;
import com.stripe.android.model.p;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class f implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final C1876k.e f5902a;

    /* renamed from: b, reason: collision with root package name */
    private final p f5903b;

    /* loaded from: classes4.dex */
    public static final class a extends f {
        public static final Parcelable.Creator<a> CREATOR = new C0113a();

        /* renamed from: c, reason: collision with root package name */
        private final C1876k.e f5904c;

        /* renamed from: d, reason: collision with root package name */
        private final p f5905d;

        /* renamed from: e, reason: collision with root package name */
        private final p f5906e;

        /* renamed from: K2.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0113a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a((C1876k.e) parcel.readParcelable(a.class.getClassLoader()), (p) parcel.readParcelable(a.class.getClassLoader()), (p) parcel.readParcelable(a.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1876k.e paymentDetails, p paymentMethodCreateParams, p originalParams) {
            super(paymentDetails, paymentMethodCreateParams, null);
            AbstractC3159y.i(paymentDetails, "paymentDetails");
            AbstractC3159y.i(paymentMethodCreateParams, "paymentMethodCreateParams");
            AbstractC3159y.i(originalParams, "originalParams");
            this.f5904c = paymentDetails;
            this.f5905d = paymentMethodCreateParams;
            this.f5906e = originalParams;
        }

        @Override // K2.f
        public C1876k.e b() {
            return this.f5904c;
        }

        @Override // K2.f
        public p c() {
            return this.f5905d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f5904c, i8);
            out.writeParcelable(this.f5905d, i8);
            out.writeParcelable(this.f5906e, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends f {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        private final C1876k.e f5907c;

        /* renamed from: d, reason: collision with root package name */
        private final p f5908d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new b((C1876k.e) parcel.readParcelable(b.class.getClassLoader()), (p) parcel.readParcelable(b.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C1876k.e paymentDetails, p paymentMethodCreateParams) {
            super(paymentDetails, paymentMethodCreateParams, null);
            AbstractC3159y.i(paymentDetails, "paymentDetails");
            AbstractC3159y.i(paymentMethodCreateParams, "paymentMethodCreateParams");
            this.f5907c = paymentDetails;
            this.f5908d = paymentMethodCreateParams;
        }

        @Override // K2.f
        public C1876k.e b() {
            return this.f5907c;
        }

        @Override // K2.f
        public p c() {
            return this.f5908d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f5907c, i8);
            out.writeParcelable(this.f5908d, i8);
        }
    }

    public /* synthetic */ f(C1876k.e eVar, p pVar, AbstractC3151p abstractC3151p) {
        this(eVar, pVar);
    }

    public abstract C1876k.e b();

    public abstract p c();

    private f(C1876k.e eVar, p pVar) {
        this.f5902a = eVar;
        this.f5903b = pVar;
    }
}
