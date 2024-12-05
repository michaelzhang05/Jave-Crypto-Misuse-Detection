package c3;

import b3.C1970d;
import b3.EnumC1967a;
import b3.InterfaceC1968b;
import b3.InterfaceC1974h;
import com.stripe.android.model.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: c3.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2032o implements InterfaceC1968b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2032o f15679a = new C2032o();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f15680b = o.p.f25597s;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f15681c = false;

    private C2032o() {
    }

    @Override // b3.InterfaceC1968b
    public Set a(boolean z8) {
        EnumC1967a enumC1967a = EnumC1967a.f15310d;
        if (!z8) {
            enumC1967a = null;
        }
        return P5.a0.j(enumC1967a);
    }

    @Override // b3.InterfaceC1968b
    public InterfaceC1974h b() {
        return C2033p.f15683a;
    }

    @Override // b3.InterfaceC1968b
    public boolean c(C1970d metadata) {
        AbstractC3255y.i(metadata, "metadata");
        return metadata.Y();
    }

    @Override // b3.InterfaceC1968b
    public boolean d() {
        return f15681c;
    }

    @Override // b3.InterfaceC1968b
    public o.p getType() {
        return f15680b;
    }
}
