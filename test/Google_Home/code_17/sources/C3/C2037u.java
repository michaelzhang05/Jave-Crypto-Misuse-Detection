package c3;

import b3.C1970d;
import b3.EnumC1967a;
import b3.InterfaceC1968b;
import b3.InterfaceC1974h;
import com.stripe.android.model.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: c3.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2037u implements InterfaceC1968b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2037u f15703a = new C2037u();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f15704b = o.p.f25579Q;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f15705c = false;

    private C2037u() {
    }

    @Override // b3.InterfaceC1968b
    public Set a(boolean z8) {
        return P5.a0.d(EnumC1967a.f15310d);
    }

    @Override // b3.InterfaceC1968b
    public InterfaceC1974h b() {
        return C2038v.f15707a;
    }

    @Override // b3.InterfaceC1968b
    public boolean c(C1970d metadata) {
        AbstractC3255y.i(metadata, "metadata");
        return false;
    }

    @Override // b3.InterfaceC1968b
    public boolean d() {
        return f15705c;
    }

    @Override // b3.InterfaceC1968b
    public o.p getType() {
        return f15704b;
    }
}
