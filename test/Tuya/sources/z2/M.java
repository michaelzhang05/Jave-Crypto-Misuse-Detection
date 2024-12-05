package Z2;

import com.stripe.android.model.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class M implements Y2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final M f13272a = new M();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f13273b = o.p.f24531h;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f13274c = false;

    private M() {
    }

    @Override // Y2.b
    public Set a(boolean z8) {
        return M5.a0.i(Y2.a.f13026e, Y2.a.f13028g);
    }

    @Override // Y2.b
    public Y2.h b() {
        return N.f13275a;
    }

    @Override // Y2.b
    public boolean c(Y2.d metadata) {
        AbstractC3159y.i(metadata, "metadata");
        return true;
    }

    @Override // Y2.b
    public boolean d() {
        return f13274c;
    }

    @Override // Y2.b
    public o.p getType() {
        return f13273b;
    }
}
