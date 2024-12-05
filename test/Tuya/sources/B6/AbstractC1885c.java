package b6;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3151p;

/* renamed from: b6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1885c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f14791a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC1885c f14792b = S5.b.f9624a.b();

    /* renamed from: b6.c$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC1885c implements Serializable {
        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }

        @Override // b6.AbstractC1885c
        public int b() {
            return AbstractC1885c.f14792b.b();
        }

        @Override // b6.AbstractC1885c
        public int c(int i8) {
            return AbstractC1885c.f14792b.c(i8);
        }

        private a() {
        }
    }

    public abstract int b();

    public abstract int c(int i8);
}
