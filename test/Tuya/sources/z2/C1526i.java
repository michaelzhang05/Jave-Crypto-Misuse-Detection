package Z2;

import com.stripe.android.model.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: Z2.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1526i implements Y2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C1526i f13331a = new C1526i();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f13332b = o.p.f24517J;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f13333c = false;

    private C1526i() {
    }

    @Override // Y2.b
    public Set a(boolean z8) {
        return M5.a0.f();
    }

    @Override // Y2.b
    public Y2.h b() {
        return C1527j.f13335a;
    }

    @Override // Y2.b
    public boolean c(Y2.d metadata) {
        AbstractC3159y.i(metadata, "metadata");
        return metadata.Y();
    }

    @Override // Y2.b
    public boolean d() {
        return f13333c;
    }

    @Override // Y2.b
    public o.p getType() {
        return f13332b;
    }
}
