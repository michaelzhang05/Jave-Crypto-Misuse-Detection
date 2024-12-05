package i.a.g.u;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: NamedThreadFactory.java */
/* loaded from: classes2.dex */
public class a implements ThreadFactory {

    /* renamed from: f, reason: collision with root package name */
    private final ThreadFactory f18442f = Executors.defaultThreadFactory();

    /* renamed from: g, reason: collision with root package name */
    private final String f18443g;

    public a(String str) {
        this.f18443g = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f18442f.newThread(runnable);
        newThread.setName(this.f18443g + ' ' + newThread.getName());
        return newThread;
    }
}
