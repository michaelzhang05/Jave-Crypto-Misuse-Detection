package c3;

import b3.C1970d;
import b3.InterfaceC1968b;
import b3.InterfaceC1974h;
import com.stripe.android.model.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: c3.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2026i implements InterfaceC1968b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2026i f15655a = new C2026i();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f15656b = o.p.f25572J;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f15657c = false;

    private C2026i() {
    }

    @Override // b3.InterfaceC1968b
    public Set a(boolean z8) {
        return P5.a0.f();
    }

    @Override // b3.InterfaceC1968b
    public InterfaceC1974h b() {
        return C2027j.f15659a;
    }

    @Override // b3.InterfaceC1968b
    public boolean c(C1970d metadata) {
        AbstractC3255y.i(metadata, "metadata");
        return metadata.Y();
    }

    @Override // b3.InterfaceC1968b
    public boolean d() {
        return f15657c;
    }

    @Override // b3.InterfaceC1968b
    public o.p getType() {
        return f15656b;
    }
}
