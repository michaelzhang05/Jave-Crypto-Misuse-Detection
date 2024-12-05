package h4;

import A6.C0977a0;
import O5.InterfaceC1355k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

@StabilityInferred(parameters = 0)
@w6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: h4.a0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2918a0 extends AbstractC2928f0 {
    public static final C2918a0 INSTANCE = new C2918a0();

    /* renamed from: a, reason: collision with root package name */
    private static final p4.G f32563a = p4.G.Companion.a("empty");

    /* renamed from: b, reason: collision with root package name */
    public static final int f32564b = p4.G.f37099d;
    public static final Parcelable.Creator<C2918a0> CREATOR = new b();

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC1355k f32565c = O5.l.a(O5.o.f8296b, a.f32566a);

    /* renamed from: h4.a0$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32566a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w6.b invoke() {
            return new C0977a0("com.stripe.android.ui.core.elements.EmptyFormSpec", C2918a0.INSTANCE, new Annotation[0]);
        }
    }

    /* renamed from: h4.a0$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2918a0 createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            parcel.readInt();
            return C2918a0.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2918a0[] newArray(int i8) {
            return new C2918a0[i8];
        }
    }

    private C2918a0() {
        super(null);
    }

    private final /* synthetic */ w6.b h() {
        return (w6.b) f32565c.getValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj || (obj instanceof C2918a0)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 780162941;
    }

    public final w6.b serializer() {
        return h();
    }

    public String toString() {
        return "EmptyFormSpec";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeInt(1);
    }
}
