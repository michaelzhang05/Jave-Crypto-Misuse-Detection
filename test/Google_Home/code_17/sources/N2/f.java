package N2;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.p;
import e3.C2797k;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class f implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final C2797k.e f7681a;

    /* renamed from: b, reason: collision with root package name */
    private final p f7682b;

    /* loaded from: classes4.dex */
    public static final class a extends f {
        public static final Parcelable.Creator<a> CREATOR = new C0138a();

        /* renamed from: c, reason: collision with root package name */
        private final C2797k.e f7683c;

        /* renamed from: d, reason: collision with root package name */
        private final p f7684d;

        /* renamed from: e, reason: collision with root package name */
        private final p f7685e;

        /* renamed from: N2.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0138a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new a((C2797k.e) parcel.readParcelable(a.class.getClassLoader()), (p) parcel.readParcelable(a.class.getClassLoader()), (p) parcel.readParcelable(a.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2797k.e paymentDetails, p paymentMethodCreateParams, p originalParams) {
            super(paymentDetails, paymentMethodCreateParams, null);
            AbstractC3255y.i(paymentDetails, "paymentDetails");
            AbstractC3255y.i(paymentMethodCreateParams, "paymentMethodCreateParams");
            AbstractC3255y.i(originalParams, "originalParams");
            this.f7683c = paymentDetails;
            this.f7684d = paymentMethodCreateParams;
            this.f7685e = originalParams;
        }

        @Override // N2.f
        public C2797k.e a() {
            return this.f7683c;
        }

        @Override // N2.f
        public p b() {
            return this.f7684d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeParcelable(this.f7683c, i8);
            out.writeParcelable(this.f7684d, i8);
            out.writeParcelable(this.f7685e, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends f {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        private final C2797k.e f7686c;

        /* renamed from: d, reason: collision with root package name */
        private final p f7687d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new b((C2797k.e) parcel.readParcelable(b.class.getClassLoader()), (p) parcel.readParcelable(b.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C2797k.e paymentDetails, p paymentMethodCreateParams) {
            super(paymentDetails, paymentMethodCreateParams, null);
            AbstractC3255y.i(paymentDetails, "paymentDetails");
            AbstractC3255y.i(paymentMethodCreateParams, "paymentMethodCreateParams");
            this.f7686c = paymentDetails;
            this.f7687d = paymentMethodCreateParams;
        }

        @Override // N2.f
        public C2797k.e a() {
            return this.f7686c;
        }

        @Override // N2.f
        public p b() {
            return this.f7687d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeParcelable(this.f7686c, i8);
            out.writeParcelable(this.f7687d, i8);
        }
    }

    public /* synthetic */ f(C2797k.e eVar, p pVar, AbstractC3247p abstractC3247p) {
        this(eVar, pVar);
    }

    public abstract C2797k.e a();

    public abstract p b();

    private f(C2797k.e eVar, p pVar) {
        this.f7681a = eVar;
        this.f7682b = pVar;
    }
}
