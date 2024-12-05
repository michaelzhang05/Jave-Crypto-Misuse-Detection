package c3;

import b3.C1970d;
import b3.InterfaceC1968b;
import b3.InterfaceC1974h;
import com.stripe.android.model.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class b0 implements InterfaceC1968b {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f15628a = new b0();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f15629b = o.p.f25603y;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f15630c = false;

    private b0() {
    }

    @Override // b3.InterfaceC1968b
    public Set a(boolean z8) {
        return P5.a0.f();
    }

    @Override // b3.InterfaceC1968b
    public InterfaceC1974h b() {
        return c0.f15634a;
    }

    @Override // b3.InterfaceC1968b
    public boolean c(C1970d metadata) {
        AbstractC3255y.i(metadata, "metadata");
        return metadata.Y();
    }

    @Override // b3.InterfaceC1968b
    public boolean d() {
        return f15630c;
    }

    @Override // b3.InterfaceC1968b
    public o.p getType() {
        return f15629b;
    }
}
