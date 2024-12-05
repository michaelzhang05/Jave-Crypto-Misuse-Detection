package L2;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
final class c implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final c f5904a = new c();

    private c() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable r8) {
        AbstractC3255y.i(r8, "r");
        r8.run();
    }
}
