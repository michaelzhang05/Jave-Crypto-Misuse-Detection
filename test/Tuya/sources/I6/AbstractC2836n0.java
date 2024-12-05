package i6;

import P5.g;
import java.io.Closeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: i6.n0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2836n0 extends I implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public static final a f31790a = new a(null);

    /* renamed from: i6.n0$a */
    /* loaded from: classes5.dex */
    public static final class a extends P5.b {

        /* renamed from: i6.n0$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C0761a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0761a f31791a = new C0761a();

            C0761a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC2836n0 invoke(g.b bVar) {
                if (bVar instanceof AbstractC2836n0) {
                    return (AbstractC2836n0) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }

        private a() {
            super(I.Key, C0761a.f31791a);
        }
    }
}
