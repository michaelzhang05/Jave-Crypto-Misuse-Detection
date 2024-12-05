package c3;

import b3.C1970d;
import b3.EnumC1967a;
import b3.InterfaceC1968b;
import b3.InterfaceC1974h;
import com.stripe.android.model.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: c3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2018a implements InterfaceC1968b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2018a f15623a = new C2018a();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f15624b = o.p.f25567E;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f15625c = false;

    private C2018a() {
    }

    @Override // b3.InterfaceC1968b
    public Set a(boolean z8) {
        return P5.a0.i(EnumC1967a.f15309c, EnumC1967a.f15308b);
    }

    @Override // b3.InterfaceC1968b
    public InterfaceC1974h b() {
        return C2019b.f15627a;
    }

    @Override // b3.InterfaceC1968b
    public boolean c(C1970d metadata) {
        AbstractC3255y.i(metadata, "metadata");
        return false;
    }

    @Override // b3.InterfaceC1968b
    public boolean d() {
        return f15625c;
    }

    @Override // b3.InterfaceC1968b
    public o.p getType() {
        return f15624b;
    }
}
