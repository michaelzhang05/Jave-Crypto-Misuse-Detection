package Z2;

import com.stripe.android.model.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class K implements Y2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final K f13268a = new K();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f13269b = o.p.f24535l;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f13270c = false;

    private K() {
    }

    @Override // Y2.b
    public Set a(boolean z8) {
        Y2.a aVar = Y2.a.f13025d;
        if (!z8) {
            aVar = null;
        }
        return M5.a0.j(aVar);
    }

    @Override // Y2.b
    public Y2.h b() {
        return L.f13271a;
    }

    @Override // Y2.b
    public boolean c(Y2.d metadata) {
        AbstractC3159y.i(metadata, "metadata");
        return metadata.Y();
    }

    @Override // Y2.b
    public boolean d() {
        return f13270c;
    }

    @Override // Y2.b
    public o.p getType() {
        return f13269b;
    }
}
