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

@StabilityInferred(parameters = 0)
@t6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: e4.a0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2598a0 extends AbstractC2608f0 {
    public static final C2598a0 INSTANCE = new C2598a0();

    /* renamed from: a, reason: collision with root package name */
    private static final m4.G f30642a = m4.G.Companion.a("empty");

    /* renamed from: b, reason: collision with root package name */
    public static final int f30643b = m4.G.f35073d;
    public static final Parcelable.Creator<C2598a0> CREATOR = new b();

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC1227k f30644c = L5.l.a(L5.o.f6505b, a.f30645a);

    /* renamed from: e4.a0$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30645a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t6.b invoke() {
            return new C3936a0("com.stripe.android.ui.core.elements.EmptyFormSpec", C2598a0.INSTANCE, new Annotation[0]);
        }
    }

    /* renamed from: e4.a0$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2598a0 createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            parcel.readInt();
            return C2598a0.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2598a0[] newArray(int i8) {
            return new C2598a0[i8];
        }
    }

    private C2598a0() {
        super(null);
    }

    private final /* synthetic */ t6.b f() {
        return (t6.b) f30644c.getValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj || (obj instanceof C2598a0)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 780162941;
    }

    public final t6.b serializer() {
        return f();
    }

    public String toString() {
        return "EmptyFormSpec";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeInt(1);
    }
}
