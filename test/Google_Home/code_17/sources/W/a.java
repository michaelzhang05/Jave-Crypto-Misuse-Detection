package W;

import Q.AbstractC1400p;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final String f11328a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadFactory f11329b = Executors.defaultThreadFactory();

    public a(String str) {
        AbstractC1400p.m(str, "Name must not be null");
        this.f11328a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f11329b.newThread(new b(runnable, 0));
        newThread.setName(this.f11328a);
        return newThread;
    }
}
