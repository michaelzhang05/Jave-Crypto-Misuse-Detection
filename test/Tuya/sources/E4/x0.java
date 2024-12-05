package e4;

import L5.InterfaceC1227k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import x6.C3936a0;

@StabilityInferred(parameters = 1)
@t6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class x0 extends AbstractC2608f0 {
    public static final x0 INSTANCE = new x0();
    public static final Parcelable.Creator<x0> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC1227k f30878a = L5.l.a(L5.o.f6505b, a.f30879a);

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30879a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t6.b invoke() {
            return new C3936a0("com.stripe.android.ui.core.elements.OTPSpec", x0.INSTANCE, new Annotation[0]);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x0 createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            parcel.readInt();
            return x0.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final x0[] newArray(int i8) {
            return new x0[i8];
        }
    }

    private x0() {
        super(null);
    }

    private final /* synthetic */ t6.b f() {
        return (t6.b) f30878a.getValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj || (obj instanceof x0)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return -1061058889;
    }

    public m4.G i() {
        return m4.G.Companion.a("otp");
    }

    public final m4.L j() {
        return new m4.L(i(), new m4.K(0, 1, null));
    }

    public final t6.b serializer() {
        return f();
    }

    public String toString() {
        return "OTPSpec";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeInt(1);
    }
}
