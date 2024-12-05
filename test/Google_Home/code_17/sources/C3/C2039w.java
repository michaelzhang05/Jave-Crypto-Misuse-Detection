package c3;

import b3.C1970d;
import b3.InterfaceC1968b;
import b3.InterfaceC1974h;
import com.stripe.android.model.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: c3.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2039w implements InterfaceC1968b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2039w f15711a = new C2039w();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f15712b = o.p.f25587i;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f15713c = true;

    private C2039w() {
    }

    @Override // b3.InterfaceC1968b
    public Set a(boolean z8) {
        return P5.a0.f();
    }

    @Override // b3.InterfaceC1968b
    public InterfaceC1974h b() {
        return C2041y.f15719a;
    }

    @Override // b3.InterfaceC1968b
    public boolean c(C1970d metadata) {
        AbstractC3255y.i(metadata, "metadata");
        return false;
    }

    @Override // b3.InterfaceC1968b
    public boolean d() {
        return f15713c;
    }

    @Override // b3.InterfaceC1968b
    public o.p getType() {
        return f15712b;
    }
}
