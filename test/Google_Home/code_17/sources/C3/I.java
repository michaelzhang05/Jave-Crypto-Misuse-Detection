package c3;

import b3.C1970d;
import b3.EnumC1967a;
import b3.InterfaceC1968b;
import b3.InterfaceC1974h;
import com.stripe.android.model.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class I implements InterfaceC1968b {

    /* renamed from: a, reason: collision with root package name */
    public static final I f15588a = new I();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f15589b = o.p.f25602x;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f15590c = false;

    private I() {
    }

    @Override // b3.InterfaceC1968b
    public Set a(boolean z8) {
        return P5.a0.d(EnumC1967a.f15308b);
    }

    @Override // b3.InterfaceC1968b
    public InterfaceC1974h b() {
        return J.f15591a;
    }

    @Override // b3.InterfaceC1968b
    public boolean c(C1970d metadata) {
        AbstractC3255y.i(metadata, "metadata");
        return false;
    }

    @Override // b3.InterfaceC1968b
    public boolean d() {
        return f15590c;
    }

    @Override // b3.InterfaceC1968b
    public o.p getType() {
        return f15589b;
    }
}
