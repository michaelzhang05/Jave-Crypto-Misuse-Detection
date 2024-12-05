package l6;

import S5.g;
import java.io.Closeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: l6.n0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3371n0 extends I implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public static final a f34642a = new a(null);

    /* renamed from: l6.n0$a */
    /* loaded from: classes5.dex */
    public static final class a extends S5.b {

        /* renamed from: l6.n0$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C0791a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0791a f34643a = new C0791a();

            C0791a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC3371n0 invoke(g.b bVar) {
                if (bVar instanceof AbstractC3371n0) {
                    return (AbstractC3371n0) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }

        private a() {
            super(I.Key, C0791a.f34643a);
        }
    }
}
