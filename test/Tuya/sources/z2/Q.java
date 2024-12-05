package Z2;

import com.stripe.android.model.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class Q implements Y2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final Q f13280a = new Q();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f13281b = o.p.f24525R;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f13282c = false;

    private Q() {
    }

    @Override // Y2.b
    public Set a(boolean z8) {
        return M5.a0.i(Y2.a.f13025d, Y2.a.f13023b);
    }

    @Override // Y2.b
    public Y2.h b() {
        return S.f13283a;
    }

    @Override // Y2.b
    public boolean c(Y2.d metadata) {
        AbstractC3159y.i(metadata, "metadata");
        return false;
    }

    @Override // Y2.b
    public boolean d() {
        return f13282c;
    }

    @Override // Y2.b
    public o.p getType() {
        return f13281b;
    }
}
