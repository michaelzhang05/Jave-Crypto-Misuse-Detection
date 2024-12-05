package i1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: i1.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2975b {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC2974a f32862a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile InterfaceC2974a f32863b;

    /* renamed from: i1.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static class C0763b implements InterfaceC2974a {
        private C0763b() {
        }

        @Override // i1.InterfaceC2974a
        public ExecutorService a(ThreadFactory threadFactory, EnumC2976c enumC2976c) {
            return b(1, threadFactory, enumC2976c);
        }

        public ExecutorService b(int i8, ThreadFactory threadFactory, EnumC2976c enumC2976c) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i8, i8, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C0763b c0763b = new C0763b();
        f32862a = c0763b;
        f32863b = c0763b;
    }

    public static InterfaceC2974a a() {
        return f32863b;
    }
}
