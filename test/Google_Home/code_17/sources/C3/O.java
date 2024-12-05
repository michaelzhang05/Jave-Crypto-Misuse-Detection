package c3;

import b3.C1970d;
import b3.InterfaceC1968b;
import b3.InterfaceC1974h;
import com.stripe.android.model.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class O implements InterfaceC1968b {

    /* renamed from: a, reason: collision with root package name */
    public static final O f15600a = new O();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f15601b = o.p.f25566D;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f15602c = false;

    private O() {
    }

    @Override // b3.InterfaceC1968b
    public Set a(boolean z8) {
        return P5.a0.f();
    }

    @Override // b3.InterfaceC1968b
    public InterfaceC1974h b() {
        return P.f15603a;
    }

    @Override // b3.InterfaceC1968b
    public boolean c(C1970d metadata) {
        AbstractC3255y.i(metadata, "metadata");
        return metadata.Y();
    }

    @Override // b3.InterfaceC1968b
    public boolean d() {
        return f15602c;
    }

    @Override // b3.InterfaceC1968b
    public o.p getType() {
        return f15601b;
    }
}
