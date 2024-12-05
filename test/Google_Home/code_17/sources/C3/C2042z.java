package c3;

import b3.C1970d;
import b3.InterfaceC1968b;
import b3.InterfaceC1974h;
import com.stripe.android.model.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: c3.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2042z implements InterfaceC1968b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2042z f15721a = new C2042z();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f15722b = o.p.f25578P;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f15723c = false;

    private C2042z() {
    }

    @Override // b3.InterfaceC1968b
    public Set a(boolean z8) {
        return P5.a0.f();
    }

    @Override // b3.InterfaceC1968b
    public InterfaceC1974h b() {
        return C2014A.f15573a;
    }

    @Override // b3.InterfaceC1968b
    public boolean c(C1970d metadata) {
        AbstractC3255y.i(metadata, "metadata");
        return metadata.Y();
    }

    @Override // b3.InterfaceC1968b
    public boolean d() {
        return f15723c;
    }

    @Override // b3.InterfaceC1968b
    public o.p getType() {
        return f15722b;
    }
}
