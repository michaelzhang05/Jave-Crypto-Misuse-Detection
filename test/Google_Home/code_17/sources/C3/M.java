package c3;

import b3.C1970d;
import b3.EnumC1967a;
import b3.InterfaceC1968b;
import b3.InterfaceC1974h;
import com.stripe.android.model.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class M implements InterfaceC1968b {

    /* renamed from: a, reason: collision with root package name */
    public static final M f15596a = new M();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f15597b = o.p.f25586h;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f15598c = false;

    private M() {
    }

    @Override // b3.InterfaceC1968b
    public Set a(boolean z8) {
        return P5.a0.i(EnumC1967a.f15311e, EnumC1967a.f15313g);
    }

    @Override // b3.InterfaceC1968b
    public InterfaceC1974h b() {
        return N.f15599a;
    }

    @Override // b3.InterfaceC1968b
    public boolean c(C1970d metadata) {
        AbstractC3255y.i(metadata, "metadata");
        return true;
    }

    @Override // b3.InterfaceC1968b
    public boolean d() {
        return f15598c;
    }

    @Override // b3.InterfaceC1968b
    public o.p getType() {
        return f15597b;
    }
}
