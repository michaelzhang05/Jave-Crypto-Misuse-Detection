package Z2;

import com.stripe.android.model.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: Z2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1518a implements Y2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C1518a f13299a = new C1518a();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f13300b = o.p.f24512E;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f13301c = false;

    private C1518a() {
    }

    @Override // Y2.b
    public Set a(boolean z8) {
        return M5.a0.i(Y2.a.f13024c, Y2.a.f13023b);
    }

    @Override // Y2.b
    public Y2.h b() {
        return C1519b.f13303a;
    }

    @Override // Y2.b
    public boolean c(Y2.d metadata) {
        AbstractC3159y.i(metadata, "metadata");
        return false;
    }

    @Override // Y2.b
    public boolean d() {
        return f13301c;
    }

    @Override // Y2.b
    public o.p getType() {
        return f13300b;
    }
}
