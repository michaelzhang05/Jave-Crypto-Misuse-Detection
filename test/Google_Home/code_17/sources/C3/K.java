package c3;

import b3.C1970d;
import b3.EnumC1967a;
import b3.InterfaceC1968b;
import b3.InterfaceC1974h;
import com.stripe.android.model.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class K implements InterfaceC1968b {

    /* renamed from: a, reason: collision with root package name */
    public static final K f15592a = new K();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f15593b = o.p.f25590l;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f15594c = false;

    private K() {
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
        return L.f15595a;
    }

    @Override // b3.InterfaceC1968b
    public boolean c(C1970d metadata) {
        AbstractC3255y.i(metadata, "metadata");
        return metadata.Y();
    }

    @Override // b3.InterfaceC1968b
    public boolean d() {
        return f15594c;
    }

    @Override // b3.InterfaceC1968b
    public o.p getType() {
        return f15593b;
    }
}
