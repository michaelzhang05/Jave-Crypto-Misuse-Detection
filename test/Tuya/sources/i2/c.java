package I2;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
final class c implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final c f3909a = new c();

    private c() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable r8) {
        AbstractC3159y.i(r8, "r");
        r8.run();
    }
}
