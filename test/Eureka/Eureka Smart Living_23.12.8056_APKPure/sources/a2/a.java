package a2;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import v1.n;

/* loaded from: classes.dex */
public class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final String f33a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadFactory f34b = Executors.defaultThreadFactory();

    public a(String str) {
        n.i(str, "Name must not be null");
        this.f33a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f34b.newThread(new b(runnable, 0));
        newThread.setName(this.f33a);
        return newThread;
    }
}
