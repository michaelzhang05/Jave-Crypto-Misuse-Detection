package kotlinx.coroutines;

import java.io.Closeable;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: Executors.kt */
/* loaded from: classes2.dex */
public abstract class d1 extends c0 implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    public static final a f22143g = new a(null);

    /* compiled from: Executors.kt */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractCoroutineContextKey<c0, d1> {

        /* compiled from: Executors.kt */
        /* renamed from: kotlinx.coroutines.d1$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C0382a extends Lambda implements Function1<CoroutineContext.b, d1> {

            /* renamed from: f, reason: collision with root package name */
            public static final C0382a f22144f = new C0382a();

            C0382a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d1 invoke(CoroutineContext.b bVar) {
                if (bVar instanceof d1) {
                    return (d1) bVar;
                }
                return null;
            }
        }

        private a() {
            super(c0.f22139f, C0382a.f22144f);
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }
}
