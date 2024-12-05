package e6;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3247p;

/* renamed from: e6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2806c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f31797a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2806c f31798b = V5.b.f11267a.b();

    /* renamed from: e6.c$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC2806c implements Serializable {
        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }

        @Override // e6.AbstractC2806c
        public int b() {
            return AbstractC2806c.f31798b.b();
        }

        @Override // e6.AbstractC2806c
        public int c(int i8) {
            return AbstractC2806c.f31798b.c(i8);
        }

        private a() {
        }
    }

    public abstract int b();

    public abstract int c(int i8);
}
