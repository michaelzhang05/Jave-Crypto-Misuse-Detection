package g1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: g1.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2702b {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC2701a f31171a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile InterfaceC2701a f31172b;

    /* renamed from: g1.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static class C0745b implements InterfaceC2701a {
        private C0745b() {
        }

        @Override // g1.InterfaceC2701a
        public ExecutorService a(ThreadFactory threadFactory, EnumC2703c enumC2703c) {
            return b(1, threadFactory, enumC2703c);
        }

        public ExecutorService b(int i8, ThreadFactory threadFactory, EnumC2703c enumC2703c) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i8, i8, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C0745b c0745b = new C0745b();
        f31171a = c0745b;
        f31172b = c0745b;
    }

    public static InterfaceC2701a a() {
        return f31172b;
    }
}
