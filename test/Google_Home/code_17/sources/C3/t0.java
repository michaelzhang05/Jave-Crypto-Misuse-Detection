package c3;

import b3.C1970d;
import b3.EnumC1967a;
import b3.InterfaceC1968b;
import b3.InterfaceC1974h;
import com.stripe.android.model.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class t0 implements InterfaceC1968b {

    /* renamed from: a, reason: collision with root package name */
    public static final t0 f15700a = new t0();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f15701b = o.p.f25577O;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f15702c = true;

    private t0() {
    }

    @Override // b3.InterfaceC1968b
    public Set a(boolean z8) {
        return P5.a0.i(EnumC1967a.f15311e, EnumC1967a.f15312f, EnumC1967a.f15310d);
    }

    @Override // b3.InterfaceC1968b
    public InterfaceC1974h b() {
        return u0.f15706a;
    }

    @Override // b3.InterfaceC1968b
    public boolean c(C1970d metadata) {
        AbstractC3255y.i(metadata, "metadata");
        return true;
    }

    @Override // b3.InterfaceC1968b
    public boolean d() {
        return f15702c;
    }

    @Override // b3.InterfaceC1968b
    public o.p getType() {
        return f15701b;
    }
}
