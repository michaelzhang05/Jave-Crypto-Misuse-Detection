package Z2;

import com.stripe.android.model.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class X implements Y2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final X f13292a = new X();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f13293b = o.p.f24545v;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f13294c = false;

    private X() {
    }

    @Override // Y2.b
    public Set a(boolean z8) {
        return M5.a0.i(Y2.a.f13025d, Y2.a.f13023b);
    }

    @Override // Y2.b
    public Y2.h b() {
        return Y.f13295a;
    }

    @Override // Y2.b
    public boolean c(Y2.d metadata) {
        AbstractC3159y.i(metadata, "metadata");
        return false;
    }

    @Override // Y2.b
    public boolean d() {
        return f13294c;
    }

    @Override // Y2.b
    public o.p getType() {
        return f13293b;
    }
}
