package c3;

import b3.C1970d;
import b3.EnumC1967a;
import b3.InterfaceC1968b;
import b3.InterfaceC1974h;
import com.stripe.android.model.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: c3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2020c implements InterfaceC1968b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2020c f15631a = new C2020c();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f15632b = o.p.f25604z;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f15633c = false;

    private C2020c() {
    }

    @Override // b3.InterfaceC1968b
    public Set a(boolean z8) {
        return P5.a0.i(EnumC1967a.f15309c, EnumC1967a.f15308b);
    }

    @Override // b3.InterfaceC1968b
    public InterfaceC1974h b() {
        return C2021d.f15635a;
    }

    @Override // b3.InterfaceC1968b
    public boolean c(C1970d metadata) {
        AbstractC3255y.i(metadata, "metadata");
        return false;
    }

    @Override // b3.InterfaceC1968b
    public boolean d() {
        return f15633c;
    }

    @Override // b3.InterfaceC1968b
    public o.p getType() {
        return f15632b;
    }
}
