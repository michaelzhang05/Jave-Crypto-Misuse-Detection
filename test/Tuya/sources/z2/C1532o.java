package Z2;

import com.stripe.android.model.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: Z2.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1532o implements Y2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C1532o f13355a = new C1532o();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f13356b = o.p.f24542s;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f13357c = false;

    private C1532o() {
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
        return C1533p.f13359a;
    }

    @Override // Y2.b
    public boolean c(Y2.d metadata) {
        AbstractC3159y.i(metadata, "metadata");
        return metadata.Y();
    }

    @Override // Y2.b
    public boolean d() {
        return f13357c;
    }

    @Override // Y2.b
    public o.p getType() {
        return f13356b;
    }
}
