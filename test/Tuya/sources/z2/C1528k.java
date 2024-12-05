package Z2;

import com.stripe.android.model.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: Z2.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1528k implements Y2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C1528k f13339a = new C1528k();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f13340b = o.p.f24537n;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f13341c = false;

    private C1528k() {
    }

    @Override // Y2.b
    public Set a(boolean z8) {
        return M5.a0.d(Y2.a.f13025d);
    }

    @Override // Y2.b
    public Y2.h b() {
        return C1529l.f13343a;
    }

    @Override // Y2.b
    public boolean c(Y2.d metadata) {
        AbstractC3159y.i(metadata, "metadata");
        return true;
    }

    @Override // Y2.b
    public boolean d() {
        return f13341c;
    }

    @Override // Y2.b
    public o.p getType() {
        return f13340b;
    }
}
